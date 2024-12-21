<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <!-- jQuery -->
<%-- <script type="text/javascript" src="./libs/jquery/jquery.js"></script> --%>

<!-- SmartMenus jQuery plugin -->
<script type="text/javascript" src="./jquery.smartmenus.js"></script>

<!-- SmartMenus jQuery init -->
<script type="text/javascript">
	$(function() {
		$('#main-menu').smartmenus({
			subMenusSubOffsetX: 1,
			subMenusSubOffsetY: -8
		});
	});
</script>




<!-- SmartMenus core CSS (required) -->
<link href="./css/sm-core-css.css" rel="stylesheet" type="text/css" />

<!-- "sm-blue" menu theme (optional, you can use your own CSS, too) -->
<link href="./css/sm-blue/sm-blue.css" rel="stylesheet" type="text/css" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->




<!-- YOU DO NOT NEED THIS - demo page content styles -->
<link href="./libs/demo-assets/demo.css" rel="stylesheet" type="text/css" />

<s:head theme="ajax" debug="true"/>
  <!-- $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Doctors Table Show Here $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ --> 
    <style type="text/css">

        .box{

            padding: 20px;

            display: none;

            margin-top: 20px;

            border: 1px solid #000;

        }

        .red{ background: none; }

        .green{ background: none; }

        .blue{ background: none; }
        .black{ background: none; }
        .white{ background: none; }
        .yellow{ background: none; }
        .pink{ background: none; }

    </style>

    <script type="text/javascript" src="jjs/jquery.js"></script>

    <script type="text/javascript">

    $(document).ready(function(){

        $("select").change(function(){

            $(this).find("option:selected").each(function(){

                if($(this).attr("value")=="red"){

                    $(".box").not(".red").hide();

                    $(".red").show();

                }

                else if($(this).attr("value")=="green"){

                    $(".box").not(".green").hide();

                    $(".green").show();

                }
 
               else if($(this).attr("value")=="blue"){

                    $(".box").not(".blue").hide();

                    $(".blue").show();

                } 
                

                else if($(this).attr("value")=="black"){

                    $(".box").not(".black").hide();

                    $(".black").show();

                } 
                

                else if($(this).attr("value")=="white"){

                    $(".box").not(".white").hide();

                    $(".white").show();

                } 
                

                else if($(this).attr("value")=="yellow"){

                    $(".box").not(".yellow").hide();

                    $(".yellow").show();

                } 
                

                else if($(this).attr("value")=="pink"){

                    $(".box").not(".pink").hide();

                    $(".pink").show();

                } 

                else{

                    $(".box").hide();

                }

            });

        }).change();

    });

    </script> 
   <!-- $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ -->  
   
  <!-- $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$css  menu$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ --> 
   <!-- Start css3menu.com HEAD section -->
	<link rel="stylesheet" href="CSS3 Menu_files/style.css" type="text/css" /><style type="text/css">._css3m{display:none}</style>
	<!-- End css3menu.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="engine1/style.css" />
	<script type="text/javascript" src="engine1/jquery.js"></script>
	<!-- End WOWSlider.com HEAD section -->
   <!-- $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ -->  
   
   <link rel="stylesheet" type="text/css" href="css/textbox.css">
</head>
<body>

<%@ include file="header.jsp" %>
<%@ include file="image-slider.jsp" %>

    
<h1 align="center">Make Appoitment</h1>
<!-- <table align="left">
	
	<tr>
		<td><a href="#">hello</a><br><br> </td>
		<td><a href="#">hello</a> </td>
		<td><a href="#">hello</a> </td>
		
	</tr>
</table>
 -->
 <p style="color: red;">*Indicates Mandatory Fields</p>
<table width="100%" bgcolor="#FFFFFF" border="0">
 <s:form action="appoitttt" method="post">
<%-- <tr>
<td><s:doubleselect name="country" label="Select Department" list="{'Anaesthesia','India'}" 
	 doubleName="city" doubleList="top=='USA' ? {'Deendayal','b','A','A','A','A'}:{'p','p','p','p','p','p','p'}">
	 </s:doubleselect></td>
</tr> --%>

<tr>
<td>
<%-- <s:datetimepicker label="Select Your Day" name="day" displayFormat="MM-dd-yy" required="true" cssClass="textboxis" /> --%>
<s:textfield label="Enter ID" name="id" required="true" cssClass="textboxis" ></s:textfield></td>
</tr>
<tr>
<td><s:select  label="Select Your Doctors"  name="doctors" list="%{#{'Select Doctors':'Select Doctors'} }" cssClass="textboxis">
			<s:optgroup  label="Anaesthesia" list="#{'deendayal':'deendayal','nitin':'nitin' }"  />
			<s:optgroup label="Cardiac Surgery" list="#{'Ratan':'Ratan','Bala':'Bala' }" />
			<s:optgroup label="Dentistry" list="#{'Ramesh':'Ramesh','Harsh':'Harsh' }" />
			<s:optgroup label="ENT" list="#{'kk':'kk','kumar':'kumar' }" />
			<s:optgroup label="Genernal Surgery" list="#{'manisha':'manisha','avantika':'avantika' }"/>
