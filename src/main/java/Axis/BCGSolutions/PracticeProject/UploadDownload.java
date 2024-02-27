package Axis.BCGSolutions.PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Upload File
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.xpath("//input[@name ='filename']"));
		
		upload.sendKeys("C:\\Users\\Admin\\Desktop\\C\\Example1.c");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='submit-button']")).click();
		
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		System.out.println("The file successfully Uploaded.");
		
		
	}
}
	


