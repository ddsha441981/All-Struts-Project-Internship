<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<%@ include file="CommonFile/projectHomecommonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>Intern !</strong> Register Form:</h4>
  </div>
   ${requestScope.msg}<!-- For Massage -->
<div class="container">
  <form class="form-horizontal" id="signupForm" action="aIntern">
  
  <div class="form-group">
      <label class="control-label col-sm-2" for="id">Enter Id:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="id" placeholder="Enter Id">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="First Name">First Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="Ifname" placeholder="Enter First Name">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="Last Name">Last Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="Ilname" placeholder="Enter Last Name">
      </div>
    </div>
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="User Name">UserName:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="Iusername" placeholder="Enter UserName">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="password">Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" name="Ipass" placeholder="Enter Password">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="confirm_password">confirm_password:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" name="Icfpass" placeholder="Enter Confirm Password">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="Iemail" placeholder="Enter Email">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="mob">Mobile:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="Imob" placeholder="Enter Mobile No">
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