package week4.assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LensKart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.lenskart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[@id=\"cssmenu\"]/div[2]/a").click();
		driver.findElementByXPath("//*[@id=\"categoryPage\"]/div[4]/div[1]/div/div/div[3]/div/ul/li[2]/div/label/span").click();
		driver.findElementByXPath("//*[@id=\"categoryPage\"]/div[4]/div[1]/div/div/div[4]/div/ul/li[1]/div/label/input").click();
		
		String text = driver.findElementByXPath("//*[@id=\"categoryPage\"]/div[8]/div[1]/div/div/div[1]/div[1]/div/div/div/div[3]/p/span").getText();
		System.out.println(text);
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
