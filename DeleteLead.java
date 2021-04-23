package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElementById("username");
		username.sendKeys("Demosalesmanager");
		
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementById("ext-gen247__ext-gen251").click();
		driver.findElementByName("phoneNumber").sendKeys("1616");
		driver.findElementByLinkText("Find Leads").click();
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
