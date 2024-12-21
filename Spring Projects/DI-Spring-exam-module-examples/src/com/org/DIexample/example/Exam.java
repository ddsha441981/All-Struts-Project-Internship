package com.org.DIexample.example;

import java.util.Iterator;
import java.util.List;

/** @author Deendayal */
public class Exam {

	private int id;
	private String name;
	private String marks;

	private List<Question> questions;

	/**
	 * @param Depandancy
	 *            Injection
	 */

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	/**
	 * @param Setter
	 *            Getter
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println(" Exam Id \t " + getId() + "\n  Exam Name \t " + getName() + "\n  Exam Marks \t " + getMarks());
		
		for (Question question : questions) {
			System.out.println(question.getqId() + "," + question.getQuestion());
			System.out.println(question.toString());
			
			
		}

	}

	
}
