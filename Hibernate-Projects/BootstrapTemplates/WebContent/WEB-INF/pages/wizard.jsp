<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <!-- BEGIN HEAD -->
<head>
   
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Wizard</title>
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
    <link href="assets/plugins/jquery-steps-master/demo/css/normalize.css" rel="stylesheet" />
    <link href="assets/plugins/jquery-steps-master/demo/css/wizardMain.css" rel="stylesheet" />
    <link href="assets/plugins/jquery-steps-master/demo/css/jquery.steps.css" rel="stylesheet" />    
    <!-- END PAGE LEVEL  STYLES -->
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

            <div class="inner" >
                <div class="row">
                    <div class="col-lg-12">


                        <h2> Wizard Page </h2>



                    </div>
                </div>

                <hr />

                
                <div class="row">
                  <div class="col-lg-12">
                     
         <div class="panel panel-default">
                        <div class="panel-heading">
                            Vertical Wizard
                        </div>
                        <div class="panel-body">
                            <div id="wizardV" >
                <h2> Personal </h2>
                <section>
                   
                           <form role="form">
                                        <div class="form-group">
                                            <label>First Name</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       
                                       <div class="form-group">
                                            <label>Last Name</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Email</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Retype Email</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                      
                                       
                                    </form>
                    
                </section>

                <h2> Login </h2>
                <section>
                   <form role="form">
                                        <div class="form-group">
                                            <label>Username</label>
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
                                        <div class="form-group">
                                            <label> Security Code </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       
                                    </form>
                </section>

                <h2>Extras </h2>
                <section>
                      <form role="form">
                                        <div class="form-group">
                                            <label> Occupation </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label> Qualification </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       <div class="form-group">
                                            <label> Age </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label> Notes </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       
                                    </form>
                </section>

                <h2>Agreement</h2>
                <section>
                    <p style="text-align:justify;color:gray;">
                        <b> Agreement & Declaration</b> <br /><br />
                        Morbi ornare tellus at elit ultrices id dignissim lorem elementum. Sed eget nisl at justo condimentum dapibus. Fusce eros justo, 
                        pellentesque non euismod ac, rutrum sed quam. Ut non mi tortor. Vestibulum eleifend varius ullamcorper. Aliquam erat volutpat.
                        <br />  <br /> 
                        Donec diam massa, porta vel dictum sit amet, iaculis ac massa. Sed elementum dui commodo lectus sollicitudin in auctor mauris 
                        venenatis. Quisque at sem turpis, id sagittis diam. Suspendisse malesuada eros posuere mauris vehicula vulputate. Aliquam sed sem tortor. 
                        Quisque sed felis ut mauris feugiat iaculis nec ac lectus. Sed consequat vestibulum purus, imperdiet varius est pellentesque vitae. 
                        Suspendisse consequat cursus eros, vitae tempus enim euismod non. Nullam ut commodo tortor.
                        <br />
                       
                        
                    </p>
                </section>
            </div>
                             
                        </div>
                    </div>

           

            
                 </div>
                </div>
                <div class="row">
                    <div class="col-lg-9">
                     
         <div class="panel panel-default">
                        <div class="panel-heading">
                            Horizontal Wizard
                        </div>
                        <div class="panel-body">
                            <div id="wizard" >
                <h2> Personal </h2>
                <section>
                   
                           <form role="form">
                                        <div class="form-group">
                                            <label>First Name</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       
                                       <div class="form-group">
                                            <label>Last Name</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Email</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Retype Email</label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                      
                                       
                                    </form>
                    
                </section>

                <h2> Login </h2>
                <section>
                   <form role="form">
                                        <div class="form-group">
                                            <label>Username</label>
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
                                        <div class="form-group">
                                            <label> Security Code </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       
                                    </form>
                </section>

                <h2>Extras </h2>
                <section>
                      <form role="form">
                                        <div class="form-group">
                                            <label> Occupation </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label> Qualification </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       <div class="form-group">
                                            <label> Age </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="form-group">
                                            <label> Notes </label>
                                            <input class="form-control" />
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                       
                                    </form>
                </section>

                <h2>Agreement</h2>
                <section>
                    <p style="text-align:justify;color:gray;">
                        <b> Agreement & Declaration</b> <br /><br />
                        Morbi ornare tellus at elit ultrices id dignissim lorem elementum. Sed eget nisl at justo condimentum dapibus. Fusce eros justo, 
                        pellentesque non euismod ac, rutrum sed quam. Ut non mi tortor. Vestibulum eleifend varius ullamcorper. Aliquam erat volutpat.
                        <br />  <br /> 
                        Donec diam massa, porta vel dictum sit amet, iaculis ac massa. Sed elementum dui commodo lectus sollicitudin in auctor mauris 
                        venenatis. Quisque at sem turpis, id sagittis diam. Suspendisse malesuada eros posuere mauris vehicula vulputate. Aliquam sed sem tortor. 
                        Quisque sed felis ut mauris feugiat iaculis nec ac lectus. Sed consequat vestibulum purus, imperdiet varius est pellentesque vitae. 
                        Suspendisse consequat cursus eros, vitae tempus enim euismod non. Nullam ut commodo tortor.
                        <br />
                       
                        
                    </p>
                </section>
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
    <!-- PAGE LEVEL SCRIPTS -->
    <script src="assets/plugins/jquery-steps-master/lib/jquery.cookie-1.3.1.js"></script>
    <script src="assets/plugins/jquery-steps-master/build/jquery.steps.js"></script>   
    <script src="assets/js/WizardInit.js"></script>
         <!--END PAGE LEVEL SCRIPTS -->
</body>
     <!-- END BODY -->
</html>
