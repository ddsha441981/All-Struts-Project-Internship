<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

  <!-- BEGIN HEAD -->

<head>
      <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Line Charts</title>
     <meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
     <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <!-- GLOBAL STYLES -->
     <!-- PAGE LEVEL STYLES SHOULD BE PLACED AT TOP FOR RESIZING OF CHARTS -->
    <link href="assets/plugins/flot/examples/examples.css" rel="stylesheet" />
    <!-- END PAGE LEVEL  STYLES -->

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
<body class="padTop53 ">
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


                        <h2> Line Chart </h2>



                    </div>
                </div>

                <hr />
                <div class="row">
                    <div class="col-lg-12">
 
                        
                        <div class="panel panel-default">
                            <div class="panel-heading">
                               Real Time
                            </div>

                            <div class="panel-body">
                              
			<div class="demo-container">
			<div id="placeholderRT" class="demo-placeholder"></div>
		</div>
		</div>
		
                            </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                               Tracking Chart
                            </div>

                            <div class="panel-body">
                              
			<div class="demo-container">
			<div id="placeholderTra" class="demo-placeholder"></div>
		</div>
		</div>
		
                            </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Toggling Chart
                            </div>

                            <div class="panel-body">
                              <div class="demo-container">
			<div id="placeholderTog" class="demo-placeholder" style="float:left; width:675px;"></div>
			<p id="choices" style="float:right; width:135px;"></p>
		</div>
			
		
                            </div>

                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Multiple axes
                            </div>

                            <div class="panel-body">
                              
			<div class="demo-container">
			<div id="placeholder" class="demo-placeholder"></div>
		</div>
		
                            </div>

                        </div>

                        
                           
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Symbol Chart
                            </div>

                            <div class="panel-body">
                              <div class="demo-container">
			<div id="placeholderS" class="demo-placeholder" style="float:left; width:675px;"></div>
		</div>
			
		
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

    <!-- PAGE LEVEL SCRIPTS -->

    <script src="assets/plugins/flot/jquery.flot.js"></script>
    <script src="assets/plugins/flot/jquery.flot.resize.js"></script>
    <script src="assets/plugins/flot/jquery.flot.time.js"></script>
    <script  src="assets/plugins/flot/jquery.flot.symbol.js"></script>

    <script  src="assets/plugins/flot/jquery.flot.crosshair.js"></script>
     <script src="assets/js/line_chart.js"></script>   
     <!-- END PAGE LEVEL SCRIPTS -->
</body>
     <!-- END BODY -->
</html>
