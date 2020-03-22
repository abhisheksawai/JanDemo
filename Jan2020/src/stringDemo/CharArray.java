package stringDemo;

public class CharArray {
	
	public static void main(String[] args) {
		
		String s="abhijeet";  
		char ch[] = s.toCharArray();
		System.out.println(ch);
		
		for(int i =0 ; i<ch.length ; i++)
		{
			System.out.println(ch[i]);
		}
		
	}

}
