package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathbytext {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Admin");
		driver.findElement(By.name("pass")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//span[text()='Log In]")).click();
		Thread.sleep(3000);
		String text=driver.findElement(By.cssSelector("div[class='x78zum5 xdt5ytf]")).getText();
		System.out.println(text);
		driver.quit();
	}
}
