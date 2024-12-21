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
   <style type="text/css">
   img {
    border-radius: 50%;
}
.bb
{
	font-family: cursive;
	font-weight: bolder;
	font-stretch: extra-condensed;
	text-shadow: orange;
	text-transform: capitalize;
	color: red;
	font-size: x-large;
}
   </style>
</head>
<body>

<%@ include file="header.jsp" %>
 <s:iterator value="arr">
<div style="width: 50;"><marquee behavior="slide" scrollamount="10" direction="up"><h2 align="center"> WelCome Dr :-<s:property value="name"/></h2></marquee> </div>
  <img src="images/1.jpg" width="160" height=160><br><br>
  
  
  <%--  <table>
   <tr>
   		
   		<th>Name</th>
   		<th>Skill</th>
   </tr>
   <tr>
  
   <td><s:property value="name"/></td>
   <td> <s:property value="skill"/></td>
   </tr>
   </table>
 
   <table border="1" bgcolor="pink">
   <tr>
   		<th>Day</th>
   		<th>Availability</th>
   		
   </tr>
   <tr>
   <td><s:property value="id"/></td>
   <td><s:property value="name"/></td>
  
   </tr>
   </table> --%>
   
   
 
 <table>
 <tr>
 	<td>
 	<table>
 	<tr>
 	<td class="bb">Name Dr:- <s:property value="name"/><br><br>
   Skill :<s:property value="skill"/>
    </td>
 	
 	
 	</tr>
 	</table>
 	
 	</td>
 </tr>
 
 </table>
 
 <table border="1" bgcolor="pink">
   <tr>
   		<th>Name</th>
   		<th>Skill</th>
   		<th>Day</th>
   		<th>Availability</th>
   		<th>Time</th>
   		
   		
   </tr>
   <tr>
   <td><s:property value="name"/></td>
   <td><s:property value="skill"/></td>
   <td><s:property value="day"/></td>
   <td><s:property value="availability"/></td>
    <td><s:property value="time"/></td>
     
  
   </tr>
   </table> 
  
  
   <br><br>
    <section>  
    <h3> About Doctor </h3>  
    <p><s:property value="aboutus"/> </p>  
    </section>  
   </s:iterator>

   <%@include file="footer.jsp" %>

</body>
</html>