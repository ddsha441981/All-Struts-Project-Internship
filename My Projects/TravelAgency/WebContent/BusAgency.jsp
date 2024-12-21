<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="/struts-tags" prefix="s" %>
</head>
<body>
in bus agency
<s:property value="destination"/>

<%
String str=(String)session.getAttribute("source");

String str2=(String)session.getAttribute("destination");
out.write(str);
out.write(str2);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11","java","java");
String query="select * from volvobus where source='"+str+"'";
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{
	%>
	<%=rs.getString("destination")%>
	<%
}
%>
<%
rs.close();
stmt.close();
conn.close();
%>


</body>
</html>