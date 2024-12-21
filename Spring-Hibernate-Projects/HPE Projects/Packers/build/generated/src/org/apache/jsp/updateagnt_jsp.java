package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Database.DbConnection;

public final class updateagnt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


int aid = 0;
String name_org="";
String address="";
String city="";
String state="";
String pincode="";
String name="";
String phone="";
String email="";
String user="";
String password="";
String mobile="";
String service_id="";





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
      out.write('\n');

    try
                      {
        Connection con = DbConnection.dataConnection();
        String name = request.getParameter("name");
        Statement stmt = con.createStatement();
        String str = "select * from agents where name = '"+name+"'";
        ResultSet rs = stmt.executeQuery(str);
        while(rs.next())
                       {
            name = rs.getString(7);           
            aid = rs.getInt(1);
          // System.out.println(name+""+aid);
            name_org = rs.getString(2);
            address = rs.getString(3);
            city = rs.getString(4);
            state = rs.getString(5);
            pincode = rs.getString(6);
            phone = rs.getString(8);
            email = rs.getString(9);
            user = rs.getString(10);
            password = rs.getString(11);
            mobile= rs.getString(12);
            service_id = rs.getString(13);
            
      
             }
    }catch(Exception e)
                       {
        
    }

      out.write("\n");
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
      out.write("         <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("  <div id=\"in\" class=\"home\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("    \n");
      out.write("    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"site name\" /></a>\n");
      out.write("      <div id=\"navigation\" class=\"cbox\">\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"index.html\" class=\"active\">Home</a></li>\n");
      out.write("           <li><a href=\"loginpage.jsp\">Logout</a></li>\n");
      out.write("                       <li><a href=\"agentmgmt.jsp\">Back</a></li>\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("      <!--navigation-->\n");
      out.write("    </div>\n");
      out.write("    <!--header-->\n");
      out.write("\n");
      out.write("            <div id=\"body\">\n");
      out.write("      <div id=\"banner\" class=\"cbox\">\n");
      out.write("      \n");
      out.write("        <div id=\"b_lft\"> <img src=\"images/Register.jpg\" alt=\"\" /><br />\n");
      out.write("          \n");
      out.write("          <!--but-->\n");
      out.write("        </div>\n");
      out.write("        <!--b_lft-->\n");
      out.write("      </div>\n");
      out.write("      <!--banner-->\n");
      out.write("\n");
      out.write("         <form class=\"form-horizontal\" method=\"post\" action=\"updateagnt.jsp\">\n");
      out.write("                            <div class=\"row\"\n");
      out.write("                         </div>\n");
      out.write("           \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                            <lable for=\"agentid\" class=\"text-center col-lg-2 control-lable\"> Agent Id:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"agentid\" name=\"agentid\" value=\"");
      out.print( aid);
      out.write("\"> \n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                                                       \n");
      out.write("                        \n");
      out.write("                     <lable for=\"nameorg\" class=\"text-center col-lg-2 control-lable\">Organization Name:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"nameorg\" name=\"nameorg\" value=\"");
      out.print( name_org );
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"address\" class=\"text-center col-lg-2 control-lable\">Address:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <textarea class=\"form-control\" placeholder=\"address\" name=\"address\"> ");
      out.print( address );
      out.write("</textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                                <lable for=\"city\" class=\"text-center col-lg-2 control-lable\">City:-</lable>\n");
      out.write("                                <div class=\"col-lg-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"city\" name=\"city\" value=\"");
      out.print( city );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"State\" class=\"text-center col-lg-2 control-lable\">State:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"state\" value=\"");
      out.print( state );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                                <lable for=\"pincode\" class=\"text-center col-lg-2 control-lable\">Pin_code:-</lable>\n");
      out.write("                                <div class=\"col-lg-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"pincode\" name=\"pincode\" value=\"");
      out.print( pincode );
      out.write("\">\n");
      out.write("                                                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"name\" class=\"text-center col-lg-2 control-lable\">Name:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"name\" name=\"name\" value=\"");
      out.print( name );
      out.write("\">\n");
      out.write("                       </div>\n");
      out.write("                            \n");
      out.write("                           <lable for=\"phone\" class=\"text-center col-lg-2 control-lable\">Phone:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"phone\" name=\"phone\" value=\"");
      out.print( phone );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"email\" class=\"text-center col-lg-2 control-lable\">Email:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"email\" name=\"email\" value=\"");
      out.print( email );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <lable for=\"user\" class=\"text-center col-lg-2 control-lable\">User_Id:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"userid\" name=\"user\" value=\"");
      out.print( user );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"password\" class=\"text-center col-lg-2 control-lable\">Password:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"password\" name=\"pass\" value=\"");
      out.print( password );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <lable for=\"mobile\" class=\"text-center col-lg-2 control-lable\">Mobile:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"mobile\" name=\"mobile\" value=\"");
      out.print( mobile );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"service\" class=\"text-center col-lg-2 control-lable\">Service_Type</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"serviceid\" value=\"");
      out.print( service_id );
      out.write("\">\n");
      out.write("                                   \n");
      out.write("                                                      </div>\n");
      out.write("                              </div>\n");
      out.write("                                            <center><div class=\"btn\">\n");
      out.write("                     \n");
      out.write("                    <button type=\"Submit\" class=\"btn btn-warning\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                    <form class=\"form-horizontal\" method=\"post\" action=\"agntupdate.jsp\">\n");
      out.write("                    <input type=\"Submit\" class=\"btn btn-warning\" value=\"Update\"/>\n");
      out.write("                     </form>\n");
      out.write("                        </div></center>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\" class=\"cbox\">\n");
      out.write("          <div class=\"fl\">&copy;</div>\n");
      out.write("          <!--.fl-->\n");
      out.write("       <!--.fr-->\n");
      out.write("    </div>\n");
      out.write("    <!--footer-->\n");
      out.write("  </div>\n");
      out.write("  <!--in-->\n");
      out.write("<!--main-->\n");
      out.write("                \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("                                ");
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
