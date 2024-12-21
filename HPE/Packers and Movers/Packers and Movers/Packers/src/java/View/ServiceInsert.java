package View;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;


public class ServiceInsert extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try {
            String service_id=request.getParameter("id");
            String service_type=request.getParameter("name");
            int idi=0;
             try
            {
                idi=Integer.parseInt(service_id);
            }catch(NumberFormatException ne) {            
            out.println(ne);
        }
         Connection con=DbConnection.dataConnection();
         String str="insert into service values(?,?)";
         PreparedStatement ps=con.prepareStatement(str);
         ps.setInt(1,idi);
         ps.setString(2, service_type);
         boolean ins=ps.execute();
         if(ins=true)
         {
             response.sendRedirect("servicepage.jsp?insert");
             
         }
                             
                 
            
            
        } catch(Exception e) {            
            out.println(e);
        }
    }

    
    
}
