<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<title>Login Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="assets/css/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="assets/css/style.css" rel='stylesheet' type='text/css' />
<link href="assets/css/style-responsive.css" rel="stylesheet"/>
<!-- font CSS -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="assets/css/font.css" type="text/css"/>
<link href="assets/css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<script src="assets/js/jquery2.0.3.min.js"></script>
<style type="text/css">
/* .d{
background-color: white;
}#FDB */
#f{
background-color:#e0baba;
}
</style>
</head>
<body>
<div class="log-w3 ggg">
<div class="w3layouts-main">
	<h2>Forgot Password</h2>

  <div class="alert alert-denger">
    <strong>${emailNotExists }</strong> 
  </div>
		<form action="forgotPasswordEmailIdChecks" method="GET">
		
			<div class="col-lg-13">
			
                            <select class="form-control input-lg m-bot15" name="role" id="f">
                            	<optgroup label="Select Admin" disabled="disabled"></optgroup>
                               
                                <option value="Admin">Admin</option>
                               <optgroup label="Select Trainer" disabled="disabled" class="d"></optgroup>
                                <option value="Trainer">Trainer</option>
                                <optgroup label="Select Student" disabled="disabled"></optgroup> 
                                <option value="Student">Student</option>
                            </select>
                        </div>
		
			<input type="text" class="ggg" name="emailId" placeholder="E-MAIL" required="">
			
			
			
				<div class="clearfix"></div>
				<input type="submit" value="Forgot Password">
		</form>
		
</div>
</div>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="assets/js/scripts.js"></script>
<script src="assets/js/jquery.slimscroll.js"></script>
<script src="assets/js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="assets/js/jquery.scrollTo.js"></script>
</body>
</html>
