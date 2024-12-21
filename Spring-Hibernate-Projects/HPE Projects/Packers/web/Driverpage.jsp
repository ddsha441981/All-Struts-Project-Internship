<%@page import="java.sql.*, Database.DbConnection"%>
<%!
int driver_id=0;
String name="";
String address="";
String phone="";
String city="";
String state="";
String Idproof="";
String salary="";

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
    var driverid=document.driver.driverid.value;   
    var name=document.driver.name.value;  
    var address=document.driver.address.value;
    var phone=document.driver.phone.value;
    var city=document.driver.city.value;
    var state=document.driver.state.value;
    var Idproof=document.driver.Idproof.value;
    var salary=document.driver.salary.value;
    

    if((driverid==null || driverid =="")||(name==null ||name =="")||(address==null || address =="")||(phone==null || phone =="")||(city==null || city =="")||(state==null || state=="")||( Idproof==null || Idproof =="")( salary==null || salary =="")){
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
      
        <div id="b_lft"> <img src="images/Drivers.jpg" alt="" /><br />
          
          <!--but-->
        </div>
         <!--b_lft-->
          <!--b_rgt-->

          <div class="col1-2">
                  <center><h1 style="background-color: #d5d5d5">Drivers Details</h1></center>
      </div>
          <form method="post" action="driversearch.jsp">
          <div class="col1-2">
              
              <input type="text" placeholder="Name" name="search" value="<%= name %>"/>
             <button type="Submit" >Search</button>

          </div>
      </form>

          
        </div>
        
        

        <%
            try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                   Statement stmt=con.createStatement();
                                   String str="Select * from driver";
                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' width='40%' >");
                                   out.println("<th>Driver_ID</th><th>Name</th><th>Address</th><th>Phone</th><th>City</th><th>State</th><th>Idproof</th><th>Salary</th><th>Edit</th><th>Delete</th></tr>");
                                   
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
                                   out.println("<td>"+rs.getString(8)+"</td>");
        
                                   out.println("<td><a href= 'driveredit.jsp?"+id+"'>Edit</a></td>");
                                   out.println("<td><a href= 'driverdel.jsp?"+id+"'>Delete</a></td></tr>");
                                   
                                   }
                                   out.println("<form name='driver' method= 'post' action='DriverInsert' onsubmit='return validate()'>");
                                   out.println("<tr><td><input type='text' name='driverid' pattern='[0-9\\s]*'/></td>");
                                   out.println("<td><input type='text' name='name' pattern='[A-Za-z \\s]*'/></td>");
                                   out.println("<td><textarea  name='address'/></textarea></td>");
                                   out.println("<td><input type='text' name='phone' pattern='[0-9 \\s]*'/></td>");
                                   out.println("<td><input type='text' name='city' pattern='[A-Za-z \\s]*'/></td>");
                                   out.println("<td><input type='text' name='state' pattern='[A-Za-z \\s]*'/></td>");
                                   out.println("<td><input type='text' name='Idproof' pattern='[A-Za-z \\s]*'/></td>");
                                   out.println("<td><input type='text' name='salary' pattern='[0-9\\s]*'/></td>");
                                   
                                     out.println("<td><input type='Submit' value='Insert' /> </td></tr>");
                                   out.println("</table>");
                                   
            } catch(Exception e)
            {
                out.println(e);
            }                               
            
        
        %>

    </body>
</html>
