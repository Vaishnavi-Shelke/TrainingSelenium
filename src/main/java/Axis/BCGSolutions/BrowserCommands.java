package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get URL
		
		driver.get("https://automationexercise.com/");
		
		//get currentURL
		
		String currurl = driver.getCurrentUrl();
		
		System.out.println(currurl);
		
		//get page source code
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		// close() 
		driver.close();

	}

}
