<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pharmacy</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0">
	<title></title>
		<!-- Start HEAD section -->
	<link rel="stylesheet" href="CSS3 Menu_files/style.css" type="text/css" /><style type="text/css">._css3m{display:none}</style>
	<!--  HEAD section -->

<style>
   		.parent{
   		width: 200px;
   		height: 500px;
   		float: left;
   		/* background:magenta; */
   		margin: 20px;
   		border-style: solid;
   		}
   		.child1{
   		width: 400px;
   		height: 500px;
   		float: left;
   		/* background:magenta; */
   		border-style: solid;
   		margin: 20px;
   		}
   		
   		.child2{
   		width: 200px;
   		height: 500px;
   		float: left;
   		/* background:magenta; */
   		margin: 20px;
   		border-style: solid;
   		}
   </style>
	<link rel="stylesheet" type="text/css" href="css/textbox.css"> 
</head>
<body ontouchstart="" style="background-color:#EBEBEB">
<div>
<img  src="image/6.jpg" width="1350px" height="400px">
</div>
<%@ include file="header.jsp" %>

<div class="parent"><h1>News</h1>
<img src="image/6.jpg" width="200" height="90">
Subhas Chandra Bose was an Indian nationalist whose attempt during World War II to rid India of   
    British rule with the help of Nazi Germany and Japan left a troubled legacy.  
    The honorific Netaji (Hindustani language: "Respected Leader"), first applied to Bose in Germany,  
    <p align="center">View More</p>
    
</div>
<div class="child1"> <h1 align="center">WelCome To Adminstrator</h1>
<table width="100%" bgcolor="#FFFFFF" border="0">
 <s:form action="greeting" method="post">
<tr>
<td><s:textfield label="Login Name" name="loginname" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
	<td><s:password name="pwd" label="Password" cssClass="textboxis"></s:password></td>
</tr>
<tr>
<td><s:submit></s:submit></td>
</tr>
</s:form>
</table>
     </div>
<div class="child2"> 
<h1>News</h1>
<img src="image/6.jpg" width="200" height="90">
Subhas Chandra Bose was an Indian nationalist whose attempt during World War II to rid India of   
    British rule with the help of Nazi Germany and Japan left a troubled legacy.  
    The honorific Netaji (Hindustani language: "Respected Leader"), first applied to Bose in Germany, 
    <p align="center">View More</p>
</div>
<div class="child2"> 
<h1>News</h1>
<img src="image/6.jpg" width="200" height="90">
Subhas Chandra Bose was an Indian nationalist whose attempt during World War II to rid India of   
    British rule with the help of Nazi Germany and Japan left a troubled legacy.  
    The honorific Netaji (Hindustani language: "Respected Leader"), first applied to Bose in Germany, 
     <p align="center">View More</p>
</div>

</body>
</html>
