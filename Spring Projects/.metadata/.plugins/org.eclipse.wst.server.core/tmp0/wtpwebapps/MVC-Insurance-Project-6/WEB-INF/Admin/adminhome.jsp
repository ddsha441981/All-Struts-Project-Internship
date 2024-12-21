<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin HomePage</title>
</head>
<body>
<h1>${admin.adminId}</h1><br>
<h3>${admin.username}</h3><br>
<h3>${admin.password}</h3><br>

<h4><a href="adminregister">Admin Register Agent</a></h4>
<h4><a href="addpolicybyAdmin">Admin Add Policy</a></h4>

<h4><a href="viewallofClientAddedByAgent">Admin View All Client Added By Agent</a></h4>
<h4><a href="adminviewAndDeleteDataOfPolicy">Admin View All Policy of Client Added By Agent</a></h4>

</body>
</html>