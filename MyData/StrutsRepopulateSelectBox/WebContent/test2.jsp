<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#batch').change(function(){
		 var id = {
                 "id": $("#batch").val()
             };
		
		$.ajax({
			url:'getGroup',
			data: JSON.stringify(id),
            dataType: 'json',
            contentType: 'application/json',
            type: 'POST',
            async: true,
			success:function(data){
				alert("success Val : "+data.groups);	
				for (var i = 0; i < data.groups.length; i++) {
                    //console.log(" " + data.groups[i]);
                    $('#group').append(
                        '<option value=' + data.groups[i] + '>' + data.groups[i] + '</option>');
                }
			},
			error:function(data){
				alert("error Val : "+data);	
			}	
		});
		
	});
	
	
});
</script>
</head>
<body>
<s:form action="">
Select Batch : <select id="batch" name="batchName">
	<option value="1">batch1</option>
	<option value="2">batch2</option>
	<option value="3">batch3</option>
	<option value="4">batch4</option>
	<option value="5">batch5</option>
</select>
	
Select Group : <select id="group" name="groupName">
	
</select>
	
	<s:submit value="Save"></s:submit>
</s:form>
</body>
</html>