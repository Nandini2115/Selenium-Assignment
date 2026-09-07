package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/h2/a")).click();
		boolean productDisplayed = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).isDisplayed();
	}
}
