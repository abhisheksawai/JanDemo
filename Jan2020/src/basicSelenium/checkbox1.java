package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox1 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='u_0_7']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id='u_0_7']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id='u_0_7']")).isSelected());
		
	}

}
