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

<title>Insert title here</title>
</head>
<body>
<div class="container">
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-default btn-sm" id="myBtn">Add New Entery</button>

  <div class="row">
    <div class="col-md-4 col-md-offset-4">
     <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Register Agent</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
      <form class="form-horizontal" role="form" action="saveAgentByAdmin">
        <fieldset>

          <!-- Form Name -->
          <legend>Address Details</legend>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Agent Id</label>
            <div class="col-sm-10">
              <input type="text"  class="form-control" placeholder="Enter Agent Id" name="agentId">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Agent Name</label>
            <div class="col-sm-10">
              <input type="text" class="form-control"  placeholder="Enter Agent Name" name="agentName">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Email</label>
            <div class="col-sm-10">
              <input type="text"  class="form-control" placeholder="Enter Agent Email" name="agentemail">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Password</label>
            <div class="col-sm-10">
              <input type="text"  class="form-control" placeholder="Enter Password" name="agentpassword">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Confirm Password</label>
            <div class="col-sm-10">
              <input type="text"  class="form-control" placeholder="Enter Confirm Password" name="agentcfpassword">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Address</label>
            <div class="col-sm-10">
              <textarea rows="5" cols="5" class="form-control" placeholder="Enter Address" name="agentaddress"></textarea>
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Gender</label>
            <div class="form-group">
              <input type="radio"  name="agentgender" value="male">Male
              <input type="radio"  name="agentgender" value="female">Female
            </div>

            <label class="col-sm-2 control-label" for="textinput">Pancard No</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Pancard No" name="agentpanNo">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Date of Birth</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" name="agentdob" placeholder="Enter date of Birth">
            </div>

            <label class="col-sm-2 control-label" for="textinput">Mobile No</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter Mobile No" name="agentmobNo">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">State</label>
            <div class="col-sm-4">
              <input type="text"  class="form-control" placeholder="Enter State" name="agentstate">
            </div>

            <label class="col-sm-2 control-label" for="textinput">PostCode</label>
            <div class="col-sm-4">
              <input type="text"   class="form-control" placeholder="Post Code" name="agentpostcode">
            </div>
          </div>

		

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Country</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Country" class="form-control" name="agentcountry">
            </div>
          </div>

          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <div class="pull-right">
                <button type="submit" class="btn btn-default">Cancel</button>
                <button type="submit" class="btn btn-primary">Save</button>
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
            <th>Agent Id</th>  
            <th>Agent Name</th>  
            <th>Email</th>  
            <th>Password</th> 
            <!-- <th>Confirm Password</th> -->
             <th>Address</th>  
            <th>Gender</th>  
            <th>PanCard No</th> 
            <th>Date of Birth</th>  
            <th>Mobile</th>
            <th>State</th>
            <th>PostCode</th>
            <th>Country</th>
            <th>Remove</th>
         
          </tr>  
        </thead>  
        <tbody>  
        <s:forEach items="${listofagent}" var="agent">
          <tr>
						<td>${agent.agentId}</td>
						<td>${agent.agentName}</td>
						<td>${agent.agentemail}</td>
						<td>${agent.agentpassword}</td>
						<%-- <td>${agent.agentcfpassword}</td> --%>
						<td>${agent.agentaddress}</td>
						<td>${agent.agentgender}</td>
						<td>${agent.agentpanNo}</td>
						<td>${agent.agentdob}</td>
						<td>${agent.agentmobNo}</td>
						<td>${agent.agentstate}</td>
						<td>${agent.agentpostcode}</td>
						<td>${agent.agentcountry}</td>
						<td><a class="glyphicon glyphicon-remove" href="${policy.agentId}">Remove</a></td>
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
        $("#myModal").modal();
    });
});
</script>
</body>
</html>