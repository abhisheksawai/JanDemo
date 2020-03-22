package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandsSubmit5 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//driver.findElement(By.xpath("//input[@value='Log In']")).submit();
		
		System.out.println(driver.findElement(By.xpath("//input[@value='Log In']")).getLocation());
		
		
	}

}
