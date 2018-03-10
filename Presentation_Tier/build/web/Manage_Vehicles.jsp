<%-- 
    Document   : Manage_Vehicles
    Created on : Mar 3, 2018, 7:46:24 PM
    Author     : chamodi
--%>

<%@page import="dataservice.User"%>
<%@page import="dataservice.VehicleInfo"%>
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
        String owner = "", TP = "", Province = "", address = "", vehicleNo = "", registereddate = "";
    %>
    <%
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
    %>
    <script>alert("Not found any vehicle under this vehicle number");</script>
    <%
        }
    %>
    <%
        if (request.getAttribute("Validation") == "Error") {
    %>
    <script>alert("Reguired All fields");</script>
    <%
        }
        if (request.getAttribute("Resultadd") == "success") {
    %>
    <script>alert("Vehicle info have been Added Successfully");</script>
    <%
        }
        if (request.getAttribute("Resultadd") == "failed") {
    %>
    <script>alert("Adding failed.. Try again");</script>

    <%
        }
        if (request.getAttribute("Resultdelete") == "success") {
    %>
    <script>alert("Vehicle info have been deleted Successfully");</script>
    <%
        }
        if (request.getAttribute("Resultdelete") == "failed") {
    %>
    <script>alert("Deleting failed.. Try again");</script>
    <%
        }

        if (request.getAttribute("Resultupdate") == "success") {
    %>
    <script>alert("Vehicle info have been updated Successfully");</script>
    <%
        }
        if (request.getAttribute("Resultupdate") == "failed") {
    %>
    <script>alert("Updating failed.. Try again");</script>
    <%
        }
    %>
    <body class="w3-blue-grey">

        <jsp:include page="Navigator.jsp"/>


        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:500px; margin-top:43px; margin-right:200px;">
            <div style="padding-top:60px;">
                <form action="Manage_Vehicles" method="POST">

                    <div class="form-group">
                        <label for="vehicleno">Vehicle No</label>
                        <input type="text" class="form-control" placeholder="Enter Vehicle Number" name="txtvehicleNo" required="" value="<%=vehicleNo%>">
                    </div>
                    <div class="form-group">
                        <label for="Description">Owner</label>
                        <input type="text" class="form-control" placeholder="Enter Owner's name" name="txtowner" value="<%=owner%>" >
                    </div>
                    <div class="form-group">
                        <label for="TP">TP</label>
                        <input type="text" class="form-control" placeholder="Enter Telephone Numer" name="txtTP" value="<%=TP%>" >
                    </div>      
                    <div class="form-group">
                        <label for="Province">Province</label>
                        <input type="text" class="form-control" placeholder="Enter Province" name="txtProvince" value="<%=Province%>">
                    </div>                    
                    <div class="form-group">
                        <label for="Address">Address</label>
                        <input type="text" class="form-control" placeholder="Enter Address" name="txtaddress" value="<%=address%>">
                    </div>      
                    <div class="form-group">
                        <label for="Date">Date</label>
                        <input id="Date" type="date" class="form-control"  name="txtdate" value="<%=registereddate%>"/>
                    </div>     

                    <button type="submit" class="btn btn-default" name="btnupdate">Update</button>
                    <button type="submit" class="btn btn-default" name="btndelete">Delete</button>
                    <button type="submit" class="btn btn-default" name="btnsearch">Search</button>

                </form>
                <form style="padding-top: 30px" action="Manage_Vehicles" method="POST">
                    <div class="form-group">
                        <label for="Address">Please import CSV file to add data</label>
                        <input type="file" name="txtcsv" required="" >
                        <br><button type="submit" class="btn btn-default" name="btnadd" >Add</button>
                    </div>      
                </form>
            </div>


        </div>




    </body>
</html>
