package org.spring.LoginServices;

import org.spring.DaoLogin.LoginInterfaceMethods;
import org.spring.EmployeeBeans.CustomersBeans;
import org.spring.LoginBeans.LoginsBeans;
import org.spring.LoginDaoImpl.LoginRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService  implements LoginInterfaceMethods{

	@Autowired(required = true)
	LoginRepositry loginrepo;
	
	
	@Override
	public int loginForAdmin(LoginsBeans loginbeans) {
		
		System.out.println("In Service of Admin");
		return loginrepo.loginForAdmin(loginbeans);
	}

	@Override
	public int loginForEmployee(LoginsBeans loginbeans) {
		
		System.out.println("In Service of Employeee");
		return loginrepo.loginForEmployee(loginbeans);
	}

	@Override
	public int loginForCustomers(LoginsBeans loginbeans) {
		
		System.out.println("In Service of Customers");
		return loginrepo.loginForCustomers(loginbeans);
	}

	@Override
	public int forgotpwdForAdmin(LoginsBeans loginbeans) {
		
		System.out.println("In Service of Admin forgot Pwd");
		return loginrepo.forgotpwdForAdmin(loginbeans);
	}

	public LoginsBeans gotpwd(int recordfound){
		return loginrepo.gotpwd(recordfound);
	}
	@Override
	public String forgotpwdForEmployee(LoginsBeans loginbeans) {
		
		System.out.println("In Service of Employee forgot Pwd");
		return loginrepo.forgotpwdForEmployee(loginbeans);
	}

	@Override
	public String forgotpwdForcustomer(LoginsBeans loginbeans) {
		
		System.out.println("In Service of Customer forgot Pwd");
		return loginrepo.forgotpwdForcustomer(loginbeans);
	}

}
