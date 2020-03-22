package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementCommands2 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//WebElement w = new WebElement();
		WebElement username;
		username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("abhishek");
		username.clear();
		
		WebElement forgot;
		forgot = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		System.out.println(forgot.getText());
		
		System.out.println("printing classname");
		System.out.println(username.getAttribute("class"));
		
		//Forgotten account?
		String ex = "forgot acc";
		String actual;
		actual  = forgot.getText();
		System.out.println("actula "+actual);
		
		if(ex.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		//userna
		
		// send key abhishek here
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek");
		
	}

}
