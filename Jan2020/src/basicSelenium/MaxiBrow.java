package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxiBrow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		//String pg = driver.getPageSource();
		
	
	}

}
