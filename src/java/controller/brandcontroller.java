/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


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

public class brandcontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "admin/brandform.jsp";
    private static String LIST_brand= "admin/listbrand.jsp";
   
    private branddao dao;
    

    public brandcontroller() {
        super();
        
        dao=new branddao();
       
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int brandid = Integer.parseInt(request.getParameter("brandid"));
            dao.deletebrand(brandid);
            forward = LIST_brand;
            request.setAttribute("brands", dao.getAllbrands());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int brandid = Integer.parseInt(request.getParameter("brandid"));
            Brand brand = dao.getbrandByid(brandid);
            
            request.setAttribute("brand", brand);
            
        } else if (action.equalsIgnoreCase("listbrand")){
            forward = LIST_brand;
            request.setAttribute("brands", dao.getAllbrands());
        } else {
             
               forward = INSERT_OR_EDIT;
        }


        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Brand brand = new Brand();
       
       
        String brandlogoPath="";
        String brandid="";
        String relativeWebPath = "/brandlogo";
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
                            if(fieldname.equals("brandid"))
                            {
                               brandid= item.getString();
                            }
                             if(fieldname.equals("brandname"))
                            {
                               brand.setBrandname(item.getString());
                            }
                            
                   }
                     else if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        relativeWebPath= relativeWebPath +  File.separator + System.currentTimeMillis()+ name;
                        brandlogoPath=absoluteDiskPath + File.separator + + System.currentTimeMillis()+name;
                        //item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                        item.write(new File(brandlogoPath));
                    }
                }
                      
        brand.setBrandlogo(relativeWebPath);
            
                 } catch (Exception ex) {
                }          
         
        }
       
        if(brandid == null || brandid.isEmpty())
        {
            dao.addbrand(brand);
        }
        else
        {
             brand.setBrandid(Integer.parseInt(brandid));
             dao.updatebrand(brand);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_brand);
        request.setAttribute("brands", dao.getAllbrands());
        view.forward(request, response);

    }
        
        
       
}
