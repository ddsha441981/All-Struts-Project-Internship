<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
  
  	<link rel="stylesheet" href="validation/css/screen.css">
	<script src="validation/js/jquery.js"></script>
	<script src="validation/js/jquery.validate.js"></script>
	<script src="validation/js/Myvalidations.js"></script>
	
	

<script>
var c = 0;
var t;
var timer_is_on = 0;

function timedCount() {
    document.getElementById("txt").value = c;
    c = c + 1;
    t = setTimeout(function(){ timedCount() }, 1000);
}

function startCount() {
    if (!timer_is_on) {
        timer_is_on = 1;
        timedCount();
    }
}

function stopCount() {
    clearTimeout(t);
    timer_is_on = 0;
}
</script>

	
	
</head>
<body>

<button onclick="startCount()">Start count!</button>
<input type="text" id="txt">
<button onclick="stopCount()">Stop count!</button>

<p>
Click on the "Start count!" button above to start the timer. The input field will count forever, starting at 0. Click on the "Stop count!" button to stop the counting. Click on the "Start count!" button to start the timer again.
</p>
<div class="container">  
 <table class="table table-hover" width="100%">
 <thead>
		<tr>
			<th>Instruction :</th>
			<th>Note :</th>
			
		</tr>
 </thead>
 <tbody>
		
		<tr>
		<td align="left">Total number of questions: 20 <br></td></tr>
		<tr><td align="left">Time alloted: 20<br></td></tr>
		<tr><td align="left">Each question carry 1 mark, no negative marks<br>.</td></tr>
		

<tr>
		<td align="right">Total number of questions: 20 <br></td></tr>
		<tr><td align="right">Time alloted: 20<br></td></tr>
		<tr><td align="right">Each question carry 1 mark, no negative marks<br>.</td></tr>
			
		
</tbody>
		
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>

</body>
</html>