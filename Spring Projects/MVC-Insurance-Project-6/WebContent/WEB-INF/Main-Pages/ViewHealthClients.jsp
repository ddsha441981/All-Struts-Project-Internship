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

<title>Health Insurance</title>
</head>
<body>

<div class="container">
<h1>Admin Can View All Health Insurance Details of CLient</h1>
<!-- Table data -->

<table id="myTable" class="table table-striped" >  
        <thead>  
          <tr>  
            <th>Health Id</th>  
            <th>From Date</th>  
            <th>To Date</th>  
            <th>Health Option 1</th> 
            <th>Health Option 2</th>
             <th>Health Option 3</th>  
            <th>Health Idv</th>  
            <th>Health Third Party</th> 
            <th>Service Tax</th>  
            <th>PayMethod</th>
            <th>Agent Id</th>
            <th>Client Id</th>
            <th>Edit</th>
         	<th>Remove</th>
         
          </tr>  
        </thead>  
       
        <tbody>  
        <c:forEach items="${Healthlist}" var="F1">
          <tr>
          
          <td>${F1.healthId}</td>
          <td>${F1.healthfromdate}</td>
          <td>${F1.healthtodate}</td>
          <td>${F1.healthopt1}</td>
          <td>${F1.healthopt2}</td>
          <td>${F1.healthopt3}</td>
          <td>${F1.healthidv}</td>
          <td>${F1.healththirdparty}</td>
          <td>${F1.healthservicetax}</td>
          <td>${F1.paymethod}</td>
          <td>${F1.agentId}</td>
          <td>${F1.clientId}</td>
          <td><a class="glyphicon glyphicon-edit" href="editOfhealth/${F1.healthId}">Edit</a></td>
          <td><a class="glyphicon glyphicon-remove" href="${F1.healthId}">Remove</a></td>
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