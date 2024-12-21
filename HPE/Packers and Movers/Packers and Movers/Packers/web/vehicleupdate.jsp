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
            
            String vehicle_id= request.getParameter("vehicleid");
            String name= request.getParameter("name");
            String vehicle_comp = request.getParameter("vehiclecomp");
            String price= request.getParameter("price");
            String capacity= request.getParameter("capacity");
            String number= request.getParameter("number");
            String purchase_Date= request.getParameter("purchasedate");
            
            Connection con=DbConnection.dataConnection();
            Statement stmt=con.createStatement();
            
            String str="update vehicle set vehicle_id='"+vehicle_id+"',name='"+name+"',vehicle_comp='"+vehicle_comp+"',price='"+price+"',capacity='"+capacity+"',number='"+number+"',purchase_Date='"+purchase_Date+"' where vehicle_id='"+vehicle_id+"'";
                int upd=stmt.executeUpdate(str);
                if(upd>0)
                                       {
                                        response.sendRedirect("vehiclepage.jsp");
                        }
            }catch(Exception e)
                                       {
            out.println("not update"+e);
            }
        
        %>


    </body>
</html>
