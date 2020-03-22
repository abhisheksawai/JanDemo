package janTestng;

import org.testng.annotations.Test;

public class TestNGNoPriParag {
	
	@Test(priority = 0)
	public void x1()
	{
		System.out.println("TC01");
	}
	
	@Test(priority = 0)
	public void x2()
	{
		System.out.println("TC02");
	}
	
	@Test(priority = 0)
	public void x3()
	{
		System.out.println("TC03");
	}

	
}
