package keywordsdemo;

public class staticmehotdemo3 {
	
	{
		System.out.println("only block1");
	}
	
	public staticmehotdemo3()
	{
		System.out.println("defualt cons");
	}
	
	static
	{
		System.out.println("static block");
		System.out.println("static block2");
	}
	
	{
		System.out.println("only block2");  //Instance Initializer block 
	}
	
	public static void main(String[] args) {
		
		staticmehotdemo3 sd = new staticmehotdemo3();
		
	}

}
