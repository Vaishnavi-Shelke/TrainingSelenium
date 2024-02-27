package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement Date = driver.findElement(By.xpath("//input[@id= datepicker)]"));
		
		Date.click();
		
		WebElement newDate = driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']"));
				
		newDate.click();

}
}
