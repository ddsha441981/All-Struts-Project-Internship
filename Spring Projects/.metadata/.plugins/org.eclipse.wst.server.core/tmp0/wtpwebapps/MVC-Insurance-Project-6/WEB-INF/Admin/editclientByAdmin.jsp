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
      <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/editClientInfomartionsByAdmin" method="post">
        <fieldset>

          <!-- Form Name -->
          <legend>Clients Edits</legend>

         
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Client Id</label>
            <div class="col-sm-1">
              <input type="text"  class="form-control" name="clientId" readonly="readonly" value="${setIdByIdOfClients.clientId}">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Agent Id</label>
            <div class="col-sm-1">
              <input type="text"   class="form-control"  name="agentId" readonly="readonly" value="${setIdByIdOfClients.agentId}">
            </div>
          </div>
          

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Client Name</label>
            <div class="col-sm-10">
              <input type="text" class="form-control"  placeholder="Enter Client Name" name="clientName" value="${setIdByIdOfClients.clientName}">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Email</label>
            <div class="col-sm-10">
              <input type="text"  class="form-control" placeholder="Enter Client Email" name="clientemail" value="${setIdByIdOfClients.clientemail}">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Password</label>
            <div class="col-sm-10">
              <input type="text"  class="form-control" placeholder="Enter Password" name="clientpassword" value="${setIdByIdOfClients.clientpassword}">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Confirm Password</label>
            <div class="col-sm-10">
              <input type="text"  class="form-control" placeholder="Enter Confirm Password" name="clientcfpassword" value="${setIdByIdOfClients.clientcfpassword}">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Address</label>
            <div class="col-sm-10">
              <textarea rows="5" cols="5" class="form-control" placeholder="Enter Address" name="clientaddress" value="${setIdByIdOfClients.clientaddress}"></textarea>
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Gender</label>
            <div class="form-group">
              <input type="radio"  name="clientgender" value="male">Male
              <input type="radio" name="clientgender" value="female">Female
            </div>

            <label class="col-sm-2 control-label" for="textinput">Pancard No</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Pancard No" name="clientpanNo" value="${setIdByIdOfClients.clientpanNo}">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Date of Birth</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control"  placeholder="Enter date of Birth" name="clientdob" value="${setIdByIdOfClients.clientdob}">
            </div> 
            <!-- 
            <label class="col-sm-2 control-label" for="textinput">Date of Birth</label>
            <div class="col-sm-4">
            <input type="text" class="span2" value="02-16-2012" id="dp1" >
          </div>-->

            <label class="col-sm-2 control-label" for="textinput">Mobile No</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Mobile No" name="clientmobNo" value="${setIdByIdOfClients.clientmobNo}">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">State</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter State" name="clientstate" value="${setIdByIdOfClients.clientstate}">
            </div>

            <label class="col-sm-2 control-label" for="textinput">PostCode</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Post Code" name="clientpostcode" value="${setIdByIdOfClients.clientpostcode}">
            </div>
          </div>

		<div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Occuption</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Occuption" name="clientoccuption" value="${setIdByIdOfClients.clientoccuption}">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Annual Income</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Enter Annual Income" name="clientincome" value="${setIdByIdOfClients.clientincome}">
            </div>
          </div>
		


          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Country</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Country" class="form-control" name="clientcountry" value="${setIdByIdOfClients.clientcountry}">
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