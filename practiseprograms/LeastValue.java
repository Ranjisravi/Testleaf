package practiseprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeastValue
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> row = driver.findElementsByXPath("//table//tr//td[2]");
		
		List<Integer> vital  = new ArrayList<Integer>();
		
		for (WebElement mark : row) {
			String least = mark.getText().replaceAll("%", "");
			vital.add(Integer.parseInt(least));
			
		}
		Collections.sort(vital);
		int lowest = vital.get(0);
		
		driver.findElementByXPath("//td[contains(text(), '"+lowest+"')]/following::input").click();
		
		driver.close();
		
	}
}