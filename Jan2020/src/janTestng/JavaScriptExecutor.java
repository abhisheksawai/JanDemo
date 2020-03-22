package janTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	
	@Test
	public void logintc()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.in/");
		//driver.findElement(By.xpath("wrong xpath")).click();
		
		//JavaScriptExecutor jse = (JavaScriptExecutor) driver;
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('querytext').value='Pune'");
							   //driver.findElement(By.id("querytext")).sendKeys("pune");
		
	}
	

}
