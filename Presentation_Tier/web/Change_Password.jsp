<%-- 
    Document   : Change_Password
    Created on : Mar 3, 2018, 7:56:17 PM
    Author     : chamodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body class="w3-blue-grey">

        <jsp:include page="Navigator.jsp"/>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:500px; margin-top:43px; margin-right:200px;">
            <div style="padding-top:60px;">
                <h2>Change password</h2>
                <form action="PasswordUpdate" method="POST">
                  
                    <div class="form-group">
                        <label for="pwd">Password:</label>
                        <input type="password" class="form-control" placeholder="Enter password" name="txtpass" required="">
                    </div>
                    <div class="form-group">
                        <label for="pwd">New Password:</label>
                        <input type="password" class="form-control"  placeholder="Enter password" name="txtnewpass" required="">
                    </div>
                    <button type="submit" class="btn btn-default" name="btnconfirm">Confirm</button>
                </form>


            </div>

        </div>

    </body>
    <%
if(request.getAttribute("success") =="failed"){
    %>   <script> alert("password changing failed");
     </script>
     <%
}
if(request.getAttribute("success") =="success"){
    %>   <script> alert("password has been changed successfully");
     </script>
     <%
}
%>
</html>
