package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");

        WebElement countrycode = driver.findElement(By.id("country_code"));
        WebElement country = driver.findElement(By.id("select3"));
        WebElement state = driver.findElement(By.id("select5"));
        WebElement city = driver.findElement(By.xpath("//label[@for='cities']/following-sibling::select"));

        Select s1 = new Select(countrycode);
        s1.selectByIndex(1);

        Thread.sleep(2000);

        Select s2 = new Select(country);
        s2.selectByValue("India");

        Thread.sleep(2000);

        Select s3 = new Select(state);
        s3.selectByVisibleText("Karnataka");

        Thread.sleep(2000);
        
        Select s4 = new Select(city);
        s4.selectByVisibleText("Raichur");

        Thread.sleep(2000);

        driver.quit();
    }
}