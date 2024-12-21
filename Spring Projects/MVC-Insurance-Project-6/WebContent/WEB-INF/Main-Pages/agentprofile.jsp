<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Session Id is ${aId}</h1><br>
<h1>Agent Profile</h1>
<a href="viewallclientbyAgent/${aId}">Client Register</a><br><br>
<a href="enquiriesofPolicyViewAgent/${aId}">New Enquiry Details Of Policy</a><br><br>
<a href="viewQuoationsByAgents">View Answers Of Agents</a><br><br> 
<h4><a href="agentRegisterClientsPolicy">Agent Policy Register Of Client</a></h4>
<table border="1">
	<tr>
		<th>Agent Id</th>
		<th>Agent Name</th>
		<th>Agent Email</th>
		<th>Agent Password</th>
		<th>Agent Cf Password</th>
		<th>Agent Address</th>
		<th>Agent DOb</th>
		<th>Agent Pan No</th>
		<th>Agent Mobile No</th>
		<th>Agent State</th>
		<th>Agent PostCode</th>
		<th>Agent country</th>
		<th>Action</th>
	</tr>
	
	<tr>
		<td>${profileOfAgent.agentId}</td>
		<td>${profileOfAgent.agentName}</td>
		<td>${profileOfAgent.agentemail}</td>
		<td>${profileOfAgent.agentpassword}</td>
		<td>${profileOfAgent.agentcfpassword}</td>
		<td>${profileOfAgent.agentaddress}</td>
		<td>${profileOfAgent.agentdob}</td>
		<td>${profileOfAgent.agentpanNo}</td>
		<td>${profileOfAgent.agentmobNo}</td>
		<td>${profileOfAgent.agentstate}</td>
		<td>${profileOfAgent.agentpostcode}</td>
		<td>${profileOfAgent.agentcountry}</td>
		<td><a href="updateOwnProfileByAgent/${profileOfAgent.agentId}">Update</a></td>
	</tr>
</table>

</body>
</html>