package Axis.BCGSolutions.PracticeProject;


	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class IFrame {
		public static void main(String[] args) throws InterruptedException, IOException {
			 System.setProperty("webdriver.chrome.driver",
					 "C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
					WebDriver driver=new ChromeDriver();
					driver.get("https://webdriveruniversity.com/IFrame/index.html");
					driver.manage().window().maximize();
					Thread.sleep(500);
					
					WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='frame']"));
					driver.switchTo().frame(newFrame);
					Thread.sleep(500);
				
					//driver.findElement(By.xpath("//*[@id='nav-title']")).click();
					driver.findElement(By.xpath("//*[@id='div-main-nav']/div/ul/li[2]/a")).click();
					System.out.println("Iframe Switched Successfully.");
					
		}				
	}

