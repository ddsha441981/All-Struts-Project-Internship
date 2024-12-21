<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD-->
<head>
   
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Blank Page</title>
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

    <!-- PAGE LEVEL STYLES -->
    <link href="assets/plugins/gritter/css/jquery.gritter.css" rel="stylesheet" />
    <!-- END PAGE LEVEL  STYLES -->
       <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
    <!-- END  HEAD-->
    <!-- BEGIN BODY-->
<body class="padTop53 " >

     <!-- MAIN WRAPPER -->
    <div id="wrap">


        <!-- HEADER SECTION -->
       <%@ include file="include/header.jsp" %>
        <!-- END HEADER SECTION -->




       

        <!--PAGE CONTENT -->
        <div id="content">

            <div class="inner" style="min-height:700px;">
                <div class="row">
                    <div class="col-lg-12">


                        <h2> More Notifications </h2>



                    </div>
                </div>

                <hr />
              
                 <div class="row">
                    <div class="col-lg-6">


                         <div class="panel panel-default">
                        <div class="panel-heading">
                          Regular Notification
                        </div>
                        <div class="panel-body">
                           
			 
                   
            Fades out after a certain amount of time, can be set for each notification.
                             <br />   <br /> 
            <a class="btn btn-primary" href="#" id="add-regular">Click Here</a>
		 <br /> <br />
		
			
                        </div>
                    </div>
                       <div class="panel panel-default">
                        <div class="panel-heading">
                         Sticky Notification
                        </div>
                        <div class="panel-body">
                           
			 
                   
            Doesn't run on a fade timer.  Just sits there until the user manually removes it by clicking on the (X).
                             <br />   <br /> 
            <a class="btn btn-success" href="#" id="add-sticky">Click Here</a>
		 <br /> <br />
		
			
                        </div>
                    </div>
                        <div class="panel panel-default">
                        <div class="panel-heading">
                         Notification Without Image
                        </div>
                        <div class="panel-body">
                           
			 
                   
            This notification appears without any image
                             <br />   <br /> 
            <a class="btn btn-info"  href="#" id="add-without-image">Click Here</a>
		 <br /> <br />
		
			
                        </div>
                    </div>
                        <div class="panel panel-default">
                        <div class="panel-heading">
                          A White Notification
                        </div>
                        <div class="panel-body">
                           
			 
                   
           Has a 'gritter-light' class_name applied to it.
                             <br />   <br /> 
            <a class="btn btn-danger" href="#" id="add-gritter-light">Click Here</a>
		 <br /> <br />
		
			
                        </div>
                    </div>
                        <div class="panel panel-default">
                        <div class="panel-heading">
                          Notification With Callbacks
                        </div>
                        <div class="panel-body">
                         This notification is an example of notification with callbacks. To view please click below
			 
                   
                             <br />   <br /> 
            <a class="btn btn-default" href="#" id="add-with-callbacks">Click Here</a>
		 <br /> <br />
		
			
                        </div>
                    </div>
                        

                    </div>
                     <div class="col-lg-6">
                          <div class="panel panel-default">
                        <div class="panel-heading">
                          Callbacks Sticky Notification
                        </div>
                        <div class="panel-body">
                           
			Example of sticky notification with callbacks
                   
                             <br />   <br /> 
            <a class="btn btn-danger" href="#" id="add-sticky-with-callbacks">Click Here</a>
		 <br /> <br />
		
			
                        </div>
                    </div>
                       <div class="panel panel-default">
                        <div class="panel-heading">
                         Notification With max of 3
                        </div>
                        <div class="panel-body">
                           
			 
                   
            If there are 3 messages already on screen, it won't show another one.
                             <br />   <br /> 
            <a class="btn btn-default" href="#" id="add-max">Click Here</a>
		 <br /> <br />
		
			
                        </div>
                    </div>
                        <div class="panel panel-default">
                        <div class="panel-heading">
                         Remove All Notifications
                        </div>
                        <div class="panel-body">
                           
			 
                   
           Click below to remove all notifications
                             <br />   <br /> 
            <a class="btn btn-warning"  href="#" id="remove-all">Click Here</a>
		 <br /> <br />
		
			
                        </div>
                    </div>
                        <div class="panel panel-default">
                        <div class="panel-heading">
                         Remove all notifications with callbacks
                        </div>
                        <div class="panel-body">
                           
			 
                   
          Click below to remove all notifications with callbacks
                             <br />   <br /> 
            <a class="btn btn-primary" href="#" id="remove-all-with-callbacks">Click Here</a>
		 <br /> <br />
		
			
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


     <!-- PAGE LEVEL SCRIPTS -->
    <script src="assets/plugins/gritter/js/jquery.gritter.js"></script>
    <script src="assets/js/moreNoti.js"></script>
     <!--END PAGE LEVEL SCRIPTS -->

</body>
    <!-- END BODY-->
    
</html>
