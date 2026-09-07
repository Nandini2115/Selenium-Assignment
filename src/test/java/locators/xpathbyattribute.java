package locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lenskart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='as-input]")).sendKeys("spects",Keys.ENTER);
	}

}
