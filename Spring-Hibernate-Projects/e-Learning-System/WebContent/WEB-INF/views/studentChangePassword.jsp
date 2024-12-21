<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<title>Student Change Password</title>
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
</head>
<body>
<section id="container">
<!--header start-->

<%@ include file="students/header.jsp" %>

<!--header end-->

<!--sidebar start-->

<%@ include file="students/leftMenu.jsp" %>

<!--sidebar end-->
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
		<div class="form-w3layouts">
            
            <!-- page end-->
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Change Password
                            <span class="tools pull-right">
                                <a class="fa fa-chevron-down" href="javascript:;"></a>
                                <a class="fa fa-cog" href="javascript:;"></a>
                                <a class="fa fa-times" href="javascript:;"></a>
                             </span>
                        </header>
                        <div class="panel-body">
                            <div class=" form">
                                <form class="cmxform form-horizontal " id="commentForm" method="post" action="submitingStudentChangePassword" novalidate="novalidate">
                                  
                                    <div class="form-group ">
                                        <label for="cemail" class="control-label col-lg-3">E-Mail </label>
                                        <div class="col-lg-6">
                                            <input class="form-control " id="cemail" type="text" name="emailId" required="">
                                        </div>
                                    </div>
                                    
                                     <div class="form-group ">
                                        <label for="cemail" class="control-label col-lg-3">Password </label>
                                        <div class="col-lg-6">
                                            <input class="form-control " id="cemail" type="text" name="password" required="">
                                        </div>
                                    </div>
                                    
                                     <div class="form-group ">
                                        <label for="cemail" class="control-label col-lg-3">Confirm Password </label>
                                        <div class="col-lg-6">
                                            <input class="form-control " id="cemail" type="text" name="cfpassword" required="">
                                        </div>
                                    </div>
                                                                       
                                    <div class="form-group">
                                        <div class="col-lg-offset-3 col-lg-6">
                                            <button class="btn btn-primary" type="submit">Save</button>
                                            <button class="btn btn-default" type="button">Cancel</button>
                                        </div>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </section>
                </div>
            </div>
                       <!-- page end-->
        </div>
</section>
 <!-- footer -->
		  
		  <%@ include file="students/footer.jsp" %>
		  
  <!-- / footer -->
</section>

<!--main content end-->
</section>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="assets/js/scripts.js"></script>
<script src="assets/js/jquery.slimscroll.js"></script>
<script src="assets/js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="assets/js/jquery.scrollTo.js"></script>
</body>
</html>
