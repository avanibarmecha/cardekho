/*
 * To change this license header, choose License Headers in Project Properties.
s
* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.userdao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author student
 */
public class logincontroller extends HttpServlet {



    
  
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession(true);
        String username = request.getParameter("username");
        String password;
        password = request.getParameter("password");
      
          userdao dao=new userdao();
          
            if(dao.Login(username, password,"admin"))
        {
          
             session.setAttribute("username", username);
             RequestDispatcher rs = request.getRequestDispatcher("/admin/adminindex.jsp");
             rs.forward(request, response);
           
        
        }
              
            if(dao.Login(username, password,"Member"))
        {
          
             session.setAttribute("username", username);
             RequestDispatcher rs = request.getRequestDispatcher("member/memberhome.jsp");
             rs.forward(request, response);
           
        }
        else
        {
          
            
          RequestDispatcher view = request.getRequestDispatcher("/login.jsp");
         
       request.setAttribute("username", username);
        request.setAttribute("message", "Invalid Username or password");
        view.forward(request, response);
    }


    

}
}
