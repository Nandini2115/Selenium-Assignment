package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActionfordemowebshop {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");

        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.id("small-searchterms"));

        searchBox.sendKeys("computer");

        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));

        searchButton.click();
        
        Thread.sleep(3000);
        
//        WebElement tf=driver.findElement(By.id("small-searchterms"));
//        System.out.println(tf.getDomAttribute("domattribute:"+"value"));

        Thread.sleep(3000);

        driver.quit();
    }
}