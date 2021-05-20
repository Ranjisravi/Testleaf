package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
	 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElementById("username"); // shortcut to save in a variable cntrl+2(press together), press L
		username.sendKeys("Demosalesmanager");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");

		Select dd = new Select(source);

		dd.selectByVisibleText("Conference");
		
		dd.selectByValue("LEAD_CONFERENCE");
		
		dd.selectByIndex(1);
		
		List<WebElement> allOptions = dd.getOptions();
		
		int itemsCount = allOptions.size();
		
		int lastIndex = itemsCount-1;
		
		dd.selectByIndex(lastIndex);
		
		WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mc); 
		dd1.selectByVisibleText("Automobile");
		
		Thread.sleep(2000);

		driver.close();

	}

}