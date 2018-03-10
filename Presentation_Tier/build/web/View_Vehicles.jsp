<%-- 
    Document   : View_Vehicles
    Created on : Mar 3, 2018, 7:55:55 PM
    Author     : chamodi
--%>

<%@page import="dataservice.VehicleInfo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="businessservice.BusinessService_Service"%>
<%@page import="businessservice.BusinessService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </head>
   
    <%        
        List<VehicleInfo> vehicle = new ArrayList<VehicleInfo>();
        if (request.getAttribute("vehicleinfo") != null) {

            vehicle.addAll((List) request.getAttribute("vehicleinfo"));
            if (vehicle.isEmpty()) {
                vehicle.addAll((List) session.getAttribute("vehicleInfo"));
    %>
    <script>
        alert("Not found any vehicle under this Number");
    </script>
    <%
            }

        } else {
            BusinessService proxy = new BusinessService_Service().getBusinessServicePort();

            vehicle.addAll((List) proxy.allvehicleInfo());
            session.setAttribute("vehicleInfo", vehicle);
        }

    %>
    <body class="w3-blue-grey">

        <jsp:include page="Navigator.jsp"/>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:300px;margin-top:43px;">

            <div style="padding-top:60px;">
                <form action="Vehicle_Info" method="POST">

                    <div class="form-group">
                        <label for="Subject">Vehicle No</label>
                        <input type="text" class="form-control" placeholder="Enter the Vehicle No" name="txtvehicleno" required="">

                    </div>

                    <button type="submit" class="btn btn-default" name="btnsearch">  Search  </button>
                </form>


            </div>
            <br><br><br>
            <form action="View_Vehicles.jsp" method="POST">

                <button type="submit" class="btn btn-default" name="btnall">View All</button>
            </form>

            <table class="table">
                <thead>
                    <tr>
                        <th>Vehicle No</th>
                        <th>Owner's name</th>
                        <th>Address</th>
                        <th>TP</th>
                        <th>Province</th>
                        <th>Registered Date</th>
                    </tr>
                </thead>
                <tbody>
                    <%for (VehicleInfo v : vehicle) {%>
                    <tr>

                        <td><%=v.getVehiclenumber()%> </td>
                        <td><%=v.getOwnername()%> </td>
                        <td><%=v.getAddress()%> </td>
                        <td><%=v.getTP()%> </td>
                        <td><%=v.getProvince()%> </td>
                        <td><%=v.getRegistredDate()%> </td>

                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>

 <%

        if (request.getParameter("btnall") != null) {
            request.setAttribute("vehicleinfo", "");
        }

    %>
    </body>
</html>
