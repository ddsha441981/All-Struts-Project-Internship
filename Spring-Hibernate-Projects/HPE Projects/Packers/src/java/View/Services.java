package View;

import java.io.*;
import java.sql.*;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;

public class Services extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try {
            InitialContext ic=new InitialContext();
            DataSource ds=(DataSource) ic.lookup("jdbc/project");
            Connection con=ds.getConnection();
            Statement stmt=con.createStatement();
            String s = "Select * from service";
            ResultSet rs=stmt.executeQuery(s);
             while(rs.next())
            {
                out.println(rs.getInt(1));
                out.println("<br>"+rs.getString(2));
            }   

         } catch(Exception e) {            
            out.println("Error:-"+e);
        }
        
         
    }
}
