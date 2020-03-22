package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.paytm.com/");
		
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(3000);
		
		List <WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		int framesize = totalframe.size();
		System.out.println("size of iframe "+framesize);
		
		driver.switchTo().frame(0);		// into the frame
		//driver.switchTo().frame("nameofframe");
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	
		driver.switchTo().defaultContent();
		//driver.switchTo().defaultContent(); // back to normal portal
		
		driver.switchTo().parentFrame();
		
		
	}

}
