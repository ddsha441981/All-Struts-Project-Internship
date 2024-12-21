<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0">
	<title>My Project</title>
		<!-- Start css3menu HEAD section -->
	<link rel="stylesheet" href="CSS3 Menu.css3prj_files/css3menu1/style.css" type="text/css" /><style type="text/css">._css3m{display:none}</style>
	<!-- End css3menu HEAD section -->
<!-- Start WOWSlider HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="engine1/style.css" />
	<script type="text/javascript" src="engine1/jquery.js"></script>
	<!-- End WOWSlider HEAD section -->
	
	<style>
/* ----------------------------------------- */

.col2, .col3, .col4 {
	float:left;
	position:relative;
}
.col3 {
	width:280px;
	margin-right:60px;
}
.col2 {
	width:560px;
	margin-right:40px;
}
.col2 a
{
    color: #FF3300;
}

.col4 {
	width:210px;
	margin-right:40px;
}
.last {
	margin-right:0 !important;
}
.col4-wrap, .col2-wrap {
	width:1300px;
	margin-right:-40px;
	overflow: hidden;
	border: 1px;
	
}

.imag{
 background-image: url("image/pic3.jpg");
}
    
.latest {
	overflow: hidden;
	width: 580px;
	margin-right:-40px;
}
.col3-wrap {
	width:1020px;
	margin-right:-60px;
	overflow: hidden;
}
.col4-wrap 
{
	margin-bottom:50px;
}

.col4center
{
    float: left;
    width: 170px;
    padding:10px 10px 70px 70px;
    margin-left: 50px;
    background: url('style/back.png') no-repeat ;
    text-align: center;
    
}

.col4center p
{
    color:white;
    margin-left:-05px;
    }
  .col4center img
{
    margin-left:65px;
    
    }
 
.col4center h3
{
    color: #000000;
    margin-left: -10px;
}
    
.col {
	margin-bottom:70px;
	overflow: hidden;
}
.col h2 {
	margin-top:0px;
	margin-bottom:10px;
	line-height: 47px;
	height: 32px;
}
.col3-wrap h3 {
	margin-top:20px;
	margin-bottom:15px;
}
.col4-wrap h3 {
	margin-top:22px;
	margin-bottom:10px;
}

/* BUTTONS */
/* ----------------------------------------- */

.view {

	width:121px;
	margin:5px auto 0;
}
.button, .button:link, .button:visited {
	display: block;
	position: relative;
	padding: 0 0 0 20px;
	height: 37px;
	line-height: 37px;
	text-align: center;
	background-position: 0 0;
	background-repeat: no-repeat;
	font-size: 18px;
	font-weight: normal;
	color: #3a3a3a;
	cursor: pointer;
	font-family:'QlassikMediumRegular', Tahoma, Arial, sans-serif;
	text-shadow: 0px 1px 0px #ffffff;
	background-color: white;
}
.button span {
	display: block;
	position: absolute;
	top: 0px;
	right: -20px;
	width: 20px;
	height: 37px;
	background-position: right top;
}

h1.intro {
	color:#000000;
	background-image: url(style/quote1.png);
	background-repeat: no-repeat;
	display: block;
	padding-left:45px;
	padding-right: 20px;
	padding-top:5px;
	line-height: 31px;
	background-color: transparent;
	margin-bottom:35px;
}

h2.intro {
	color:#000000;
	background-repeat: no-repeat;
	display: block;
	padding-top:5px;
	background-color: transparent;
	margin-bottom:10px;
}


h1.intro span {
	color:#626262;
	background-image: url(style/quote2.png);
	background-repeat: no-repeat;
	display: block;
	width: 37px;
	height:30px;
	margin-right:-20px;
	float: right;
	margin-top:12px;
}

h1.intro a
{
    color: #40FF00;
    text-shadow: 0px 2px 0px #006600;
}
h3.intro {
	color:#000000;
	background-image: url(style/quote2.png);
	background-repeat: no-repeat;
	display: block;
	padding-left:45px;
	padding-right: 20px;
	margin-top:17px;
	padding-top:15px;
	line-height: 25px;
	margin-bottom:40px;
	background-color: transparent;
}
h3.intro span {
	color:#626262;
	background-image: url(style/quote2.png);
	background-repeat: no-repeat;
	display: block;
	width: 37px;
	height:30px;
	margin-right:-20px;
	float: right;
	margin-top: 10px;
}
h3.intro a
{
    color: #ffffff;
    font-weight: bold;
}
.co{
background-color: hsl(82, 46%, 45%);;
}



