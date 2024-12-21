package Spring;

public class Login {
	String name,password;
public Login(){
	System.out.println("Default Con");
}
	
	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void user(){
		System.out.println(getName()+","+getPassword());
	}

}
