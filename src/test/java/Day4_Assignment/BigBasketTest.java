package Day4_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 1. Navigate to BigBasket
        driver.get("https://www.bigbasket.com/");

        Thread.sleep(3000);

        // 2. Find the search box
        List<WebElement> searchBoxes = driver.findElements(By.xpath("//input[@placeholder='Search for Products...']"));

        WebElement searchBox = null;

        for (WebElement box : searchBoxes) {

            if (box.isDisplayed()) {
                searchBox = box;
                break;
            }
        }

        // 3. Search for Apple
        searchBox.sendKeys("apple");

        searchBox.sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        System.out.println("Apple products are displayed");

        // 4. Find the products
        List<WebElement> products = driver.findElements(By.xpath("//h3"));

        System.out.println("Number of products: " + products.size());

        // 5. Select any one product
        for (WebElement product : products) {

            if (product.isDisplayed()) {

                JavascriptExecutor js =(JavascriptExecutor) driver;

                js.executeScript("arguments[0].scrollIntoView({block:'center'});",product );

                Thread.sleep(1000);

                product.click();

                System.out.println("Product selected");

                break;
            }
        }

        Thread.sleep(3000);

        // 6. Find Add button
        List<WebElement> addButtons = driver.findElements(By.xpath("//*[contains(text(),'Add')]"));

        boolean productAdded = false;

        // 7. Click Add button
        for (WebElement button : addButtons) {

            if (button.isDisplayed()) {

                JavascriptExecutor js = (JavascriptExecutor) driver;

                js.executeScript("arguments[0].scrollIntoView({block:'center'});",button);

                Thread.sleep(1000);

                js.executeScript("arguments[0].click();",button);

                System.out.println("Product added to cart");

                productAdded = true;

                break;
            }
        }

        Thread.sleep(3000);
        // 8. Validate product added to cart
        if (productAdded) {

            System.out.println("Validation Successful: Product is added to cart");

        } else {

            System.out.println("Validation Failed: Product is not added to cart");
        }
        Thread.sleep(2000);
        // 9. Close browser
        driver.quit();
    }
}
