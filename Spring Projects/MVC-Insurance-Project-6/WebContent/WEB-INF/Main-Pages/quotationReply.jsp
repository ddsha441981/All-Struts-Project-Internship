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

<div class="container">

 
  <div class="row">
    
   
        <div class="modal-body" style="padding:40px 50px;">
      <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/agentsReplyToCustomers" method="post">
        <fieldset>

          <!-- Form Name -->
          <legend>Agent Reply of Customers</legend>

 	<div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Enquiry Id</label>
            <div class="col-sm-1">
              <input type="text"  class="form-control" value="${EnquiryId.enquiryId}" name="enquiryId" readonly="readonly" >
            </div>
          </div>
          
          
          
         <div class="form-group">
				Select Policy <select id="first-disabled" class="selectpicker"
					data-hide-disabled="true" data-live-search="true"
					name="policyId">
					
					<optgroup label="Select  Option">
						<option>Select Policies</option>
						<c:forEach items="${agentsreply}" var="M1"> 
						<option value="${M1.policyId}">${M1.policyName}</option>
						
						</c:forEach>

					</optgroup>
					
				</select> 
			</div>




          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Quotation Amount</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Quotation Amount" class="form-control" name="quotationAmounts" >
            </div>
          </div>
          
           <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Date</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Date" class="form-control" name="replydate" >
            </div>
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
</div>

	  

</body>
</html>