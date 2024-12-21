



function InternValidation()
{
	
   if(i_salaryValidation() & markValidation() & marksValidation() &dmarksValidation() &  gmarksValidation() & addrValidation())
	   return true;
   else 
	   return false;
}


 function i_salaryValidation() {
	 var letters = /^[0-9]+$/;
		
	 if(i_salary.value.match(letters)) {
		
		 document.getElementById("salaryerror").innerHTML="";

		
			return true;
		} else {
			document.getElementById("salaryerror").innerHTML="Please Input Numeric Characters Only";
			i_salary.focus();
			return false;
		}

	
 }



 function markValidation() {
 	
 	var letters= /^[0-9]+$/;
 	
 	if (i_12th.value.match(letters)) {
 	
 		document.getElementById("12markerror").innerHTML="";
 		return true;
 	
 	}else {
 		document.getElementById("12markerror").innerHTML="Please Enter The Marks/Grade";

 		i_12th.focus();
 		return false;
 	}

 }
 
 function marksValidation() {
	 	
	 	var letters = /^[0-9]+$/;
	 	
	 	if (i_10th.value.match(letters)) {
	 	
	 		document.getElementById("10markerror").innerHTML="";
	 		return true;
	 	
	 	}else {
	 		document.getElementById("10markerror").innerHTML="Please Enter The Marks/Grade";

	 		i_10th.focus();
	 		return false;
	 	}

	 }

 function dmarksValidation() {
	 	
	 	var letters = /^[0-9]+$/;
	 	
	 	if (i_degree.value.match(letters)) {
	 	
	 		document.getElementById("degreeerror").innerHTML="";
	 		return true;
	 	
	 	}else {
	 		document.getElementById("degreeerror").innerHTML="Please Enter Degree Marks/Grade";

	 		i_degree.focus();
	 		return false;
	 	}

	 }
 
 function gmarksValidation() {
	 	
	 	var letters = /^[0-9]+$/;
	 	
	 	if (i_pg.value.match(letters)) {
	 	
	 		document.getElementById("gradueerror").innerHTML="";
	 		return true;
	 	
	 	}else {
	 		document.getElementById("gradueerror").innerHTML="Please Enter Graduation Marks/Grade";

	 		i_pg.focus();
	 		return false;
	 	}

	 }


 function addrValidation() {
	 	
	 	var letters = "";
	 	
	 	if (i_address.value.match(letters)) {
	 	
	 		document.getElementById("addresserror").innerHTML="";
	 		return true;
	 	
	 	}else {
	 		document.getElementById("addresserror").innerHTML="Please Enter Local Address";

	 		i_address.focus();
	 		return false;
	 	}

	 }


