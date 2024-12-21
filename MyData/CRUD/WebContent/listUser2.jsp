<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="seed.pune.bean.UserBean2"%>
<%@ page import="seed.pune.dao.UserDao2"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User</title>
</head>
<body>
<%
	//UserBean user = new UserBean();
	UserDao2 dao = new UserDao2();
	List<UserBean2> userList = dao.getAllUsers();
	//Iterator<UserBean> itr = userList.iterator();
%>
<table border="1">
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Email</th>
		<th>DOB</th>
	</tr>
	<tr>
		<%
			/*while(itr.hasNext())
			 {
			 System.out.println(user.getId());*/
			for (UserBean2 user : userList) {
		%>
		<td><%=user.getId()%></td>
		<td><%=user.getfName()%></td>
		<td><%=user.getlName()%></td>
		<td><%=user.getDob()%></td>
		<td><a
			href="UserHandler2?action=editform&userId=<%=user.getId()%>">Update</a></td>
		<td><a
			href="UserHandler2?action=delete&userId=<%=user.getId()%>">Delete</a></td>

	</tr>
	<%
		}
		//}
	%>
</table>
<p><a href="UserHandler2?action=insert">Add User</a></p>
</body>
</html>