package com.Ajax;

import java.util.Arrays;
import java.util.List;

public class AjaxCall2{
 private String id;
 private List groups;
 public List getGroups() {
	return groups;
}
 public void setGroups(List groups) {
	this.groups = groups;
}
 
 public String getId() {
	return id;
}
 public void setId(String id) {
	this.id = id;
}
 
 public String execute(){
	 System.out.println("Id : "+id);
	 setGroups(Arrays.asList(new String[]{"Gropu1","Group2","Group3"}));
	 return "success";
 }

}
