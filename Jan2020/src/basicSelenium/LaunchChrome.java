package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebD
		driver.get("https://www.facebook.com/");
	
	}

}
