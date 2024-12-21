package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.ws.rs.OPTIONS;
import java.sql.*;
import Database.DbConnection;

public final class agentedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("    </div>\n");
      out.write("    <!--header-->\n");
      out.write("    \n");
      out.write("        ");
     

           try    
          {
        String id=request.getQueryString();
        Connection con =DbConnection.dataConnection();
        Statement stmt=con.createStatement();
        String str="Select * from agents where agnt_id='"+id+"'";
        ResultSet rs=stmt.executeQuery(str);
        out.println("<form method='post' action='agentupdate.jsp'>");
         while (rs.next())
                       {
                       
                               
                           out.println("<tr>Agnt_id <input type='text' name='agentid' value='"+rs.getInt(1)+"'/><br><br>");
                                                             
                           out.println("name_org <input type='text' name='orgname' value='"+rs.getString(2)+"'/><br><br>");
                           
                           out.println("address <textarea name='address' value='"+rs.getString(3)+"'/></textarea><br><br>");
                          
                           out.println("city <input type='text' name='city' value='"+rs.getString(4)+"'/><br><br>");
                           
                           out.println("state <input type='text' name='state' value='"+rs.getString(5)+"'/><br><br>");                   
                           
                           out.println("pincode <input type='text' name='pincode' value='"+rs.getString(6)+"'/><br><br>");
                           
                           out.println("name <input type='text' name='name' value='"+rs.getString(7)+"'/><br><br>");
                           
                           out.println("phone <input type='text' name='phone' value='"+rs.getString(8)+"'/><br><br>");
                           
                           out.println("email <input type='text' name='email' value='"+rs.getString(9)+"'/><br><br>");
                           
                           out.println("userid <input type='text' name='user' value='"+rs.getString(10)+"'/><br><br>");                                                                                                                                                                                                   
                           
                           out.println("password <input type='text' name='password' value='"+rs.getString(11)+"'/><br><br>");
                           
                           out.println("mobile <input type='text' name='mobile' value='"+rs.getString(12)+"'/><br><br>");
                           
                           out.println("service_Type <input type='text' name='serviceid' value='"+rs.getString(13)+"'/><br><br>");
                                           
                           out.println("<input type='submit' value='Update'/></tr>");
                           
                           
                       }
        out.println("</form>");
                 }catch(Exception e)
                                         {
                     out.println("Not updated:-"+e);
                 }
          

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
