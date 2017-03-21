/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.fueldao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Fuel;

/**
 *
 * @author DELL 1
 */

public class fuelcontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "admin/fuelform.jsp";
    private static String LIST_fuel= "admin/listfuel.jsp";
    private fueldao dao;

    public fuelcontroller() {
        super();
         dao = new fueldao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int fuelid = Integer.parseInt(request.getParameter("fuelid"));
            dao.deletefuel(fuelid);
            forward = LIST_fuel;
            request.setAttribute("fuels", dao.getAllfuels());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int fuelid = Integer.parseInt(request.getParameter("fuelid"));
            Fuel fuel = dao.getfuelByid(fuelid);
            request.setAttribute("fuel", fuel);
        } else if (action.equalsIgnoreCase("listfuel")){
            forward = LIST_fuel;
            request.setAttribute("fuels", dao.getAllfuels());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Fuel fuel = new Fuel();
        fuel.setFueltype(request.getParameter("fueltype"));
       
        String fuelid = request.getParameter("fuelid");
        if(fuelid == null || fuelid.isEmpty())
        {
            dao.addfuel(fuel);
        }
        else
        {
            fuel.setFuelid(Integer.parseInt(fuelid));
            dao.updatefuel(fuel);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_fuel);
        request.setAttribute("fuels", dao.getAllfuels());
        view.forward(request, response);
    }
}
