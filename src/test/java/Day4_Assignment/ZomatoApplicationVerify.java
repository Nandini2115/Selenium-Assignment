package Day4_Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZomatoApplicationVerify {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Open Zomato
        driver.get("https://www.zomato.com/bangalore/delivery");

        Thread.sleep(5000);

        // Click Login
        driver.findElement(
                By.xpath("//*[normalize-space()='Log in']")
        ).click();

        Thread.sleep(3000);

        // Find phone number field
        WebElement phone = driver.findElement(
                By.xpath("//input")
        );

        // Enter phone number automatically
        phone.sendKeys("9876543210");
        Thread.sleep(3000);
        System.out.println("Phone number entered successfully");

        // Return to parent content
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        System.out.println("Successfully returned to parent content");

        Thread.sleep(2000);

        driver.quit();
    }
}
