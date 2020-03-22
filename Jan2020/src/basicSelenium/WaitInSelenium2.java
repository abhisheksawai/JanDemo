package basicSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitInSelenium2 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhi"); //10
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("@1234"); //10
		
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		WebElement customgender = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		WebDriverWait wait  = new WebDriverWait (driver, 10);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(customgender));
		ele.sendKeys("check");
		
	}

}
