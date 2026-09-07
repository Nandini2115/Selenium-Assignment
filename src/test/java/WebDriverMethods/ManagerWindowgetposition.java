package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerWindowgetposition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/home");
		Point position=driver.manage().window().getPosition();
		System.out.print(position);
		Thread.sleep(2000);
	}

}
