package Day3_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		
		//create object for chromeoptions
		ChromeOptions opt = new ChromeOptions();
		
		//handle notification
		opt.addArguments("--disable-notifications");

		//launch the browser 
		WebDriver driver = new ChromeDriver(opt);
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//naviagate to application
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(1000);
		
		//locate One Way and select it
		driver.findElement(By.id("oway")).click();
		Thread.sleep(1000);
		
		//locate from field and click
		driver.findElement(By.id("FromSector_show")).click();
		Thread.sleep(1000);
		
		//locate text field and enter the data
		driver.findElement(By.id("a_FromSector_show")).sendKeys("delhi");
		Thread.sleep(1000);
		
		//select valid suggestion
		driver.findElement(By.id("spnNew Delhi")).click();
		Thread.sleep(1000);
		
		//locate to text field and enter data
		driver.findElement(By.id("a_Editbox13_show")).sendKeys("goa");
		Thread.sleep(1000);
		
		//select valid suggestion
		driver.findElement(By.id("spnGoa")).click();
		Thread.sleep(1000);
		
		//select departure date
		driver.findElement(By.id("img2Nex")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("img2Nex")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("snd_4_10/12/2026")).click();
		Thread.sleep(1000);
		
		//locate traveller and class and click
		driver.findElement(By.id("ptravlr")).click();
		Thread.sleep(1000);
		
		//select 2 adults
		driver.findElement(By.xpath("//button[@id='add']")).click();
		Thread.sleep(1000);
		
		//select the class as economy
		driver.findElement(By.id("rbEconomy")).click();
		Thread.sleep(1000);
		
		//locate done button and click
		driver.findElement(By.xpath("//a[@id='traveLer']")).click();
		Thread.sleep(1000);
		
		//locate search button and click
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);
		
		//verification
		String title = driver.getTitle();
		
		if(title.contains("EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com"))
			System.out.println("Flight results page is displayed");
		else
			System.out.println("Flight results page is not displayed");
		
		//close the browser
		Thread.sleep(2000);
		driver.quit();

	}

}
