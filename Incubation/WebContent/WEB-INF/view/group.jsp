<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<style type="text/css">
.error {
	color: #b20000;
}

.col-lg-2 {
	color: black;
}

.col-lg-5 {
	color: green;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>group information</title>
<link href="assets/css/groupinfo.css" rel="stylesheet">
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="assets/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="assets/js/jquery-ui.js"></script>
<script src="assets/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="assets/js/registration.js"></script>
<script src="assets/js/jquery.dataTables.min.js"></script>
<script src="assets/css/jquery.dataTables.min.css"></script>
<script type="text/javascript" src="assets/js/AddGroupvalidation.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
	 	$('#grouptable').DataTable();
	
	 	$("#addGroup").on("click", function() {
	 alert("Inside popup");

	 		 $("#addgroupdiv").show(500);
		});
	 	
	 	
/*  -------------   close of edit popup----------------------------	 */
	$('.close').click(function() {
			document.getElementById('edit').style.display = "none";
		});
	
	
	
	/* ---------close of the save popup---------------------------  */
	
	$('.close').click(function() {
			document.getElementById('addgroupdiv').style.display = "none";
		});
	 
	
		

		$('#selectbatch').change(function(event) {
	
	var batchId = $('#selectbatch :selected').attr("value");
							var name=$("#selectbatch").val();
							alert(name);
	$.ajax({
		url : "selectbatch?b_id="+ batchId,
				
				success : function(data) {
						$('#selectintern').find('option').remove();
											//alert(data);
				if (data === '') {
				
					$(	'#selectintern').append('<option value="0" >Select Intern Name..</option>');
					} 
				
				else {
					
					$('#selectintern').append(data);
					}
					},
				error : function(data) {
				
				}
	});
});
	
	});
	
/*-----------	ajax call for  edit group -------------------------------------------------*/
 
  $(document).ready(function() {
 
 $("#grouptable").on("click", '.editGroup',function() {

	 $("#edit").show(500);
		 	var tr=$(this).closest('tr');
		 	var g_id=tr.find("td").eq(0).text();
		    var gname=tr.find("td").eq(1).text();
		    var bname=tr.find("td").eq(2).text();
		   /* var iname=tr.find("td").eq(3).text(); */
		    var gdate= tr.find("td").eq(3).text();
		    var stts=tr.find("td").eq(4).text(); 
		  
		 	
		     $("#g_id").val(g_id);
		    $("#grpname").val(gname);
		    $("#batchname").val(bname); 
		   // $("#intrname").val(iname);
		    $("#grpdate").val(gdate);
		   $("#gstatus").val(stts);
		    
		 	alert(iname);
		});
	
	 
 });
	 
/* ------------------- edit group div end  --------------------------------------------------- */

  	
//ajax call for the update group

  $(document).ready(function(){
		 
	  $("#edit").on("click","#updateGroup",function(e){
	  	e.preventDefault();
	  	alert("Inside Update");
	    	   var g_id=$("#g_id").val();
	    	    alert(g_id);
	          $.ajax({ 
	          	url :'updategrp?g_id='+g_id,
	          	type:'POST',
	  			data:{
	  				'g_id':$("#g_id").val(),
	  				'g_name':$("#grpname").val(),
	  				'g_startdate':$("#grpdate").val(),
	  				'g_status':$("#gstatus").val()
	  	     },
	          success : function(data){
	        	  
	       //alert("success");   	
	       
	       if(data=="error")
	  	 {
	    	   alert("Inside the already exist group"); 
	    	   $('#existsGroup').html("Group Name Already Exists").fadeIn('slow');
	    }
	          	 else
	          		 {
	          		 
	          		alert(" Ajax call for Data for updation");
	          		var currentTdSelector = "td:contains('"+ g_id + "')";
	        	  	alert(currentTdSelector);
	        	  	
	        	  	$currentRow = $(currentTdSelector).closest("tr");
	        	  	$currentRow.find("td:nth-child(2)").text($("#grpname").val());
	        	  	$currentRow.find("td:nth-child(4)").text($("#grpdate").val()); 
	        		 $currentRow.find("td:nth-child(5)").text($("#gstatus").val()); 
	        	  	 $('#edit').css("display" , "none");
	          		$('#updateGrp').text("Group Updated Successfully.....!!!!").fadeIn('slow');
	          		
	          			 }
	          		 },
	     			error : function(){
	  			}
	         });    
	  	 });  
	    }); 	
  	
