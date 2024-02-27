package Axis.BCGSolutions.PracticeProject;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DropCheckRadio {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			
			driver.manage().window().maximize();
			Thread.sleep(500);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0 , 400)", "");
			Thread.sleep(500);
			
			Select dropdown = new Select(driver.findElement(By.id("dropdowm-menu-1")));
			dropdown.selectByVisibleText("SQL");
			Thread.sleep(500);
			System.out.println("Dropdown menu 1 open and click");

			dropdown = new Select(driver.findElement(By.id("dropdowm-menu-2")));
			dropdown.selectByVisibleText("Maven");
			Thread.sleep(500);
			System.out.println("Dropdown menu 2 open and click");

			dropdown = new Select(driver.findElement(By.id("dropdowm-menu-3")));
			dropdown.selectByVisibleText("JQuery");
			Thread.sleep(500);
			System.out.println("Dropdown menu 3 open and click");

			WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
			checkbox1.click();
			Thread.sleep(500);
			System.out.println("Checkbox no.1 checked");

			WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='option-2']"));
			checkbox2.click();
			Thread.sleep(500);
			System.out.println("Checkbox no.2 checked");

			WebElement checkbox4 = driver.findElement(By.xpath("//input[@value='option-4']"));
			checkbox4.click();
			Thread.sleep(500);
			System.out.println("Checkbox no.4 checked");

			WebElement radioButton = driver.findElement(By.xpath("//input[@value='green']"));
			radioButton.click();
			System.out.println("Radio button click successfully.");
			
		}

	}



