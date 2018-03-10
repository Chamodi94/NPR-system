package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dataservice.VehicleInfo;
import java.util.ArrayList;
import java.util.List;
import businessservice.BusinessService_Service;
import businessservice.BusinessService;

public final class View_005fVehicles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    ");
        
        List<VehicleInfo> vehicle = new ArrayList<VehicleInfo>();
        if (request.getAttribute("vehicleinfo") != null) {

            vehicle.addAll((List) request.getAttribute("vehicleinfo"));
            if (vehicle.isEmpty()) {
                vehicle.addAll((List) session.getAttribute("vehicleInfo"));
    
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"Not found any vehicle under this Number\");\n");
      out.write("    </script>\n");
      out.write("    ");

            }

        } else {
            BusinessService proxy = new BusinessService_Service().getBusinessServicePort();

            vehicle.addAll((List) proxy.allvehicleInfo());
            session.setAttribute("vehicleInfo", vehicle);
        }

    
      out.write("\n");
      out.write("    <body class=\"w3-blue-grey\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigator.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- !PAGE CONTENT! -->\n");
      out.write("        <div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n");
      out.write("\n");
      out.write("            <div style=\"padding-top:60px;\">\n");
      out.write("                <form action=\"Vehicle_Info\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Subject\">Vehicle No</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter the Vehicle No\" name=\"txtvehicleno\" required=\"\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" name=\"btnsearch\">  Search  </button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <br><br><br>\n");
      out.write("            <form action=\"View_Vehicles.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\" name=\"btnall\">View All</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Vehicle No</th>\n");
      out.write("                        <th>Owner's name</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>TP</th>\n");
      out.write("                        <th>Province</th>\n");
      out.write("                        <th>Registered Date</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
for (VehicleInfo v : vehicle) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print(v.getVehiclenumber());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(v.getOwnername());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(v.getAddress());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(v.getTP());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(v.getProvince());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(v.getRegistredDate());
      out.write(" </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write(" ");


        if (request.getParameter("btnall") != null) {
            request.setAttribute("vehicleinfo", "");
        }

    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
