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
            
            String main_id= request.getParameter("mainid");
            String vehicle_id= request.getParameter("vehicleid");
            String main_date= request.getParameter("maindate");
            String tire= request.getParameter("tire");
            String body= request.getParameter("body");
            String transmission= request.getParameter("transmission");
            String engine= request.getParameter("engine");
            
                       Connection con=DbConnection.dataConnection();
            Statement stmt=con.createStatement();
            
            String str="update maintenance set main_id='"+main_id+"',vehicle_id='"+vehicle_id+"',main_date='"+main_date+"',Tire='"+tire+"',body='"+body+"',Transmission='"+transmission+"',engine='"+engine+"' where main_id='"+main_id+"'";
                int upd=stmt.executeUpdate(str);
                if(upd>0)
                                       {
                                       response.sendRedirect("Maintenancepage.jsp");
                        }
            }catch(Exception e)
                                       {
            out.println("not update"+e);
            }
        
        %>


    </body>
</html>
