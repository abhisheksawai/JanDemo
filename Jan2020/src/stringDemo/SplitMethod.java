package stringDemo;

public class SplitMethod {
	
	public static void main(String[] args) {
		
		String s="abcdahjkhaklklayuyu";  
		System.out.println("original string->"+s);
		String sepwords[] = s.split("a");
		
		for(int i =0 ; i<sepwords.length ; i++)
		{
			System.out.println(sepwords[i]);
		}
		
	}

}
