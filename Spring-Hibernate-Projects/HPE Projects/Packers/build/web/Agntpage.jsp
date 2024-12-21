
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
      <div id="banner" class="cbox">
      
        <div id="b_lft"> <img src="images/Register.jpg" alt="" /><br />
          
          <!--but-->
        </div>
        <!--b_lft-->
      </div>
      <!--banner-->
      
      <form  name="agntreg"class="form-horizontal" method="post" action="AgentInsert" onsubmit="return validate()">
                            <div class="row"
                         </div>
           
                            <div class="form-group">
                            <lable for="agentid" class="text-center col-lg-2 control-lable"> Agent Id:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="agentid" name="agentid" pattern='[0-9\\s]*'/>
                               
                            </div>
                        
                                                       
                        
                     <lable for="nameorg" class="text-center col-lg-2 control-lable">Organization Name:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="nameorg" name="nameorg" pattern='[A-Za-z \\s]*'/>
                            </div>
                        </div>
                    </div>
                        <div class="form-group">
                            <lable for="address" class="text-center col-lg-2 control-lable">Address:-</lable>
                            <div class="col-lg-4">
                                <textarea class="form-control" placeholder="address" name="address"></textarea>
                            </div>

                            <div>
                                <lable for="city" class="text-center col-lg-2 control-lable">City:-</lable>
                                <div class="col-lg-4">
                                    <input type="text" class="form-control" placeholder="city" name="city" pattern='[A-Za-z\\s]*'/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="State" class="text-center col-lg-2 control-lable">State:-</lable>
                            <div class="col-lg-4">
                                   <select class="form-control" name="state">
                                    
                                    <option value="MAHARASHTRA">MAHARASHTRA</option>
                                    <option value="GOA">GOA</option>
                                    <option value="GUJRAT">GUJRAT</option>
                                    <option value="ANDRAPRADESH">ANDRAPRADESH</option>
                                    <option value="KARNATAKA">KARNATAKA</option>
                                    
                                                                    </select>
           
                            </div>
                            <div>
                                <lable for="pincode" class="text-center col-lg-2 control-lable">Pin_code:-</lable>
                                <div class="col-lg-4">
                                    <input type="text" class="form-control" placeholder="pincode" name="pincode" pattern='[0-9\\s]*'/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="name" class="text-center col-lg-2 control-lable">Name:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="name" name="name" pattern='[A-Za-z \\s]*'/>
                            </div>
                            
                           <lable for="phone" class="text-center col-lg-2 control-lable">Phone:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="phone" name="phone" pattern='[0-9\\s]*'/>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="email" class="text-center col-lg-2 control-lable">Email:-</lable>
                            <div class="col-lg-4">
                                <input type="email" class="form-control" placeholder="email" name="email">
                            </div>
                            <lable for="user" class="text-center col-lg-2 control-lable">User_Id:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="userid" name="user">
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="password" class="text-center col-lg-2 control-lable">Password:-</lable>
                            <div class="col-lg-4">
                                <input type="password" class="form-control" placeholder="password" name="pass">
                            </div>
                            <lable for="mobile" class="text-center col-lg-2 control-lable">Mobile:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="mobile" name="mobile" pattern='[0-9\\s]*'/>
                            </div>
                        </div>
                            
                        <div class="form-group">
                            <lable for="service" class="text-center col-lg-2 control-lable">Service_Type</lable>
                            <div class="col-lg-4">
                                <select class="form-control" name="serviceid">
                                    
                                    <option value="1">households</option>
                                    <option value="2">office shiffting</option>
                                    <option value="3">cars shiffting</option>
                                    <option value="4">bike shiffting</option>
                                    <option value="5">showroom shiffting</option>
                                    <option value="6">All</option>

                                    
                                </select>
                            </div>
                        </div>
                        
                    <center><div class="btn">
                    <button type="Submit" class="btn btn-warning">Submit</button>
                        </div></center>
                
            </div>
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
                </form>
 
    </body>
</html>
