package Day3_Assignment;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//navigate to the application
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Thread.sleep(2000);
		
		//locate calender and click on it
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		Thread.sleep(1000);
		
		//Navigate to the next month in the current year.
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(1000);
		
		//Select any valid date from that month.
		driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, October 10th, 2026']")).click();
		Thread.sleep(1000);
		
		//Verify that the selected date is displayed correctly in the date field.
		WebElement text = driver.findElement(By.xpath("//input[@value='10/10/2026']"));
		
		if(text.getDomAttribute("value").contains("10/10/2026"))
			System.out.println("Selected  date is displayed");
		else
			System.out.println("selected date is not displayed");
		
		//close the browser
		Thread.sleep(2000);
		driver.quit();
	}

}
