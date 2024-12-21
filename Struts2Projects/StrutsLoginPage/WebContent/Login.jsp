<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="LPage">
<s:textfield label="User Name" name="user"></s:textfield>

<br><br>

<s:password label="password" name="pwd"></s:password>

<br><br>

<s:textfield label="Email Id" name="eid"></s:textfield>

<br><br>

<s:submit label="submit"></s:submit>

</s:form>
</body>
</html>