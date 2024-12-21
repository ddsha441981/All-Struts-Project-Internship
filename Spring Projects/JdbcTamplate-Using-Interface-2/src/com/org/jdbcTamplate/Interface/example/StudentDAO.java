package com.org.jdbcTamplate.Interface.example;

import java.util.List;

public interface StudentDAO {
	public void create(int id ,String name,int age); /**@param here create data into database*/
	
	public List<Student> listStudents();/**@param here get all data of student*/
}
