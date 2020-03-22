package janTestng;


import org.testng.annotations.Test;

public class TestNGOne2  {
	
	@Test
	public void z()
	{
		System.out.println("TC01");
		ForAbhijeet.abhimethod();
	}
	
	@Test
	public void x()
	{
		System.out.println("TC02");ForAbhijeet.abhimethod();
	}
	
	@Test
	public void y()
	{
		System.out.println("TC03");ForAbhijeet.abhimethod();
	}

}
