<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
        String str="delete from quotation where quo_id='"+id+"'";
        int del=stmt.executeUpdate(str);
        if (del>0)
                       {
                           response.sendRedirect("quotationdata.jsp");
                       }
        stmt.close();
        
        }catch(Exception e)
                               {
            out.println("error"+e);
        }
        %>


    </body>
</html>
