<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Admin Page</h1><hr color="pink" size="2">
<hr> 

<p>Add Doctors Profile</p>
    <a href="doctorprofile.jsp">Add Doctors</a>

    <p>Table 1</p>
    <s:form action="fetchpatient">New Patient Data<s:submit></s:submit>

  </s:form>
  
  <p>Table 2</p>
  <s:form action="fetchdata">Enquiry Data<s:submit></s:submit>

  </s:form>
  
 
    <p>Table 3</p>
    <s:form action="BillFetchData">Bill Data<s:submit></s:submit>

  </s:form>
  
   <p>Table 4</p>
    <s:form action="AddEmployeefetch">New Add Employees <s:submit></s:submit>

  </s:form>
  
   <p>Table 5</p>
    <s:form action="myappoitment">All appoitment <s:submit></s:submit>

  </s:form>
  
  <p>Table 6</p>
    <s:form action="greetingFetch">All Reviews <s:submit></s:submit>

  </s:form>
</body>
</html>