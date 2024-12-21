
function validation()
{
	
   if(validateUsername() & validatePassword())
	   return true;
   else 
	   return false;
}


 function validateUsername() {
    var x = document.forms["myForm"]["username"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
      
        document.getElementById("usernameError").innerHTML="Enter a valid  username(email) followed by @";
        return false;
    }
    else{
    	document.getElementById("usernameError").innerHTML="";
    	return true;
    }
}

function validatePassword()
                      {
		alert("Password script");
 var password =document.getElementById("password").value;
if(password==null || password=="")   
   {
			document.getElementById("passwordError").innerHTML="password Must not be empty..!!";
			return false;
   }
		else if(password.length != 5)
		       {
			document.getElementById("passwordError").innerHTML="Enter Valid Password Number..!!";
			return false; 
		        }
	 	else        {
			document.getElementById("passwordError").innerHTML="";
			return true;
		            }
               }	 



