<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC ">
<%@ page import="seed.pune.bean.UserBean"%>
<%@ page import="seed.pune.dao.UserDao"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<%
	UserBean user = new UserBean();
%>
<%
	UserDao dao = new UserDao();
%>
<form method="POST" action='UserHandler' name="frmEditUser"><input
	type="hidden" name="action" value="edit" /> <%
 	String uid = request.getParameter("userId");
 	if (!((uid) == null)) {
 		int id = Integer.parseInt(uid);
 		user = dao.getUserById(id);
 %>
<table>
	<tr>
		<td>User ID</td>
		<td><input type="text" name="userId" readonly="readonly"
			value="<%=user.getId()%>"></td>
	</tr>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="firstName" value="<%=user.getfName()%>"/></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="lastName" value="<%=user.getlName()%>"/></td>
	</tr>
	
	<tr>
		<td>Mobile</td>
		<td><input type="tel" name="tel" value="<%=user.getTel()%>"/></td>
	</tr>
	
	
	
	
	<tr>
		<td>Email</td>
		<td><input type="text" name="email"  value="<%=user.getEmail()%>"/></td>
	</tr>
	
	
	
	<tr>
	<td>Number Of Room</td>
 	<td><select  name="numberofrooms" value="<%=user.getNumberofrooms()%>">
	<option value=>Select Room</option>
  <option value="01">01</option>
  <option value="02">02</option>
  <option value="03">03</option>
  <option value="04">04</option>
  <option value="05">05</option>
  <option value="06">10</option>
  <option value="07">15</option>
  <option value="08">20</option>
  <option value="09">25</option>
  <option value="10">30</option>
  </select></td>
	</tr>
	
	
	
			<tr>
               <td >Two Member</td>
               <td>
                  <select name="twomember" value="<%=user.getTwomember()%>">
                     <option value="-1" selected>Twomember</option>
                     <option value="1">01</option>
                     <option value="2">02</option>
                     <option value="3">03</option>
                  </select>
               </td>
            </tr>
	
	
	
	
	
	
	
	
	
	
	<tr>
	
	<td> Three Member</td>
 <td><select  name="threemember" value="<%=user.getThreemember()%>">
	<option value=1>threemember</option>
  <option value="01">01</option>
  <option value="02">02</option>
  <option value="03">03</option>
  <option value="04">04</option>
  <option value="05">05</option>
  </select></td>
	</tr>
	
	
	
	
	<tr>
	
	<td>Mess</td>
 	<td><select  name="check1" value="<%=user.getCheck1() %>">
	<option value=1>Select</option>
  `<option value="01">Yes</option>
  `<option value="02">No</option>
 ``</select></td>
	</tr>
	

	
	
	<tr>	
		<td> Library &nbsp;</td>
  <td><input type="checkbox" name="check2" value="<%=user.getCheck2() %>"></td>
	</tr>
	
	
		<tr>
		<td>Jim &nbsp;</td>
  <td><input type="checkbox" name="check3" value="<%=user.getCheck3() %>"></td>
	</tr>
	
	
	
	
	
	
	
	
	
	
	
	<tr>
		<td></td>
		<td><input type="submit" value="Update" /></td>
	</tr>
</table>
<%
	} else
		out.println("ID Not Found");
%>
</form>
</body>
</html>