<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->
<head>
    
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Maps</title>
     <meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
     <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <!-- GLOBAL STYLES -->
    <!-- GLOBAL STYLES -->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="assets/css/main.css" />
    <link rel="stylesheet" href="assets/css/theme.css" />
    <link rel="stylesheet" href="assets/css/MoneAdmin.css" />
    <link rel="stylesheet" href="assets/plugins/Font-Awesome/css/font-awesome.css" />
    <!--END GLOBAL STYLES -->
       <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
<body class="padTop53 " >

   
     <!-- MAIN WRAPPER -->
    <div id="wrap">

  <!-- HEADER SECTION -->
        <%@ include file="include/header.jsp" %>
        <!-- END HEADER SECTION -->



      
      


        <!--PAGE CONTENT -->
        <div id="content">

            <div class="inner">
                <div class="row">
                    <div class="col-lg-12">


                        <h2> Maps </h2>



                    </div>
                </div>

                <hr />

                                       
<div class="row">
    <div class="col-lg-6">
	<div class="box">
	    <header><h5>Basic Maps</h5></header>
	    <div class="body">
		<div id="gmaps-basic" class="google-maps"></div>
	    </div>
	</div>
    </div>
    <div class="col-lg-6">
	<div class="box warning">
	    <header>
		<h5>Map with markers</h5>
	    </header>
	    <div class="body">
		<div id="gmaps-marker" class="google-maps"></div>
	    </div>
	</div>
    </div>
</div>

<div class="row">
    <div class="col-lg-6">
	<div class="box inverse">
	    <header>
		<h5>Geolocation</h5>
	    </header>
	    <div class="body">
		<div id="gmaps-geolocation" class="google-maps"></div>
	    </div>
	</div>
    </div>
    <div class="col-lg-6">
	<div class="box primary">
	    <header>
		<h5>Polylines</h5>
	    </header>
	    <div class="body">
		<div id="gmaps-polylines" class="google-maps"></div>
	    </div>
	</div>
    </div>
</div>

<div class="row">
    <div class="col-lg-6">
	<div class="box success">
	    <header>
		<h5>Routes</h5>
	    </header>
	    <div class="body">
		<div id="gmaps-route" class="google-maps"></div>
	    </div>
	</div>
    </div>
    <div class="col-lg-6">
	<div class="box danger">
	    <header>
		<h5>Geocoding</h5>

		<div class="toolbar">
		    <form method="post" id="geocoding_form" class="form-search">
		      <div class="input-group">
		      <input id="address" name="address" class="form-control input-sm" type="text" placeholder="search .." />
		      <span class="input-group-btn">
			<button type="submit" class="btn btn-default btn-sm">Search</button>&nbsp;&nbsp;
		      </span>
		      </div>
		    </form>
		</div>
	    </header>
	    <div class="body">

		<div id="gmaps-geocoding" class="google-maps"></div>
	    </div>
	</div>
    </div>
</div>



            </div>




        </div>
        <!--END PAGE CONTENT -->


    </div>

     <!--END MAIN WRAPPER -->

   <!-- FOOTER -->
    <%@ include file="include/footer.jsp" %>
    <!--END FOOTER -->


     <!-- GLOBAL SCRIPTS -->
    <script src="assets/plugins/jquery-2.0.3.min.js"></script>
     <script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/plugins/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    <!-- END GLOBAL SCRIPTS -->

    <!-- PAGE LEVEL SCRIPTS-->

     <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
    
        <script src="assets/plugins/gmaps/gmaps.js"></script>
        <script src="assets/js/mapsInit.js"></script>
        <script>
            $(function () { MapsInit(); });
        </script>
        
     <!--END PAGE LEVEL SCRIPTS-->

</body>
    <!-- END BODY -->
</html>
