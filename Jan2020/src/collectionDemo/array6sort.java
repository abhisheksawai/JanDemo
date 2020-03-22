package collectionDemo;

import java.util.Arrays;

public class array6sort {
	
	public static void main(String[] args) {
		
		int b[]=new int[3];//declaration and instantiation  
		b[0]=1306;
		b[1]=119;
		b[2]=229;
		
		for(int i=0; i <=2 ; i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("------");
				
		Arrays.sort(b);
				for(int i=0; i <=2 ; i++)
				{
					System.out.println(b[i]);
				}
				
	}

}
