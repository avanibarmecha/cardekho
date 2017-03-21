/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import dao.modeldao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Model;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author DELL 1
 */
public class ModelByBrandServlet extends HttpServlet {

    modeldao dao;
   
    public ModelByBrandServlet()
    {
            dao=new modeldao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        JSONObject json      = new JSONObject();
        JSONArray  jsonModelList = new JSONArray();
        JSONObject jsonModel;
  
   String brandid=request.getParameter("brandid");
        
         List<Model> modellist=dao.getModelByBrand(Integer.parseInt( brandid));
       
        try {
         // Extract data from result set
                for(Model m : modellist)
                 {
                      jsonModel=new JSONObject();
                        jsonModel.put("modelid",m.getModelid());
                        jsonModel.put("modelname",m.getModelname());
                     
                
                      jsonModelList.put(jsonModel);
                  }
                
                 
           
           } catch (JSONException ex) {
                Logger.getLogger(ModelByBrandServlet.class.getName()).log(Level.SEVERE, null, ex);
            } 

       response.setContentType("application/json");
       response.getWriter().write(jsonModelList.toString());
        
         
        
        
    }

    
}
