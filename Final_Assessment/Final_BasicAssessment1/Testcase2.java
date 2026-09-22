package Final_BasicAssessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		Thread.sleep(2000);

		WebElement slider = driver.findElement(By.id("slide"));
		slider.click();
		slider.sendKeys(Keys.HOME);
		slider.sendKeys(Keys.ARROW_RIGHT);
		slider.sendKeys(Keys.ARROW_RIGHT);
		slider.sendKeys(Keys.ARROW_RIGHT);

		Thread.sleep(2000);

		if (driver.getPageSource().contains("Mens Cotton Jacket")) {
			System.out.println("PASS: Mens Cotton Jacket is displayed");
		} else {
			System.out.println("FAIL: Mens Cotton Jacket is not displayed");
		}

		driver.quit();
	}
}