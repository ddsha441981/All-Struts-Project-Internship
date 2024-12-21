package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.omg.PortableInterceptor.SUCCESSFUL;

import com.opensymphony.xwork2.ActionSupport;

public class download_resume extends ActionSupport {
	private InputStream inputStream;
	private String filename;
	private long contentlength;
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
public InputStream getInputStream() {
	return inputStream;
}
	public String getFilename() {
		return filename;
	}
	public long getContentlength() {
		return contentlength;
	}
public String execute()throws Exception{
	System.out.println("Inside File Download Page");
	File f=new File("Z:\\PriteshGajare\\project123\\WebContent\\SaveFile\\"+filename);
	inputStream= new FileInputStream(f);
	filename=f.getName();
	contentlength=f.length();
	return "success";
	
}
}
