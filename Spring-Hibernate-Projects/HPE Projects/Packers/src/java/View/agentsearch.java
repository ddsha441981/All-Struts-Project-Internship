
package View;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;

public class agentsearch extends HttpServlet{
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
 
        try{
            String id=request.getQueryString();   
            Connection con=DbConnection.dataConnection();
            Statement stmt=con.createStatement();
            
             String str="select * from agents where name='"+id+"'";
              ResultSet rs=stmt.executeQuery(str);
              
                while (rs.next())
                       {
       
             String agnt_id= request.getParameter("agentid");
            String name_org= request.getParameter("orgname");
            String address= request.getParameter("address");
            String city= request.getParameter("city");
            String state= request.getParameter("state");
            String pincode= request.getParameter("pincode");
            String name= request.getParameter("name");
            String phone= request.getParameter("phone");
            String email= request.getParameter("email");
            String user_id= request.getParameter("user");
            String password= request.getParameter("password");
            String mobile= request.getParameter("mobile");
            String service_id= request.getParameter("serviceid");
                       }     
             
        }catch(Exception e) {            
            out.println("error " +e);
             
     }
}
}

