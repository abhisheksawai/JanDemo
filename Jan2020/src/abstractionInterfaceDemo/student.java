package abstractionInterfaceDemo;

public class student {
	
	int roll;
	String name;
								//100     prachi
	public void pushdata(int r, String n)
	{
		int p=100;
		System.out.println(p);
		roll=r;
		name=n;
	}

	public void printdata()
	{
		System.out.println("roll is "+roll);
		System.out.println("name is "+name);
	}
}
