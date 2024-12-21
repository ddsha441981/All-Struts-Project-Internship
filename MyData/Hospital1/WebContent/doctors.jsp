<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <!-- jQuery -->
<script type="text/javascript" src="./libs/jquery/jquery.js"></script>

<!-- SmartMenus jQuery plugin -->
<script type="text/javascript" src="./jquery.smartmenus.js"></script>

<!-- SmartMenus jQuery init -->
<script type="text/javascript">
	$(function() {
		$('#main-menu').smartmenus({
			subMenusSubOffsetX: 1,
			subMenusSubOffsetY: -8
		});
	});
</script>




<!-- SmartMenus core CSS (required) -->
<link href="./css/sm-core-css.css" rel="stylesheet" type="text/css" />

<!-- "sm-blue" menu theme (optional, you can use your own CSS, too) -->
<link href="./css/sm-blue/sm-blue.css" rel="stylesheet" type="text/css" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->




<!-- YOU DO NOT NEED THIS - demo page content styles -->
<link href="./libs/demo-assets/demo.css" rel="stylesheet" type="text/css" />


  <!-- $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$css  menu$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ --> 
   <!-- Start css3menu.com HEAD section -->
	<link rel="stylesheet" href="CSS3 Menu_files/style.css" type="text/css" /><style type="text/css">._css3m{display:none}</style>
	<!-- End css3menu.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="engine1/style.css" />
	<script type="text/javascript" src="engine1/jquery.js"></script>
	<!-- End WOWSlider.com HEAD section -->
   <!-- $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ --> 
   <link rel="stylesheet" type="text/css" href="css/textbox.css">   
   
</head>
<body>

<%@ include file="header.jsp" %>
<!-- <img  src="images/1.jpg" width="1200" height="400"> -->
<%@ include file="image-slider.jsp" %>
    <%-- <h2> Indian Leader</h2>  
    <section>  
    <h3> Jawaharlal Nehru </h3>  
    <p> Jawaharlal Nehru was the first Prime Minister of India and a central figure in   
    Indian politics for much of the 20th century. He emerged as the paramount leader of the Indian   
    independence movement under the tutelage of Mahatma Gandhi. -Source Wikipedia </p>  
    </section>  
    <section>  
    <h3>Subhas Chandra Bose </h3>  
    <p>Subhas Chandra Bose was an Indian nationalist whose attempt during World War II to rid India of   
    British rule with the help of Nazi Germany and Japan left a troubled legacy.  
    The honorific Netaji (Hindustani language: "Respected Leader"), first applied to Bose in Germany,  
     by the Indian soldiers of the Indische Legion and by the German and Indian officials  
     in the Special Bureau for India in Berlin, in early 1942, is now used widely throughout India. -source Wikipedia</p>  
    </section>   --%>
    
    
    <h1 align="center">Doctors</h1>
    
   <!--  <table align="left"> -->
 
 
    	
    <table>
 <tr>
 	<td>
 	<table>
 	<!-- <tr>
 	<td><a href="showprofile.action?id=1">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=1"><h6>View Profile</h6></a><hr> </td>
 	
 	<td><a href="showprofile.action?id=2">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=2"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=3">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=3"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=4">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=4"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=5">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=5"><h6>View Profile</h6></a><hr> </td>
   
 	</tr> 
 	</table>-->
 	
   <%-- <%--  <table>
 <tr>
 	<td>
 	<table>
 	<s:iterator value="All">
 	<tr>
 	<td><s:property value="name"/><br><br>
   <s:property value="skill"/><br><br> 
   <br> <td><a href="showprofile.action?id=<s:property value="id"/>">View More</a> <hr></td>
 	
 	
   
 	</tr>
 	</s:iterator>
 	</table> --%> 
 	<div>
 	<s:iterator value="All">
 	<span>Dr. </span><s:property value="name"/><br><br>
 	<span></span> <s:property value="skill"/><br>
 	<span></span><a href="showprofile.action?id=<s:property value="id"/>">View More</a> <hr>
 	</s:iterator>
 	</div>
 	
    <!-- <table>
 <tr>
 	<td>
 	<table>
 	<tr>
 	<td><a href="showprofile.action?id=11">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=11"><h6>View Profile</h6></a><hr> </td>
 	
 	<td><a href="showprofile.action?id=12">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=12"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=13">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=13"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=14">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=14"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=15">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=15"><h6>View Profile</h6></a><hr> </td>
   
 	</tr>
 	</table>
 	
 	</td>
 </tr>
 
 </table>
    <table>
 <tr>
 	<td>
 	<table>
 	<tr>
 	<td><a href="showprofile.action?id=16">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=16"><h6>View Profile</h6></a><hr> </td>
 	
 	<td><a href="showprofile.action?id=17">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=17"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=18">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=8"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=19">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=19"><h6>View Profile</h6></a><hr> </td>
   <td><a href="showprofile.action?id=20">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="showprofile.action?id=20"><h6>View Profile</h6></a><hr> </td>
   
 	</tr>
 	</table>
 	
 	</td>
 </tr>
 
 </table> -->
  
    
   <%@include file="footer.jsp" %>

</body>
</html>