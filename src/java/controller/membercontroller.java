/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.branddao;
import dao.budgetdao;
import dao.modeldao;
import dao.vehicledao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL 1
 */
public class membercontroller extends HttpServlet {

    
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    private branddao bdao;
    private budgetdao bdtdao;
    private vehicledao vdao;
    private modeldao mdao;
    public membercontroller() {
        super();
        
        bdao=new branddao();
        bdtdao=new budgetdao();
        mdao=new modeldao();
        vdao=new vehicledao();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        
              request.setAttribute("models", mdao.getAllmodels());
              request.setAttribute("vehicles", vdao.getAllvehicles());
              request.setAttribute("brands", bdao.getAllbrands());
              request.setAttribute("budgets", bdtdao.getAllbudgets());
              
             
                   
    
                    RequestDispatcher view = request.getRequestDispatcher("/member/memberindex.jsp");
                    view.forward(request, response);
              
    }
    }

