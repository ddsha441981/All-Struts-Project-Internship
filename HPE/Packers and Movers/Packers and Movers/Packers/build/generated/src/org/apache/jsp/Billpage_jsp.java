package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Database.DbConnection;

public final class Billpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


int quo_id=0;
String name="";
String shift_from="";
String shift_to="";


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    try
                      {
        Connection con = DbConnection.dataConnection();
        String quo_name = request.getParameter("name");
        Statement stmt = con.createStatement();
        String str = "select quo_id,name,shift_from,shift_to from quotation where name = '"+quo_name+"'";
        ResultSet rs = stmt.executeQuery(str);
        while(rs.next())
                       {
            quo_id = rs.getInt(1);
            name = rs.getString(3);           
            shift_from = rs.getString(6);
            shift_to = rs.getString(7);
           
      
             }
    }catch(Exception e)
                       {
        
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Safe Movers</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("          <link href=\"styles/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/vwd_curvycorners.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/capply.js\"></script>\n");
      out.write("<!--[if lt IE 7]>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".home .row{\n");
      out.write("\tpadding-bottom:0;\n");
      out.write("}\n");
      out.write(".px_fix{\n");
      out.write("\tleft:1px;\n");
      out.write("\tbottom:-3px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("    <div id=\"in\" class=\"home\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("    \n");
      out.write("    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"site name\" /></a>\n");
      out.write("      <div id=\"navigation\" class=\"cbox\">\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"index.html\" class=\"active\">Home</a></li>\n");
      out.write("          <li><a href=\"serviceclient.jsp\">Services</a></li>\n");
      out.write("         \n");
      out.write("       </div>\n");
      out.write("      <!--navigation-->\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <!--header-->\n");
      out.write("\n");
      out.write("        <div id=\"body\">\n");
      out.write("      \n");
      out.write("                <center><h1 style=\"background-color: #d5d5d5\">Bill</h1></center>\n");
      out.write("                         <div class=\"row\"\n");
      out.write("                         </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("        <form name=\"bill\" class=\"form-horizontal\" method=\"post\" action=\"Billpage.jsp\" onsubmit=\"return validation()\">\n");
      out.write(" \n");
      out.write("                   <div class=\"row\"\n");
      out.write("                         </div>\n");
      out.write("          \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                            <lable for=\"billid\" class=\"text-center col-lg-2 control-lable\"> Bill Id:-</lable>\n");
      out.write("                            <div class=\"col-lg-3\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  name=\"billid\" pattern='[0-9\\\\s]*'/>\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                      <lable for=\"quo_id\" class=\"text-center col-lg-2 control-lable\">Quotation Id:-</lable>\n");
      out.write("                            <div class=\"col-lg-3\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  name=\"quo_id\" pattern='[0-9\\\\s]*' value=\"");
      out.print( quo_id );
      out.write("\"/>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("                                                         \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"name\" class=\"text-center col-lg-2 control-lable\">Name:-</lable>\n");
      out.write("                            <div class=\"col-lg-3\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  name=\"name\" pattern='[A-Za-z \\\\s]*' value=\"");
      out.print( name );
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                                <lable for=\"shift_from\" class=\"text-center col-lg-2 control-lable\">Shift From:-</lable>\n");
      out.write("                                <div class=\"col-lg-3\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"shift_from\" pattern='[A-Za-z \\\\s]*' value=\"");
      out.print( shift_from );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"shift_to\" class=\"text-center col-lg-2 control-lable\">Shift To:-</lable>\n");
      out.write("                            <div class=\"col-lg-3\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"shift_to\" pattern='[A-Za-z \\\\s]*' value=\"");
      out.print( shift_to );
      out.write("\"/>\n");
      out.write("\n");
      out.write("                                  \n");
      out.write("           \n");
      out.write("                            </div>\n");
      out.write("                                <lable for=\"billdate\" class=\"text-center col-lg-2 control-lable\">Date:-</lable>\n");
      out.write("                                <div class=\"col-lg-3\">  \n");
      out.write("                                    <input type=\"date\" class=\"form-control\" placeholder=\"YYYY-MM-DD\" name=\"billdate\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                    <center><div class=\"btn\">\n");
      out.write("                    <button type=\"Submit\" class=\"btn btn-warning\">Search</button>\n");
      out.write("\n");
      out.write("                        </div></center>\n");
      out.write("   \n");
      out.write("                        <div class=\"row\"\n");
      out.write("                         </div>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("            \n");
      out.write("        <table border= '1' align='center' width='60%' bgcolor='white'>\n");
      out.write("            <tr> <th>Sr no.</th><th>Details</th><th>Amount</th></tr>\n");
      out.write("            <tr><th> 1.</th><th>Transport Charges</th><th><input type=\"text\" name=\"transport\"/><br></br></th></tr>                         \n");
      out.write("        <tr><th> 2.</th><th>Packing Charges</th><th><input type=\"text\" name=\"packing\"/><br></br></th></tr>                         \n");
      out.write("        <tr><th> 3.</th><th>Loading Charges</th><th><input type=\"text\" name=\"loading\"/><br></br></th></tr>                         \n");
      out.write("        <tr> <th> 4.</th><th>Unloading Charges</th><th><input type=\"text\" name=\"unloading\"/><br></br></th></tr>                         \n");
      out.write("        <tr><th></th><th>Total Amount</th><th><input type=\"text\" name=\"total\"/></th></tr>                         \n");
      out.write("        </table><br></br>\n");
      out.write("        <center>              <button type=\"Submit\" class=\"btn btn-warning\">Save</button>\n");
      out.write("                    <button type=\"Submit\" class=\"btn btn-warning\">clear</button>\n");
      out.write("                    <button type=\"Submit\" class=\"btn btn-warning\">Print</button>\n");
      out.write("\n");
      out.write("        </center>\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
