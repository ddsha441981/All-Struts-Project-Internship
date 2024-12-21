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
<div class="container">
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-default btn-sm" id="myBtn">Add New Insurance</button>

  <div class="row">
    <div class="col-md-4 col-md-offset-4">
     <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Health Insurance</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
      <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/healthInfoSave" method="post" >
        
        <fieldset>
        <legend>Agent Information</legend>
        
        <!-- Text input-->
         <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Agent Id</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" readonly="readonly" value="${listOfAgents.agentId}">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Agent Name:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" readonly="readonly" value="${listOfAgents.agentName}">
            </div>
          </div>
          
           <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Agent Email</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" readonly="readonly" value="${listOfAgents.agentemail}">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Mobile No:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" readonly="readonly" value="${listOfAgents.agentmobNo}">
            </div>
          </div>
        
        </fieldset>
        
        
        <fieldset>

          <!-- Form Name -->
         
          <legend>Enter Health Details</legend>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Period of Insurance From</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control"  placeholder="Enter Date" name="healthfromdate">
            </div>

            <label class="col-sm-2 control-label" for="textinput">TO</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="To date" name="healthtodate">
            </div>
          </div>
          
         <div class="form-group">
          
            <label class="checkbox-radio">1. Did You Ever Have An Accident Or Injuiry ?<br>
    		  <input type="radio" value="Yes" name="healthopt1">Yes 
      		  <input type="radio" value="No" name="healthopt1">No
    		</label>
    	</div>
    	
    	<div class="form-group">
          
            <label class="checkbox-radio">2. Did You  Have Either Of Alcoholic Drink, Cigratesor Any or Ohter Drug ?<br>
    		  <input type="radio" value="Yes" name="healthopt2">Yes 
      		  <input type="radio" value="No" name="healthopt2">No
    		</label>
    	</div>
    	
    	<div class="form-group">
          
            <label class="checkbox-radio">3. Have You Ever Been Admitted to Any Hospital or Nursing Home for General Check-Up/Observation,Treatment or Operation ?<br>
    		  <input type="radio" value="Yes" name="healthopt3">Yes 
      		  <input type="radio" value="No" name="healthopt3">No
    		</label>
    	</div>
    	
    	<div class="form-group">
          
            <label class="checkbox-radio">**...........Answers Yes or No..........**
    		  
    		</label>
    	</div>
    
 <fieldset>
        <legend>Premium Information</legend>
        
        <!-- Text input-->
         <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Insured Decfacted value(IDV)</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" name="healthidv">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Third Party:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" name="healththirdparty">
            </div>
          </div>
          
           <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Service Tax</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" name="healthservicetax">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Total:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" name="healthtotal">
            </div>
          </div>
        <!-- Text input-->
          <div class="form-group">
           <label class="checkbox-radio">PayMent Mode
      <input type="radio" value="cash" name="paymethod">Cash
    </label>
    <label class="checkbox-radio">
      <input type="radio" value="cheque" name="paymethod">Cheque
    </label>
    <label class="checkbox-radio">
      <input type="radio" value="card" name="paymethod">Card
    </label>
            </div>
        </fieldset>


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
            <th>Health Nominee</th>
         
          </tr>  
        </thead>  
       
        <tbody>  
        <c:forEach items="${listofHeaths}" var="H1">
          <tr>
          
          <td>${H1.healthId}</td>
          <td>${H1.healthfromdate}</td>
          <td>${H1.healthtodate}</td>
          <td>${H1.healthopt1}</td>
          <td>${H1.healthopt2}</td>
          <td>${H1.healthopt3}</td>
          <td>${H1.healthidv}</td>
          <td>${H1.healththirdparty}</td>
          <td>${H1.healthservicetax}</td>
          <td>${H1.paymethod}</td>
          <td>${H1.agentId}</td>
          <td>${H1.clientId}</td>
           <td><a  href="${pageContext.request.contextPath}/healthNominees/${H1.clientId}" type="button" class="btn btn-success" id="myBtn">Health Nominee</a></td>
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