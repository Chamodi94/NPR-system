/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import businessservice.BusinessService;
import businessservice.BusinessService_Service;
import dataservice.User;
import dataservice.VehicleInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chamodi
 */
@WebServlet(name = "Manage_User", urlPatterns = {"/Manage_User"})
public class Manage_User extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    BusinessService proxy = new BusinessService_Service().getBusinessServicePort();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String userID = request.getParameter("txtID");
            String password = request.getParameter("txtpass");
            String name = request.getParameter("txtfullname");
            String email = request.getParameter("txtemail");
            String TP = request.getParameter("txtTP");
            String type = request.getParameter("txttype");
            
            System.err.println(type);
           if(request.getParameter("btnsearch") != null){
                List<User> user=new ArrayList<User>();
                user.addAll((List)proxy.searchuser(userID));
                if (!user.isEmpty()) {
                    request.setAttribute("Resultsearch", "found");
                    request.setAttribute("Info", user);
                } else {
                    request.setAttribute("Resultsearch", "notfound");
                }
           }
            
           if(request.getParameter("btndelete") != null){
                
                if (proxy.deleteuser(userID) == true) {
                    request.setAttribute("Resultdelete", "success");
                } else {
                    request.setAttribute("Resultdelete", "failed");
                }
           }
           if(request.getParameter("btnupdate") != null){
                 List<User> user = new ArrayList<User>();
                    User u = new User();
                    u.setEmail(email);
                    u.setName(name);
                    u.setPassword(password);
                    u.setUserID(userID);
                    u.setTP(TP);
                    u.setType(type);
                    user.add(u);
                if (proxy.updateuser(user) == true) {
                    request.setAttribute("Resultupdate", "success");
                } else {
                    request.setAttribute("Resultupdate", "failed");
                }
           }
             if(request.getParameter("btnadd") != null){
                 List<User> user = new ArrayList<User>();
                    User u = new User();
                    u.setEmail(email);
                    u.setName(name);
                    u.setPassword(password);
                    u.setUserID(userID);
                    u.setTP(TP);
                    u.setType(type);
                    user.add(u);
                if (proxy.adduser(user) == true) {
                    request.setAttribute("Resultadd", "success");
                } else {
                    request.setAttribute("Resultadd", "failed");
                }
           }
           
           
            request.getRequestDispatcher("Manage_User.jsp").forward(request, response);
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
