/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2017-02-18 23:30:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Main_002dPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addnewInsurance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fs_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<title>Client Vehicls Insurance</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <!-- Trigger the modal with a button -->\r\n");
      out.write("  <button type=\"button\" class=\"btn btn-default btn-sm\" id=\"myBtn\">Add New Vehicle Insurance</button>\r\n");
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
      out.write("          <h4><span class=\"glyphicon glyphicon-lock\"></span> Vehicle Insurance</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\r\n");
      out.write("      <form class=\"form-horizontal\" role=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vehicleInsurancesave\" method=\"post\">\r\n");
      out.write("        \r\n");
      out.write("        <fieldset>\r\n");
      out.write("        <legend>Client Information</legend>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Client Id</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" readonly=\"readonly\" name=\"clientId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${retrivevalues.clientId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Client Name:</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" readonly=\"readonly\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${retrivevalues.clientName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        \r\n");
      out.write("        </fieldset>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <fieldset>\r\n");
      out.write("        <legend>Agent Information</legend>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Agent Id</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" readonly=\"readonly\" name=\"agentId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${retrivevalues.agentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Agent Name:</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${retrivevalues.agentName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("           <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Agent Email</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${retrivevalues.agentemail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Mobile No:</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${retrivevalues.agentmobNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        \r\n");
      out.write("        </fieldset>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <fieldset>\r\n");
      out.write("\r\n");
      out.write("          <!-- Form Name -->\r\n");
      out.write("         \r\n");
      out.write("          <legend>Enter Vehicle Information</legend>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Period of Insurance From</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\"  placeholder=\"Enter Date\" name=\"fromdate\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">TO</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"To date\" name=\"todate\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Date of Registration</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Date of Registration\" name=\"dateofregister\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Year of Manufacture</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" placeholder=\"Manufacture date\" name=\"manufacturedate\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Registration No</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Registration\" name=\"registerno\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Fuel Used</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" placeholder=\"Enter Fuel used\" name=\"usedfuel\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Engine No</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Engine No\" name=\"engineNo\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Cublic Capacity</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" placeholder=\"Enter Cubic\" name=\"cublic\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Chassis No</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" placeholder=\"Enter Chassis No\" name=\"chassisNo\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Make</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" placeholder=\"Enter Make\" name=\"make\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Text input-->\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Model</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\" placeholder=\"Enter Model\" class=\"form-control\" name=\"model\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write(" <fieldset>\r\n");
      out.write("        <legend>Premium Information</legend>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Insured Decfacted value(IDV)</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" name=\"idv\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Third Party:</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" name=\"thirdparty\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("           <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Service Tax</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\" name=\"servicetax\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"textinput\">Total:</label>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("              <input type=\"text\"   class=\"form-control\" name=\"total\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("           <label class=\"checkbox-radio\">PayMent Mode\r\n");
      out.write("      <input type=\"radio\" value=\"cash\" name=\"paymentMethod\">Cash\r\n");
      out.write("    </label>\r\n");
      out.write("    <label class=\"checkbox-radio\">\r\n");
      out.write("      <input type=\"radio\" value=\"cheque\" name=\"paymentMethod\">Cheque\r\n");
      out.write("    </label>\r\n");
      out.write("    <label class=\"checkbox-radio\">\r\n");
      out.write("      <input type=\"radio\" value=\"card\" name=\"paymentMethod\">Card\r\n");
      out.write("    </label>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("              <div class=\"pull-right\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\">Cancel</button>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Genrate Policy</button>\r\n");
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
      out.write("\r\n");
      out.write("<table id=\"myTable\" class=\"table table-striped\" >  \r\n");
      out.write("        <thead>  \r\n");
      out.write("          <tr>  \r\n");
      out.write("            <th>Vehicle Id</th>  \r\n");
      out.write("            <th>From Date</th>  \r\n");
      out.write("            <th>To Date</th>  \r\n");
      out.write("            <th>Date Of Register</th> \r\n");
      out.write("            <th>Manufacture Date</th>\r\n");
      out.write("             <th>Register No</th>  \r\n");
      out.write("            <th>Used Fuel</th>  \r\n");
      out.write("            <th>Engine No</th> \r\n");
      out.write("            <th>Cublic</th>  \r\n");
      out.write("            <th>Chassis No</th>\r\n");
      out.write("            <th>Make</th>\r\n");
      out.write("            <th>Model</th>\r\n");
      out.write("            <th>Idv</th>\r\n");
      out.write("            <th>Third Party</th>\r\n");
      out.write("            <th>Service Tax</th>\r\n");
      out.write("            <th>Total</th>\r\n");
      out.write("            <th>Payment Method</th>\r\n");
      out.write("            <th>Agent Id</th>\r\n");
      out.write("            <th>Client Id</th>\r\n");
      out.write("            <th>Nomiee</th>\r\n");
      out.write("            \r\n");
      out.write("          </tr>  \r\n");
      out.write("        </thead>  \r\n");
      out.write("       \r\n");
      out.write("        <tbody>  \r\n");
      out.write("        ");
      if (_jspx_meth_s_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tbody> \r\n");
      out.write("  \r\n");
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
      out.write("        $(\"#myModal\").modal()    \r\n");
      out.write("       \r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_s_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_s_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fs_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_s_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fforEach_005f0.setParent(null);
    // /WEB-INF/Main-Pages/addnewInsurance.jsp(264,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_s_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/Main-Pages/addnewInsurance.jsp(264,8) '${vehicleContents}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${vehicleContents}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/Main-Pages/addnewInsurance.jsp(264,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fforEach_005f0.setVar("contents");
    int[] _jspx_push_body_count_s_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_s_005fforEach_005f0 = _jspx_th_s_005fforEach_005f0.doStartTag();
      if (_jspx_eval_s_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <tr>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.vehicleId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.fromdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.todate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.dateofregister}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.manufacturedate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.registerno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.usedfuel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.engineNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.cublic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.chassisNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.make}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.model}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.idv}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.thirdparty}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.servicetax}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.total}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.paymentMethod}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.agentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.clientId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("          <td><a  href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/vehiclesNominees/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contents.clientId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"button\" class=\"btn btn-success\" id=\"myBtn\">Vehicles Nominee</a></td>\r\n");
          out.write("          </tr>  \r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_s_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_s_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fs_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_s_005fforEach_005f0);
    }
    return false;
  }
}
