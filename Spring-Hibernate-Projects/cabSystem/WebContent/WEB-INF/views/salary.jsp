<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salary Page</title>
</head>
<body>
<h1>Salary Details</h1>

<form action="addSalaryDetailsByEmployee">
	
	Select DepartMent <select name="dptId">
		<option>Select Department</option>
		<option value="dptId">A</option>
		<option value="dptId">B</option>
		<option value="dptId">C</option>
		<option value="dptId">D</option>
	</select>
	<br><br>
	
	Date :<input type="text" name="date"><br><br>
	basic :<input type="text" name="basic"><br><br>
	hra :<input type="text" name="hra"><br><br>
	convey :<input type="text" name="convey"><br><br>
	total :<input type="text" name="total"><br><br>
	provident :<input type="text" name="provident"><br><br>
	esi :<input type="text" name="esi"><br><br>
	deduct :<input type="text" name="deduct"><br><br>
	net Salary :<input type="text" name="netSalary"><br><br>
	
	<input type="submit">
	
</form>
</body>
</html>