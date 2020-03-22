package stringDemo;

public class Rervese {
	
	public static void main(String[] args) {
		
		String s="Abhishek";  
		System.out.println("original string->"+s);
		StringBuilder sb = new StringBuilder(s);
		System.out.println("string builder "+sb);
		System.out.println(sb.reverse());
		
	}

}
