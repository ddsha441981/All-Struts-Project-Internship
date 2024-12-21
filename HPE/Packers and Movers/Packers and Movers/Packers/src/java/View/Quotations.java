package View;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;

public class Quotations extends HttpServlet{
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          try {
            String quo_id=request.getParameter("quoid");
            String service_id=request.getParameter("serviceid");
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String mobile=request.getParameter("mobile");
            String shift_from=request.getParameter("shiftfrom");
            String shift_to=request.getParameter("shiftto");
            String service_date=request.getParameter("servicedate");
            String contact_date=request.getParameter("contactdate");
            String reference=request.getParameter("reference");
            String details=request.getParameter("details");
            
            int idi=0;
            int sid = 0;
                    
             try
            {
                idi=Integer.parseInt(quo_id);
                sid=Integer.parseInt(service_id);
            }catch(NumberFormatException ne) {            
            out.println(ne);
        }
         Connection con=DbConnection.dataConnection();
         String str="insert into quotation values(?,?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(str);
         ps.setInt(1,idi);
         ps.setInt(2, sid);
         ps.setString(3, name);
         ps.setString(4, email);
         ps.setString(5, mobile);
         ps.setString(6, shift_from);
         ps.setString(7, shift_to);
         ps.setString(8, service_date);
         ps.setString(9, contact_date);
         ps.setString(10, reference);
         ps.setString(11, details);
         
         
         
         boolean ins=ps.execute();
         if(ins=true)
         {
             
             response.sendRedirect("quotationinsert.jsp?insert");
             
         }
                             
                 
            
           
        } catch(Exception e) {            
            out.println("error " +e);
        }
    }

    
}
