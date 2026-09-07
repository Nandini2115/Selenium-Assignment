package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerWindowSetsize{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hotstar.com/in/home");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension dim=new Dimension(300,400);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
	}

}
