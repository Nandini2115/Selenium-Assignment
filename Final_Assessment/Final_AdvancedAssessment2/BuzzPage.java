package Final_AdvancedAssessment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuzzPage {
    WebDriver driver;
    WebDriverWait wait;
    public BuzzPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//textarea[contains(@placeholder,\"What's on your mind?\")]")
    private WebElement postTextBox;


    @FindBy(xpath = "//button[contains(@class,'oxd-button') and normalize-space()='Post']")
    private WebElement postButton;

    public void enterPost(String message) {
        wait.until(ExpectedConditions.visibilityOf(postTextBox));
        postTextBox.sendKeys(message);
    }

    public void clickPost() {

        wait.until(ExpectedConditions.elementToBeClickable(postButton)).click();
    }


    public boolean verifyPost(String message) {

        try {

            By postLocator = By.xpath("//div[contains(@class,'orangehrm-buzz-post')]"+ "//p[contains(normalize-space(),\""+ message+ "\")]");
            WebElement post = wait.until(ExpectedConditions.visibilityOfElementLocated(postLocator));
            return post.isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }
}