<%@page import="java.sql.*, Database.DbConnection"%>
<%!
int quo_id=0;
String name="";
String shift_from="";
String shift_to="";

%>
<%
    try
                      {
        Connection con = DbConnection.dataConnection();
        String quo_name = request.getParameter("name");
        Statement stmt = con.createStatement();
        String str = "select quo_id,name,shift_from,shift_to from quotation where name = '"+quo_name+"'";
        ResultSet rs = stmt.executeQuery(str);
        while(rs.next())
                       {
            name = rs.getString(3);                    
            quo_id = rs.getInt(1);
            shift_from = rs.getString(6);
            shift_to = rs.getString(7);
           
      
             }
    }catch(Exception e)
                       {
        
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Safe Movers</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
          <link href="styles/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="scripts/vwd_curvycorners.js"></script>
<script type="text/javascript" src="scripts/capply.js"></script>
<!--[if lt IE 7]>
<style type="text/css">
.home .row{
	padding-bottom:0;
}
.px_fix{
	left:1px;
	bottom:-3px;
}
</style>
<![endif]-->



    </head>
    <body>
        <div id="main">
    <div id="in" class="home">
    <div id="header">
    
    <a href="index.html"><img src="images/logo.png" alt="site name" /></a>
      <div id="navigation" class="cbox">

        <ul>
          <li><a href="index.html" class="active">Home</a></li>
          <li><a href="serviceclient.jsp">Services</a></li>
         
       </div>
      <!--navigation-->
    </div>
    </div>
    <!--header-->

        <div id="body">
      
                <center><h1 style="background-color: #d5d5d5">Bill</h1></center>
                         <div class="row"
                         </div>

        </div>
      </div>
          
        <form name="bill" class="form-horizontal" method="post" action="Billpage.jsp" onsubmit="return validation()">
 
                   <div class="row"
                         </div>
          
                            <div class="form-group">
                            <lable for="billid" class="text-center col-lg-2 control-lable"> Bill Id:-</lable>
                            <div class="col-lg-3">
                                <input type="text" class="form-control"  name="billid" pattern='[0-9\\s]*'/>
                               
                            </div>
                        
                      <lable for="quo_id" class="text-center col-lg-2 control-lable">Quotation Id:-</lable>
                            <div class="col-lg-3">
                                <input type="text" class="form-control"  name="quo_id" pattern='[0-9\\s]*' value="<%= quo_id %>"/>
                                    
                                    
                            </div>
                                                         
                        
                        </div>
                        <div class="form-group">
                            <lable for="name" class="text-center col-lg-2 control-lable">Name:-</lable>
                            <div class="col-lg-3">
                                <input type="text" class="form-control"  name="name" pattern='[A-Za-z \\s]*' value="<%= name %>"/>
                            </div>

                                <lable for="shift_from" class="text-center col-lg-2 control-lable">Shift From:-</lable>
                                <div class="col-lg-3">
                                    <input type="text" class="form-control" name="shift_from" pattern='[A-Za-z \\s]*' value="<%= shift_from %>"/>
                                </div>
                        </div>
                        <div class="form-group">
                            <lable for="shift_to" class="text-center col-lg-2 control-lable">Shift To:-</lable>
                            <div class="col-lg-3">
                                            <input type="text" class="form-control" name="shift_to" pattern='[A-Za-z \\s]*' value="<%= shift_to %>"/>

                                  
           
                            </div>
                                <lable for="billdate" class="text-center col-lg-2 control-lable">Date:-</lable>
                                <div class="col-lg-3">  
                                    <input type="date" class="form-control" placeholder="YYYY-MM-DD" name="billdate" />
                                </div>
                            </div>
                            
                        
                    <center><div class="btn">
                    <button type="Submit" class="btn btn-warning">Search</button>
            </form>

                        </div></center>
   
                        <div class="row"
                         </div>
                
                
                
                

        
       
            
        <table border= '1' align='center' width='60%' bgcolor='white'>
            <tr> <th>Sr no.</th><th>Details</th><th>Amount</th></tr>
            <tr><th> 1.</th><th>Transport Charges</th><th><input type="text" name="transport"/><br></br></th></tr>                         
        <tr><th> 2.</th><th>Packing Charges</th><th><input type="text" name="packing"/><br></br></th></tr>                         
        <tr><th> 3.</th><th>Loading Charges</th><th><input type="text" name="loading"/><br></br></th></tr>                         
        <tr> <th> 4.</th><th>Unloading Charges</th><th><input type="text" name="unloading"/><br></br></th></tr>                         
        <tr><th></th><th>Total Amount</th><th><input type="text" name="total"/></th></tr>                         
        </table><br></br>
        <center>              <button type="Submit" class="btn btn-warning">Save</button>
                    <button type="Submit" class="btn btn-warning">clear</button>
                    <button type="Submit" class="btn btn-warning">Print</button>

        </center>
      
    </body>
</html>
