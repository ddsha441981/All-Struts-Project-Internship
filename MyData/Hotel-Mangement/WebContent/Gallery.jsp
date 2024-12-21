<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/js/fancybox/jquery.fancybox.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

    <script src="assets/js/jquery.js"></script>
    
    
    <!-- js placed at the end of the document so the pages load faster -->
	<script src="assets/js/fancybox/jquery.fancybox.js"></script>    
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

    <!--script for this page-->
  
  <script type="text/javascript">
      $(function() {
        //    fancybox
          jQuery(".fancybox").fancybox();
      });

  </script>
  
  <script>
      //custom select box

      $(function(){
          $("select.styled").customSelect();
      });

  </script>
    
</head>
<body bgcolor="green">
<%@ include file="header.jsp" %>
<!-- <h1 align="center">IMAGE GALLERY</h1>
<img src="Images/5.jpg"/>
<img src="Images/2.jpg"/>
<img src="Images/3.jpg"/> -->



<h1 align="center"><i class="fa fa-angle-right"></i> Gallery</h1>
          	<hr>
				<div class="row mt">
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port04.jpg"><img class="img-responsive" src="assets/img/portfolio/port04.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
					
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port05.jpg"><img class="img-responsive" src="assets/img/portfolio/port05.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
					
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port06.jpg"><img class="img-responsive" src="assets/img/portfolio/port06.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
				</div><!-- /row -->

				<div class="row mt">
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port01.jpg"><img class="img-responsive" src="assets/img/portfolio/port01.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
					
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port02.jpg"><img class="img-responsive" src="assets/img/portfolio/port02.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
					
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port03.jpg"><img class="img-responsive" src="assets/img/portfolio/port03.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
				</div><!-- /row -->

				<div class="row mt mb">
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port04.jpg"><img class="img-responsive" src="assets/img/portfolio/port04.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
					
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port05.jpg"><img class="img-responsive" src="assets/img/portfolio/port05.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
					
					<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 desc">
						<div class="project-wrapper">
		                    <div class="project">
		                        <div class="photo-wrapper">
		                            <div class="photo">
		                            	<a class="fancybox" href="assets/img/portfolio/port06.jpg"><img class="img-responsive" src="assets/img/portfolio/port06.jpg" alt=""></a>
		                            </div>
		                            <div class="overlay"></div>
		                        </div>
		                    </div>
		                </div>
					</div><!-- col-lg-4 -->
				</div><!-- /row -->


<%@ include file="footer.jsp" %>
</body>
</html>