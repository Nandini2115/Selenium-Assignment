package Day12_Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	String url;
	String username;
	String password;
	public LoginPage(WebDriver driver) throws IOException {
		this.driver= driver;
		PageFactory.initElements(driver, this);
        FileInputStream fis =new FileInputStream("./src/test/java/Day12_Assignment/CommonData.properties");
        Properties p1 = new Properties();
        p1.load(fis);
        this.url = p1.getProperty("url");
        this.username = p1.getProperty("username");
        this.password = p1.getProperty("password");
	}
	// Place username field
	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement un;
	
	// Place password field
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement pwd;
	
	// Place login button
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement lgbutton;
	
	// Click login button
	public void getLgbutton() {
		lgbutton.click();
	}
	
	// Enter username
	public void getUn() {
		un.sendKeys(username);
	}
	
	// Enter password
	public void getPwd() {
		pwd.sendKeys(password);
	}
	
	// Return to application URL
	public String getUrl() {
		return url;
	}
}