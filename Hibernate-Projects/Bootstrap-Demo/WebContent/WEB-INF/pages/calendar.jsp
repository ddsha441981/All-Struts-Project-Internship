<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Minimal an Admin Panel Category Flat Bootstrap Responsive Website Template | Calendar :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="assests/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="assests/css/style.css" rel='stylesheet' type='text/css' />
<link href="assests/css/font-awesome.css" rel="stylesheet"> 
<script src="assests/js/jquery.min.js"> </script>
<script src="assests/js/bootstrap.min.js"> </script>
  
<!-- Mainly scripts -->
<script src="assests/js/jquery.metisMenu.js"></script>
<script src="assests/js/jquery.slimscroll.min.js"></script>
<!-- Custom and plugin javascript -->
<link href="assests/css/custom.css" rel="stylesheet">
<script src="assests/js/custom.js"></script>
<script src="assests/js/screenfull.js"></script>
		<script>
		$(function () {
			$('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

			if (!screenfull.enabled) {
				return false;
			}

			

			$('#toggle').click(function () {
				screenfull.toggle($('#container')[0]);
			});
			

			
		});
		</script>



</head>
<body>
<div id="wrapper">
       <!----->
        
         <!-- Header File Start -->
        <%@ include file="header.jsp" %>
         <!-- Header File End -->
        
		 <div id="page-wrapper" class="gray-bg dashbard-1">
       <div class="content-main">
 
 	<!--banner-->	
		    <div class="banner">
		    	<h2>
				<a href="index.html">Home</a>
				<i class="fa fa-angle-right"></i>
				<span>Calendar</span>
				</h2>
		    </div>
		<!--//banner-->
 	 <!--gallery-->
 	 <div class="calendar">
<div class="custom-calendar-wrap custom-calendar-full">
				<div class="custom-header">

					<h3 class="custom-month-year">
						<span id="custom-month" class="custom-month"> </span>
						<span id="custom-year" class="custom-year"> </span>
						<nav>
							<span id="custom-prev" class="custom-prev"> </span>
							<span id="custom-next" class="custom-next"> </span>
							<span id="custom-current" class="custom-current" title="Got to current date"></span>
						</nav>
						<div class="clearfix"> </div>
					</h3>
				</div>
				<div id="calendar" class="fc-calendar-container"> </div>
				<div class="clearfix"> </div>

 	 </div>
	 </div>
	<!--//gallery-->
		<!---->
 <!-- Footer File Start -->
        <%@ include file="footer.jsp" %>
         <!-- Footer File End -->
		</div>
		</div>
		<div class="clearfix"> </div>
       </div>
     
<!---->
<link rel="stylesheet" type="text/css" href="assests/css/calendar.css" />
		<link rel="stylesheet" type="text/css" href="assests/css/custom_1.css" />
		<script type="text/javascript" src="assests/js/jquery.calendario.js"></script>
		<script type="text/javascript" src="assests/js/data.js"></script>
		<script type="text/javascript">	
			$(function() {
			
				var cal = $( '#calendar' ).calendario( {
						onDayClick : function( $el, $contentEl, dateProperties ) {

							for( var key in dateProperties ) {
								console.log( key + ' = ' + dateProperties[ key ] );
							}

						},
						caldata : codropsEvents
					} ),
					$month = $( '#custom-month' ).html( cal.getMonthName() ),
					$year = $( '#custom-year' ).html( cal.getYear() );

				$( '#custom-next' ).on( 'click', function() {
					cal.gotoNextMonth( updateMonthYear );
				} );
				$( '#custom-prev' ).on( 'click', function() {
					cal.gotoPreviousMonth( updateMonthYear );
				} );
				$( '#custom-current' ).on( 'click', function() {
					cal.gotoNow( updateMonthYear );
				} );

				function updateMonthYear() {				
					$month.html( cal.getMonthName() );
					$year.html( cal.getYear() );
				}

				
			
			});
		</script>


<!--scrolling js-->
	<script src="assests/js/jquery.nicescroll.js"></script>
	<script src="assests/js/scripts.js"></script>
	<!--//scrolling js-->
</body>
</html>

