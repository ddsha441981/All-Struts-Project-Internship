<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>!!!!!!!!!!!!!!!!!!!!!!!Welcome !!!!!!!!!!!!!!!!!!!!!!!</h1>
<h1>!!!!!!!!!!!!!!!!!!!!!!<s:property value="user"/>!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!</h1>
<table>
<tr>
	<th><s:a href="personal.jsp" cssClass="nextf">||Register Student||</s:a></th>

	<th><s:a href="general.jsp" cssClass="nextf">||General Information||</s:a></th>

	<th><s:a href="">||Logout||</s:a></th>
</tr>
</table>
</body>
</html>