<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Information</title>
</head>
<body>
<s:form action="ssssss" method="post">

<s:textfield label="UserName" name="uname" required="true"></s:textfield>
<s:password label="Enter Password" name="pwd" required="true"></s:password>
<s:textfield label="First Name" name="fname" required="true"></s:textfield>
<s:textfield label="Middle Name" name="mname" required="false"></s:textfield>
<s:textfield label="Last Name" name="lname" required="true"></s:textfield>
<s:textfield label="Email Id" name="eid" required="true"></s:textfield>
<s:textarea label="Address" name="addr" required="true" rows="5" cols="15"></s:textarea>
<%-- <s:doubleselect name="Country" 
				label="Select Country and City" 
				list="{'India','USA'}" 
				doubleName="city" doubleList="top=='India' ? {'Jaipur','Pune','Delhi'} : {'NewYork','MailBorne','LosAngles'}"/> --%>

<s:select name="language" label="Preffered Language(@)"
		  list="{'English','Hindi','Marathi','Gujrati'}">
</s:select>
<s:radio label="Martial Status" name="status" list="{'Single','Married','Divorcee'}" value="Single"></s:radio>
<s:checkboxlist name="skill" label="Your Interested" list="{'Programming','Testing','Research','Web Designing'}"></s:checkboxlist>
<s:submit></s:submit>
<s:reset></s:reset>
<s:a href="Home.jsp">Back</s:a>
</s:form>
</body>
</html>