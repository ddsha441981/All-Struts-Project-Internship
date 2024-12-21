
package View;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;

public class AgentInsert extends HttpServlet{
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          try {
            String agnt_id=request.getParameter("agentid");
            String name_org=request.getParameter("nameorg");
            String address=request.getParameter("address");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String pincode=request.getParameter("pincode");
            String name=request.getParameter("name");
            String phone=request.getParameter("phone");
            String email=request.getParameter("email");
            String user_id=request.getParameter("user");
            String password=request.getParameter("pass");
            String mobile=request.getParameter("mobile");
            String service_id=request.getParameter("serviceid");
             
            int idi=0;
            int sid = 0;
             try
            {
                idi=Integer.parseInt(agnt_id);
                sid=Integer.parseInt(service_id);
            }catch(NumberFormatException ne) {            
            out.println(ne);
        }
         Connection con=DbConnection.dataConnection();
         String str="insert into agents values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(str);
         ps.setInt(1,idi);
         ps.setString(2, name_org);
         ps.setString(3, address);
         ps.setString(4, city);
         ps.setString(5, state);
         ps.setString(6, pincode);
         ps.setString(7, name);
         ps.setString(8, phone);
         ps.setString(9, email);
         ps.setString(10, user_id);
         ps.setString(11, password);
         ps.setString(12, mobile);
         ps.setInt(13, sid);
         
         
         boolean ins=ps.execute();
         if(ins=true)
         {
             
             response.sendRedirect("Agntpage.jsp?insert");
             
         }
                             
                 
            
           
        } catch(Exception e) {            
            out.println("error " +e);
        }
    }
}
