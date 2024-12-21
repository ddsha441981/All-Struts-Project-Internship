package com.org.DIexample.example;

import java.util.Arrays;

/**@author Deendayal*/
public class Question {

	private int qId;
	private String question;
	private String[] opt;
	
	
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getOpt() {
		return opt;
	}
	public void setOpt(String[] opt) {
		this.opt = opt;
	}
	@Override
	public String toString() {
		return "Question [opt=" + Arrays.toString(opt) + "]";
	}
	
	
	
	
}
