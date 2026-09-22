package Final_BasicAssessment1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/ui/toggle/disabled?sublist=1");

        WebElement t1 = driver.findElement(By.id("tog"));
        WebElement t2 = driver.findElement(By.id("togg"));
        WebElement t3 = driver.findElement(By.id("toggl"));
        WebElement t4 = driver.findElement(By.id("toggler"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Toggle 1
        js.executeScript("arguments[0].removeAttribute('disabled')", t1);
        js.executeScript("arguments[0].click()", t1);
        Thread.sleep(1000);

        // Toggle 2
        js.executeScript("arguments[0].removeAttribute('disabled')", t2);
        js.executeScript("arguments[0].click()", t2);
        Thread.sleep(1000);

        // Toggle 3
        js.executeScript("arguments[0].removeAttribute('disabled')", t3);
        js.executeScript("arguments[0].click()", t3);
        Thread.sleep(1000);

        // Toggle 4
        js.executeScript("arguments[0].removeAttribute('disabled')", t4);
        js.executeScript("arguments[0].click()", t4);

        System.out.println("All toggles clicked");

        // Place Order
        driver.findElement(By.id("togglers")).click();
        System.out.println("Place Order clicked");
        Thread.sleep(1000);

        // Verify order
        if (driver.findElement(By.xpath("//p[text()='ORDER PLACED']")).isDisplayed()) {
            System.out.println("Order is placed");
        } else {
            System.out.println("Order is not placed");
        }

        Thread.sleep(2000);

        driver.quit();
    }
}