package com;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Buscon extends ActionSupport implements SessionAware
{
 private String source,destination,jdate;
 Map m;
public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getJdate() {
	return jdate;
}

public void setJdate(String jdate) {
	this.jdate = jdate;
}
 @Override
	public String execute() throws Exception 
	{
	 m.put("bus","true");
	 m.put("source","source");
	 m.put("destination","destination");
	 return SUCCESS;
	}

@Override
public void setSession(Map arg0) {
	m=arg0;
	
}

}
