package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exampleondropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
//        System.out.println("Login successful");
        Thread.sleep(4000);
        WebElement filter = driver.findElement(By.className("product_sort_container"));
        Select s = new Select(filter);
        Thread.sleep(4000);
        s.selectByValue("lohi");
        Thread.sleep(4000);
//        System.out.println("Filter selected: Price (low to high)");
        Thread.sleep(4000);
        WebElement product = driver.findElement(
                By.cssSelector("button[id^='add-to-cart']")
        );
        Thread.sleep(4000);
        String productName = product.getAttribute("id");
        product.click();
        Thread.sleep(4000);
//        System.out.println("Product added to cart");
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
//        if (cartBadge.isDisplayed()) {
//            System.out.println("PASS: Product is added to the cart");
//        } else {
//            System.out.println("FAIL: Product is not added to the cart");
//        }
        Thread.sleep(4000);
        driver.quit();
    }
}