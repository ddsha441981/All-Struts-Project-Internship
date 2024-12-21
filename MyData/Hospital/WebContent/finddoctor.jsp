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
   
	<!-- /Section: boxes -->
	
	
	<%-- <%@ include file="appoitment.jsp" %> --%>

<!-- Section: services -->
 
 
 <!--******************************************************************************* services page********************************************************************** -->
 
	
	
<!--******************************************************************************* Doctor page********************************************************************** -->
<h1 align="center">Find Doctor</h1>
<!-- <table align="left">
	
	<tr>
		<td><a href="#">hello</a><br><br> </td>
		<td><a href="#">hello</a> </td>
		<td><a href="#">hello</a> </td>
		
	</tr>
</table>
 -->
 <p> * Serach Doctor Skill/ Name</p>
 <s:form>
<s:textfield name="finddoc" label="Serach Doctors"></s:textfield>
<s:submit value="Serech"></s:submit>
</s:form>


	<!-- Section: team -->

<!-- /Section: team -->

	
		
	<!-- Section: works -->
  
	<!-- /Section: works -->
	
	
	<!-- Section: testimonial -->
   
   <!--******************************************************************************* Show Review page********************************************************************** -->
   
   
	<!-- /Section: testimonial -->
	
	<!-- Section: pricing -->	
	
	 <!--******************************************************************************* healthpackage page********************************************************************** -->
	
	<!-- /Section: pricing -->
	
<%-- <%@ include file="companypartner.jsp" %>	 --%>
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
