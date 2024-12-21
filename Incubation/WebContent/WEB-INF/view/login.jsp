<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="assets/js/bootstrap.min.js"> </script>
<script type="text/javascript" src="assets/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="assets/js/validation.js"></script>

</head>
<body>

	<br>
	<div class="container-fluid">
		<div class="panel panel-success">
			<div class="panel-heading" align="center">
				<h4>
					<b><font color="red" style="font-family: arial;">Incubation
							Tracking System</font> </b>
				</h4>
			</div>
			<div class="panel-body" align="center">

				<div class="container " style="margin-top: 10%; margin-bottom: 10%;">

					<div class="panel panel-success" style="max-width: 35%;"
						align="left">

						<div class="panel-heading form-group">
							<b><font color="red"> Login Form</font> </b>
						</div>

						<div class="panel-body">

							<form:form name="myForm"  action="LoginServlet"
								modelAttribute="loginBean" method="post" onsubmit="return validation();">
								<div class="form-group">
									<label for="exampleInputEmail1">Email</label>
									<form:input type="text" class="form-control" path="email"
										id="email" placeholder="Enter your Email"
										></form:input>
									<span style="color: red;" id="emailError"></span>
								</div>

								<div class="form-group">
									<label for="exampleInputPassword1">Password</label>
									<form:input type="password" class="form-control"
										path="password" id="password" placeholder="password"
										></form:input>
									<span style="color: red;" id="passwordError"></span>

								</div>
								<button type="submit"  style="width: 100%; font-size: 1.1em;"
									class="btn btn-large btn btn-success btn-lg btn-block">
									<b>Login</b>
								</button>

							</form:form>
							<a href="forgotpassword"> forget Password</a>
						</div>
					</div>
				</div>

			</div>

		</div>
		<div class="panel-footer" align="center">
			<font style="color: #111">@Created by SPIC-6 <a
				href="http://mysite.com/">mysite.com</a>, All Rights Reserved.
			</font>
		</div>
	</div>


</body>
</html>