/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.modeldao;
import dao.variantdao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Variant;

/**
 *
 * @author DELL 1
 */

public class variantcontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "admin/variantform.jsp";
    private static String LIST_variant= "admin/listvariant.jsp";
    private variantdao dao;
    private modeldao mdao;

    public variantcontroller() {
        super();
         dao = new variantdao();
         mdao=new modeldao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int variantid = Integer.parseInt(request.getParameter("variantid"));
            dao.deletevariant(variantid);
            forward = LIST_variant;
            request.setAttribute("variants", dao.getAllvariants());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int variantid = Integer.parseInt(request.getParameter("variantid"));
            Variant variant = dao.getvariantByid(variantid);
            request.setAttribute("models", mdao.getAllmodels());
            request.setAttribute("variant", variant);
        } else if (action.equalsIgnoreCase("listvariant")){
            forward = LIST_variant;
            
            request.setAttribute("variants", dao.getAllvariants());
        } else {
            request.setAttribute("models", mdao.getAllmodels());
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Variant variant = new Variant();
        variant.setVariantname(request.getParameter("variantname"));
        variant.setExshowroom_price(Integer.parseInt(request.getParameter("exshowroom_price")));
        variant.setFeatures(request.getParameter("features"));
        variant.setModelid(Integer.parseInt(request.getParameter("modelid")));
        String variantid = request.getParameter("variantid");
        if(variantid == null || variantid.isEmpty())
        {
            dao.addvariant(variant);
        }
        else
        {
            variant.setVariantid(Integer.parseInt(variantid));
            dao.updatevariant(variant);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_variant);
        request.setAttribute("variants", dao.getAllvariants());
        view.forward(request, response);
    }
}
