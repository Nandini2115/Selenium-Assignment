package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

    public static void main(String[] args) throws InterruptedException {

        // 01. LAUNCH THE BROWSER
        WebDriver driver = new ChromeDriver();

        // 02. NAVIGATE TO FLIPKART
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        Thread.sleep(3000);

        // 03. LOGIN
        WebElement login = driver.findElement(
                By.xpath("//span[text()='Login']")
        );

        login.click();

        Thread.sleep(2000);

        // Enter mobile number
        WebElement mobile = driver.findElement(
                By.xpath("//input[@type='text']")
        );

        mobile.sendKeys("YOUR_MOBILE_NUMBER");

        // Click Continue
        WebElement continueButton = driver.findElement(
                By.xpath("//button[contains(text(),'Request OTP')]")
        );

        continueButton.click();

        /*
         * OTP cannot be automated using a fixed value because
         * it is sent to your mobile.
         *
         * Enter OTP manually here.
         */

        Thread.sleep(10000);

        // 04. CAPTURE COUNT OF ALL LINKS
        List<WebElement> links = driver.findElements(
                By.tagName("a")
        );

        System.out.println("Total number of links: " + links.size());

        // 05. CAPTURE TEXT OF ALL LINKS
        for (WebElement link : links) {

            String text = link.getText();

            if (!text.isEmpty()) {
                System.out.println(text);
            }

            // 06. CLICK PARTICULAR LINK IF TEXT CONTAINS "Gift Cards"
            if (text.contains("Gift Cards")) {

                System.out.println("Gift Cards link found");

                link.click();

                break;
            }
        }

        Thread.sleep(3000);

        driver.quit();
    }
}