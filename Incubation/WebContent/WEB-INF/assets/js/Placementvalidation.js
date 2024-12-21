function Placemetvalidation()
{
	alert("In placement");

	
  if(validateCompnyname() & validateStatus() & validateDescrp() )
	   return true;
   else 
	   return false;
}



function validateCompnyname(){
	var name=document.getElementById("cpname").value; 
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
	var status=document.getElementById("pl_status").value; 
	 if(status=="default"){  
		document.getElementById("err_status").innerHTML = "Status is required..!";
		return false;  
	}else {
		document.getElementById("err_status").innerHTML = ""; 
		return true;
	}
}

function validateDescrp(){
	var name=document.getElementById("did").value; 
 if(name==null || name===""){  
	document.getElementById("d_err").innerHTML = "Please write valid description..!";
	return false;  
}else if(!/^[a-zA-Z ]{2,30}$/.test(name)){
	document.getElementById("d_err").innerHTML = "Please write valid description ..!";
	  return false;  
	  }else {
	document.getElementById("d_err").innerHTML = ""; 
	return true;
}
}





