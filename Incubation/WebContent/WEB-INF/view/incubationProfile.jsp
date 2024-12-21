<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Intern Profile</title>

 <link rel="stylesheet" href="assets/css/bootstrap.min.css" >
<script src="assets/js1/bootstrap.min.js"></script>
<script  src="assets/js1/jquery-3.1.1.min.js"></script>
<script src="assets/Validation/InternValidation.js"></script>
</head>


<jsp:include page="header.jsp" /><br><br><br><br>
<body>
    
    <br>
    <div class="container-fluid">
        <div class="panel panel-success">
            <div class="panel-heading" align="center">
                <h4><b><font color="black" style="font-family: fantasy;">Intern Profile</font> </b></h4>
            </div>
            
            <div class="panel-body"align="center">
                  
                <div class="container " style="margin-top: 10%; margin-bottom: 10%;">
    
                    <div class="panel panel-success" style="max-width: 35%;" align="left">
                        
                        <div class="panel-heading form-group">
                            <b><font color="white">
                                Intern Profile</font> </b>
                        </div>
                        ${success }
                    
                        <div class="panel-body" >

                        <form:form name="myForm"  action="InternProfileaction" enctype="multipart/form-data" modelAttribute="internprofile" method="post" onsubmit="return InternValidation();" >
                            <div class="form-group">
                                <label for="exampleInputSalary">Enter Salary</label> 
                                <form:input
                                    type="text" class="form-control" name="i_salary" id="i_salary" path="i_salary"
                                    placeholder="Enter Salary"></form:input>
                                    <span style="color:red; font-weight:bold" id="salaryerror"></span>
                            </div>
                          
                            <div class="form-group">
                                <label for="exampleInputPercentage">Enter 12<sup>th</sup> Percentage/Grade</label> 
                                <form:input
                                    type="text" class="form-control" name="i_12th" id="i_12th" path="i_12th" 
                                    placeholder="Enter Marks" ></form:input>
                                    <span style="color:red; font-weight:bold" id="12markerror"></span>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPercentage">Enter 10<sup>th</sup> Percentage/Grade</label> <form:input
                                    type="text" class="form-control" name="i_10th" id="i_10th" path="i_10th" 
                                    placeholder="Enter Marks" ></form:input>
                                    <span style="color:red; font-weight:bold" id="10markerror"></span>
                            </div>
                            
                            <div class="form-group">
                                <label for="exampleInputPerecentage">Enter Degree Percentage/Grade</label> <form:input
                                    type="text" class="form-control" name="i_degree" id="i_degree" path="i_degree"  
                                    placeholder="Enter Degree Marks" ></form:input>
                                     <span style="color:red; font-weight:bold" id="degreeerror"></span>
                            </div>
                            
                             <div class="form-group">
                                <label for="exampleInputGradPercentage">Enter Post Graduation Percentage/Grade</label> <form:input
                                    type="text" class="form-control" name="i_pg" id="i_pg" path="i_pg" 
                                    placeholder="Enter Post Graduation Marks" ></form:input>
                                     <span style="color:red; font-weight:bold" id="gradueerror"></span>
                            </div>
                            
                              <div class="form-group">
                                <label for="exampleInputAddress">Enter Your Address</label> <form:input
                                    type="text" class="form-control" name="i_address" id="i_address" path="i_address" 
                                    placeholder="Enter Address Marks" ></form:input>
                                     <span style="color:red; font-weight:bold" id="addresserror"></span>
                            </div>
                           
                            
                              <div class="form-group">
                                <label for="exampleInputResume">Upload Your Resume</label> <form:input
                                    type="file" class="form-control" name="i_resume" id="i_resume" path="i_resume" 
                                    ></form:input>
                            </div> <button type="submit" style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" ><b>Create Profile</b></button>
                             </form:form>           
                            </div>  
                           
                                    
         
                        </div> 
                        
                    </div>
               
                </div>
               
            </div>    
            <div class="panel-footer" align="center"><font style="color: #111">Copyright @2014  <a href="http://mysite.com/">mysite.com</a>, All Rights Reserved. </font></div>
        </div>
       
</body>

</html>
