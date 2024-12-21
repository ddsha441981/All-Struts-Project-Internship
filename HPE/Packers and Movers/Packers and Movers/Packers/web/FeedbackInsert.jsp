
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
    function validation(){  
    
    var feedid=document.feed.feedid.value;  
    var name=document.feed.name.value;  
    var company=document.feed.company.value;  
    var address=document.feed.address.value;  
    var city=document.feed.city.value;  
    var pincode=document.feed.pincode.value;  
    var y=document.feed.email.value;  
    var atposition=y.indexOf("@");  
    var dotposition=y.lastIndexOf(".");      
    var phone=document.feed.phone.value;  
    var exper=document.feed.exper.value;  
    var comment=document.feed.comment.value;  
   

    if((feedid==null || feedid =="")||(name==null || name =="")||(company==null || company=="")||(address==null || address=="")||(city==null || city=="")||(pincode==null || pincode=="")||(email==null || email=="")||(phone==null || phone=="")||(exper==null || exper=="")||(comment==null || comment=="")){
            alert("Some Fields are be blank!!!!");
         return false;  
        }  
  if (atposition<1 || dotposition<atposition+2 || dotposition+2>=y.length){  
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
      
        <div id="b_lft"> <img src="images/Feedback1.jpg" alt="" /><br />
          
          <!--but-->
        </div>
        <!--b_lft-->
      </div>
    
    <form name="feed" class="form-horizontal" method="post" action="feedback" onsubmit="return validation()">
                         <div class="row"
                         </div>
          
                            <div class="form-group">
                            <lable for="feedid" class="text-center col-lg-2 control-lable"> FeedBack Id:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control"  name="feedid" pattern='[0-9\\s]*'/>
                               
                            </div>
                        
                      <lable for="name" class="text-center col-lg-2 control-lable">Name:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="Name" name="name" pattern='[A-Za-z \\s]*'/>
                                    
                                    
                            </div>
                                                         
                        
                        </div>
                    </div>
                        <div class="form-group">
                            <lable for="company" class="text-center col-lg-2 control-lable">Company:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="Company Name" name="company" pattern='[A-Za-z \\s]*'/>
                            </div>

                            <div>
                                <lable for="address" class="text-center col-lg-2 control-lable">Address:-</lable>
                                <div class="col-lg-4">
                                    <textarea class="form-control" placeholder="Address" name="address"></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="city" class="text-center col-lg-2 control-lable">City:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control"  placeholder="City" name="city" pattern='[A-Za-z\\s]*'/>
                                  
           
                            </div>
                            <div>
                                <lable for="pincode" class="text-center col-lg-2 control-lable">Pin-Code:-</lable>
                                <div class="col-lg-4">  
                                    <input type="text" class="form-control" placeholder="Pin-Code" name="pincode" pattern='[0-9\\s]*'/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="email" class="text-center col-lg-2 control-lable">Email:-</lable>
                            <div class="col-lg-4">
                                <input type="email" class="form-control" placeholder="Email" name="email"/>
                            </div>
                            
                           <lable for="phone" class="text-center col-lg-2 control-lable">Phone:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="Phone" name="phone" pattern='[0-9\\s]*'/>
                            </div>
                        </div>
                        <div class="form-group">
                            <lable for="exper" class="text-center col-lg-2 control-lable">Experience:-</lable>
                            <div class="col-lg-4">
                                <input type="text" class="form-control" placeholder="Experience" name="exper" pattern='[A-Za-z\\s]*'/>
                            </div>
                            <lable for="comment" class="text-center col-lg-2 control-lable">Comments:-</lable>
                            <div class="col-lg-4">
                                <textarea class="form-control" placeholder="Comments" name="comment"></textarea>
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
