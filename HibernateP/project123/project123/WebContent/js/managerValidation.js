/**
 * 
 */
function validateID(){
	var id=document.getElementById("pid");
	if(id.value==""){
		document.getElementById("pidErr").innerHTML="Invalid ID";
		//alert("Invalid Id ");
//		alert("Id MUst Not be null");
		return false;
	}
	else{
		document.getElementById("pidErr").innerHTML="";
	return true;
	}
}

function validateName(){
	var id=document.getElementById("pname");
	if(id.value==""){
		//alert("Invalid Name ");
		document.getElementById("nameErr").innerHTML="Invalid Username";
//		alert("Id MUst Not be null");
		return false;
	}
	else{
		document.getElementById("nameErr").innerHTML="";
	    return true;
	}
}

function validateName1(){
	var id=document.getElementById("pwd");
	if(id.value==""){
		//alert("Invalid Name ");
		document.getElementById("password").innerHTML="Invalid Password";
//		alert("Id MUst Not be null");
		return false;
	}
	else{
		document.getElementById("password").innerHTML="";
	    return true;
	}
}

function managerForm(){
	if(validateName() & validateID() & validateName1()){
		return true;
	}
	else{
		return false;
	}
}