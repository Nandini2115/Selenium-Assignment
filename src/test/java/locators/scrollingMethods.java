package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollingMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        WebElement ele=driver.findElement(By.linkText("Facebook"));
        Actions act=new Actions(driver);
        act.scrollToElement(ele).perform();
	}

}
