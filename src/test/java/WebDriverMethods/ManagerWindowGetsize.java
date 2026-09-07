package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerWindowGetsize{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hotstar.com/in/home");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		int wid=size.getWidth();
		System.out.println("width of the browser = "+wid);
		driver.quit();
	}

}
