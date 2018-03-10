/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import businessservice.BusinessService;
import businessservice.BusinessService_Service;
import dataservice.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chamodi
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     BusinessService proxy=new BusinessService_Service().getBusinessServicePort();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           boolean authenticated = false;
            HttpSession session = request.getSession();
            Cookie[] cookie = request.getCookies();
            String username = request.getParameter("txtuser");
            String password = request.getParameter("txtpass");
        if (request.getParameter("btnlogin") != null) {
               
                    List<User> user = new ArrayList<User>();
                    user.addAll((List) proxy.login(username, password));
                    if (!user.isEmpty()) {
                        authenticated = true;
                        for(User u : user) {
                            session.setAttribute("name", u.getName());
                            session.setAttribute("type", u.getType());
                            session.setAttribute("email", u.getEmail());
                            session.setAttribute("userID",  u.getUserID());
                            Cookie newCookie = new Cookie("name", (String)session.getAttribute("name"));
                            newCookie.setMaxAge(3600);
                            response.addCookie(newCookie);
                            Cookie newCookie2 = new Cookie("type", (String)session.getAttribute("type"));
                            Cookie newCookie3 = new Cookie("email", (String)session.getAttribute("email"));
                            Cookie newCookie4 = new Cookie("userID", (String)session.getAttribute("userID"));
                            newCookie2.setMaxAge(3600);
                            response.addCookie(newCookie2);
                            newCookie3.setMaxAge(3600);
                            response.addCookie(newCookie3);
                            newCookie3.setMaxAge(3600);
                            response.addCookie(newCookie4);
                            request.getRequestDispatcher("Home.jsp").forward(request, response);
                        }
                        
                    }
                   
                 if (!authenticated) {
                   request.setAttribute("Login", "failed");
                   request.getRequestDispatcher("Login.jsp").forward(request, response);
                }
         
        }

        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
