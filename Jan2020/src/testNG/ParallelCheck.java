package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelCheck {
	
	@Test    
    public void executSessionOne(){
            //First session of WebDriver
		System.setProperty("webdriver.ie.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.name("email")).sendKeys("Driver 1");
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("Driver 2");
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("Driver 3");
     }        

}
