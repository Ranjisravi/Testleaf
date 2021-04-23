package week2.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {
	
	public static void main(String[] args) throws InterruptedException
	{
		 
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com");
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");
		 
	}
}