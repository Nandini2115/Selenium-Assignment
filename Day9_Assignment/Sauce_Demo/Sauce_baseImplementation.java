package Sauce_Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import POMUtilities.Sauce_CartPage;
import POMUtilities.Sauce_CheckoutOverviewPage;
import POMUtilities.Sauce_CheckoutPage;
import POMUtilities.Sauce_HomePage;
import POMUtilities.Sauce_LoginPage;
import POMUtilities.Sauce_checkoutCompletePage;

public class Sauce_baseImplementation extends Sauce_baseClass {
    @Test(priority = 1)
    public void LoginTest() throws IOException, InterruptedException {
        FileInputStream file = new FileInputStream("./src/test/java/Sauce_Demo/CommonData.properties");
        Properties p = new Properties();
        p.load(file);
        String un = p.getProperty("username");
        String pw = p.getProperty("password");
        Sauce_LoginPage l = new Sauce_LoginPage(d);
        l.getUsername(un);
        l.getPassword(pw);
        Thread.sleep(2000);
        l.getLogin();
        System.out.println("Login completed successfully");
        file.close();
    }
    
    @Test(priority = 2)
    public void oderPalcementTest() throws InterruptedException, IOException {
        Sauce_HomePage h = new Sauce_HomePage(d);
        // Verify Products page
        if (h.getProduct().equals("Products")) {

            System.out.println("Product page is displayed");

        } else {

            System.out.println("Product page is not displayed");
        }
        Thread.sleep(2000);

        // Add product to cart
        h.getAddtocart();
        Thread.sleep(2000);

        // Verify quantity
        if (h.getquantity().equals("1")) {
            System.out.println("Only one product is added");
        } else {
            System.out.println("Many products are added");
        }
        // Open cart
        h.getCart();
        Sauce_CartPage ca = new Sauce_CartPage(d);
        // Verify product
        if (ca.getProductverify().equals("Sauce Labs Backpack")) {
            System.out.println("BackPack product is added");
        } else {
            System.out.println("Wrong product is added");
        }
        Thread.sleep(2000);

        // Click checkout
        ca.getCheckout();
        Thread.sleep(2000);

        // Checkout page
        Sauce_CheckoutPage co = new Sauce_CheckoutPage(d);

        // READ DATA FROM EXCEL

        FileInputStream excelFile = new FileInputStream("./src/test/java/Sauce_Demo/saucedemo_data.xlsx");
        Workbook workbook = WorkbookFactory.create(excelFile);
        Sheet sheet = workbook.getSheet("sheet1");
        Row row = sheet.getRow(1);

        // DataFormatter is important
        DataFormatter formatter = new DataFormatter();
        String fn = formatter.formatCellValue(row.getCell(0));
        String ln = formatter.formatCellValue(row.getCell(1));
        String c = formatter.formatCellValue(row.getCell(2));
        System.out.println("First Name: " + fn);
        System.out.println("Last Name: " + ln);
        System.out.println("Postal Code: " + c);

        // Enter checkout details
        co.getFName(fn);
        co.getLName(ln);
        co.getCode(c);
        Thread.sleep(2000);

        // Continue
        co.getContinuebtn();
        Thread.sleep(2000);

        // CHECKOUT OVERVIEW
        Sauce_CheckoutOverviewPage o = new Sauce_CheckoutOverviewPage(d);

        if (o.getOverview().equals("Checkout: Overview")) {

            System.out.println("Product overview is displayed");

        } else {

            System.out.println("Product overview is not displayed");
        }

        // Finish order
        o.getFinish();

        Thread.sleep(2000);
        
        // ORDER COMPLETE
        
        Sauce_checkoutCompletePage a = new Sauce_checkoutCompletePage(d);
        if (a.getMessage().equals("Thank you for your order!")) {
            System.out.println("Thank you for your order message is displayed");

        } else {
            System.out.println("Thank you for your order message is not displayed");
        }

        // Close Excel
        workbook.close();
        excelFile.close();
        System.out.println("Order placement completed successfully");
    }
}