/* -------------------------------------------------------------------------------------*/ 	
  	
  	
  	
  	
  	
  	
	
	
	//  ajax call  for save button
	
	
	/*  ----------------save group------------------------------- */
	
		 $(document).ready(function() {
			 
			 
				$("#addgroupdiv").on("click","#save",function(e){
					
					e.preventDefault();
					 $("#save").show(500);
					
				if(AddGrpvalidation()== true){
					
					var D=$("#g_startdate").val();
					var gname=$("#g_name").val();
					alert(D+"\n"+gname);
						  var interns=""; 
						$('#selectintern :selected').each(function(i, selected){ 
							interns+=","+ $(selected).attr("value"); 
						});
                   $.ajax({
						
						url:'NewGroup',
						type:'get',
						  data:{
							  'g_name':$("#g_name").val(),
							  'g_startdate':$("#g_startdate").val(),
						      'g_status':$("#g_status").val(),
						      'b_id':$('#selectbatch :selected').attr("value"),
						      'intern_id':interns
							
						},
					 
						success:function(data)
						 {
							alert("success");
							
							 $('#add').css("display" , "none");
							 
								$("#tbodyView").append
								("<tr><td></td><td>"+$("#g_name").val()+"</td><td>"+$("#selectbatch").val()+
								"</td><td>"+$("#g_startdate").val()+
								"</td><td>"
								+"enable"+
								"</td><td><a class='editGroup' href='#'>Edit</a></td><td><a class='deleteGroup' href='#'>Delete</a></td></tr>")
							
			        		
			        		 $('#saveGrp').html("Group Added Successfully.....!!!!").fadeIn('slow');
							
			        		 
			        		 },
			        	error: function()
			        		 {
			        		alert("error");
			        		 
			        		 }
					});
				}
			
				
					
				});
		});
	 
//	---------- end of save ajax call ----------
 
 
 /*        delete Group ajax call        */
 
    $(document).ready(function() {
 
	$('.deleteGroup').click(function(){
		
							var g_id=$(this).attr("id");
							alert("in delete"+g_id);
							if(confirm("Are You sure to delete Group")){
								
								 $.ajax({
									url:"deleteGroup?g_id="+g_id,
									
									
									success : function(data){
										alert("success");
										if(data =="delete")
											{
											alert("if");
											 $('#Delete').html("Group is Deleted").fadeIn('slow');
											}
										
								},
									error : function(data){
										{
											alert("error in delete group");
											 $('#Delete').html("Unable to delete Group ").fadeIn('slow');
											
										}
									}
								});
								$(this).closest('tr').remove();
							}
							return false; 
							
								});
    });
		
		
		
   /*  $(document).ready(function() {
    	
    	
    	//START - display interns list of group
		$('.viewInternOfGroup').click(function(){
			var g_id=$(this).attr("id");
			$("#tBodyShowInterns").empty();
			viewInternOfGroup(g_id);
		});
		//END - display interns list of group
		});
     */
    	
		
    
 /*   ---------------ajax call for list------------  */
 
    $(document).ready(function() {
	   $('#tbodyView').on("click",'.editGroup',function(e){
		  
		  alert("In edit Ajax call of the list")
			var g_id=$(this).attr("id");
		  alert(g_id);
		  
		/* 	$("#tBodyShowInterns").empty();
			viewInternOfGroup(g_id); */
			
			$.ajax({
				url:'editgroup?g_id='+g_id,
				type:'POST',
	        	success : function(data){
	        		$("#edit").show(500);
	        		$("#tBodyShowInternsEdit").append(data);
						
			},
			});
	   });
	   });
		//END - display interns list of group
		
	  
 
   
 
 

		
	
</script>


<!-- <script>
function myFunction() {
    var x = document.getElementById('addgroupdiv');
    if (x.style.display === 'none') {
        x.style.display = 'block';
    } else {
        x.style.display = 'none';
    }
}
</script> -->



</head>
<body>
<jsp:include page="header.jsp" /><br><br><br><br>
<h6 align="center" id="Delete" style="display:none; color:blue;"></h6>
<h5 align="center" id="existsGroup" style="display: none;color:red;"></h5>
<h4 align="center" id="saveGrp" style="display: none;color:green;"></h4>
<div align="center" id="updateGrp"  style="display:none; color:green;">Test</div>
 <button type="button" id="addGroup" class="btn btn-info" onclick="myFunction()">Add Group</button>
 
