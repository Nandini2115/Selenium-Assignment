package Day12_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	// Place the user dropdown
	@FindBy(xpath = "//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
	private WebElement dropd;
	// Open the user dropdown
	public void getdropd() throws InterruptedException {
		dropd.click();
		Thread.sleep(1500);
	}
	
	// Place the Logout option
	@FindBy(xpath = "//a[text()=\"Logout\"]")
	private WebElement logout;
	
	// Click Logout
	public void getlogout() {
		logout.click();
	}

}