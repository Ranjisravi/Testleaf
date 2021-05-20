package practiseprograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://erail.in/");
		driver.findElementByXPath("//input[@id = 'chkSelectDateOnly']").click();
		Thread.sleep(3000);
		driver.findElementById("txtStationFrom").clear();  
        driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("KKDI", Keys.TAB);
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']");
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		//WebElement rowCount = allRows.get(1);
		
		List<WebElement> allColumns = table.findElements(By.tagName("td"));
		
		//WebElement secColumn = allColumns.get(1); 
		int columnCount = allColumns.size(); 
		System.out.println(columnCount);
		 
		
		for(int i = 0; i< allRows.size(); i++)
		{
			WebElement rowtext = allRows.get(i);
			List<WebElement> allcolumn =  rowtext.findElements(By.tagName("td"));
			//int colcount = allcolumn.size();
			System.out.println(allcolumn.get(1).getText());
	}
		
		driver.close();

}
}
