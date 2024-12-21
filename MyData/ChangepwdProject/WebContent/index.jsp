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
<fieldset>
<legend>Change Password</legend>
<s:form action="changepwd" method="get">
ID<input type="text" name="pass_id"><br>
Password<input type="password" name="pwd1"><br>
Confirm Password<input type="password" name="cpwd1"><br>
New Password<input type="password" name="newpwd1"><br>

<s:submit></s:submit>
</s:form>
</fieldset>
</body>
</html>