package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementsScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

        Thread.sleep(3000);
        
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//
//        TakesScreenshot tks = (TakesScreenshot) driver;
//        
        WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
        
        File src=ele.getScreenshotAs(OutputType.FILE);
        
        File dest=new File("./Ss/element.png");
        
        FileHandler.copy(src, dest);

        Thread.sleep(3000);
        driver.quit();
        
	}

}
