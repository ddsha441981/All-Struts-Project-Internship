<%@page import="java.sql.*, Database.DbConnection"%>

<%!
int aid = 0;
String name_org="";
String address="";
String city="";
String state="";
String pincode="";
String name="";
String phone="";
String email="";
String user="";
String password="";
String mobile="";
String service_id="";




%>
<%
    try
                      {
        Connection con = DbConnection.dataConnection();
        String name = request.getParameter("name");
        Statement stmt = con.createStatement();
        String str = "select * from agents where name = '"+name+"'";
        ResultSet rs = stmt.executeQuery(str);
        while(rs.next())
                       {
            name = rs.getString(7);           
            aid = rs.getInt(1);
          // System.out.println(name+""+aid);
            name_org = rs.getString(2);
            address = rs.getString(3);
            city = rs.getString(4);
            state = rs.getString(5);
            pincode = rs.getString(6);
            phone = rs.getString(8);
            email = rs.getString(9);
            user = rs.getString(10);
            password = rs.getString(11);
            mobile= rs.getString(12);
            service_id = rs.getString(13);
            
      
             }
    }catch(Exception e)
                       {
        
    }
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

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
      <div id="navigation" class="cbox">

        <ul>
          <li><a href="index.html" class="active">Home</a></li>
           <li><a href="loginpage.jsp">Logout</a></li>
                       <li><a href="agentmgmt.jsp">Back</a></li>

       </div>
      <!--navigation-->
    </div>
    <!--header-->

            <div id="body">
      <div id="banner" class="cbox">
      
        <div id="b_lft"> <img src="images/Register.jpg" alt="" /><br />
          
          <!--but-->
        </div>
        <!--b_lft-->
      </div>
      <!--banner-->

         <form class="form-horizontal" method="post" action="updateagnt.jsp">
                            <div class="row"
                         </div>
           
                            <div class="form-group">
                            <lable for="agentid" class="text-center col-lg-2 control-lable"> Agent Id:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="agentid" name="agentid" value="<%= aid%>"> 
                               
                            </div>
                        
                                                       
                        
                     <lable for="nameorg" class="text-center col-lg-2 control-lable">Organization Name:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="nameorg" name="nameorg" value="<%= name_org %>"/>
                            </div>
                        </div>
                    
                        <div class="form-group">
                            <lable for="address" class="text-center col-lg-2 control-lable">Address:-</lable>
                            <div class="col-lg-4">
                                <textarea class="form-control" placeholder="address" name="address"> <%= address %></textarea>
                            </div>

                                <lable for="city" class="text-center col-lg-2 control-lable">City:-</lable>
                                <div class="col-lg-4">
                                    <input type="text" class="form-control" placeholder="city" name="city" value="<%= city %>">
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="State" class="text-center col-lg-2 control-lable">State:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" name="state" value="<%= state %>">
                            </div>
                                <lable for="pincode" class="text-center col-lg-2 control-lable">Pin_code:-</lable>
                                <div class="col-lg-4">
                                    <input type="text" class="form-control" placeholder="pincode" name="pincode" value="<%= pincode %>">
                                                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="name" class="text-center col-lg-2 control-lable">Name:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="name" name="name" value="<%= name %>">
                       </div>
                            
                           <lable for="phone" class="text-center col-lg-2 control-lable">Phone:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="phone" name="phone" value="<%= phone %>">
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="email" class="text-center col-lg-2 control-lable">Email:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="email" name="email" value="<%= email %>">
                            </div>
                            <lable for="user" class="text-center col-lg-2 control-lable">User_Id:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="userid" name="user" value="<%= user %>">
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="password" class="text-center col-lg-2 control-lable">Password:-</lable>
                            <div class="col-lg-4">
                                <input type="password" class="form-control" placeholder="password" name="pass" value="<%= password %>">
                            </div>
                            <lable for="mobile" class="text-center col-lg-2 control-lable">Mobile:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="mobile" name="mobile" value="<%= mobile %>">
                            </div>
                        </div>
                            
                        <div class="form-group">
                            <lable for="service" class="text-center col-lg-2 control-lable">Service_Type</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" name="serviceid" value="<%= service_id %>">
                                   
                                                      </div>
                              </div>
                                            <center><div class="btn">
                     
                    <button type="Submit" class="btn btn-warning">Search</button>
                    </form>
                    <form class="form-horizontal" method="post" action="agntupdate.jsp">
                    <input type="Submit" class="btn btn-warning" value="Update"/>
                     </form>
                        </div></center>
                
            </div>
            <div id="footer" class="cbox">
          <div class="fl">&copy;</div>
          <!--.fl-->
       <!--.fr-->
    </div>
    <!--footer-->
  </div>
  <!--in-->
<!--main-->
                

    </body>
</html>
                                