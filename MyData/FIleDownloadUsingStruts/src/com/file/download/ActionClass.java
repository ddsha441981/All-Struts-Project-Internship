package com.file.download;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.InputStream;

	import com.opensymphony.xwork2.ActionSupport;

	public class ActionClass extends ActionSupport{

		private InputStream fileInputStream;
		  
		public InputStream getFileInputStream() {
		 
			return fileInputStream;
		   
		}

		public String execute() throws Exception {
			fileInputStream = new FileInputStream(new File("c:\\downloadfile.txt"));

		    return SUCCESS;
		  
		}

		
	}

