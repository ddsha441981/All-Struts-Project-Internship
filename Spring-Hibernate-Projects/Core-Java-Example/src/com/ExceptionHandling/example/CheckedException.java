package com.ExceptionHandling.example;

public class CheckedException {

	public static void main(String[] args) {

		throw new Error();// its unchecked exception no error at Compile time
							// but Runtime its raised exception because its
							// unchecked  exception and compiler not responsible to handle
							// such types of exceptions(unchecked) And such
							// types of exceptions responsible programmer
	}
}
