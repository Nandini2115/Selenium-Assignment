package Day2_Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to facebook application 
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//capture the location of create new account button.
		WebElement button=driver.findElement(By.xpath("(//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'])[3]"));
		System.out.println(button.getLocation());
		
		//Capture the Dom Attribute and dom property for email address textfield before and after entering email address
		
		//Locate element(email textfield)
		WebElement email=driver.findElement(By.xpath("//input[@id='_R_1h6kqsqppb6amH1_']"));
		
		// Before entering email
		System.out.println("DOM Attribute before entering email: "+email.getDomAttribute("value"));
		System.out.println("DOM Property before entering email: "+email.getDomProperty("value"));
		email.sendKeys("nandini15@gmail.com");

		// After entering email
		System.out.println("DOM Attribute after entering email: " +email.getDomAttribute("value"));
		System.out.println("DOM Property after entering email: "+ email.getDomProperty("value"));
		
		//click on create new account
		button.click();
		
		//capture the size of the submit button
		WebElement submit=driver.findElement(By.xpath("(//span[text()='Submit'])"));
		System.out.println(submit.getSize());
		
		//capture the 3 css properties of submit button
		System.out.println(submit.getCssValue("color"));
		System.out.println(submit.getCssValue("display"));
		System.out.println(submit.getCssValue("font-size"));
		
		Thread.sleep(4000);
		
//		close the browser
		driver.quit();
	}
}