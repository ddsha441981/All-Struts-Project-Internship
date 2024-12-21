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

<title>Agent Page</title>
</head>
<body>

<h1>All Enquiry Details Of Customers</h1>
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
            <th>Enquiry Id</th>  
            <th>Customer Name</th>  
            <th>Customer Address</th>  
            <th>Customer Mobile No</th> 
            <th>Date of Enquiry</th>
             <th>Policy Id</th>  
            <th>Agent Id</th>
            <th>Remove</th>  
            <th>Reply</th>
          </tr>  
        </thead>  
        
        <tbody>  
        <c:forEach items="${agentSelectedUsingId}" var="viewsdetails">
          <tr>
          <td>${viewsdetails.enquiryId}</td>
          <td>${viewsdetails.customerName}</td>
          <td>${viewsdetails.customaddress}</td>
          <td>${viewsdetails.customMobNo}</td>
          <td>${viewsdetails.enquirydate}</td>
          <td>${viewsdetails.policyId}</td>
          <td>${viewsdetails.agentId}</td>
          <td><a onclick="removecustomersEnquiry(${viewsdetails.enquiryId})" type="button" class="glyphicon glyphicon-remove">Remove</a></td>
          <td><a  href="${pageContext.request.contextPath}/returnReplyOfcustomers/${viewsdetails.enquiryId}" type="button" class="btn btn-success" id="myBtn">Reply</a></td>
            
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

<!-- <script type="text/javascript">
function deleteClientInfoByAdmin(id) {
alert("Hello method called"+id);

$.ajax({

		type: "POST",
		url: "deleteClientInfo?clientId="+id,
		success: function(response){
		alert('Successs');
		},
		 error: function(e){

           alert('Error: ' + e);

            }
});
	
}
</script>
 -->

</body>
</html>