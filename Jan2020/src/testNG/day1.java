package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void demo()
	{
		System.out.println("demo hello");
	}
	@Test    
    public void executSessionOne() throws Exception{
            //First session of WebDriver
       // System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\IEDriverServer.exe");
		  
		WebDriver driver = new InternetExplorerDriver();
            //Goto guru99 site
            driver.get("https://www.facebook.com/");
            //find user name text box and fill it
            Thread.sleep(3000);
            driver.findElement(By.name("email")).sendKeys("Driver 1");
            
        }
    
	
	@Test
	public void secondtest()
	{
		System.out.println("bye");
	}

	@Test
	public void third()
	{
		System.out.println("third bye");
	}
}
