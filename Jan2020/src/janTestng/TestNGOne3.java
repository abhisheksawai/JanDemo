package janTestng;

import org.testng.annotations.Test;

public class TestNGOne3 {
	
	@Test(priority = 1)
	public void z()
	{
		System.out.println("TC01");
	}
	
	@Test(priority = 3)
	public void x()
	{
		System.out.println("TC02");
	}
	
	@Test(priority = 2)
	public void y()
	{
		System.out.println("TC03");
	}

}
