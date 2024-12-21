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
<%@ include file="commonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>View!</strong> All Contact.</h4>
  </div>
  
  ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Mobile</th>
			<th>Email</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
 </thead>
		<s:iterator value="list">
 <tbody>
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="Name"/></td>
			<td><s:property value="Mobile"/></td>
			<td><s:property value="Email"/></td>
			<td><a href="UpdateByid?id=<s:property value="id"/> " class="btn btn-success">Update Contact</a></td>
			<td><a href="deleteByid?id=<s:property value="id"/> " class="btn btn-danger">Delete Contact</a></td>
		</tr>
</tbody>
</s:iterator>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>
</body>
</html>