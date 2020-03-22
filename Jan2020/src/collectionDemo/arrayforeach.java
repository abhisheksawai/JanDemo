package collectionDemo;

public class arrayforeach {
	
	public static void main(String[] args) {
		
		int b[]=new int[3];//declaration and instantiation  
		
	
			b[0]=306;
		b[1]=119;
		b[2]=229;
		
		System.out.println(b.length);
		int myarraysize = b.length;
		

		for(int i=0; i <myarraysize ; i++)
		{
			System.out.println(b[i]);
		}
			System.out.println("----for each wala output----");	
		
		for( int i : b)
		{
			System.out.println(i);
			
		}
		
	}

}
