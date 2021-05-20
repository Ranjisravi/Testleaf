package week4.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailsort 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://erail.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("chkSelectDateOnly").click();	
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("mass");
		driver.findElementById("txtStationFrom").sendKeys(Keys.ENTER);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("buttonFromTo")).sendKeys(Keys.ENTER);		
		driver.findElementById("chkSelectDateOnly").click();	
		
		Thread.sleep(10000);
		driver.close();
	}

}