package edu.seed.dto;

import org.springframework.web.multipart.MultipartFile;

public class InternProfileBean {

	int i_salary;
	String i_12th;
	String i_10th;
	String i_degree;
	String i_pg;
	String i_address;
	//int i_resume;
	private MultipartFile i_resume;
    int userid;
    
public int getI_salary() {
	return i_salary;
}
public void setI_salary(int i_salary) {
	this.i_salary = i_salary;
}
public String getI_12th() {
	return i_12th;
}
public void setI_12th(String i_12th) {
	this.i_12th = i_12th;
}
public String getI_10th() {
	return i_10th;
}
public void setI_10th(String i_10th) {
	this.i_10th = i_10th;
}
public String getI_degree() {
	return i_degree;
}
public void setI_degree(String i_degree) {
	this.i_degree = i_degree;
}
public String getI_pg() {
	return i_pg;
}
public void setI_pg(String i_pg) {
	this.i_pg = i_pg;
}
public String getI_address() {
	return i_address;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public void setI_address(String i_address) {
	this.i_address = i_address;
}

public MultipartFile getI_resume() {
	return i_resume;
}
public void setI_resume(MultipartFile i_resume) {
	this.i_resume = i_resume;
}
public int getUserid() {
	return userid;
}

@Override
public String toString() {
	return "InternProfileBean [i_salary=" + i_salary + ", i_12th=" + i_12th + ", i_10th=" + i_10th + ", i_degree="
			+ i_degree + ", i_pg=" + i_pg + ", i_address=" + i_address + ", i_resume=" + i_resume + ", userid=" + userid
			+ "]";
}


}
