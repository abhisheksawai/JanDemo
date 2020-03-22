package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement dd_day = driver.findElement(By.xpath("//select[@id='day']"));
		dd_day.click();
		
//		Select sday = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		Select sday = new Select(dd_day);
		//sday.selectByIndex(3);
	//	Thread.sleep(3000);
	//	sday.selectByVisibleText("10");
	//	Thread.sleep(3000);
		//sday.selectByValue("11");
		
		System.out.println( sday.getOptions());
		int size = sday.getOptions().size();
		
	
		for(int i =0 ; i<size ;i ++)
		{
			System.out.println( sday.getOptions().get(i).getText());
		}
		
		
	}

}
