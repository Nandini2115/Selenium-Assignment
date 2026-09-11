package Day4_Assignment;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookApplicationTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Facebook application
        driver.get("https://www.facebook.com/");

        // Find all text fields
        List<WebElement> textFields = driver.findElements(By.xpath("//input"));

        // Print number of text fields
        System.out.println("Number of text fields: " + textFields.size());

        // Enter text in any one text field
        if (textFields.size() > 0) {
            textFields.get(0).sendKeys("nandini2115");
            System.out.println("Text entered successfully");
        }

        driver.quit();
    }
}
