package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quotationinsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\n");
      out.write("    function validate(){  \n");
      out.write("    var quoid=document.quotation.quoid.value;  \n");
      out.write("    var name=document.quotation.name.value;  \n");
      out.write("    var x=document.quotation.email.value;  \n");
      out.write("    var atposition=x.indexOf(\"@\");  \n");
      out.write("    var dotposition=x.lastIndexOf(\".\");      \n");
      out.write("    var mobile=document.quotation.mobile.value;  \n");
      out.write("    var shiftfrom=document.quotation.shiftfrom.value;  \n");
      out.write("    var shiftto=document.quotation.shiftto.value;  \n");
      out.write("    var servicedate=document.quotation.servicedate.value;  \n");
      out.write("    var contactdate=document.quotation.contactdate.value;  \n");
      out.write("    var reference=document.quotation.reference.value;  \n");
      out.write("    var details=document.quotation.details.value;  \n");
      out.write("    \n");
      out.write("\n");
      out.write("    if((quoid==null || quoid ==\"\")||(name==null || name ==\"\")||(email==null || email==\"\")||(mobile==null || mobile==\"\")||(shiftfrom==null || shiftto==\"\")||(shiftto==null || shiftto==\"\")||(servicedate==null || servicedate==\"\")||(contactdate==null || contactdate==\"\")||(reference==null || reference==\"\")||(details==null || details==\"\")){\n");
      out.write("            alert(\"Some Fields are be blank!!!!\");\n");
      out.write("         return false;  \n");
      out.write("        }  \n");
      out.write("   if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  \n");
      out.write("  alert(\"Please enter a valid e-mail address \\n atpostion:\"+atposition+\"\\n dotposition:\"+dotposition);  \n");
      out.write("  return false;  \n");
      out.write("  }\n");
      out.write("  }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"main\">\n");
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
      out.write("    <!--header-->\n");
      out.write("\n");
      out.write("        <div id=\"body\">\n");
      out.write("      \n");
      out.write("        <div id=\"b_lft\"> <img src=\"images/quo.jpg\" alt=\"\" /><br />\n");
      out.write("          \n");
      out.write("          <!--but-->\n");
      out.write("        </div>\n");
      out.write("        <!--b_lft-->\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    <form name=\"quotation\" class=\"form-horizontal\" method=\"post\" action=\"Quotations\" onsubmit=\"return validate()\">\n");
      out.write("                            <div class=\"row\"\n");
      out.write("                         </div>\n");
      out.write("           \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                            <lable for=\"quoid\" class=\"text-center col-lg-2 control-lable\"> Quotation Id:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  name=\"quoid\" pattern='[0-9\\\\s]*'/>\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                      <lable for=\"service\" class=\"text-center col-lg-2 control-lable\">Service_Type</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <select class=\"form-control\" name=\"serviceid\">\n");
      out.write("                                    \n");
      out.write("                                    <option value=\"1\">households</option>\n");
      out.write("                                    <option value=\"2\">office shiffting</option>\n");
      out.write("                                    <option value=\"3\">cars shiffting</option>\n");
      out.write("                                    <option value=\"4\">bike shiffting</option>\n");
      out.write("                                    <option value=\"5\">showroom shiffting</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                                                         \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"name\" class=\"text-center col-lg-2 control-lable\">Name:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Name\" name=\"name\" pattern='[A-Za-z\\\\s]*'/> \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <lable for=\"email\" class=\"text-center col-lg-2 control-lable\">Email:-</lable>\n");
      out.write("                                <div class=\"col-lg-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Email\" name=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"mobile\" class=\"text-center col-lg-2 control-lable\">Mobile:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Mobile\" name=\"mobile\" pattern='[0-9\\\\s]*'/>\n");
      out.write("                                  \n");
      out.write("           \n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <lable for=\"Shiftfrom\" class=\"text-center col-lg-2 control-lable\">Shift-From:-</lable>\n");
      out.write("                                <div class=\"col-lg-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Shift-From\" name=\"shiftfrom\" pattern='[A-Za-z\\\\s]*'/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"shift-to\" class=\"text-center col-lg-2 control-lable\">Shift-To:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Shift-To\" name=\"shiftto\" pattern='[A-Za-z\\\\s]*'/>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                           <lable for=\"servicedate\" class=\"text-center col-lg-2 control-lable\">Service-Date:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"date\" class=\"form-control\" placeholder=\"YYYY-MM-DD\" name=\"servicedate\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"contactdate\" class=\"text-center col-lg-2 control-lable\">Contact-Date:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"datetime-local\" class=\"form-control\" placeholder=\"YYYY-MM-DD\" name=\"contactdate\">\n");
      out.write("                                                                     \n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("                            <lable for=\"reference\" class=\"text-center col-lg-2 control-lable\">Reference:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Reference\" name=\"reference\" pattern='[A-Za-z\\\\s]*'/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <lable for=\"details\" class=\"text-center col-lg-2 control-lable\">Details:-</lable>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <textarea class=\"form-control\" placeholder=\"Details\" name=\"details\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                    <center><div class=\"btn\">\n");
      out.write("                    <button type=\"Submit\" class=\"btn btn-warning\">Submit</button>\n");
      out.write("                        </div></center>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("        <div id=\"footer\" class=\"cbox\">\n");
      out.write("          <div class=\"fl\">&copy;</div>\n");
      out.write("          <!--.fl-->\n");
      out.write("       <!--.fr-->\n");
      out.write("    </div>\n");
      out.write("    <!--footer-->\n");
      out.write("  </div>\n");
      out.write("  <!--in-->\n");
      out.write("</div>\n");
      out.write("<!--main-->\n");
      out.write("                </form>\n");
      out.write(" \n");
      out.write("\n");
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
