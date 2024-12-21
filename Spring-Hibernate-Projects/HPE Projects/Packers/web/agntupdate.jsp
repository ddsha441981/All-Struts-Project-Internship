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
 
            out.println(name);
            out.println(agnt_id);
            out.println(city);
            out.println(user_id);
            
                       Connection con=DbConnection.dataConnection();
            Statement stmt=con.createStatement();
            
             String str="update agents set agnt_id='"+agnt_id+"',name_org='"+name_org+"',address='"+address+"',city='"+city+"',state='"+state+"',pincode='"+pincode+"',name='"+name+"',phone='"+phone+"',email='"+email+"',user_id='"+user_id+"',password='"+password+"',mobile='"+mobile+"',service_id='"+service_id+"' where agnt_id='"+agnt_id+"'";

                           int upd=stmt.executeUpdate(str);
                if(upd>0)
                                       {
                                       response.sendRedirect("updateagnt.jsp");
                        }
            }catch(Exception e)
                                       {
            out.println("not update"+e);
            }
        
        %>

    </body>
</html>
