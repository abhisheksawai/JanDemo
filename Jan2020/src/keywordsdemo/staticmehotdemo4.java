package keywordsdemo;

public class staticmehotdemo4 {
	
	{
		System.out.println("only block1");
	}
	static
	{
		System.out.println("up static block4");
		System.out.println("up static block24");
	}
	public staticmehotdemo4()
	{
		System.out.println("defualt cons");
	}
	
	static
	{
		System.out.println("static block");
		System.out.println("static block2");
	}
	static
	{
		System.out.println("static block4");
		System.out.println("static block24");
	}
	{
		System.out.println("only block2");  //Instance Initializer block 
	}
	
	public static void main(String[] args) {
		
		staticmehotdemo4 sd = new staticmehotdemo4();
		
	}

}
