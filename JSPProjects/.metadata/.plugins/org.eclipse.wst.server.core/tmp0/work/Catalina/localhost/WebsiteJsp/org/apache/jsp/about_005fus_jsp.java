/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-07-19 07:32:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>One page website template for multipurpose website</title>\r\n");
      out.write("      <!-- <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\"/>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("     <link rel=\"shortcut icon\" href=\"image/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("    <meta name=\"robots\" content=\"index, follow\" />\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"content-language\" content=\"en\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"mz,mzcreatives,creatives,template,website,onepage,webdesign,portfolio,build website,themeforest\" />\r\n");
      out.write("    <meta name=\"description\" content=\"Now you can buy or use template from themeforest design by mzcreatives\" />\r\n");
      out.write("    <meta property=\"og:title\" content=\"One page website template for multipurpose website\" /> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <!---Common css---->\r\n");
      out.write("        <link href=\"css/common.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!----Media queries css--->\r\n");
      out.write("         <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("         <link href=\"css/theme1024.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"css/theme990.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"css/theme768.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"css/theme480.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"css/theme320.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"css/theme319.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"css/quickweb.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("     <link href=\"fonts/style.css\" rel=\"stylesheet\" type=\"text/css\" />   \r\n");
      out.write("   <link href=\"css/slider_css.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,600,700,900' rel='stylesheet' type='text/css'/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery-ui.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("    <script src=\"js/slider.js\"></script>\r\n");
      out.write("    <script src=\"js/plugin.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("      <!--------------------------------------2Header2.jsp-------------------------------------------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("  \t <!-- ------------------------------------------------------------------------------------------------------------------------------- --> \r\n");
      out.write("        \r\n");
      out.write("     <!--------------------------------------bannerImage.jsp-------------------------------------------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bannerImage.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("  \t<!-- ------------------------------------------------------------------------------------------------------------------------------- --> \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("<section class=\"choose-theme section-padding color-white\"  id=\"about\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"main-title font-color-m-light\">About Us.</div>\r\n");
      out.write("            <p class=\"main-content\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vitae nibh nisl. Cras et mauris eget lorem ultricies ferme ntum a in diam. </p>\r\n");
      out.write("            <div class=\"col-8 about-image\"><img src=\"image/22.png\" style=\"\" /></div>\r\n");
      out.write("            <div class=\"col-4 padding-lr\" style=\"box-sizing:border-box;\" >\r\n");
      out.write("                <div class=\"sub-title font-color-s-light\">\r\n");
      out.write("                    Everything  you need\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"content-box\" style=\"\">                    Whether you need simple pages, striking galleries, a professional blog, or an online store, it's all included with your Squarespace website. Best of all, everything is mobile-ready right from the start.\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"#services\"><div class=\"view-template\" >View More</div></a>\r\n");
      out.write("            </div>\r\n");
      out.write("       \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    <!--------------------------------------2Header2.jsp-------------------------------------------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header1.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("  \t<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!--------------------------------------massage.jsp-------------------------------------------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "massage.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("  \t<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  \r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("   <!--------------------------------------socialmediaImage.jsp-------------------------------------------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "socialmediaImage.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("  \t<!-- ------------------------------------------------------------------------------------------------------------------------------- -->  \r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("  \t<!--------------------------------------client.jsp-------------------------------------------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "client.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("   <!-- ------------------------------------------------------------------------------------------------------------------------------- -->  \r\n");
      out.write("\r\n");
      out.write("   <!--------------------------------------address.jsp-------------------------------------------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "address.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("   <!-- ------------------------------------------------------------------------------------------------------------------------------- -->  \r\n");
      out.write("     \r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("    <!--------------------------------------footer.jsp-------------------------------------------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("  \t <!-- ------------------------------------------------------------------------------------------------------------------------------- --> \r\n");
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
