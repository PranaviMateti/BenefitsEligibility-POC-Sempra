
package bdd_demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public static By ProcessMenu = By.id("Process_navItem_label");
	public static By AdditionalServicesSubMenu = By.xpath("//span[text()='Additional Services']");
	public static By RecruitingMenuItem = By.xpath("//span[text()='Recruiting']");
	public static By PeopleMenu = By.id("People_navItem_label");
	public static By BenefitsItem = By.xpath(".//*[@id='revit_layout_TabContainer_2_tablist_dijit_layout_ContentPane_9']/span[2]/span");
	public static By LifeEventsMenuItem = By.xpath(".//*[@id='People_ttd_pracChangeBenefits']/span[2]");
	public static By EmpIdTextBox = By.name("newSearch:tableGridForm:empId");
	public static By SearchButton = By.xpath(".//*[@id='ajaxId']");
	public static By EmpLastNameLink = By.id("tableGrid_row_0_cell_1_hyperlink");
	public static By OkButtonPopup = By.id("employeeSearchDialogOkButton_label");
	public static By ReportLifeEventLink = By.id("changeBenefitsLink_label");
	public static By Dropdown = By.xpath(".//*[@id='widget_changeBenefitsSelect']/div[1]/input");
	public static By DropdownSelect = By.id("changeBenefitsSelect_popup1");
	public static By DateTextBox = By.id("eventDate");
	public static By SubmitReportLifeEvent = By.xpath(".//*[@id='doneButton_label']");
	public static By SubmitAgain = By.id("submitButton2_label");
	//public static By Submit = By.xpath("//*[@id='submitButton2']");
	public static By AdminCorrectionlink = By.id("revit_form_Button_4_label");
	public static By EligibilitySummarylink = By.id("addEligibilitySummaryLink");

	public static void compareStrings(String actualValue, String expectedValue ) {

		if(actualValue.equals(expectedValue)) {
			//get Screenshot	

		}else {
			//fail test case


		}
	}
	public static void getScreenshot() {


	}
	public static void isElementExist(WebDriver driver, By Element) {

		WebDriverWait wait = new WebDriverWait(driver, 120);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ProcessMenu));
			//get Screenshot
		}catch(Exception e)
		{
			//Screenshot code
		}
	}
	public static void click_ProcessMenu(WebDriver driver) throws Exception {

		isElementExist(driver,ProcessMenu);
		driver.findElement(ProcessMenu).click();

	}


	public static void click_AdditionalServicesSubMenu(WebDriver driver) throws Exception {
		Thread.sleep(1000);
		driver.findElement(AdditionalServicesSubMenu).click();

	}

	public static void click_RecruitingMenuItem(WebDriver driver) throws Exception {
		Thread.sleep(1000);
		driver.findElement(RecruitingMenuItem).click();

	}

	public static void click_PeopleMenu(WebDriver driver) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PeopleMenu));
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//Thread.sleep(6000);
		driver.findElement(PeopleMenu).click();
		System.out.println("People is clicked");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='revit_layout_TabContainer_2_tablist_dijit_layout_ContentPane_5']/span[2]/span")));
		

	}

	public static void click_Benefits(WebDriver driver) throws Exception {

		Thread.sleep(5000);
		driver.findElement(BenefitsItem).click();

	}

	public static void click_LifeEventsMenuItem(WebDriver driver) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LifeEventsMenuItem));
		// Thread.sleep(3000);
		driver.findElement(LifeEventsMenuItem).click();

	}

	public static void enter_EmployeeID(WebDriver driver, int empid) throws Exception {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("portalIFrame_iframe");
		// Thread.sleep(3000);
		driver.findElement(EmpIdTextBox).click();
		driver.findElement(EmpIdTextBox).sendKeys("74856");


	}

	public static void click_SearchEmployee(WebDriver driver) throws Exception {

		Thread.sleep(3000);
		driver.findElement(SearchButton).click();

	}

	public static void click_EmployeeLastName(WebDriver driver) throws Exception {

		Thread.sleep(3000);
		driver.findElement(EmpLastNameLink).click();

	}

	public static void click_Ok(WebDriver driver) throws Exception {

		Thread.sleep(2000);
		driver.findElement(OkButtonPopup).click();
	}

	public static void click_ReportLifeEventLink(WebDriver driver) throws Exception {

		//Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ReportLifeEventLink));
		driver.findElement(ReportLifeEventLink).click();
	}

	public static void click_Dropdown(WebDriver driver) throws Exception {

		Thread.sleep(2000);
		driver.findElement(Dropdown).click();
		driver.findElement(DropdownSelect).click();

	}

	public static void selectDate(WebDriver driver) throws Exception {

		Thread.sleep(2000);
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String data = df.format(new Date());
		System.out.println(data);
		driver.findElement(DateTextBox).sendKeys(data);
	}

	public static void clickSubmitReportLifeEvent(WebDriver driver) throws Exception {

		Thread.sleep(2000);
		driver.findElement(SubmitReportLifeEvent).click();
	}

	public static void clickSubmitAgain(WebDriver driver) throws Exception {

		Thread.sleep(2000);
		driver.findElement(SubmitAgain).click();
	}

	public static void clickAdminCorrection(WebDriver driver) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdminCorrectionlink));
		driver.findElement(AdminCorrectionlink).click();

	}

	public static void clickEligibilitySummary(WebDriver driver) throws Exception {

		//Thread.sleep(60000);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EligibilitySummarylink));
		driver.findElement(EligibilitySummarylink).click();

	}

}
