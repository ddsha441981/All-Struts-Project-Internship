/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2017-03-29 12:05:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProjectChangePass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/CommonFile/projectHomecommonfile.jsp", Long.valueOf(1484235521436L));
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("  .error{\r\n");
      out.write("  color: red;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
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
      out.write("    <h4><strong>Project Manger!</strong> Change Password Form:</h4>\r\n");
      out.write("  </div>\r\n");
      out.write("  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("<!-- For Massage -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <form class=\"form-horizontal\" id=\"signupForm\" action=\"aprojectMangerLogin\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"pass\">Old Password:</label>\r\n");
      out.write("      <div class=\"col-sm-10\">          \r\n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"pass\" placeholder=\"Enter password\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"newpass\">New Password:</label>\r\n");
      out.write("      <div class=\"col-sm-10\">          \r\n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"pass\" placeholder=\"Enter password\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"pass\">Confirm Password:</label>\r\n");
      out.write("      <div class=\"col-sm-10\">          \r\n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"cfpass\" placeholder=\"Enter password\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">        \r\n");
      out.write("      <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("        <div class=\"checkbox\">\r\n");
      out.write("          <label><input type=\"checkbox\"> Remember me</label>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">        \r\n");
      out.write("      <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-success\">Submit</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
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
}
