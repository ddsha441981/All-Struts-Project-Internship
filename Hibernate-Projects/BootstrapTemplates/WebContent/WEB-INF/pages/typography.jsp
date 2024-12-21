<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

 <!-- BEGIN HEAD -->
<head>
     <meta charset="UTF-8" />
    <title>BCORE Admin Dashboard Template | Typography</title>
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
                    <h1 class="page-header">Typography</h1>
                </div>
            </div>
                    
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="box">
                                <header>
                                    <h5>Box > Body
                   
                                        <small>10px padding</small>
                                    </h5>
                                </header>
                                <div class="body">
                                    <pre class="prettyprint linenums">
&lt;div class=&quot;box&quot;&gt;
 &lt;header&gt;
  &lt;h5&gt;Title&lt;/h5&gt;
 &lt;/header&gt;
 &lt;div class=&quot;body&quot;&gt;Content;&lt;/div&gt;
&lt;/div&gt;</pre>
                                </div>
                            </div>
                        </div>
                        <!-- /.col-lg-6 -->
                        <div class="col-lg-6">
                            <div class="box">
                                <header>
                                    <h5>Box > Block
                   
                                        <small>No padding</small>
                                    </h5>
                                </header>
                                <div class="block">
                                    <pre class="prettyprint linenums">
&lt;div class=&quot;box&quot;&gt;
  &lt;header&gt;
    &lt;h5&gt;Title&lt;/h5&gt;
  &lt;/header&gt;
    &lt;div class=&quot;block&quot;&gt;Content&lt;/div&gt;
