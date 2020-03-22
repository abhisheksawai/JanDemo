package pOMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Loginpage {
	
	//all the objects of login page
	
	By username = By.id("email");
	By password =By.xpath("//input[@id='pass']");
	By login =By.xpath("//input[@value='Log In']");
	//WebDriver driver = new ChromeDriver();
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
		
	}

	public void enterusername()
	{
		//driver.get("https://www.facebook.com/");
		driver.findElement(username).sendKeys("Jayanta");
		//driver.findElement(By.xpath(p.getProperty("txt_username_login_FB"))).sendKeys("from Or-Abhishek");
		//driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("abhijeet");
	}
	
	public void enterpassword()
	{
		driver.findElement(password).sendKeys("pass@1234");
	}
	
	public void clickonlogin()
	{
		driver.findElement(login).click();
	}
	
	public void verifylogincheck() {
		
		//Assert.assertTrue(condition);
		
	}
	
	

}
