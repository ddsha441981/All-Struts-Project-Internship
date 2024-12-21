<%@page import="java.sql.*, Database.DbConnection"%>
<%!
int service_id=0;
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


<script>
    function validate(){  
    var id=document.service.id.value;  
    var name=document.service.name.value;
    

    if((id==null || id =="")||(name==null || name =="")){
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
      <div id="banner" class="cbox">
      
        <div id="b_lft"> <img src="images/services.jpg" alt="" /><br />
          
          <!--but-->
        </div>
        <!--b_lft-->
          <!--b_rgt-->
           <div class="col1-2">
                  <center><h1 style="background-color: #d5d5d5">Service Details</h1></center>
      </div>
          <form method="post" action="servicesearch.jsp">
          <div class="col1-2">
              
              <input type="text" name="search" placeholder="Service-Type" value="<%= service_type %>"/>
             <button type="Submit" >Search</button>

          </div>
      </form>
    </div>
           <!--banner-->

        
        <%
            try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                   Statement stmt=con.createStatement();
                                   String str="Select * from service";
                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' width='40%'>");
                                   out.println("<th>Service_ID</th><th>Service_Type</th><th>Edit</th><th>Delete</th></tr>");
                                   
                                   while(rs.next())
                                     {
                                      int id=rs.getInt(1);
                                   out.println("<tr><td>"+rs.getInt(1)+"</td>");
                                   out.println("<td>"+rs.getString(2)+"</td>");
                                   out.println("<td><a href= 'serviceedit.jsp?"+id+"'>Edit</a></td>");
                                   out.println("<td><a href= 'servicedelete.jsp?"+id+"'>Delete</a></td></tr>");
                                   
                                   }
                                   out.println("<form name='service' method= 'post' action='ServiceInsert' onsubmit='return validate()'>");
                                   out.println("<tr><td><input type='text' name='id' pattern='[0-9 \\s]*'/></td>");
                                   out.println("<td><input type='text' name='name' pattern='[A-Za-z \\s]*'/></td>");
                                   
                                     out.println("<td><input type='Submit' value='Insert' /> </td></tr>");
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
