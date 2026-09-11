package Day2_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_"));
        WebElement surname = driver.findElement(By.id("_R_1kl2p4jikacppb6amH1_"));
        Point firstNameLocation = firstName.getLocation();
        Point surnameLocation = surname.getLocation();
        
        System.out.println("First Name X : " + firstNameLocation.getX());
        System.out.println("First Name Y : " + firstNameLocation.getY());

        System.out.println("Surname X : " + surnameLocation.getX());
        System.out.println("Surname Y : " + surnameLocation.getY());

        if (firstNameLocation.getY() == surnameLocation.getY()) {
            System.out.println("PASS: First Name and Surname are aligned in the same line");
        } else {
            System.out.println("FAIL: First Name and Surname are NOT aligned in the same line");
        }

    }
}