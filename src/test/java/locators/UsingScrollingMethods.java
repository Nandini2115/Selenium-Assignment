package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingScrollingMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://doodles.google/");

        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

//        // Scroll down by 500 pixels
//        js.executeScript("window.scrollTo(0, 500)");
//        
//        Thread.sleep(2000);
//        
//        //using scrollby()
//        js.executeScript("window.scrollBy(0,1000)");
//        
//        Thread.sleep(2000);
//
        WebElement ele = driver.findElement(By.id("monthDropdown"));

        // Scroll until the element is visible
//        js.executeScript("arguments[0].scrollIntoView(true);",ele);
        js.executeScript("arguments[0].scrollIntoView(false);",ele);
        Thread.sleep(2000);
        driver.quit();
    }
}