<%@page import="javax.ws.rs.OPTIONS"%>
<%@page import="java.sql.*, Database.DbConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    
    <a href="index.html"><img src="images/logo.png" alt="site name" /></a>
    </div>
    <!--header-->
 <div class="marginBottom30">   
         <div class="col1-2">
         <%
          try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                   Statement stmt=con.createStatement();
                                   String str="Select * from service";
                                    ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' hight='20%' width='50%' bgcolor= white>");
                                   out.println("<th>ser_Id</th><th>Service_type</th></tr>");
                                   
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

        <%     

           try    
          {
        String id=request.getQueryString();
        Connection con =DbConnection.dataConnection();
        Statement stmt=con.createStatement();
        String str="Select agnt_id,name_org,address,city,state,pincode,name,phone,email,mobile,service_id from agents where agnt_id='"+id+"'";
        ResultSet rs=stmt.executeQuery(str);
        out.println("<form method='post' action='agentupdate.jsp'>");
         while (rs.next())
                       {
                       
                               
                           out.println("<tr>Agnt_id <input type='text' name='agentid' value='"+rs.getInt(1)+"'/><br><br>");
                                                             
                           out.println("name_org <input type='text' name='orgname' value='"+rs.getString(2)+"'/><br><br>");
                           
                           out.println("address <textarea name='address'>"+rs.getString(3)+"</textarea><br><br>");
                          
                           out.println("city <input type='text' name='city' value='"+rs.getString(4)+"'/><br><br>");
                           
                           out.println("state <input type='text' name='state' value='"+rs.getString(5)+"'/><br><br>");                   
                           
                           out.println("pincode <input type='text' name='pincode' value='"+rs.getString(6)+"'/><br><br>");
                           
                           out.println("name <input type='text' name='name' value='"+rs.getString(7)+"'/><br><br>");
                           
                           out.println("phone <input type='text' name='phone' value='"+rs.getString(8)+"'/><br><br>");
                           
                           out.println("email <input type='text' name='email' value='"+rs.getString(9)+"'/><br><br>");
                           
                           
                           out.println("mobile <input type='text' name='mobile' value='"+rs.getString(10)+"'/><br><br>");
                           
                           out.println("service_Type <input type='text' name='serviceid' value='"+rs.getString(11)+"'/><br><br>");
                                           
                           out.println("<input type='submit' value='Update'/></tr>");
                           
                           
                       }
        
        out.println("</form>");
                 }catch(Exception e)
                                         {
                     out.println("Not updated:-"+e);
                 }
          
%>

        </div>
 </div>

    </body>
</html>
