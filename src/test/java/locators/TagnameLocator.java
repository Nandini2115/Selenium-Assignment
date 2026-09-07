package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		for(WebElement ele:links) {
			String text=ele.getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