&lt;/div&gt;</pre>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="box">
                                <header>
                                    <h5>Label</h5>
                                    <div class="toolbar">
                                        <span class="label label-default">label</span>
                                    </div>
                                </header>
                                <div class="body">
                                    <table class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Labels</th>
                                                <th>Markup</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <span class="label label-default">Default</span>
                                                </td>
                                                <td>
                                                    <code>&lt;span class="label label-default"&gt;Default&lt;/span&gt;</code>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <span class="label label-success">Success</span>
                                                </td>
                                                <td>
                                                    <code>&lt;span class="label label-success"&gt;Success&lt;/span&gt;</code>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <span class="label label-warning">Warning</span>
                                                </td>
                                                <td>
                                                    <code>&lt;span class="label label-warning"&gt;Warning&lt;/span&gt;</code>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <span class="label label-danger">Danger</span>
                                                </td>
                                                <td>
                                                    <code>&lt;span class="label label-danger"&gt;Important&lt;/span&gt;</code>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <span class="label label-info">Info</span>
                                                </td>
                                                <td>
                                                    <code>&lt;span class="label label-info"&gt;Info&lt;/span&gt;</code>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="box">
                                <header>
                                    <h5>Badge</h5>
                                    <div class="toolbar">
                                        <span class="badge">badge</span>
                                    </div>
                                </header>
                                <div class="body">
                                    <table class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Name</th>
                                                <th>Example</th>
                                                <th>Markup</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Default
                            </td>
                                                <td>
                                                    <span class="badge">1</span>
                                                </td>
                                                <td>
                                                    <code>&lt;span class="badge"&gt;1&lt;/span&gt;</code>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
            <div class="row">
                <div class="col-lg-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Headings
                        </div>
                        <div class="panel-body">
                            <h1>Heading 1
                                <small>Sub-heading</small>
                            </h1>
                            <h2>Heading 2
                                <small>Sub-heading</small>
                            </h2>
                            <h3>Heading 3
                                <small>Sub-heading</small>
                            </h3>
                            <h4>Heading 4
                                <small>Sub-heading</small>
                            </h4>
                            <h5>Heading 5
                                <small>Sub-heading</small>
                            </h5>
                            <h6>Heading 6
                                <small>Sub-heading</small>
                            </h6>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Paragraphs
                        </div>
                        <div class="panel-body">
                            <p class="lead">This is an example of lead body copy.</p>
                            <p>This is an example of standard paragraph text. This is an example of <a href="#">link anchor text</a> within body copy.</p>
                            <p>
                                <small>This is an example of small, fine print text.</small>
                            </p>
                            <p>
                                <strong>This is an example of strong, bold text.</strong>
                            </p>
                            <p>
                                <em>This is an example of emphasized, italic text.</em>
                            </p>
                            <br>
                            <h4>Alignment Helpers</h4>
                            <p class="text-left">Left aligned text.</p>
                            <p class="text-center">Center aligned text.</p>
                            <p class="text-right">Right aligned text.</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Emphasis Classes
                        </div>
                        <div class="panel-body">
                            <p class="text-muted">This is an example of muted text.</p>
                            <p class="text-primary">This is an example of primary text.</p>
                            <p class="text-success">This is an example of success text.</p>
                            <p class="text-info">This is an example of info text.</p>
                            <p class="text-warning">This is an example of warning text.</p>
                            <p class="text-danger">This is an example of danger text.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Abbreviations
                        </div>
                        <div class="panel-body">
                            <p>The abbreviation of the word attribute is
                                <abbr title="attribute">attr</abbr>.</p>
                            <p>
                                <abbr title="HyperText Markup Language" class="initialism">HTML</abbr>is an abbreviation for a programming language.</p>
                            <br />
                            <h4>Addresses</h4>
                            <address>
                                <strong>Twitter, Inc.</strong>
                                <br />795 Folsom Ave, Suite 600
                                <br />San Francisco, CA 94107
                                <br />
                                <abbr title="Phone">P:</abbr>(123) 456-7890
                            </address>
                            <address>
                                <strong>Full Name</strong>
                                <br />
                                <a href="mailto:#">first.last@example.com</a>
                            </address>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Blockquotes
                        </div>
                        <div class="panel-body">
                            <h4>Default Blockquote</h4>
                            <blockquote>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
                            </blockquote>
                            <h4>Blockquote with Citation</h4>
                            <blockquote>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
                                <small>Someone famous in
                                    <cite title="Source Title">Source Title</cite>
                                </small>
                            </blockquote>
                            <h4>Right Aligned Blockquote</h4>
                            <blockquote class="pull-right">
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
                            </blockquote>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Lists
                        </div>
                        <div class="panel-body">
                            <h4>Unordered List</h4>
                            <ul>
                                <li>List Item</li>
                                <li>List Item</li>
                                <li>
                                    <ul>
                                        <li>List Item</li>
                                        <li>List Item</li>
                                        <li>List Item</li>
                                    </ul>
                                </li>
                                <li>List Item</li>
                            </ul>
                            <h4>Ordered List</h4>
                            <ol>
                                <li>List Item</li>
                                <li>List Item</li>
                                <li>List Item</li>
                            </ol>
                            <h4>Unstyled List</h4>
                            <ul class="list-unstyled">
                                <li>List Item</li>
                                <li>List Item</li>
                                <li>List Item</li>
                            </ul>
                            <h4>Inline List</h4>
                            <ul class="list-inline">
                                <li>List Item</li>
                                <li>List Item</li>
                                <li>List Item</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Description Lists
                        </div>
                        <div class="panel-body">
                            <dl>
                                <dt>Standard Description List</dt>
                                <dd>Description Text</dd>
                                <dt>Description List Title</dt>
                                <dd>Description List Text</dd>
                            </dl>
                            <dl class="dl-horizontal">
                                <dt>Horizontal Description List</dt>
                                <dd>Description Text</dd>
                                <dt>Description List Title</dt>
                                <dd>Description List Text</dd>
                            </dl>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Code
                        </div>
                        <div class="panel-body">
                            <p>This is an example of an inline code element within body copy. Wrap inline code within a
                                <code>&lt;code&gt;...&lt;/code&gt;</code>tag.</p>
                            <pre>This is an example of preformatted text.</pre>
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
