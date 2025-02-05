<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <!-- BEGIN HEAD -->
<head>
      <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Form Validations</title>
     <meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
     <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <!-- GLOBAL STYLES -->
    <!-- GLOBAL STYLES -->
  
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="assets/css/main.css" />
    <link rel="stylesheet" href="assets/css/theme.css" />
    <link rel="stylesheet" href="assets/css/MoneAdmin.css" />
    <link rel="stylesheet" href="assets/plugins/Font-Awesome/css/font-awesome.css" />
    <!--END GLOBAL STYLES -->

    <!-- PAGE LEVEL STYLES -->
     <link rel="stylesheet" href="assets/plugins/validationengine/css/validationEngine.jquery.css" />
    <!-- END PAGE LEVEL  STYLES -->
   <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
     <!-- END HEAD -->

     <!-- BEGIN BODY -->
<body class="padTop53 ">

   <!-- MAIN WRAPPER -->
    <div id="wrap">


         <!-- HEADER SECTION -->
        <%@ include file="include/header.jsp" %>
        <!-- END HEADER SECTION -->



       

        <!--PAGE CONTENT -->
        <div id="content">
           
                <div class="inner">
                    <div class="row">
                    <div class="col-lg-12">
                            
                               
                                    <h1 > Form Validations </h1>
                                  
                                
                                
                            </div>
                    </div>
                          <hr />
                       

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="box">
                                <header>
                                    <div class="icons"><i class="icon-th-large"></i></div>
                                    <h5>Block Validation</h5>
                                    <div class="toolbar">
                                        <ul class="nav">
                                            <li>
                                                <div class="btn-group">
                                                    <a class="accordion-toggle btn btn-xs minimize-box" data-toggle="collapse"
                                                        href="#collapseOne">
                                                        <i class="icon-chevron-up"></i>
                                                    </a>
                                                    <button class="btn btn-xs btn-danger close-box">
                                                        <i class="icon-remove"></i>
                                                    </button>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>

                                </header>
                                <div id="collapseOne" class="accordion-body collapse in body">
                                    <form action="#" class="form-horizontal" id="block-validate">

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Required</label>
                                            <div class="col-lg-4">
                                                <input type="text" id="required2" name="required2" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">E-mail</label>

                                            <div class="col-lg-4">
                                                <input type="email" id="email2" name="email2" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Password</label>

                                            <div class="col-lg-4">
                                                <input type="password" id="password2" name="password2" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Confirm Password</label>

                                            <div class="col-lg-4">
                                                <input type="password" id="confirm_password2" name="confirm_password2" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Date</label>

                                            <div class="col-lg-4">
                                                <input type="date" id="date2" name="date2" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Url</label>

                                            <div class="col-lg-4">
                                                <input type="url" id="url2" name="url2" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Digits Only</label>

                                            <div class="col-lg-4">
                                                <input type="text" id="digits" name="digits" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Range [5,16]</label>

                                            <div class="col-lg-4">
                                                <input type="text" id="range" name="range" class="form-control" />
                                            </div>
                                        </div>

                                        
                                        <div class="form-actions no-margin-bottom" style="text-align:center;">
                                            <input type="submit" value="Click To Validate" class="btn btn-primary btn-lg " />
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="box">
                                <header class="dark">
                                    <div class="icons"><i class="icon-ok"></i></div>
                                    <h5>Popup Validation</h5>
                                    <div class="toolbar">
                                        <ul class="nav">
                                            <li>
                                                <div class="btn-group">
                                                    <a class="accordion-toggle btn btn-xs minimize-box" data-toggle="collapse"
                                                        href="#collapse2">
                                                        <i class="icon-chevron-up"></i>
                                                    </a>
                                                    <button class="btn btn-xs btn-danger close-box"><i class="icon-remove"></i></button>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>

                                </header>
                                <div id="collapse2" class="body collapse in">
                                    <form class="form-horizontal" id="popup-validation">

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Required</label>
                                            <div class="col-lg-4">
                                                <input type="text" class="validate[required] form-control" name="req" id="req">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Select</label>
                                            <div class="col-lg-4">
                                                <select name="sport" id="sport" class="validate[required] form-control">
                                                    <option value="">Choose a sport</option>
                                                    <option value="option1">Tennis</option>
                                                    <option value="option2">Football</option>
                                                    <option value="option3">Golf</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Multiple Select</label>

                                            <div class="col-lg-4">
                                                <select name="sport2" id="sport2" multiple="multiple" class="validate[required] form-control">
                                                    <option value="">Choose a sport</option>
                                                    <option value="option1">Tennis</option>
                                                    <option value="option2">Football</option>
                                                    <option value="option3">Golf</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Url</label>

                                            <div class=" col-lg-4">
                                                <input value="http://" class="validate[required,custom[url]] form-control" type="text"
                                                    name="url1" id="url1" />
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">E-mail</label>

                                            <div class=" col-lg-4">
                                                <input class="validate[required,custom[email]] form-control" type="text" name="email1"
                                                    id="email1" />
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Password</label>

                                            <div class=" col-lg-4">
                                                <input class="validate[required] form-control" type="password" name="pass1" id="pass1" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Confirm Password</label>

                                            <div class=" col-lg-4">
                                                <input class="validate[required,equals[pass1]] form-control" type="password" name="pass2"
                                                    id="pass2" />
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Minimum field size (6)</label>

                                            <div class=" col-lg-4">
                                                <input value="" class="validate[required,minSize[6]] form-control" type="text" name="minsize1"
                                                    id="minsize1" />
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Maximum field size, optional</label>

                                            <div class=" col-lg-4">
                                                <input value="0123456789" class="validate[optional,maxSize[6]] form-control" type="text"
                                                    name="maxsize1" id="maxsize1" />
                                                <span class="help-block">note that the field is optional - it won't fail if it has no value</span>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Number</label>

                                            <div class=" col-lg-4">
                                                <input value="-33.87a" class="validate[required,custom[number]] form-control" type="text"
                                                    name="numbe2r" id="number2" />
                                                <span class="help-block">a signed floating number, ie: -3849.354, 38.00, 38, .77</span>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">IP</label>

                                            <div class=" col-lg-4">
                                                <input value="192.168.3." class="validate[required,custom[ipv4]] form-control" type="text"
                                                    name="ip" id="ip" />
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Date</label>

                                            <div class=" col-lg-4">
                                                <input value="201-12-01" class="validate[required,custom[date]] form-control" type="text"
                                                    name="date3" id="date3" />
                                                <span class="help-block">ISO 8601 dates only YYYY-mm-dd</span>
                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Date Earlier</label>

                                            <div class=" col-lg-4">
                                                <input value="2012/12/16" class="validate[custom[date],past[2012/09/13]] form-control"
                                                    type="text" name="past" id="past" />
                                                <span class="help-block">Please enter a date ealier than 2012/09/13</span>
                                            </div>
                                        </div>

                                        <div style="text-align:center" class="form-actions no-margin-bottom">
                                            <input type="submit" value=" Click To Validate" class="btn btn-primary btn-lg " />
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="box">
                                <header>
                                    <div class="icons"><i class="icon-ok"></i></div>
                                    <h5>Inline Validation</h5>
                                    <div class="toolbar">
                                        <ul class="nav">
                                            <li>
                                                <div class="btn-group">
                                                    <a class="accordion-toggle btn btn-xs minimize-box" data-toggle="collapse"
                                                        href="#collapse3">
                                                        <i class="icon-chevron-up"></i>
                                                    </a>
                                                    <button class="btn btn-xs btn-danger close-box"><i class="icon-remove"></i></button>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>

                                </header>
                                <div id="collapse3" class="accordion-body collapse in body">
                                    <form action="#" class="form-horizontal" id="inline-validate">
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Required</label>

                                            <div class="col-lg-8">
                                                <input type="text" id="required" name="required" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        
                                        
                                        
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">E-mail</label>

                                            <div class="col-lg-8">
                                                <input type="email" id="email" name="email" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Password</label>

                                            <div class="col-lg-8">
                                                <input type="password" id="password" name="password" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Confirm Password</label>

                                            <div class="col-lg-8">
                                                <input type="password" id="confirm_password" name="confirm_password" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Date</label>

                                            <div class="col-lg-8">
                                                <input type="date" id="date" name="date" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Url</label>

                                            <div class="col-lg-8">
                                                <input type="url" id="url" name="url" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                       
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Minimum 3 Chars</label>

                                            <div class="col-lg-8">
                                                <input type="text" id="minsize" name="minsize" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Maximum 6 Chars</label>

                                            <div class="col-lg-8">
                                                <input type="text" id="maxsize" name="maxsize" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Minimum 3 </label>

                                            <div class="col-lg-8">
                                                <input type="text" id="minNum" name="minNum" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-4">Maximum 16 </label>

                                            <div class="col-lg-8">
                                                <input type="text" id="maxNum" name="maxNum" class="form-control col-lg-6" />
                                            </div>
                                        </div>
                                        <div class="form-actions" style="text-align:center">
                                            <input type="submit" value="Click To Validate" class="btn btn-primary btn-lg" />
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                                       
                   
                     

                    
                    </div>
                    
                    
                    

                </div>
          <!--END PAGE CONTENT -->
        </div>
    
     <!--END MAIN WRAPPER -->

   <!-- FOOTER -->
    <%@ include file="include/footer.jsp" %>
    <!--END FOOTER -->


     <!-- GLOBAL SCRIPTS -->
    <script src="assets/plugins/jquery-2.0.3.min.js"></script>
     <script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/plugins/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    <!-- END GLOBAL SCRIPTS -->

    <!-- PAGE LEVEL SCRIPTS -->

     <script src="assets/plugins/validationengine/js/jquery.validationEngine.js"></script>
    <script src="assets/plugins/validationengine/js/languages/jquery.validationEngine-en.js"></script>
    <script src="assets/plugins/jquery-validation-1.11.1/dist/jquery.validate.min.js"></script>
    <script src="assets/plugins/daterangepicker/daterangepicker.js"></script>
    <script src="assets/js/validationInit.js"></script>
    <script>
        $(function () { formValidation(); });
        </script>
     <!--END PAGE LEVEL SCRIPTS -->
     
</body>
     <!-- END BODY -->
</html>
