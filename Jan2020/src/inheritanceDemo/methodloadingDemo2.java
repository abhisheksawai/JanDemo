package inheritanceDemo;

public class methodloadingDemo2 {
	
	int num1;
	
	public int addition(int num1,int num2)
	{
		int sum; //local variable
		sum=num1+num2;
		System.out.println(sum);
		return sum;
		
	}
		
	public void addition(int num1)
	{
		int sum;
		sum=num1+num1;
		System.out.println(sum);
		System.out.println(this.num1);
	}
	
	public void addition(int no1,int no2,int no3)
	{
		int add;
		add= no1+no2+no3;
		System.out.println(add);
	}
	
	public void addition(int no1,float no2,int no3)
	{

	}
	
	public void addition(float no1,float no2,int no3)
	{

	}
	
	// here i ll paste
	public void addition(int num1,int num2, int num3, int num4)
	{
		System.out.println("something");
	}

	public void check()
	{
		System.out.println(num1);
	}
	
	
	public static void main(String[] args) {
		
		methodloadingDemo2 mo = new methodloadingDemo2();
		mo.addition(10, 20);
		
		
	}

}
