package Axis.BCGSolutions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {
	
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://the-internet.herokuapp.com/tables");
 
		driver.manage().window().maximize();
		
		// implicit wait will wait for all the elements in the script to load before it could throw 
		//element not found exception

				driver.manage().timeouts().implicitlyWait(20 , TimeUnit.MILLISECONDS);
 
		Thread.sleep(500);
		
		// finding no of rows
		
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		int rowcount = rowno.size();
		
		System.out.println(rowcount);
		
		Thread.sleep(500);
		
		// finding no of columns
		
		List<WebElement> columnno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		
		int colcount = columnno.size();
		
		System.out.println(colcount);
		
		// explicit wait is used to wait for a particular element based on the expected condition
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
		
		WebElement celldata = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]"));
		
		String text = celldata.getText();
		
		String expectedtext = "tconway@earthlink.net";
		
		if (text.equals(expectedtext)) {
			
			System.out.println("The celldata is correct");
		}
		else {
			
			System.out.println("The celldata is incorrect");
		}

}
}
