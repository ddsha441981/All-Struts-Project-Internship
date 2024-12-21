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
        String str="Select * from vehicle where vehicle_id='"+id+"'";
        ResultSet rs=stmt.executeQuery(str);
        out.println("<form method='post' action='vehicleupdate.jsp'>");
        while (rs.next())
                       {
                           out.println("Vehicle_id <input type='text' name='vehicleid' value='"+rs.getInt(1)+"' />");
                           out.println("Name <input type='text' name='name' value='"+rs.getString(2)+"' />");
                           out.println("Company <input type='text' name='vehiclecomp' value='"+rs.getString(3)+"' />");
                           out.println("price <input type='text' name='price' value='"+rs.getString(4)+"' />");
                           out.println("Capacity <input type='text' name='capacity' value='"+rs.getString(5)+"' />");
                           out.println("Number <input type='text' name='number' value='"+rs.getString(6)+"' />");
                           out.println("Purchase_Date <input type='text' name='purchasedate' value='"+rs.getString(7)+"' />");
                           
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
