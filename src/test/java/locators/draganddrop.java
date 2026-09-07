package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");

        // Locate source
        WebElement source = driver.findElement(By.xpath("//div[text()='Drag Me']"));

        // Create Actions object
        Actions act = new Actions(driver);

        // Perform drag and drop
        act.dragAndDropBy(source,100,200).perform();

        driver.quit();
    }
}