package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdomproperty {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");

        Thread.sleep(3000);

        WebElement tf = driver.findElement(By.id("small-searchterms"));


        System.out.println(tf.getDomAttribute("value"));

        System.out.println(tf.getDomProperty("value"));
        
        System.out.println(tf.getAttribute("value"));

        tf.sendKeys("computers");


        System.out.println(tf.getDomAttribute("value"));

        System.out.println(tf.getDomProperty("value"));
        
        System.out.println(tf.getAttribute("value"));
        
        //role
        System.out.println(tf.getAriaRole());
        
        //accessiblename
        System.out.println(tf.getAccessibleName());
        System.out.println(driver.findElement(By.cssSelector("[value='Search']")).getAccessibleName());
        System.out.println(driver.findElement(By.cssSelector("[value='Search']")).getAriaRole());
        driver.quit();
    }
}