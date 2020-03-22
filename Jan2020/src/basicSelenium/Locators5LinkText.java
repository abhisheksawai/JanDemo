package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Locators5LinkText {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	//	driver.findElement(By.linkText("Forgotten account?")).click();
		
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
		
	//	driver.findElement(By.partialLinkText("account")).click();
		
		driver.findElement(By.partialLinkText("otten acco")).click();
		
	}

}
