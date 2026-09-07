package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.myntra.com/");
        driver.findElement(By.className("desktop-searchBar")).sendKeys("shoes");
        Thread.sleep(2000);
        List<WebElement> sugg = driver.findElements(By.xpath("//li[contains(@class,'desktop-suggestion')]"));
        for (WebElement ele : sugg) {
            System.out.println(ele.getText());
            if (ele.getText().toLowerCase().contains("shoes for men")) {
                ele.click();
                break;
            }
        }
        driver.quit();
    }
}