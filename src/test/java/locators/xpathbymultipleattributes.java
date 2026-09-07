package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbymultipleattributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='radio' and @name='Gender' and @value='M']")).click();
        Thread.sleep(2000);
        driver.quit();
	}

}
