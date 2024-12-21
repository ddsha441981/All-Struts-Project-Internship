<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-2.0.3.js"></script>
<script type="text/javascript" src="js/jquery.countdownTimer.js"></script>
<link rel="stylesheet" type="text/css" href="CSS/jquery.countdownTimer.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

//code for Reverse Timer For exam Using Jquery
$(function(){
	$("#hm_timer").countdowntimer({
//                 hours : "3",
		minutes : "1",
                size : "lg"
	});
});
//Ends


//Jquery code submit page after time out
$(function() {
	  setTimeout(function() {
	   $('#my_form').submit();
	  }, 60000);
	});
//Ends


// Code For Disable Right Click on web page With jQuery
$(document).on({
    "contextmenu": function(e) {
        console.log("ctx menu button:", e.which); 

        // Stop the context menu
        e.preventDefault();
    },
    "mousedown": function(e) { 
        console.log("normal mouse down:", e.which); 
    },
    "mouseup": function(e) { 
        console.log("normal mouse up:", e.which); 
    }
});
//Ends

//Restrict F5 
function disableF5(e) { if ((e.which || e.keyCode) == 116) e.preventDefault(); };
$(document).bind("keydown", disableF5);
//ends


  //Restrict Back and Refresh on webpage 
     window.onbeforeunload = function(){
       event.returnValue = false;
       event.keyCode = 0;
       window.status = "We have disabled F5";
    };
 //Ends

 
</script>
</head>
<body>
<div id="countdowntimer"><span id="hm_timer"><span></div>
<h1><center>Exam Questions</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightblue">
<tr>
<th>Exam ID</th>
<th>Exam Title</th>
<th>Total Marks</th> 
</tr>
<s:iterator value="exam">

<tr>
<td><s:property value="exam.exam_id"/></td>
<td><s:property value="exam.exam_title"/></td>
<td><s:property value="exam.total_marks"/></td>
</tr>
</s:iterator>
</table>

 <!-- new code to display questions starts Using JSTL -->
 <s:form id="my_form" action="FinishTest">

<core:forEach items="${requestScope.exam.questions}" var="que">
<fieldset>
${que.question}<br>
<input type="radio" name="ans${que.question_id}" value="${que.option_1}">${que.option_1}<br/>
<input type="radio" name="ans${que.question_id}" value="${que.option_2}">${que.option_2}<br/>
<input type="radio" name="ans${que.question_id}" value="${que.option_3}">${que.option_3}<br/>
<input type="radio" name="ans${que.question_id}" value="${que.option_4}">${que.option_4}<br/>
<input type="hidden" name="q_id" value="${que.question_id}">
<input type="hidden" name="c_ans${que.question_id}" value="${que.answer}">
 <input type="hidden" name="e_id" value="${que.exam_id.exam_id}">
 <input type="hidden" name="e_title" value="${que.exam_id.exam_title}">
 <input type="hidden" name="e_marks" value="${que.exam_id.total_marks}">
</fieldset>
</core:forEach>
<center><s:submit value="Finish Test"></s:submit> </center>
</s:form>
<!-- new code to display questions ends--> 

</body>
</html>