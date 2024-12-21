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

<title>Client Vehicls Insurance</title>
</head>
<body>
<div class="container">
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-default btn-sm" id="myBtn">Add New Vehicle Insurance</button>

  <div class="row">
    <div class="col-md-4 col-md-offset-4">
     <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Vehicle Insurance</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
      <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/vehicleInsurancesave" method="post">
        
        <fieldset>
        <legend>Client Information</legend>
        
        <!-- Text input-->
         <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Client Id</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" readonly="readonly" name="clientId" value="${retrivevalues.clientId}">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Client Name:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" readonly="readonly"  value="${retrivevalues.clientName}">
            </div>
          </div>
        
        </fieldset>
        
        
        <fieldset>
        <legend>Agent Information</legend>
        
        <!-- Text input-->
         <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Agent Id</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" readonly="readonly" name="agentId" value="${retrivevalues.agentId}">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Agent Name:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" readonly="readonly" value="${retrivevalues.agentName}">
            </div>
          </div>
          
           <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Agent Email</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" readonly="readonly" value="${retrivevalues.agentemail}">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Mobile No:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" readonly="readonly" value="${retrivevalues.agentmobNo}">
            </div>
          </div>
        
        </fieldset>
        
        
        <fieldset>

          <!-- Form Name -->
         
          <legend>Enter Vehicle Information</legend>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Period of Insurance From</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control"  placeholder="Enter Date" name="fromdate">
            </div>

            <label class="col-sm-2 control-label" for="textinput">TO</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="To date" name="todate">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Date of Registration</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Date of Registration" name="dateofregister">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Year of Manufacture</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Manufacture date" name="manufacturedate">
            </div>
          </div>

		<div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Registration No</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Registration" name="registerno">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Fuel Used</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Enter Fuel used" name="usedfuel">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Engine No</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Engine No" name="engineNo">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Cublic Capacity</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Enter Cubic" name="cublic">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Chassis No</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Chassis No" name="chassisNo">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Make</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Enter Make" name="make">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Model</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Enter Model" class="form-control" name="model">
            </div>
          </div>

 <fieldset>
        <legend>Premium Information</legend>
        
        <!-- Text input-->
         <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Insured Decfacted value(IDV)</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" name="idv">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Third Party:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" name="thirdparty">
            </div>
          </div>
          
           <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Service Tax</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" name="servicetax">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Total:</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" name="total">
            </div>
          </div>
        <!-- Text input-->
          <div class="form-group">
           <label class="checkbox-radio">PayMent Mode
      <input type="radio" value="cash" name="paymentMethod">Cash
    </label>
    <label class="checkbox-radio">
      <input type="radio" value="cheque" name="paymentMethod">Cheque
    </label>
    <label class="checkbox-radio">
      <input type="radio" value="card" name="paymentMethod">Card
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
            <th>Nomiee</th>
            
          </tr>  
        </thead>  
       
        <tbody>  
        <s:forEach items="${vehicleContents}" var="contents">
          <tr>
          <td>${contents.vehicleId}</td>
          <td>${contents.fromdate}</td>
          <td>${contents.todate}</td>
          <td>${contents.dateofregister}</td>
          <td>${contents.manufacturedate}</td>
          <td>${contents.registerno}</td>
          <td>${contents.usedfuel}</td>
          <td>${contents.engineNo}</td>
          <td>${contents.cublic}</td>
          <td>${contents.chassisNo}</td>
          <td>${contents.make}</td>
          <td>${contents.model}</td>
          <td>${contents.idv}</td>
          <td>${contents.thirdparty}</td>
          <td>${contents.servicetax}</td>
          <td>${contents.total}</td>
          <td>${contents.paymentMethod}</td>
          <td>${contents.agentId}</td>
          <td>${contents.clientId}</td>
          <td><a  href="${pageContext.request.contextPath}/vehiclesNominees/${contents.clientId}" type="button" class="btn btn-success" id="myBtn">Vehicles Nominee</a></td>
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