package janTestng;

import org.testng.annotations.Test;

public class TestNGNoPri4NonNum {
	
	@Test(priority = 1)
	public void z()
	{
		System.out.println("TC01");
	}
	
	@Test
	public void x()
	{
		System.out.println("TC02");
	}
	
	@Test(priority = 0)
	public void y()
	{
		System.out.println("TC03");
	}

	@Test(priority = 0)
	public void p()
	{
		System.out.println("TC04-P");
	}
}
