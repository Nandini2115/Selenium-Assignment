package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");

        Thread.sleep(3000);
        
        WebElement tf = driver.findElement(By.id("small-searchterms"));
        
        //getSize
        System.out.println(tf.getSize());
        System.out.println(tf.getSize().getHeight());
        System.out.println(tf.getSize().getWidth());
        
        //GETLOCATION
        System.out.println(tf.getLocation());
        System.out.println(tf.getLocation().getX());
        System.out.println(tf.getLocation().getY());
       
        driver.quit();

	}

}
