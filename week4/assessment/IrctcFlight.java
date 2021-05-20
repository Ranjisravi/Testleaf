package week4.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcFlight 
{	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElementByLinkText("OK").click();
		//driver.findElementByClassName("btn btn-primary").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		driver.findElementByLinkText("FLIGHTS").click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		List<String> handleList = new ArrayList<String>(windowhandles);
		
		String secondHandle = handleList.get(1);
		
		driver.switchTo().window(secondHandle);
		
		driver.findElementByXPath("//*[@id=\"modaladditionalPayment\"]/div/div/div[2]/button").click();
		
		String text = driver.findElementByXPath("/html/body/app-root/app-header/nav[1]/div/div/div[2]/a").getText();
		
		System.out.println(text);
		
		
		//Thread.sleep(2000);
		driver.close();
	}
}