package seed.pune.bean;

public class UserBean1 {

    private int id;
    private String fName;
    private String lName,message;
        
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "UserBean1 [id=" + id + ", fName=" + fName + ", lName=" + lName
				+ ", message=" + message + "]";
	}	
	
	
	
	
	
}