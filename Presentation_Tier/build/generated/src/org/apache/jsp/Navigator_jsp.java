package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Navigator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link href=\"Style/Style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Top container -->\n");
      out.write("        <div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:1\">\n");
      out.write("            <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n");
      out.write("            <span class=\"w3-bar-item w3-right\">VEHICLE RECOGNITION SYSTEM </span>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Sidebar/menu -->\n");
      out.write("        <nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n");
      out.write("            <div class=\"w3-container w3-row\">\n");
      out.write("                <div class=\"w3-col s4\">\n");
      out.write("                    <img src=\"Images/img_avatar.png\" style=\"width:46px;  border-radius: 50%;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-col s8 w3-bar\">\n");
      out.write("                    <span>Welcome, <strong>");
      out.print( session.getAttribute("name") );
      out.write("</strong></span><br>\n");
      out.write("                    <a href=\"Contactus.jsp\" class=\"w3-bar-item w3-button\" data-toggle=\"tooltip\" title=\"Send issues\"><i class=\"fa fa-envelope\"></i></a>\n");
      out.write("                    <a href=\"Change_Password.jsp\" class=\"w3-bar-item w3-button\" data-toggle=\"tooltip\" title=\"Change password\"><i class=\"fa fa-key\"></i></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <div class=\"w3-bar-block\">\n");
      out.write("                <a href=\"Home.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-home fa-fw\"></i>  Home</a>\n");
      out.write("                <a href=\"Search_Vehicles.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-search fa-fw\"></i>  Search Information</a>\n");
      out.write("                <a href=\"View_Vehicles.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  View vehicle Information</a>\n");
      out.write("                <a href=\"Criminal_Info.jsp \" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  View criminal Information</a>\n");
      out.write("                <a href=\"Add_Criminals.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-plus fa-fw\"></i>  Add Criminals</a>\n");
      out.write("                <a href=\"Manage_User.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Manage Users</a>\n");
      out.write("                <a href=\"Manage_Vehicles.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-car fa-fw\"></i>  Manage Information</a>\n");
      out.write("                <a href=\"Login.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-power-off fa-fw\"></i> Logout</a><br><br>\n");
      out.write("               \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("        <div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("    $('[data-toggle=\"tooltip\"]').tooltip();   \n");
      out.write("});\n");
      out.write("        // Get the Sidebar\n");
      out.write("        var mySidebar = document.getElementById(\"mySidebar\");\n");
      out.write("\n");
      out.write("        // Get the DIV with overlay effect\n");
      out.write("        var overlayBg = document.getElementById(\"myOverlay\");\n");
      out.write("\n");
      out.write("        // Toggle between showing and hiding the sidebar, and add overlay effect\n");
      out.write("        function w3_open() {\n");
      out.write("            if (mySidebar.style.display === 'block') {\n");
      out.write("                mySidebar.style.display = 'none';\n");
      out.write("                overlayBg.style.display = \"none\";\n");
      out.write("            } else {\n");
      out.write("                mySidebar.style.display = 'block';\n");
      out.write("                overlayBg.style.display = \"block\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Close the sidebar with the close button\n");
      out.write("        function w3_close() {\n");
      out.write("            mySidebar.style.display = \"none\";\n");
      out.write("            overlayBg.style.display = \"none\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
