package View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;

public class feedback extends HttpServlet {
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          try {
            String feed_id=request.getParameter("feedid");
            String name=request.getParameter("name");
            String company=request.getParameter("company");
            String address=request.getParameter("address");
            String city=request.getParameter("city");
            String pincode=request.getParameter("pincode");
            String email=request.getParameter("email");
            String phone=request.getParameter("phone");
            String experience=request.getParameter("exper");
            String comments=request.getParameter("comment");
                        int idi=0;
                          try
            {
                idi=Integer.parseInt(feed_id);
            }catch(NumberFormatException ne) {            
            out.println(ne);
        }
         Connection con=DbConnection.dataConnection();
         String str="insert into feedback values(?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(str);
         ps.setInt(1,idi);
         ps.setString(2, name);
         ps.setString(3, company);
         ps.setString(4, address);
         ps.setString(5, city);
         ps.setString(6, pincode);
         ps.setString(7, email);
         ps.setString(8, phone);
         ps.setString(9, experience);
         ps.setString(10, comments);
         
         
         boolean ins=ps.execute();
         if(ins=true)
         {
             
             response.sendRedirect("serviceclient.jsp?insert");
             
         }
                             
                 
            
           
        } catch(Exception e) {            
            out.println("error " +e);
        }
    }

    
}
