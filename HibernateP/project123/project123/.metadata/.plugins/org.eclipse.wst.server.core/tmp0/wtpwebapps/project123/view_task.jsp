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
		
		$(".changeTaskStatus").click(function(){
			var id=$(this).attr("id");
			var status=$(this).attr("href");
			var s="";
			//alert(id+" - "+status); 
			if(status==='#Pending'){ 
 				s="Completed"; 
				$(this).text("Completed");
			$(this).attr("href", "#Completed");
			}	
			else{
				s="Pending";
				$(this).text("Pending");
				$(this).attr("href", "#Pending");
 			} 
 			$.ajax({ 
 				url:'redirectToViewStatusTask.action?id='+id+'&status='+s,
 				type:'get'
 			}); 
 		}); 
 	}); 
 </script> 
</head>
<body>

<h1><center>View All Task</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightgreen">
<tr>
<th>Intern ID</th>
<th>Task ID</th>
<th>Actual Task</th>
<th>Start Date</th>
<th>End Date</th>
<th>Status</th> 
</tr>
<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="intern_id"/></td>
<td><s:property value="task_id"/></td>
<td><s:property value="actual_task"/></td>
<td><s:property value="start_date"/></td>
<td><s:property value="end_date"/></td>
<td><a class="changeTaskStatus" id="<s:property value='intern_id'/>" href="#<s:property value="status"/>"><s:property value="status"/></a></td>
</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>