
package View;
import Database.DbConnection;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class logins extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
        String user = request.getParameter("user");  
        String pass = request.getParameter("pass");
        ServletContext Context=getServletContext();
        Context.setAttribute("us",user);
        String uname="";
        String upass="";
            
        Connection con = DbConnection.dataConnection();
        Statement stmt = con.createStatement();
String s = "select * from login where user_id='"+user+"'";
ResultSet rs = stmt.executeQuery(s);
 while(rs.next())
 {
     uname = rs.getString(1);
     upass = rs.getString(2);
 }
  if((user.equals(uname)) &&(pass.equals(upass)))
  {
    
        response.sendRedirect("adminmgmt.jsp");
      
  }
  else
  {
      out.println("Login fail");
  }
        }catch(Exception e) {            
            out.println("Error " +e);
        }
    }

    

}
