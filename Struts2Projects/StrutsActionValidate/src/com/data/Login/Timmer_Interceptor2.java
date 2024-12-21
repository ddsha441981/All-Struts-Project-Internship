package com.data.Login;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Timmer_Interceptor2 implements Interceptor {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void init() {
		
		System.out.println("Method is Started");
	}

	@Override
	public String intercept(ActionInvocation b1) throws Exception {
		
		long srttime =System.currentTimeMillis();
		System.out.println("Before Processing"+srttime);
		String dd = b1.invoke();
		long endtime = System.currentTimeMillis();
		System.out.println("After Processing"+endtime);
		long  c = endtime-srttime;
		System.out.println("Total time of Application"+c);
		return dd;
	}

}
