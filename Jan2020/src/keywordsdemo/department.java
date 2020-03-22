package keywordsdemo;

public class department {
	
	static
	{
		System.out.println("static block");
	}	
	
	public department()
	{
		System.out.println("d1");
	}
	
	public static void main(String[] args) {
		
		department d1 = new  department();
		department d2 = new  department();
		
	}

}
