<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Official Details</title>
</head>
<body>
<center>
<h1>Employee Official Details</h1>

<form action="managerRegisterOfficial">

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
		Date Of Joining :<input type="text" name="doj"><br><br>
		Designation :<input type="text" name="designation"><br><br>
		
		<center>
		<h3>Earnings</h3>
		Basic & DA :<input type="text" name="basic"><br><br>
		HRA :<input type="text" name="hra"><br><br>
		Conveny :<input type="text" name="convy"><br><br>
		Total Addition :<input type="text" name="totalAdd"><br><br>
		</center>
		
		<center>
		<h3>Deduction</h3>
		Provident Fund :<input type="text" name="provident"><br><br>
		ESI :<input type="text" name="esi"><br><br>
		Total Deduction :<input type="text" name="totalDeduction"><br><br>
		Net Salary :<input type="text" name="netSalary"><br><br>
		</center>
		
		<input type="submit">
	</form>
</center>
</body>
</html>