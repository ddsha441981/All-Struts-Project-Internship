<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Project.css">

</head>
<body bgcolor="purple">


<img src="Images/executive.jpg" width="1300" height="600"/>
<p style="text-align: center;" id="p2">EXECUTIVE ROOMS</p>
<ul>
<li><p id="p4"><s:text name="Beds:"></s:text>
<s:text name="King Size"></s:text></p></li>
<li><p id="p4"><s:text name="View:"></s:text>
<s:text name="Sea View"></s:text></p></li>
<li><p id="p4"><s:text name="Room Size:"></s:text>
<s:text name="35 sq.mts"></s:text></p></li>
<li><p id="p4"><s:text name="Room Rate:"></s:text>
<s:text name="10000INR"></s:text></p></li>
</ul>
<br>

<s:form action="BookRoom.jsp">
<s:submit value="Book this Room" align="center"></s:submit>
</s:form>




</body>
</html>