package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementsDemo1 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
				
		WebElement forgot;
		forgot = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		System.out.println(forgot.getText());
		
		List <WebElement> linkname = driver.findElements(By.tagName("a"));
		int newsize = linkname.size();
		System.out.println(newsize);
		
		for(int i = 0 ; i < newsize ; i ++)
		{
			//System.out.println(linkname.get(i).getAttribute("href")); - all link and not its name
			//System.out.println(linkname.get(i)); getting random value
			System.out.println(linkname.get(i).getText());
		}
		
	}

}
