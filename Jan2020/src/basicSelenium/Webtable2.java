package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webtable2 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\jan batch jar files unzip\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List <WebElement> row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int rowcount = row.size();
		System.out.println("rowcount"+rowcount);
		
		List <WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
		int colcount = col.size();
		System.out.println("colcount"+colcount);
		
		String first = "//*[@id='leftcontainer']/table/tbody/tr[";
		String second = "]/td[1]";
		String fourth = "]/td[4]";
		
		String checkcomp = "Parag Milk Foods";
		
		for(int i = 1 ; i < 10 ; i ++)
		{
				//System.out.println(driver.findElement(By.xpath(first+i+second)).getText());
				String actualcomp = driver.findElement(By.xpath(first+i+second)).getText();
				
				if(checkcomp.equals(actualcomp))
				{
					System.out.println("got on row "+i);
					System.out.println(driver.findElement(By.xpath(first+i+fourth)).getText());
					
				}
				
		}
		
	}

}
