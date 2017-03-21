/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.branddao;
import dao.citydao;
import dao.modeldao;
import dao.getonroadpricedao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Getonroadprice;

/**
 *
 * @author DELL 1
 */

public class getonroadpricecontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT= "/getonroadpriceform.jsp";
    private static String LIST_getonroadprice= "admin/listgetonroadprice.jsp";
    private getonroadpricedao dao;
    private citydao cdao;
    private branddao bdao;
    private modeldao mdao;

    public getonroadpricecontroller() {
        super();
        dao = new getonroadpricedao();
        cdao=new citydao();
        bdao=new branddao();
        mdao=new modeldao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

            if (action.equalsIgnoreCase("listgetonroadprice")){
            forward = LIST_getonroadprice;
            request.setAttribute("getonroadprices", dao.getAllgetonroadprices());
            }
            else{
            forward = INSERT;
            request.setAttribute("cities", cdao.getAllcities());
            request.setAttribute("brands", bdao.getAllbrands());
            request.setAttribute("models", mdao.getAllmodels());
            }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Getonroadprice getonroadprice = new Getonroadprice();
        getonroadprice.setFullname(request.getParameter("fullname"));
        getonroadprice.setEmail(request.getParameter("email"));
        getonroadprice.setMobileno(request.getParameter("mobileno"));
        getonroadprice.setBuyingtime(request.getParameter("buyingtime"));
        getonroadprice.setPincode(request.getParameter("pincode"));
        getonroadprice.setCityid(Integer.parseInt(request.getParameter("cityid")));
        getonroadprice.setBrandid(Integer.parseInt(request.getParameter("brandid")));
        getonroadprice.setModelid(Integer.parseInt(request.getParameter("modelid")));
        String getonroadpriceid = request.getParameter("getonroadpriceid");
        if(getonroadpriceid == null || getonroadpriceid.isEmpty())
        {
            dao.addgetonroadprice(getonroadprice);
        }
        
        RequestDispatcher view = request.getRequestDispatcher(INSERT);
       
        view.forward(request, response);
    }
}
