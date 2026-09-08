package Day2_Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Testcase3 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement cartbutton = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));
	
		Dimension size = cartbutton.getSize();
		
		System.out.println("size of add to cart button: "+size);
		cartbutton.click();
		
		WebElement sclink = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		sclink.click();
		
		WebElement removecheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	
		if(removecheckbox.isSelected())
			System.out.println("remove check box is selected");
		else
			System.out.println("remove check box is not selected");
	
		System.out.println("check box width: "+removecheckbox.getRect().getWidth());
		System.out.println("check box Height: "+removecheckbox.getRect().getHeight());
		System.out.println("check box x offset: "+removecheckbox.getRect().getX());
		System.out.println("check box y offset: "+removecheckbox.getRect().getY());
		
		try
		{
			String text = driver.findElement(By.xpath("//div[@class='message']")).getText();
			System.out.println("alert message before clicking Apply coupon button: "+text);
		
		}
		
		catch(Throwable e)
		{
			System.out.println("alert message is not displayed before clicking apply coupon button");
		}
		
		driver.findElement(By.xpath("//input[@value='Apply coupon']")).click();
		Thread.sleep(2000);
		String text1 = driver.findElement(By.xpath("//div[@class='message']")).getText();
		
		if(text1.isBlank())
			System.out.println("alert message is not displayed after clicking apply coupon button");
		else
			System.out.println("alert message is displayed after clicking apply coupon button");
		
		WebElement laptop = driver.findElement(By.xpath("(//img[@title='Show details for 14.1-inch Laptop'])[2]"));
		File src = laptop.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/laptop.png");
		FileHandler.copy(src, des);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}