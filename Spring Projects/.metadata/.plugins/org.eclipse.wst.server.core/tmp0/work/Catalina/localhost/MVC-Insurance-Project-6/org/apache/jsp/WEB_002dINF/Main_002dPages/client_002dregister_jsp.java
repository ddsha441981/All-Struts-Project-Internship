/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2017-02-18 21:31:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Main_002dPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class client_002dregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("      \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\">   \r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--For Date  -->\r\n");
      out.write("<!-- PopUp CDN -->\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> -->\r\n");
      out.write("  <style>\r\n");
      out.write("  .modal-header, h4, .close {\r\n");
      out.write("      background-color: #5cb85c;\r\n");
      out.write("      color:white !important;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      font-size: 30px;\r\n");
      out.write("  }\r\n");
      out.write("  .modal-footer {\r\n");
      out.write("      background-color: #f9f9f9;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("<title>Client Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msgofpolicyholder}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Trigger the modal with a button -->\r\n");
      out.write("  <button type=\"button\" class=\"btn btn-default btn-sm\" id=\"myBtn\">Add New Client</button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("     <!-- Modal -->\r\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("    \r\n");
      out.write("      <!-- Modal content-->\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\" style=\"padding:35px 50px;\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-lock\"></span> Register New Client</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\r\n");
      out.write("      <form class=\"form-horizontal\" role=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/registerclientbyAgent\" method=\"post\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("\r\n");
      out.write("          <!-- Form Name -->\r\n");
      out.write("          <legend>Clients Details</legend>\r\n");
      out.write("\r\n");
      out.write("          <!-- Text input-->\r\n");
      out.write("          <!-- <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">client Id</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Client Id\" name=\"clientId\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div> -->\r\n");
      out.write("\r\n");
      out.write("          <!-- Text input-->\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Client Name</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Client Name\" name=\"clientName\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Email</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Client Email\" name=\"clientemail\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Password</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Password\" name=\"clientpassword\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Confirm Password</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Confirm Password\" name=\"clientcfpassword\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Text input-->\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Address</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <textarea rows=\"5\" cols=\"5\" class=\"form-control\" placeholder=\"Enter Address\" name=\"clientaddress\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Text input-->\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Gender</label>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <input type=\"radio\"  name=\"clientgender\" value=\"male\">Male\r\n");
      out.write("              <input type=\"radio\" name=\"clientgender\" value=\"female\">Female\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Pancard No</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Pancard No\" name=\"clientpanNo\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Date of Birth</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\"  placeholder=\"Enter date of Birth\" name=\"clientdob\">\r\n");
      out.write("            </div> \r\n");
      out.write("            <!-- \r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Date of Birth</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("            <input type=\"text\" class=\"span2\" value=\"02-16-2012\" id=\"dp1\" >\r\n");
      out.write("          </div>-->\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Mobile No</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Mobile No\" name=\"clientmobNo\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">State</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter State\" name=\"clientstate\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">PostCode</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" placeholder=\"Post Code\" name=\"clientpostcode\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Occuption</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Occuption\" name=\"clientoccuption\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Annual Income</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" placeholder=\"Enter Annual Income\" name=\"clientincome\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Text input-->\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Country</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\" placeholder=\"Country\" class=\"form-control\" name=\"clientcountry\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("              <div class=\"pull-right\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-danger\">Cancel</button>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success\">Save</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </fieldset>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div><!-- /.col-lg-12 -->\r\n");
      out.write("</div><!-- /.row -->\r\n");
      out.write("</div></div></div></div>\r\n");
      out.write("\r\n");
      out.write("<!-- Table data -->\r\n");
      out.write("<table id=\"myTable\" class=\"table table-striped\" >  \r\n");
      out.write("        <thead>  \r\n");
      out.write("          <tr>  \r\n");
      out.write("            <th>Client Id</th>  \r\n");
      out.write("            <th>Client Name</th>  \r\n");
      out.write("            <th>Client Email</th>  \r\n");
      out.write("            <th>Client Password</th> \r\n");
      out.write("            <th>Client Cf Password</th>\r\n");
      out.write("             <th>Address</th>  \r\n");
      out.write("            <th>Gender</th>  \r\n");
      out.write("            <th>Pan No</th> \r\n");
      out.write("            <th>DoB</th>  \r\n");
      out.write("            <th>Mobile No</th>\r\n");
      out.write("            <th>State</th>\r\n");
      out.write("            <th>PostCode</th>\r\n");
      out.write("            <th>Occuption</th>\r\n");
      out.write("            <th>Income</th>\r\n");
      out.write("            <th>Countery</th>\r\n");
      out.write("            <th>Agent Id</th>\r\n");
      out.write("            <th>Action</th>\r\n");
      out.write("            <th>Action</th>\r\n");
      out.write("         \r\n");
      out.write("          </tr>  \r\n");
      out.write("        </thead>  \r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("        <tbody>  \r\n");
      out.write("          <tr>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientemail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientpassword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientcfpassword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientaddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientgender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientpanNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientdob}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientmobNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientstate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientpostcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientoccuption}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientincome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientcountry}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.agentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("          <td><a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/selectJoindata/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.clientId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"button\" class=\"btn btn-success\" id=\"myBtn\">Vehicle Insurance</a></td>\r\n");
      out.write("          <td><a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/healthInsurancebyAgents/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewbyId.agentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"button\" class=\"btn btn-success\" id=\"myBtn\">Health Insurance</a></td>\r\n");
      out.write("          \r\n");
      out.write("            \r\n");
      out.write("          </tr>  \r\n");
      out.write("          \r\n");
      out.write("        </tbody> \r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("      </table>  \r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  \r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $('#myTable').dataTable();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $(\"#myBtn\").click(function(){\r\n");
      out.write("        $(\"#myModal\").modal();\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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
