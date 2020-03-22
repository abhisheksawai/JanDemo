package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
	
		//	driver.navigate().back();
		Thread.sleep(2000);
	
		//	driver.navigate().forward();
		driver.navigate().refresh();
	
	}

}
