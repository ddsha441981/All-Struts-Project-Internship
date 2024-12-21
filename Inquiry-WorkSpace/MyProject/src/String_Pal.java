public class String_Pal {
	
	public void StringBuffer()
	{
		StringBuffer sb = new StringBuffer("Deendayal");
		sb.replace(5, 9, "sharda");
		System.out.println(sb.toString());
		
	}
    public static void main(String[] args) {
    	
    	String_Pal sp = new String_Pal();
    	sp.StringBuffer();
        
    }
}
