package Axis.BCGSolutions.PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Actions/index.html");
 
		driver.manage().window().maximize();
 
		Thread.sleep(500);
 
		// drag and drop
 
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Thread.sleep(500);
 
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
 
		Actions builder = new Actions(driver);
 
		builder.dragAndDrop(src, dest).perform();
 
		System.out.println("The item is dragged and dropped");
		
		//Double click
		
		WebElement doubleclickele = driver.findElement(By.xpath("//div[@id='double-click']"));
			
		Actions builder1 = new Actions(driver);
		
		builder1.doubleClick(doubleclickele).perform();
		
		System.out.println("Object is Double Clicked");
		
				  WebElement hover = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me First!')]")); 
				  builder.moveToElement(hover).perform(); 
				 
				  WebElement hoveredlink1 = driver.findElement(By.xpath("(//a[@class='list-alert'][normalize-space()='Link 1'])[1]")); 
				  hoveredlink1.click(); 
				 
				  Alert alt1 = driver.switchTo().alert(); 
				  alt1.accept(); 
				  System.out.println("link is hovered on"); 
				  WebElement hover2 = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me Second!')]")); 
				  builder.moveToElement(hover2).perform(); 
				 
				  WebElement hoveredlink2 = driver.findElement(By.xpath("(//a[@class='list-alert'][normalize-space()='Link 1'])[2]")); 
				  hoveredlink2.click(); 
				 
				  alt1.accept(); 
				  System.out.println("link is hovered on"); 
				  WebElement hover3 = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me Third!')]")); 
				  builder.moveToElement(hover3).perform();
		
				  WebElement hoveredlink3 = driver.findElement(By.xpath("(//a[@class='list-alert'][normalize-space()='Link 1'])[3]")); 
				  hoveredlink3.click(); 
						 
				  alt1.accept();
				  System.out.println("link is hovered on"); 
				  WebElement hoveredlink4 = driver.findElement(By.xpath("(//a[@class='list-alert'][normalize-space()='Link 1'])[4]")); 
				  hoveredlink4.click(); 
				 
				  alt1.accept(); 
				  System.out.println("Mouse Hovered Successfully"); 
		
		
		// Single Click
		
		WebElement singleclickele = driver.findElement(By.xpath("//div[@id='click-box']"));
		
		builder1.click(singleclickele).perform();
		
		Thread.sleep(500);
		System.out.println("Click and Hold Successfully");
		
		// Informational Alerts
		
		//Alert alt = driver.switchTo().alert();
		
		//alt.accept();
		
		// Context click, right click
		
		builder1.contextClick(doubleclickele).perform();
		System.out.println("Context click successfully");
		
 
	}
 

}
