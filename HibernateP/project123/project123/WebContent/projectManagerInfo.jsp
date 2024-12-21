<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<%--     <%@ taglib uri="/struts-dojo-tags" prefix="c" %>   --%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="simple"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Home</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.jsp">Logout</a></li>
      <li class="dropdown">
       </li>
     </ul>
  </div>
</nav>
          
          
<%-- <script type="text/javascript" src="js/managerValidation.js"></script> --%>

</head>
<body>
<h3><a href="home.action">Home</a></h3>
<h1>Project Manager Information</h1>
<s:form action="create"> 
<!-- <div id="pidErr"></div> -->
<s:textfield name="project_manager_id" label="Project Manager ID"></s:textfield>
<!-- <div id="nameErr"></div> -->
<s:textfield name="name" label="UserName"> </s:textfield> 
<!-- <div id="password"></div> -->
<s:password name="password" label="Password"></s:password> 
<s:password name="re_enter_password" label="Re-EnterPassword"></s:password>
<s:textfield name="mobile_number" label="Mobile Number"></s:textfield> 
<s:textfield name="e_mail" label="Email"></s:textfield> 
<s:datetimepicker label="Birth Date" displayFormat="dd-MM-yyyy" name="birth_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker> 
<s:datetimepicker label="Joining Date" displayFormat="dd-MM-yyyy" name="join_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker>
<s:radio label="Gender" name="gender" list="{'male','female'}" />  
<s:select label="Country" name="country" headerKey="" headerValue="Select Country" key="country" list="#{'India':'India', 'USA':'USA', 'Japan':'Japan','Australia':'Australia'}"/>
<s:select label="City" name="city" headerKey="" headerValue="Select City" key="city" list="#{'Pune':'Pune', 'Mumbai':'Mumbai', 'Nasik':'Nasik','Jalgaon':'Jalgaon'}"/>
<s:submit value="Create"></s:submit>  
</s:form>
<s:form action="viewprojectmanager">
<s:submit value="View Records of Project Manager"></s:submit>
</s:form> 
<s:form action="backPM">
<s:submit value="Back"></s:submit>  
</s:form> 
</body>
</html>