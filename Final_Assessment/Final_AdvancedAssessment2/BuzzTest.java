package Final_AdvancedAssessment2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuzzTest extends BaseClass {

    @Test
    public void verifyBuzzPost() {

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        BuzzPage buzz = new BuzzPage(driver);

        login.login("Admin", "admin123");
        home.clickBuzz();
        String message = "Enjoy the day";
        buzz.enterPost(message);


        buzz.clickPost();
        boolean result = buzz.verifyPost(message);

        Assert.assertTrue(result,"Post was not displayed in Recent Posts");

        System.out.println("PASS: Post successfully verified");

        // Logout
        home.logout();

        System.out.println("PASS: Successfully logged out");
    }
}