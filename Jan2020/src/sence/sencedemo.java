package sence;

import org.openqa.selenium.chrome.ChromeDriver;

public class sencedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qa.ssense.com/en-in/checkout");
	}

}
