function adminChangePassword(){
	
	alert("Method Call")
	if(emailIdValidate() && passwordValidate() && cfpasswordvalidate()){
		
		return true;
	}
	else{
		
		return false;
	}
}
	
	function emailIdValidate(){
		
		var x = document.forms["myForm"]["emailId"].value;
	    var atpos = x.indexOf("@");
	    var dotpos = x.lastIndexOf(".");
	    if(x==""){
	    	document.getElementById("emailError").innerHTML="Email must not be empty";
	    	
	    	return false;
	    }
	    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
	    	document.getElementById("emailId").focus();
	        document.getElementById("emailError").innerHTML="Enter a email followed by @";
	        
	        return false;
	    }
	    else{
	    	document.getElementById("emailError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
	    	return true;
	    }
	}
