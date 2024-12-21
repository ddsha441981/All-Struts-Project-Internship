package com.student.example;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Timmer implements Interceptor {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void init() {
		System.out.println("Timmer Interceptor is Started");
		
	}

	@Override
	public String intercept(ActionInvocation q1) throws Exception {
		long tt = System.currentTimeMillis();
		System.out.println("Before Processing" + tt);
		String w1 = q1.invoke();//Return a string object
		long ttt =System.currentTimeMillis();
		System.out.println("After Processing" + ttt);
		long total = ttt-tt;
		System.out.println("Total Time of Application"       +total );
		return w1;
	}

}
