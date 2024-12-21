<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="simple"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Interns Information</h1>
<s:form action="create_intern" validate="true">
<s:textfield name="intern_id" label="Intern ID"></s:textfield>  
<s:textfield name="batch_id" label="Batch ID"></s:textfield> 
<s:textfield name="intern_username" label="Intern UserName"> </s:textfield>  
<s:password name="intern_password" label="Intern Password"></s:password>  
<s:password name="intern_re_enter_password" label="Re-EnterPassword"></s:password>
<s:textfield name="intern_first_name" label="Intern First name"></s:textfield>  
<s:textfield name="intern_middle_name" label="Intern Middle name"></s:textfield>  
<s:textfield name="intern_last_name" label="Intern Last name"></s:textfield>  
<s:textfield name="intern_address" label="Address"></s:textfield> 
<s:datetimepicker label="Birth Date" displayFormat="dd-MM-yyyy" name="birth_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker>
<s:datetimepicker label="Join Date" displayFormat="dd-MM-yyyy" name="join_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker>
<s:textfield name="intern_mobile_number" label="Mobile Number"></s:textfield> 
<s:textfield name="intern_e_mail" label="E-Mail"></s:textfield> 
<s:textfield name="group_id" label="Group ID"></s:textfield> 
<s:textfield name="project_name" label="Project Name"></s:textfield> 
<s:submit value="Create"></s:submit>  
</s:form>
<s:form action="viewdata">
<s:submit value="View Intern"></s:submit>
</s:form>
<s:form action="backintern">
<s:submit value="Back"></s:submit>  
</s:form> 
</body>
</html>