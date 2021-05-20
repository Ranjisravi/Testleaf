package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication 
{

	public static void main(String[] args) throws InterruptedException 
    {
    	//Setup the Chrome driver
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		//Step1: To setup driver
		WebDriverManager.chromedriver().setup();
		
		//Step2: Open the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Step3: Load the application URL		
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //Step4: To maximise the window
		 driver.manage().window().maximize();
		 
		 //Java wait
		 Thread.sleep(2000);
		 
		 //Step5: To close the window
		 driver.close();
		
    }
}