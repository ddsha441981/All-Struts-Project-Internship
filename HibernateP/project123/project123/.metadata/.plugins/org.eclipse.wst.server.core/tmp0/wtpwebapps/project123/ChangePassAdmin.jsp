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
<h1>Change Password-Admin</h1>
<s:form action="change_password" validate="true">
<s:password name="old_password" label="Enter Old Password" />
<s:password name="new_password" label="Enter New Password" />
<s:submit value="Submit"></s:submit>  
</s:form>

<s:form action="backAD">
<s:submit value="Back"></s:submit>  
</s:form> 

</body>
</html>