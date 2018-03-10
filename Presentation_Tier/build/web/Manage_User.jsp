<%-- 
    Document   : Manage_User
    Created on : Mar 3, 2018, 7:56:06 PM
    Author     : chamodi
--%>

<%@page import="dataservice.VehicleInfo"%>
<%@page import="businessservice.BusinessService_Service"%>
<%@page import="businessservice.BusinessService"%>
<%@page import="dataservice.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <title>JSP Page</title>
    </head>

    <%
        String userID = "", password = "", name = "", email = "", TP = "", type = "";
    %>
    <%
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
    %>
    <script>alert("Not found any user under this User ID");</script>
    <%
        }

        if (request.getAttribute("Resultdelete") == "success") {
    %>
    <script>alert("User info have been removed Successfully");</script>
    <%
        }
        if (request.getAttribute("Resultdelete") == "failed") {
    %>
    <script>alert("Deleting failed.. Try again");</script>
    <%
        }
    
     if (request.getAttribute("Resultupdate") == "success") {
    %>
    <script>alert("User info have been updated Successfully");</script>
    <%
        }
        if (request.getAttribute("Resultupdate") == "failed") {
    %>
    <script>alert("Deleting failed.. Try again");</script>
    <%
        }
     if (request.getAttribute("Resultadd") == "success") {
    %>
    <script>alert("User info have been added Successfully");</script>
    <%
        }
        if (request.getAttribute("Resultadd") == "failed") {
    %>
    <script>alert("Adding failed.. Try again");</script>
    <%
        }
    %>

    <%
        BusinessService proxy = new BusinessService_Service().getBusinessServicePort();
        List<User> user = new ArrayList<User>();

        user.addAll((List) proxy.allusers());

    %>
    <body class="w3-blue-grey">

        <jsp:include page="Navigator.jsp"/>


        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:500px; margin-top:43px; margin-right:200px;">
            <div style="padding-top:60px;">
                <form action="Manage_User" method="POST">


                    <div class="form-group">
                        <label for="ID">User's ID</label>
                        <input type="text" class="form-control" placeholder="Enter User's ID" name="txtID" required="" value="<%=userID%>">
                    </div>
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" placeholder="Enter User's name" name="txtfullname" value="<%=name%>">
                    </div>

                    <div class="form-group">
                        <label for="Email">E-mail</label>
                        <input type="email" class="form-control" placeholder="Enter Email" name="txtemail" value="<%=email%>">
                    </div>     
                    <div class="form-group">
                        <label for="TP">TP</label>
                        <input type="text" class="form-control" placeholder="Enter Telephone Number" name="txtTP" value="<%=TP%>">
                    </div>
                    <div class="form-group">
                        <label for="Type">Type</label>
                        <select class="form-control" name="txttype" >
                            <option><%=type%></option>
                            <option>User</option>
                            <option>Admin</option>
                        </select>
                    </div>                    
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" placeholder="Enter Password" name="txtpass" value="<%=password%>">
                    </div>  
                    <button type="submit" class="btn btn-default" name="btnadd">Add</button>
                    <button type="submit" class="btn btn-default" name="btnupdate">Update</button>
                    <button type="submit" class="btn btn-default" name="btndelete">Delete</button>
                    <button type="submit" class="btn btn-default" name="btnsearch">Search</button>
                </form>
            </div>
            <br><br>     
            <table class="table">
                <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>TP</th>
                        <th>Type</th>
                    </tr>
                </thead>
                <tbody>
                    <%for (User u : user) {%>
                    <tr>

                        <td><%=u.getUserID()%> </td>
                        <td><%=u.getName()%> </td>
                        <td><%=u.getEmail()%> </td>
                        <td><%=u.getTP()%> </td>
                        <td><%=u.getType()%> </td>

                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>

    </body>
</html>
