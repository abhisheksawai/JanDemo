package inheritanceDemo;

public class doubt extends methodloadingDemo2{
	
	public int addition(int num1,int num2)
	{
		System.out.println("from doubt");
		return num2;
	}

	public static void main(String[] args) {
		
		doubt d = new doubt();
		d.addition(10, 20);
		
	}
	
}
