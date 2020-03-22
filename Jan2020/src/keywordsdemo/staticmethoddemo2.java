package keywordsdemo;

public class staticmethoddemo2 {	
	public void m1()
	{
		System.out.println("m1");
	}
	
	public static void m2()
	{
		System.out.println("m2");
	}
	
	public static void main(String[] args) {		
		staticmethoddemo2 sd = new staticmethoddemo2();
		sd.m1();
		//sd.m2();
		m2();
	}

}
