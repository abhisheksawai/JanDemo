package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Locators4 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//using id
	//	driver.findElement(By.id("email")).sendKeys("9403115588");
	//	driver.findElement(By.id("pass")).sendKeys("pass@123");
		
		//using name
	//	driver.findElement(By.name("email")).sendKeys("passinname");
	//	driver.findElement(By.name("pass")).sendKeys("pass#123");
		
		driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("classanme");
		
		driver.findElement(By.className("_2aUbKa")).click();
		
	}

}
