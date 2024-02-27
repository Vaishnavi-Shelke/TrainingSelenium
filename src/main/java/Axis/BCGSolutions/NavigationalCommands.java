package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get URL
		
		driver.get("https://automationexercise.com/");
		
		// Navigate forwards in browser history
		
		driver.navigate().forward();
		
		//Thread.sleep(500);
		
		// Navigate backward in browser history
		
		driver.navigate().back();
		
		//Thread.sleep(500);
		
		// Refresh Page 
		driver.navigate().refresh();
		
		driver.close();

	}

}



