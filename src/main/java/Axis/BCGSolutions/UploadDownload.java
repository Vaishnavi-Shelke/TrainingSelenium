package Axis.BCGSolutions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	WebElement upload = driver.findElement(By.xpath("//input[@name ='upload']"));
	
	upload.sendKeys("C:\\Users\\Admin\\Desktop\\C\\Example1.c");
	
	WebElement download = driver.findElement(By.xpath("//input[@name ='download']"));
	
	download.click();
	
	Thread.sleep(500);

	File file = new File("file:///D:/Certificates/CV.pdf");
	
	if (file.exists()) {
		System.out.println("The file exists:");
	} else {
		System.out.println("The file does not exist.");
	}
	
}
}