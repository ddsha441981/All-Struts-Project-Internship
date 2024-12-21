<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/validation.js"></script>
</head>
<body>
   
    <br>
    <div class="container-fluid">
        <div class="panel panel-success">
            <div class="panel-heading" align="center">
                <h4><b><font color="red" style="font-family: arial;">Incubation Tracking System</font> </b></h4>
            </div>
            <div class="panel-body"align="center">
                  
                <div class="container " style="margin-top: 10%; margin-bottom: 10%;">
    
                    <div class="panel panel-success" style="max-width: 35%;" align="left">
                        
                        <div class="panel-heading form-group">
                            <b><font color="red">
                                Login Form</font> </b>
                        </div>
                    
                        <div class="panel-body" >

                        <form  name="myForm" action="LoginServlet" modelAttribute="loginbean" method="get" >
                            <div class="form-group">
               <label for="exampleInputEmail1">User Name</label> 
               <input type="text" class="form-control" path="userName" id="username"
                      placeholder="Enter User Name" required="required"></input>
                             <span style="color: red;" id="usernameError"></span> 
                            </div>
                            
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label> 
                                <input
                                    type="password" class="form-control" path="password" id="password"
                                    placeholder="password" required="required"></input>
                                    <span style="color: red;" id="passwordError"></span>
                                    
                            </div>
                            <button type="submit" style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" ><b>Login</b></button>
                                                   
                        </form>
                        <a href="ForgotPassword.jsp" align="right"> forget Password</a></div>
                        </div>
                    </div>
                    
                </div>
                
            </div>
<div class="panel-footer" align="center"><font style="color: #111">@Created by SPIC-6  <a href="http://mysite.com/">mysite.com</a>, All Rights Reserved. </font></div>
        </div>
    
      
</body>
</html>