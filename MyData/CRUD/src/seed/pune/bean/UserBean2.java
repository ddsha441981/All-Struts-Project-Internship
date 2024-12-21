package seed.pune.bean;

import java.util.Date;


public class UserBean2 {

    private int id;
    private String fName;
    private String lName;
    private Date dob;
        
    
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "UserBean2 [id=" + id + ", fName=" + fName + ", lName=" + lName
				+ ", dob=" + dob + "]";
	}
		
}