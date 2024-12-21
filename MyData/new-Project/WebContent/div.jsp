<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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
	width:460px;
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
	width:1000px;
	margin-right:-40px;
	overflow: hidden;
	border: 1px;
	/* background-image: url("image/pic3.jpg"); */
}

    
.latest {
	overflow: hidden;
	width: 380px;
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
    padding:10px 10px 20px 20px;
    margin-left: 10px;
    background: url('style/back.png') no-repeat ;
    text-align: center;
    
}

.col4center p
{
    color:white;
    margin-left:-10px;
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
	width:240px;
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
	background-image: url(style/footer-bottom.jpg);
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

</style>
</head>

<body class="co">


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
<div class="button">
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
<div class="button">
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
<div class="button">
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
<div class="button">
View Details
<span></span>
</div>
</div>

</div>

</div>


<div class="col2-wrap">
<div class="col2">
<h2 class="about">About Us</h2>
<p>
<span class="dropcap">G</span>
o E School is an imagination of people at Trendsetterz, a web designing and software development firm set up by a group of young and imaginative professionals who aim at bridging creativity and excellence.
</p>
<p>In spite of being from diverse backgrounds and unlike abilities we had a dream to make the world experience an outstanding imprint of technology. We came into effect in June, 2010 and just within such a short span of time we succeeded in gathering a huge chain of clients and became a trustworthy and reliable option for them. We always try to do something unconventional and unusual.</p>
<p>
We are well known for our outstanding website designs, creative logos, open social development and our reach towards every latest technology that exist in the IT world. We are an official partner of Microsoft Partner Network and are collaborated with Microsoft Bizspark & the Reseller Club. For more information about us visit
<a target="_blank" href="http://trendsetterz.co.in">official website.</a>
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
</body>
</html>