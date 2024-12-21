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
        try
                               {
        String id=request.getQueryString();
        Connection con =DbConnection.dataConnection();
        Statement stmt=con.createStatement();
        String str="Select * from driver where driver_id='"+id+"'";
        ResultSet rs=stmt.executeQuery(str);
        out.println("<form method='post' action='driverupdate.jsp'>");
        while (rs.next())
                       {
                           out.println("driver_id <input type='text' name='driverid' value='"+rs.getInt(1)+"' />");
                           out.println("Name <input type='text' name='name' value='"+rs.getString(2)+"' />");
                           out.println("Address <textarea  name='address'>"+rs.getString(3)+"</textarea>");
                           out.println("Phone <input type='text' name='phone' value='"+rs.getString(4)+"' />");
                           out.println("City <input type='text' name='city' value='"+rs.getString(5)+"' />");
                           out.println("State <input type='text' name='state' value='"+rs.getString(6)+"' />");
                           out.println("Id-Proof <input type='text' name='Idproof' value='"+rs.getString(7)+"' />");
                           out.println("Salary <input type='text' name='salary' value='"+rs.getString(8)+"' />");
                         
                            out.println("<input type='submit' value='Update'/>");
                           
 
                       }
       out.println("</form>");
        
        }catch(Exception e)
                               {
            out.println("value not update"+e);
        }
        %>

    </body>
</html>
