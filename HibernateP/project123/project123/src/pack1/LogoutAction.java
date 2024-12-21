package pack1;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LogoutAction extends ActionSupport implements ModelDriven,SessionAware{
Map m;
	
LoginAction la=new LoginAction();
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		m.remove("uname");
		System.out.println("Logout Successfully");
		return SUCCESS;
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return la ;
	}

	public void setSession(Map arg0) {
	m=arg0;
		
	}
}
