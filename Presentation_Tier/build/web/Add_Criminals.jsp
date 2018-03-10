<%-- 
    Document   : Add_Criminals
    Created on : Mar 3, 2018, 6:52:36 PM
    Author     : chamodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="Style/Style.css" type="text/css" rel="stylesheet">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
 
    <body class="w3-blue-grey">

        <jsp:include page="Navigator.jsp"/>


        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:500px; margin-top:43px; margin-right:200px;">
            <div style="padding-top:60px;">
                <form action="" method="POST">
       <div class="form-group">
      <label for="criminalNo">Criminal case No</label>
      <input type="text" class="form-control" placeholder="Enter Criminal case No" name="txtcriminalNo" required="">
    </div>
    <div class="form-group">
      <label for="vehicleno">Vehicle No</label>
      <input type="text" class="form-control" placeholder="Enter Vehicle Number" name="txtvehicleNo" required="">
    </div>
    <div class="form-group">
      <label for="Description">Description</label>
      <input type="text" class="form-control" placeholder="Enter Description" name="txtdescription" required="">
    </div>
                    
   
    <button type="submit" class="btn btn-default" name="btnadd">Add</button>
    <button type="submit" class="btn btn-default" name="btnupdate">Update</button>
    <button type="submit" class="btn btn-default" name="btndelete">Delete</button>
    <button type="submit" class="btn btn-default" name="btnsearch">Search</button>
                
            </form>
            </div>
            
            
        </div>

    </div>

</body>
</body>
</html>
