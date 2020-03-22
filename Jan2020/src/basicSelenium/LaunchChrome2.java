package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver =  new ChromeDriver();
		//WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("browser launched");
	
	}

}
