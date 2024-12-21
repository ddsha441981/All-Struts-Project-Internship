<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>One page website template for multipurpose website</title>
      <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0"/>
    <meta charset="utf-8" />
     <link rel="shortcut icon" href="image/favicon.ico" type="image/x-icon" />
    <meta name="robots" content="index, follow" />
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta http-equiv="content-language" content="en" />
    <meta name="keywords" content="mz,mzcreatives,creatives,template,website,onepage,webdesign,portfolio,build website,themeforest" />
    <meta name="description" content="Now you can buy or use template from themeforest design by mzcreatives" />
    <meta property="og:title" content="One page website template for multipurpose website" /> -->


     <!---Common css---->
        <link href="css/common.css" rel="stylesheet" type="text/css" />
        <!----Media queries css--->
         <link href="css/style.css" type="text/css" rel="stylesheet" />
         <link href="css/theme1024.css" rel="stylesheet" type="text/css" />
        <link href="css/theme990.css" rel="stylesheet" type="text/css" />
        <link href="css/theme768.css" rel="stylesheet" type="text/css" />
        <link href="css/theme480.css" rel="stylesheet" type="text/css" />
        <link href="css/theme320.css" rel="stylesheet" type="text/css" />
        <link href="css/theme319.css" rel="stylesheet" type="text/css" />
    <link href="css/quickweb.css" rel="stylesheet" type="text/css" />
     <link href="fonts/style.css" rel="stylesheet" type="text/css" />   
   <link href="css/slider_css.css" type="text/css" rel="stylesheet" />
    <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,600,700,900' rel='stylesheet' type='text/css'/>


    <script src="js/jquery-ui.js"></script>
    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/slider.js"></script>
    <script src="js/plugin.js"></script>
</head>
<body>

<div class="main">
      <!--------------------------------------2Header2.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="header.jsp"></jsp:include>
					
  	 <!-- ------------------------------------------------------------------------------------------------------------------------------- --> 
        
     <!--------------------------------------bannerImage.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="bannerImage.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- --> 
        

 <section class="contact section-padding color-white">
        <div class="container">
            <div class="main-title font-color-m-light">Contact Us</div>
            <p class="main-content">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vitae nibh nisl. Cras et mauris eget lorem ultricies ferme ntum a in diam. </p>
            <form action="MAILTO:gargk13@gmail.com"  method="post" enctype="text/plain">
            <div class="col-12">
                <div class="textbox-set col-12">
                    <div class="col-6 mb-6 textbox-box padding-tblr"><input type="text" class="textbox" placeholder="Name*" id="name" /></div>
                    <div class="col-6 mb-6 textbox-box padding-tblr"><input type="text" class="textbox" placeholder="Phone" /></div>
                    <div class="col-12 textbox-box padding-tblr"><input type="text" class="textbox" placeholder="Email*" id="email" /></div>
                    
                    <div class="col-12 textbox-box padding-tblr"><textarea  class="col-12 textbox" placeholder="Message*" style="height:100px;padding:10px 0px;resize:none;" id="message" ></textarea></div>

                    <div class="send padding-lr"><button id="send_email" value="Send" class="view-template" style="border:none;border-bottom: 2px solid #64A548;" onclick="getCheck()">Send</button></div>
                </div>
            </div>
                </form> 
            </div>
        </section>

    
    <!--------------------------------------2Header2.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="header1.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
    
    
    <!--------------------------------------massage.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="massage.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
  	
  	
   <!--------------------------------------socialmediaImage.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="socialmediaImage.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
  	
  	
  	<!--------------------------------------client.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="client.jsp"></jsp:include>
					
   <!-- ------------------------------------------------------------------------------------------------------------------------------- -->  

   <!--------------------------------------address.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="address.jsp"></jsp:include>
					
   <!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
     
  	
  	
    <!--------------------------------------footer.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="footer.jsp"></jsp:include>
					
  	 <!-- ------------------------------------------------------------------------------------------------------------------------------- --> 
</body>
</html>