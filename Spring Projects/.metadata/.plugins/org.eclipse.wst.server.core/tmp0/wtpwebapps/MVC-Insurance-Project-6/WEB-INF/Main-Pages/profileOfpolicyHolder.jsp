<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Client Profile </title>
</head>
<body>
<h1>.....................Hello Client.................</h1>
<h2>Session Id :- ${clientProfile.clientId}</h2>
${clientProfile.clientId}<br>
${clientProfile.clientName}<br>

<a href="selectJoindata/${clientProfile.clientId}">View Details</a>
</body>
</html>