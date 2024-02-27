package Axis.BCGSolutions.PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		// WebElement click Alert
		
		WebElement webelealt = driver.findElement(By.xpath("//span[@id = 'button1']"));
		
		webelealt.click();
		
		Thread.sleep(500);
		
		Alert alt = driver.switchTo().alert();
		
		alt.dismiss();
		
		// JavaScript click Alert
		
		WebElement javasalt = driver.findElement(By.xpath("//span[@id = 'button2']"));
		
		javasalt.click();
		
		Thread.sleep(500);
		
		Alert alt1 = driver.switchTo().alert();
		
		alt1.dismiss();
		
		// Prompt Alert
		
		//WebElement promalt = driver.findElement(By.xpath("//input[@name = 'prompt']"));
		
		//promalt.click();
		
		//Thread.sleep(500);
		
		//Alert alt2 = driver.switchTo().alert();
		
		//alt2.accept();
		
		
}


}
