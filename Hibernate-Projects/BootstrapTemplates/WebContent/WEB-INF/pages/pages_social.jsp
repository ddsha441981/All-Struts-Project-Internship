<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- BEGIN HEAD -->
<head>
      <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Social Page</title>
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
    <link rel="stylesheet" href="assets/plugins/social-buttons/social-buttons.css" />
    <!-- END PAGE LEVEL  STYLES -->
      <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
    <!-- BEGIN HEAD -->

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


                        <h2> Social Page Components </h2>



                    </div>
                </div>

                <hr />
                <div class="row">
                    <div class="col-lg-5">
                        <div class="chat-panel panel panel-primary">
                            <div class="panel-heading">
                                <i class="icon-comments"></i>
                                Chat
                            <div class="btn-group pull-right">
                                <button type="button" data-toggle="dropdown">
                                    <i class="icon-chevron-down"></i>
                                </button>
                                <ul class="dropdown-menu slidedown">
                                    <li>
                                        <a href="#">
                                            <i class="icon-refresh"></i> Refresh
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class=" icon-comment"></i> Available
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-time"></i> Busy
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-tint"></i> Away
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-signout"></i> Sign Out
                                        </a>
                                    </li>
                                </ul>
                            </div>
                            </div>

                            <div class="panel-body">
                                <ul class="chat">
                                    <li class="left clearfix">
                                        <span class="chat-img pull-left">
                                            <img src="assets/img/1.png" alt="User Avatar" class="img-circle" />
                                        </span>
                                        <div class="chat-body clearfix">
                                            <div class="header">
                                                <strong class="primary-font"> Jack Sparrow </strong>
                                                <small class="pull-right text-muted">
                                                    <i class="icon-time"></i> 12 mins ago
                                                </small>
                                            </div>
                                             <br />
                                            <p>
                                                Lorem ipsum dolor sit amet, bibendum ornare dolor, quis ullamcorper ligula sodales.
                                            </p>
                                        </div>
                                    </li>
                                    <li class="right clearfix">
                                        <span class="chat-img pull-right">
                                            <img src="assets/img/2.png" alt="User Avatar" class="img-circle" />
                                        </span>
                                        <div class="chat-body clearfix">
                                            <div class="header">
                                                <small class=" text-muted">
                                                    <i class="icon-time"></i> 13 mins ago</small>
                                                <strong class="pull-right primary-font"> Jhony Deen</strong>
                                            </div>
                                            <br />
                                            <p>
                                                Lorem ipsum dolor sit amet, consectetur a dolor, quis ullamcorper ligula sodales.
                                            </p>
                                        </div>
                                    </li>
                                    <li class="left clearfix">
                                        <span class="chat-img pull-left">
                                            <img src="assets/img/3.png" alt="User Avatar" class="img-circle" />
                                        </span>
                                        <div class="chat-body clearfix">
                                            <div class="header">
                                                <strong class="primary-font"> Jack Sparrow </strong>
                                                <small class="pull-right text-muted">
                                                    <i class="icon-time"></i> 12 mins ago
                                                </small>
                                            </div>
                                             <br />
                                            <p>
                                                Lorem ipsum dolor sit amet, bibendum ornare dolor, quis ullamcorper ligula sodales.
                                            </p>
                                        </div>
                                    </li>
                                    <li class="right clearfix">
                                        <span class="chat-img pull-right">
                                            <img src="assets/img/4.png" alt="User Avatar" class="img-circle" />
                                        </span>
                                        <div class="chat-body clearfix">
                                            <div class="header">
                                                <small class=" text-muted">
                                                    <i class="icon-time"></i> 13 mins ago</small>
                                                <strong class="pull-right primary-font"> Jhony Deen</strong>
                                            </div>
                                            <br />
                                            <p>
                                                Lorem ipsum dolor sit amet, consectetur a dolor, quis ullamcorper ligula sodales.
                                            </p>
                                        </div>
                                    </li>
                                </ul>
                            </div>

                            <div class="panel-footer">
                                <div class="input-group">
                                    <input id="btn-input" type="text" class="form-control input-sm" placeholder="Type your message here..." />
                                    <span class="input-group-btn">
                                        <button class="btn btn-warning btn-sm" id="btn-chat">
                                            Send
                                        </button>
                                    </span>
                                </div>
                            </div>

                        </div>
                    </div>
                    <div class="col-lg-5">
                    <div class="panel panel-danger">
                            <div class="panel-heading">
                                <i class="icon-bell"></i> Notifications Alerts Panel
                            </div>

                            <div class="panel-body">
                                <div class="list-group">
                                    <a href="#" class="list-group-item">
                                        <i class=" icon-comment"></i> New Comment
                                    <span class="pull-right text-muted small"><em> 4 minutes ago</em>
                                    </span>
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <i class="icon-twitter"></i> 3 New Followers
                                    <span class="pull-right text-muted small"><em> 12 minutes ago</em>
                                    </span>
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <i class="icon-envelope"></i> Message Sent
                                    <span class="pull-right text-muted small"><em> 27 minutes ago</em>
                                    </span>
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <i class="icon-tasks"></i> New Task
                                    <span class="pull-right text-muted small"><em>43 minutes ago</em>
                                    </span>
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <i class="icon-upload"></i> Server Rebooted
                                    <span class="pull-right text-muted small"><em>11:32 AM</em>
                                    </span>
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <i class="icon-warning-sign"></i> Server Crashed!
                                    <span class="pull-right text-muted small"><em>11:13 AM</em>
                                    </span>
                                    </a>
                                   
                                    <a href="#" class="list-group-item">
                                        <i class="icon-ok"></i> New Order Placed
                                    <span class="pull-right text-muted small"><em>9:49 AM</em>
                                    </span>
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <i class=" icon-money"></i> Payment Received
                                    <span class="pull-right text-muted small"><em>Yesterday</em>
                                    </span>
                                    </a>
                                </div>

                                <a href="#" class="btn btn-default btn-block btn-primary">View All Alerts</a>
                            </div>

                        </div>
                    </div>
                    <div class="col-lg-2">
                          <div class="panel panel-default">
                        <div class="panel-heading">
                            Social Buttons
                        </div>
                        <div class="panel-body">
                            


                            <div class="text-center">
                                <a class="btn btn-social-icon btn-bitbucket"><i class="icon-bitbucket"></i></a>
                                <a class="btn btn-social-icon btn-dropbox"><i class="icon-dropbox"></i></a>
                                <a class="btn btn-social-icon btn-facebook"><i class="icon-facebook"></i></a>
                                <a class="btn btn-social-icon btn-flickr"><i class="icon-flickr"></i></a>
                                <a class="btn btn-social-icon btn-github"><i class="icon-github"></i></a>
                                <a class="btn btn-social-icon btn-google-plus"><i class="icon-google-plus"></i></a>
                                <a class="btn btn-social-icon btn-instagram"><i class="icon-instagram"></i></a>
                                <a class="btn btn-social-icon btn-linkedin"><i class="icon-linkedin"></i></a>
                                <a class="btn btn-social-icon btn-pinterest"><i class="icon-pinterest"></i></a>
                                <a class="btn btn-social-icon btn-tumblr"><i class="icon-tumblr"></i></a>
                                <a class="btn btn-social-icon btn-twitter"><i class="icon-twitter"></i></a>
                                <a class="btn btn-social-icon btn-vk"><i class="icon-vk"></i></a>
                            </div>
                            </div>
                                 </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Social Buttons
                            </div>

                            <div class="panel-body">
                                
                                <a class="btn btn-block btn-social btn-bitbucket">
                                    <i class="icon-bitbucket"></i>Sign in with Bitbucket
                                </a>
                                <a class="btn btn-block btn-social btn-dropbox">
                                    <i class="icon-dropbox"></i>Sign in with Dropbox
                                </a>
                                <a class="btn btn-block btn-social btn-facebook">
                                    <i class="icon-facebook"></i>Sign in with Facebook
                                </a>
                                <a class="btn btn-block btn-social btn-flickr">
                                    <i class="icon-flickr"></i>Sign in with Flickr
                                </a>
                                </div>

                        </div>
                    </div>
                    <div class="col-lg-4">