/* HOMEPAGE HEADINGS */
/* ----------------------------------------- */

h2.about
{
  
    height:30px;
    line-height: 36px;
    padding-left: 40px;
    margin-bottom: 20px;
    margin-bottom:9px;
}
h2.work {
	
	height: 27px;
	line-height: 36px;
	padding-left:40px;
	margin-bottom:20px;
}
h2.testimonials {
	
	height: 27px;
	line-height: 36px;
	padding-left:40px;
	margin-bottom:20px;
}
.item p {
	width: 670px;
}
.dropcap {
	color:#3a3a3a;
	font-family:'QlassikMediumRegular', Tahoma, Arial, sans-serif;
	text-shadow: 0px 1px 0px #ffffff;
	display:block;
	float:left;
	font-size:40px;
	line-height:40px;
	margin:0px 8px 0px 0;
}

.button2, .button2:link, .button2:visited {
	display: block;
	position: relative;
	padding: 0 0 0 12px;
	height: 31px;
	text-align: center;
	background-position: 0 0;
	background-repeat: no-repeat;
	font-size: 18px;
	line-height: 30px;
	font-weight: normal;
	color: #3a3a3a;
	cursor: pointer;
	margin-top:10px;
	font-family:'QlassikMediumRegular', Tahoma, Arial, sans-serif;
	text-shadow: 0px 1px 0px #ffffff;
}
.button2 span {
	display: block;
	position: absolute;
	top: 0px;
	right: -12px;
	width: 12px;
	height: 31px;
	background-position: right top;
}
.button2, .button2 span {
	background-image: url(style/button2.png);
	float: left;
}
.button2:hover, li.selected {
	background-position: left -31px;
	text-decoration: none;
}
.button2:hover span, li.selected span {
	background-position: right -31px;
	text-decoration: none;
}
.gallerynav li.selected-0, .gallerynav li.selected-1, .gallerynav li.selected-2, .gallerynav li.selected-3, .gallerynav li.selected-4, .gallerynav li.selected-5 {
	background-image: url(style/button2.png);
	float: left;
	background-position: left -31px;
}
.button a, .button2 a {
	color: #3a3a3a;
}
.iframe {
	margin-bottom:5px;
	border: 1px solid #cfcfcf;
	background-color: #FFF;
	-webkit-border-radius: 8px;
	-moz-border-radius: 8px;
	border-radius: 8px;
	width:340px;
	padding:10px 4px 10px 10px;
	overflow: hidden;
}

/* FOOTER */
/* ----------------------------------------- */

h2.recentposts {
	background: transparent url(style/icn-posts.png) no-repeat left bottom;
	height: 27px;
	line-height: 36px;
	padding-left:40px;
}
h2.archive {
	background: transparent url(style/icn-archive.png) no-repeat left bottom;
	height: 27px;
	line-height: 36px;
	padding-left:40px;
}
h2.twit {
	background: transparent url(style/icn-smalltwit.png) no-repeat left bottom;
	height: 32px;
	line-height: 36px;
	padding-left:40px;
}
h2.recentcomments {
	background: transparent url(style/icn-com.png) no-repeat left bottom;
	height: 27px;
	line-height: 36px;
	padding-left:40px;
}
h2.tags {
	background: transparent url(style/icn-tag.png) no-repeat left bottom;
	height: 27px;
	line-height: 36px;
	padding-left:40px;
}
h2.flickr-foot {
	background: transparent url(style/icn-flickr.png) no-repeat left bottom;
	height: 27px;
	line-height: 36px;
	padding-left:40px;
}
#footer h2 {
	color: #000000;
	margin-bottom:20px;
	text-shadow: none;
	font-family:'QlassikMediumRegular', Tahoma, Arial, sans-serif;
	font-weight: bold;
}
#footer a {
	color:#000000;
}
#footer a:hover {
	color:#FFF;
	text-decoration: none;
}
#footer .col3 {
	margin-top:80px;
}

