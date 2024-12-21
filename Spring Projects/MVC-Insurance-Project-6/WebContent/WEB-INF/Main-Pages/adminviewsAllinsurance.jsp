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

<title>Add New Client Policy</title>
</head>
<body>

<div class="container">
<h1>Admin Can View All Insurance Details of CLient</h1>
<!-- Table data -->

<table id="myTable" class="table table-striped" >  
        <thead>  
          <tr>  
            <th>Vehicle Id</th>  
            <th>From Date</th>  
            <th>To Date</th>  
            <th>Date Of Register</th> 
            <th>Manufacture Date</th>
             <th>Register No</th>  
            <th>Used Fuel</th>  
            <th>Engine No</th> 
            <th>Cublic</th>  
            <th>Chassis No</th>
            <th>Make</th>
            <th>Model</th>
            <th>Idv</th>
            <th>Third Party</th>
            <th>Service Tax</th>
            <th>Total</th>
            <th>Payment Method</th>
            <th>Agent Id</th>
            <th>Client Id</th>
            <th>Edit</th> 
            <th>Remove</th>
            
          </tr>  
        </thead>  
       
        <tbody>  
        <c:forEach items="${viewInsurance}" var="views">
          <tr>
          <td>${views.vehicleId}</td>
          <td>${views.fromdate}</td>
          <td>${views.todate}</td>
          <td>${views.dateofregister}</td>
          <td>${views.manufacturedate}</td>
          <td>${views.registerno}</td>
          <td>${views.usedfuel}</td>
          <td>${views.engineNo}</td>
          <td>${views.cublic}</td>
          <td>${views.chassisNo}</td>
          <td>${views.make}</td>
          <td>${views.model}</td>
          <td>${views.idv}</td>
          <td>${views.thirdparty}</td>
          <td>${views.servicetax}</td>
          <td>${views.total}</td>
          <td>${views.paymentMethod}</td>
          <td>${views.agentId}</td>
          <td>${views.clientId}</td>
          <td><a class="glyphicon glyphicon-edit" href="${views.vehicleId}">Edit</a></td>
          <td><a class="glyphicon glyphicon-remove" href="${views.vehicleId}">Delete</a></td> 
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

</body>
</html>