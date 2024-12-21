<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>New Registration</title>
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="assets/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="assets/js/jquery-ui.js"></script>
<script src="assets/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="assets/js/registration.js"></script>

<link rel="stylesheet" href="assets/css/jQuery-ui.css" />


<style type="text/css">
.error
{
	color: #b20000;
}

.col-lg-2
{
   color: black;
}
.col-lg-5
{
   color: green;
}


</style>
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
     <h3 id="errorH3" style="color: red"> ${msg} </h3>
                    <div class="panel panel-success" style="max-width: 35%;" align="left">
                    
                        
                        <div class="panel-heading form-group">
                            <b><font color="blue">New Registration
                                </font> </b>
                        </div>
                    
                        <div class="panel-body" >

                        <form:form action="registerByPM" method="POST" onsubmit="return validateform();"  modelAttribute="registrationBean">
                            <div class="form-group">
                                <label for="name">Enter Name</label>
                                 <span style="color:#b20000"  id="err_name"></span>
                                <form:input type="text" class="form-control" path="name" id="name"
                                    placeholder="Enter Name" />
                                    
                            </div>
                            <br>
                            
                            <div class="form-group">
                                <label for="contactno">Enter ContactNo</label>
                                 <span style="color:#b20000" id="err_contact"></span>
                                <form:input type="text" size="10"	placeholder="type contact number here..." minlength="10" maxlength="10" id="contactno" path="contactno" class="form-control" />
                                    
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="email">Enter EmailId</label>
                                 <span style="color:#b20000"  id="err_email"></span>
                                <form:input type="text" placeholder="type e-mail here..." id="email" path="email"
								class="form-control" />
                                    
                            </div>
                            <br>
                            
                            <div class="form-group">
                                <label for="city">Enter City</label>
                                 <span style="color:#b20000"  id="err_city"></span>
                                	<form:input type="text" placeholder="type city here..." id="city" path="city" class="form-control" />

                                    
                            </div>
                            <br>
         <div class="row">					
    	<label class="control-label col-lg-4">Select Status</label><span style="color:#b20000"  id="err_status"></span>
   			 <div class="col-lg-8">
        		<form:select class="form-control" path="status" id="status">
        		<form:option value="default" >Select Status..</form:option>
				            <option>Active</option>
				            <option>InActive</option>
				             <option>Other</option>
				            
			        </form:select>
			    </div>
			</div>
			    <br>
	<div class="row">
	<label class="control-label col-lg-4">Select Intern Type</label><span style="color:#b20000"  id="err_intern_type"></span>					
    	
   			 <div class="col-lg-8">
        		<form:select class="form-control" path="intern_type" id="intern_type">
        		<form:option value="0" >Select intern..</form:option>
				            <option>Java Intern</option>
				            <option>.Net Intern</option>
				            <option>Testing</option>
				            <option>Other</option>
				            
			        </form:select>
			    </div>
			</div>
			    <br>
			    
			    
			    <div class="row">	
			    <label class="control-label col-lg-4">Select Batch</label><span style="color:#b20000"  id="err_b_id"></span>
   			 <div class="col-lg-8">
        		<form:select  id="b_id" path="b_id" 	class="form-control" >
	<form:option value="0" >Select batch..</form:option>
	<c:forEach var="i" items="${batch_id_list}" >
	<form:option value="${i.b_id}">${i.b_name}</form:option> 
	</c:forEach>
	</form:select>
			    </div>
			</div>
			    <br>
			    
			    <div class="form-group">
                                <label for="username">Enter Username</label>
                                 <span style="color:#b20000"  id="err_username"></span>
                                <form:input type="text"	placeholder="type user name here..." id="username"
							path="username" class="form-control" />
                                    
                            </div>
                            <br>
					
					
					

					<div class="form-group">
                                <label for="name">Enter Password</label>
                                 <span style="color:#b20000"  id="err_password"></span>
                                <form:password  placeholder="type password here..."
								value="" id="password" path="password" class="form-control" />
                                    
                            </div>
                            
					<br>
			    
                         
                            <button type="submit" style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" ><b>Submit</b></button><br>
                            <button type="button" onclick="return resetform();" style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-warning btn-lg btn-block" ><b>Reset</b></button><br>                       
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