#footer {
	background-image: url(style/footer-top.jpg);
	background-repeat: repeat-x;
	background-position: top;
	min-width: 960px;
	display: block;
	overflow: hidden;
	height:350px;
}
.footer-content {
	width:960px;
	margin: 0 auto;
}
#footer-bottom {
	background-color:black;
	background-repeat: repeat-x;
	background-position: top;
	min-width: 960px;
	display: block;
	height: 71px;
}
#footer-bottom-light {
	background-image: url(style/footer-bottom-light.jpg);
	background-repeat: no-repeat;
	background-position: top center;
	min-width: 960px;
	height:2px;
}
.footer-bottom-content {
	width: 960px;
	margin:23px auto;
}
.copyright {
	float:left;
	text-align: left;
}
.copyright p {
	color:#aaaaaa;
	font-size:11px;
}
.social {
	float:right;
}

.tree
{
    float:right;
    margin-top:-200px;
    }
 .tree_e
 {
       float:left;
       margin-left:340px;
    margin-top:-122px;  
    }   
    .tree_social
{
    float:right;
    margin-top:-190px;
    }
.twit
{   float:left;
   margin-right:40px;
   margin-top:-20px;
    }
.social1
{
   float:left;
   margin-right:20px;
   margin-top:2px;
    }
  .social2
{
    float:left;
     margin-right:20px;
   margin-top:0px;
    }
    .social3
{
   float:left;
   margin-right:20px;
   margin-top:-5px;
    }
    
     .social4
{
     float:left;
   margin-right:15px;
   margin-top:5px;
    }
  .social5
  {  
      float:left;
   margin-right:20px;
   margin-top:0px;
      }


/* Twitter on Footer*/
/* ----------------------------------------- */

.twitter {
	display: block;
	margin-top:25px;
}
.twitter p {
	font-family: Georgia, "Times New Roman", serif;
	font-style: italic;
}
.twitter-top {
	background-image: url(style/twitter-top.png);
	background-repeat: no-repeat;
	width: 280px;
	height:19px;
}
.twitter-mid {
	background-image: url(style/twitter-mid.png);
	background-repeat: repeat-y;
	width: 240px;
	padding:20px;
	padding-top:0;
	padding-bottom:0;
	margin-top:-4px;
}
.twitter-bottom {
	background-image: url(style/twitter-bottom.png);
	background-repeat: no-repeat;
	width: 280px;
	height:110px;
}
.message {
	padding:0;
	color: #717171;
	font-family: Georgia, "Times New Roman", serif;
	font-style:italic;
	display: block;
}
#twitter ul {
	padding:0;
	margin: 0;
	list-style: none;
}
#twitter ul li {
	background-image: none;
	list-style: none;
	padding:0;
	margin: 0;
	font-size:13px;
	line-height:20px;
}
#footer .message a {
	font-weight:normal;
	text-decoration: none;
	color: #6d9120;
}
em.twitterTime a {
	text-decoration: none;
	font-style: normal;
	color:#6d9120;
	font-size:10px;
	display: inline-block;
}
em.twitterTime a:hover {
	text-decoration: underline;
}
.username {
	padding-top:5px;
	display: block;
}

/* Flickr on Footer */
/* ----------------------------------------- */

ul.footer-flickr {
	list-style: none;
}
ul.footer-flickr li {
	background: none;
	float:left;
}
#footer ul.footer-flickr li {
	background-image:none;
	padding:0;
	margin: 0;
	margin-right: 10px;
	margin-bottom: 10px;
}
ul.footer-flickr li img {
	margin: 0;
	padding: 0;
	padding:10px;
	width:62px;
	height:62px;
	float:left;
	-webkit-border-radius: 8px;
	-moz-border-radius: 8px;
	border-radius: 8px;
	background-color: #202020;
}
#footer ul.footer-flickr li img:hover {
	background-color: #0f0f0f;
}


/* Tags on Footer */
/* ----------------------------------------- */

