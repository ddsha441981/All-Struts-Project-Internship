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
		$(".changeLeaveStatus").click(function(){
			var id=$(this).attr("id");
			var status=$(this).attr("href");
			var s="";
			//alert(id+" - "+status);
			if(status==='#Pending'){
				s="Approval";
				$(this).text("Approval");
				$(this).attr("href", "#Approval");
			}	
			else{
				s="Pending";
				$(this).text("Pending");
				$(this).attr("href", "#Pending");
			}
			$.ajax({
				url:'redirectToViewStatusLeave.action?id='+id+'&status='+s,
				type:'get'
			});
		});
	});
</script>
</head>
<body>
<h1><center>View Leaves Application</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightblue">
<tr>
<th>Leave Id</th>
<th>Reason</th>
<th>To</th>
<th>From</th>
<th>Status</th>
<th>Leave Type</th> 
</tr>
<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="leave_id"/></td>
<td><s:property value="reason"/></td>
<td><s:property value="to_date"/></td>
<td><s:property value="from_date"/></td>
<td><a class="changeLeaveStatus" id="<s:property value='leave_id'/>" href="#<s:property value="status"/>"><s:property value="status"/></a></td>
<td><s:property value="leave"/></td>
</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>