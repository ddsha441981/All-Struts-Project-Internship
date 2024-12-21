package com.serialization.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo1 implements Serializable {

	int x = 900;
	int y = 200;
	
}

class TestDemo1{
	
public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Demo1 demo = new Demo1();
		System.out.println("serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(oos);
		System.out.println("serialization End");
		
		System.out.println("Deserialization started");
		FileInputStream fio = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fio);
		Demo1  demo2 = (Demo1) ois.readObject();
		System.out.println("Deserialization End");
		System.out.println("x = " + demo2.x + "  " + demo2.y);
		 
	}
}
