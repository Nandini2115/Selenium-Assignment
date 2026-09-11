package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//navigate to the application
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		
		//locate user name text enter the data enter the password
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce");
		Thread.sleep(1000);
		
		//locate login button and click
		driver.findElement(By.id("login-button")).click();
		
		//locate any element at bottom of the page
		WebElement ele = driver.findElement(By.xpath("//div[@class='footer_copy']"));
		
		//downcast
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll till the element
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
		
		//downcast
		TakesScreenshot tks = (TakesScreenshot)driver;
		
		//take screenshot and store
		File src = tks.getScreenshotAs(OutputType.FILE);
		
		//address where img should be stored
		File des = new File("./screenshot/products_page.png");
		
		FileHandler.copy(src, des);
		
		//close the browser
		Thread.sleep(2000);
		driver.quit();
		
	}

}