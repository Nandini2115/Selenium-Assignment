package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerWindowsetposition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/home");
		driver.manage().window().setPosition(new Point(-100,40));
		Thread.sleep(2000);
	}

}
