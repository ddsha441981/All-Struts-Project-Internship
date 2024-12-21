<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Manager Official Details</title>
</head>
<body>
<center>
<h1>Manager Official Details</h1>

<form action="managerRegister">

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
		Work EmailId :<input type="text" name="emailId"><br><br>
		Age :<input type="text" name="age"><br><br>
		Qualification :<input type="text" name="qualification"><br><br>
		Date Of Joining :<input type="text" name="doj"><br><br>
		Designation :<input type="text" name="designation"><br><br>
		Experience :<input type="text" name="experience"><br><br>
		
		<input type="submit">
	</form>
</center>
</body>
</html>