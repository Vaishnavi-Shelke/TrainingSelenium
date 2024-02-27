package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InvokeFirefox {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
		

	}

}

 