#footer ul.tags {
	padding:0;
	margin:0;
	width:400px;
	height: 8px;
	line-height: 10px;
	padding-top:7px;
	white-space:nowrap;
}
#footer ul.tags li {
	background-image:none;
	padding:0;
	margin: 0;
	height: 30px;
	display: inline;
	float: left;
	margin-right: 8px;
	margin-bottom: 5px;
}
#footer ul.tags li a
{
    color: #FFFFCC;
    -webkit-border-radius: 8px;
    -moz-border-radius: 8px;
    border-radius: 8px;
    padding: 3px 8px 5px 8px;
    background-image: url('style/sade.png');
}
#footer ul.tags li a:hover
{
    background-color: #0f0f0f;
    color: #FFCC66;
}
.co{
background-color: hsl(82, 46%, 45%);
}

/* Hover Button 1 */
.fb5 {
	background-color: #db6600;
	padding-left:6px;
	padding-right:6px;
	padding-top:3px;
	padding-bottom:3px;	
	color: #ffffff;
	border:1px solid #db6600;
	background-image: url(style/button_bg.jpg);
}
.fb5:hover {
	background-color: #000000;	
	border:1px solid #000000;
	background-image: url(style/button_bg_over.jpg);
}
</style>

</head>

<body class="co">
<div class="imag">

<table align="right">
  <tr>
    <td><a href="Admin.jsp">Admin Page</a></td> 
  </tr>
  <tr>
    <td><a href="Login.jsp">Login</a></td>
    <td><a href="UserRegisteration.jsp">Register</a></td>
  </tr>
</table>
	<div><img alt="" src="Logo Images/online_exam_logo.png" height="50" width="200"> Type Here Name </div>
	
<!-- Start css3menu.com BODY section -->
<ul id="css3menu1" class="topmenu">
	<li class="topfirst"><a href="#" style="height:18px;line-height:18px;">Home</a></li>
	<li class="topmenu"><a href="#" style="height:18px;line-height:18px;"><span>Products</span></a>
	<ul>
		<li><a href="#"><span>Home</span></a>
		<ul>
			<li><a href="#">Item 1 0 3</a></li>
			<li><a href="#">Item 1 0 2</a></li>
			<li><a href="#"><span>Item 1 0 1</span></a>
			<ul>
				<li><a href="#">Item 1 0 1 0</a></li>
			</ul></li>
			<li><a href="#">Item 1 0 0</a></li>
		</ul></li>
		<li><a href="#">Item 1 1</a></li>
		<li><a href="#">Item 1 2</a></li>
		<li><a href="#">Item 1 3</a></li>
	</ul></li>
	<li class="topmenu"><a href="#" style="height:18px;line-height:18px;">About Us</a></li>
	<li class="topmenu"><a href="#" style="height:18px;line-height:18px;"><span>Software</span></a>
	<ul>
		<li><a href="#"><span>Item 3 0</span></a>
		<ul>
			<li><a href="#">Item 3 0 0</a></li>
		</ul></li>
		<li><a href="#">Item 3 1</a></li>
		<li><a href="#">Item 3 2</a></li>
		<li><a href="#">Item 3 3</a></li>
		<li><a href="#">Item 3 4</a></li>
	</ul></li>
	<li class="topmenu"><a href="#" style="height:18px;line-height:18px;">Service</a></li>
	<li class="toplast"><a href="#" style="height:18px;line-height:18px;">Contact Us</a></li>
</ul>
<!-- End css3menu.com BODY section -->


