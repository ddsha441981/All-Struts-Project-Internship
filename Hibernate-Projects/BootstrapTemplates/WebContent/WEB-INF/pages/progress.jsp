<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- BEGIN HEAD -->
<head>
      <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Progress Bars</title>
     <meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
     <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <!-- GLOBAL STYLES -->
    <!-- GLOBAL STYLES -->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="assets/css/main.css" />
    <link rel="stylesheet" href="assets/css/theme.css" />
    <link rel="stylesheet" href="assets/css/MoneAdmin.css" />
    <link rel="stylesheet" href="assets/plugins/Font-Awesome/css/font-awesome.css" />
    <!--END GLOBAL STYLES -->
       <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

</head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
<body class="padTop53 ">

 <!-- MAIN WRAPPER -->
    <div id="wrap">

  		<!-- HEADER SECTION -->
			<%@ include file="include/header.jsp" %>
        <!-- END HEADER SECTION -->



        <!--PAGE CONTENT -->
        <div id="content">
           
 <div class="inner">
               <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Progress Bars</h1>
                </div>
            </div>           
<div class="row">
  <div class="col-lg-12">
    <div class="box">
      <header>
	<h5>Basic Progress Bar <small>Click the bar for show source code</small></h5>
	<div class="toolbar">
	  <div class="progress mini">
	      <div class="progress-bar" style="width: 43%;"></div>
	  </div>
	</div>
	
      </header>
      <div class="body">
	      <div class="progress">
		<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
		  <span class="sr-only">60% Complete</span>
		</div>
	      </div>
	    
	      <div class="progress">
		<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
		  <span class="sr-only">20% Complete</span>
		</div>
	      </div>
	    
	      <div class="progress">
		<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
		  <span class="sr-only">40% Complete (success)</span>
		</div>
	      </div>
	     
	      <div class="progress">
		<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
		  <span class="sr-only">60% Complete (warning)</span>
		</div>
	      </div>
	     
	      <div class="progress">
		<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
		  <span class="sr-only">80% Complete</span>
		</div>
	      </div>
	      
      </div>
      
    </div>
    
  </div>
  
</div>

<div class="row">
  <div class="col-lg-12">
    <div class="box">
      <header>
	<h5>Striped Progress Bar <small>Click the bar for show source code</small></h5>
	<div class="toolbar">
	  <div class="progress mini progress-striped">
	      <div class="progress-bar" style="width: 43%;"></div>
	  </div>
	</div>
	
      </header>
      <div class="body">
	      <div class="progress progress-striped">
		<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
		  <span class="sr-only">60% Complete</span>
		</div>
	      </div>
	     
	      <div class="progress progress-striped">
		<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
		  <span class="sr-only">20% Complete</span>
		</div>
	      </div>
	     
	      <div class="progress progress-striped">
		<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
		  <span class="sr-only">40% Complete (success)</span>
		</div>
	      </div>
	     
	      <div class="progress progress-striped">
		<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
		  <span class="sr-only">60% Complete (warning)</span>
		</div>
	      </div>
	      <div class="progress progress-striped">
		<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
		  <span class="sr-only">80% Complete</span>
		</div>
	      </div>
      </div>
    </div>
  </div>
</div>

<div class="row">
  <div class="col-lg-12">
    <div class="box">
      <header>
	<h5>Animated Striped Progress Bar <small>Click the bar for show source code</small></h5>
	<div class="toolbar">
	  <div class="progress mini progress-striped active">
	      <div class="progress-bar" style="width: 43%;"></div>
	  </div>
	</div>
      </header>
      <div class="body">
	      <div class="progress progress-striped active">
		<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
		  <span class="sr-only">60% Complete</span>
		</div>
	      </div>
	      <div class="progress progress-striped active">
		<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
		  <span class="sr-only">20% Complete</span>
		</div>
	      </div>
	      <div class="progress progress-striped active">
		<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
		  <span class="sr-only">40% Complete (success)</span>
		</div>
	      </div>
	      <div class="progress progress-striped active">
		<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
		  <span class="sr-only">60% Complete (warning)</span>
		</div>
	      </div>
	      <div class="progress progress-striped active">
		<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
		  <span class="sr-only">80% Complete</span>
		</div>
	      </div>
      </div>
    </div>
  </div>
</div>


<div class="row">
  <div class="col-lg-12">
    <div class="box">
      <header>
	<h5>Stacked Progress Bar <small>Click the bar for show source code</small></h5>
	<div class="toolbar">
	  <div class="progress mini">
	    <div class="progress-bar progress-bar-success" style="width: 35%"><span class="sr-only">35% Complete (success)</span></div>
	    <div class="progress-bar progress-bar-warning" style="width: 20%"><span class="sr-only">20% Complete (warning)</span></div>
	    <div class="progress-bar progress-bar-danger" style="width: 10%"><span class="sr-only">10% Complete (danger)</span></div>
	  </div>
	</div>
      </header>
      <div class="body">
	<div class="progress">
	  <div class="progress-bar progress-bar-success" style="width: 35%"><span class="sr-only">35% Complete (success)</span></div>
	  <div class="progress-bar progress-bar-warning" style="width: 20%"><span class="sr-only">20% Complete (warning)</span></div>
	  <div class="progress-bar progress-bar-danger" style="width: 10%"><span class="sr-only">10% Complete (danger)</span></div>
	</div>
      </div>
    </div>
  </div>
</div>

<div class="row">
  <div class="col-lg-12">
    <div class="box">
      <header>
	<h5>Progress Bar Size <small>Click the bar for show source code</small></h5>
	<div class="toolbar">
	  <div class="progress mini progress-striped active">
	      <div class="progress-bar" style="width: 43%;"></div>
	  </div>
	</div>
      </header>
      <div class="body">
      
	<div class="row">
	  <div class="col-lg-3">Default</div>
	  <div class="col-lg-9">
	    <div class="progress">
	      <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
		<span class="sr-only">60% Complete</span>
	      </div>
	    </div>
	  </div>
	</div>
	
	<div class="row">
	  <div class="col-lg-3">large</div>
	  <div class="col-lg-9">
	    <div class="progress lg">
	      <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
		<span class="sr-only">60% Complete</span>
	      </div>
	    </div>
	  </div>
	</div>
	
	<div class="row">
	  <div class="col-lg-3">Middle</div>
	  <div class="col-lg-9">
	    <div class="progress md">
	      <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
		<span class="sr-only">20% Complete</span>
	      </div>
	    </div>
	  </div>
	</div>
	
	<div class="row">
	  <div class="col-lg-3">Mini</div>
	  <div class="col-lg-9">
	    <div class="progress xs">
	      <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
		<span class="sr-only">40% Complete (success)</span>
	      </div>
	    </div>
	  </div>
	</div>
      </div>
    </div>
  </div>
</div>
                    </div>
                                       
                   
                     

                    
                    </div>              
             <!--END PAGE CONTENT -->
                
         
        </div>
    
      <!--END MAIN WRAPPER -->

     <!-- FOOTER -->
    <%@ include file="include/footer.jsp" %>
    <!--END FOOTER -->


     <!-- GLOBAL SCRIPTS -->
    <script src="assets/plugins/jquery-2.0.3.min.js"></script>
     <script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/plugins/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    <!-- END GLOBAL SCRIPTS -->    
</body>
    <!-- END BODY -->
</html>
