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

<h1>Exam Questions</h1>
<s:form action="add_que">
<s:textfield name="ex_id" label="Exam ID"></s:textfield>  
<s:textfield name="question" label="Add Questions"></s:textfield>  
<s:textfield name="option_1" label="A"></s:textfield>
<s:textfield name="option_2" label="B"></s:textfield>
<s:textfield name="option_3" label="C"></s:textfield>
<s:textfield name="option_4" label="D"></s:textfield>
<s:textfield name="answer" label="Correct Answer"></s:textfield>
<s:textfield name="question_marks" label="Marks"></s:textfield>  
<s:submit value="Add"></s:submit>  
</s:form> 

</body>
</html>