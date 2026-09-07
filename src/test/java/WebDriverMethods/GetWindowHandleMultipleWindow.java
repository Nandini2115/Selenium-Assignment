package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home");
		Thread.sleep(2000);
		Set<String>allids=driver.getWindowHandles();
		System.out.println(allids);
		driver.quit();
	}

}