</s:select></td>
</tr>
<tr>
	<%-- <td><s:select list="{'jai','kk','jai','kk'}" value="red" label="hello">
	
	</s:select></td> --%>
	<td>See Your Doctors Details</td>
	<td><select Class="textboxis">
	<option>Doctors Details</option>
	<option value="red">Deendayal</option>
	<option value="green">Prajwal</option>
	<option value="blue">Prajwal</option>
	<option value="black">Prajwal</option>
	<option value="white">Prajwal</option>
	<option value="yellow">Prajwal</option>
	<option value="pink">Prajwal</option>
	</select></td>
</tr>
<tr>
<td>
<%-- <s:datetimepicker label="Select Your Day" name="day" displayFormat="MM-dd-yy" required="true" cssClass="textboxis" /> --%>
<s:textfield label="Select Your Day" name="day" required="true" cssClass="textboxis" ></s:textfield></td>
</tr>

<!--  <tr>
        	<th>Name</th>
        	<th>Skill</th>
        	<th>Time</th>
        	
        </tr>
        
        <tr>
        	<td>Deendayal</td>
        	<td>MBBS</td>
        	<td>7.00 Am to 1.00 Pm</td>
        </tr> -->

<tr>
<td><s:textfield label="Name of Patient" name="Aname" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Name of Person Taking The Appoitment" name="person" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Relationship with Patient" name="relation" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Contact Mobile Number" name="mob" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:textfield label="Email Id" name="Aemail" cssClass="textboxis"></s:textfield></td>
</tr>
<tr>
<td><s:radio label="Choose Gender"  list="{'Male','Female'}" name="pgender" value="Male"></s:radio></td>
</tr>
<tr>
<td><s:combobox label="Choose City" list="{'Pune','Jaipur','New Delhi'}" name="pcity" cssClass="textboxis"></s:combobox></td>
</tr>
<tr>
<td><s:textarea label="Any Other Queriy" name="qry" cols="23" rows="3" cssClass="textareais"></s:textarea></td>
</tr>
<tr>
<td><s:textarea label="Terms and Conditions" name="terms" cols="23" rows="3" value="Comming Soon" cssClass="textareais"></s:textarea></td>
</tr>
<tr>
<td><s:submit></s:submit></td>
</tr>
</s:form>
</table>
 
 <div class="red box">
        <table border="1">
        <tr>
        	<th>Name</th>
        	<th>Skill</th>
        	<th>Time</th>
        	
        </tr>
        <tr>
        	<td>Deendayal</td>
        	<td>MBBS</td>
        	<td>7.00 Am to 1.00 Pm</td>
        </tr>
        </table>
        </div>
    
    <div class="green box">
        <table border="1">
        <tr>
        	<th>Name</th>
        	<th>Skill</th>
        	<th>Time</th>
        	
        </tr>
        <tr>
        	<td>Deendayal</td>
        	<td>MBBS</td>
        	<td>7.00 Am to 1.00 Pm</td>
        </tr>
        </table>
        </div>
        
        <div class="blue box">
        <table border="1">
        <tr>
        	<th>Name</th>
        	<th>Skill</th>
        	<th>Time</th>
        	
        </tr>
        <tr>
        	<td>Deendayal</td>
        	<td>MBBS</td>
        	<td>7.00 Am to 1.00 Pm</td>
        </tr>
        </table>
        </div>
        
        <div class="black box">
        <table border="1">
        <tr>
        	<th>Name</th>
        	<th>Skill</th>
        	<th>Time</th>
        	
        </tr>
        <tr>
        	<td>Deendayal</td>
        	<td>MBBS</td>
        	<td>7.00 Am to 1.00 Pm</td>
        </tr>
        </table>
        </div>
        
        <div class="white box">
        <table border="1">
        <tr>
        	<th>Name</th>
        	<th>Skill</th>
        	<th>Time</th>
        	
        </tr>
        <tr>
        	<td>Deendayal</td>
        	<td>MBBS</td>
        	<td>7.00 Am to 1.00 Pm</td>
        </tr>
        </table>
        </div>
        
        <div class="yellow box">
        <table border="1">
        <tr>
        	<th>Name</th>
        	<th>Skill</th>
        	<th>Time</th>
        	
        </tr>
        <tr>
        	<td>Deendayal</td>
        	<td>MBBS</td>
        	<td>7.00 Am to 1.00 Pm</td>
        </tr>
        </table>
        </div>
        
        <div class="pink box">
        <table border="1">
        <tr>
        	<th>Name</th>
        	<th>Skill</th>
        	<th>Time</th>
        	
        </tr>
        <tr>
        	<td>Deendayal</td>
        	<td>MBBS</td>
        	<td>7.00 Am to 1.00 Pm</td>
        </tr>
        </table>
        </div>
    
   <%@include file="footer.jsp" %>

</body>
</html>