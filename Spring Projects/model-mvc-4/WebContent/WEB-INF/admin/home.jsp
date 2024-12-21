<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Admin Page </title>   
<meta name="description" content="Creating a Employee table with Twitter Bootstrap. Learn with example of a Employee Table with Twitter Bootstrap.">  
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

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


</head>  
<body style="margin:20px auto">  
<div class="container">
<div class="row header" style="text-align:center;color:green">
<h1>${msg}</h1>
</div>
<div class="container">
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-default btn-sm" id="myBtn">Add New Entery</button>

<h4>${msg1}</h5>


  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Add New Policy</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form" action="aboutpolicies">
            <div class="form-group">
              <label for="policyid"><span class="glyphicon glyphicon-user"></span> Policy Id</label>
              <input type="text" class="form-control" id="policyid" placeholder="Enter policyid" name="policyid">
            </div>
            
             <div class="form-group">
              <label for="policyname"><span class="glyphicon glyphicon"></span> Policy Name</label>
              <input type="text" class="form-control" id="policyname" placeholder="Enter Policy Name" name="policyname">
            </div>
            
             <div class="form-group">
              <label for="policyterm"><span class="glyphicon glyphicon"></span> Policy Term</label>
              <input type="text" class="form-control" id="policyterm" placeholder="Enter Policy Term" name="policyterm">
            </div>
            
            <div class="form-group">
              <label for="policyamount"><span class="glyphicon glyphicon"></span> Policy Amount</label>
              <input type="text" class="form-control" id="policyterm" placeholder="Enter Policy Amount" name="policyamount">
            </div>
            
            <div class="form-group">
              <label for="policyfaceamount"><span class="glyphicon glyphicon"></span> Policy FaceAmount</label>
              <input type="text" class="form-control" id="policyfaceamount" placeholder="Enter Policy FaceAmount" name="policyfaceamount">
            </div>
            
            <div class="form-group">
              <label for="policyinterest"><span class="glyphicon glyphicon"></span> Policy Interest</label>
              <input type="text" class="form-control" id="policyinterest" placeholder="Enter Policy Interest" name="policyinterest">
            </div>
            
             <div class="form-group">
              <label for="policydate"><span class="glyphicon glyphicon-eye-open"></span> Policy Date</label>
              <input type="text" class="form-control" id="policydate" placeholder="Enter Policy Date" name="policydate">
            </div>
            
            <div class="form-group">
              <label for="bonusperiod"><span class="glyphicon glyphicon"></span> Bonus Period</label>
              <input type="text" class="form-control" id="bonusperiod" placeholder="Enter Bonus Period" name="bonusperiod">
            </div>
            
            <div class="form-group">
              <label for="bonusrate"><span class="glyphicon glyphicon"></span> Bonus Rate</label>
              <input type="text" class="form-control" id="bonusrate" placeholder="Enter Bonus Rate" name="bonusrate">
            </div>
            
           
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Add</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          <p>Not a member? <a href="#">Sign Up</a></p>
          <p>Forgot <a href="#">Password?</a></p>
        </div>
      </div>
      
    </div>
  </div> 
</div>
 

<table id="myTable" class="table table-striped" >  
        <thead>  
          <tr>  
            <th>Policy Id</th>  
            <th>Policy Name</th>  
            <th>Policy Term</th>  
            <th>Policy Amount</th> 
            <th>Policy FaceAmount</th>
             <th>Interest</th>  
            <th>Policy Date</th>  
            <th>Bonus Period</th> 
            <th>Bonus Rate</th>  
            <th>Action</th>
            <th>Action</th>
         
          </tr>  
        </thead>  
       <c:forEach items="${policyinfo}" var="policy"> 
        <tbody>  
          <tr>
          
            <td class="">${policy.policyid}</td>  
            <td>${policy.policyname}</td>  
            <td>${policy.policyterm}</td>  
            <td>${policy.policyamount}</td>
            <td>${policy.policyfaceamount}</td>  
            <td>${policy.policyinterest}</td>  
            <td>${policy.policydate}</td>  
            <td>${policy.bonusperiod}</td>
            <td>${policy.bonusrate}</td>  
            <td><a class="glyphicon glyphicon-edit" href="editpolicy?id"=${policy.policyid}>Edit</a></td>
            <td><a class="glyphicon glyphicon-remove" href="${policy.policyid}">delete</a></td>
            
          </tr>  
          
        </tbody> 
        </c:forEach> 
      </table>  
	  </div>
	  
	  
	  <script>
$(document).ready(function(){
    $('#myTable').dataTable();
});
</script>

<script>
$(document).ready(function(){
    $("#myBtn").click(function(){
        $("#myModal").modal();
    });
});
</script>
</body>  

</html>  
