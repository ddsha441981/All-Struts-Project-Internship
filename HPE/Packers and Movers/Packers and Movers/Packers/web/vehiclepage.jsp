<%@page import="java.sql.*, Database.DbConnection"%>
<%!
int vehicle_id=0;
String name="";
String vehiclecomp="";
String price="";
String capacity="";
String number="";
String purchaseDate="";

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Safe Movers</title>
<link href="styles/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="scripts/vwd_curvycorners.js"></script>
<script type="text/javascript" src="scripts/capply.js"></script>
<!--[if lt IE 7]>
<style type="text/css">
.home .row{
	padding-bottom:0;
}
.px_fix{
	left:1px;
	bottom:-3px;
}
</style>
<![endif]-->

<script>
    function validate(){  
    var vehicleid=document.vehicle.vehicleid.value;  
    var name=document.vehicle.name.value;
    var vehiclecomp=document.vehicle.vehiclecomp.value;
    var price=document.vehicle.price.value;
    var capacity=document.vehicle.capacity.value;
    var number=document.vehicle.number.value;
    var purchasedate=document.vehicle.purchasedate.value;
    

    if((vehicleid==null || vehicleid =="")||(name==null || name =="")||(vehiclecomp==null || vehiclecomp =="")||(price==null || price =="")||(capacity==null || capacity =="")||(number==null || number =="")||(purchasedate==null || purchasedate =="")){
            alert("Some Fields are be blank!!!!");
         return false;  
        }  
  }
    
    
</script>
 

    </head>
    <body>
        <div id="main">
  <div id="in" class="home">
    <div id="header">
    
    <a href="index.html"><img src="images/logo.png" alt="site name" /></a>
      <div id="navigation" class="cbox">

        <ul>
          <li><a href="index.html" class="active">Home</a></li>
          <li><a href="loginpage.jsp">Logout</a></li>
          <li><a href="CompanyService.jsp">Back</a></li>

          </ul>
       </div>
      <!--navigation-->
    </div>
    
     <!--header-->
    <div id="body">
      
      
        <div id="b_lft"> <img src="images/banner2.jpg" alt="" /><br />
          <!--but-->
        </div>
         <!--b_lft-->
          <!--b_rgt-->

                <div class="col1-2">
                  <center><h1 style="background-color: #d5d5d5">Vehicle Details</h1></center>
                </div>
                     <form method="post" action="vehiclesearch.jsp">
                     <div class="col1-2">
              
              <input type="text" name="search" placeholder="Name" value="<%= name %>"/>
             <button type="Submit" >Search</button>

          </div>
      </form>

        </div>
      

        <%
            
                   try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                   Statement stmt=con.createStatement();
                                   String str="Select * from vehicle";
                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' width='40%' bgcolor='white'>");
                                   out.println("<th>Vehicle_ID</th><th>Name</th><th>Company</th><th>Price</th><th>Capacity</th><th>Number</th><th>Purchase-Date</th><th>Edit</th><th>Delete</th></tr>");
                                   
                                   while(rs.next())
                                     {
                                      int id=rs.getInt(1);
                                   out.println("<tr><td>"+rs.getInt(1)+"</td>");
                                   out.println("<td>"+rs.getString(2)+"</td>");
                                   out.println("<td>"+rs.getString(3)+"</td>");
                                   out.println("<td>"+rs.getString(4)+"</td>");
                                   out.println("<td>"+rs.getString(5)+"</td>");
                                   out.println("<td>"+rs.getString(6)+"</td>");
                                   out.println("<td>"+rs.getString(7)+"</td>");
                                   
                                   out.println("<td><a href= 'vehicleedit.jsp?"+id+"'>Edit</a></td>");
                                   out.println("<td><a href= 'vehicledelete.jsp?"+id+"'>Delete</a></td></tr>");
                                   
                                   }
                                   out.println("<form name='vehicle' method= 'post' action='VehicleInsert' onsubmit='return validate()'>");
                                   out.println("<tr><td><input type='text' name='vehicleid' pattern='[0-9 \\s]*'/></td>");
                                    out.println("<td><input type='text' name='name' pattern='[A-Za-z \\s]*'/></td>");
                                    out.println("<td><input type='text' name='vehiclecomp' pattern='[A-Za-z \\s]*'/></td>");
                                    out.println("<td><input type='text' name='price' pattern='[0-9 \\s]*'/></td>");
                                    out.println("<td><input type='text' name='capacity' /></td>");
                                    out.println("<td><input type='text' name='number'/></td>");
                                    out.println("<td><input type='text' placeholder='YYYY-MM-DD' name='purchasedate'/></td>");
                                   
                                     out.println("<td><input type='Submit' value='Insert' /> </td></tr>");
                                   out.println("</table>");
                                   
            } catch(Exception e)
            {
                out.println(e);
            }                               
            
        
        %>
   
    </body>
</html>
