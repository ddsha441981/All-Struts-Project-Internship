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
<%@ include file="image-slider.jsp" %>
<!-- <img  src="images/1.jpg" width="1200" height="400"> -->
     <h1 align="center">Neurology </h1>
   <%--  <section>  
    <p><b>Complete range of Diagnostic GI procedures:</b></p>
    <ul>
    <li>Oesophagoscopy</li>
     <li>Gastroscopy</li>
      <li>Colonoscopy</li>
       <li>Endoscopic Retrograde Cholangio <br> Pancreatography(ERCP)</li>
        <br>
    </ul>
    <p><b>Contact Details : 020-660******</</b></p>
    </section> --%>  
    <section>  
    <p>Subhas Chandra Bose was an Indian nationalist whose attempt during World War II to rid India of   
    British rule with the help of Nazi Germany and Japan left a troubled legacy.  
    </p>  
    </section>  
     <section>  
    <p><b>The diagnostic studies include :</b></p>
    ECG
    <ul>
    <li>3D Color Doppler and Echocardiography</li>
     <li>Computerized stress analysis</li>
      <li>Holter Montering</li>
       <li>Endoscopic Retrograde Cholangio <br> Pancreatography(ERCP)</li>
        <br>
    </ul>
    </section>  
    
    <section>  
    <p><b>EMG & NCV :</b></p>
    <ul>
    <li>3D Color Doppler and Echocardiography</li>
     <li>Computerized stress analysis</li>
      <li>Holter Montering</li>
       <li>Endoscopic Retrograde Cholangio <br> Pancreatography(ERCP)</li>
        <br>
    </ul>
    <p><b>Contact Details : 020-660******</</b></p>
    </section>  
    <h2>Head of Department</h2>
   <a href="#">Dr. Sudhir Kothari HOD</a> 
 <h3>Consultants</h3><br>
 <table>
 <tr>
 	<td>
 	<table>
 	<tr>
 	<td><a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> </td>
 	
 	<td><a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> </td>
   <td><a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> </td>
   <td><a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> </td>
   <td><a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> </td>
 	</tr>
 	</table>
 	
 	</td>
 </tr>
 
 </table>
    
    <%-- <h1>Consultants</h1><br>
    <s:form action="profile11">
    <a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> 
  
   
   </s:form>
   
   <a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> 
   
   <a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> 
   
   <a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr> 
   
   <a href="member1.jsp">Dr.kedar Patil </a><br><br>
   DNB(Surg),FNB MAS,G <br>Oncosurg,Fellow Batriatric and <br> Metabolic Surgery,Taiwan 
   <br> <a href="#"><h6>View Profile</h6></a><hr>  --%>
   
<!-- <table align="left">
	
	<tr>
		<td><a href="#">hello</a><br><br> </td>
		<td><a href="#">hello</a> </td>
		<td><a href="#">hello</a> </td>
		
	</tr>
</table>
 -->



    
    
    
    
   <%@include file="footer.jsp" %>

</body>
</html>