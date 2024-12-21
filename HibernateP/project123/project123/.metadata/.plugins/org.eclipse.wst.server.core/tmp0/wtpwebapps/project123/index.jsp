<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
<s:actionerror/>
<div id="nav">				
<s:form action="login" validate="true">
<s:select name="role" label="Role" headerKey="" headerValue="Select Role" key="role" list="#{'admin':'admin', 'Project Manager':'Project Manager', 'Intern':'Intern','Group Leader':'Group Leader'}"/>
<s:textfield name="uname" label="Username" />
<s:password name="password" label="Password" />
<s:submit method="execute" value="Login" align="center" />
</s:form>
</div>
</body>
</html>
