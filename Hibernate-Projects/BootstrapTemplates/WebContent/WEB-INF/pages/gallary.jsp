<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <!-- BEGIN HEAD -->
<head>
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Gallery</title>
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

    <!-- PAGE LEVEL STYLES-->
    <link href="assets/plugins/jquery.fancybox-1.3.4/fancybox/jquery.fancybox-1.3.4.css" rel="stylesheet" />
      <style>
        .panel-body a img {
            margin-bottom:5px !important;

        }
          .panel-body a{
              color:transparent!important;
          }
    </style>
    
          <!-- END PAGE LEVEL STYLES-->
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

            <div class="inner" style="min-height:700px;">
                <div class="row">
                    <div class="col-lg-12">


                        <h2> Gallery Styles </h2>



                    </div>
                </div>

                <hr />
                <div class="row">
                    <div class="col-lg-12">
 
	
                         <div class="panel panel-success">
                            <div class="panel-heading">
                               Different Animations Example
                            </div>

                            <div class="panel-body">
                              
			<p style="text-align:center">
		<a  id="example1" href="assets/img/demoBig.jpg"  title="Lorem ipsum dolor sit amet"><img src="assets/img/1G.jpg" alt="" /></a>

		<a  id="example2" href="assets/img/demoBig2.jpg"  title="Lorem ipsum dolor sit amet"><img src="assets/img/2G.jpg" alt="" /></a>

		<a  id="example3" href="assets/img/demoBig.jpg"  title="Etiam quis mi eu elit temp"><img src="assets/img/1G.jpg" alt="" /></a>

		<a  id="example4" href="assets/img/demoBig2.jpg"  title="Cras neque mi, semper leon"><img src="assets/img/2G.jpg" alt="" /></a>

	</p>
		</div>
		</div>
		
                           
                        <div class="panel panel-default">
                            <div class="panel-heading">
                              Different Title Positions Example
                            </div>

                            <div class="panel-body">
                              
			<p style="text-align:center">
		<a id="example5" href="assets/img/demoBig.jpg" title="Lorem ipsum dolor sit amet, consectetur adipiscing elit"><img src="assets/img/1G.jpg" alt="" /></a>

		<a id="example6" href="assets/img/demoBig2.jpg" title="Lorem ipsum dolor sit amet, consectetur adipiscing elit"><img src="assets/img/2G.jpg" alt="" /></a>

		<a id="example7" href="assets/img/demoBig.jpg" title="Lorem ipsum dolor sit amet"  ><img src="assets/img/1G.jpg" alt="" /></a>

		<a id="example8" href="assets/img/demoBig2.jpg" title="Lorem ipsum dolor sit amet"><img src="assets/img/2G.jpg" alt="" /></a>

	</p>

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
    <script src="assets/plugins/jquery.fancybox-1.3.4/jquery-1.4.3.min.js"></script> <!--important for gallery-->
     <script src="assets/plugins/jquery.fancybox-1.3.4/fancybox/jquery.mousewheel-3.0.4.pack.js"></script> 
    <script src="assets/plugins/jquery.fancybox-1.3.4/fancybox/jquery.fancybox-1.3.4.js"></script>
     <script src="assets/js/image_gallery.js"></script>
    
	
     <!--END PAGE LEVEL SCRIPTS -->
</body>

     <!-- END BODY -->
</html>
