<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
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

<title>Nominee Insurances Page</title>
</head>
<body>
<div class="container">
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-default btn-sm" id="myBtn">Add New Nominee Insurance</button>

  <div class="row">
    <div class="col-md-4 col-md-offset-4">
     <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span>Add Nominee Vehicle</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
      <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/vehicleNomineesave" method="post">
        
       
        <fieldset>

          <!-- Form Name -->
         
          <legend>Enter Vehicle's Nominee Information</legend>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Sum Insured</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control"  placeholder="Enter sumInsured" name="healthsumInsured">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Premium</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Premium" name="healthpriemium">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Nominee's Name</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Name of Nominee" name="healthnomineeName">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Relation With Nominee</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Relation With Nominee" name="healthrelationsWithNominee">
            </div>
          </div>

		 <div class="form-group">
				Select Policy <select id="first-disabled" class="selectpicker"
					data-hide-disabled="true" data-live-search="true"
					name="policyId">
					
					<optgroup label="Select  Option">
						<option>Select Policies</option>
						<s:forEach items="${list}" var="P1"> 
						<option value="${P1.policyId}">${P1.policyName}</option>
						
						
						</s:forEach>

					</optgroup>
					
				</select> 
			</div>


          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <div class="pull-right">
                <button type="submit" class="btn btn-default">Cancel</button>
                <button type="submit" class="btn btn-primary">Genrate Policy</button>
              </div>
            </div>
          </div>

        </fieldset>
      </form>
    </div><!-- /.col-lg-12 -->
</div><!-- /.row -->
</div></div></div></div>

<!-- Table data -->

<table id="myTable" class="table table-striped" >  
        <thead>  
          <tr>  
            <th>Nominee Id</th>  
            <th>Sum Insured</th>  
            <th>Premium</th>  
            <th>Nominee Name</th> 
            <th>Relation's with Nomiee</th>
            <th>Policy Id</th>
            <th>client Id</th>   
           
            
          </tr>  
        </thead>  
       
        <tbody>  
    <s:forEach items="${listofNominees}" var="Y2"> 
          <tr>
          <td>${Y2.healthNomineeId}</td>
          <td>${Y2.healthsumInsured}</td>
          <td>${Y2.healthpriemium}</td>
          <td>${Y2.healthnomineeName}</td>
          <td>${Y2.healthrelationsWithNominee}</td>
          <td>${Y2.policyId}</td>
          <td>${Y2.clientId}</td>
          
          </tr>  
          </s:forEach>
        </tbody> 
  
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
        $("#myModal").modal()    
       
    });
});
</script>

</body>
</html>