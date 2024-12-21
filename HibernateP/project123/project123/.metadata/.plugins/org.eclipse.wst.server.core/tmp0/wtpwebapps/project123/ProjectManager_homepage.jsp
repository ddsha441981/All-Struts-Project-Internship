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
<h1><center>Welcome Project Manager--<s:property value="#session.uname"/></center></h1>
<%-- <%@ include  file="heder.jsp" %> --%>

<h3><a href="ChangePassPM.jsp">Change Password-PM</a></h3>

<h3><a href="batch.jsp">Add New Batch</a></h3>

<h3><a href="intern.jsp">Add New Intern</a></h3>

<h3><a href="create_Group.jsp">Create New Group</a></h3>

<h3><a href="create_GroupLeader.jsp">Create Group Leader</a></h3>

<h3><a href="add_projects.jsp">Add New Projects</a></h3>

<h3><a href="view_exam.action">Manage Exam</a></h3>

<h3><a href="resumeList.action">View Interns Resume</a></h3>

<h3><a href="view_feedback.action">View All Feedback</a></h3>

<h3><a href="view_list.action">View Interns Leave</a></h3>

<h3><a href="ResultView.action">View Interns Results</a></h3>

<s:form action="logoutProjectManager">
<s:submit value="Logout"></s:submit>
</s:form>

</body>
</html>