<%@page import="java.sql.*, Database.DbConnection"%>
<%!
int main_id=0;
String vehicle_id="";
String maindate="";
String tire="";
String body="";
String transmission="";
String engine="";

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
    var mainid=document.maintenance.mainid.value;   
    var vehicleid=document.maintenance.vehicleid.value;  
    var maindate=document.maintenance.maindate.value;
    var tire=document.maintenance.tire.value;
    var body=document.maintenance.body.value;
    var transmission=document.maintenance.transmission.value;
    var engine=document.maintenance.engine.value;
    

    if((mainid==null || mainid =="")||(vehicleid==null ||vehicleid =="")||(maindate==null || maindate =="")||(tire==null || tire =="")||(body==null || body =="")||(transmission==null || transmission=="")||( engine==null || engine =="")){
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
      
               <%
          try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                   Statement stmt=con.createStatement();
                                   String str="Select vehicle_id,name from vehicle";
                                    ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' hight='20%' width='50%' bgcolor= white>");
                                   out.println("<th>Vehicle_Id</th><th>Name</th></tr>");
                                   
                                   while(rs.next())
                                     {
                                    
                                       int id=rs.getInt(1);
                                       
                                   out.println("<tr><td>"+rs.getInt(1)+"</td>");
                                   out.println("<td>"+rs.getString(2)+"</td>");
                                                                       
                                   }
                                  
                                   
                                   out.println("</table>");
                                   
            } catch(Exception e)
            {
                out.println(e);
            }                                                        
                                   
         %>

    </div>          
          
 <div class="col1-2">
                  <center><h1 style="background-color: #d5d5d5">Maintenance Details</h1></center>
      </div>
     
         <form method="post" action="maintenancesearch.jsp">
          <div class="col1-2">
              
              <input type="text" placeholder="vehicle-id    " name="search" value="<%= vehicle_id %>"/>
             <button type="Submit" >Search</button>

          </div>
      </form>

        </div>
       

        <%
            try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                   Statement stmt=con.createStatement();
                                   String str="Select m.main_id,v.name,m.main_date,m.Tire,m.body,m.Transmission,m.engine from maintenance m,vehicle v where v.vehicle_id=m.vehicle_id";
                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' width='40%'>");
                                   out.println("<th>Main_ID</th><th>Vehicle_Name</th><th>Date</th><th>Tire-Price</th><th>Body-Price</th><th>Transmission</th><th>Engine-Price</th><th>Edit</th><th>Delete</th></tr>");
                                   
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
                                   
                                   out.println("<td><a href= 'maintenanceedit.jsp?"+id+"'>Edit</a></td>");
                                   out.println("<td><a href= 'maintenancedel.jsp?"+id+"'>Delete</a></td></tr>");
                                   
                                   }
                                   out.println("<form name='maintenance' method= 'post' action='Maintenance' onsubmit='return validate()'>");
                                   out.println("<tr><td><input type='text' name='mainid' pattern='[0-9\\s]*'/></td>");
                                   out.println("<td><input type='text' name='vehicleid' pattern='[0-9\\s]*'/></td>");
                                   out.println("<td><input type='text' placeholder='YYYY-MM-DD' name='maindate'/></td>");
                                   out.println("<td><input type='text' name='tire'pattern='[0-9 \\s]*'/></td>");
                                   out.println("<td><input type='text' name='body' pattern='[0-9 \\s]*'/></td>");
                                   out.println("<td><input type='text' name='transmission' pattern='[0-9 \\s]*'/></td>");
                                   out.println("<td><input type='text' name='engine' pattern='[0-9 \\s]*'/></td>");
                                   
                                     out.println("<td><input type='Submit' value='Insert' /> </td></tr>");
                                   out.println("</table>");
                                   
            } catch(Exception e)
            {
                out.println(e);
            }                               
            
        
        %>

    </body>
</html>
