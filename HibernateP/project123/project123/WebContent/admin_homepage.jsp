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
<h1><center>Welcome Admin--<s:property value="#session.uname"/></center></h1>

<h3><a href="projectManagerInfo.jsp">Create New Project Manager</a></h3>

<h3><a href="ChangePassAdmin.jsp">Change Password</a></h3> 

<s:form action="logoutadmin">
<s:submit value="Logout"></s:submit>

</s:form>
</body>
</html>