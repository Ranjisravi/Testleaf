package week2.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {


    public static void main(String[] args) 
    {
    	System.setProperty("webdriver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		/*
		 * String expectedTitle = "Welcome: Mercury Tours"; String actualTitle = "";
		 * 
		 * driver.get(baseUrl);
		 * 
		 * actualTitle = driver.getTitle();
		 * 
		 * if (actualTitle.contentEquals(expectedTitle)){
		 * System.out.println("Test Passed!"); } else {
		 * System.out.println("Test Failed"); }
		 * 
		 */        
		driver.close();
       
    }
}