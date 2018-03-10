package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dataservice.User;
import dataservice.VehicleInfo;
import java.util.ArrayList;
import java.util.List;

public final class Manage_005fVehicles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String owner = "", TP = "", Province = "", address = "", vehicleNo = "", registereddate = "";
    
      out.write("\n");
      out.write("    ");

        if (request.getAttribute("Resultsearch") == "found") {
            List<VehicleInfo> vehicle = new ArrayList<VehicleInfo>();
            vehicle.addAll((List) request.getAttribute("Info"));
            for (VehicleInfo v : vehicle) {
                owner = v.getOwnername();
                TP = v.getTP();
                Province = v.getProvince();
                address = v.getAddress();
                vehicleNo = v.getVehiclenumber();
                registereddate = v.getRegistredDate();
            }
        }
        if (request.getAttribute("Resultsearch") == "notfound") {
    
      out.write("\n");
      out.write("    <script>alert(\"Not found any vehicle under this vehicle number\");</script>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    ");

        if (request.getAttribute("Validation") == "Error") {
    
      out.write("\n");
      out.write("    <script>alert(\"Reguired All fields\");</script>\n");
      out.write("    ");

        }
        if (request.getAttribute("Resultadd") == "success") {
    
      out.write("\n");
      out.write("    <script>alert(\"Vehicle info have been Added Successfully\");</script>\n");
      out.write("    ");

        }
        if (request.getAttribute("Resultadd") == "failed") {
    
      out.write("\n");
      out.write("    <script>alert(\"Adding failed.. Try again\");</script>\n");
      out.write("\n");
      out.write("    ");

        }
        if (request.getAttribute("Resultdelete") == "success") {
    
      out.write("\n");
      out.write("    <script>alert(\"Vehicle info have been deleted Successfully\");</script>\n");
      out.write("    ");

        }
        if (request.getAttribute("Resultdelete") == "failed") {
    
      out.write("\n");
      out.write("    <script>alert(\"Deleting failed.. Try again\");</script>\n");
      out.write("    ");

        }

        if (request.getAttribute("Resultupdate") == "success") {
    
      out.write("\n");
      out.write("    <script>alert(\"Vehicle info have been updated Successfully\");</script>\n");
      out.write("    ");

        }
        if (request.getAttribute("Resultupdate") == "failed") {
    
      out.write("\n");
      out.write("    <script>alert(\"Updating failed.. Try again\");</script>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    <body class=\"w3-blue-grey\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigator.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- !PAGE CONTENT! -->\n");
      out.write("        <div class=\"w3-main\" style=\"margin-left:500px; margin-top:43px; margin-right:200px;\">\n");
      out.write("            <div style=\"padding-top:60px;\">\n");
      out.write("                <form action=\"Manage_Vehicles\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"vehicleno\">Vehicle No</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Vehicle Number\" name=\"txtvehicleNo\" required=\"\" value=\"");
      out.print(vehicleNo);
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Description\">Owner</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Owner's name\" name=\"txtowner\" value=\"");
      out.print(owner);
      out.write("\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"TP\">TP</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Telephone Numer\" name=\"txtTP\" value=\"");
      out.print(TP);
      out.write("\" >\n");
      out.write("                    </div>      \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Province\">Province</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Province\" name=\"txtProvince\" value=\"");
      out.print(Province);
      out.write("\">\n");
      out.write("                    </div>                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Address\">Address</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Address\" name=\"txtaddress\" value=\"");
      out.print(address);
      out.write("\">\n");
      out.write("                    </div>      \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Date\">Date</label>\n");
      out.write("                        <input id=\"Date\" type=\"date\" class=\"form-control\"  name=\"txtdate\" value=\"");
      out.print(registereddate);
      out.write("\"/>\n");
      out.write("                    </div>     \n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" name=\"btnupdate\">Update</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" name=\"btndelete\">Delete</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" name=\"btnsearch\">Search</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <form style=\"padding-top: 30px\" action=\"Manage_Vehicles\" method=\"POST\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Address\">Please import CSV file to add data</label>\n");
      out.write("                        <input type=\"file\" name=\"txtcsv\" required=\"\" >\n");
      out.write("                        <br><button type=\"submit\" class=\"btn btn-default\" name=\"btnadd\" >Add</button>\n");
      out.write("                    </div>      \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
