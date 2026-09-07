package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        List<WebElement> radioButtons =
                driver.findElements(By.xpath("(//input[@type='radio'])[position() mod 2=1]"));
        for(WebElement ele:radioButtons) {
        	ele.click();
        	Thread.sleep(2000);
        }
//        radioButtons.get(1).click();
//        Thread.sleep(2000);
//        radioButtons.get(3).click();
//        Thread.sleep(2000);
        driver.quit();
	}
}
