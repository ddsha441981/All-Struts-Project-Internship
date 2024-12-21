 function addNewCustom()
  {
  	if(customName() & customLastName() & customEmail() & customMobile() & customNationality() & customPincode() & customCountry() & customState() & customCity() & customOccuptions() & customAddress())
  	{
  	return true;
  	}
  	else
  	{
  	return false;
  	}
  	
  	function customName()
  	{
  		alert("Name");
  		var letters = "[A-Za-z]";
  		var name=document.getElementById("custName").value;
  		if(name.match(letters))
  		{
  			document.getElementById("custNameError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  			
  		else
  		{
  			document.getElementById("custName").focus();
  			document.getElementById("custNameError").innerHTML="First Name must have alphabet only and Not Empty";
  			return false;
  		}
  	}
  	
  	function customLastName()
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
  	
  	function customEmail()
  	{
  	var x = document.forms["myForm"]["custEmailId"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if(x=="")
    {
    	document.getElementById("emailError").innerHTML="Email must not be empty";
    	
    	return false;
    }
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
    	document.getElementById("custEmailId").focus();
        document.getElementById("emailError").innerHTML="Enter a email followed by @";
        
        return false;
    }
    else{
    	document.getElementById("emailError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
    	return true;
    }
  	
  	}
  	
  	function customMobile()
  	{
  	alert("Mobile No");
  	var numbers = document.getElementById("custMobNo").value;
  		if(numbers=="")
  		{
  			document.getElementById("mobileError").innerHTML="Contact Number must not be Empty";
  			return false;
  		}
  		else if(numbers.length != 10)
  		{
  			document.getElementById("custMobNo").focus();
  			document.getElementById("mobileError").innerHTML="Contact Number should be 10 digits";
  			return false;
  		}
  		else if(isNaN(numbers))
  		{
  			document.getElementById("custMobNo").focus();
  			document.getElementById("mobileError").innerHTML="Number must be 0 to 9 digits only not allowed spacial characters and alphabat";
  		}
  		else
  		{
  			document.getElementById("mobileError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	
  	function customNationality()
  	{
  	alert("custom nationality");
  	var nation = document.getElementById("custNationlity").value;
  		if(nation=="")
  		{
  			document.getElementById("custNationlityError").innerHTML="Nationlity Must not be empty";
  			return false;
  		}
  		else
  		{
  			document.getElementById("custNationlityError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	
  	function customPincode()
  	{
  		alert("Pincode");
  		var pincode = document.getElementById("custPincode").value;
  			
  			if(pincode=="")
  			{
  				document.getElementById("custPincodeError").innerHTML="pincode must not be empty";
  				return false;
  			}
  			else if(pincode.length != 6)
  			{
  				document.getElementById("custPincodeError").innerHTML="Pincode should be 6 digit only";
  				return false;
  			}
  			else if(isNaN(pincode))
  			{
  				document.getElementById("custPincode").focus();
  				document.getElementById("custPincodeError").innerHTML="pincode only in digits 0 to 9";
  				return false;
  			}
  			else
  			{
  				document.getElementById("custPincodeError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  				return true;
  			}
  	}
  	
  	function customCountry()
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
  	}
  	
  	function customState()
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
  			document.getElementById("custStateError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}	
  	}
  	
  	function customCity()
  	{
  		alert("City");
  		var city = document.getElementById("custCity").value;
  		if(city=="")
  		{
  			document.getElementById("custCityError").innerHTML="City Must not be Empty";
  			return false;
  		}
  		else
  		{
  			document.getElementById("custCityError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	
  	function customOccuptions()
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
  	
  	function customAddress()
  	{
  		alert("Address");
  		var address = document.getElementById("address").value;
  		if(address=="")
  		{
  			document.getElementById("custAddressError").innerHTML="Address Must not be Empty";
  			return false;
  		}
  		else
  		{
  			document.getElementById("custAddressError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
  			return true;
  		}
  	}
  	
  	
 }