<%@page import="java.sql.*, Database.DbConnection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Safe Movers</title>
    </head>
    <body>
      <%
             
        
            try{
            
            String user_id= request.getParameter("user");
            String password= request.getParameter("pass");
            
            Connection con=DbConnection.dataConnection();
            Statement stmt=con.createStatement();
            
            String str="update agents set user_id='"+user_id+"',password='"+password+"'";
                int upd=stmt.executeUpdate(str);
                if(upd>0)
                                       {
                                       response.sendRedirect("agentChangePassword.jsp");
                        }
            }catch(Exception e)
                                       {
            out.println("not update"+e);
            }
        
        %>


    </body>
</html>
