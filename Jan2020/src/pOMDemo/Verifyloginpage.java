package pOMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verifyloginpage {
	
	Loginpage lp1;
	
	@Test
	public void verifylogin()
	{
		System.out.println("runing verify login test case");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		lp1 = new Loginpage(driver);
		lp1.enterusername();
		lp1.enterpassword();
		lp1.clickonlogin();
		lp1.verifylogincheck();
		
	}

	@Test
	public void verifyloginagain()
	{
		System.out.println("runing verify login test case");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		lp1 = new Loginpage(driver);
		lp1.enterusername();
		lp1.enterpassword();
		lp1.clickonlogin();
	}
	
}
