<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

 <!-- BEGIN HEAD -->
<head>
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Form Editors</title>
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
    <link rel="stylesheet" href="assets/plugins/Font-Awesome/css/font-awesome.css" />
     <link rel="stylesheet" href="assets/plugins/wysihtml5/dist/bootstrap-wysihtml5-0.0.2.css" />
    <link rel="stylesheet" href="assets/css/Markdown.Editor.hack.css" />
    <link rel="stylesheet" href="assets/plugins/CLEditor1_4_3/jquery.cleditor.css" />
    <link rel="stylesheet" href="assets/css/jquery.cleditor-hack.css" />
    <link rel="stylesheet" href="assets/css/bootstrap-wysihtml5-hack.css" />
     <style>
                        ul.wysihtml5-toolbar > li {
                            position: relative;
                        }
                    </style>
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


                        <h2> WYSIWYG / Editors</h2>



                    </div>
                </div>

                <hr />

                 
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="box">
                                <header>
                                    <div class="icons"><i class="icon-th-large"></i></div>
                                    <h5>Basic Editor</h5>
                                    <ul class="nav pull-right">
                                        <li>
                                            <div class="btn-group">
                                                <a class="accordion-toggle btn btn-xs minimize-box" data-toggle="collapse"
                                                    href="#div-1">
                                                    <i class="icon-minus"></i>
                                                </a>
                                                 <button class="btn btn-danger btn-xs close-box">
                                                    <i
                                                        class="icon-remove"></i>
                                                </button>
                                            </div>
                                        </li>
                                    </ul>
                                </header>
                                <div id="div-1" class="body collapse in">
                                    <form>
                                        <textarea id="wysihtml5" class="form-control" rows="10"></textarea>

                                        <div class="form-actions">
                                            <br />
                                            <input type="submit" value="Submit" class="btn btn-primary" />
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
                                    <div class="icons"><i class="icon-th-large"></i></div>
                                    <h5>WYSIWYG Editor</h5>
                                    <ul class="nav pull-right">
                                        <li>
                                            <div class="btn-group">
                                                <a class="accordion-toggle btn btn-xs minimize-box" data-toggle="collapse"
                                                    href="#cleditorDiv">
                                                    <i class="icon-minus"></i>
                                                </a>
                                                <button class="btn btn-xs btn-danger close-box">
                                                    <i
                                                        class="icon-remove"></i>
                                                </button>
                                            </div>
                                        </li>
                                    </ul>
                                </header>

                                <div id="cleditorDiv" class="body collapse in">
                                    <form>
                                        <textarea id="cleditor" class="form-control"></textarea>

                                        <div class="form-actions no-margin-bottom" id="cleditorForm">
                                            <br />
                                            <input type="submit" value="Submit" class="btn btn-primary" />
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
                                    <h5>Markdown Editor</h5>
                                    <ul class="nav nav-tabs pull-right">
                                        <li class="active"><a href="#markdown" data-toggle="tab">Markdown</a></li>
                                        <li><a href="#preview" data-toggle="tab">Preview</a></li>
                                    </ul>
                                </header>
                                <div id="div-3" class="body tab-content">
                                    <div class="tab-pane fade active in" id="markdown">
                                        <div class="wmd-panel">
                                            <div id="wmd-button-bar" class="btn-toolbar"></div>
                                            <textarea class="form-control wmd-input" rows="10" name="description" id="wmd-input">
**Demo Text**
                        </textarea>
                                             <div class="form-actions no-margin-bottom" id="Div1">
                                            <br />
                                            <input type="submit" value="Submit" class="btn btn-primary" />
                                        </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade" id="preview">
                                        <div id="wmd-preview" class="wmd-panel wmd-preview"></div>
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
     <script src="assets/plugins/wysihtml5/lib/js/wysihtml5-0.3.0.js"></script>
    <script src="assets/plugins/bootstrap-wysihtml5-hack.js"></script>
    <script src="assets/plugins/CLEditor1_4_3/jquery.cleditor.min.js"></script>
    <script src="assets/plugins/pagedown/Markdown.Converter.js"></script>
    <script src="assets/plugins/pagedown/Markdown.Sanitizer.js"></script>
    <script src="assets/plugins/Markdown.Editor-hack.js"></script>
    <script src="assets/js/editorInit.js"></script>
    <script>
        $(function () { formWysiwyg(); });
        </script>

     <!--END PAGE LEVEL SCRIPTS -->

</body>
     <!-- END BODY -->
</html>
