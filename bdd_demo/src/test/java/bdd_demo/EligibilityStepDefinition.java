package bdd_demo;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EligibilityStepDefinition {

	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;

	@Given("^I am on Home Page as Admin$")
	public void i_am_on_Home_Page_as_Admin() throws Exception {

		setup();
		LoginPage.Login(driver, "azarate", "Vantage2018");
		Thread.sleep(30000);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Launch Vantage Home Page as Admin",
				"Expected: User should be able to navigate to Home Page | Actual: Vantage Home Page launched successfully"
						+ CSpage);
		// if else and same step to give failed report

	}

	@When("^I click on People from the Menu bar$")
	public void i_click_on_People_from_the_Menu_bar() throws Exception {

		System.out.println("Hello");
		// Thread.sleep(25000);;
		HomePage.click_PeopleMenu(driver);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on People from the Menu Bar",
				"Expected: People Menu should be displayed | Actual: People Menu is displayed successfully" + CSpage);

	}

	@When("^I click on Benefits from the list$")
	public void i_click_on_Benefits_from_the_list() throws Exception {
		HomePage.click_Benefits(driver);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Benefits from the list",
				"Expected: Benefits Sub Menu should be displayed | Actual: Benefits Sub Menu is displayed successfully"
						+ CSpage);
	}

	@When("^I click on Life Events$")
	public void i_click_on_Life_Events() throws Exception {

		HomePage.click_LifeEventsMenuItem(driver);
		Thread.sleep(5000);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Life Events from the list",
				"Expected: Life Events should be clicked and Employee ID search page should be displayed | Actual: Employee ID search Page is displayed successfully"
						+ CSpage);
	}

	
	@When("^I enter \"(.*)\" in Employee ID field$") 
	 public void i_enter_in_Employee_ID_field(String employeeid) throws Exception {
	 //Thread.sleep(5000); 
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("portalIFrame_iframe"); // Thread.sleep(3000);
	 driver.findElement(By.name("newSearch:tableGridForm:empId")).click();
	 driver.findElement(By.name("newSearch:tableGridForm:empId")).sendKeys(employeeid); 
	 //HomePage.enter_EmployeeID(driver, employeeid); 
	 String CSpage =test.addScreenCapture(getscreenshot()); test.log(LogStatus.PASS,"Enter Employee ID in the TextBox","Expected: Employee ID should be entered | Actual: Employee ID entered successfully"+CSpage);
	 
	 }

	@When("^I click on Search button$")
	public void i_click_on_Search_button() throws Exception {

		HomePage.click_SearchEmployee(driver);
		Thread.sleep(2000);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Search Button",
				"Expected: Employee details should be displayed in the Results Grid | Actual: Employee Details displayed successfully"
						+ CSpage);
	}

	@When("^I click on employee's last name hyperlink$")
	public void i_click_on_employee_s_last_name_hyperlink() throws Exception {

		HomePage.click_EmployeeLastName(driver);
		Thread.sleep(2000);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Employee Last Name Hyperlink",
				"Expected: A popup should be displayed to enter date and Enrolling details | Actual: Popup displayed successfully"
						+ CSpage);
	}

	@When("^I select Enroll on behalf of the employee$")
	public void i_select_Enroll_on_behalf_of_the_employee() throws Exception {

		System.out.println("test");
	}

	@When("^I enter Emulation Date as current date on the Date field$")
	public void i_enter_Emulation_Date_as_current_date_on_the_Date_field() throws Exception {

		HomePage.click_Ok(driver);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Ok on the Popup",
				"Expected: New Page should be displayed with Report a Life Event hyperlink | Actual: New Page displayed successfully with Report a Life Event Hyperlink"
						+ CSpage);

	}

	@When("^I click on Report a Life Event$")
	public void i_click_on_Report_a_Life_Event() throws Exception {

		HomePage.click_ReportLifeEventLink(driver);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Report a Life Event Hyperlink",
				"Expected: Report a Life Event Pop-up should be displayed | Actual: Report a Life Event Pop-up displayed successfully"
						+ CSpage);

	}

	@When("^I select Admin Correction from the drop-down$")
	public void i_select_Admin_Correction_from_the_drop_down() throws Exception {

		HomePage.click_Dropdown(driver);
		/*
		 * Select dropdownoption = new
		 * Select(driver.findElement(By.id("changeBenefitsSelect_popup1")));
		 * dropdownoption.selectByIndex(1);
		 */
		// HomePage.click_Dropdown(driver);
	}

	@When("^I select current Date in the date field$")
	public void i_select_current_Date_in_the_date_field() throws Exception {

		HomePage.selectDate(driver);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Select Admin Correction from the dropdown and Current Date in the Pop-Up",
				"Expected: Admin Correction and Current Date in the Pop-Up should be selected | Actual: Admin Correction and Current Date in the Pop-Up selected successfully"
						+ CSpage);

	}

	@When("^I click on Submit$")
	public void i_click_on_Submit() throws Exception {
 
		HomePage.clickSubmitReportLifeEvent(driver);
		Thread.sleep(5000);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Submit in the Pop-up",
				"Expected: New Page with Employee Confirmation Details should be displayed | Actual: New Page with Employee Confirmation Details displayed successfully"
		
						+ CSpage);
		

	}

	@When("^I click on Submit Again$")
	public void i_click_on_SubmitAgain() throws Exception {
   
		System.out.println("test");
		HomePage.clickSubmitAgain(driver);
		Thread.sleep(5000);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Submit",
				"Expected: New Page with Admin Correction Link should be displayed | Actual: New Page with Admin Correction link displayed successfully"
						+ CSpage);

	}

	@When("^I click on Admin Correction link on Enrollments page$")
	public void i_click_on_Admin_Correction_link_on_Enrollments_page() throws Exception {

		//HomePage.clickSubmitAgain(driver);
		HomePage.clickAdminCorrection(driver);
		Thread.sleep(1000);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Click on Admin Correction Link ",
				"Expected: Enrollments Page with Eligibility Summary link on the right should be displayed | Actual: Enrollments Page with Eligibility Summary link on the right should be displayed successfully"
						+ CSpage);

	}

	@When("^I click on Eligibility Summary link in My Links dropdown$")
	public void i_click_on_Eligibility_Summary_link_in_My_Links_dropdown() throws Exception {

		Thread.sleep(10000);
		HomePage.clickEligibilitySummary(driver);
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Verify if the Eligibility Summary is displayed ",
				"Expected: Eligibility Summary of the Employee should be displayed | Actual: Eligibility Summary of the Employee displays successfully"
						+ CSpage);
	}

	@Then("^I should be able to see Eligibility Summary of the employee on a new web page$")
	public void i_should_be_able_to_see_Eligibility_Summary_of_the_employee_on_a_new_web_page() throws Exception {

		/*
		 * HomePage.clickEligibilitySummary(driver); Thread.sleep(3000); String CSpage =
		 * test.addScreenCapture(getscreenshot()); test.log(LogStatus.PASS,
		 * "Verify if the Eligibility Summary Opens in a new web page ",
		 * "Expected: Eligibility Summary of the Employee should be opened in a new web page | Actual: Eligibility Summary of the Employee Opens in a new web page successfully"
		 * +CSpage);
		 */
		// String actualValue = driver.findElement(By.xpath("")).getText();
		// HomePage.compareStrings(actualValue, "Mike Rute");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		String CSpage = test.addScreenCapture(getscreenshot());
		test.log(LogStatus.PASS, "Verify if the Eligibility Summary Opens in a new web page ",
				"Expected: Eligibility Summary of the Employee should be opened in a new web page | Actual: Eligibility Summary of the Employee Opens in a new web page successfully"
						+ CSpage);
		driver.switchTo().window(winHandleBefore);
		teardown();
	}

	public void setup() throws Exception {
		
		extent = new ExtentReports("Report.html", false, DisplayOrder.NEWEST_FIRST);
		test = extent.startTest("Report", "EligibilityStepFile report");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\PMateti\\OneDrive - Sempra Energy\\User Folders\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://testadpvantage.adp.com/public/index.htm");
		// driver.quit();

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\eclipse\\eclipse-workspace\\Project1\\drivers\\chromedriver.exe");
		// driver = new ChromeDriver();
		// driver.get("http://google.com");
	}

	public void teardown() throws Exception {
		Thread.sleep(2000);
		// driver.quit();
		extent.endTest(test);
		extent.flush();
		extent.close();

	}

	public String getscreenshot() throws Exception {
		UUID uuid = UUID.randomUUID();
		String strFile = "src/test/results/screenshot-" + uuid + ".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(strFile));
		return strFile;
	}
	//print the path
	

}
