<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
 
</head>
<body>
<%@ include file="CommonFile/projectHomecommonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>View!</strong> All Intern</h4>
  </div>
  
   ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th> Intern Id</th>
			<th>First Name</th>
			<th>Last name</th>
			<th>User Name</th>
			<th>Password</th>
			<th>Confirm Password</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Batch Id</th>
			<th>Group Id</th>
			<th>Action</th>
		</tr>
 </thead>
		<s:iterator value="list1">
 <tbody>
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="Ifname"/></td>
			<td><s:property value="Ilname"/></td>
			<td><s:property value="Iusername"/></td>
			<td><s:property value="Ipass"/></td>
			<td><s:property value="Icfpass"/></td>
			<td><s:property value="Iemail"/></td>
			<td><s:property value="Imob"/></td>
			<td><s:property value="Bid"/></td>
			<td><s:property value="groupId"/></td>
			<td><a href="deleteIntern.action?id=<s:property value="id"/> " class="btn btn-danger">Delete Intern</a></td>
			
		</tr>
		
</tbody>
		</s:iterator>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>
</body>
</html>