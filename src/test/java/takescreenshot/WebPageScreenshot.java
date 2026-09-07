package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

        Thread.sleep(3000);
        
        JavascriptExecutor js=(JavascriptExecutor) driver;

        TakesScreenshot tks = (TakesScreenshot) driver;

        File src = tks.getScreenshotAs(OutputType.FILE);

        // Create the Ss folder if it does not exist
        File des = new File("./Screenshot/amazon.png");
        FileHandler.copy(src, des);

        Thread.sleep(3000);
        driver.quit();
    }
}