<!-- Start WOWSlider.com BODY section --> <!-- add to the <body> of your page -->
	<div id="wowslider-container1">
	<div class="ws_images"><ul>
		<li><img src="data1/images/1.jpg" alt="1" title="1" id="wows1_0"/></li>
		<li><img src="data1/images/online_exam.jpg" alt="online_exam" title="online_exam" id="wows1_1"/></li>
		<li><a href="#"><img src="data1/images/slide_1.jpg" alt="wowslider.com" title="slide_1" id="wows1_2"/></a></li>
		<li><img src="data1/images/yearlongenrolment.jpg" alt="year-long-enrolment" title="year-long-enrolment" id="wows1_3"/></li>
	</ul></div>
	<div class="ws_bullets"><div>
		<a href="#" title="D-E-E-N-D-A-Y-A-l"><span><img src="data1/tooltips/1.jpg" alt="1"/>1</span></a>
		<a href="#" title="D-E-E-N-D-A-Y-A-l"><span><img src="data1/tooltips/online_exam.jpg" alt="online_exam"/>2</span></a>
		<a href="#" title="D-E-E-N-D-A-Y-A-l"><span><img src="data1/tooltips/slide_1.jpg" alt="Deendayal"/>3</span></a>
		<a href="#" title="D-E-E-N-D-A-Y-A-l"><span><img src="data1/tooltips/yearlongenrolment.jpg" alt="D-E-E-N-D-A-Y-A-l"/>4</span></a>
	</div></div><div class="ws_script" style="position:absolute;left:-99%"><a href="#">Deendayal</a></div>
	<div class="ws_shadow"></div>
	</div>	
	<script type="text/javascript" src="engine1/wowslider.js"></script>
	<script type="text/javascript" src="engine1/script.js"></script>
	<!-- End WOWSlider.com BODY section -->
	<!-- <div class="hello1"><h3 class="partner"><img src="Social-Media/forecast-bar-mac-icon-100594597-gallery.png" width="60" height="25" >Our Coprates Partners</h3>
<marquee behavior="alternate"><img src="Logo Images/online_exam_logo.png" width="36" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		<img src="Logo Images/online_exam_logo.png" width="100" height="50">
		</marquee>
</div> -->
	</div>
	
	<div class="col4-wrap">

<h1 class="intro">
We aspire for a green world & a serene life for all and this is our contribution towards it Trendsetterz,
<a target="_blank" href="http://trendsetterz.co.in">go green... </a>
<span></span>
</h1>

<div class="col4center">

<h3>Who We Are</h3>
<p>Go E School is an imagination of people at
 Trendsetterz, a web designing and software
  development firm set up by a group of 
  young and imaginative professionals who 
  aim at bridging creativity and excellence. </p>
  
  <div class="view">
<div class="fb5">
View Details
<span></span>
</div>
</div>

</div>

<div class="col4center">

<h3>Who We Are</h3>
<p>Go E School is an imagination of people at
 Trendsetterz, a web designing and software
  development firm set up by a group of 
  young and imaginative professionals who 
  aim at bridging creativity and excellence. </p>
<div class="view">
<div class="fb5">
View Details
<span></span>
</div>
</div>

</div>

<div class="col4center">

<h3>Who We Are</h3>
<p>Go E School is an imagination of people at
 Trendsetterz, a web designing and software
  development firm set up by a group of 
  young and imaginative professionals who 
  aim at bridging creativity and excellence. </p>
<div class="view">
<div class="fb5">
View Details
<span></span>
</div>
</div>

</div>

<div class="col4center">

<h3>Who We Are</h3>
<p>Go E School is an imagination of people at
 Trendsetterz, a web designing and software
  development firm set up by a group of 
  young and imaginative professionals who 
  aim at bridging creativity and excellence. </p>
<div class="view">
<div class="fb5">
View Details
<span></span>
</div>
</div>

</div>


</div>


