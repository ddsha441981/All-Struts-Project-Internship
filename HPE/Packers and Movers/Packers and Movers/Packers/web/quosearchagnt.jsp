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
          <li><a href="agntquotation.jsp">Back</a></li>

          </ul>
       </div>
      <!--navigation-->
    </div>
    
     <!--header-->
    <div id="body">
        <div class="row"> 
               <%
              try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                   Statement stmt=con.createStatement();
                                   String str="Select * from service";
                                    ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' hight='20%' width='50%' bgcolor= white>");
                                   out.println("<th>Service_Id</th><th>Service-Type</th></tr>");
                                   
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
      
                  <center><h1 style="background-color: #d5d5d5">Quotation Reports</h1></center>
           </div>
           <!--banner-->
           
           <%
            try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                        String reference = request.getParameter("search");
                                       Statement stmt=con.createStatement();
                                 String str = "select * from quotation where reference = '"+reference+"'";
                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' width='40%'>");
                                   out.println("<th>Quo_Id</th><th>Service_type</th><th>Name</th><th>Email</th><th>Mobile</th><th>Shift-From</th><th>Shift-To</th><th>Service-Date</th><th>Contact-Date</th><th>Reference</th><th>Details</th></tr>");


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
                                   out.println("<td>"+rs.getString(9)+"</td>");
                                   out.println("<td>"+rs.getString(10)+"</td>");
                                   out.println("<td>"+rs.getString(11)+"</td>");
                                   
                                             
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
                                      
   