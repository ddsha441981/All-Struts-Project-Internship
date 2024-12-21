package View;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;

public class DriverInsert extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          try {
            String driver_id=request.getParameter("driverid");
            String name=request.getParameter("name");
            String address=request.getParameter("address");
            String phone=request.getParameter("phone");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String Idproof=request.getParameter("Idproof");
            String salary=request.getParameter("salary");
            
            int idi=0;
            
             try
            {
                idi=Integer.parseInt(driver_id);
            }catch(NumberFormatException ne) {            
            out.println(ne);
        }
         Connection con=DbConnection.dataConnection();
         String str="insert into driver values(?,?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(str);
         ps.setInt(1,idi);
         ps.setString(2,name );
         ps.setString(3, address);
         ps.setString(4, phone);
         ps.setString(5, city);
         ps.setString(6, state);
         ps.setString(7, Idproof);
         ps.setString(8,salary);
         
         
         
         boolean ins=ps.execute();
         if(ins=true)
         {
             
             response.sendRedirect("Driverpage.jsp?insert");
             
         }
                             
                 
            
           
        } catch(Exception e) {            
            out.println("error " +e);
        }
    }
    
    
}
