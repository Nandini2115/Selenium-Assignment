package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("file:///C:/Users/pavit/OneDrive/Desktop/Example.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement untf = driver.findElement(By.id("username"));

        // Set value in the disabled username field
        js.executeScript("arguments[0].value = arguments[1];",untf,"selenium");

        WebElement pwtf = driver.findElement(By.id("password"));

        // Set value in the disabled password field
        js.executeScript("arguments[0].value = arguments[1];",pwtf,"selenium123");
        
        WebElement buttonb=driver.findElement(By.id("loginBtn"));
        js.executeScript("arguments[0].removeAttribute('disabled');",buttonb);
        buttonb.click();
        
        Thread.sleep(2000);

        driver.quit();
    }
}