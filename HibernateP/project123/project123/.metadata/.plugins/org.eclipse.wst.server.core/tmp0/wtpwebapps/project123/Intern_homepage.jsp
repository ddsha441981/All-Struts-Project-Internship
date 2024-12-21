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
<h1><center>Welcome Intern--<s:property value="#session.uname"/></center></h1>

<h3><a href="ChangePassIntern.jsp">Change Password-Intern</a></h3>

<h3><a href="view_task1.action">View Task</a></h3>

<h3><a href="view_project_plan.jsp">View Project Plan</a></h3>

<h3><a href="task_status.jsp">Own Task Status</a></h3>

<h3><a href="Leaves.jsp">Leaves</a></h3>

<h3><a href="view_exam_by_intern.action">Give Online Exam</a></h3>

<h3><a href="Give_feedback.jsp">Give Feedback</a></h3>

<h3><a href="add_GD_Topics.jsp">Add GD Topics</a></h3>

<h3><a href="UploadResume.jsp">Upload Resume</a></h3>



<s:form action="logoutIntern">
<s:submit value="Logout"></s:submit>
</s:form>

</body>
</html>