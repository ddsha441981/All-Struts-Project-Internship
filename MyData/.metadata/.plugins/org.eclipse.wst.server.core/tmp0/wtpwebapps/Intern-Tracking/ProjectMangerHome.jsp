<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
 <style>
        .shape {
            border-style: solid;
            border-width: 0 70px 40px 0;
            float: right;
            height: 0px;
            width: 0px;
            -ms-transform: rotate(360deg);
            /* IE 9 */
            -o-transform: rotate(360deg);
            /* Opera 10.5 */
            -webkit-transform: rotate(360deg);
            /* Safari and Chrome */
            transform: rotate(360deg);
        }
        
        .offer {
            background: #fff;
            border: 1px solid #ddd;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
            margin: 15px 0;
            overflow: hidden;
        }
        
        .offer-radius {
            border-radius: 7px;
        }
        
        .offer-danger {
            border-color: #d9534f;
        }
        
        .offer-danger .shape {
            border-color: transparent #d9534f transparent transparent;
            border-color: rgba(255, 255, 255, 0) #d9534f rgba(255, 255, 255, 0) rgba(255, 255, 255, 0);
        }
        
        .offer-success {
            border-color: #5cb85c;
        }
        
        .offer-success .shape {
            border-color: transparent #5cb85c transparent transparent;
            border-color: rgba(255, 255, 255, 0) #5cb85c rgba(255, 255, 255, 0) rgba(255, 255, 255, 0);
        }
        
        .offer-default {
            border-color: #999999;
        }
        
        .offer-default .shape {
            border-color: transparent #999999 transparent transparent;
            border-color: rgba(255, 255, 255, 0) #999999 rgba(255, 255, 255, 0) rgba(255, 255, 255, 0);
        }
        
        .offer-primary {
            border-color: #428bca;
        }
        
        .offer-primary .shape {
            border-color: transparent #428bca transparent transparent;
            border-color: rgba(255, 255, 255, 0) #428bca rgba(255, 255, 255, 0) rgba(255, 255, 255, 0);
        }
        
        .offer-info {
            border-color: #5bc0de;
        }
        
        .offer-info .shape {
            border-color: transparent #5bc0de transparent transparent;
            border-color: rgba(255, 255, 255, 0) #5bc0de rgba(255, 255, 255, 0) rgba(255, 255, 255, 0);
        }
        
        .offer-warning {
            border-color: #f0ad4e;
        }
        
        .offer-warning .shape {
            border-color: transparent #f0ad4e transparent transparent;
            border-color: rgba(255, 255, 255, 0) #f0ad4e rgba(255, 255, 255, 0) rgba(255, 255, 255, 0);
        }
        
        .shape-text {
            color: #fff;
            font-size: 12px;
            font-weight: bold;
            position: relative;
            right: -40px;
            top: 2px;
            white-space: nowrap;
            -ms-transform: rotate(30deg);
            /* IE 9 */
            -o-transform: rotate(360deg);
            /* Opera 10.5 */
            -webkit-transform: rotate(30deg);
            /* Safari and Chrome */
            transform: rotate(30deg);
        }
        
        .offer-content {
            padding: 0 20px 10px;
        }
    </style>
 
</head>
<body>
<%@ include file="CommonFile/projectHomecommonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>Project Manger!</strong> Home.</h4>
  </div>
  
  ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>User Name</th>
			<th>Email</th>
			<th>Mobile No.</th>
		</tr>
 </thead>
		
 <tbody>
		<tr>
		<td>${requestScope.pmInfo.id}<td>
		<td>${requestScope.pmInfo.fname}<td>
		<td>${requestScope.pmInfo.lname}<td>
		<td>${requestScope.pmInfo.username}<td>
		<td>${requestScope.pmInfo.email}<td>
		<td>${requestScope.pmInfo.mob}<td>
		<td><a href="editprojectmanger.action?id=${requestScope.pmInfo.id}" class="btn btn-success">Edit Profile</a></td>
	</tr>
</tbody>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table><%@ include file="CommonFile/alldatalinkofProjectmanger.jsp" %>
</div>
</body>
</html>