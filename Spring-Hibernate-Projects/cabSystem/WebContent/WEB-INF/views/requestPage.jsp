<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Page</title>
</head>
<body>
<center>
	<h1>Request page</h1>
	
	<form>
		Manager Id : <input type="text" name="managerId" readonly="readonly"><br><br>
		Select Department:
	<select name="department">
	
		<option>Select Department</option>
		<option>HR</option>
		<option>Movement</option>
		<option>Maintain</option>
		<option>Assured</option>
		<option>Finance</option>
		<option>Insurance</option>
	</select><br><br>
	
	Subject : <input type="text" name="subject" ><br><br>
	Request Details<textarea rows="15" cols="20" name="reqDetails"></textarea> <br><br>
	Date : <input type="text" name="reqDate" ><br><br>
	<input type="submit">
	</form>
</center>
</body>
</html>