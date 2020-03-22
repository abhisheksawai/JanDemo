package janTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDepend {
	
	@Test
	public void logintc()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("wrong xpath")).click();
	}
	
	@Test(dependsOnMethods = "logintc")
	public void secondtestcase()
	{
		System.out.println("TC02");
		
	}
	
	@Test
	public void y()
	{
		System.out.println("TC03");
	}

}
