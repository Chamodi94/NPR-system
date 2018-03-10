<%-- 
    Document   : Search_Vehicles
    Created on : Mar 3, 2018, 7:53:39 PM
    Author     : chamodi
--%>

<%@page import="dataservice.CriminalInfo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dataservice.VehicleInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
   
    <%
        if (request.getAttribute("result") != null) {
    %>
    <script>alert("This is an Unregistered Vehicle")</script>
    <%
        }
    %>
    <body class="w3-blue-grey">

        <jsp:include page="Navigator.jsp"/>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:300px;margin-top:43px;">

            <div style="float: right; padding-top: 40px; padding-right:  20px">



                <div class="form-group">
                    <table>
                        <form action="Searchvehicle" method="POST">
                            <tr>
                                <td> <input type="text" class="form-control" placeholder="Enter vehicle number" name="txtvehicleno" required=""></td>
                                <td> <button type="submit" class="btn btn-default" name="btnsearch"><i class="fa fa-search"></i> Search</button></td>
                            </tr>
                        </form>
                        <form action="Searchvehicle" method="POST">
                            <tr>
                                <td> <input type="file"  placeholder="" name="txtimage" required=""></td>
                                <td> <button type="submit" class="btn btn-default" name="btnsearchbyimage"><i class="fa fa-search"></i> Search</button></td>
                            </tr>
                    </table>
                    </form>  

                </div>
                </form>


            </div>
            <div style="padding-top: 130px">
                <%if (request.getAttribute("Vehicleinfo") != null) {
                        List<CriminalInfo> criminal = new ArrayList<CriminalInfo>();
                        String name = "";
                        String address = "";
                        String TP = "";
                        String Registereddate = "";
                        String VehicleNo = "";
                        List<VehicleInfo> vehicle = new ArrayList<VehicleInfo>();
                        vehicle = (List) request.getAttribute("Vehicleinfo");

                        for (VehicleInfo v : vehicle) {
                            name = v.getOwnername();
                            address = v.getAddress();
                            TP = v.getTP();
                            Registereddate = v.getRegistredDate();
                            VehicleNo = v.getVehiclenumber();

                            criminal.add(v.getInfo());
                        }
                %>
                <table style="border: 1;">
                    <tr>

                    <h1><%=VehicleNo%> </h1>
                    <table class="table" style="border: 0">
                        <tr>
                            <td><b>Owner's Name</b></td>
                            <td style="max-width: 200px"><%=name%></td>
                        </tr>
                        <tr>
                            <td><b>Address</b></td>
                            <td><%=address%></td>
                        </tr>
                        <tr>
                            <td><b>Telephone Number</b></td>
                            <td><%=TP%></td>
                        </tr>
                        <tr>
                            <td><b>Registered Date</b></td>
                            <td><%=Registereddate%></td>
                        </tr>
                        <tr>

                            <td style="font-size: 25px"><b>Criminal history<b></td>
                            <td></td>
                        </tr>
                        <%
                            if (!criminal.isEmpty()) {
                              for (CriminalInfo c : criminal) {
                                   out.println("<tr>");
                                  if(c.getCriminalNo().equals("")){
                                   
                           out.println("<td> Not found any criminal</td>");
                          out.println("<td></td>");
                                  }
                                  else{
                                    out.println("<td> <b>Criminal Case No</b>:" + c.getCriminalNo() + "</td>");
                            out.println("<td style='max-width:450px'><b> Description:</b>&nbsp&nbsp" + c.getDescription()+ "<br><br><b>Happened Date:</b>"+c.getHappendDate()+"<br><br><b>Entered Date:</b>"+c.getEnteredDate() +"</td>");
                                
                                  }
                                  
                                  
                                   out.println("</tr>");
                        }
                        }%>



                        <tr>
                            <td></td>
                            <td></td>
                        </tr>
                    </table>

                    </tr>
                </table>
                <%
                    }%>
            </div>
        </div>

    </body>
</html>
