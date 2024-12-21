
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
    var quoid=document.quotation.quoid.value;  
    var name=document.quotation.name.value;  
    var x=document.quotation.email.value;  
    var atposition=x.indexOf("@");  
    var dotposition=x.lastIndexOf(".");      
    var mobile=document.quotation.mobile.value;  
    var shiftfrom=document.quotation.shiftfrom.value;  
    var shiftto=document.quotation.shiftto.value;  
    var servicedate=document.quotation.servicedate.value;  
    var contactdate=document.quotation.contactdate.value;  
    var reference=document.quotation.reference.value;  
    var details=document.quotation.details.value;  
    

    if((quoid==null || quoid =="")||(name==null || name =="")||(email==null || email=="")||(mobile==null || mobile=="")||(shiftfrom==null || shiftto=="")||(shiftto==null || shiftto=="")||(servicedate==null || servicedate=="")||(contactdate==null || contactdate=="")||(reference==null || reference=="")||(details==null || details=="")){
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
         
       </div>
      <!--navigation-->
    </div>
    <!--header-->

        <div id="body">
      
        <div id="b_lft"> <img src="images/quo.jpg" alt="" /><br />
          
          <!--but-->
        </div>
        <!--b_lft-->
      </div>
      
    <form name="quotation" class="form-horizontal" method="post" action="Quotations" onsubmit="return validate()">
                            <div class="row"
                         </div>
           
                            <div class="form-group">
                            <lable for="quoid" class="text-center col-lg-2 control-lable"> Quotation Id:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control"  name="quoid" pattern='[0-9\\s]*'/>
                               
                            </div>
                        
                      <lable for="service" class="text-center col-lg-2 control-lable">Service_Type</lable>
                            <div class="col-lg-4">
                                <select class="form-control" name="serviceid">
                                    
                                    <option value="1">households</option>
                                    <option value="2">office shiffting</option>
                                    <option value="3">cars shiffting</option>
                                    <option value="4">bike shiffting</option>
                                    <option value="5">showroom shiffting</option>

                                </select>
                            </div>
                                                         
                        
                        </div>
                    </div>
                        <div class="form-group">
                            <lable for="name" class="text-center col-lg-2 control-lable">Name:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="Name" name="name" pattern='[A-Za-z \\s]*'/> 
                            </div>

                            <div>
                                <lable for="email" class="text-center col-lg-2 control-lable">Email:-</lable>
                                <div class="col-lg-4">
                                    <input type="email" class="form-control" placeholder="Email" name="email">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="mobile" class="text-center col-lg-2 control-lable">Mobile:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control"  placeholder="Mobile" name="mobile" pattern='[0-9\\s]*'/>
                                  
           
                            </div>
                            <div>
                                <lable for="Shiftfrom" class="text-center col-lg-2 control-lable">Shift-From:-</lable>
                                <div class="col-lg-4">
                                    <input type="text" class="form-control" placeholder="Shift-From" name="shiftfrom" pattern='[A-Za-z\\s]*'/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="shift-to" class="text-center col-lg-2 control-lable">Shift-To:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="Shift-To" name="shiftto" pattern='[A-Za-z\\s]*'/>
                            </div>
                            
                           <lable for="servicedate" class="text-center col-lg-2 control-lable">Service-Date:-</lable>
                            <div class="col-lg-4">
                                <input type="date" class="form-control" placeholder="YYYY-MM-DD" name="servicedate">
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="contactdate" class="text-center col-lg-2 control-lable">Contact-Date:-</lable>
                            <div class="col-lg-4">
                                <input type="date" class="form-control" placeholder="YYYY-MM-DD" name="contactdate">
                                                                     
                                    
                            </div>
                            <lable for="reference" class="text-center col-lg-2 control-lable">Reference:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="Reference" name="reference" pattern='[A-Za-z \\s]*'/>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="details" class="text-center col-lg-2 control-lable">Details:-</lable>
                            <div class="col-lg-4">
                                <textarea class="form-control" placeholder="Details" name="details"></textarea>
                            </div>
                          
                        </div>
                            
                        
                    <center><div class="btn">
                    <button type="Submit" class="btn btn-warning">Submit</button>
                        </div></center>
                
           
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
