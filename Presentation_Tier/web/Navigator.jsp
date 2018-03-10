<%-- 
    Document   : Menu
    Created on : Mar 2, 2018, 8:43:55 PM
    Author     : chamodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link href="Style/Style.css" type="text/css" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Top container -->
        <div class="w3-bar w3-top w3-black w3-large" style="z-index:1">
            <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
            <span class="w3-bar-item w3-right">VEHICLE RECOGNITION SYSTEM </span>
        </div>


        <!-- Sidebar/menu -->
        <nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
            <div class="w3-container w3-row">
                <div class="w3-col s4">
                    <img src="Images/img_avatar.png" style="width:46px;  border-radius: 50%;">
                </div>
                <div class="w3-col s8 w3-bar">
                    <span>Welcome, <strong><%= session.getAttribute("name") %></strong></span><br>
                    <a href="Contactus.jsp" class="w3-bar-item w3-button" data-toggle="tooltip" title="Send issues"><i class="fa fa-envelope"></i></a>
                    <a href="Change_Password.jsp" class="w3-bar-item w3-button" data-toggle="tooltip" title="Change password"><i class="fa fa-key"></i></a>
                </div>

            </div>
            <hr>

            <div class="w3-bar-block">
                <a href="Home.jsp" class="w3-bar-item w3-button w3-padding"><i class="fa fa-home fa-fw"></i>  Home</a>
                <a href="Search_Vehicles.jsp" class="w3-bar-item w3-button w3-padding"><i class="fa fa-search fa-fw"></i>  Search Information</a>
                <a href="View_Vehicles.jsp" class="w3-bar-item w3-button w3-padding"><i class="fa fa-eye fa-fw"></i>  View vehicle Information</a>
                <a href="Criminal_Info.jsp " class="w3-bar-item w3-button w3-padding"><i class="fa fa-eye fa-fw"></i>  View criminal Information</a>
                <a href="Add_Criminals.jsp" class="w3-bar-item w3-button w3-padding"><i class="fa fa-plus fa-fw"></i>  Add Criminals</a>
                <a href="Manage_User.jsp" class="w3-bar-item w3-button w3-padding"><i class="fa fa-users fa-fw"></i>  Manage Users</a>
                <a href="Manage_Vehicles.jsp" class="w3-bar-item w3-button w3-padding"><i class="fa fa-car fa-fw"></i>  Manage Information</a>
                <a href="Login.jsp" class="w3-bar-item w3-button w3-padding"><i class="fa fa-power-off fa-fw"></i> Logout</a><br><br>
               

            </div>
        </nav>

        <!-- Overlay effect when opening sidebar on small screens -->
        <div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

    </body>


    <script>
        $(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();   
});
        // Get the Sidebar
        var mySidebar = document.getElementById("mySidebar");

        // Get the DIV with overlay effect
        var overlayBg = document.getElementById("myOverlay");

        // Toggle between showing and hiding the sidebar, and add overlay effect
        function w3_open() {
            if (mySidebar.style.display === 'block') {
                mySidebar.style.display = 'none';
                overlayBg.style.display = "none";
            } else {
                mySidebar.style.display = 'block';
                overlayBg.style.display = "block";
            }
        }

        // Close the sidebar with the close button
        function w3_close() {
            mySidebar.style.display = "none";
            overlayBg.style.display = "none";
        }
    </script>
</html>
