package pack1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResumeList {
	
	List list3=new ArrayList();
	
	public List<String> getList3() {
		return list3;
	}

	public void setList3(ArrayList<String> list3) {
		this.list3 = list3;
	}

	public String execute() {
		
		File f=null;
		String[] paths;
		try{
			f= new File("Z:\\PriteshGajare\\project123\\WebContent\\SaveFile");
			paths=f.list();
			list3=Arrays.asList(paths);
			for(String path:paths)
			{
				System.out.println(paths);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}
}
