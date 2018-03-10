package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link href=\"Style/Style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("  <!-- Avatar image in top left corner -->\n");
      out.write(" \n");
      out.write("  <img src=\"Images/Sri-Lanka-Police_2.jpg\" style=\"width:100%\">\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large w3-black\">\n");
      out.write("    <i class=\"fa fa-home w3-xxlarge\"></i>\n");
      out.write("    <p>HOME</p>\n");
      out.write("  </a>\n");
      out.write("  <a href=\"index.html\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\n");
      out.write("    <i class=\"fa fa-user w3-xxlarge\"></i>\n");
      out.write("    <p>PROFILE</p>\n");
      out.write("  </a>\n");
      out.write("  <a href=\"#contact\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\n");
      out.write("    <i class=\"fa fa-user w3-xxlarge\"></i>\n");
      out.write("    <p>MANAGE USER</p>\n");
      out.write("  </a>\n");
      out.write("  <a href=\"#photos\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\n");
      out.write("    <i class=\"fa fa-search w3-xxlarge\"></i>\n");
      out.write("    <p>SEARCH</p>\n");
      out.write("  </a>\n");
      out.write("  <a href=\"#photos\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\n");
      out.write("    <i class=\"fa fa-car w3-xxlarge\"></i>\n");
      out.write("    <p>VIEW</p>\n");
      out.write("  </a>\n");
      out.write("   <a href=\"#photos\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\n");
      out.write("    <i class=\"fa fa-file w3-xxlarge\"></i>\n");
      out.write("    <p>MANAGE DATA</p>\n");
      out.write("  </a>\n");
      out.write("  <a href=\"#contact\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\n");
      out.write("    <i class=\"fa fa-envelope w3-xxlarge\"></i>\n");
      out.write("    <p>ISSUES</p>\n");
      out.write("  </a>\n");
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
