package janTestng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkipTc2 {
	
	@Test
	public void z()
	{
		System.out.println("TC01");
	}
	
	@Test
	public void x()
	{
		System.out.println("TC02");
		//if(condition)
		System.out.println("Im in skip exception"); //valid
		throw new SkipException("Skipping this exception becasue soemthing broken");

	}
	
	@Test
	public void y()
	{
		System.out.println("TC03");
	}

}
