package org.spring.DaoLogin;

import org.spring.EmployeeBeans.CustomersBeans;
import org.spring.LoginBeans.LoginsBeans;

public interface LoginInterfaceMethods {
	
	public int loginForAdmin(LoginsBeans loginbeans);
	public int loginForEmployee(LoginsBeans loginbeans);
	public int loginForCustomers(LoginsBeans loginbeans);
	public int forgotpwdForAdmin(LoginsBeans loginbeans);
	public String forgotpwdForEmployee(LoginsBeans loginbeans);
	public String forgotpwdForcustomer(LoginsBeans loginbeans);

}