<div class="col2-wrap">
<div class="col2">
<h2 class="about">Home</h2>
<p>
<span class="dropcap">G</span>
o E School is an imagination of people at Trendsetterz, a web designing and software development firm set up by a group of young and imaginative professionals who aim at bridging creativity and excellence.
</p>
<p>In spite of being from diverse backgrounds and unlike abilities we had a dream to make the world experience an outstanding imprint of technology. We came into effect in June, 2010 and just within such a short span of time we succeeded in gathering a huge chain of clients and became a trustworthy and reliable option for them. We always try to do something unconventional and unusual.</p>
<p>
We are well known for our outstanding website designs, creative logos, open social development and our reach towards every latest technology that exist in the IT world. We are an official partner of Microsoft Partner Network and are collaborated with Microsoft Bizspark & the Reseller Club. For more information about us visit
<a target="_blank" href="#">Go to New Link.</a>
</p>
<a class="button2" href="item.html">
Read more about us
<span></span>
</a>
</div>
<div class="col2">
<div class="latest">
<h2 class="work">Latest Work</h2>
<ul class="frame">
<table>
	<tr>
		<td>
			<li><a title="1"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
		<td>
			<li><a title="2"  href="image/2.png">
			<img  alt="" src="art/2.jpg"></a></li>
		</td>
		<td>
			<li><a title="2" href="image/3.png">
			<img  alt="" src="art/3.jpg"></a></li>
		</td>
		<td>
			<li><a title="2"  href="image/4.png">
			<img  alt="" src="art/4.jpg"></a></li>
		</td>
		
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
		
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
	</tr>
	
	<tr>
		<td>
			<li><a title="1"  href="image/5.png">
			<img  alt="" src="art/6.jpg"></a></li>
		</td>
		<td>
			<li><a title="2"  href="image/6.png">
			<img  alt="" src="art/6.jpg"></a></li>
		</td>
		<td>
			<li><a title="2" href="image/7.png">
			<img  alt="" src="art/7.jpg"></a></li>
		</td>
		<td>
			<li><a title="2"  href="image/8.png">
			<img  alt="" src="art/8.jpg"></a></li>
		</td>
		
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
		
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
	</tr>
	
	<tr>
		<td>
			<li><a title="1"  href="image/9.png">
			<img  alt="" src="art/9.jpg"></a></li>
		</td>
		<td>
			<li><a title="2"  href="image/15.png">
			<img  alt="" src="art/6.jpg"></a></li>
		</td>
		<td>
			<li><a title="2" href="image/16.png">
			<img  alt="" src="art/7.jpg"></a></li>
		</td>
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
		
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
		
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
	</tr>
	
	<tr>
		<td>
			<li><a title="1"  href="image/9.png">
			<img  alt="" src="art/9.jpg"></a></li>
		</td>
		<td>
			<li><a title="2"  href="image/15.png">
			<img  alt="" src="art/6.jpg"></a></li>
		</td>
		<td>
			<li><a title="2" href="image/16.png">
			<img  alt="" src="art/7.jpg"></a></li>
		</td>
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
		
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
		
		<td>
			<li><a title="2"  href="image/1.png">
			<img  alt="" src="art/1.jpg"></a></li>
		</td>
		
		
		
	</tr>
	
</ul>
</table>
	</div>
</div>


</div>
</div>


<div id="footer">
<div class="footer-content">
<div class="col3-wrap">
<div class="col3">
<h2 class="recentposts">Our Partners</h2>
<ul class="unordered">
<li>
<a href="#">Microsoft Partner Network</a>
</li>
<li>
<a href="#">Microsoft Bizspark</a>
</li>
<li>
<a href="#">Reseller Club</a>
</li>
<li>
<a href="#">Rackspace Hosting</a>
</li>
<li>
<a href="#">The Pinnacle Group Inc. India</a>
</li>
</ul>
</div>
<div class="col3">
<h2 class="tags">Other Services</h2>
<ul class="tags">
<li>
<a href="#">Graphic Designing</a>
</li>
<li>
<a href="#">SMS services</a>
</li>
<li>
<a href="#">Hosting Solutions</a>
</li>
<li>
<a href="#">Open Social Development</a>
</li>
<li>
<a href="#">SEO</a>
</li>
<li>
<a href="#">Game Development</a>
</li>
<li>
<a href="#">Content Writing</a>
</li>
<li>
<a href="#">I-phone Application Development</a>
</li>
<li>
<a href="#">Android Development</a>
</li>
<li>
<a href="#">Facebook Application Development</a>
</li>
<li>
<a href="#">IT solutions for business</a>
</li>
</ul>
</div>
</div>
</div>
<div class="tree">
<img alt="" src="style/tree.png">
</div>
<div class="tree_social">
<a href="#">
<img class="twit" alt="Twitter" src="style/icn-smalltwit.png">
</a>
<a href="#">
<img class="social1" alt="Facebook" src="style/social1.png">
</a>
<a href="#">
<img class="social2" alt="Tumblr" src="style/social2.png">
</a>
<a href="#">
<img class="social3" alt="Flickr" src="style/social3.png">
</a>
<a href="#">
<img class="social4" alt="StumbleUpon" src="style/social4.png">
</a>
<a href="#">
<img class="social5" alt="Delicious" src="style/social5.png">
</a>
</div>
<div class="tree_e">
<img alt="" src="style/e.png">
</div>
</div>

