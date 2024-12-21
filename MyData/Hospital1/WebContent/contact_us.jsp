<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <!-- jQuery -->
<%-- <script type="text/javascript" src="./libs/jquery/jquery.js"></script> --%>

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
   
   <style>
   		.parent{
   		width: 500px;
   		height: 100px;
   		float: left;
   		/* background:magenta; */
   		margin: 20px;
   		}
   		.child1{
   		width: 200px;
   		height: 100px;
   		float: left;
   		/* background:magenta; */
   		margin: 20px;
   		}
   		
   		.child2{
   		width: 450px;
   		height: 100px;
   		float: left;
   		/* background:magenta; */
   		margin: 20px;
   		}
   </style>
</head>
<body>

<%@ include file="header.jsp" %>
<%@ include file="image-slider.jsp" %>
<div class="parent"><h1>Contact Us</h1>
<table width="100%" bgcolor="#FFFFFF" border="0">
 <s:form action="greeting" method="post">
 <tr>
<td><s:textfield label="Id" name="gid" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Patient Name" name="gname" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Room/Ward No." name="groom" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Room/Ward No." name="groom" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Room/Ward No." name="groom" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Room/Ward No." name="groom" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Room/Ward No." name="groom" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Sender Name" name="gsend" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textarea label="Message" name="msg" cols="23" rows="3" cssClass="textareais"></s:textarea></td>
</tr>
<tr>
<td><s:submit></s:submit></td>
</tr>
</s:form>
</table>
</div>
<div class="child1"> <h1>Address</h1><section>  
    
   <p> Plot no 4 Ganpati Vihar Kalwar Road Shekhawat Marg</p> <h5> Jhotwara 
    Jaipur 
    Rajasthan</h5>
    <p>Contact No 
    9602063435
    9595221946</p> 
      
    </section>  </div>
<div class="child2"> <h1>Map</h1><section>  
    <h3>Google Map</h3>  
    <p> Here Our Map  Coming Soon</p>  
    </section>  </div>
    
    
  <%--  <%@include file="footer.jsp" %> --%>

</body>
</html>