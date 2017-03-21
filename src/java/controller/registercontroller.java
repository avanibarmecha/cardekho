/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.userdao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author student
 */
public class registercontroller extends HttpServlet {


   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
          User user =  new User();
       
          user.setFirstname(request.getParameter("firstname"));
          user.setLastname(request.getParameter("lastname"));
          user.setUsername(request.getParameter("username"));
          user.setEmail(request.getParameter("email"));
          user.setCity(request.getParameter("city"));
          user.setPassword(request.getParameter("password"));
          user.setRole("Member");
         
          userdao dao=new userdao();
              HttpSession session = request.getSession(true);
        
          String status=dao.Register(user);
         if(status.equals("success"))
         {
              session.setAttribute("username", user.getUsername());
            RequestDispatcher view = request.getRequestDispatcher("member/memberhome.jsp");
            view.forward(request, response);
         }
         else
         {
            RequestDispatcher view = request.getRequestDispatcher("/register.jsp");
         
         
         request.setAttribute("message", status);
         view.forward(request, response);
         }
    }

    
}
