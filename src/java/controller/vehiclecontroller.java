/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.vehicledao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Vehicle;

/**
 *
 * @author DELL 1
 */

public class vehiclecontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "admin/vehicleform.jsp";
    private static String LIST_vehicle= "admin/listvehicletype.jsp";
    private vehicledao dao;

    public vehiclecontroller() {
        super();
        dao = new vehicledao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int typeid = Integer.parseInt(request.getParameter("typeid"));
            dao.deletevehicle(typeid);
            forward = LIST_vehicle;
            request.setAttribute("vehicles", dao.getAllvehicles());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int typeid = Integer.parseInt(request.getParameter("typeid"));
            Vehicle vehicle = dao.getvehicleByid(typeid);
            
            request.setAttribute("vehicle", vehicle);
        } else if (action.equalsIgnoreCase("listvehicletype")){
            forward = LIST_vehicle;
            request.setAttribute("vehicles", dao.getAllvehicles());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Vehicle vehicle = new Vehicle();
        vehicle.setVtype(request.getParameter("vtype"));
       
        String typeid = request.getParameter("typeid");
        if(typeid == null || typeid.isEmpty())
        {
            dao.addvehicle(vehicle);
        }
        else
        {
            vehicle.setTypeid(Integer.parseInt(typeid));
            dao.updatevehicle(vehicle);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_vehicle);
        request.setAttribute("vehicles", dao.getAllvehicles());
        view.forward(request, response);
    }
}
