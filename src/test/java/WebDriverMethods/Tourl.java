package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class Tourl {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.hotstar.com/in/home"));
		Thread.sleep(2000);
	}

}
