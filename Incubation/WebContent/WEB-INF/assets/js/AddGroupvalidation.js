function AddGrpvalidation()
{
	alert("hiii");
	
   if(validateGrpname() & validateStatus() & validateBatch() )
	   return true;
   else 
	   return false;
}



function validateGrpname(){
	var name=document.getElementById("g_name").value; 
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

function validateStatus(){
	var status=document.getElementById("g_status").value; 
	 if(status=="default"){  
		document.getElementById("err_status").innerHTML = "Status is required..!";
		return false;  
	}else {
		document.getElementById("err_status").innerHTML = ""; 
		return true;
	}
}
function validateBatch(){
	
	var bid=document.getElementById("selectbatch").value; 
	 if(bid==0){  
		document.getElementById("b_error").innerHTML = "Select the batch..!";
		return false;  
	}else {
		document.getElementById("b_error").innerHTML = ""; 
		return true;
	}
}


