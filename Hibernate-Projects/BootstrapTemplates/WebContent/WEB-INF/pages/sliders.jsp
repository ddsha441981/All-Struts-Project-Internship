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
    <title>BCORE Admin Dashboard Template | Sliders</title>
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
    <link href="assets/plugins/egorkhmelev-jslider/css/jslider.css" rel="stylesheet" />
    <link href="assets/plugins/egorkhmelev-jslider/css/jslider.blue.css" rel="stylesheet" />
    <link href="assets/plugins/egorkhmelev-jslider/css/jslider.plastic.css" rel="stylesheet" />
    <link href="assets/plugins/egorkhmelev-jslider/css/jslider.round.css" rel="stylesheet" />
    <link href="assets/plugins/egorkhmelev-jslider/css/jslider.round.plastic.css" rel="stylesheet" />

    <!-- END PAGE LEVEL  STYLES -->
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

            <div class="inner" style="min-height:1000px;">
                <div class="row">
                    <div class="col-lg-12">


                        <h2>Slider Styles </h2>



                    </div>
                </div>

                <hr />

                <div class="row">
                    <div class="col-lg-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                Style One
                            </div>
                            <div class="panel-body">
                                <br />

                                 <div class="layout-slider">
      <input id="Slider1"  name="price" value="20" />
    </div>
                                <br />
                                <br />

                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="panel panel-success">
                            <div class="panel-heading">
                                Style Two
                            </div>
                            <div class="panel-body">
                                <br />

                                  <div class="layout-slider">
      <input id="Slider2"  name="price" value="10000;50000" />
    </div>
                                <br />
                                <br />

                            </div>
                        </div>
                    </div>




                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Style Three
                            </div>
                          
                               <div class="layout-slider" style="margin-left:10px;margin-right:10px;">
                                   
                                <br />
      <input id="Slider3"  name="area" value="25;75" />
    </div>

                                <br />
                                <br />
                            

                        </div>

                    </div>

                </div>
                <div class="row">
                    <div class="col-lg-6">
                         <div class="panel panel-danger">
                            <div class="panel-heading">
                                Style four
                            </div>
                            <div class="panel-body">
                               <div class="layout-slider">
                                <br />

      <input id="Slider4"  name="area" value="5;20" />
    </div>
                                <br />
                                <br />

                            </div>
                        </div>
                    </div>

                    <div class="col-lg-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                Style five
                            </div>
                            <div class="panel-body">
                                <div class="layout-slider">
                                <br />

      <input id="Slider5"  name="area" value="600;720" />
    </div>
                                <br />
                                <br />

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
    <script src="assets/plugins/egorkhmelev-jslider/js/jshashtable-2.1_src.js"></script>
    <script src="assets/plugins/egorkhmelev-jslider/js/jquery.numberformatter-1.2.3.js"></script>
    <script src="assets/plugins/egorkhmelev-jslider/js/tmpl.js"></script>
    <script src="assets/plugins/egorkhmelev-jslider/js/jquery.dependClass-0.1.js"></script>
    <script src="assets/plugins/egorkhmelev-jslider/js/draggable-0.1.js"></script>
    <script src="assets/plugins/egorkhmelev-jslider/js/jquery.slider.js"></script>
    <script src="assets/js/get_slider.js"></script>
    <!--END PAGE LEVEL SCRIPTS -->
</body>
    <!-- END BODY -->
</html>
