package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("jaikumar@tcs.com");
		
		driver.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button").click();

		driver.findElementByLinkText("11187").click();
		
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementById("ext-gen247__ext-gen251").click();
		driver.findElementByName("phoneNumber").sendKeys("1616");
		driver.findElementByLinkText("Find Leads").click();

		
		Thread.sleep(2000);

		driver.close();
	}
}
