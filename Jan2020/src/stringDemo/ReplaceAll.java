package stringDemo;

public class ReplaceAll {
	
	public static void main(String[] args) {
		
		String s="abhishek abhijeet abhi";  
		System.out.println("original string->"+s);
		
	//	System.out.println(s.replace("a", "c"));
		
		System.out.println(s.replaceAll("abhishek", "Kapil"));
		
	}

}
