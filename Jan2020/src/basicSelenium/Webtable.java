package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webtable {
	
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
		
		//String firstpart = "//*[@id='leftcontainer']/table/tbody/tr[4]/td[1]";
		///String 
		//WebElement first = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["));
		//WebElement second = driver.findElement(By.xpath("]/td[1]"));
		
		String first = "//*[@id='leftcontainer']/table/tbody/tr[";
		String second = "]/td[1]";
		
		String checkcomp = "Future Lifestyle";
		
		for(int i = 1 ; i < 10 ; i ++)
		{
			//for(int j =1;j<4 ; j++)
			//{
				//System.out.println(row.get(i).getText());
				//System.out.println(first+i+second.getText());
			//	System.out.println(first+i+second);
				System.out.println(driver.findElement(By.xpath(first+i+second)).getText());
				
				
			//}
		}
		
	}

}
