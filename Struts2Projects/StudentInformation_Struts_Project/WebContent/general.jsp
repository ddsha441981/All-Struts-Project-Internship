<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="gdata" method="post">

<s:combobox name="plateform" label="Select Your PlateForm" list="{'Windows','Linux','Unix'}" headerKey="-1" headerValue="------Select PlateForm------"/>
<%-- <s:optiontransferselect name="serverlist" label="Select Servers" 
						list="#{'TomCat 7.0','WebLogic 8.1','JBoss 5.0','JRunner','Sun Server'}" size="5" 
						doubleList="{}" doubleSize="5" doubleName="servers" leftTitle="List of Servers" rightTitle="Your Servers"
						allowUpDownOnLeft="false" allowUpDownOnRight="false" allowSelectAll="false" allowAddAllToLeft="false"
						addToRightLabel="'>>'" addAllToRightLabel="'<<'" /> --%>

<s:select label="Select Language"  name="language" list="%{#{'C':'C','C++':'C++'} }">
			<s:optgroup label="Java" list="#{'Core Java':'Core Java','Groovy':'Groovy' }" />
			<s:optgroup label=".NET" list="#{'C#':'C#','VB':'VB' }"/>
</s:select>

<s:updownselect label="Technology" labelposition="top" list="#{'Servlet':'Servlet','JSP':'JSP','Struts':'Struts'}"
				name="tech" headerKey="-1" headerValue="......Select......" moveDownLabel="Down" moveUpLabel="Up"
				selectAllLabel="All"/>
				
<s:file name="ff" label="Select File"></s:file>
<s:submit></s:submit>
<s:a href="Home.jsp">Back</s:a>
</s:form>
</body>
</html>