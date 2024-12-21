package com.multiOverview;

public class OverloadingRunMethod extends Thread {

	public void run(){
		System.out.println("No Arg run method");
	}
													//Here overload concept apply
	public void run(int i){
		System.out.println("With Argument Method");
	}

}
