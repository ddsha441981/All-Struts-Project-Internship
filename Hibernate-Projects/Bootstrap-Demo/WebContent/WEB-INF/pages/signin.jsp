<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Minimal an Admin Panel Category Flat Bootstrap Responsive Website Template | Signin :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="assests/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="assests/css/style.css" rel='stylesheet' type='text/css' />
<link href="assests/css/font-awesome.css" rel="stylesheet"> 
<script src="assests/js/jquery.min.js"> </script>
<script src="assests/js/bootstrap.min.js"> </script>
</head>
<body>
	<div class="login">
		<h1><a href="signin.jsp">Admin Login </a></h1>
		<div class="login-bottom">
			<h2>Login</h2>
			<form action="signinAdmin" method="post">
			<div class="col-md-6">
				<div class="login-mail">
					<input type="text" placeholder="Email" name="name" required="">
					<i class="fa fa-envelope"></i>
				</div>
				<div class="login-mail">
					<input type="password" name="password" placeholder="Password" required="">
					<i class="fa fa-lock"></i>
				</div>
				   <a class="news-letter " href="forgetpwd.jsp">
						 <label class="checkbox1"><!-- <input type="checkbox" name="checkbox"  --><i> </i>Forget Password</label>
					   </a>

			
			</div>
			<div class="col-md-6 login-do">
				<label class="hvr-shutter-in-horizontal login-sub">
					<input type="submit" value="login">
					</label>
					<p>Do not have an account?</p>
				<a href="signup.jsp" class="hvr-shutter-in-horizontal">Signup</a>
			</div>
			
			<div class="clearfix"> </div>
			</form>
		</div>
	</div>
		<!---->
<!-- Footer Start -->
<%@include file="footer.jsp" %>
<!-- Footer End  -->
<!---->
<!--scrolling js-->
	<script src="assests/js/jquery.nicescroll.js"></script>
	<script src="assests/js/scripts.js"></script>
	<!--//scrolling js-->
</body>
</html>

