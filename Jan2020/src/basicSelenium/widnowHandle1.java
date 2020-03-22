package basicSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class widnowHandle1 {
	
	public static void main(String[] args) throws Exception {
		// correct windowhanlde program
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver/");
		Thread.sleep(5000);
		
		//click on below link to open new tab 
		driver.findElement(By.xpath("//*[@id='post-24495']/div[1]/div/div[2]/div/div/div/div/p[1]/em[4]/strong/a")).click();
		
		Set <String> windhandle = driver.getWindowHandles();
		
		Iterator <String> it = windhandle.iterator();
		
		String win1 = it.next(); // parent
		String win2 = it.next(); // child
		
		//we need to jump to the new tab
		driver.switchTo().window(win2);  // here switching to child window
		System.out.println(driver.findElement(By.xpath("//*[@id='primary-menu']/li[1]/a/span/span")).getText());
		
		driver.findElement(By.xpath("//*[@id='primary-menu']/li[1]/a/span/span")).click();
		Thread.sleep(5000);
		driver.switchTo().window(win1); // swithc to parent wind
		driver.findElement(By.xpath("//span[text()='Tutorial']")).click();
	}

}
