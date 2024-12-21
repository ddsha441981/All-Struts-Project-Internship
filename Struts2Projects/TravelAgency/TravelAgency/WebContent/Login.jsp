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
<h4>Login To AVY Tourism</h4>
<hr>
<h5>(<b style="color: red;color: red;">Care :</b> UserName And Password are Case Sensitive)</h5>
<s:form action="login">
<table>

<tr>
<td>User Name: <b style="color: red;color: red;">*</b></td>
<td><s:textfield name="username" id="username"/></td>
</tr>


<tr>
<td>Password: <b style="color: red;color: red;">*</b> </td>
<td><s:password name="pass" id="password"/></td>
</tr>

<tr>
<td></td>
 <td align="left"><input type="submit" value="Login"/>
 <input type="reset" value="Clear" />
 </td>
</tr>

</table>

</s:form>
</body>
<br><br>
<s:a href="Registration.jsp">New User ? Register Here</s:a><br>

<br><br>
<h5>
<b style="color: red;color: red;">Note :</b><br>

1.Mandatory Fields are marked an Asterisk(*)<br>
2.Do Not Provide Your UserName And Password Other Than This Page<br>
3.Your UserName And Password Are Highly Confidential. Do Not Share.
 </h5>
</html>