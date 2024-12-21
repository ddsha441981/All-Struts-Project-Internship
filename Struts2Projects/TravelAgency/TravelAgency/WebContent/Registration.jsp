<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="/struts-tags" prefix="s" %>

</head>
<body>
<hr>
<b style="color: red;color: red;">User Driven Registration-New User</b>
<hr>

<br/>
<s:form action="reg">
<s:textfield label="UserName*" name="user1" id="username"/>
<s:password label="Password*" name="pass" id="password"/>
<s:password label="Confirm-Password*" name="cpass" id="cpassword"/>
<s:textfield label="First Name*" name="fname" id="firstname"></s:textfield>
<s:textfield label="Last Name*" name="lname" id="lasttname"></s:textfield>
<s:radio name="gender" label="Gender" list="{'Male','Female'}" value="Male"  ></s:radio>
<s:textfield label="Date of Birth" name="date1"></s:textfield>

<s:doubleselect name="state"
label="State And City"
list="{'Maharashtra','Karnataka','Goa','Telangana','MadhyaPradesh','Gujrat'}"
doubleName="city"
doubleList="top == 'Maharashtra'?{'Pune','Kolhapur','Mumbai','Nagpur'} :top=='Karnataka'?{'Belgaon','Banglore','Mysore','Hoobli'}:top== 'Goa'?{'Panjim','Mapusa','Candolim','Querim'}:top=='Telangana'?{'Hyderabad','Nizambad','Adilabad','Sikandarabad'}:top=='MadhyaPradesh'?{'Indore','Bhopal','Ujjain','Jabalpur'}:{'Ahemdabad','Surat','Rajkot','Baroda'}"> </s:doubleselect>



<s:submit value="Register"></s:submit>
</s:form>
</body>
</html>