
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Safe Movers</title>
          <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
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
    function validate(){  
    var agentid=document.agntreg.agentid.value;  
    var nameorg=document.agntreg.nameorg.value;
    var address=document.agntreg.address.value;
    var city=document.agntreg.city.value;
    var pincode=document.agntreg.pincode.value;
    var name=document.agntreg.name.value;
    var phone=document.agntreg.phone.value;
    var x=document.agntreg.email.value;  
    var atposition=x.indexOf("@");  
    var dotposition=x.lastIndexOf(".");      
    var user=document.agntreg.user.value;
    var pass=document.agntreg.pass.value;
    var mobile=document.agntreg.mobile.value;  
    

    if((agentid==null || agentid =="")||(nameorg==null || nameorg =="")||(address==null || address=="")||(city==null || city=="")||(pincode==null || pincode=="")||(name==null || name=="")||(phone==null || phone=="")||(email==null || email=="")||(user==null || user=="")||(pass==null || pass=="")&&(mobile==null || mobile=="")){
            alert("Some Fields are be blank!!!!");
         return false;  
        }  
   if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
  alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);  
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
           <li><a href="logagents.jsp">Back</a></li>
         
       </div>
      <!--navigation-->
    </div>
    <!--header-->

        <div id="body">
                              <center><h1 style="background-color: #d5d5d5">Change Password</h1></center>

        </div>
      <form  name="agntreg"class="form-horizontal" method="post" action="agntpassupdate.jsp" onsubmit="return validate()">
                            <div class="row"
                         </div>
           
                            <div class="form-group">
                            <lable for="user" class="text-center col-lg-2 control-lable"> User_Id:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="userid" name="user"/>
                               
                            </div>
                        
                                                       
                            <div class="form-group">
                        
                     <lable for="pass" class="text-center col-lg-2 control-lable">Password:-</lable>
                            <div class="col-lg-4">
                                <input type="password" class="form-control" placeholder="Password" name="pass"/>
                            </div>
                        </div>
                            </div>
                        
                    <center><div class="btn">
                    <button type="Submit" class="btn btn-warning">Change Password</button>
                        </div></center>
                                </form>

           
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
