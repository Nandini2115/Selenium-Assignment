package Sauce_Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sauce_baseClass {

    public WebDriver d;

    // ==============================
    // Before Suite
    // ==============================
    @BeforeSuite
    public void bs() {

        System.out.println("Open Database connectivity");
    }

    // ==============================
    // After Suite
    // ==============================
    @AfterSuite
    public void as() {

        System.out.println("Close Database connectivity");
    }

    // ==============================
    // Before Test
    // ==============================
    @BeforeTest
    public void bt() {

        System.out.println("PreCondition");
    }

    // ==============================
    // After Test
    // ==============================
    @AfterTest
    public void at() {

        System.out.println("PostCondition");
    }

    // ==============================
    // Before Class
    // ==============================
    @BeforeClass
    public void bc() throws IOException {

        System.out.println("Open the browser");

        // Read properties file
        FileInputStream file = new FileInputStream(
                "./src/test/java/Sauce_Demo/CommonData.properties");

        Properties p = new Properties();

        p.load(file);

        String browser = p.getProperty("browser");

        String url = p.getProperty("url");

        // ==============================
        // Chrome
        // ==============================
        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions settings = new ChromeOptions();

            Map<String, Object> prefs = new HashMap<>();

            // Disable Chrome password leak detection popup
            prefs.put("profile.password_manager_leak_detection", false);

            // Disable password manager
            prefs.put("credentials_enable_service", false);

            // Disable saving passwords
            prefs.put("profile.password_manager_enabled", false);

            settings.setExperimentalOption("prefs", prefs);

            d = new ChromeDriver(settings);
        }

        // ==============================
        // Edge
        // ==============================
        else if (browser.equalsIgnoreCase("edge")) {

            d = new EdgeDriver();
        }

        // ==============================
        // Firefox
        // ==============================
        else if (browser.equalsIgnoreCase("firefox")) {

            d = new FirefoxDriver();
        }

        // ==============================
        // Invalid Browser
        // ==============================
        else {

            System.out.println("Invalid browser name: " + browser);

            file.close();

            return;
        }

        // Maximize browser
        d.manage().window().maximize();

        // Implicit wait
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open URL
        d.get(url);

        file.close();
    }

    // ==============================
    // After Class
    // ==============================
    @AfterClass
    public void ac() {

        System.out.println("Close the browser");

        if (d != null) {

            d.quit();
        }
    }

    // ==============================
    // Before Method
    // ==============================
    @BeforeMethod
    public void bm() {

        System.out.println("Starting test method");
    }

    // ==============================
    // After Method
    // ==============================
    @AfterMethod
    public void am() {

        System.out.println("Test method completed");
    }
}