package Day5_Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

    public static void main(String[] args) throws IOException {

        // Create Properties object
        Properties prop = new Properties();

        // Read data from properties file
        FileInputStream fis = new FileInputStream("./src/test/resources/DDT/Testcase1.properties");

        prop.load(fis);

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Navigate to Demo Web Shop
        driver.get(prop.getProperty("url"));

        // 2. Click on Login link
        driver.findElement(By.className("ico-login")).click();

        // 3. Enter email
        driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));

        // Enter password
        driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));

        // Click Login button
        driver.findElement(By.cssSelector("input[value='Log in']")).click();

        // Close browser
        driver.quit();
    }
}