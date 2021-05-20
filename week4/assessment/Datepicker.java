package week4.assessment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		driver.findElementById("datepicker").click();
		driver.findElementByXPath("//table[@class='ui-datepicker-calendar']//tr[3]/td[2]").click();
		
		Thread.sleep(2000);
		driver.close();
	}
	
}