<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>File Upload</title>
</head>
<body>
   <s:form action="upload" method="post" enctype="multipart/form-data">
   <s:file label="Upload your file" name="myFile"></s:file>
   <s:submit value="Upload"></s:submit>
   </s:form>
</body>
</html>