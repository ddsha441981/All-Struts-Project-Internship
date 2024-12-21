<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
  
  	<link rel="stylesheet" href="validation/css/screen.css">
	<script src="validation/js/jquery.js"></script>
	<script src="validation/js/jquery.validate.js"></script>
	<script src="validation/js/Myvalidations.js"></script>
  <style type="text/css">
  .error{
  color: red;
  }
  </style>
</head>
<body>

  <%@ include file="commonfile.jsp" %>
  <div class="alert alert-info">
    <h4><strong>New!</strong> Contact.</h4>
  </div>
   ${requestScope.msg}<!--Massage When Contact Save Successfully--> 
<div class="container">
  
  <form class="form-horizontal" action="newContact" id="signupForm">
    <div class="form-group">
      <label class="control-label col-sm-2" for="Name">Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="Name" placeholder="Enter Name" required>
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="Mobile">Mobile:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="Mobile" placeholder="Enter Mobile" required="">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="Email" placeholder="Enter Email" required>
      </div>
    </div>
    
   
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="checkbox"> Remember me</label>
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-success">Submit</button>
      </div>
    </div>
  </form>
</div>
</body>
</html>