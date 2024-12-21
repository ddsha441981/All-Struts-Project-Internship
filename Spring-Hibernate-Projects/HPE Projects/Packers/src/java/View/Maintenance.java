package View;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;

public class Maintenance extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          try {
            String main_id=request.getParameter("mainid");
            String vehicle_id=request.getParameter("vehicleid");
            String main_date=request.getParameter("maindate");
            String Tire=request.getParameter("tire");
            String body=request.getParameter("body");
            String Transmission=request.getParameter("transmission");
            String engine=request.getParameter("engine");
            int idi=0;
            int sid = 0;
             try
            {
                idi=Integer.parseInt(main_id);
                sid=Integer.parseInt(vehicle_id);
            }catch(NumberFormatException ne) {            
            out.println(ne);
        }
         Connection con=DbConnection.dataConnection();
         String str="insert into maintenance values(?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(str);
         ps.setInt(1,idi);
         ps.setInt(2, sid);
         ps.setString(3, main_date);
         ps.setString(4, Tire);
         ps.setString(5, body);
         ps.setString(6, Transmission);
         ps.setString(7, engine);
         
         
         boolean ins=ps.execute();
         if(ins=true)
         {
             
             response.sendRedirect("Maintenancepage.jsp?insert");
             
         }
                             
                 
            
           
        } catch(Exception e) {            
            out.println("error " +e);
        }
    }
    
}
