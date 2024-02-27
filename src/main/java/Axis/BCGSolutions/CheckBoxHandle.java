package Axis.BCGSolutions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class CheckBoxHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement rdo1 = driver.findElement(By.xpath("(//input[@type= 'radio']) [1]"));
		
		if(rdo1.isSelected()) {
			
			rdo1.click();
		}
		

	}

}
