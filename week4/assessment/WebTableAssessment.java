package week4.assessment;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableAssessment {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> row = driver.findElementsByXPath("//table[@id='table_id']//tr");
		int rowCount = row.size();
		System.out.println("Total number of rows: " + rowCount );
		
		List<WebElement> data= driver.findElementsByXPath("//table[@id='table_id']//td");
		int datacount = data.size();
		System.out.println("Total number of columns: " + datacount );
		
		String datum = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[1]").getText();
		String SelectedData = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		System.out.println("The progressive value of " + datum +" is " + SelectedData);
		
		
		/*
		 * for(int i = 2; i <= rowCount; i++) { for(int j = 1; j <= datacount; j++) {
		 * String text = driver.findElementByXPath("//table[@id='table_id']//tr[" +i+
		 * "]/td[" +j+ "]").getText(); System.out.println(text); } }
		 */
		driver.close();
	}
}