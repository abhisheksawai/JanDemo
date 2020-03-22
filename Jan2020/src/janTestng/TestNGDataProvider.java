package janTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@Test(dataProvider = "userandpassdata")
	public void logintc(String username)
	{
		System.out.println("username-> "+username);
	}
	
	@DataProvider
	public Object[] userandpassdata()
	{
		Object arr[] = new Object[2];
		arr[0] = "abhishek";
		arr[1] = "abhijeet";
		//arr[2] = "punit";
		return arr;
	
	}
	

}
