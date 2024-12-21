<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List Of Downloading Files</h1>

<s:url id="fileDownload" namespace="/" action="download"></s:url>
<%-- <h2>
Download file- <s:a href="download.action">File</s:a>
</h2> --%>
<%-- <% --%>

<!-- // File f=null; -->
<!-- // String[] paths; -->
<!-- // try{ -->
<!-- // 	f= new File("E:\\PriteshGajare\\project123\\WebContent\\SaveFile"); -->
<!-- // 	paths=f.list(); -->
<!--  	//for(String path:paths) -->
<!--  	//{ -->
<%-- 		%> --%>
<s:iterator value="list3">
		<h2>
			Download file- <a href="download.action?filename=<s:property/>"><s:property/> </a>
		</h2>
</s:iterator>
<%-- 		<%  --%>
<%-- // 		//out.println("<s:a href='download.action'>File</s:a>"); --%>
<!-- //} -->
<!-- // }catch(Exception e){ -->
<!-- // 	e.printStackTrace(); -->
<!-- // } -->

<%-- %> --%>
</body>
</html>