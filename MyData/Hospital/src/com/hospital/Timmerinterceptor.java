package com.hospital;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Timmerinterceptor implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void init() {
		System.out.println("Timmer Interceptor Started");
		
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		long starttime = System.currentTimeMillis();
		System.out.println("Before Processing" + starttime);
		String st = arg0.invoke();
		long endtime = System.currentTimeMillis();
		System.out.println("After Processing " +endtime);
		long  c = endtime-starttime;
		System.out.println("After Processing " +c);
		return st;
	}

}
