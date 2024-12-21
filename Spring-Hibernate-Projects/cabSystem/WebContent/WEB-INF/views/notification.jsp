<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Notification Page</title>
</head>
<body>
<center>
	<h1>Notification page</h1>
	Date : <input type="text" name="notiDate" ><br><br>
	<form>
		
		 Department Id:
	<select name="department">
	
		<option> Department Id</option>
		<option>HR</option>
		<option>Movement</option>
		<option>Maintain</option>
		<option>Assured</option>
		<option>Finance</option>
		<option>Insurance</option>
	</select><br><br>
	From Department Name:
	<input type="checkbox" name="fromDepart" value="hr">HR
	<input type="checkbox" name="fromDepart" value="movement">Movement
	<input type="checkbox" name="fromDepart" value="maintain">Maintain
	<input type="checkbox" name="fromDepart" value="insured">Insured
	<input type="checkbox" name="fromDepart" value="finance">Finance
	
	<br><br>
	Notification :<textarea rows="15" cols="20" name="notification"></textarea> <br><br>
	
	<input type="submit">
	</form>
</center>
</body>
</html>