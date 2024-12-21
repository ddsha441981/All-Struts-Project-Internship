<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri= "/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="registerpage" method="post">
<s:textfield label="Enter Employee Id" name="empid"></s:textfield>
<s:password label="Enter Password" name="pwd"></s:password>
<s:password label="Enter Confirm Password" name="cpwd"></s:password>
<s:textfield label="Enter Employee Name" name="ename"></s:textfield>
<s:textfield label="Enter Email Id" name="email"></s:textfield>
<s:textfield label="Enter Date" name="dob"></s:textfield>
<s:submit></s:submit>

</s:form>
</body>
</html>