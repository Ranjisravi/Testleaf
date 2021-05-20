package week2.day1;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Toolsqa {
	
	public static void main(String[] args) throws InterruptedException
	{
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Execution complete");
		 
	}
}