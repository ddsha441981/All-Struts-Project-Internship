package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Database.DbConnection;

public final class vehiclesearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Safe Movers</title>\n");
      out.write("        <link href=\"styles/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
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
      out.write("<div id=\"main\">\n");
      out.write("  <div id=\"in\" class=\"home\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("    \n");
      out.write("    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"site name\" /></a>\n");
      out.write("      <div id=\"navigation\" class=\"cbox\">\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"index.html\" class=\"active\">Home</a></li>\n");
      out.write("          <li><a href=\"loginpage.jsp\">Logout</a></li>\n");
      out.write("          <li><a href=\"vehiclepage.jsp\">Back</a></li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("       </div>\n");
      out.write("      <!--navigation-->\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("     <!--header-->\n");
      out.write("    <div id=\"body\">\n");
      out.write("      <div id=\"banner\" class=\"cbox\">\n");
      out.write("      \n");
      out.write("          \n");
      out.write("          <!--but-->\n");
      out.write("        </div>\n");
      out.write("        <!--b_lft-->\n");
      out.write("          <!--b_rgt-->\n");
      out.write("           <div class=\"col1-2\">\n");
      out.write("                  <center><h1 style=\"background-color: #d5d5d5\">Service Details</h1></center>\n");
      out.write("      </div>\n");
      out.write("           </div>\n");
      out.write("           <!--banner-->\n");
      out.write("           \n");
      out.write("           ");

            try
                                  {
                                   Connection con=DbConnection.dataConnection();
                                        String name = request.getParameter("search");
                                       Statement stmt=con.createStatement();
                                 String str = "select * from vehicle where name = '"+name+"'";
                                   ResultSet rs=stmt.executeQuery(str);
                                   out.println("<table border= '1' align='center' width='40%'>");
                                   out.println("<th>Vehicle_ID</th><th>Name</th><th>Company</th><th>Price</th><th>Capacity</th><th>Number</th><th>Purchase-Date</th><th>Edit</th><th>Delete</th></tr>");

                                while(rs.next())
                                     {
                                      int id=rs.getInt(1);
                                   out.println("<tr><td>"+rs.getInt(1)+"</td>");
                                   out.println("<td>"+rs.getString(2)+"</td>");
                                   out.println("<td>"+rs.getString(3)+"</td>");
                                   out.println("<td>"+rs.getString(4)+"</td>");
                                   out.println("<td>"+rs.getString(5)+"</td>");
                                   out.println("<td>"+rs.getString(6)+"</td>");
                                   out.println("<td>"+rs.getString(7)+"</td>");
                                   
                                    out.println("<td><a href= 'vehicleedit.jsp?"+id+"'>Edit</a></td>");
                                   out.println("<td><a href= 'vehicledelete.jsp?"+id+"'>Delete</a></td></tr>");
                                             
                                   }
                                out.println("</table>");
                                   
            } catch(Exception e)
            {
                out.println(e);
            }                               
            
        
        
      out.write("\n");
      out.write("    <div id=\"footer\" class=\"cbox\">\n");
      out.write("          <div class=\"fl\">&copy;</div>\n");
      out.write("          <!--.fl-->\n");
      out.write("        <!--.fr-->\n");
      out.write("    </div>\n");
      out.write("    <!--footer-->\n");
      out.write("  </div>\n");
      out.write("  <!--in-->\n");
      out.write("</div>\n");
      out.write("<!--main-->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("                                      \n");
      out.write("   ");
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
