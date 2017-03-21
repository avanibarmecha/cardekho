/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.modeldao;
import dao.branddao;
import dao.fueldao;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Model;
import model.Brand;
import model.Fuel;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


/**
 *
 * @author DELL 1
 */

public class modelcontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "admin/modelform.jsp";
    private static String LIST_model= "admin/listmodel.jsp";
    private modeldao dao;
    private branddao bdao;
    private fueldao fdao;

    public modelcontroller() {
        super();
        dao = new modeldao();
        bdao=new branddao();
        fdao=new fueldao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");


        if (action.equalsIgnoreCase("delete")){
            int modelid = Integer.parseInt(request.getParameter("modelid"));
            dao.deletemodel(modelid);
            forward = LIST_model;
            request.setAttribute("models", dao.getAllmodels());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int modelid = Integer.parseInt(request.getParameter("modelid"));
            Model model = dao.getmodelByid(modelid);
            request.setAttribute("selectedbrandid", model.getBrandid());
            request.setAttribute("brands", bdao.getAllbrands());
            request.setAttribute("selectedfuelid", model.getFuelid());
            request.setAttribute("fuels", fdao.getAllfuels());
            
            
            request.setAttribute("model", model);
            
        } else if (action.equalsIgnoreCase("listmodel")){
            forward = LIST_model;
            request.setAttribute("models", dao.getAllmodels());
        } else {
              request.setAttribute("brands", bdao.getAllbrands());
              request.setAttribute("fuels", fdao.getAllfuels());
              
               forward = INSERT_OR_EDIT;
        }


        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Model model = new Model();
       
       
        String modellogoPath="";
        String modelid="";
        String relativeWebPath = "/modellogo";
        String absoluteDiskPath = getServletContext().getRealPath(relativeWebPath);
//File file = new File(absoluteDiskPath, "imagetosave.jpg");
        if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                                         new DiskFileItemFactory()).parseRequest(request);
              
                for(FileItem item : multiparts){
                     if (item.isFormField()) {
                        // Process regular form field (input type="text|radio|checkbox|etc", select, etc).
                            String fieldname = item.getFieldName();
                            if(fieldname.equals("modelid"))
                            {
                               modelid= item.getString();
                            }
                             if(fieldname.equals("modelname"))
                            {
                               model.setModelname(item.getString());
                            }
                             if(fieldname.equals("tengine"))
                             {
                                model.setTengine(item.getString());
                             }
 
                             if(fieldname.equals("mileage"))
                             {
                                model.setMileage(item.getString());
                             }
                             if(fieldname.equals("seat"))
                             {
                                model.setSeat(Integer.parseInt(item.getString()));
                             }
                             if(fieldname.equals("brandid"))
                             {
                               model.setBrandid(Integer.parseInt(item.getString()));
                             }
                             if(fieldname.equals("fuelid"))
                             {
                                model.setFuelid(Integer.parseInt(item.getString()));;
                             }
 
 
 
                   }
                     else if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        relativeWebPath= relativeWebPath +  File.separator + System.currentTimeMillis()+ name;
                        modellogoPath=absoluteDiskPath + File.separator + + System.currentTimeMillis()+name;
                        //item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                        item.write(new File(modellogoPath));
                    }
                }
                      
        model.setModellogo(relativeWebPath);
            
                 } catch (Exception ex) {
                }          
         
        }
       
        if(modelid == null || modelid.isEmpty())
        {
            dao.addmodel(model);
        }
        else
        {
             model.setModelid(Integer.parseInt(modelid));
             dao.updatemodel(model);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_model);
        request.setAttribute("models", dao.getAllmodels());
        view.forward(request, response);

    }
        
        
       
}
