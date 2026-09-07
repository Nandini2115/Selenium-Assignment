package locators;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.shoppersstack.com/products_page/51");
        driver.findElement(By.id("Check Delivery")).sendKeys("583119");
        WebElement ref=driver.findElement(By.id("Check"));
        FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
        wait.pollingEvery(Duration.ofMillis(200));
        wait.ignoring(TimeoutException.class);
        wait.withMessage("Element is not clickable within duration");
        wait.withTimeout(Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ref));
		ref.click();
	}

}
