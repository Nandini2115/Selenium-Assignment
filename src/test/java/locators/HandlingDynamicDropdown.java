package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
        Thread.sleep(2000);
        List<WebElement> sugg=driver.findElements(By.cssSelector("[role='gridcell']"));
        for(WebElement ele:sugg) {
        		System.out.println(ele.getText());
        		if(ele.getText().contains("bags for women")) {
        			ele.click();
        			break;
        		}
        }
        driver.quit();
	}

}
