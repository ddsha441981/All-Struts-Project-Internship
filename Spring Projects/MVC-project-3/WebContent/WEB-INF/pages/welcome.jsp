<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Data</title>   
<meta name="description" content="Creating a Employee table with Twitter Bootstrap. Learn with example of a Employee Table with Twitter Bootstrap.">  
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<!-- PopUp CDN -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
  <style>
  .modal-header, h4, .close {
      background-color: #5cb85c;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #f9f9f9;
  }
  </style>


</head>  
<body style="margin:20px auto">  
<div class="container">
<div class="row header" style="text-align:center;color:green">
<h3>Student Data</h3>
</div>
<div class="container">
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-default btn-sm" id="myBtn">Add New Entery</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Add New Student</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form">
            <div class="form-group">
              <label for="name"><span class="glyphicon glyphicon-user"></span> Name</label>
              <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
            </div>
            
             <div class="form-group">
              <label for="country"><span class="glyphicon glyphicon"></span> Country</label>
              <input type="text" class="form-control" id="country" placeholder="Enter country" name="country">
            </div>
            
             <div class="form-group">
              <label for="salary"><span class="glyphicon glyphicon"></span> Salary</label>
              <input type="text" class="form-control" id="salary" placeholder="Enter salary" name="salary">
            </div>
            
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="text" class="form-control" id="psw" placeholder="Enter password">
            </div>
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Add</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          <p>Not a member? <a href="#">Sign Up</a></p>
          <p>Forgot <a href="#">Password?</a></p>
        </div>
      </div>
      
    </div>
  </div> 
</div>
 

<table id="myTable" class="table table-striped" >  
        <thead>  
          <tr>  
            <th>Name</th>  
            <th>UserName</th>  
            <th>Email</th>  
            <th>Password</th> 
            <th>Confirm Password</th>  
         
          </tr>  
        </thead>  
        <c:forEach items="${userinfo}" var="my">
        <tbody>  
          <tr>  
            <td>${my.name}</td>  
            <td>${my.username}</td>  
            <td>${my.email}</td>  
            <td>${my.password}</td>
            <td>${my.cfpassword}</td>  
            
          </tr>  
          
        </tbody> 
        </c:forEach> 
      </table>  
	  </div>
	  
	  
	  <script>
$(document).ready(function(){
    $('#myTable').dataTable();
});
</script>

<script>
$(document).ready(function(){
    $("#myBtn").click(function(){
        $("#myModal").modal();
    });
});
</script>
</body>  

</html>  
