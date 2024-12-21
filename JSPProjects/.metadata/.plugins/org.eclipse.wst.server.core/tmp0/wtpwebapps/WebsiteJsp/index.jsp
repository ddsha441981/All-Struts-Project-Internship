<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
        

   <!--------------------------------------About Us.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="about_us.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
    
    <!--------------------------------------2Header2.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="header1.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
    
    
    <!--------------------------------------massage.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="massage.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
    


    <!--------------------------------------service.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="service.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
    


   <!--------------------------------------socialmediaImage.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="socialmediaImage.jsp"></jsp:include>
					
  	<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
    

        <!--<section class="key-feature section-padding color-white">
        <div class="container">
              <div class="main-title font-color-m-light">Features for Your Online Business</div>
            <p class="main-content">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vitae nibh nisl. Cras et mauris eget lorem ultricies ferme ntum a in diam. </p>

            <div class="col-5  padding-lr" >
               <div class="col-12 feature-box" style="padding:5px 0px;">
                   <div class="col-2 feature-icon"><i class="quickweb-icon-monitor"></i></div>
                   <div class="col-10 content-box">
                       <div class="feature-name">Resposive design</div>
                        <div class="feature-content">Cras tempus orci massa, id hendrerit mi egestas vitae class aptent taciti.</div>
                       </div>
                  
               </div>

                <div class="col-12 feature-box" style="padding:5px 0px;">
                    
                   <div class="col-2 feature-icon"><i class="quickweb-icon-chart-pie-1"></i></div>
                 <div class="col-10 content-box">
                       <div class="feature-name">Easy Customization</div>
                        <div class="feature-content">Cras tempus orci massa, id hendrerit mi egestas vitae class aptent taciti.</div>
                       </div>
               </div>

                  <div class="col-12 feature-box" style="padding:5px 0px;">
                   <div class="col-2 feature-icon"><i class="quickweb-icon-sliders"></i></div>
                  <div class="col-10 content-box">
                       <div class="feature-name">Step to Step Guide</div>
                        <div class="feature-content">Cras tempus orci massa, id hendrerit mi egestas vitae class aptent taciti.</div>
                       </div>
               </div>
                <div class="col-12 feature-box" style="padding:5px 0px;">
                   <div class="col-2 feature-icon"><i class="quickweb-icon-cloud-1"></i></div>
                  <div class="col-10 content-box">
                       <div class="feature-name">Secure and Reliable</div>
                        <div class="feature-content">Cras tempus orci massa, id hendrerit mi egestas vitae class aptent taciti.</div>
                       </div>
               </div>

            </div>
            
            <div class="col-7" style="">
                <div class="col-12 feature-img center" style="">
                <img src="image/monitor.png" /></div>
            </div>
        </div>
    </section>-->



   <!--------------------------------------client.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="client.jsp"></jsp:include>
					
   <!-- ------------------------------------------------------------------------------------------------------------------------------- -->  

   <!--------------------------------------address.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="address.jsp"></jsp:include>
					
   <!-- ------------------------------------------------------------------------------------------------------------------------------- -->  
     
   
   <!--------------------------------------contact_us.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="contact_us.jsp"></jsp:include>
					
    <!-- ------------------------------------------------------------------------------------------------------------------------------- --> 
   
    <!--------------------------------------footer.jsp-------------------------------------------------------------------------------->
					
					<jsp:include page="footer.jsp"></jsp:include>
					
  	 <!-- ------------------------------------------------------------------------------------------------------------------------------- --> 

        </div>
    <script type="text/javascript">
        thumb_slider({

            thumbs_to_show: 1,
            thumbs_to_move: 1,
            thumbs_width: 0,
            thumbs_count: 0,
            timeout: 10000,
            parent_id: "main_slider",
            container_class: "thumb_slider",
            thumb_class: "thumbs",
            spacing: 0,
            processing: false,
            hover: false,
            next_class: "next",
            prev_class: "prev",
            timer: setTimeout(function () { })

        });
    </script>
</body>
</html>
