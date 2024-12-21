<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<div id="saveData">
<form:form name="myForm" modelAttribute="myBean" action="MappingData" method="get">

Name : <form:input  type="text" path="name" size="20" id="name"></form:input>
<br>
Password :<form:input type="password" path="password" size="15" id="password"></form:input>
<br>

<input type="submit" id="dataofSubmit"> 
<h1>hhh</h1>

</form:form>
</div>
</body>
</html>