/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.branddao;
import dao.citydao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.City;

/**
 *
 * @author DELL 1
 */

public class citycontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "admin/cityform.jsp";
    private static String LIST_city= "admin/listcity.jsp";
    private citydao dao;

    public citycontroller() {
        super();
        dao = new citydao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int cityid = Integer.parseInt(request.getParameter("cityid"));
            dao.deletecity(cityid);
            forward = LIST_city;
            request.setAttribute("cities", dao.getAllcities());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int cityid = Integer.parseInt(request.getParameter("cityid"));
            City city = dao.getcityByid(cityid);
            request.setAttribute("city", city);
        } else if (action.equalsIgnoreCase("listcity")){
            forward = LIST_city;
            request.setAttribute("cities", dao.getAllcities());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        City city = new City();
        city.setCityname(request.getParameter("cityname"));
       
        String cityid = request.getParameter("cityid");
        if(cityid == null || cityid.isEmpty())
        {
            dao.addcity(city);
        }
        else
        {
            city.setCityid(Integer.parseInt(cityid));
            dao.updatecity(city);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_city);
        request.setAttribute("cities", dao.getAllcities());
        view.forward(request, response);
    }
}
