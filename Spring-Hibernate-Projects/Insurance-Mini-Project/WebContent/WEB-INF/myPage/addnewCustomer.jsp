<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Register New Customer</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script> -->

 
  <link rel="stylesheet" href="assets/model/css/bootstrap.css" />
    <link rel="stylesheet" href="assets/model/css/main.css" />
    <link rel="stylesheet" href="assets/model/css/theme.css" />
    <link rel="stylesheet" href="assets/model/css/MoneAdmin.css" />
    <link rel="stylesheet" href="assets/model/css/font-awesome.css" />
   
     
     
     
      <!-- GLOBAL SCRIPTS -->
    <script src="assets/model/js/jquery-2.0.3.min.js"></script>
     <script src="assets/model/js/bootstrap.min.js"></script>
    <script src="assets/model/js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    
     <script src="assets/validations/addCustomer.js"></script>
    
    <!-- END GLOBAL SCRIPTS -->
    <style type="text/css">
.glyphicon-ok{
color:green;
}
    </style>
    
  <!--  <script type="text/javascript">
 
  </script>  -->
  
  <style type="text/css">
.required:before {
    color: red;
    content: '*';
    
}
  </style>
  
</head>
<body>
<center><h1>Register New Customer</h1></center>
<div class="container">
<form action="${pageContext.request.contextPath}/addNewCustomersByEmployees" method="get" name="myForm" onsubmit="return addNewCustom()">

<div class="form-group row">
  <label for="example-text-input" class="required">Customer Name </label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custName" placeholder="Customer Name " name="custName">
    <span style="color: red; font-weight:bold;font-family: cursive;" id="custNameError"></span>
    
  </div>
</div>

<div class="form-group row">
  <label for="example-text-input" class="col-2 col-form-label">Middle Name</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="middleName" placeholder="Middle Name Optional" name="middleName">
  </div>
</div>

<div class="form-group row">
  <label for="example-text-input" class="required">Last Name</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="lastName" placeholder="Last Name" name="lastName">
    <span style="color: red; font-weight:bold;font-family: cursive;" id="LastNameError"></span>
  </div>
</div>

<div class="form-group row">
  <label for="example-search-input" class="required">Email Id</label>
  <div class="col-5">
    <input class="form-control" type="text" id="custEmailId" placeholder="Customer Email'Id" name="email">
    <span style="color: red; font-weight:bold;font-family: cursive;" id="emailError"></span>
  </div>
</div>


<div class="form-group row">
  <label for="example-tel-input" class="required">Mobile No:</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custMobNo" placeholder="Customer Mobile Number" name="custMobNo">
     <span style="color: red; font-weight:bold;font-family: cursive;" id="mobileError"></span>
  </div>
</div>

<div class="form-group row">
  <label for="example-tel-input" class="required">Gender</label>
  <div class="col-5">
  <label class="radio-inline">
      <input type="radio" name="gender" value="Male" id="gender">Male
    </label>
    
    <label class="radio-inline">
      <input type="radio" name="gender" value="Female" id="gender">Female
    </label>
    
     <label class="radio-inline">
      <input type="radio" name="gender" value="Other" id="gender">Other
    </label>
    
    </div>
</div>
<div class="form-group row">
  <label for="example-number-input" class="required">Nationality</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custNationlity" placeholder=" Nationality" name="custNationlity">
     <span style="color: red; font-weight:bold;font-family: cursive;" id="custNationlityError"></span>
  </div>
</div>

<!-- <div class="form-group row">
  <label for="example-date-input" class="required">Date of Birth</label>
  <div class="col-5">
    <input class="form-control" type="date" value="2011-08-19" id="custDob" name="custDob">
  </div>
</div> -->

<div class="form-group row">
  <label for="example-number-input" class="required">Date of Birth</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custDob" placeholder=" custDob" name="custDob">
    
  </div>
</div>

<div class="form-group row">
  <label for="example-number-input" class="required">Pincode</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custPincode" placeholder="Customer Pincode" name="custPincode">
      <span style="color: red; font-weight:bold;font-family: cursive;" id="custPincodeError"></span>
  </div>
</div>

<div class="form-group row">
  <label for="example-number-input" class="required">Country</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custCountry" placeholder=" Country" name="custCountry">
     <span style="color: red; font-weight:bold;font-family: cursive;" id="custCountryError"></span>
  </div>
</div>

<div class="form-group row">
  <label for="example-number-input" class="required">State</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custState" placeholder=" State" name="custState">
     <span style="color: red; font-weight:bold;font-family: cursive;" id="custStateError"></span>
  </div>
</div>

<div class="form-group row">
  <label for="example-number-input" class="required">City</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custCity" placeholder=" City" name="custCity">
     <span style="color: red; font-weight:bold;font-family: cursive;" id="custCityError"></span>
  </div>
</div>

<div class="form-group row">
  <label for="example-number-input" class="required">Occupation</label>
  <div class="col-5">
    <input class="form-control" type="text"  id="custOccupation" placeholder=" Occupation" name="custOccupation">
     <span style="color: red; font-weight:bold;font-family: cursive;" id="custOccupationError"></span>
  </div>
</div>

<div class="form-group row">
  <label for="example-number-input" class="required">Address</label>
  <div class="col-5">
    <textarea rows="5" cols="50" name="address" id="address"></textarea>
     <span style="color: red; font-weight:bold;font-family: cursive;" id="custAddressError"></span>
  </div>
</div>
 
<div style="text-align:center" class="form-actions no-margin-bottom">
                                            <input type="submit" value=" Click To Validate" class="btn btn-success" data-toggle="modal" data-target="#buttonedModal" />
                                        </div>
                                        
                                        <div class="row">
                     <div class="col-lg-12">
                        <div class="modal fade" id="buttonedModal" tabindex="-1" role="dialog"  aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                           <center> <h4 class="modal-title" id="H1">!!!!!!Alert!!!!!!!</h4></center>
                                        </div>
                                        <div class="modal-body">
                                            
                                            <h3>Do you want to save  or close</h3>
                                        </div>
                                        <div class="modal-footer">
                                            <input type="reset" value="Close" class="btn btn-danger" data-dismiss="modal">
                                            <input type="submit" value=" Click To save" class="btn btn-primary">
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </div>
                    </div>
</form>

</div>
</body>
</html>