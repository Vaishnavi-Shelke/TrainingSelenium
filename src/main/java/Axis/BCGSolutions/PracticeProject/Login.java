package Axis.BCGSolutions.PracticeProject;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		WebElement contact = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
		contact.click();
		Thread.sleep(1000);

		// find current Window
		String currentWin = driver.getWindowHandle();

		// list all windows
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		for (String win : childwindow)

				// check current window is selected window
				if (!win.equals(currentWin)) {
				
				// if not current window , then switch to selected window
				driver.switchTo().window(win);
				Thread.sleep(1000);
				
				WebElement username = driver.findElement(By.xpath("//input[@id='text']"));
				username.sendKeys("webdriver");
				System.out.println("Username is = webdriver");
				
				WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
				password.sendKeys("webdriver123");
				System.out.println("Password is = webdriver123");
				
				WebElement login = driver.findElement(By.xpath("//button[@id='login-button']"));
				login.click();

				Thread.sleep(1000);
				
				Alert alt = driver.switchTo().alert();
				System.out.println(alt.getText());
				alt.accept();
			}

	}

}
	
	
