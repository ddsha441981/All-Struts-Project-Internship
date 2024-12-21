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
            
            String driver_id= request.getParameter("driverid");
            String name = request.getParameter("name");
            String address= request.getParameter("address");
            String phone= request.getParameter("phone");
            String city= request.getParameter("city");
            String state = request.getParameter("state");
            String Idproof= request.getParameter("Idproof");
            String salary= request.getParameter("salary");
            
                       Connection con=DbConnection.dataConnection();
            Statement stmt=con.createStatement();
            
            String str="update driver set driver_id='"+driver_id+"',name='"+name+"',address='"+address+"',phone='"+phone+"',city='"+city+"',state='"+state+"',Idproof='"+Idproof+"',salary='"+salary+"' where driver_id='"+driver_id+"'";
                int upd=stmt.executeUpdate(str);
                if(upd>0)
                                       {
                                       response.sendRedirect("Driverpage.jsp");
                        }
            }catch(Exception e)
                                       {
            out.println("not update"+e);
            }
        
        %>


    </body>
</html>
