/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.budgetdao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Budget;

/**
 *
 * @author DELL 1
 */

public class budgetcontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "admin/budgetform.jsp";
    private static String LIST_budget= "admin/listbudget.jsp";
    private budgetdao dao;

    public budgetcontroller() {
        super();
        dao = new budgetdao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int budgetid = Integer.parseInt(request.getParameter("budgetid"));
            dao.deletebudget(budgetid);
            forward = LIST_budget;
            request.setAttribute("budgets", dao.getAllbudgets());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int budgetid = Integer.parseInt(request.getParameter("budgetid"));
            Budget budget = dao.getbudgetByid(budgetid);
            request.setAttribute("budget", budget);
        } else if (action.equalsIgnoreCase("listbudget")){
            forward = LIST_budget;
            request.setAttribute("budgets", dao.getAllbudgets());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Budget budget = new Budget();
        budget.setBudget_range(request.getParameter("budget_range"));
       
        String budgetid = request.getParameter("budgetid");
        if(budgetid == null || budgetid.isEmpty())
        {
            dao.addbudget(budget);
        }
        else
        {
            budget.setBudgetid(Integer.parseInt(budgetid));
            dao.updatebudget(budget);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_budget);
        request.setAttribute("budgets", dao.getAllbudgets());
        view.forward(request, response);
    }
}