<!--  -----------------------------save div---------------------------- -->
 <div id="addgroupdiv" class="modal" >  <% /**  to hide the div we use the style="display: none;" */ %>
 
  <form:form   action="#" modelAttribute="groupBean" > 
  <div class="modal-content">
			<span class="close">&times;</span>

			<%-- <form:form  modelAttribute="groupBean"> --%>
			<div class="row" style="padding-left: 20px; padding-right: 300px;">
				<br>

				<div class="panel  panel-success"
					style="width: 350px; padding: 20px">
					<div class="panel-heading"
						style="font: oblique; color: purple; font-family: monospace;">
						<h3 class="panel-title">Create New Group for Interns </h3>
					</div>

					<div class="panel-body">
					
					
				<div class="form-group">
	<!--  <label for="g_name">Group Id:</label> -->
	<div class="col-xs-15">
	<div class="input-group">		
  	<!-- <span class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   "></span> -->
    <input type="hidden" name="g_id"  class="form-control"  id="g_id"  style="font-family:cursive; "/>

	</div>
    </div>
</div>	
					
<div class="form-group">
	<!--  <label for="g_name">Group Name:</label> -->
	<div class="col-xs-10"> <span id="err_name" style="color:red; "></span>	
	<div class="input-group">		
  	<h1 class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   ">Group Name:</h1><h4 align="center" id="existsGroup" style="display: none;color:red"></h4>
   					
  	 <form:input type="text" path="g_name"  class="form-control"  id="g_name"  style="font-family:cursive; "/>

	</div>
    </div>
</div>
<br>
<br>
<br>
					
	
<div class="form-group">
	<!--  <label for="b_name">Batch Name:</label> -->
	<div class="col-xs-10"><span id="b_error" style="color: red; "></span>
	<div class="input-group">		
  	<h1 class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   ">Batch Name:</h1>
  	
    <%-- <form:select type="text" path="b_name"  class="form-control"  id="b_name"  style="font-family:cursive; "> --%>
    <form:select path="b_name" id="selectbatch">
    <!-- <select id="selectbatch" name="b_id" class="form-control"> -->
    <form:option value="0">select Batch</form:option>
 <c:forEach items="${requestScope.getBatchName}" var="i">
 <form:option value="${i.b_id}">${i.b_name}</form:option>
 
 </c:forEach>
 </form:select>
	</div>
    </div>
</div>
<br>
<br>					
	

<div class="form-group">
	<!--<label for="b_name">Intern name:</label> -->
	<div class="col-xs-10">
	<div class="input-group">		
  	<span class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   ">Intern Name:</span>
    <form:select id="selectintern" path="name" multiple="multiple" class="form-control" style="font-family:cursive; ">
   <form:option value="0"></form:option>
</form:select>
</div>
    </div>
</div>
<br>
<br>			
<br>		
<br>		
					
		
		
					

<div class="form-group">
	<!-- <label for="g_startdate">Start Date:</label> -->
	<div class="col-xs-10">
		<div class="input-group">
		    <span class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   " >Start Date:</span>
			<form:input type="date" value="mm/dd/yyyy" path="g_startdate" class="form-control"  id="g_startdate" style="font-family:cursive; "/>
		</div>
</div>
</div>
<br>
<br>



<div class = "form-group ">
 
     <!--  <label for = "g_status" >Group Status:</label><br> -->
     <div class="col-xs-10"><span id="err_status" style="color: red;"></span>
      <div class="input-group">
		    <h1 class="input-group-addon" style="color: maroon; font-family:cursive;font-weight: bold;   " >Select Status</h1> <span id="err_status" style="color: red;"></span> 
<select name='g_status' id='g_status'  style="font-family:cursive; color: black;"   >
		   <option value="default">Select-Status</option>
        	<option>Active</option>	
        	<option>De-Active</option>      	
        </select>
      
        </div>
           
</div> 
</div>
<br>
<br> 







<div class="row">
<div class="col-lg-2">





<button type="submit"  class="btn btn-success" id="save">Save</button>
<button type="button" class="btn btn-warning"
onclick="return reset();">Reset</button>
</div></div></div></div></div></div>

  </form:form>  
 </div>
 <br>
 <br>
 
 <!-- edit div----------------------------------------------- -->

<div id="edit" class="modal">
  <form:form action="#" modelAttribute="groupBean"  > 
		<!-- Modal content -->
		<div class="modal-content">
			<span class="close">&times;</span>

			<%-- <form:form  modelAttribute="groupBean"> --%>
			<div class="row" style="padding-left: 20px; padding-right: 300px;">
				<br>

				<div class="panel  panel-success"
					style="width: 350px; padding: 20px">
					<div class="panel-heading"
						style="font: oblique; color: purple; font-family: monospace;">
						<h3 class="panel-title">Update group...!!</h3>
					</div>

					<div class="panel-body">
					
				<div class="form-group">
	<!--  <label for="g_name">Group Id:</label> -->
	<div class="col-xs-10">
	<div class="input-group">		
  	<!-- <span class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   "></span> -->
    <input type="hidden" name="g_id"  class="form-control"  id="g_id"  style="font-family:cursive; "/>

	</div>
    </div>
