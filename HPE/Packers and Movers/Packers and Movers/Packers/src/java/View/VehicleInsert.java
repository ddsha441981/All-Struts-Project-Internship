package View;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;

public class VehicleInsert extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try {
            String vehicle_id=request.getParameter("vehicleid");
            String name=request.getParameter("name");
            String vehicle_comp=request.getParameter("vehiclecomp");
            String price=request.getParameter("price");
            String capacity=request.getParameter("capacity");
            String number=request.getParameter("number");
            String purchase_Date=request.getParameter("purchasedate");
            int idi=0;
             try
            {
                idi=Integer.parseInt(vehicle_id);
            }catch(NumberFormatException ne) {            
            out.println(ne);
        }
         Connection con=DbConnection.dataConnection();
         String str="insert into vehicle values(?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(str);
         ps.setInt(1,idi);
         ps.setString(2, name);
         ps.setString(3, vehicle_comp);
         ps.setString(4, price);
         ps.setString(5, capacity);
         ps.setString(6, number);
         ps.setString(7, purchase_Date);


         boolean ins=ps.execute();
         if(ins=true)
         {
             response.sendRedirect("vehiclepage.jsp?insert");
             
         }
                             
                 
            
            
        } catch(Exception e) {            
            out.println(e);
        }
    }

    
    
}
