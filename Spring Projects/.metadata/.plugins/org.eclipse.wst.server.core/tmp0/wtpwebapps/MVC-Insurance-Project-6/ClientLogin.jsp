<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>HomePage</title>
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
<body>

<!-- ******************************************My Client Login Page********************************************************** -->

<div class="container">
  <h2>Client</h2>
  <!-- Trigger the modal with a button -->
  ${errormsg}
  <button type="button" class="btn btn-default btn-lg" id="myclient">Client Login</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Client Login</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form" action=clientLoginInfo method="post">
            <div class="form-group">
              <label for="username"><span class="glyphicon glyphicon-user"></span> Username</label>
              <input type="text" class="form-control" id="username" placeholder="Enter Username" name="clientName">
            </div>
            <div class="form-group">
              <label for="password"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="password" class="form-control" id="password" placeholder="Enter password" name="clientpassword">
            </div>
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Login</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          
          <p>Forgot <a  id="myclientforgot">Password?</a></p>
        </div>
      </div>
      
    </div>
  </div> 
</div>



<div class="container">
 
  <!-- Modal -->
  <div class="modal fade" id="modelofpassword" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Welcome Change Password</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form" action="changepassword">
          
          <div class="form-group">
              <label for="oldpassword"><span class="glyphicon glyphicon-eye-open"></span> Old Password</label>
              <input type="password" class="form-control" id="oldpassword" placeholder="Enter Old Password" name="oldpassword">
            </div>
          
            <div class="form-group">
              <label for="newpassword"><span class="glyphicon glyphicon-eye-open"></span> New Password</label>
              <input type="text" class="form-control" id="newpassword" placeholder="Enter New Password" name="newpassword">
            </div>
            
            <div class="form-group">
              <label for="cfpassword"><span class="glyphicon glyphicon-eye-open"></span> Confirm Password</label>
              <input type="password" class="form-control" id="cfpassword" placeholder="Enter Confirm Password" name="cfpassword">
            </div>
            
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Submit</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          
        </div>
      </div>
      
    </div>
  </div> 
</div>
 <!-- For Login -->
<script>
$(document).ready(function(){
    $("#myclient").click(function(){
        $("#myModal").modal();
    });
});
</script>

 <!-- For Change Password -->
<script>
$(document).ready(function(){
    $("#myclientforgot").click(function(){
        $("#modelofpassword").modal();
    });
});
</script>
</body>
</html>