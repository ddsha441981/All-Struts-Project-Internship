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
            
            String service_id= request.getParameter("id");
            String service_type= request.getParameter("name");
            Connection con=DbConnection.dataConnection();
            Statement stmt=con.createStatement();
            
            String str="update service set service_id='"+service_id+"',service_type='"+service_type+"' where service_id='"+service_id+"'";
                int upd=stmt.executeUpdate(str);
                if(upd>0)
                                       {
                                       response.sendRedirect("servicepage.jsp");
                        }
            }catch(Exception e)
                                       {
            out.println("not update"+e);
            }
        
        %>


    </body>
</html>
