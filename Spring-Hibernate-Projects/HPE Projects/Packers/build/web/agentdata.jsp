<%@page import="java.sql.*, Database.DbConnection"%>
<%!
int quo_id=0;
String orgname="";
String address="";
String city="";
String state="";
String pincode="";
String name="";
String phone="";
String email="";
String mobile="";
String service_type="";


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
          <li><a href="adminmgmt.jsp">Back</a></li>
        </ul>
       </div>
      <!--navigation-->
    </div>
    
     <!--header-->
    <div id="body">
      <div class="col1-2">
                  <center><h1 style="background-color: #d5d5d5">Agent Details</h1></center>
      </div>
                     <form method="post" action="agntsearch.jsp">
      
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
                                   String str="Select a.agnt_id,a.name_org,a.address,a.city,a.state,a.pincode,a.name,a.phone,a.email,a.mobile,s.service_type  from agents a,service s where s.service_id=a.service_id";
                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='left' width='50%'>");
                                   out.println("<th>Agent_Id</th><th>Org_Name</th><th>Address</th><th>City</th><th>State</th><th>Pincode</th><th>Name</th><th>Phone</th><th>Email</th><th>Mobile</th><th>Service_type</th><th>Edit</th><th>delete</th></tr>");
                                   
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
                                    
                                   out.println("<td><a href= 'agentedit.jsp?"+id+"'>Edit</a></td>");
                                   out.println("<td><a href= 'agentdelete.jsp?"+id+"'>Delete</a></td></tr>");
                                   
                                   }
                                   
                                   
                                   out.println("</table>");
                                   
            } catch(Exception e)
            {
                out.println(e);
            }                               
            
        
        %>
    </body>
</html>
