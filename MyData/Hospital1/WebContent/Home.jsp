<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hospital Mangement</title>
    <!-- jQuery -->
<%-- <script type="text/javascript" src="./libs/jquery/jquery.js"></script> --%>

<!-- SmartMenus jQuery plugin -->
<script type="text/javascript" src="./jquery.smartmenus.js"></script>

<!-- SmartMenus jQuery init -->
<script type="text/javascript">
	$(function() {
		$('#main-menu').smartmenus({
			subMenusSubOffsetX: 1,
			subMenusSubOffsetY: -8
		});
	});
</script>


<!-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->

<link href="1/thumbs2.css" rel="stylesheet" />
    <link href="1/thumbnail-slider.css" rel="stylesheet" type="text/css" />
    <script src="1/thumbnail-slider.js" type="text/javascript"></script>
    <style>
        body {font: normal 0.9em Arial;color: #222;}
        header {display:block; font-size:1.2em; margin-bottom:100px;}
        header a, header span {
            display: inline-block;
            padding: 4px 8px;
            margin-right: 10px;
            border: 2px solid #000;
            background: #DDD;
            color: #000;
            text-decoration: none;
            text-align: center;
            height: 20px;
        }
        header span {background:none;}
        a {color: #1155CC;}
       
    </style>


<!-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->

<!-- SmartMenus core CSS (required) -->
<link href="./css/sm-core-css.css" rel="stylesheet" type="text/css" />

<!-- "sm-blue" menu theme (optional, you can use your own CSS, too) -->
<link href="./css/sm-blue/sm-blue.css" rel="stylesheet" type="text/css" />
<!-- YOU DO NOT NEED THIS - demo page content styles -->
<link href="./libs/demo-assets/demo.css" rel="stylesheet" type="text/css" />


  <!-- $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Slider and Menu Bar $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ --> 
   <!-- Start css3menu.com HEAD section -->
	<link rel="stylesheet" href="CSS3 Menu_files/style.css" type="text/css" /><style type="text/css">._css3m{display:none}</style>
	<!-- End css3menu.com HEAD section -->
<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="engine1/style.css" />
	<script type="text/javascript" src="engine1/jquery.js"></script>
	<!-- End WOWSlider.com HEAD section -->
   <!-- $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ -->  
   <!-- div box start -->
   <style>
   		/* .boxx{
   		width: 100px;
   		height:200px;
   		padding:25px;
   		border: 5px solid gray;
   		margin: 0;
   		right: 5px;
   		
   		text-align: center;
   		}
   		.boxx2{
   		width: 100px;
   		height:200px;
   		padding:25px;
   		border: 5px solid gray;
   		margin: 0;
   		
   		right: 5px;
   		font-size: small;
   		text-align: center;
   		} */
   		.pattern{
   		border: solid 2px red; 
   		background-color: red;
   		padding: 10px;
   		text-align: center;
   		font-size: 125.10%;
   		border-radius:10px;    		
   		}
   		.pattern11{
   		border: solid 2px white; 
   		background-color: pink;
   		padding: 10px;
   		text-align: center;
   		font-size: 125.10%;
   		border-radius:10px;  
   		}
   		.read:HOVER{
   		font-weight:bold;
   		text-align: center;
   		text-shadow: 1px 1px 0px;
   		border-radius:10px;
   		font-size: medium;
   		
   		}
   	#parent{
	width: 100%;
	height:300px;
	text-align: center;
	font-size: 15px;
	white-space: inherit;
	line-height: 12px;
	overflow: hidden;
	}
	.child
	{
		width: 200px;
		height: 300px;
		border: solid 1px #ccc;
		display: inline-block;
		vertical-align: middle;
		background-image: url("images/Bright-Floral-and-Abstract-Wave-Background-Vector-02.jpg");
	}
	.col{
	background-image: url("images/papers-flowers-shadows-blasjqi-wallpaper-color-pattern-art.jpg");
	background-color: orange;
	}
   </style>
   <!-- div box start -->
</head>
<body ontouchstart="" class="col">
<%@ include file="header.jsp" %>
<%@ include file="image-slider.jsp" %>
     <!--start--><div class="pattern11"><strong>DIAGNOSTICS & SPECIALITIES</strong></div>
   <!--  <div style="max-width:500px;margin:0 auto;padding:100px 0;"> -->

        <div style="float:right;padding-top:5px;">
            <div id="thumbnail-slider">
                <div class="inner">
                    <ul>
                        <li>
                            <a href="/">
                                <span class="thumb" style="background-image:url(img/1.jpg)">
                                    This slide demonstrates how to link the thumbnail image to another web page.
                                </span>
                            </a>
                        </li>
                        <li>
                            <a href="neurology.jsp"><img class="thumb" src="img/2016-09-06-19-16-27-1062572262.jpg"></a>
                        </li>
                        <li>
                        <a href="endoscopy.jsp"><img class="thumb" src="img/2016-09-06-19-18-28-1994690583.jpg"></a>
                        </li>
                        <li>
                             <a href="doctors.jsp"><img class="thumb" src="img/2016-09-06-19-19-02-224924633.jpg"></a>
                        </li>
                        <li>
                            <a href="Bariatric.jsp"><img class="thumb" src="img/2016-09-06-20-00-09--978935596.jpg"></a>
                        </li>
                        <li>
                             <a href="doctors.jsp"><img class="thumb" src="img/2016-09-06-20-00-09--978935596.jpg"></a>
                        </li>
                        <li>
                             <a href="doctors.jsp"><img class="thumb" src="img/2016-09-06-20-12-18--2056628776.jpg"></a>
                        </li>
                        <li>
                              <a href="doctors.jsp"><img class="thumb" src="img/2016-09-06-20-12-22-1428088167.jpg"></a>
                        </li>
                        <li>
                             <a href="doctors.jsp"><img class="thumb" src="img/images-1.jpg"></a>
                        </li>
                        <li>
                             <a href="doctors.jsp"><img class="thumb" src="img/images-2.jpg"></a>
                        </li>
                        <li>
                            <a href="doctors.jsp"><img class="thumb" src="img/images-3.jpg"></a>
                        </li>
                        <li>
                            <a href="doctors.jsp"><img class="thumb" src="img/images-3.jpg"></a>
                        </li>
                        <li>
                            <a href="doctors.jsp"><img class="thumb" src="img/images-3.jpg"></a>
                        </li>
                        <li>
                            <a href="doctors.jsp"><img class="thumb" src="img/images-3.jpg"></a>
                        </li>
                        <li>
                            <a href="doctors.jsp"><img class="thumb" src="img/images-3.jpg"></a>
                        </li>
                        <li>
                            <a href="doctors.jsp"><img class="thumb" src="img/images-3.jpg"></a>
                        </li>
                        <li>
                              <a href="cardiology.jsp"><img class="thumb" src="img/images.jpg"></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        
        
        
        
        
   

        <div style="clear:both;"></div>

    </div>
    <!--end-->
     <a href="img/9.jpg"></a>
          
 <div id="parent">
			<div class="child">
			<div class="pattern"><strong>Latest News</strong></div>
			<div><p>Deendayal Kumawat Deendayal Kumawat</p>
			<p>Deendayal Kumawat Deendayal Kumawat
			Deendayal Kumawat Deendayal Kumawat</p></div>
			<div class="read">Read More</div>
			</div>
			
			<div class="child">
			<div class="pattern"><strong>Latest News</strong></div>
			<div><p>Deendayal Kumawat Deendayal Kumawat</p>
			<p>Deendayal Kumawat Deendayal Kumawat
			Deendayal Kumawat Deendayal Kumawat</p></div>
			<div class="read">Read More</div>
			</div>
			
			<div class="child">
			<div class="pattern"><strong>Latest News</strong></div>
			<div><p>Deendayal Kumawat Deendayal Kumawat</p>
			<p>Deendayal Kumawat Deendayal Kumawat
			Deendayal Kumawat Deendayal Kumawat</p></div>
			<div class="read">Read More</div>
			</div>
			
			<div class="child">
			<div class="pattern"><strong>Latest News</strong></div>
			<div><p>Deendayal Kumawat Deendayal Kumawat</p>
			<p>Deendayal Kumawat Deendayal Kumawat
			Deendayal Kumawat Deendayal Kumawat</p></div>
			<div class="read">Read More</div>
			</div>
			</div>


</div>
    <section>  
    <h3> Jawaharlal Nehru </h3>  
    <p> Jawaharlal Nehru was the first Prime Minister of India and a central figure in   
    Indian politics for much of the 20th century. He emerged as the paramount leader of the Indian   
    independence movement under the tutelage of Mahatma Gandhi. -Source Wikipedia </p>  
    </section>  
    <section>  
    <h3>Subhas Chandra Bose </h3>  
    <p>Subhas Chandra Bose was an Indian nationalist whose attempt during World War II to rid India of   
    British rule with the help of Nazi Germany and Japan left a troubled legacy.  
    The honorific Netaji (Hindustani language: "Respected Leader"), first applied to Bose in Germany,  
     by the Indian soldiers of the Indische Legion and by the German and Indian officials  
     in the Special Bureau for India in Berlin, in early 1942, is now used widely throughout India. -source Wikipedia</p>  
    </section>  
    
   <%@include file="footer.jsp" %>

</body>
</html>