<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%request.getSession();
String n=(String)session.getAttribute("uname");
	System.out.println(n);%>
</head>
<body>

	<div>
		<%Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11", "java",
				"java");
PreparedStatement ps=conn.prepareStatement("select * from reg where uname='"+n+"'");
		System.out.println("after conn");
		ResultSet rs=ps.executeQuery();
		System.out.println("user"+n);

		while(rs.next())
		{   %>	
		UserName:<input type="text" value="<%=rs.getString("uname") %>"/>	
		
	 <% String u=rs.getString("uname");
	 System.out.println("user edit"+u);

	 %>
	 <s:form action="update">
	 <%
	 PreparedStatement ps1=conn.prepareStatement("update reg set uname='"+u+"' where uname='"+n+"'");
	ps.executeUpdate();%>
	<s:submit value="save"></s:submit>
	</s:form>
	<%	}
%>

	</div>

</body>
</html>