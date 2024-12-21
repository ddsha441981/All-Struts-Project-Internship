<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="seed.pune.bean.UserBean"%>
<%@ page import="seed.pune.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User</title>
</head>
<body>
<%
	//UserBean user = new UserBean();
	UserDao dao = new UserDao();
	List<UserBean> userList = dao.getAllUsers();
	//Iterator<UserBean> itr = userList.iterator();
%>
<table border="1">
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Mobile</th>
		<th>Email</th>
		<th>Number of Rooms</th>
		<th>Two Member</th>
		<th>Three Member</th>
		<th>Mess</th>
		<th>Library</th>
		<th>Jim</th>
	</tr>
	<tr>
		<%
			/*while(itr.hasNext())
			 {
			 System.out.println(user.getId());*/
			for (UserBean user : userList) {
		%>
		<td><%=user.getId()%></td>
		<td><%=user.getfName()%></td>
		<td><%=user.getlName()%></td>
		<td><%=user.getTel() %></td>
		<td><%=user.getEmail() %></td>
		<td><%=user.getNumberofrooms() %></td>
		<td><%=user.getTwomember() %></td>
		<td><%=user.getThreemember() %></td>
		<td><%=user.getCheck1() %></td>
		<td><%=user.getCheck2() %></td>
		<td><%=user.getCheck3() %></td>
		
		
		<td>
	
		<a href="UserHandler?action=editform&userId=<%=user.getId()%>">Update</a>
		<td><a href="UserHandler?action=delete&userId=<%=user.getId()%>">Delete</a></td>

	</tr>
	<%
		}
		//}
	%>
</table>
<p><a href="UserHandler?action=insert">Add User</a></p>
</body>
</html>