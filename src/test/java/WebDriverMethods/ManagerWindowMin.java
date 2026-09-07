package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerWindowMin{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.hotstar.com/in/home");
		Thread.sleep(2000);
		driver.quit();
	}

}
