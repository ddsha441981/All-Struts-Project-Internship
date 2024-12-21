<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-select.css">

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-select.js"></script>

</head>
<body>
	<%@ include file="commonfile.jsp"%>
	<form action="searchbykeyword">
		<div class="container">
			<div class="form-group">
				<select id="first-disabled" class="selectpicker"
					data-hide-disabled="true" data-live-search="true"
					name="selectoption">
					<optgroup disabled="disabled" label="disabled">
						<option>Hidden</option>
					</optgroup>
					<optgroup label="Select  Option">
						<option>Select Search Option</option>
					</optgroup>
					<optgroup label="Search By Name">
						<option>Name</option>

					</optgroup>
					<optgroup label="Search By Mobile Number">
						<option>Mobile</option>
					</optgroup>
				</select> <br> <br> <label for="search">Enter Search
					Keyword:</label> <input type="text" class="form-control" name="searchBy"
					placeholder="Enter Search KeyWord">
			</div>

			<button type="submit" class="btn btn-info">
				<span class="glyphicon glyphicon-search"></span> Search
			</button>

		</div>
	</form>
	<br>
	<br> ${requestScope.msg}
	<!-- For Massage -->
	<div class="container">
		<table class="table table-hover">
			<!--  <thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Mobile</th>
			<th>Email</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
 </thead> -->
			<s:iterator value="list">
				<tbody>
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="Name" /></td>
						<td><s:property value="Mobile" /></td>
						<td><s:property value="Email" /></td>
					</tr>
				</tbody>
			</s:iterator>
		</table>
	</div>

</body>
</html>