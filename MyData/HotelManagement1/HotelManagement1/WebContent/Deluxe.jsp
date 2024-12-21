<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Project.css">
</head>
<body bgcolor="purple">

<img src="Images/deluxe.jpg" width="1300" height="600"/>
<p style="text-align: center;" id="p2">DELUXE ROOMS</p>
<ul>
<li><p id="p4" ><s:text name="Beds:"></s:text>
<s:text name="King Size"></s:text></p></li>
<li><p id="p4"><s:text name="View:"></s:text>
<s:text name="City View"></s:text></p></li>

<li><p id="p4"><s:text name="RoomSize:"></s:text>
<s:text name="25 sq.mts"></s:text></p></li>
<li><p id="p4"><s:text name="RoomRate:"></s:text>
<s:text name="5500INR"></s:text></p></li>
</ul>
<br>
<s:form action="BookRoom.jsp">
<s:submit value="Book this Room" align="center"></s:submit></s:form>


</body>
</html>