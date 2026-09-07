package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethods {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open website
        driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");

        // Locate button
        WebElement button = driver.findElement(By.id("circle"));

        // Create Actions object
        Actions act = new Actions(driver);

        // Click and hold
        act.moveToElement(button).clickAndHold().build().perform();

        Thread.sleep(2000);

        // Release
        act.moveToElement(button).release().build().perform();

        System.out.println("Click and hold completed");

        driver.quit();
    }
}