<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="2" style="width:50%">

<tr>
<th>Name</th>
<th>Comments</th>
<th>Email</th>
</tr>

<tr>
<s:iterator value="list">
<td><center><s:property value="fulname"/></center></td>
<td><center><s:property value="email"/></center></td>
<td><center><s:property value="comments"/></center><br><br></td>
<%-- <s:iterator value="hello">

<td><center><s:property value="#request.fulName"/></center></td>
<td><center><s:property value="#request.email"/></center></td>
<td><center><s:property value="#request.comments"/></center></td> --%>
</s:iterator>
</tr>

</table>
</body>
</html>