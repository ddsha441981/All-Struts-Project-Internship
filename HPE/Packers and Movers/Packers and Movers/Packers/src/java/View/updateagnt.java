package View;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Database.DbConnection;


public class updateagnt extends HttpServlet {
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            try{
            
            String agnt_id= request.getParameter("agentid");
            String name_org= request.getParameter("nameorg");
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
            
        
        
            Connection con=DbConnection.dataConnection();
            Statement stmt=con.createStatement();
            
             String str="update agents set agnt_id='"+agnt_id+"',name_org='"+name_org+"',address='"+address+"',city='"+city+"',state='"+state+"',pincode='"+pincode+"',name='"+name+"',phone='"+phone+"',email='"+email+"',user_id='"+user_id+"',password='"+password+"',mobile='"+mobile+"',service_id='"+service_id+"' where agnt_id='"+agnt_id+"'";
            // PreparedStatement ps=con.prepareStatement(str);
       
        
          int upd=stmt.executeUpdate(str);
         if(upd>0)
         {
     
             response.sendRedirect("updateagnt.jsp");
             
         }
                             
        stmt.close();
        }catch(Exception e) {            
            out.println("error " +e);
             
     }
}
}