<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Add Users using ajax</title>
        <script src="static/js/jquery.js"></script>
        <script type="text/javascript">
        function doAjaxPost() {
        alert("Hello");
        // get the form values
        var name = $('#name').val();
        var education = $('#education').val();

        $.ajax({
        type: "POST",
        url: "/Spring-MVC-Jquery-Ajax-CRUD/AddUserAftersubmitForm",
        data: "name=" + name + "&education=" + education,
        success: function(response){
        // we have the response
        $('#info').html(response);
        $('#name').val('');
        $('#education').val('');
        },
        error: function(e){
        alert('Error: ' + e);
        }
        });
        }
        </script>
    </head>
    <body>
    <center>
        <h1>Add Users using Ajax ........</h1>
        <table>
            <tr><td>Enter your name : </td><td> <input type="text" id="name"><br/></td></tr>
            <tr><td>Education : </td><td> <input type="text" id="education"><br/></td></tr>
            <tr><td colspan="2"><input type="button" value="Add Users" onclick="doAjaxPost()"><br/></td></tr>
            <tr><td colspan="2"><div id="info" style="color: green;"></div></td></tr>
        </table>
        <a href="/Spring-MVC-Jquery-Ajax-CRUD/ShowUsers.htm">Show All Users</a>
   </center>
        
       
        
        
    </body>
</html>