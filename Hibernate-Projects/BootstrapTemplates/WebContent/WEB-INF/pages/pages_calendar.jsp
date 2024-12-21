<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- BEGIN HEAD -->
<head>
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Calendar Page</title>
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

       <link rel="stylesheet" href="assets/plugins/fullcalendar-1.6.2/fullcalendar/fullcalendar.css" />
<link rel="stylesheet" href="assets/css/calendar.css" />
    <!-- END PAGE LEVEL  STYLES -->
       <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
<body class="padTop53 " >

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


                        <h2> Full Calendar </h2>



                    </div>
                </div>

                <hr />
                  <div class="row">
                    <div class="col-lg-12">

                <div class="box">
  <header>
      <h5>Calendar</h5>
  </header>
  <div class="body">
      <div class="row">
	  <div class="col-lg-3">
	      <div class="well well-small">
		  <div id="add-event-form">
		      <fieldset>
			  <legend>Add Custom Event</legend>
			  <span class="help-block">Event Title</span>
			  <input id="title" name="title" type="text" placeholder="event title" class="form-control input-small">
			  <label class="radio">
			      <input type="radio" name="priority" value="label label-default" checked>
			      <span class="label label-default">default</span>
			  </label>
			  <label class="radio">
			      <input type="radio" name="priority" value="label label-warning">
			      <span class="label label-warning">warning</span>
			  </label>
			  <label class="radio">
			      <input type="radio" name="priority" value="label label-success">
			      <span class="label label-success">success</span>
			  </label>
			  <label class="radio">
			      <input type="radio" name="priority" value="label label-info">
			      <span class="label label-info">info</span>
			  </label>
			  <label class="radio">
			      <input type="radio" name="priority" value="label label-danger">
			      <span class="label label-danger">danger</span>
			  </label>
			  <br>
			  <button id="add-event" type="button" class="btn btn-sm btn-default">Add Event</button>
		      </fieldset>
		  </div>

	      </div>
	      <div class="well well-small">
		  <h4>Draggable Events</h4>
		  <ul id='external-events' class="list-inline">
		      <li class="external-event"><span class="label label-default">My Event 1</span></li>
		      <li class="external-event"><span class="label label-danger">My Event 2</span></li>
		      <li class="external-event"><span class="label label-success">My Event 3</span></li>
		      <li class="external-event"><span class="label label-warning">My Event 4</span></li>
		      <li class="external-event"><span class="label label-info">My Event 5</span></li>
		  </ul>

		  <label class="checkbox inline" for='drop-remove'>
		      <input type="checkbox" id="drop-remove">
		      remove after drop
		  </label>
	      </div>
	  </div>
	  <div id="calendar" class="col-lg-9"></div>
      </div>
  </div>


            </div>

</div>
                      </div>
                </div>


        </div>
         <!--PAGE CONTENT -->
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
    <script src="assets/js/jquery-ui.min.js"></script>

     <script src="assets/plugins/fullcalendar-1.6.2/fullcalendar/fullcalendar.min.js"></script>  
   <script src="assets/js/calendarInit.js"></script>
        <script>
            $(function () { CalendarInit(); });
        </script>
     <!--END PAGE LEVEL SCRIPTS -->

</body>
    <!-- END BODY -->
</html>
