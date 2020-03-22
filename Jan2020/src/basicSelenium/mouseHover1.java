package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover1 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//click on accept payment 
		//driver.findElement(By.xpath("//span[text()='Accept Payments']"));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement lbl_electronics = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		
		Actions act = new Actions(driver);
		act.moveToElement(lbl_electronics).build().perform();
		//clickon mi
		driver.findElement(By.xpath("//a[@title='Mi']")).click();
		
		
	}

}
