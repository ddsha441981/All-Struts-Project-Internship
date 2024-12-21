<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Medicio landing page template for Health niche</title>
	
    <!-- css -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="plugins/cubeportfolio/css/cubeportfolio.min.css">
	<link href="css/nivo-lightbox.css" rel="stylesheet" />
	<link href="css/nivo-lightbox-theme/default/default.css" rel="stylesheet" type="text/css" />
	<link href="css/owl.carousel.css" rel="stylesheet" media="screen" />
    <link href="css/owl.theme.css" rel="stylesheet" media="screen" />
	<link href="css/animate.css" rel="stylesheet" />
    <link href="css/style.css" rel="stylesheet">

	<!-- boxed bg -->
	<link id="bodybg" href="bodybg/bg1.css" rel="stylesheet" type="text/css" />
	<!-- template skin -->
	<link id="t-colors" href="color/default.css" rel="stylesheet">

<link rel="stylesheet" href="css/normalize.css">
 <link rel="stylesheet" href="css/style1.css">
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-custom">


<div id="wrapper">
	
<%@ include file="header.jsp" %>
	
	<!-- Section: intro -->
   <%@ include file="bannerimage.jsp" %>
	
	<!-- /Section: intro -->

	<!-- Section: boxes -->
    <section id="boxes" class="home-section paddingtop-80">
	
		<div class="container">
			<div class="row">
				<div class="col-sm-3 col-md-3">
					<div class="wow fadeInUp" data-wow-delay="0.2s">
						<div class="box text-center">
							
							<i class="fa fa-check fa-3x circled bg-skin"></i>
							<h4 class="h-bold">Make an appoinment</h4>
							<p>
							Lorem ipsum dolor sit amet, nec te mollis utroque honestatis, ut utamur molestiae vix, graecis eligendi ne.
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-md-3">
					<div class="wow fadeInUp" data-wow-delay="0.2s">
						<div class="box text-center">
							
							<i class="fa fa-list-alt fa-3x circled bg-skin"></i>
							<h4 class="h-bold">Choose your package</h4>
							<p>
							Lorem ipsum dolor sit amet, nec te mollis utroque honestatis, ut utamur molestiae vix, graecis eligendi ne.
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-md-3">
					<div class="wow fadeInUp" data-wow-delay="0.2s">
						<div class="box text-center">
							<i class="fa fa-user-md fa-3x circled bg-skin"></i>
							<h4 class="h-bold">Help by specialist</h4>
							<p>
							Lorem ipsum dolor sit amet, nec te mollis utroque honestatis, ut utamur molestiae vix, graecis eligendi ne.
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-md-3">
					<div class="wow fadeInUp" data-wow-delay="0.2s">
						<div class="box text-center">
							
							<i class="fa fa-hospital-o fa-3x circled bg-skin"></i>
							<h4 class="h-bold">Get diagnostic report</h4>
							<p>
							Lorem ipsum dolor sit amet, nec te mollis utroque honestatis, ut utamur molestiae vix, graecis eligendi ne.
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

	</section>
	<!-- /Section: boxes -->
	
	
	<%@ include file="appoitment.jsp" %>

<!-- Section: services -->
 
 
 <!--******************************************************************************* services page********************************************************************** -->
 
 
	<!-- /Section: services -->
	

	<!-- Section: team -->
	
	
<!--******************************************************************************* Doctor page********************************************************************** -->


<!-- /Section: team -->

	
		
	<!-- Section: works -->
	<h2 align="center">Patient Form</h2>
   <s:form>
   		
   		<table>
   	
   		<tr>
   		
   		<td>S.No<s:textfield  name="sno"></s:textfield></td>
   		</tr>
   		
   		<tr>
   		
   		<td>Repist <s:textfield name="rno"></s:textfield></td>
   		</tr>
   		<tr>
   		
   		<td>Patient Name<s:textfield  name="pname"></s:textfield></td>
   		</tr>
   		
   		<tr>
   		
   		<td>Age<s:textfield  name="age"></s:textfield></td>
   		</tr>
   		
   		
   		<tr>
   		
   		<td>Doctor Name<s:textfield  name="dname"></s:textfield></td>
   		</tr>
   		<tr>
   		
   		<td>Address<s:textarea  name="address" cols="23" rows="3"></s:textarea></td>
   		</tr>
   		<tr>
   		
   		<td>Diasa<s:textarea  name="dig" cols="23" rows="3"></s:textarea></td>
   		</tr>
   		<tr>
   		
   		<td>Date<s:datetimepicker name="chkin" adjustWeeks="true" displayFormat="dd MMMM,yyyy" toggleType="wipe"/></td>
   		</tr>
   		<s:submit></s:submit>
   		</table>
   </s:form>
	<!-- /Section: works -->
	
	
	<!-- Section: testimonial -->
   
   <!--******************************************************************************* Show Review page********************************************************************** -->
   
   
	<!-- /Section: testimonial -->
	

	<!-- Section: pricing -->	
	
	 <!--******************************************************************************* healthpackage page********************************************************************** -->
	
	<!-- /Section: pricing -->
	
	
<%@ include file="footer.jsp" %>
</div>
<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>

	<!-- Core JavaScript Files -->
    <script src="js/jquery.min.js"></script>	 
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.easing.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/jquery.scrollTo.js"></script>
	<script src="js/jquery.appear.js"></script>
	<script src="js/stellar.js"></script>
	<script src="plugins/cubeportfolio/js/jquery.cubeportfolio.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/nivo-lightbox.min.js"></script>
    <script src="js/custom.js"></script>
<script src="js/index.js"></script>
</body>

</html>
