package collectionDemo;

public class array3 {
	
	public static void main(String[] args) {
		
		// two d array
		
		int i1=100;
		System.out.println(i1);
		
		int b[][] =new int[2][2]; //declaration and instantiation  
		b[0][0]=106;
		b[0][1]=119;
		b[1][0]=229;
		b[1][1]=300;
		
				
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[1][1]);
		
		for(int i =0; i <=1; i ++)  //row
		{
			for(int j =0;j<=1;j++) // col
			{
				System.out.println(b[i][j]);
			}
		}
		
		
		
	}

}
