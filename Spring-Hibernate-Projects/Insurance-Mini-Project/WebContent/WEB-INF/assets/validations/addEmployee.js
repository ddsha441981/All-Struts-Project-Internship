 function addNewEmployee()
  {
  	if(employeeName() & employeeLastName() & employeeEmail() & employeeMobile() & employeeDesignation() & employeePincode() & /*employeeCountry() & employeeState() &*/ employeeCity() & /*employeeOccuptions() &*/ employeeAddress())
  	{
  	return true;
  	}
  	else
  	{
  	return false;
  	}
  	
  	function employeeName()
  	{
  		alert("Name");
  		var letters = "[A-Za-z]";
  		var name=document.getElementById("empName").value;
  		if(name.match(letters))
  		{
  			document.getElementById("empNameError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  			
  		else
  		{
  			document.getElementById("empName").focus();
  			document.getElementById("empNameError").innerHTML="First Name must have alphabet only and Not Empty";
  			return false;
  		}
  	}
  	
  	function employeeLastName()
  	{
  		alert("LastName");
  		var letters = "[A-Za-z]";
  		var lastN = document.getElementById("lastName").value;
  		
  			if(lastN.match(letters))
  			{
  				document.getElementById("LastNameError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  				return true;
  			}
  			else
  			{
  				document.getElementById("lastName").focus();
  				document.getElementById("LastNameError").innerHTML="Last Name Must not be Empty or must have alphabet only ";
  				return false;
  			}	
  	}
  	
  	function employeeEmail()
  	{
  	var x = document.forms["myFormEmp"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if(x=="")
    {
    	document.getElementById("emailError").innerHTML="Email must not be empty";
    	
    	return false;
    }
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
    	document.getElementById("email").focus();
        document.getElementById("emailError").innerHTML="Enter a email followed by @";
        
        return false;
    }
    else{
    	document.getElementById("emailError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
    	return true;
    }
  	
  	}
  	
  	function employeeMobile()
  	{
  	alert("Mobile No");
  	var numbers = document.getElementById("empMobNo").value;
  		if(numbers=="")
  		{
  			document.getElementById("empMobNoError").innerHTML="Contact Number must not be Empty";
  			return false;
  		}
  		else if(numbers.length != 10)
  		{
  			document.getElementById("empMobNo").focus();
  			document.getElementById("empMobNoError").innerHTML="Contact Number should be 10 digits";
  			return false;
  		}
  		else if(isNaN(numbers))
  		{
  			document.getElementById("empMobNo").focus();
  			document.getElementById("empMobNoError").innerHTML="Number must be 0 to 9 digits only not allowed spacial characters and alphabat";
  		}
  		else
  		{
  			document.getElementById("empMobNoError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	
  	function employeeDesignation()
  	{
  	alert("custom nationality");
  	var nation = document.getElementById("empDesignation").value;
  		if(nation=="")
  		{
  			document.getElementById("empDesignationError").innerHTML="Designation Must not be empty";
  			return false;
  		}
  		else
  		{
  			document.getElementById("empDesignationError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	
  	function employeePincode()
  	{
  		alert("Pincode");
  		var pincode = document.getElementById("empPincode").value;
  			
  			if(pincode=="")
  			{
  				document.getElementById("empPincodeError").innerHTML="pincode must not be empty";
  				return false;
  			}
  			else if(pincode.length != 6)
  			{
  				document.getElementById("empPincodeError").innerHTML="Pincode should be 6 digit only";
  				return false;
  			}
  			else if(isNaN(pincode))
  			{
  				document.getElementById("empPincode").focus();
  				document.getElementById("empPincodeError").innerHTML="pincode only in digits 0 to 9";
  				return false;
  			}
  			else
  			{
  				document.getElementById("empPincodeError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  				return true;
  			}
  	}
  	
  	/*function employeeCountry()
  	{
  		alert("Country");
  		var country = document.getElementById("custCountry").value;
  		if(country=="")
  		{
  			document.getElementById("custCountryError").innerHTML="country must not be empty";
  			return false;
  		}
  		else
  		{
  			document.getElementById("custCountryError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}*/
  	
  	/*function employeeState()
  	{
  		alert("state");
  		var state = document.getElementById("custState").value;
  		if(state=="")
  		{
  			document.getElementById("custStateError").innerHTML="State must not be Empty";
  			return false;
  		}
  		else 
  		{
  			document.getElementById("empCityError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}	
  	}*/
  	
  	function employeeCity()
  	{
  		alert("City");
  		var city = document.getElementById("empCity").value;
  		if(city=="")
  		{
  			document.getElementById("empCityError").innerHTML="City Must not be Empty";
  			return false;
  		}
  		else
  		{
  			document.getElementById("empCityError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	
  	/*function employeeOccuptions()
  	{
  		alert("Occupation");
  		var Occupation = document.getElementById("custOccupation").value;
  		if(Occupation=="")
  		{
  			document.getElementById("custOccupationError").innerHTML="Occupation Must not be Empty";
  			return false;
  		}
  		else
  		{
  			document.getElementById("custOccupationError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	*/
  	function employeeAddress()
  	{
  		alert("Address");
  		var address = document.getElementById("address").value;
  		if(address=="")
  		{
  			document.getElementById("addressError").innerHTML="Address Must not be Empty";
  			return false;
  		}
  		else
  		{
  			document.getElementById("addressError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	
  	
 }