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
<s:form action="edit">
<s:textfield name="project_manager_id" label="Project Manager ID" value="%{Manager.project_manager_id}"></s:textfield>

<s:textfield name="name" label="UserName" value="%{Manager.name}"> </s:textfield> 

<s:password name="password" label="Password" value="%{Manager.password}"></s:password> 
<s:password name="re_enter_password" label="Re-EnterPassword" value="%{Manager.re_enter_password}"></s:password>
<s:textfield name="mobile_number" label="Mobile Number" value="%{Manager.mobile_number}"></s:textfield> 
<s:textfield name="e_mail" label="Email" value="%{Manager.e_mail}"></s:textfield> 
<s:textfield name="start_date" label="Start Date" value="%{Manager.start_date}"></s:textfield> 
<s:textfield name="join_date" label="Join Date" value="%{Manager.join_date}"></s:textfield> 
<s:radio label="Gender" name="gender" list="{'male','female'}" value="%{Manager.gender}" />  
<s:select label="Country" name="country" headerKey="" headerValue="Select Country" key="country" value="%{Manager.country}" list="#{'India':'India', 'USA':'USA', 'Japan':'Japan','Australia':'Australia'}"/>
<s:select label="City" name="city" headerKey="" headerValue="Select City" key="city" value="%{Manager.city}" list="#{'Pune':'Pune', 'Mumbai':'Mumbai', 'Nasik':'Nasik','Jalgaon':'Jalgaon'}"/>
</s:form>
</body>
</html>