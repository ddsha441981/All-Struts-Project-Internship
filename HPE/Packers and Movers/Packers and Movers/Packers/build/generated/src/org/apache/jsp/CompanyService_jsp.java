package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CompanyService_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Packers and Movers</title>\n");
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
      out.write("    </head>\n");
      out.write(" <body>\n");
      out.write("         <div id=\"main\">\n");
      out.write("  <div id=\"in\" class=\"home\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("    \n");
      out.write("    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"site name\" /></a>\n");
      out.write("      <div id=\"navigation\" class=\"cbox\">\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"index.html\" class=\"active\">Home</a></li>\n");
      out.write("          <li><a href=\"loginpage.jsp\">Logout</a></li>\n");
      out.write("           </ul>\n");
      out.write("       </div>\n");
      out.write("      <!--navigation-->\n");
      out.write("    </div>\n");
      out.write("    <!--header-->\n");
      out.write("    <div id=\"body\">\n");
      out.write("     \n");
      out.write("      \n");
      out.write("        <div id=\"b_lft\"> <img src=\"images/ourservices.jpg\" alt=\"\" /><br />\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("         <div class=\"marginBottom30\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col1-2\">\n");
      out.write("                         <a class=\"photo\" href=\"./\"><img src=\"images/serimg.jpg\" alt=\"empty\" /></a>\n");
      out.write("                     \n");
      out.write("                       </div>\n");
      out.write("          <div class=\"col1-2\">\n");
      out.write("              <h2>Service Management</h2>\n");
      out.write("\n");
      out.write("                      <li><a href=\"servicepage.jsp\" class=\"bbut\">Services</a></li><br><br>\n");
      out.write("                      <li><a href=\"agentdata.jsp\" class=\"bbut\">Vehicle</a></li></br></br>\n");
      out.write("                      <li><a href=\"feedbackdata.jsp\" class=\"bbut\">Maintenance</a></li></br></br>\n");
      out.write("                      <li><a href=\"servicepage.jsp\" class=\"bbut\">Drives</a></li></br></br>\n");
      out.write("                      \n");
      out.write("               \n");
      out.write("          </div>\n");
      out.write("               <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("        <img src=\"images/packer1.jpg\" alt=\"\" /> \n");
      out.write("        </div>\n");
      out.write("        <!--.col-->\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <h2>Company Process</h2>\n");
      out.write("          <img src=\"images/process.png\" alt=\"\" />\n");
      out.write("          <p>Domestic Relocations</p>\n");
      out.write("          <p>Packing and Moving</p>\n");
      out.write("          <p>Transportation Service</p>\n");
      out.write("          <p>Warehousing Service</p>\n");
      out.write("        </div>\n");
      out.write("        <!--.col-->\n");
      out.write("        <div class=\"col last\">\n");
      out.write("          <h2>Contact us</h2>\n");
      out.write("          <img src=\"images/support.png\" alt=\"\" />\n");
      out.write("          <p>Packers and Movers,Dange chowk,thegaon pune,411042.</p>\n");
      out.write("          <p>Phone no-9874563210</p>\n");
      out.write("        </div>\n");
      out.write("        <!--.col-->\n");
      out.write("      </div>\n");
      out.write("      <!--.row-->\n");
      out.write("    </div>\n");
      out.write("    <!--body-->\n");
      out.write("    <br />\n");
      out.write("    <div id=\"footer\" class=\"cbox\">\n");
      out.write("          <div class=\"fl\">&copy;</div>\n");
      out.write("          <!--.fl-->\n");
      out.write("       <!--.fr-->\n");
      out.write("    </div>\n");
      out.write("    <!--footer-->\n");
      out.write("  </div>\n");
      out.write("  <!--in-->\n");
      out.write("</div>\n");
      out.write("<!--main-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
