package SauceDemoKeyword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class keyword_saucedemo {

    WebDriver driver;

    public void launchBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void openurl() {
        driver.get("https://www.saucedemo.com/");
    }

    public void username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    public void password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    public void login() {
        driver.findElement(By.id("login-button")).click();
    }

    public void closeBrowser() {
        driver.quit();
    }
}