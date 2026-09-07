package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home");
		Thread.sleep(20000);
		
		String parent=driver.getWindowHandle();
		
		Set<String>allids=driver.getWindowHandles();
		for(String id:allids) {
			if(!id.equals(parent)) {
			driver.switchTo().window(id);
			String title=driver.getTitle();
			System.out.println(title);
			}
		}
		driver.quit();
	}

}
