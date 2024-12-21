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
        String str="Select * from service where service_id='"+id+"'";
        ResultSet rs=stmt.executeQuery(str);
        out.println("<form method='post' action='serviceupdate.jsp'>");
        while (rs.next())
                       {
                           out.println("service_id <input type='text' name='id' value='"+rs.getInt(1)+"' />");
                           out.println("service_type <input type='text' name='name' value='"+rs.getString(2)+"' />");
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
