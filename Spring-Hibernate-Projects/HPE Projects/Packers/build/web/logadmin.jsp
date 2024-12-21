
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Safe Movers</title>
         <link href="styles/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="scripts/vwd_curvycorners.js"></script>
<script type="text/javascript" src="scripts/capply.js"></script>
<!--[if lt IE 7]>
<style type="text/css">
.home .row{
	padding-bottom:0;
}
.px_fix{
	left:1px;
	bottom:-3px;
}
</style>
<![endif]-->

<script>
        function validationform()
        {   
            var user=document.adminlogin.user.value;
            var pass=document.adminlogin.pass.value;

            if(user==null || user==""){
                alert("Name cant be blank");
                return false;
                              
            }else if(pass.length<3){
                alert("password must be at least 3 characters long.");
                return false;
                                             
            }
        }
    
    
</script>
    </head>
    <body>

        <div id="main">
  <div id="in" class="home">
    <div id="header">
    
    <a href="index.html"><img src="images/logo.png" alt="site name" /></a>
      <div id="navigation" class="cbox">

        <ul>
          <li><a href="index.html" class="active">Home</a></li>
          <li><a href="serviceclient.jsp">Services</a></li>
          <li><a href="aboutus.html">About us</a></li>
          <li><a href="clients.html">Clients</a></li>
          <li><a href="loginpage.jsp">Login</a></li>
        </ul>
       </div>
      <!--navigation-->
    </div>
    <!--header-->
    <div id="body">
      <div id="banner" class="cbox">
      
        <div id="b_lft"> <img src="images/truck.png" alt="" /><br />
          
          <!--but-->
        </div>
        <!--b_lft-->
        <div id="b_rgt"> 
          <h1>Safe Movers</h1>
          <p>Packers is a moving company in India providing household, packers and movers pune and office moving services to all domestic and local areas. Our affordable moving and packing services are created to help make the shifting from one place to another tension-free. With the assist of our trained and expert employees of moving and packing specialists, you won’t have to tensioned. Our comprehensive list of moving credentials, high consumer service, testimonials and numerous moving service awards exhibit our claim to excellence as a moving company in India   </p>
           <a href="#" class="bbut">Watch Demo</a> <a href="#" class="bbut">Learn More</a>
         
        </div>
        <!--b_rgt-->
      </div>
           <!--banner-->

      <div class="marginBottom30">
                    
                    <div class="col1-2">
                       <a class="photo" href="./"><img src="images/Admin.jpg" alt="empty" /></a>
                      
                    </div>
          <div class="col1-2">
                           <h2>Administration Login</h2>                                      
                           <form name="adminlogin"method="post" action="logins" onsubmit="return validationform()">
                            UserName:- <input type="text" name="user"/><br> <br>
                            Password:- <input type="password" name="pass"/></br></br> 
                             <input type="submit" value="Sigin"/>
                                
                </div>
      <div class="row">
        <div class="col">
          
          <img src="images/house1.jpg" alt="" />
          
        </div>
        <!--.col-->
        <div class="col">
          <img src="images/house2.jpg" alt="" />
          
        </div>
        <!--.col-->
        <div class="col last">
          <h2>Our Clients</h2>
          <img src="images/support.png" alt="" />
          <p>Pune</p>
          <p>Mumbai</p>
          <p>Banglore</p>
          <p>Delhi</p>
          <p>Keral</p>
        </div>
        <!--.col-->
      </div>
      <!--.row-->
    </div>
    <!--body-->
    <br />
    <div id="footer" class="cbox">
          <div class="fl">&copy;</div>
          <!--.fl-->
        <!--.fr-->
    </div>
    <!--footer-->
  </div>
  <!--in-->
</div>
<!--main-->
    
    
    
    </body>
</html>