</div>	
					
					
	<div class="form-group">
	<!--  <label for="g_name">Group Name:</label> -->
	<div class="col-xs-10">
	<div class="input-group">		
  	<span class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   ">Group Name:</span><h5 align="center" id="existsGroup" style="display: none;color:red;"></h5>
    <form:input type="text" path="g_name"  class="form-control"  id="grpname"  style="font-family:cursive; "/>

	</div>
    </div>
</div>
<br>
<br>


<div class="form-group">
	<!--  <label for="g_name">Batch Name:</label> -->
	<div class="col-xs-10">
	<div class="input-group">		
  	<span class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   ">Batch Name:</span>
    <input type="text" name="b_name"  class="form-control"  id="batchname"   readonly/>

	</div>
    </div>
</div>
<br>
<br>

<!-- <div class="form-group">
	<label for="b_name">Intern name:</label>
	<div class="col-xs-10">
	<div class="input-group">		
  	<h1 class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   ">Intern Name:</h1>
<div id="tBodyShowInternsEdit" style="font-size: 12px; color: green;" class="col-lg-6">
</div>
</div>
    </div>
</div>
<br>
<br>			
<br>		
<br>	 -->

		
<div class="row" id="">
<div class="col-lg-2">
								Intern Names : <span><form:errors name="b_id"
										class="error" /> </span> <span style="color: #b20000"
									id="internName"></span>
							</div>
							<div class="col-lg-2"></div>
							<div class="col-lg-6">
								<div class="row" id="">
							<div id="tBodyShowInternsEdit" style="font-size: 12px; color: green;" class="col-lg-6">
										</div>
						</div>
						<br>
							</div>
						</div>
						<br>
			
		
		
					

<div class="form-group">
	<!-- <label for="g_startdate">Start Date:</label> -->
	<div class="col-xs-5">
		<div class="input-group">
		    <h1 class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   " >Start Date:</h1>
			<form:input type="date" value="mm/dd/yyyy" path="g_startdate" class="form-control"  id="grpdate" style="font-family:cursive; "/>
		</div>
</div>
</div>
<br>
<br>



<div class = "form-group ">
   <!--    <label for = "g_status" >Group Status:</label><br> -->
     <div class="col-xs-5">
      <div class="input-group">
		    <h1 class="input-group-addon" style="color: maroon; font-family:cursive;font-weight: bold;   " >Select Status</h1>
       <select name='g_status' id="gstatus"  style="font-family:cursive; color: black;"   >
      <option selected disabled>Select-Status</option>
        	<option>Active</option>	
        	<option>De-Active</option>        	
        </select>
        </div>
</div>
</div>
<br>
<br> 




<div class="row">
<div class="col-lg-2">
<button id="updateGroup" class="btn btn-success">Update</button>
<button type="button" class="btn btn-warning"
onclick="return reset();">Reset</button>

</div>
</div>







					
					

						
					</div>
				</div>
			</div>
			<%-- </form:form> --%>
		</div>
</form:form>
	</div>


<!-- -----------------edit div of group ends here----------------------- -->




 
 
 <!--  <button type="button" id="addbatch" class="btn btn-info">Add Batch</button> -->
	
	 <center>
		<div class="container" style="">
	
	<table id="grouptable" class="table table-hover" style="background-color:#ffe6e6" cellspacing="0" width="100%">
		<thead style="color: green">
			<tr>
				 <th style="visibility: hidden;">GId</th> 
				<!-- <th>Batch Name</th>  -->
				<th>Group Name</th>
				<th>BatchName</th>
				<th>G_Startdate</th>
				<th>G_Status</th>
			<!-- 	 <th>Intern Name</th>  -->
				
				
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody id="tbodyView" class="viewInternOfGroup"  >

		 	<c:forEach items="${getAllGroup}" var="groupinfo" > 
				<tr>
					  <td style="visibility: hidden; ">${groupinfo.g_id}</td>  
					<%-- <td>${groupinfo.b_name}</td> --%>
					<td>${groupinfo.g_name}</td>
					<td>${groupinfo.b_name}</td>
					<td>${groupinfo.g_startdate}</td>
					<td>${groupinfo.g_status}</td>
					<%-- <td>${groupinfo.name}</td>  --%>
				
					<td><a class="editGroup" id="${groupinfo.g_id}" style="color: red" href="#">Edit</a>
					</td>
					<td><a id="${groupinfo.g_id}" href="#" class="deleteGroup">Delete</a>
					</td>
                    </tr>
				</c:forEach> 
				
				
			
				
		</tbody>
	</table>
	</div>
	</center>
</body>
</html>