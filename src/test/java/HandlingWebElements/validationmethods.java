package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validationmethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");

        Thread.sleep(3000);
        
        WebElement tf = driver.findElement(By.id("small-searchterms"));
        
        //isdisplayed
        System.out.println(tf.isDisplayed());        
        //isenabled
        System.out.println(tf.isEnabled());
        
        //isselected
        driver.findElement(By.id("pollanswers-1")).click();
        System.out.println(driver.findElement(By.id("pollanswers-1")).isSelected());
        
        driver.quit();
	}
}
