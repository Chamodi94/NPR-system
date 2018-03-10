package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dataservice.CriminalInfo;
import java.util.ArrayList;
import java.util.List;
import dataservice.VehicleInfo;

public final class Search_005fVehicles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    ");

        if (request.getAttribute("result") != null) {
    
      out.write("\n");
      out.write("    <script>alert(\"This is an Unregistered Vehicle\")</script>\n");
      out.write("    ");

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
      out.write("            <div style=\"float: right; padding-top: 40px; padding-right:  20px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <table>\n");
      out.write("                        <form action=\"Searchvehicle\" method=\"POST\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td> <input type=\"text\" class=\"form-control\" placeholder=\"Enter vehicle number\" name=\"txtvehicleno\" required=\"\"></td>\n");
      out.write("                                <td> <button type=\"submit\" class=\"btn btn-default\" name=\"btnsearch\"><i class=\"fa fa-search\"></i> Search</button></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </form>\n");
      out.write("                        <form action=\"Searchvehicle\" method=\"POST\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td> <input type=\"file\"  placeholder=\"\" name=\"txtimage\" required=\"\"></td>\n");
      out.write("                                <td> <button type=\"submit\" class=\"btn btn-default\" name=\"btnsearchbyimage\"><i class=\"fa fa-search\"></i> Search</button></td>\n");
      out.write("                            </tr>\n");
      out.write("                    </table>\n");
      out.write("                    </form>  \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div style=\"padding-top: 130px\">\n");
      out.write("                ");
if (request.getAttribute("Vehicleinfo") != null) {
                        List<CriminalInfo> criminal = new ArrayList<CriminalInfo>();
                        String name = "";
                        String address = "";
                        String TP = "";
                        String Registereddate = "";
                        String VehicleNo = "";
                        List<VehicleInfo> vehicle = new ArrayList<VehicleInfo>();
                        vehicle = (List) request.getAttribute("Vehicleinfo");

                        for (VehicleInfo v : vehicle) {
                            name = v.getOwnername();
                            address = v.getAddress();
                            TP = v.getTP();
                            Registereddate = v.getRegistredDate();
                            VehicleNo = v.getVehiclenumber();

                            criminal.add(v.getInfo());
                        }
                
      out.write("\n");
      out.write("                <table style=\"border: 1;\">\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                    <h1>");
      out.print(VehicleNo);
      out.write(" </h1>\n");
      out.write("                    <table class=\"table\" style=\"border: 0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Owner's Name</td>\n");
      out.write("                            <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Address</td>\n");
      out.write("                            <td>");
      out.print(address);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Telephone Number</td>\n");
      out.write("                            <td>");
      out.print(TP);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Registered Date</td>\n");
      out.write("                            <td>");
      out.print(Registereddate);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td style=\"font-size: 25px\"><b>Criminal history<b></td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            if (!criminal.isEmpty()) {
                              for (CriminalInfo c : criminal) {
                                   out.println("<tr>");
                                  if(c.getCriminalNo()== ""){
                                      out.println("<td> Not found any criminal under this vehicle number</td>");
                                  }
                                  
                                  else{
                                  
                            out.println("<td> Criminal Case No:" + c.getCriminalNo() + "</td>");
                            out.println("<td> Description" + c.getDescription()+ "<br>Happened Date:"+c.getHappendDate()+"<br>Entered Date:"+c.getEnteredDate() +"</td>");
                            
                        
                                  }
                                   out.println("</tr>");
                        }
                        }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                ");

                    }
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
