package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait 
{
		public static void main(String[] args) throws InterruptedException 
		{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		driver.findElementById("username").sendKeys("Demosalesmanager");

		driver.findElementById("password").sendKeys("crmsfa");

		Thread.sleep(20000);
		
		driver.close();

	}
}
