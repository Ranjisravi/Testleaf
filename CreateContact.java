package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		//sucessesfully executed
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
		
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		
		driver.findElementById("firstNameField").sendKeys("Testleaf");
		driver.findElementById("lastNameField").sendKeys("Testleaf");
		
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Ram");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("sita");
		
		driver.findElementByName("departmentName").sendKeys("Selenium");
		driver.findElementByName("description").sendKeys("Learning selenium at test leaf");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("testleaf@gmail.com");
		
		WebElement source = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select sp = new Select(source);
		sp.selectByVisibleText("New York");
		driver.findElementByClassName("smallSubmit").click();
//		driver.findElementByName("submitButton").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateContactForm_description").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("Selenium");
		driver.findElementByXPath("//*[@id=\"ext-gen9\"]").click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}