<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Placement-Page</title>
<link href="assets/css/groupinfo.css" rel="stylesheet">
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="assets/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="assets/js/jquery-ui.js"></script>
<script src="assets/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="assets/js/registration.js"></script>
<script src="assets/js/jquery.dataTables.min.js"></script>
<script src="assets/css/jquery.dataTables.min.css"></script>
<script type="text/javascript" src="assets/js/Placementvalidation.js"></script>

</head>

<script type="text/javascript">

$(document).ready(function() {
 	$('placementtable').DataTable();
});

$(document).ready(function() {
	
	$('.close').click(function() {
		document.getElementById('addPlacementDiv').style.display = "none";
	});
	
	
	$("#addnewplacement").on("click",function(e){
		
		alert("Inside Popup");
		e.preventDefault();
		 $("#addPlacementDiv").show(800);
	});
	
});

/* --------------------saving placement starts here(ajax call)---------------- */

$(document).ready(function() {
	
	$("#addPlacementDiv").on("click","#savePlacement",function(e){
		
	
		e.preventDefault();
	
		var compname=$("#cpname").val();
		var idate=$("#interview_date").val();
		var pstatus=$("#status").val();
		var pdesc=$("#description").val();
		alert(compname+idate+pstatus+pdesc);
		  $.ajax({
				
				url:'savePlacement',
				type:'get',
				  data:{
					  'interview_date':idate,
				      'company_name':compname,
				      'status':pstatus,
				      'description':pdesc,
				      
					
				},
				success:function(data)
				{
					alert("success");
					 $('#add').css("display" , "none");
					 $("#tbodyView").append
						("<tr><td></td><td>"+$("#pl_id").val()+"</td><td>"+$("#interview_date").val()+
						"</td><td>"+$("#cpname").val()+
						"</td><td>"+$("#status").val()+"</td><td>"+$("#description").val()+"</td><td>"
						+"enable"+
						"</td><td><a class='editPlacement' href='#'>Edit</a></td><td><a class='deletePlacement' href='#'>Delete</a></td></tr>")
					 $('#saveheader').html("Details of Placement Added Successfully.....!!!!").fadeIn('slow');
					
					},
					
					error: function()
	        		 {
	        		alert("error");
	        		 
	        		 }
					
					
					
				});
			 

		
		
		
	});
	
});     // Ajax-call of the Saving placement ends here

/*--------------------- Delete Placement Ajax call -------------------------- */
 
    $(document).ready(function() {
 
	$('.deletePlacement').click(function(){
		
		                     var pl_id=$(this).attr("id");
							alert(""+pl_id);
							if(confirm("Are You sure to delete Group")){
								
								 $.ajax({
									url:"deletePlacementdetails?pl_id="+pl_id,
									
									
									success : function(data){
										
										
											
											 $('#deleteid').html("Group is Deleted").fadeIn('slow');
											
										
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
		
/* ---------------Ajax call of  deletePlacement ends------------- */


</script>
<body>
<jsp:include page="header.jsp" /><br>
<h3 id="saveheader" style="color:Green" align="center"></h3>
<h2 id="deleteid"   style="color:Red" align="center" ></h2>
<button type="button" id="addnewplacement" class="btn btn-info" >Placement</button>



<!----------------------div of the add New Placement---------------- -->

<div id="addPlacementDiv" class="modal">
<form action="#">
<div class="modal-content">
<span class="close" >&times;</span>
	<div class="row" style="padding-left: 20px; padding-right: 300px;">
				<br>
	
				<div class="panel  panel-success"
					style="width: 390px; padding: 20px">
					<div class="panel-heading"
						style="font: oblique; color: purple; font-family: monospace;">
						<h3 class="panel-title">Add New Placement...!!</h3>
					</div>
				<div class="panel-body">
	<div class="form-group">
	<label for="company_name" style="color: maroon; ">company name:</label> 
	<div class="col-xs-15">
	<div class="input-group">		
  	<!-- <h1 class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   ">Company Name:</h1> -->
  	<span id="err_name" style="display: none;color:red;"></span>
    <input type="text" name="company_name"  class="form-control"  id="cpname"  style="font-family:cursive; "/>
    </div>
    </div>
    </div>
<div class="form-group">
	 <label for="interview date" style="color: maroon; ">Interview Date:</label>
	<div class="col-xs-15">
		<div class="input-group">
		<span  style="display: none;color:red;"></span>
		   <!--  <h1 class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   " >Interview date:</h1> -->
			<input type="date" value="mm/dd/yyyy" name="interview_date" class="form-control"  id="interview_date" style="font-family:cursive; "/>
		</div>
</div>
</div>
<div class="form-group">
	 <label for="company_name"  style="color: maroon;">Description:</label>
	<div class="col-xs-10">
	<div class="input-group">		
<!--   	<h1 class="input-group-addon" style="color: maroon; font-family:cursive; font-weight: bold;   ">Description:</h1> -->
  	<span id="d_err" style="display: none;color:red;"></span>
  <textarea  rows="4" cols="40"  id="description" placeholder="enter valid discription.."
									name="description" class="form-control"></textarea>
  </div>
    </div>
</div>

<div class = "form-group ">
 
       <label for = "status"   style="color: maroon; ">Placement Status:</label><br> 
     <div class="col-xs-10"><span id="err_status" style="color: red;"></span>
     <div class="input-group">
	<span id="err_status" style="color: red;"></span> 
<select  class="form-group" name="status" id="status"  style="font-family:cursive; color: black;"   >
 <option value="Not-Appear">Not-Appear</option>
        	<option value="placed">placed</option>	
        	<option value="Not-Placed">Not-Placed</option>      	
        </select>
      
        </div>
           
</div> 
</div>




					
					<div class="row">
					<div class="col-lg-2">
					<button type="submit" id="savePlacement"  class="btn btn-success"  >Save </button>    <button type="button" class="btn btn-warning" onclick="resetPlacementForm()">Reset</button>
				     </div>
				     </div>
</div>
     		
</div></div>
		</div> 
</form>		
  </div>
  
  <br>
  <br>
  <br>
   
 
 
 
 
 <!--  ---------------------------div for add New Placement Ends here---------------------------------- -->
 
 
             <h1 align="center">View For Placement</h1>
 
  <center>
		<div class="container" style="">
	
	<table id="grouptable" class="table table-hover" style="background-color:#ffe6e6" cellspacing="0" width="100%">
		<thead style="color: green">
			<tr>
				 <th style="visibility: hidden;">PL-Id</th> 
			
				<th>Company-Name</th>
				<th>Interview-Date</th>
				<th>Status</th>
				<th>Discription </th>
			    <th>Edit</th>
				<th>Delete</th>
			</tr>
		
		</thead>
		<tbody id="tbodyViewPlacement">
				 <c:forEach items="${getAllPlacements}" var="i">
						<tr>
						<td style="visibility: hidden;">${i.pl_id}</td> 
						 <td>${i.company_name}</td> 
					     <td >${i.interview_date}</td>
						<td >${i.status}</td>
						<td>${i.description}</td>
						<td><a class="editPlacement" id="${i.pl_id}" style="text-decoration:underline; color: teal; " href="#"><span class="glyphicon glyphicon-edit"></span></a></td>
						<td ><a  class="deletePlacement" id="${i.pl_id}" style="text-decoration:underline; color: red; " href="#"><span class="glyphicon glyphicon-trash"></span></a></td>
						</tr>
					</c:forEach> 
		</tbody>
		
	</table>
	</div>
	</center>

 
 

</body>
</html>