<div id="footer-bottom">
<div id="footer-bottom-light"></div>
<div class="footer-bottom-content">
<div class="copyright">
<p>Deendayal Kumawat</p>
</div>
<div class="social">
<a target="_blank" href="#">
<img src="art/logo_small.png">
</a>
</div>
</div>
</div>
	<!-- <table width="100px">
	<tr>
		<td><div class="hello"><p><marquee behavior="scroll" direction="up" scrollamount="3">The CSS box model is essentially a box that wraps</p> <p>around every HTML element. It consists of: borders</p>
<p>padding, margins, and the actual content.</marquee></p></div></td>

		<td><div class="hello"><p><marquee behavior="scroll" direction="up" scrollamount="3">The CSS box model is essentially a box that wraps</p> <p>around every HTML element. It consists of: borders</p>
<p>padding, margins, and the actual content.</marquee></p></div></td>
		<td><div class="hello"><p><marquee behavior="scroll" direction="up" scrollamount="3">The CSS box model is essentially a box that wraps</p> <p>around every HTML element. It consists of: borders</p>
<p>padding, margins, and the actual content.</marquee></p></div></td>
<td><div class="hello"><p><marquee behavior="scroll" direction="up" scrollamount="3">The CSS box model is essentially a box that wraps</p> <p>around every HTML element. It consists of: borders</p>
<p>padding, margins, and the actual content.</marquee></p></div></td>

		<td><div class="hello"><p>The CSS box model is essentially a box that wraps</p> <p>around every HTML element. It consists of: borders</p>
<p>padding, margins, and the actual content.</p></div></td>
	</tr>
	</table> -->
	
	
	
<!-- <div class="hello1"><p>The CSS box model is essentially a box that wraps around every HTML element. </p>
<p>The CSS box model is essentially a box that wraps around every HTML element. It consists of: borders
padding, margins, and the actual content.</p>
<p>The CSS box model is essentially a box that wraps around every HTML element. It consists of: borders
padding, margins, and the actual content.</p>
<p>The CSS box model is essentially a box that wraps around every HTML element. It consists of: borders
padding, margins, and the actual content.</p>
</div> -->
<!-- <div class="hello1">
<marquee behavior="alternate"><img src="Logo Images/online_exam_logo.png" width="100" height="50"><img src="Logo Images/online_exam_logo.png" width="100" height="50"><img src="Logo Images/online_exam_logo.png" width="100" height="50"></marquee>
</div> -->
<!-- <table>
		<tr>
			<td>
				<div class="right">
  					<p>In my younger and more vulnerable<p/> 
  					<p>years my father gave me some advice</p>
  					<p>that I've been turning over in my </p>
				</div>
			</td>
			<td>
			<div class="left">
  				<p>In my younger and more vulnerable<p/> 
  					<p>years my father gave me some advice</p>
  					<p>that I've been turning over in my </p>
			</div>
			</td>
		</tr>
		
</table>



<div class="textbox">
  <p>In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that 
  
 In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
   In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that 
  
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.
  In my younger and more vulnerable years my father gave me some advice that 
  </p>
</div>



	<div class="textfooter"><footer> Follow On 
	<img src="Social-Media/1475833053__Google.png" width="40" height="40">
	<img src="Social-Media/1475833053__Google.png" width="40" height="40">
	<img src="Social-Media/1475833053__Google.png" width="40" height="40">
	<img src="Social-Media/1475833053__Google.png" width="40" height="40">
	</footer></div>
	<footer> Follow On 
	<img src="Social-Media/1475833053__Google.png" width="40" height="40">
	<img src="Social-Media/1475833053__Google.png" width="40" height="40">
	<img src="Social-Media/1475833053__Google.png" width="40" height="40">
	<img src="Social-Media/1475833053__Google.png" width="40" height="40">
	</footer> -->
</body>
</html>
