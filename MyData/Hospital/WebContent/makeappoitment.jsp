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
<h1 align="center">Make Appoitment</h1>
<!-- <table align="left">
	
	<tr>
		<td><a href="#">hello</a><br><br> </td>
		<td><a href="#">hello</a> </td>
		<td><a href="#">hello</a> </td>
		
	</tr>
</table>
 -->
 <p style="color: red;">*Indicates Mandatory Fields</p>

<table width="100%" bgcolor="#FFFFFF" border="0">
 <s:form action="patientenqiury" method="post">
<%-- <tr>
<td><s:doubleselect name="country" label="Select Department" list="{'Anaesthesia','India'}" 
	 doubleName="city" doubleList="top=='USA' ? {'Deendayal','b','A','A','A','A'}:{'p','p','p','p','p','p','p'}">
	 </s:doubleselect></td>
</tr> --%>
<tr>
<td><s:select label="Select Your Doctors"  name="doctors" list="%{#{'Select Doctors':'Select Doctors'} }">
			<s:optgroup label="Anaesthesia" list="#{'deendayal':'deendayal','nitin':'nitin' }" />
			<s:optgroup label="Cardiac Surgery" list="#{'Ratan':'Ratan','Bala':'Bala' }" />
			<s:optgroup label="Dentistry" list="#{'Ramesh':'Ramesh','Harsh':'Harsh' }" />
			<s:optgroup label="ENT" list="#{'kk':'kk','kumar':'kumar' }" />
			<s:optgroup label="Genernal Surgery" list="#{'manisha':'manisha','avantika':'avantika' }"/>
</s:select></td>
</tr>
<tr>
<td><s:select label="Select Your Day"  name="day" list="%{#{'Select Days':'Select Days'} }">
			<s:optgroup label="Monday 9.00 to 2.00 PM" list="#{'deendayal':'deendayal','nitin':'nitin' }" />
			<s:optgroup label="Tuesday 9.00 to 2.00 PM" list="#{'Ratan':'Ratan','Bala':'Bala' }" />
			<s:optgroup label="Wenesday 9.00 to 2.00 PM" list="#{'Ramesh':'Ramesh','Harsh':'Harsh' }" />
			<s:optgroup label="Thuresday 9.00 to 2.00 PM" list="#{'kk':'kk','kumar':'kumar' }" />
			<s:optgroup label="Friday 9.00 to 2.00 PM " list="#{'manisha':'manisha','avantika':'avantika' }"/>
			<s:optgroup label="Saturday 9.00 to 12.00 PM " list="#{'manisha':'manisha','avantika':'avantika' }"/>
			<s:optgroup label="Sunday OFF " list="#{'No Doctor Available':'No Doctor Available'}"/>
</s:select></td>
</tr>
<tr>
<td><s:textfield label="Name of Patient" name="name"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Name of Person Taking The Appoitment" name="person"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Relationship with Patient" name="relation"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Contact Mobile Number" name="mob"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Email Id" name="emal"></s:textfield></td>
</tr>
<tr>
<td><s:radio label="Choose Gender"  list="{'Male','Female'}" name="pgender" value="Male"></s:radio></td>
</tr>
<tr>
<td><s:combobox label="Choose City" list="{'Pune','Jaipur','New Delhi'}" name="pcity"></s:combobox></td>
</tr>
<tr>
<td><s:textarea label="Any Other Queriy" name="qry" cols="23" rows="3"></s:textarea></td>
</tr>
<tr>
<td><s:textarea label="Terms and Conditions" name="terms" cols="23" rows="3" value="Comming Soon"></s:textarea></td>
</tr>
<tr>
<td><s:submit></s:submit></td>
</tr>
</s:form>
</table>

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
