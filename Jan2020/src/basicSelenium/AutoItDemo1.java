package basicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo1 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.pdftoword.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Select your file']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\lenovo\\Desktop\\Nov Weekend\\Batch Data\\JanAuto\\JanAutoitFile.exe");
		Thread.sleep(3000);
		
	}

}
