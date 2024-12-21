<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Minimal an Admin Panel Category Flat Bootstrap Responsive Website Template | Maps :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 
<script src="js/jquery.min.js"> </script>
<script src="js/bootstrap.min.js"> </script>
  
<!-- Mainly scripts -->
<script src="js/jquery.metisMenu.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<!-- Custom and plugin javascript -->
<link href="css/custom.css" rel="stylesheet">
<script src="js/custom.js"></script>
<script src="js/screenfull.js"></script>
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


<!---->
 <script type="text/javascript" src="//maps.google.com/maps/api/js?sensor=true"></script>
  <script type="text/javascript" src="js/gmaps.js"></script>
  <link rel="stylesheet" type="text/css" href="css/examples.css" />
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
				<span>Maps</span>
				</h2>
		    </div>
		<!--//banner-->
 	<!--grid-->
 	<div class="map-grid">
 	<div class="map-system">
 		<div class="col-md-6 map-1">
	
    <div class="span11">
      <div id="map2"></div>
  
	</div>
	 
	 <script type="text/javascript">
    var map;
    $(document).ready(function(){
      map = new GMaps({
        el: '#map2',
        lat: -12.043333,
        lng: -77.028333,
        zoomControl : true,
        zoomControlOpt: {
            style : 'SMALL',
            position: 'TOP_LEFT'
        },
        panControl : false,
        streetViewControl : false,
        mapTypeControl: false,
        overviewMapControl: false
      });
    });
  </script>
 		</div>
 		<div class="col-md-6 map-2">
		
      <div class="span11">
        <div id="map1"></div>
      
	  </div>
	    <script>
        $(function () {
          var map = new GMaps({
          el: "#map1",
          lat: 41.895465,
          lng: 12.482324,
          zoom: 5, 
          zoomControl : true,
          zoomControlOpt: {
            style : "SMALL",
            position: "TOP_LEFT"
          },
          panControl : true,
          streetViewControl : false,
          mapTypeControl: false,
          overviewMapControl: false
        });
        
        var styles = [
            {
              stylers: [
                { hue: "#00ffe6" },
                { saturation: -20 }
              ]
            }, {
                featureType: "road",
                elementType: "geometry",
                stylers: [
                    { lightness: 100 },
                    { visibility: "simplified" }
              ]
            }, {
                featureType: "road",
                elementType: "labels",
                stylers: [
                    { visibility: "off" }
              ]
            }
        ];
        
        map.addStyle({
            styledMapName:"Styled Map",
            styles: styles,
            mapTypeId: "map_style"  
        });
        
        map.setStyle("map_style");
      });
    </script>
	
		</div>
 		<div class="clearfix"> </div>
 		
	</div>
	<div class="map-system">
 	
 		<div class="col-md-6 map-1">
 
    <div class="span11">
      <div id="map3"></div>
    </div>

	</div>
	 <script type="text/javascript">
    var map;
    $(document).ready(function(){
      map = new GMaps({
        el: '#map3',
        lat: -12.043333,
        lng: -77.028333,
        mapTypeControlOptions: {
          mapTypeIds : ["hybrid", "roadmap", "satellite", "terrain", "osm", "cloudmade"]
        }
      });
      map.addMapType("osm", {
        getTileUrl: function(coord, zoom) {
          return "http://tile.openstreetmap.org/" + zoom + "/" + coord.x + "/" + coord.y + ".png";
        },
        tileSize: new google.maps.Size(256, 256),
        name: "OpenStreetMap",
        maxZoom: 18
      });
      map.addMapType("cloudmade", {
        getTileUrl: function(coord, zoom) {
          return "http://b.tile.cloudmade.com/8ee2a50541944fb9bcedded5165f09d9/1/256/" + zoom + "/" + coord.x + "/" + coord.y + ".png";
        },
        tileSize: new google.maps.Size(256, 256),
        name: "CloudMade",
        maxZoom: 18
      });
      map.setMapTypeId("osm");
    });
  </script>
  	<div class="col-md-6 map-2">
		
     <div class="span11">
      <div id="map"></div>
    </div>
	   <script type="text/javascript">
    var map;

    var getTile = function(coord, zoom, ownerDocument) {
      var div = ownerDocument.createElement('div');
      div.innerHTML = coord;
      div.style.width = this.tileSize.width + 'px';
      div.style.height = this.tileSize.height + 'px';
      div.style.background = 'rgba(250, 250, 250, 0.55)';
      div.style.fontFamily = 'Monaco, Andale Mono, Courier New, monospace';
      div.style.fontSize = '10';
      div.style.fontWeight = 'bolder';
      div.style.border = 'dotted 1px #aaa';
      div.style.textAlign = 'center';
      div.style.lineHeight = this.tileSize.height + 'px';
      return div;
    };

    $(document).ready(function(){
      map = new GMaps({
        el: '#map',
        lat: -12.043333,
        lng: -77.028333
      });
      map.addOverlayMapType({
        index: 0,
        tileSize: new google.maps.Size(256, 256),
        getTile: getTile
      });
    });
  </script>
		</div>
 		<div class="clearfix"> </div>
 		
	</div>
	
	</div>
 	<!--//grid-->
		<!---->
<!-- Footer Start -->
<%@include file="footer.jsp" %>
<!-- Footer End  -->

		</div>
		</div>
		<div class="clearfix"> </div>
       </div>
     
<!---->
<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
</body>
</html>

