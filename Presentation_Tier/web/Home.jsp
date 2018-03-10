<%-- 
    Document   : newjsp
    Created on : Mar 2, 2018, 9:18:39 PM
    Author     : chamodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>JSP Page</title>
    </head>
   
        <% 
            Cookie ck[] = request.getCookies();
          
            if (ck != null) {
              for (javax.servlet.http.Cookie cookie : ck) {
                    
                    if (cookie.getName().equals("name")) {
                        session.setAttribute("name", cookie.getValue());
                    }
                    if (cookie.getName().equals("type")) {
                        
                        session.setAttribute("type", cookie.getValue());
                        
                    }
                    if (cookie.getName().equals("email")) {
                        
                        session.setAttribute("email", cookie.getValue());
                        
                    }
                     if (cookie.getName().equals("userID")) {
                        
                        session.setAttribute("userID", cookie.getValue());
                        
                    }
                }
               
            } else {
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
          
        %>

   <body class="w3-blue-grey">

 <jsp:include page="Navigator.jsp"/>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">


</div>


</body>
</html>
