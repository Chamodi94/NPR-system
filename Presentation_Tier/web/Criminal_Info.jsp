<%-- 
    Document   : Criminal_Info
    Created on : Mar 6, 2018, 1:21:06 AM
    Author     : chamodi
--%>

<%@page import="businessservice.BusinessService_Service"%>
<%@page import="dataservice.VehicleInfo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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

        List<VehicleInfo> criminal = new ArrayList<VehicleInfo>();
        if (request.getAttribute("criminalinfo") != null) {
            criminal.addAll((List) request.getAttribute("criminalinfo"));
            if (criminal.isEmpty()) {
                criminal.addAll((List) session.getAttribute("criminalInfo"));
    %>
    <script>
        alert("Not found any vehicle under this Number");
    </script>
    <%
            }

        } else {
            BusinessService proxy = new BusinessService_Service().getBusinessServicePort();
            criminal.addAll((List) proxy.allcriminalinfo());
            session.setAttribute("criminalInfo", criminal);
        }

    %>


    <body class="w3-blue-grey">

        <jsp:include page="Navigator.jsp"/>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:300px;margin-top:43px;">
            <div style="padding-top:60px;">
                <form action="CriminalInfo" method="POST">

                    <div class="form-group">
                        <label for="Criminalno">Criminal No</label>
                        <input type="text" class="form-control" placeholder="Enter the Criminal No" name="txtcriminalno" required="">

                    </div>

                    <button type="submit" class="btn btn-default" name="btnsearch">  Search  </button>
                </form>


            </div>
            <br><br><br>
            <form action="Criminal_Info.jsp" method="POST">

                <button type="submit" class="btn btn-default" name="btnall">View All</button>
            </form>
            <table class="table">
                <thead>
                    <tr>
                        <th>Criminal No</th>
                        <th>Vehicle No</th>
                        <th>Entered Date</th>
                        <th>happened Date</th>
                        <th>Description</th>
                        <th>Responsible User</th>
                    </tr>
                </thead>
                <tbody>
                    <%for (VehicleInfo v : criminal) {%>
                    <tr>

                        <td><%=v.getInfo().getCriminalNo()%> </td>
                        <td><%=v.getVehiclenumber()%> </td>
                        <td><%=v.getInfo().getEnteredDate()%> </td>
                        <td><%=v.getInfo().getHappendDate()%> </td>
                        <td><%=v.getInfo().getDescription()%> </td>
                        <td><%=v.getInfo().getUser().getUserID()%> </td>

                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        <%

            if (request.getParameter("btnall") != null) {
                request.setAttribute("criminalInfo", "");
            }


        %>

    </body>
</html>

