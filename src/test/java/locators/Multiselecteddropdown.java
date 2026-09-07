package locators;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselecteddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
        
        WebElement dd=driver.findElement(By.id("select-multiple-native"));
        Select s=new Select(dd);
        s.selectByIndex(0);
        s.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
        s.selectByVisibleText("Mens Cotton Jacket...");
        Thread.sleep(2000);
        List<WebElement> alloptions=s.getOptions();
        	for(WebElement ele:alloptions) {
        		System.out.println("alloptions"+ele.getText());
        }
        	List<WebElement> selectedoptions=s.getAllSelectedOptions();
        	for(WebElement ele:alloptions) {
        		System.out.println("alloptions"+ele.getText());
        }
//        	s.deselectByIndex(0);
//        	s.deselectByValue("Mens Casual Premium Slim Fit T-Shirts ");
//        	s.deselectByVisibleText("Mens Cotton Jacket...");
        	s.deselectAll();
        	
        	System.out.println(s.isMultiple());
        	driver.quit();
        	
        	
	}

}
