package week3.classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		
		driver.findElementByName("search-suggestions-nykaa").sendKeys("Perfumes");
		
		driver.findElementByName("search-suggestions-nykaa").sendKeys(Keys.ENTER);
		
		List<WebElement> resultsList = getDriver().findElements(By.xpath(".//*[@class='m-content__product-list__title']"));
		
		for (WebElement result:resultsList) 
		{			
            System.out.println(result.getText());               
        }
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

	private static WebElement getDriver() 
	{
		return null;
	}
}