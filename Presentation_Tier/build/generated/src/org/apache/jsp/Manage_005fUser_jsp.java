package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dataservice.VehicleInfo;
import businessservice.BusinessService_Service;
import businessservice.BusinessService;
import dataservice.User;
import java.util.ArrayList;
import java.util.List;

public final class Manage_005fUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");

        String userID = "", password = "", name = "", email = "", TP = "", type = "";
    
      out.write("\n");
      out.write("    ");

        if (request.getAttribute("Resultsearch") == "found") {
            List<User> user = new ArrayList<User>();
            user.addAll((List) request.getAttribute("Info"));
            for (User u : user) {
                userID = u.getUserID();
                password = u.getPassword();
                name = u.getName();
                email = u.getEmail();
                TP = u.getTP();
                type = u.getType();
            }
        }
        if (request.getAttribute("Resultsearch") == "notfound") {
    
      out.write("\n");
      out.write("    <script>alert(\"Not found any user under this User ID\");</script>\n");
      out.write("    ");

        }

        if (request.getAttribute("Resultdelete") == "success") {
    
      out.write("\n");
      out.write("    <script>alert(\"User info have been removed Successfully\");</script>\n");
      out.write("    ");

        }
        if (request.getAttribute("Resultdelete") == "failed") {
    
      out.write("\n");
      out.write("    <script>alert(\"Deleting failed.. Try again\");</script>\n");
      out.write("    ");

        }
    
     if (request.getAttribute("Resultupdate") == "success") {
    
      out.write("\n");
      out.write("    <script>alert(\"User info have been updated Successfully\");</script>\n");
      out.write("    ");

        }
        if (request.getAttribute("Resultupdate") == "failed") {
    
      out.write("\n");
      out.write("    <script>alert(\"Deleting failed.. Try again\");</script>\n");
      out.write("    ");

        }
     if (request.getAttribute("Resultadd") == "success") {
    
      out.write("\n");
      out.write("    <script>alert(\"User info have been added Successfully\");</script>\n");
      out.write("    ");

        }
        if (request.getAttribute("Resultadd") == "failed") {
    
      out.write("\n");
      out.write("    <script>alert(\"Adding failed.. Try again\");</script>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("    ");

        BusinessService proxy = new BusinessService_Service().getBusinessServicePort();
        List<User> user = new ArrayList<User>();

        user.addAll((List) proxy.allusers());

    
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
      out.write("                <form action=\"Manage_User\" method=\"POST\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"ID\">User's ID</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter User's ID\" name=\"txtID\" required=\"\" value=\"");
      out.print(userID);
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"name\">Name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter User's name\" name=\"txtfullname\" value=\"");
      out.print(name);
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Email\">E-mail</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"Enter Email\" name=\"txtemail\" value=\"");
      out.print(email);
      out.write("\">\n");
      out.write("                    </div>     \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"TP\">TP</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Telephone Number\" name=\"txtTP\" value=\"");
      out.print(TP);
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Type\">Type</label>\n");
      out.write("                        <select class=\"form-control\" name=\"txttype\" >\n");
      out.write("                            <option>");
      out.print(type);
      out.write("</option>\n");
      out.write("                            <option>User</option>\n");
      out.write("                            <option>Admin</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"password\">Password</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Enter Password\" name=\"txtpass\" value=\"");
      out.print(password);
      out.write("\">\n");
      out.write("                    </div>  \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" name=\"btnadd\">Add</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" name=\"btnupdate\">Update</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" name=\"btndelete\">Delete</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" name=\"btnsearch\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <br><br>     \n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>User ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>TP</th>\n");
      out.write("                        <th>Type</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
for (User u : user) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print(u.getUserID());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(u.getName());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(u.getEmail());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(u.getTP());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(u.getType());
      out.write(" </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
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
