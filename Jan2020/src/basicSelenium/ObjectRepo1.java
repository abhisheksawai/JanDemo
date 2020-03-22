package basicSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepo1 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@name='Newemail']")).sendKeys("xpath1");
		
		File src = new File("E:\\World Of Program\\Jan2020\\AnyNameobjectRepo.properties");
		FileInputStream fis = new FileInputStream(src);
		
		Properties p = new Properties();
		p.load(fis);
		
	//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("normalxpath");
		driver.findElement(By.xpath(p.getProperty("txt_username_login_FB"))).sendKeys("from Or-Abhishek");
		
		//driver.findElement(By.xpath("txt_username_login_FB")).sendKeys("fromor");
		
	}
}
