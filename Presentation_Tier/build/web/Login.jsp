<%-- 
    Document   : Login
    Created on : Mar 3, 2018, 6:20:47 PM
    Author     : chamodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="Style/Style.css" type="text/css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>JSP Page</title>

    <%
        String err = "";
        if (request.getAttribute("Login") == "failed") {
    %>  
    <script>
        alert("Incorrect Username and password.. Try again");
    </script>
    <%
        }
    %>
    </head>
    <%
                        Cookie[] cookies = request.getCookies();
                        if(cookies != null){
                        for (Cookie cookie : cookies) {
                            cookie.setValue(null);
                            cookie.setMaxAge(0);
                            response.addCookie(cookie);
                        }
                        session.setAttribute("name", "");
                        session.setAttribute("type", "");
                        session.setAttribute("email", "");
                        session.setAttribute("userID", "");
                    }
%>
    <body class="w3-blue-grey">
        <!-- Top container -->
        <div class="w3-bar w3-top w3-black w3-large" style="z-index:1">

            <span class="w3-bar-item w3-left" style="font-size:30px; text-align: right"> VEHICLE RECOGNITION SYSTEM </span>
        </div>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:200px;margin-top:300px;margin-right:200px;">
           
            <h2>Login</h2>
            <form action="Login" method="POST">
                <div class="form-group">
                    <label for="email">Username:</label>
                    <input type="text" class="form-control" id="email" placeholder="Enter username" name="txtuser" required="">
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="txtpass" required="">
                </div>

                <button type="submit" class="btn btn-default" name="btnlogin">Login</button>
            </form>
        </div>


    </div>

</body>
</html>
