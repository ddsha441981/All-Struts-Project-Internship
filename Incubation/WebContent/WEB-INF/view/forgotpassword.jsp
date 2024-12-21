<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Forget Password</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
<script type="text/javascript" src="assets/jquery/jquery-3.1.1.min.js"></script>
</head>
<body>
    
   <br>
    <div class="container-fluid">
        <div class="panel panel-success">
            <div class="panel-heading" align="center">
                <h4><b><font color="blue" style="font-family: Arial;">Incubation Tracking System</font> </b></h4>
            </div>
            <div class="panel-body"align="center">
                  
                <div class="container " style="margin-top: 10%; margin-bottom: 10%;">
    
                    <div class="panel panel-success" style="max-width: 35%;" align="left">
                        
                        <div class="panel-heading form-group">
                            <b><font color="red">Forgot Password
                                </font> </b>
                        </div>
                    
                        <div class="panel-body" >

           <form:form action="sendpassword" method="post" modelAttribute="EmailSending">
               <div class="form-group">
                 <label for="exampleInputEmail1">Please Enter your Email</label> 
                     <form:input type="text" class="form-control" path="email" id="emailid"
                                    placeholder="Enter User EmailId" required="required" />
                                    
                     </div>
                            
              <button type="submit" style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" ><b>Send</b></button><br>
                 Please send us your registered email id,we will send you your password on it                       
           </form:form>

                        </div>
                    </div>
                    
                </div>
                
            </div>
            <div class="panel-footer" align="center"><font style="color: #111">Copyright @2014  <a href="http://mysite.com/">mysite.com</a>, All Rights Reserved. </font></div>
        </div>
    </div> 
  
</body>
</html>

