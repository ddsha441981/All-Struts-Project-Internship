/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2017-03-29 12:04:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addNewQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/CommonFile/projectHomecommonfile.jsp", Long.valueOf(1484235521436L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsx_005fhead_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fckeditor_005freplace_0026_005freplace_005fbasePath_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsx_005fhead_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fckeditor_005freplace_0026_005freplace_005fbasePath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsx_005fhead_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fckeditor_005freplace_0026_005freplace_005fbasePath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \t<link rel=\"stylesheet\" href=\"validation/css/screen.css\">\r\n");
      out.write("\t<script src=\"validation/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"validation/js/jquery.validate.js\"></script>\r\n");
      out.write("\t<script src=\"validation/js/Myvalidations.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"ckeditor/ckeditor.js\"></script>\r\n");
      out.write("\t<script src=\"ckeditor/samples/js/sample.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ckeditor/samples/css/samples.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ckeditor/samples/toolbarconfigurator/lib/codemirror/neo.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!-- ***********************************CK Editors***************************************************************\r\n");
      out.write("\t *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\r\n");
      out.write("\t *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\t\r\n");
      out.write("\t *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\r\n");
      out.write("\t *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\r\n");
      out.write("\t *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\r\n");
      out.write("\t *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\r\n");
      out.write("\t *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\r\n");
      out.write("\t ***********************************CK Editors***************************************************************-->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  .error{\r\n");
      out.write("  color: red;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("  ");
      if (_jspx_meth_sx_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Project Manger Home</h1>\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>                        \r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"home.jsp\">Project Manger</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("         <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Intern <span class=\"caret\"></span></a>\r\n");
      out.write("           <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"AllIntern.action\">See All Intern</a></li>\r\n");
      out.write("            <li><a href=\"RegisterIntern.jsp\">Register Intern</a></li>\r\n");
      out.write("             <li><a href=\"viewLeaveByProject.action\">Verify Intern Leave</a></li>\r\n");
      out.write("              <li><a href=\"projectmangerverifyInterview.action\">Verify Intern Interview</a></li>\r\n");
      out.write("           \r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("         <li class=\"dropdown\">\r\n");
      out.write("         <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Batch <span class=\"caret\"></span></a>\r\n");
      out.write("           <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"addbatch11.action\">Add Batch</a></li>\r\n");
      out.write("            <li><a href=\"seeAllBatch.action\">View All Batch</a></li>\r\n");
      out.write("            <li><a href=\"addGruop11.action\">Add Group</a></li>\r\n");
      out.write("            <li><a href=\"ViewAllGroup.action\">View All Group</a></li>\r\n");
      out.write("             <li><a href=\"assignProjectTaskByprojectManger.action\">Assign Project</a></li>\r\n");
      out.write("            <li><a href=\"ViewAssignTask.action\">View Assign Project</a></li>\r\n");
      out.write("           \t<li><a href=\"AddTaskOfPjt.action\"> Add Task Of Project</a></li>\r\n");
      out.write("           \t<li><a href=\"ViewTaskOfPjt.action\"> View Task Of Project</a></li>\r\n");
      out.write("           \t<li><a href=\"createExam.jsp\">Create Exam</a></li>\r\n");
      out.write(" \t\t\t<li><a href=\"ViewExam.action\">View Exam</a></li>\r\n");
      out.write(" \t\t\t<li><a href=\"viewAddedQuestion.action\">View Added Questions</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <!-- <li><a href=\"#\">list</a></li>\r\n");
      out.write("        <li><a href=\"#\">List</a></li> -->\r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"ProjectChangepwd.action?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pmInfo.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><span class=\"glyphicon glyphicon-user\"></span> ChangePassword</a></li>\r\n");
      out.write("        <li><a href=\"logoutfrompage.action?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pmInfo.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><span class=\"glyphicon glyphicon-log-in\"></span> Log Out</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write(" <div class=\"alert alert-info\">\r\n");
      out.write("    <h4><strong>Create!</strong> Exam Form:</h4>\r\n");
      out.write("  </div>\r\n");
      out.write("  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("<!-- For Massage -->\r\n");
      out.write("  <a href=\"checkPrevious.action?exam_id=");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("\"> Check Previous Question</a>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("  <form class=\"form-horizontal\" id=\"signupForm\" action=\"saveQuestion\" method=\"get\">\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("      <label for=\"comment\">Enter Question Here :</label>\r\n");
      out.write("      <textarea class=\"form-control\" rows=\"5\" id=\"editor\" name=\"questions\"></textarea>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-2\" for=\"exam_id\">Exam Id:(ReadOnly)</label>\r\n");
      out.write("     <div class=\"col-sm-1\">\r\n");
      out.write("        <input type=\"text\" id=\"exam_id\" class=\"form-control\" name=\"exam_id\" readonly value=\"");
      if (_jspx_meth_s_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("      </div> \r\n");
      out.write("       </div>\r\n");
      out.write("      \r\n");
      out.write("     <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"optionA\">Answer Option (A):</label>\r\n");
      out.write("      \r\n");
      out.write("      <label class=\"checkbox-inline\">\r\n");
      out.write("      <input onclick=\"ATHD()\" id=\"1\" type=\"checkbox\" name=\"optionA\" value=\"\">Select It\r\n");
      out.write("    </label>\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("        <input type=\"text\" id=\"opt1\" class=\"form-control\" name=\"optionA\" placeholder=\"Enter Answer Option(A)\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"optionB\">Answer Option (B):</label>\r\n");
      out.write("      \r\n");
      out.write("      <label class=\"checkbox-inline\">\r\n");
      out.write("      <input onclick=\"ATHD()\" id=\"2\" type=\"checkbox\"  name=\"optionB\" value=\"\">Select It\r\n");
      out.write("    </label>\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("        <input type=\"text\" id=\"opt2\" class=\"form-control\" name=\"optionB\" placeholder=\"Enter Answer Option(B)\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"optionC\">Answer Option(C):</label>\r\n");
      out.write("      \r\n");
      out.write("      <label class=\"checkbox-inline\">\r\n");
      out.write("      <input onclick=\"ATHD()\" id=\"3\" type=\"checkbox\"  name=\"optionC\" value=\"\">Select It\r\n");
      out.write("    </label>\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("        <input type=\"text\" id=\"opt3\" class=\"form-control\" name=\"optionC\" placeholder=\"Enter Answer Option(C)\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"optionD\">Answer Option(D):</label>\r\n");
      out.write("      \r\n");
      out.write("      <label class=\"checkbox-inline\">\r\n");
      out.write("      <input onclick=\"ATHD()\" id=\"4\" type=\"checkbox\"   name=\"optionD\" value=\"\">Select It\r\n");
      out.write("    </label>\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("        <input type=\"text\" id=\"opt4\" class=\"form-control\" name=\"optionD\" placeholder=\"Enter Answer Option(D)\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"optionE\">Answer Option:(E)</label>\r\n");
      out.write("      \r\n");
      out.write("      <label class=\"checkbox-inline\">\r\n");
      out.write("      <input onclick=\"ATHD()\" id=\"5\" type=\"checkbox\"  name=\"optionE\" value=\"\">Select It\r\n");
      out.write("    </label>\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("        <input type=\"text\" id=\"opt5\" class=\"form-control\" name=\"optionE\" placeholder=\"Enter Answer Option(E)\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"optionG\">Answer Option:(G)</label>\r\n");
      out.write("      \r\n");
      out.write("      <label class=\"checkbox-inline\">\r\n");
      out.write("      <input onclick=\"ATHD()\" id=\"6\" type=\"checkbox\"   name=\"optionG\" value=\"\">Select It\r\n");
      out.write("    </label>\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("        <input type=\"text\" id=\"opt6\" class=\"form-control\" name=\"optionG\" placeholder=\"Enter Answer Option(G)\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("     <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"correctans\">Correct Answer:</label>\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"correctans\" placeholder=\"Enter Correct Answer\" id=\"showValues\">\r\n");
      out.write("        <input type=\"hidden\" id=\"hdnValues\" />\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"qmarks\">Question Marks:</label>\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"qmarks\" placeholder=\"Enter Marks of Question\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">        \r\n");
      out.write("      <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-success\">Submit</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      if (_jspx_meth_ckeditor_005freplace_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div id=\"p1\">\r\n");
      out.write("<div class=\"container\">  \r\n");
      out.write(" <table class=\"table table-hover\">\r\n");
      out.write(" <thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Question Id</th>\r\n");
      out.write("\t\t\t<th>Question</th>\r\n");
      out.write("\t\t\t<th>Option A</th>\r\n");
      out.write("\t\t\t<th>Option B</th>\r\n");
      out.write("\t\t\t<th>Option C</th>\r\n");
      out.write("\t\t\t<th>Option D</th>\r\n");
      out.write("\t\t\t<th>Option E</th>\r\n");
      out.write("\t\t\t<th>Option G</th>\r\n");
      out.write("\t\t\t<th>Correct Answer</th>\r\n");
      out.write("\t\t\t<th>Question Marks</th>\r\n");
      out.write("\t\t\t<th>Exam Id</th>\r\n");
      out.write("\t\t\t<th>Action</th>\r\n");
      out.write("\t\t\t<!-- <th>Action</th> -->\r\n");
      out.write("\t\t</tr>\r\n");
      out.write(" </thead>\r\n");
      out.write(" <tbody>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.question_Id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";<br></td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.questions}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";<br></td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.optionA}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";<br></td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.optionB}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.optionC}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.optionD}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.optionE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.optionG}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.correctans}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.qmarks}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.exam_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";</td>\r\n");
      out.write("\t\t\t<td><a href=\"removeQuestion.action?question_Id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myprevious.question_Id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-danger\" id=\"deletemy\">Remove Question</a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("</tbody>\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- <button id=\"PageRefresh\">Refresh a Page in jQuery</button> -->\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("// find number of checkboxes (you haven't specified if you \r\n");
      out.write("// have a set number or not. If you have a set number, just \r\n");
      out.write("// set checkboxCount to whatever number you have.\r\n");
      out.write("var checkboxCount = 0;\r\n");
      out.write("var inputTags = document.getElementsByTagName('input');\r\n");
      out.write("for (var i=0, length = inputTags.length; i<length; i++) {\r\n");
      out.write("\t//alert(\"Hello\");\r\n");
      out.write("     if (inputTags[i].type == 'checkbox') {\r\n");
      out.write("         checkboxCount++;\r\n");
      out.write("     }\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function ATHD() {\r\n");
      out.write("\t//alert(\"Total Check Box : \"+checkboxCount);\r\n");
      out.write("    var totalValue = '';\r\n");
      out.write("    for (var i = 1; i <= checkboxCount; i++) {\r\n");
      out.write("    \t//alert(i+\" - \"+document.getElementById(i).value);\r\n");
      out.write("        if (document.getElementById(i).checked){\r\n");
      out.write("        \tvar ans=document.getElementById(\"opt\"+i).value;\r\n");
      out.write("            totalValue +=ans+\",\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    document.getElementById(\"hdnValues\").value = totalValue;\r\n");
      out.write("    document.getElementById(\"showValues\").value = totalValue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sx_005fhead_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sx:head
    org.apache.struts2.dojo.views.jsp.ui.HeadTag _jspx_th_sx_005fhead_005f0 = (org.apache.struts2.dojo.views.jsp.ui.HeadTag) _005fjspx_005ftagPool_005fsx_005fhead_005fnobody.get(org.apache.struts2.dojo.views.jsp.ui.HeadTag.class);
    _jspx_th_sx_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sx_005fhead_005f0.setParent(null);
    int _jspx_eval_sx_005fhead_005f0 = _jspx_th_sx_005fhead_005f0.doStartTag();
    if (_jspx_th_sx_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsx_005fhead_005fnobody.reuse(_jspx_th_sx_005fhead_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsx_005fhead_005fnobody.reuse(_jspx_th_sx_005fhead_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /addNewQuestion.jsp(53,40) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("exam_id");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent(null);
    // /addNewQuestion.jsp(67,92) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("exam_id");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_ckeditor_005freplace_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ckeditor:replace
    com.ckeditor.CKEditorReplaceTag _jspx_th_ckeditor_005freplace_005f0 = (com.ckeditor.CKEditorReplaceTag) _005fjspx_005ftagPool_005fckeditor_005freplace_0026_005freplace_005fbasePath_005fnobody.get(com.ckeditor.CKEditorReplaceTag.class);
    _jspx_th_ckeditor_005freplace_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ckeditor_005freplace_005f0.setParent(null);
    // /addNewQuestion.jsp(164,0) name = replace type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ckeditor_005freplace_005f0.setReplace("editor");
    // /addNewQuestion.jsp(164,0) name = basePath type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ckeditor_005freplace_005f0.setBasePath("/ckeditor/");
    int _jspx_eval_ckeditor_005freplace_005f0 = _jspx_th_ckeditor_005freplace_005f0.doStartTag();
    if (_jspx_th_ckeditor_005freplace_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fckeditor_005freplace_0026_005freplace_005fbasePath_005fnobody.reuse(_jspx_th_ckeditor_005freplace_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fckeditor_005freplace_0026_005freplace_005fbasePath_005fnobody.reuse(_jspx_th_ckeditor_005freplace_005f0);
    return false;
  }
}
