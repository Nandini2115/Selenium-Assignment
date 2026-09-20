package Day12_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
		// Place Recruitments link
		@FindBy(xpath = "//span[text()='Recruitment']")
		private WebElement recruiterLink;
		// Click the Recruitment link
		public void getrecruiterLink() {
			recruiterLink.click();
		}
		
		// Place My Info link
		@FindBy(xpath = "//span[normalize-space()=\"My Info\"]")
		private WebElement MyInfoLink;
		
		// Click the Info link
		public void getMyInfoLink() {
			MyInfoLink.click();
		}
	

}