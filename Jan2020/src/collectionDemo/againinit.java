package collectionDemo;

public class againinit {	
	
	{
		System.out.println("C");
	}
	static
	{
		System.out.println("B");
	}
	
	public againinit()
	{
		System.out.println("A");
	}
	
	public void againinit()
	{
		System.out.println("D");
	}
	
	public static void main(String[] args) {
		
		new againinit();
		
	}

}
