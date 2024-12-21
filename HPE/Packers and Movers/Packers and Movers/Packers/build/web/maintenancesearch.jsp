<%@page import="java.sql.*, Database.DbConnection"%>


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
          <li><a href="Maintenancepage.jsp">Back</a></li>

          </ul>
       </div>
      <!--navigation-->
    </div>
    
     <!--header-->
    <div id="body">
      <div class="row" >
      
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
         <div class="row">
             
         </div>
              
                  <center><h1 style="background-color: #d5d5d5">Maintenance Report</h1></center>
           </div>
           <!--banner-->
           
           <%
            try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                        String vehicle_id = request.getParameter("search");
                                       Statement stmt=con.createStatement();
                                 String str = "select * from maintenance where vehicle_id = '"+vehicle_id+"'";


                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' width='40%'>");
                                   out.println("<th>Main_ID</th><th>Vehicle_Id</th><th>Date</th><th>Tire-Price</th><th>Body-Price</th><th>Transmission</th><th>Engine-Price</th><th>Edit</th><th>Delete</th></tr>");


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
                                out.println("</table>");
                                   
            } catch(Exception e)
            {
                out.println(e);
            }                               
            
        
        %>
    <div id="footer" class="cbox">
          <div class="fl">&copy;</div>
          <!--.fl-->
        <!--.fr-->
    </div>
    <!--footer-->
  </div>
  <!--in-->
</div>
<!--main-->

    </body>
</html>
                                      
   