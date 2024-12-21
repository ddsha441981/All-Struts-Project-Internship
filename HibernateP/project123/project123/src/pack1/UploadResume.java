package pack1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class UploadResume extends ActionSupport implements ServletRequestAware {
	
   private File myFile;
   private String myFileContentType;
   private String myFileFileName;
   private String destPath;

   public String execute()throws Exception
   {
	   
	   try{
      /* Copy file to a safe location */
	  String path="Z:\\PriteshGajare\\project123\\WebContent\\SaveFile";
	  
      destPath = "SaveFile";
  
     	System.out.println("Src File name: " + myFile);
     	 System.out.println("Dst File name: " + myFileFileName);
     	    	 
     	 File destFile  = new File(path, myFileFileName);
     	 System.out.println(" cretaed Path : "+destFile.getParent()+" File Name : "+destFile.getName());
     	 FileUtils.copyFile(myFile, destFile);
 
      }catch(Exception e){
         e.printStackTrace();
         return ERROR;
      }

      return SUCCESS;
   }
   public File getMyFile() {
      return myFile;
   }
   public void setMyFile(File myFile) {
      this.myFile = myFile;
   }
   public String getMyFileContentType() {
      return myFileContentType;
   }
   public void setMyFileContentType(String myFileContentType) {
      this.myFileContentType = myFileContentType;
   }
   public String getMyFileFileName() {
      return myFileFileName;
   }
   public void setMyFileFileName(String myFileFileName) {
      this.myFileFileName = myFileFileName;
   }
   
   HttpServletRequest request;
public void setServletRequest(HttpServletRequest arg0) {
	this.request=arg0;
	
}
}