package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActionMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://facebook.com/");

        Thread.sleep(3000);
        
        WebElement untf=driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
        untf.sendKeys("pavvi");
        
        WebElement pwtf=driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
        pwtf.sendKeys("pavvi123");
        
        Thread.sleep(3000);
        
//        untf.clear();
//        driver.close();
        //click
        WebElement login=driver.findElement(By.xpath("//span[text()='Log in']"));
        //gettext
        System.out.println(login.getText());
        //tagname
        System.out.println(login.getTagName());
        //css value
        System.out.println(login.getCssValue("color"));
        //GETDOATTRIBUTE
//        WebElement tf=driver.findElement(By.id("small-searchterms"));
//        System.out.println(tf.getDomAttribute("domattribute:"+"value"));
//        driver.quit();
        //getdomproperty
        
	}

}
