package janTestng;

import org.testng.annotations.Test;

public class TestNGNoPriAbhishek {
	
	@Test(priority = 0)
	public void x1()
	{
		System.out.println("TC01");
	}
	
	@Test(priority = -2)
	public void x2()
	{
		System.out.println("TC02");
	}
	
	@Test(priority = -1)
	public void x3()
	{
		System.out.println("TC03");
	}

	
}
