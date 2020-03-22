package janTestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGOne {
	
	@Test
	public void TC01Accountopen()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// remaining code you can have here....
		
		//{
		
		
		
		
		//}
		System.out.println("TC01");
	}
	
	@Test
	public void TC02accoutnclose()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// remaining code you can have here....
		System.out.println("TC02");
	}
	
	@Test
	public void TC03depositemoney()
	{
		
		System.out.println("TC03");
	}

}
