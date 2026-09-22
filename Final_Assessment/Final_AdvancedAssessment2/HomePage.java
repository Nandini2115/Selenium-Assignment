package Final_AdvancedAssessment2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[text()='Buzz']")
    private WebElement buzzLink;


    @FindBy(xpath = "//span[contains(@class,'oxd-userdropdown-tab')]")
    private WebElement profileMenu;


    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutButton;


    public void clickBuzz() {

        wait.until(ExpectedConditions.elementToBeClickable(buzzLink)).click();
    }

    public void logout() {

        wait.until(ExpectedConditions.elementToBeClickable(profileMenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
    }
}