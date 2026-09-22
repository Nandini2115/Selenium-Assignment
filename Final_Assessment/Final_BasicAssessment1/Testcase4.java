package Final_BasicAssessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase4 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.shoppersstack.com/products_page/64");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pincode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[contains(@class,'pinForm')]//input")));
        pincode.sendKeys("583229");

        WebElement checkButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[contains(@class,'pinForm')]//button")));
        checkButton.click();
        System.out.println("Product pincode availability checked");

        driver.quit();
    }
}