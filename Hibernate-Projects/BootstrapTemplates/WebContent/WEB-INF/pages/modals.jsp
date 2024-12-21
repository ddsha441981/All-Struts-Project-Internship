<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- BEGIN HEAD -->
<head>
   
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template  | Modals</title>
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
   <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>

    <!-- END HEAD -->

    <!-- BEGIN BODY -->
<body class="padTop53 " >

     <!-- MAIN WRAPPER -->
    <div id="wrap">


       <!-- HEADER SECTION -->
       <%@ include file="include/header.jsp" %>
        <!-- END HEADER SECTION -->





        <!--PAGE CONTENT -->
        <div id="content">

            <div class="inner" style="min-height:1000px;" >
                <div class="row">
                    <div class="col-lg-12">


                        <h2> Modal Types </h2>



                    </div>
                </div>

                <hr />
                 <div class="row">
                    <div class="col-lg-4">


                        <div class="panel panel-default">
                        <div class="panel-heading">
                           Notification Modal
                        </div>
                        <div class="panel-body">
                            <button class="btn btn-primary" data-toggle="modal" data-target="#notificationModal">
                                Click Here To Launch
                            </button>
                             
                        </div>
                    </div>
                    </div>
                       <div class="col-lg-4">


                        <div class="panel panel-default">
                        <div class="panel-heading">
                          Buttoned Modal
                        </div>
                         
                        <div class="panel-body">
                        
                            <button class="btn btn-success" data-toggle="modal" data-target="#buttonedModal">
                                Click Here To Launch
                            </button>
                           
                        </div>
                        
                    </div>
                    </div>
                       <div class="col-lg-4">


                        <div class="panel panel-default">
                        <div class="panel-heading">
                             Form Modal
                        </div>
                        <div class="panel-body">
                            <button class="btn btn-danger" data-toggle="modal" data-target="#formModal">
                                Click Here To Launch
                            </button>
                             
                        </div>
                    </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">


                        <div class="panel panel-default">
                        <div class="panel-heading">
                             New Registration Modal
                        </div>
                        <div class="panel-body">
                            <button class="btn btn-warning" data-toggle="modal"  data-target="#newReg">
                                Click Here To Launch
                            </button>
                             
                        </div>
                    </div>
                    </div>
                       <div class="col-lg-4">


                        <div class="panel panel-default">
                        <div class="panel-heading">
                          UI Elements Modal
                        </div>
                        <div class="panel-body">
                            <button class="btn btn-info" data-toggle="modal" data-target="#uiModal">
                                Click Here To Launch
                            </button>
                             
                        </div>
                    </div>
                    </div>
                       
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="modal" id="notificationModal" tabindex="-1"    role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                                        </div>
                                        <div class="modal-body">
                                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                                        </div>
                                      
                                    </div>
                                </div>
                            </div>
                    </div>
                       <div class="col-lg-12">
                        <div class="modal fade" id="buttonedModal" tabindex="-1" role="dialog"  aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="H1">Modal title</h4>
                                        </div>
                                        <div class="modal-body">
                                            
                                            Do you want to save Contents
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                            <button type="button" class="btn btn-primary">Save changes</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </div>
                   <div class="col-lg-12">
                        <div class="modal fade" id="formModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="H2">Modal Form</h4>
                                        </div>
                                        <div class="modal-body">
                                           <form role="form">
                                        <div class="form-group">
                                            <label>Text Input</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Text Input with Placeholder</label>
                                            <input class="form-control" placeholder="Enter text" />
                                        </div>
                                        <div class="form-group">
                                            <label>Static Control</label>
                                            <p class="form-control-static">email@example.com</p>
                                        </div>
                                       
                                    </form>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                            <button type="button" class="btn btn-primary">Save changes</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </div>
                    
                    <div class="col-lg-12">
                        <div class="modal fade" id="uiModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="H3">Modal UI Elements</h4>
                                        </div>
                                        <div class="modal-body">
                                           <form role="form">
                                        <div class="form-group">
                                            <label>Text Input</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Text Input with Placeholder</label>
                                            <input class="form-control" placeholder="Enter text" />
                                        </div>
                                        <div class="form-group">
                                            <label>Static Control</label>
                                            <p class="form-control-static">email@example.com</p>
                                        </div>
                                        <div class="form-group">
                                            <label>File input</label>
                                            <input type="file" />
                                        </div>
                                        <div class="form-group">
                                            <label>Text area</label>
                                            <textarea class="form-control" rows="3"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label>Checkboxes</label>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="" />Checkbox 1
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="" />Checkbox 2
                                                </label>
                                            </div>
                                            
                                        </div>
                                        <div class="form-group">
                                            <label>Inline Checkboxes</label>
                                            <label class="checkbox-inline">
                                                <input type="checkbox" />1
                                            </label>
                                            <label class="checkbox-inline">
                                                <input type="checkbox" />2
                                            </label>
                                            
                                        </div>
                                        <div class="form-group">
                                            <label>Radio Buttons</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="Radio1" value="option1" checked="checked" />Radio 1
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="Radio2" value="option2" />Radio 2
                                                </label>
                                            </div>
                                            
                                        </div>
                                        <div class="form-group">
                                            <label>Inline Radio Buttons</label>
                                            <label class="radio-inline">
                                                <input type="radio" name="optionsRadiosInline" id="Radio4" value="option1" checked="checked" />1
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="optionsRadiosInline" id="Radio5" value="option2" />2
                                            </label>
                                           
                                        </div>
                                        <div class="form-group">
                                            <label>Selects</label>
                                            <select class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                               
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label>Multiple Selects</label>
                                            <select multiple="multiple" class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                               
                                            </select>
                                        </div>
                                    </form>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                            <button type="button" class="btn btn-primary">Save changes</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </div>
                     <div class="col-lg-12">
                        <div class="modal fade" id="newReg" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="H4"> New Registration</h4>
                                        </div>
                                        <div class="modal-body">
                                           <form role="form">
                                        <div class="form-group">
                                            <label>Username</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Email</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       <div class="form-group">
                                            <label>Password</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Retype Password</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       
                                    </form>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                            <button type="button" class="btn btn-primary">Save changes</button>
                                        </div>
                                    </div>
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
   
</body>
    <!-- END BODY -->
</html>
