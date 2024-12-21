<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.colll
{
background-color: pink;
width: 100%;
border-bottom-style: dashed;
}
</style>
</head>
<body>
<table class="colll" >

	<tr>
		<th>Bill_id</th>
		<th>Patient_Name</th>
		<th>Treatment</th>
		<th>Ref By Doctor</th>
		<th>Medical_Id</th>
		<th>Price</th>
		<th>Quentity</th>
		<th>Gender</th>
		<th>City</th>
		<th>Admit Date</th>
		<th>Discharge Date</th>
		
	</tr>

<s:iterator value="bill">
	<tr>
		<td><s:property value="Bid"/></td>
		<td> <s:property value="Bname"/></td>
		<td><s:property value="treatment"/></td>
		<td> <s:property value="Rdoc"/></td>
		<td> <s:property value="mdc"/></td>
		<td><s:property value="price"/></td>
		<td><s:property value="qunt"/></td>
		<td><s:property value="Bgender"/></td>
		<td><s:property value="Bcity"/></td>
		<td><s:property value="Badmit"/></td>
		<td><s:property value="Bdischarge"/></td>
	</tr>
	</s:iterator>
</table> 
</body>
</html>