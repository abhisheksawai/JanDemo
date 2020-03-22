package accessModifiersDemo;

public class am1 {
	
	private int i =10;
	
	void m1()
	{
		System.out.println("m1");
	}

	public static void main(String[] args) {
		
		am1 a = new am1();
		System.out.println(a.i);
		a.m1();
		
	}
	
}
