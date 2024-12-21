<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script type="text/javascript">
	$(document).ready(function(){
		//alert("Hello This is Page loding notification");
		$(".changeStatus").click(function(){
			var id=$(this).attr("id");
			var status=$(this).attr("href");
			var s="";
			if(status==='#disable'){
				s="enable";
				$(this).text("enable");
				$(this).attr("href", "#enable");
			}	
			else{
				s="disable";
				$(this).text("disable");
				$(this).attr("href", "#disable");
			}
			$.ajax({
				url:'redirectToViewExam.action?id='+id+'&status='+s,
				type:'get'
			});
// 			if(status==='#disable'){
// 				$(this).text("enable");
// 				$(this).attr("href", "#enable");
// 			}	
// 			else{
// 				$(this).text("disable");
// 				$(this).attr("href", "#disable");
// 			}
		});
		$("#addQue").click(function(){
			$("#queDiv").toggle();
		});
	});
</script>
</head>
<body>
<h3><a href="CreateExam.jsp">Create New Exam</a></h3>
<h3><a href="<s:url action="logoutProjectManager"/>">Logout</a></h3>

<h1><center>View All Exams</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightgreen">
<tr>
<th>Exam ID</th>
<th>Exam Title</th>
<th>Created Date</th>
<th>Total Marks</th>
<th>Status</th>
<th>Questions</th> 
</tr>
<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="exam_id"/></td>
<td><s:property value="exam_title"/></td>
<td><s:property value="created_date"/></td>
<td><s:property value="total_marks"/></td>
<td><a class="changeStatus" id="<s:property value='exam_id'/>" href="#<s:property value="status"/>"><s:property value="status"/></a></td>
<td><a class="AddQue" href="view_que.action?exam_id=<s:property value="exam_id"/>">Add Question</a></td>
</tr>
</fieldset>
</s:iterator>
</table>
<!-- <a id="addQue" href="#"> Add Question </a> -->
<!-- 		<div id="queDiv" style="display: none;"> -->
<%-- <s:form action="add_que"> --%>
<%-- <s:textfield name="ex_id" label="Exam ID"></s:textfield>   --%>
<%-- <s:textfield name="question" label="Add Questions"></s:textfield>   --%>
<%-- <s:textfield name="option_1" label="A"></s:textfield> --%>
<%-- <s:textfield name="option_2" label="B"></s:textfield> --%>
<%-- <s:textfield name="option_3" label="C"></s:textfield> --%>
<%-- <s:textfield name="option_4" label="D"></s:textfield> --%>
<%-- <s:textfield name="answer" label="Correct Answer"></s:textfield> --%>
<%-- <s:textfield name="question_marks" label="Marks"></s:textfield>   --%>
<%-- <s:submit value="Add"></s:submit>   --%>
<%-- </s:form>  --%>
<!-- </div> -->
</body>
</html>