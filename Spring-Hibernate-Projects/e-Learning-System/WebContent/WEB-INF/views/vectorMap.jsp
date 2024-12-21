<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<head>
<title>Vector Map</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="assets/css/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="assets/css/style.css" rel='stylesheet' type='text/css' />
<link href="assets/css/style-responsive.css" rel="stylesheet"/>
<link href="assets/css/jqvmap.css" media="screen" rel="stylesheet" type="text/css"/>
<!-- font CSS -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="assets/css/font.css" type="text/css"/>
<link href="assets/css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<script src="assets/js/jquery2.0.3.min.js"></script>
</head>
<body>
<section id="container">
<!--header start-->

<%@ include file="admin/header.jsp" %>

<!--header end-->

<!--sidebar start-->

<%@ include file="admin/leftMenu.jsp" %>

<!--sidebar end-->

<!--main content start-->
<section id="main-content">
	<section class="wrapper">
		   <!-- page start-->

        <div class="row">
            <div class="col-sm-12 vec-wthree">
                <section class="panel">
                    <header class="panel-heading">
                        WORLD MAP
                        <span class="tools pull-right">
                            <a href="javascript:;" class="fa fa-chevron-down"></a>
                            <a href="javascript:;" class="fa fa-cog"></a>
                            <a href="javascript:;" class="fa fa-times"></a>
                         </span>
                    </header>
                    <div class="panel-body">
                        <div id="world-vmap" style="width:100%; height: 400px;"></div>

                    </div>
                </section>
            </div>
        </div>
        <div class="row">
                <div class="col-sm-12 vec-wthree">
                    <section class="panel">
                        <header class="panel-heading">
                           EUROPE
                        <span class="tools pull-right">
                            <a href="javascript:;" class="fa fa-chevron-down"></a>
                            <a href="javascript:;" class="fa fa-cog"></a>
                            <a href="javascript:;" class="fa fa-times"></a>
                         </span>
                        </header>
                        <div class="panel-body">

                            <div id="europe-vmap" style="width: 100%; height: 520px;"></div>


                        </div>
                    </section>
                </div>
            </div>
        <div class="row">
                <div class="col-sm-6 vec-wthree">
                    <section class="panel">
                        <header class="panel-heading">
                            ASIA
                        <span class="tools pull-right">
                            <a href="javascript:;" class="fa fa-chevron-down"></a>
                            <a href="javascript:;" class="fa fa-cog"></a>
                            <a href="javascript:;" class="fa fa-times"></a>
                         </span>
                        </header>
                        <div class="panel-body">


                            <div id="asia-vmap" style="width: 100%; height: 520px;"></div>


                        </div>
                    </section>
                </div>
                <div class="col-sm-6 vec-wthree">
                    <section class="panel">
                        <header class="panel-heading">
                            Australia
                        <span class="tools pull-right">
                            <a href="javascript:;" class="fa fa-chevron-down"></a>
                            <a href="javascript:;" class="fa fa-cog"></a>
                            <a href="javascript:;" class="fa fa-times"></a>
                         </span>
                        </header>
                        <div class="panel-body">


                            <div id="australia-vmap" style="width: 100%; height: 520px;"></div>

                        </div>
                    </section>
                </div>

            </div>
        <!-- page end-->

</section>
 <!-- footer -->
		  
		  <%@ include file="admin/footer.jsp" %>
		  
  <!-- / footer -->
</section>
<!--main content end-->
</section>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="assets/js/scripts.js"></script>
<script src="assets/js/jquery.slimscroll.js"></script>
<script src="assets/js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="assets/js/jquery.scrollTo.js"></script>
<script src="assets/js/jquery.vmap.js"></script>
<script src="assets/js/jquery.vmap.world.js"></script>
<script src="assets/js/jquery.vmap.sampledata.js"></script>
<script src="assets/js/jquery.vmap.europe.js"></script>
<script src="assets/js/jquery.vmap.asia.js"></script>
<script src="assets/js/jquery.vmap.australia.js"></script> 
<script>
    jQuery('#world-vmap').vectorMap({
        map: 'world_en',
        backgroundColor: null,
        color: '#ffffff',
        hoverOpacity: 0.7,
        selectedColor: '#666666',
        enableZoom: true,
        borderWidth:1,
        showTooltip: true,
        values: sample_data,
        scaleColors: ['#C8EEFF', '#006491'],
        normalizeFunction: 'polynomial'
    });
</script>

<script type="text/javascript">
    jQuery(document).ready(function() {
        jQuery('#europe-vmap').vectorMap({
            map: 'europe_en',
            backgroundColor: null,
            color: '#ffffff',
            borderWidth:1,
            hoverOpacity: 0.7,
            selectedColor: '#666666',
            enableZoom: false,
            showTooltip: false,
            values: sample_data,
            scaleColors: ['#C8EEFF', '#006491'],
            normalizeFunction: 'polynomial'
        });
    });
</script>

<script type="text/javascript">
    jQuery(document).ready(function() {
        jQuery('#asia-vmap').vectorMap({
            map: 'asia_en',
            backgroundColor: null,
            color: '#ffffff',
            borderWidth:1,
            hoverOpacity: 0.7,
            selectedColor: '#666666',
            enableZoom: false,
            showTooltip: false,
            values: sample_data,
            scaleColors: ['#C8EEFF', '#006491'],
            normalizeFunction: 'polynomial'
        });
    });
</script>

<script type="text/javascript">
    jQuery(document).ready(function() {
        jQuery('#australia-vmap').vectorMap({
            map: 'australia_en',
            backgroundColor: null,
            color: '#ffffff',
            borderWidth:1,
            hoverOpacity: 0.7,
            selectedColor: '#666666',
            enableZoom: false,
            showTooltip: false,
            values: sample_data,
            scaleColors: ['#C8EEFF', '#006491'],
            normalizeFunction: 'polynomial'
        });
    });
</script>

</body>
</html>
