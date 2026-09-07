package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shoppersStackDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.shoppersstack.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // First Login button
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Login']")
        )).click();

        // Email
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='Email']")
        )).sendKeys("karthik.h2656@gmail.com");

        // Password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='Password']")
        )).sendKeys("Pavithra@2656");
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Second Login button
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(.,'Login')]")
        )).click();
        WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.quit();
    }
}