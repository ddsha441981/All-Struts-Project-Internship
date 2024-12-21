<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <!-- BEGIN HEAD -->
<head>
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Grid</title>
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
           
                <div class="inner">
                     <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Grid </h1>
                </div>
            </div> 
                    
                    
                    <div class="row">
    <div class="col-lg-12">
        <div class="box">
            <header>
                <div class="icons"><i class="icon-th"></i></div>
                <h5>Grid Inputs</h5>

                <div class="toolbar">
                    <ul class="nav pull-right">
                        <li><a href="#">Link</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="icon-th-large"></i>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Demo Link</a></li>
                                <li><a href="#">Demo Link</a></li>
                                 <li><a href="#">Demo Link</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#div-5" data-toggle="collapse" class="accordion-toggle minimize-box">
                                <i class="icon-chevron-up"></i>
                            </a>
                        </li>
                    </ul>
                </div>

            </header>
            <div id="div-5" class="accordion-body collapse in body">
                <form class="">

                    <div class="form-group row">
                        <div class="col-lg-1">
                            <input class="form-control" placeholder=".col-lg-1" type="text" />
                        </div>
                        <div class="col-lg-11">
                            <input class="form-control" placeholder=".col-lg-11" type="text" />
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-lg-2">
                            <input class="form-control" placeholder=".col-lg-2" type="text" />
                        </div>
                        <div class="col-lg-10">
                            <input class="form-control" placeholder=".col-lg-10" type="text" />
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-lg-3">
                            <input class="form-control" placeholder=".col-lg-3" type="text" />
                        </div>
                        <div class="col-lg-9">
                            <input class="form-control" placeholder=".col-lg-9" type="text" />
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-lg-4">
                            <input class="form-control" placeholder=".col-lg-4" type="text" />
                        </div>
                        <div class="col-lg-8">
                            <input class="form-control" placeholder=".col-lg-8" type="text" />
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-lg-5">
                            <input class="form-control" placeholder=".col-lg-5" type="text" />
                        </div>
                        <div class="col-lg-7">
                            <input class="form-control" placeholder=".col-lg-7" type="text" />
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-lg-6">
                            <input class="form-control" placeholder=".col-lg-6" type="text" />
                        </div>
                        <div class="col-lg-6">
                            <input class="form-control" placeholder=".col-lg-6" type="text" />
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-lg-4">
                            <input class="form-control" placeholder=".col-lg-4" type="text" />
                        </div>
                        <div class="col-lg-4">
                            <input class="form-control" placeholder=".col-lg-4" type="text" />
                        </div>
                        <div class="col-lg-4">
                            <input class="form-control" placeholder=".col-lg-4" type="text" />
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-lg-3">
                            <input class="form-control" placeholder=".col-lg-3" type="text" />
                        </div>
                        <div class="col-lg-4">
                            <input class="form-control" placeholder=".col-lg-4" type="text" />
                        </div>
                        <div class="col-lg-5">
                            <input class="form-control" placeholder=".col-lg-5" type="text" />
                        </div>
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
                <h5>.col-lg-12</h5>
                <div class="toolbar">
                    <span class="label">label</span>
                </div>
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-12&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>   
</div>


<div class="row">
    <div class="col-lg-6">
        <div class="box">
            <header>
                <h5>.col-lg-6</h5>
                <div class="toolbar">
                    <span class="label label-success">label</span>
                </div>
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-6&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>

    <div class="col-lg-6">
        <div class="box">
            <header>
                <h5>.col-lg-6</h5>
                <div class="toolbar">
                    <div class="progress 
                         progress-danger middle">
                        <div class="progress-bar" style="width: 57%"></div>
                    </div>
                </div>
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-6&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
</div>
<!-- /.row -->

<div class="row">
    <div class="col-lg-4">
        <div class="box">
            <header>
                <h5>.col-lg-4</h5>
               
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-4&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
    <div class="col-lg-4">
        <div class="box">
            <header>
                <h5>.col-lg-4</h5>
                <div class="toolbar">
                    <div class="progress mini">
                        <div class="progress-bar" style="width: 43%;"></div>
                    </div>
                </div>
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-4&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
    <div class="col-lg-4">
        <div class="box">
            <header>
                <h5>.col-lg-4</h5>
                <div class="toolbar">
                    <button class="btn btn-xs btn-primary">mini button</button>
                </div>
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-4&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
</div>

<div class="row">
    <div class="col-lg-3">
        <div class="box">
            <header>
                <h5>.col-lg-3</h5>
                <div class="toolbar">
                    <ul class="nav">
                        <li class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                Dropdown
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="">Menu Link 1</a></li>
                                <li><a href="#">Menu Link 2</a></li>
                                <li><a href="#"><i class="icon-external-link"></i> Menu Link with icon</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Menu Linkk 4</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-3&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
    <div class="col-lg-3">
        <div class="box">
            <header>
                <h5>.col-lg-3</h5>
                <div class="toolbar">
                    <button class="btn btn-danger btn-xs">button</button></div>						
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-3&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
    <div class="col-lg-3">
        <div class="box">
            <header>
                <h5>.col-lg-3</h5>
                <div class="toolbar"><input class="form-control input-sm" type="text" /></div>
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-3&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
    <div class="col-lg-3">
        <div class="box">
            <header>
                <h5>.col-lg-3</h5>
                <div class="toolbar"><i class="icon-envelope"></i> &nbsp;</div>						
            </header>
            <div class="body">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-3&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
</div>

<div class="row">
    <div class="col-lg-5">
        <div class="row">
            <div class="col-lg-7">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-7&quot;&gt;&lt;/div&gt;</pre>
            </div>
            <div class="col-lg-5">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-5&quot;&gt;&lt;/div&gt;</pre>
            </div>
        </div>
    </div>
    <div class="col-lg-7">
        <div class="row">
            <div class="col-lg-6">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-6&quot;&gt;&lt;/div&gt;</pre>
            </div>
            <div class="col-lg-6">
                <pre class="prettyprint linenums">
&lt;div class=&quot;.col-lg-6&quot;&gt;&lt;/div&gt;</pre>
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
