package Axis.BCGSolutions.PracticeProject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

public class ToDoList {
	   public static void main(String[] args) throws InterruptedException {
	       
	        
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
						
		      
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        Thread.sleep(800);
		        
		        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		        Actions actions = new Actions(driver);
		        Thread.sleep(800);
		        
		        WebElement AddNewTodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		        actions.moveToElement(AddNewTodo).perform();
		        Thread.sleep(800);
		        
		        AddNewTodo.sendKeys("Contact Us");
		        AddNewTodo.sendKeys(Keys.ENTER);
		        Thread.sleep(800);
		        
		        AddNewTodo.sendKeys("Login Function");
		        AddNewTodo.sendKeys(Keys.ENTER);
		        Thread.sleep(800);
		        
		        AddNewTodo.sendKeys("AddSignUp");
		        AddNewTodo.sendKeys(Keys.ENTER);
		        Thread.sleep(800);
		        
		        //
		        	        
	   }
}