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
<h1> Login Page</h1>
<s:form action="hellopage" method="post">
<s:textfield name="user" label="Enter User Name" required="true"></s:textfield>
<s:password name="pwd" label="Enter Password" required="true"></s:password>
<s:submit value="Login"></s:submit>
<s:reset></s:reset>
</s:form>
</body>
</html>