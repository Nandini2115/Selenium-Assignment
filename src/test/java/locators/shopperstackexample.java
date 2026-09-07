package locators;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class shopperstackexample {

	public static void main(String[] args) throws InterruptedException, MalformedURLException{
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.shoppersstack.com/products_page/51");
        driver.findElement(By.id("Check Delivery")).sendKeys("583119");
        driver.findElement(By.id("Check")).click();
	}

}
