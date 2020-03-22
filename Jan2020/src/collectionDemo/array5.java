package collectionDemo;

public class array5 {
	
	public static void main(String[] args) {
		
		int b[]=new int[3];//declaration and instantiation  
		b[0]=1306;
		b[1]=119;
		b[2]=229;
		

		
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);

		for(int i=0; i <=2 ; i++)
		{
			System.out.println(b[i]);
		}
				
		for (int c:b)
		{
			System.out.println(c);
		}
		
	}

}
