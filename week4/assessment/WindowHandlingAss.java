package week4.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingAss 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementById("home").click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		List<String> handleList = new ArrayList<String>(windowhandles);
		
		String secondHandle = handleList.get(1);
		
		driver.switchTo().window(secondHandle);
		
		driver.findElementByLinkText("Button").click();
		
		driver.switchTo().window(handleList.get(0)).close();
			
		//Thread.sleep(20000);
		
		//driver.close();
				
		}

}