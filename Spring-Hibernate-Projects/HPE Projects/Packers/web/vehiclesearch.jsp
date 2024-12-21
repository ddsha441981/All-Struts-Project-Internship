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
          <li><a href="vehiclepage.jsp">Back</a></li>

          </ul>
       </div>
      <!--navigation-->
    </div>
    
     <!--header-->
    <div id="body">
           <div class="col1-2">
                  <center><h1 style="background-color: #d5d5d5">Vehicle Reports</h1></center>
      </div>
           </div>
           <!--banner-->
           
           <%
            try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                        String name = request.getParameter("search");
                                       Statement stmt=con.createStatement();
                                 String str = "select * from vehicle where name = '"+name+"'";
                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' width='40%'>");
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
                                      
   