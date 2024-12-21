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
		$("#addQue").click(function(){
			$("#queDiv").toggle();
		});
	});
</script>
</head>
<body>
<h1><center>View All Questions</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightgreen">
<tr>
<th>Exam ID</th>
<th>Question ID</th>
<th>Questions</th> 
</tr>
<s:iterator value="exam.questions">

<tr>
<td><s:property value="exam.exam_id"/></td>
<td><s:property value="question_id"/></td>
<td><s:property value="question"/></td>
</tr>
</s:iterator>
</table>
<a id="addQue" href="#"> Add Question </a>
<div id="queDiv" style="display: none;">
<s:form action="add_que">
<input type="hidden" name="ex_id" value="${param.exam_id}">
<input type="hidden" name="queCount" value="${requestScope.exam.questions.size()}">
<input type="hidden" name="maxCount" value="10">

<%-- <s:textfield name="ex_id" label="Exam ID"></s:textfield> --%>  
<s:textfield name="question" label="Add Questions"></s:textfield>  
<s:textfield name="option_1" label="A"></s:textfield>
<s:textfield name="option_2" label="B"></s:textfield>
<s:textfield name="option_3" label="C"></s:textfield>
<s:textfield name="option_4" label="D"></s:textfield>
<s:textfield name="answer" label="Correct Answer"></s:textfield>
<s:textfield name="question_marks" label="Marks"></s:textfield>  
<s:submit value="Add"></s:submit>  
</s:form> 
</div>
</body>
</html>