package Axis.BCGSolutions.PracticeProject;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ButtonClicks {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
			driver.manage().window().maximize();
			Thread.sleep(500);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0 , 400)", "");
			Thread.sleep(500);
			WebElement clickMeButton = driver.findElement(By.cssSelector("#button1"));
			clickMeButton.click();
			Thread.sleep(500);

			System.out.println("Clicked");
			 WebElement closeButton = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[3]/button"));
		        closeButton.click();
			Thread.sleep(500);
			
			
			WebElement clickMeButton1 = driver.findElement(By.cssSelector("#button2"));
			clickMeButton1.click();
			Thread.sleep(500);

			System.out.println("Clicked");
			 WebElement closeButton1 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[3]/button"));
		        closeButton1.click();
			Thread.sleep(500);
			
			
			WebElement clickMeButton2 = driver.findElement(By.cssSelector("#button3"));
			clickMeButton2.click();
			Thread.sleep(500);
			
			System.out.println("Clicked");
			 WebElement closeButton2 = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[3]/button"));
		        closeButton2.click();
		        System.out.println("Successful");
			Thread.sleep(500);
		}

	}


