package Axis.BCGSolutions.PracticeProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class DatePicker {
	
			public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
		
				driver.get("https://webdriveruniversity.com/");
		
				driver.manage().window().maximize();
		
		
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement ele = driver.findElement(By.xpath("//a[@id='datepicker']"));
				js.executeScript("arguments[0].scrollIntoView(true);",ele);
				System.out.println("Site Opened");
				
				WebElement fn = driver.findElement(By.xpath("//a[@id='datepicker']"));
				fn.click();
				System.out.println("Picker Clicked");
				
				Set<String> windowHandles = driver.getWindowHandles();
				for (String windowHandle : windowHandles) {
					driver.switchTo().window(windowHandle);
				}
				
				WebElement fn2 = driver.findElement(By.xpath("//span[@class='input-group-addon']"));
				fn2.click();
				
				WebElement fn3 = driver.findElement(By.xpath("//td[@class='day'][normalize-space()='28']"));
				fn3.click();
				
				System.out.println("Successful");
				
				driver.close();
			}
				

		
		

}


