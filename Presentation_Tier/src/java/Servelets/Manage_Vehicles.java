/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import businessservice.BusinessService;
import businessservice.BusinessService_Service;
import dataservice.VehicleInfo;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chamodi
 */
@WebServlet(name = "Manage_Vehicles", urlPatterns = {"/Manage_Vehicles"})
public class Manage_Vehicles extends HttpServlet {

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

            String owner = request.getParameter("txtowner");
            String TP = request.getParameter("txtTP");
            String Province = request.getParameter("txtProvince");
            String address = request.getParameter("txtaddress");
            String vehicleNo = request.getParameter("txtvehicleNo");
            String name = request.getParameter("txtcsv");
            String registereddate = request.getParameter("txtdate");
            
            String path = "F:\\" + name;
            if (request.getParameter("btnupdate") != null) {
                
                    List<VehicleInfo> vehicleinfo = new ArrayList<VehicleInfo>();
                    VehicleInfo vehicle = new VehicleInfo();
                    vehicle.setAddress(address);
                    vehicle.setOwnername(owner);
                    vehicle.setProvince(Province);
                    vehicle.setRegistredDate(registereddate);
                    vehicle.setVehiclenumber(vehicleNo);
                    vehicle.setTP(TP);
                    vehicleinfo.add(vehicle);
                    if (proxy.updatevehicle(vehicleinfo) == true) {
                        request.setAttribute("Resultupdate", "success");
                    } else {
                        request.setAttribute("Resultupdate", "failed");
                    }
                
            }
            if (request.getParameter("btnadd") != null) {
                if (proxy.addvehicle(path) == true) {
                    request.setAttribute("Resultadd", "success");
                } else {
                    request.setAttribute("Resultadd", "failed");
                }
            }
            if (request.getParameter("btndelete") != null) {
                if (proxy.deletevehicle(vehicleNo) == true) {
                    request.setAttribute("Resultdelete", "success");
                } else {
                    request.setAttribute("Resultdelete", "failed");
                }
            }
            if (request.getParameter("btnsearch") != null) {
                List<VehicleInfo> vehicle=new ArrayList<VehicleInfo>();
                vehicle.addAll((List)proxy.searchvehicle(vehicleNo));
                if (!vehicle.isEmpty()) {
                    request.setAttribute("Resultsearch", "found");
                    request.setAttribute("Info", vehicle);
                } else {
                    request.setAttribute("Resultsearch", "notfound");
                }
            }
            
           
            request.getRequestDispatcher("Manage_Vehicles.jsp").forward(request, response);
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
