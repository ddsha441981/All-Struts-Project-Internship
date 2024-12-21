<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- BEGIN HEAD -->
<head>
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Timeline Page</title>
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
    <!-- PAGE LEVEL STYLES -->
    <link rel="stylesheet" href="assets/plugins/timeline/timeline.css" />
    <!-- END PAGE LEVEL  STYLES -->
       <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

</head>
    <!-- BEGIN HEAD -->

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


                        <h2> TimeLine Page </h2>



                    </div>
                </div>

                <hr />
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <i class="fa fa-clock-o fa-fw"></i> Timeline
                            </div>
                            <div class="panel-body">
                                <ul class="timeline">
                                    <li>
                                        <div class="timeline-badge success">
                                            <i class=" icon-pencil"></i>
                                        </div>
                                        <div class="timeline-panel">
                                            <div class="timeline-heading">
                                                <h4 class="timeline-title">Timeline Event</h4>
                                                <p>
                                                    <small class="text-muted"><i class="icon-check icon-2x"></i>11 hours ago via Twitter</small>
                                                </p>
                                            </div>
                                            <div class="timeline-body">
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. </p>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="timeline-inverted">
                                        <div class="timeline-badge warning">
                                            <i class="icon-credit-card"></i>
                                        </div>
                                        <div class="timeline-panel">
                                            <div class="timeline-heading">
                                                <h4 class="timeline-title">Timeline Event</h4>
                                            </div>
                                            <div class="timeline-body">
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.  Aliquam in metus eu lectus aliquet egestas.</p>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="timeline-badge danger">
                                            <i class="icon-map-marker"></i>
                                        </div>
                                        <div class="timeline-panel">
                                            <div class="timeline-heading">
                                                <h4 class="timeline-title">Timeline Event</h4>
                                            </div>
                                            <div class="timeline-body">
                                                <p>Lorem ipsum dolor sit scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="timeline-inverted">
                                        <div class="timeline-badge">
                                            <i class="icon-envelope-alt"></i>
                                        </div>
                                        <div class="timeline-panel">
                                            <div class="timeline-heading">
                                                <h4 class="timeline-title">Timeline Event</h4>
                                            </div>
                                            <div class="timeline-body">
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam in metus eu lectus aliquet egestas.</p>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="timeline-badge info">
                                            <i class="icon-check"></i>
                                        </div>
                                        <div class="timeline-panel">
                                            <div class="timeline-heading">
                                                <h4 class="timeline-title">Timeline Event</h4>
                                            </div>
                                            <div class="timeline-body">
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.  Aliquam in metus eu lectus aliquet egestas.</p>
                                                <hr />
                                                <div class="btn-group">
                                                    <button type="button" class="btn btn-primary btn-sm dropdown-toggle" data-toggle="dropdown">
                                                        
                                                        <span class="caret"></span>
                                                    </button>
                                                    <ul class="dropdown-menu" role="menu">
                                                        <li><a href="#">Action</a>
                                                        </li>
                                                        <li><a href="#">Another action</a>
                                                        </li>
                                                        <li><a href="#">Something else here</a>
                                                        </li>
                                                        <li class="divider"></li>
                                                        <li><a href="#">Separated link</a>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </li>

                                </ul>
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



</body>
    <!-- END BODY -->
</html>
