<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
   <nav class="navbar navbar-inverse" style="background-color: DarkSlateGray;">
   <div class=" container-fluid">
  
   <div class="navbar-header" >
   <a class="navbar-brand" href="#" style="color:activecaption;">Intern Tracking System</a>
   </div>
   <ul class="nav navbar-nav">
   <li ><a href="#" >Home</a></li>
   <li><a href="registration.pm">Register</a></li>
   <li><a href="batch.pm">Batch </a></li>
      <li><a href="Group">Group </a></li>
        <li><a href="placement">Placement </a></li>
   
   </ul>
   <form class="navbar-form navbar-right" action="">
    <button type="submit" class="btn btn-success navbar-btn">Logout</button>
   </form>
   
   <form  class="navbar-form navbar-left" action="" method="post">
   <div class="input-group">
   		<input type="text" id="searchText" name="searchText" onkeyup="doSearch()" class="form-control" placeholder="Search Contact here">
   		
   <div  class="input-group-btn">
    <button class="btn btn-defalut" type="submit">
   <i class="glyphicon glyphicon-search"></i>
   </button>
   </div>
  
   </div>
    </form>
  
 
   </div>
   </nav>
  
</body>
</html>