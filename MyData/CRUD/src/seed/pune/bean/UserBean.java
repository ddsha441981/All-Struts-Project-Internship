package seed.pune.bean;

public class UserBean {

    private int id;
    private String fName;
    private String lName,email,numberofrooms,twomember,tel,threemember,check1,check2,check3;
        
    
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
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	
	
	
	public String getNumberofrooms() {
		return numberofrooms;
	}
	public void setNumberofrooms(String numberofrooms) {
		this.numberofrooms = numberofrooms;
	}
	public String getTwomember() {
		return twomember;
	}
	public void setTwomember(String twomember) {
		this.twomember = twomember;
	}
	public String getThreemember() {
		return threemember;
	}
	public void setThreemember(String threemember) {
		this.threemember = threemember;
	}
	public String getCheck1() {
		return check1;
	}
	public void setCheck1(String check1) {
		this.check1 = check1;
	}
	public String getCheck2() {
		return check2;
	}
	public void setCheck2(String check2) {
		this.check2 = check2;
	}
	public String getCheck3() {
		return check3;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCheck3(String check3) {
		this.check3 = check3;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", fName=" + fName + ", lName=" + lName
				+ ", email=" + email + ", numberofrooms=" + numberofrooms
				+ ", twomember=" + twomember + ", tel=" + tel
				+ ", threemember=" + threemember + ", check1=" + check1
				+ ", check2=" + check2 + ", check3=" + check3 + "]";
	}
	
	
	
	
	
	
}