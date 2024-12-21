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
   <s:head theme="ajax" debug="true"/>
</head>
<body>

<%@ include file="header.jsp" %>
<%@ include file="image-slider.jsp" %>
<!-- <img  src="images/1.jpg" width="1200" height="400"> -->
   
    
    
    <h1 align="center">Patient Bill</h1>
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
 <s:form action="BillForPatient" method="post">
<tr>
<td><s:textfield label="Enter PId" name="Bid" cssClass="textboxis" required="true"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Patient Name" name="Bname" cssClass="textboxis" required="true"></s:textfield></td>
</tr>
<tr>
<td><tr>
<td><s:select label="Select Treatment"  name="treatment" list="%{#{'Select Treatment':'Select Treatment'} }" cssClass="textboxis">
			<s:optgroup label="A" list="#{'deendayal':'deendayal','nitin':'nitin' }" />
			<s:optgroup label="B" list="#{'Ratan':'Ratan','Bala':'Bala' }" />
			<s:optgroup label="C" list="#{'Ramesh':'Ramesh','Harsh':'Harsh' }" />
			<s:optgroup label="D" list="#{'kk':'kk','kumar':'kumar' }" />
			<s:optgroup label="E " list="#{'manisha':'manisha','avantika':'avantika' }"/>
			<s:optgroup label="F " list="#{'manisha':'manisha','avantika':'avantika' }"/>
			<s:optgroup label="G " list="#{'No Doctor Available':'No Doctor Available'}"/>
</s:select></td>
</tr>
<!-- </td>
</tr> -->
<tr>
<td><s:combobox label="Refer Doctors Name" list="{'Maharastra','B','C','D','F','G','H','I','J','K','L','M','AA','BB','CC','DD','FF','GG','HH','II','JJ','KK','LL','MM'}" name="Rdoc" cssClass="textboxis" required="true"></s:combobox></td>
</tr>
<tr>
<td><s:textfield label="Medicine Id" name="mdc" cssClass="textboxis" required="true"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Medicine Price" name="price" cssClass="textboxis" required="true"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Medicine Quantity" name="qunt" cssClass="textboxis" required="true"></s:textfield></td>
</tr>
<tr>
<td><s:radio label="Choose Gender"  list="{'Male','Female'}" name="Bgender" value="Male" required="true"></s:radio></td>
</tr>
<tr>
<td><s:combobox label="Choose City" list="{'Pune','Jaipur','New Delhi'}" name="Bcity" cssClass="textboxis" required="true"></s:combobox></td>
</tr>
<%-- <tr>
<td><s:datetimepicker label="Select Admit Date" name="toDate" displayFormat="MM-dd-yy" required="true" cssClass="textboxis" /></td>
</tr>
<tr>
	<td><s:datetimepicker label="Select Discharge Date" name="toDate" displayFormat="MM-dd-yy" required="true" cssClass="textboxis" /></td>
</tr> --%>
<tr>
	<td><s:textfield label="Select Admit Date" name="Badmit" required="true"></s:textfield></td>
</tr>
<tr>
	<td><s:textfield label="Select Discharge Date" name="Bdischarge" required="true"></s:textfield></td>
</tr>
<tr>
<td><s:submit></s:submit></td>
</tr>
</s:form>
</table>
    
    
    
    
   <%@include file="footer.jsp" %>

</body>
</html>