<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Minimal an Admin Panel Category Flat Bootstrap Responsive Website Template | Signup :: w3layouts</title>
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
		<h1><a href="signin.jsp">SignUp Form </a></h1>
		<div class="login-bottom">
			<h2>Register</h2>
			<form action="/signup" method="post">
			<div class="col-md-6">
				<div class="login-mail">
					<input type="text" placeholder="Email" required="">
					<i class="fa fa-envelope"></i>
				</div>
				<div class="login-mail">
					<input type="password" placeholder="Password" required="">
					<i class="fa fa-lock"></i>
				</div>
				<div class="login-mail">
					<input type="password" placeholder="Repeated password" required="">
					<i class="fa fa-lock"></i>
				</div>
				  <a class="news-letter" href="#">
						 <label class="checkbox1"><input type="checkbox" name="checkbox" ><i> </i>I agree with the terms</label>
					   </a>
	
			</div>
			<div class="col-md-6 login-do">
				<label class="hvr-shutter-in-horizontal login-sub">
					<input type="submit" value="Submit">
					</label>
					<p>Already register</p>
				<a href="signin.jsp" class="hvr-shutter-in-horizontal">Login</a>
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

