package Day12_Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase2 extends OrangeHRM_BaseClass{
	// Read vacancy details from Excel
	@DataProvider
	public Object[][] JobDetails() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/java/Day12_Assignment/Vacancy_data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Object[][] ob = new Object[sh.getLastRowNum()][3];
		for(int i=0;i<sh.getLastRowNum();i++) {
			for(int j=0;j<3;j++) {
				ob[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return ob;
	}

	@Test(dataProvider="JobDetails")
	
	public void TestCase1(String vName,String vDes,String hrm) throws FileNotFoundException, AWTException, InterruptedException {
		System.out.println("Test Case - 1 Executing");
	
		HomePage r = new HomePage(driver);
		r.getrecruiterLink();
		
		RecruiterPage rp = new RecruiterPage(driver);
		rp.getvacancyLink();
		
		rp.getAddLink();
		
		VacancyPage vp = new VacancyPage(driver);
		vp.getVacancyName().sendKeys(vName);
		Thread.sleep(1500);
		// Select Job Title
		vp.getJobTi();
		vp.getJobTittle();
		// Enter description
		vp.getDes(vDes);
		// Enter Hiring Manager
		vp.gethRm(hrm);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		// Enter number of positions
		vp.getnoofp();
		// Save the vacancy
		vp.getsavebtn();
		System.out.println("Test Case - 1 Executed");
	}
	
	
	// Test Case 2
	@Test
	public void TestCase_2() throws InterruptedException, IOException {
		System.out.println("Test Case - 2 Executing");
	    // Open My Info
	    HomePage r = new HomePage(driver);
	    r.getMyInfoLink();
	    // Edit employee details
	    MyInfo m = new MyInfo(driver);
	    m.getFname("Harry");
	    m.getLname("Nanda");
	    m.getempId("Hari");
	    // Save the changes
	    m.getSaveBtn();
	    // Logout
	    LogoutPage lg = new LogoutPage(driver);
	    lg.getdropd();
	    lg.getlogout();
	    // Login again
	    LoginPage li = new LoginPage(driver);
	    li.getUn();
	    li.getPwd();
	    li.getLgbutton();
	    
	    
	    HomePage r2 = new HomePage(driver);
	    r2.getMyInfoLink();
	    // Create a new POM for the new page
	    MyInfo m2 = new MyInfo(driver);
	    
	    // Get the updated details
	    String updatedFname = m2.getFname();
	    String updatedLname = m2.getLname();
	    
	    // Verify the updated details
	    Assert.assertEquals(updatedFname, "Harry");
	    Assert.assertEquals(updatedLname, "Nanda");
	    System.out.println("Test Case - 2 Executed");
	}
}
