package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoom 
{
	public static void main(String[] args) throws InterruptedException
	{
		//Set up the chrome driver
		WebDriverManager.chromedriver().setup();
		
		//Step1: Open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Step2: Load the application URl
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Step3: To maximise the window
		driver.manage().window().maximize();
		
		WebElement username = driver.findElementById("username");
		username.sendKeys("Demosalesmanager");
		
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		
		
		//Java wait
		Thread.sleep(2000);
		
		//Step4: Close the browser
		driver.close();
		
		
	}

}
