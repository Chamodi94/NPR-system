<%-- 
    Document   : Contactus
    Created on : Mar 6, 2018, 1:28:51 AM
    Author     : chamodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
       <body class="w3-blue-grey">

        <jsp:include page="Navigator.jsp"/>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:500px; margin-top:43px; margin-right:200px;">
            <div style="padding-top:60px;">
                <h2>Change password</h2>
                <form action="Contactus" method="POST">
                  
                    <div class="form-group">
                        <label for="Subject">Subject</label>
                        <input type="text" class="form-control" placeholder="Enter the subject" name="txtsubject" required="">
                    </div>
                    <div class="form-group">
                        <label for="Message">Message</label>
                        <textarea rows="4" class="form-control"  cols="50" placeholder="Enter your issue" name="txtmessage" required=""></textarea>
                    </div>
                    <button type="submit" class="btn btn-default" name="btnsend">Send</button>
                </form>


            </div>

        </div>

    </body>
    <%
if(request.getAttribute("success") =="success"){
    %>   <script> alert("Your message has been sent successfully");
     </script>
     <%
}
if(request.getAttribute("success") =="failed"){
    %>   <script> alert("sending fail.. Try again");
     </script>
     <%
}
%>
</html>

