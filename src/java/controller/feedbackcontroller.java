/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.budgetdao;
import dao.citydao;
import dao.feedbackdao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Feedback;

/**
 *
 * @author DELL 1
 */

public class feedbackcontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT= "/feedbackform.jsp";
    private static String LIST_feedback= "admin/listfeedback.jsp";
    private feedbackdao dao;
    private citydao cdao;

    public feedbackcontroller() {
        super();
        dao = new feedbackdao();
        cdao=new citydao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int feedbackid = Integer.parseInt(request.getParameter("feedbackid"));
            dao.deletefeedback(feedbackid);
            forward = LIST_feedback;
            request.setAttribute("feedbacks", dao.getAllfeedbacks());    
        
        }else if (action.equalsIgnoreCase("listfeedback")){
            forward = LIST_feedback;
            request.setAttribute("feedbacks", dao.getAllfeedbacks());
        }else
        {
            forward = INSERT;
            request.setAttribute("cities", cdao.getAllcities());
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Feedback feedback = new Feedback();
        feedback.setFullname(request.getParameter("fullname"));
        feedback.setEmail(request.getParameter("email"));
        feedback.setMobileno(request.getParameter("mobileno"));
        feedback.setCityid(Integer.parseInt(request.getParameter("cityid")));
        feedback.setComments(request.getParameter("comments"));
        String feedbackid = request.getParameter("feedbackid");
        if(feedbackid == null || feedbackid.isEmpty())
        {
            dao.addfeedback(feedback);
        }
        
        RequestDispatcher view = request.getRequestDispatcher(INSERT);
       
        view.forward(request, response);
    }
}
