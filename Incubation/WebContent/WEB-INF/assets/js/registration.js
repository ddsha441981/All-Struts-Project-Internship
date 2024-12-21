function resetform()
{
	document.getElementById("name").value="";
	document.getElementById("contactno").value="";
	document.getElementById("email").value="";
	document.getElementById("city").value="";
	document.getElementById("username").value="";
	document.getElementById("password").value="";
	document.getElementById("errorH3").value="";
	
}
function validateform(){ 
	
	if(validateName() & validateContact() & validateEmail() & validateCity() & validateUserName() & validatePassword() & validateBatchId() & validateStatus() & validateInterntype())
		return true;
	else
		return false;
	
}

function validateName(){
		var name=document.getElementById("name").value; 
	 if(name==null || name===""){  
		document.getElementById("err_name").innerHTML = "Name is required..!";
		return false;  
	}else if(!/^[a-zA-Z ]{2,30}$/.test(name)){
		document.getElementById("err_name").innerHTML = "Name must be alphabetic..!";
		  return false;  
		  }else {
		document.getElementById("err_name").innerHTML = ""; 
		return true;
	}
}
function validateContact(){
	
	var contact=document.getElementById("contactno").value; 
	 if(contact==null || contact===""){  
		document.getElementById("err_contact").innerHTML = "contact required..!";
		return false;  
	}else if(!/^\d{10}$/.test(contact)){
		document.getElementById("err_contact").innerHTML = "only numbers allowed..!";
		  return false;  
		  } else {
		document.getElementById("err_contact").innerHTML = ""; 
		return true;
	}
}
function validateEmail(){
	
	var email=document.getElementById("email").value; 
	var reg =/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
	if(email==null || email===""){  
		document.getElementById("err_email").innerHTML = "email required..!";
	  return false;  
	 }
	 else if(reg.test(email) == false){
		document.getElementById("err_email").innerHTML = "invalid email address..!";
		return false;  
	} 
	else {
		document.getElementById("err_email").innerHTML = "";
		return true;  
	}
}
function validateCity(){
	
	var city=document.getElementById("city").value; 
	 if(city==null || city===""){  
		document.getElementById("err_city").innerHTML = "City required..!";
		return false;  
	}else if(!/^[a-zA-Z ]{2,30}$/.test(city)){
		document.getElementById("err_city").innerHTML = "City must alphabetic..!";
		  return false;  
		  }else {
		document.getElementById("err_city").innerHTML = ""; 
		return true;
	}
}
function validateUserName(){
	
	
	var username=document.getElementById("username").value; 
	 if(username==null || username===""){  
		document.getElementById("err_username").innerHTML = "User Name is required..!";
		return false;  
	}else {
		document.getElementById("err_username").innerHTML = ""; 
		return true;
	}
}

function validatePassword(){
	
	var password=document.getElementById("password").value; 
	 if(password==null || password===""){  
		document.getElementById("err_password").innerHTML = "passowrd required..!";
		return false;  
	}else {
		document.getElementById("err_password").innerHTML = ""; 
		return true;
	}
}

function validateBatchId(){
	
	var bid=document.getElementById("b_id").value; 
	 if(bid==0){  
		document.getElementById("err_b_id").innerHTML = "Batch Id required..!";
		return false;  
	}else {
		document.getElementById("err_b_id").innerHTML = ""; 
		return true;
	}
}

function validateStatus(){
	var status=document.getElementById("status").value; 
	 if(status=="default"){  
		document.getElementById("err_status").innerHTML = "Status is required..!";
		return false;  
	}else {
		document.getElementById("err_status").innerHTML = ""; 
		return true;
	}
}
	 
	 function validateInterntype(){
			
			var interntype=document.getElementById("intern_type").value; 
			 if(interntype==0){  
				document.getElementById("err_intern_type").innerHTML = "Intern type is  required..!";
				return false;  
			}else {
				document.getElementById("err_intern_type").innerHTML = ""; 
				return true;
			}
	 }





