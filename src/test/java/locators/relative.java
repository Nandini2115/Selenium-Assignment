package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        WebElement phone = driver.findElement(By.xpath("//input[@name='username']"));
        phone.sendKeys("9113456788");
        WebElement password = driver.findElement(By.xpath("//input[@name='username']/following::input[@name='password'][1]"));
        System.out.println("Password field found successfully");
        password.sendKeys("Povrdxd54(0");
        Thread.sleep(9000);
        driver.quit();
    }
}