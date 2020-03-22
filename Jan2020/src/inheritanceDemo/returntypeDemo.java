package inheritanceDemo;

public class returntypeDemo {
	
	
	public void sub(int num1,int num2)
	{
		int sub;
		sub=num1-num2;
		System.out.println(sub);
	}
	
	public int substraction(int num1,int num2)  //This method must return a result of type int
	{
		int sub;
		sub=num1-num2;
		//System.out.println(sub);
		return sub;
	}
	
	public static void main(String[] args) {
		
		returntypeDemo r = new returntypeDemo();
		r.sub(20, 5);
		//r.substraction(50, 20);
		
		int assignsomeone;
		assignsomeone=r.substraction(50, 20);
		System.out.println(assignsomeone);
	}

}
