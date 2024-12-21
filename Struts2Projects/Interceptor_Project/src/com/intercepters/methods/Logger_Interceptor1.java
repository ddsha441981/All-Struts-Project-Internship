package com.intercepters.methods;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Logger_Interceptor1 implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void init() {
		System.out.println("Method is Started");
		
	}

	@Override
	public String intercept(ActionInvocation a1) throws Exception {
		System.out.println("Before Processing ");
		String ss = a1.invoke();//this method return String means object ss
		System.out.println("After Processing");
		return ss;
		
	}

}
