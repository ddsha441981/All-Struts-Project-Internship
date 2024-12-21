package com.phonebook;

import java.util.ArrayList;

public class PhoneModule {
int id;
String Name;
String Mobile;
String Email;
String msg;
String selectoption;
String searchBy;
PhoneModule phone;


public PhoneModule getPhone() {
	return phone;
}
public void setPhone(PhoneModule phone) {
	this.phone = phone;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getMobile() {
	return Mobile;
}
public void setMobile(String mobile) {
	Mobile = mobile;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}

public String getSelectoption() {
	return selectoption;
}
public void setSelectoption(String selectoption) {
	this.selectoption = selectoption;
}
public String getSearchBy() {
	return searchBy;
}
public void setSearchBy(String searchBy) {
	this.searchBy = searchBy;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
ArrayList<PhoneModule> list ;


public ArrayList<PhoneModule> getList() {
	return list;
}
public void setList(ArrayList<PhoneModule> list) {
	this.list = list;
}
@Override
public String toString() {
	return "PhoneModule [id=" + id + ", Name=" + Name + ", Mobile=" + Mobile + ", Email=" + Email + "]";
}

public String savecontact(){
	int j= DAOPhoneModule.contactSave(this);
	System.out.println("Data is "+j);

	if(j>0){

		msg="<div class='alert alert-success'><strong>Success!</strong> successful Contact Save.</div>";
		return "success";
	}
	msg="<div class='alert alert-danger'><strong>Danger!</strong> Contact Not Save  Successfully.</div>";
	return "error";
	
}

public String viewAllContact(){
	setList(DAOPhoneModule.contactsAll(this));
	System.out.println("Data is "+list);
	if(list.size()>0){
		return "success";
	}
	return "error";
	
}

public String deletedataById(){
	
	int j= DAOPhoneModule.contactdelete(getId());
	System.out.println("Data is "+j);
	if(getId()>0){
		msg="<div class='alert alert-danger'><strong>Danger!</strong> Contact Delete Successfully.</div>";
		return "success";
	}
	return "error";
	
}

public String searchByNameNmobile(){
	setList(DAOPhoneModule.searchByMobile(searchBy,selectoption));
	System.out.println("Data is "+list);
	if(list.size()>0){
		msg="<div class='alert alert-success'><strong>Success!</strong> Contact Search Successfully.</div>";
		return "success";
	}
	return "error";
	
}

public String fetchdataforUpdate(){
	
	setPhone(DAOPhoneModule.UpdatefetchbyId(getId()));
	if(phone.getId()>0)
	{
		System.out.println("Data fetch By Object"+phone);
	return "success";
	}
	return "error";
}

/*public String usercontactedit(){
	int d2 =DAOPhoneModule.updatemyContact(id);
	System.out.println("my update row is: ");
	if(d2>0)
	{
		return "success";
	}
	return "error";
}*/

}
