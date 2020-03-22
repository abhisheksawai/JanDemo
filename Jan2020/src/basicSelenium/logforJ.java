package basicSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logforJ {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		//here
				Logger log = Logger.getLogger("log demo Updated");
				PropertyConfigurator.configure("log4j.properties");
				
				
		//driver.manage().window().maximize();
		System.out.println("launch Chrome");
		log.info("log - browser launched Updated");
		
		
		driver.get("https://www.facebook.com/");	
		System.out.println("launch facebook");
		log.info("log - browser facebook Updated");
				
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhi"); //10
		System.out.println("entered username");
		log.info("log - browser enter username Updated");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("@1234"); //10
		System.out.println("entered password");
		log.info("log - entered password Updated");
	}

}
