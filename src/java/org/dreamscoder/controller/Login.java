/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dreamscoder.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.dreamscoder.model.LoginService;
import org.dreamscoder.model.Users;

/**
 *
 * @author chinmay
 */
@WebServlet("/login")
public class Login extends HttpServlet {
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String uname = request.getParameter("uname");
       String password = request.getParameter("password");
       
       LoginService loginService = new LoginService();
       Boolean result = loginService.loginAuthentication(uname, password);
       
       if(result){
           Users user = loginService.getUsername(uname);
           request.setAttribute("u", user);
           RequestDispatcher requestDispatcher = request.getRequestDispatcher("dashboard.jsp");
           requestDispatcher.forward(request, response);
       
       }
       else{
           response.sendRedirect("index.jsp");
       }
       
       
       
    }

}
