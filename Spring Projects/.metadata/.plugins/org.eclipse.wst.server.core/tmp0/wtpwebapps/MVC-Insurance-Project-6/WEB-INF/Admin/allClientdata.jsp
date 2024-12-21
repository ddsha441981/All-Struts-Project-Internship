<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>


<!--For Date  -->

<!-- PopUp CDN -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
  <style>
  .modal-header, h4, .close {
      background-color: #5cb85c;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #f9f9f9;
  }
  </style>

<title>Client Page</title>
</head>
<body>
${msgofpolicyholder}
<h1>All Clients</h1>
<div class="container">

  <div class="row">
    <div class="col-md-4 col-md-offset-4">
     <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
</div><!-- /.row -->
</div></div></div></div>

<!-- Table data -->
<table id="myTable" class="table table-striped" >  
        <thead>  
          <tr>  
            <th>Client Id</th>  
            <th>Client Name</th>  
            <th>Client Email</th>  
            <th>Client Password</th> 
            <th>Client Cf Password</th>
             <th>Address</th>  
            <th>Gender</th>  
            <th>Pan No</th> 
            <th>DoB</th>  
            <th>Mobile No</th>
            <th>State</th>
            <th>PostCode</th>
            <th>Occuption</th>
            <th>Income</th>
            <th>Countery</th>
            <th>Agent Id</th>
            <th>Action</th>
            <th>Action</th>
         
          </tr>  
        </thead>  
        
        <tbody>  
        <c:forEach items="${allclients}" var="holders">
          <tr>
          <td>${holders.clientId}</td>
          <td>${holders.clientName}</td>
          <td>${holders.clientemail}</td>
          <td>${holders.clientpassword}</td>
          <td>${holders.clientcfpassword}</td>
          <td>${holders.clientaddress}</td>
          <td>${holders.clientgender}</td>
          <td>${holders.clientpanNo}</td>
          <td>${holders.clientdob}</td>
          <td>${holders.clientmobNo}</td>
          <td>${holders.clientstate}</td>
          <td>${holders.clientpostcode}</td>
          <td>${holders.clientoccuption}</td>
          <td>${holders.clientincome}</td>
          <td>${holders.clientcountry}</td>
          <td>${holders.agentId}</td>
          <td><a  href="selectClientInfoById/${holders.clientId}" type="button" class="glyphicon glyphicon-edit">Edit</a></td>
           <td><a onclick="deleteClientInfoByAdmin(${holders.clientId})" type="button" class="glyphicon glyphicon-remove">Delete</a></td>
          
            
          </tr>  
         </c:forEach> 
        </tbody> 
  
      </table>  
	  </div>
	  
<script>
$(document).ready(function(){
    $('#myTable').dataTable();
});
</script>

<script type="text/javascript">
function deleteClientInfoByAdmin(id) {
alert("Hello method called"+id);

$.ajax({

		type: "POST",
		url: "deleteClientInfo",
		Data: "clientId="+id,
		success: function(response){
		alert('Successs');
		},
		 error: function(e){

           alert('Error: ' + e);

            }
});
	
}
</script>
</body>
</html>