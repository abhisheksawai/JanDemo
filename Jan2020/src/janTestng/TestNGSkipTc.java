package janTestng;

import org.testng.annotations.Test;

public class TestNGSkipTc {
	
	@Test
	public void z()
	{
		System.out.println("TC01");
	}
	
	@Test(enabled = false)
	public void x()
	{
		System.out.println("TC02");
	}
	
	@Test
	public void y()
	{
		System.out.println("TC03");
	}

}
