<%@page import="javax.ws.rs.OPTIONS"%>
<%@page import="java.sql.*, Database.DbConnection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Safe Movers</title>
         <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
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
   <div class="col1-2">
                  <center><h1 style="background-color: #d5d5d5">Maintenance Details</h1></center>
      </div>

        
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
                                   out.println("<tr><th><table border= '1' align='center' hight='20%' width='20%' bgcolor= white></th>");
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

   
         <%
        try
                               {
        String id=request.getQueryString();
        Connection con =DbConnection.dataConnection();
        Statement stmt=con.createStatement();
        String str="Select * from maintenance where main_id='"+id+"'";
        ResultSet rs=stmt.executeQuery(str);
        out.println("<form method='post' action='maintenanceupdate.jsp'>");
        while (rs.next())
                       {
                           out.println("<tr><td>main_id <input type='text' name='mainid' value='"+rs.getInt(1)+"' /></td>");
                           out.println("<td>vehicle_id <input type='text' name='vehicleid' value='"+rs.getString(2)+"' /></td>");
                           out.println("<td>Date <input type='text' placeholder='YYYY-MM-DD' name='maindate' value='"+rs.getString(3)+"' /></td><br><br>");
                           out.println("<td>Tire-Price <input type='text' name='tire' value='"+rs.getString(4)+"' /></td>");
                           out.println("<td>Body-Price <input type='text' name='body' value='"+rs.getString(5)+"' /></td>");
                           out.println("<td>Transmission <input type='text' name='transmission' value='"+rs.getString(6)+"' /></td><br><br>");
                           out.println("<td>Engine <input type='text' name='engine' value='"+rs.getString(7)+"' /></td>");
                         
                            out.println("<td><input type='submit' value='Update'/></td></tr>");
                           
 
                       }
       out.println("</form>");
        
        }catch(Exception e)
                               {
            out.println("value not update"+e);
        }
        %>

        
    </body>
</html>
