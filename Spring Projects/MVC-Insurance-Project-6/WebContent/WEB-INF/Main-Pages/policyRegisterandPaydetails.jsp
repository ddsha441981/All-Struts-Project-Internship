<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap-select.css">
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="js/bootstrap-select.js"></script>

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

  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-default btn-sm" id="myBtn">Add New Client Policy</button>

  <div class="row">
    <div class="col-md-4 col-md-offset-4">
     <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Add New Client Policy</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
      <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/clientspolicyPayDetailsByAgent" method="post">
        <fieldset>

          <!-- Form Name -->
          <legend>Add New Client Policy</legend>

         <div class="form-group">
				Select Policy <select id="first-disabled" class="selectpicker"
					data-hide-disabled="true" data-live-search="true"
					name="policyId">
					
					<optgroup label="Select  Option">
						<option>Select Search Option</option>
						<c:forEach items="${allpolicies}" var="listofpolicyByagent">
						<option></option>
						<option value="${listofpolicyByagent.policyId}">${listofpolicyByagent.policyName}</option>
						</c:forEach>

					</optgroup>
					
				</select> 
			</div>

 
          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Policy Date</label>
            <div class="col-sm-10">
              <input type="text" class="form-control"  placeholder="Enter Policy Date" name="policyDate">
            </div>
          </div>
         
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Policy Maturity Date</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control"  placeholder="Enter Policy Maturity Date" name="policymaturityDate">
            </div> 
            <!-- 
            <label class="col-sm-2 control-label" for="textinput">Date of Birth</label>
            <div class="col-sm-4">
            <input type="text" class="span2" value="02-16-2012" id="dp1" >
          </div>-->

            <label class="col-sm-2 control-label" for="textinput">Sum Insured</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Sum Insured" name="policysumInsured">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Premium Amount</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Premium Amount" name="policypremiumAmount">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Commission</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Enter Commission" name="policycommission">
            </div>
          </div>

		
           <!-- Text input-->
          <div class="form-group">
           <label class="checkbox-radio">PayMent Details
      <input type="radio" value="cash" name="paymentmethod">Cash
    </label>
    <label class="checkbox-radio">
      <input type="radio" value="cheque" name="paymentmethod">Cheque
    </label>
    <label class="checkbox-radio">
      <input type="radio" value="card" name="paymentmethod">Card
    </label>
            </div>

          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <div class="pull-right">
                <button type="submit" class="btn btn-danger">Cancel</button>
                <button type="submit" class="btn btn-success">Save</button>
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
            <th>PolicyNo</th>  
            <th>Policy Date</th>  
            <th>Policy Maturity Date</th>  
            <th>Policy Sum Insured</th> 
            <th>Premium Amount</th>
			<th>Commission</th>
			<th>Payment Method</th>
			<th>Policy Id</th>
			<th>agentId Id</th>
			<th>clientId Id</th>
			
		 </tr>  
        </thead>  
       
        <tbody>
        <c:forEach items="${agentpolicy}" var="k1">  
          <tr>
          	<td>${k1.policyNo}</td>
          	<td>${k1.policyDate}</td>
          	<td>${k1.policymaturityDate}</td>
          	<td>${k1.policysumInsured}</td>
          	<td>${k1.policypremiumAmount}</td>
          	<td>${k1.policycommission}</td>
          	<td>${k1.paymentmethod}</td>
          	<td>${k1.policyId}</td>
          	<td>${k1.agentId}</td>
          	<td>${k1.clientId}</td>
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
<script>
$(document).ready(function(){
    $("#myBtn").click(function(){
        $("#myModal").modal();
    });
});
</script>
</body>
</html>