<div class="panel panel-default">
                            <div class="panel-heading">
                                Social Buttons
                            </div>

                            <div class="panel-body">
                               
                                <a class="btn btn-block btn-social btn-github">
                                    <i class="icon-github"></i>Sign in with GitHub
                                </a>
                                <a class="btn btn-block btn-social btn-google-plus">
                                    <i class="icon-google-plus"></i>Sign in with Google
                                </a>
                                <a class="btn btn-block btn-social btn-instagram">
                                    <i class="icon-instagram"></i>Sign in with Instagram
                                </a>
                                <a class="btn btn-block btn-social btn-linkedin">
                                    <i class="icon-linkedin"></i>Sign in with LinkedIn
                                </a>
                              


                            </div>

                        </div>
                    </div>
                    <div class="col-lg-4">
<div class="panel panel-default">
                            <div class="panel-heading">
                                Social Buttons 
                            </div>

                            <div class="panel-body">
                            
                                <a class="btn btn-block btn-social btn-pinterest">
                                    <i class="icon-pinterest"></i>Sign in with Pinterest
                                </a>
                                <a class="btn btn-block btn-social btn-tumblr">
                                    <i class="icon-tumblr"></i>Sign in with Tumblr
                                </a>
                                <a class="btn btn-block btn-social btn-twitter">
                                    <i class="icon-twitter"></i>Sign in with Twitter
                                </a>
                                <a class="btn btn-block btn-social btn-vk">
                                    <i class="icon-vk"></i>Sign in with VK
                                </a>


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
