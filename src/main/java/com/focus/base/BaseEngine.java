package com.focus.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.SyslogQuietWriter;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;
//import org.testng.remote.strprotocol.AbstractRemoteTestRunnerClient;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.stringtemplate.v4.compiler.STParser.ifstat_return;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.focus.Pages.BillWisePage;
import com.focus.Pages.LoginPage;
import com.focus.elements.WebElements;
//import com.focus.supporters.ExcelReader;
import com.focus.utilities.DriverUtility;
import com.focus.utilities.POJOUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseEngine extends WebElements {

	public static WebDriver driver;
	public static String baseDir;
	private static String tcName;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	private static Logger logger;
	private static WebDriverWait wait;

	private String filePath;
	private FileInputStream fip;
	private FileOutputStream fop;
	private Workbook workbook;
	private Sheet sheet;
	private Cell cell;
	private CellStyle style;
	private Row row;
	protected String res = null;

	private static Alert alert;

	@Parameters("browser")
	@BeforeSuite
	public static void openBrowser(@Optional("chrome") String browser) {

		baseDir = System.getProperty("user.dir");
		PropertyConfigurator.configure(baseDir + "\\log4j.properties");

		if (browser.equalsIgnoreCase("chrome")) {
			// System.setProperty(DriverUtility.chromeKey, baseDir +
		// DriverUtility.chromeValue);

			WebDriverManager.chromedriver().setup();

			String downloadFilepath = getBaseDir() + "\\autoIt\\ExportFiles";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			
			chromePrefs.put("download.prompt_for_download", true);
			
			 // chromePrefs.put("profile.default_content_settings.popups", 0);
			 // chromePrefs.put("download.default_directory", downloadFilepath);
			//  chromePrefs.put("safebrowsing.enabled", false);
			 // chromePrefs.put("credentials_enable_service", false); // Disable credentials service
			//  chromePrefs.put("profile.password_manager_enabled", false); // Disable password manager
			ChromeOptions options = new ChromeOptions();

			//options.setExperimentalOption("useAutomationExtension", false);
			//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

			// options.addArguments("--Incognito");

			// options.addArguments("headless");

			options.setExperimentalOption("prefs", chromePrefs);
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);

			driver = new ChromeDriver(cap);
			initActivities();
		}

		/*
		 * if(browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty(DriverUtility.chromeKey,
		 * baseDir+DriverUtility.chromeValue); driver=new ChromeDriver();
		 * initActivities(); }
		 */

		if (browser.equalsIgnoreCase("ie")) {
			System.setProperty(DriverUtility.ieKey, baseDir + DriverUtility.ieValue);
			driver = new InternetExplorerDriver();
			initActivities();
		}

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(DriverUtility.firefoxKey, baseDir + DriverUtility.firefoxValue);
			driver = new FirefoxDriver();
			initActivities();
		}
	}

	public static void initActivities() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@BeforeMethod
	public void beforeMethodExecution(Method method) {
		tcName = method.getName();

		logger = Logger.getLogger(BaseEngine.class);

		getLogger().info("Currently Executing Test Case Name is : " + tcName);
		// extentTest = extentReports.startTest(tcName);

		extentTest = extentReports.createTest(tcName);

		// System.out.println("This Is Before Method Execution And Trying To Executing
		// The Method: " + tcName);

		System.err.println(
				"*************BEFORE Method Execution And Trying To Executing The Method**************************"
						+ tcName);

		// Excel Update is Written as below
	}

	@FindBy(xpath = "//*[@id='idGlobalError']/div[2]/div[1]/button")
	public static WebElement errorMessageClose2Btn;

	@FindBy(xpath = "//*[@id='idGlobalError']/div[2]/div[2]")
	public static WebElement errorMessage2;

	public static boolean checkVoucherSavingMessage2(String docno)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		try {

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			String actErrorMessage = errorMessage.getText();
			String expErrorMessage = "Voucher saved successfully";
			String expErrorMessage1 = ": " + docno;

			System.out.println("SavingMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage + " "
					+ expErrorMessage1);

			if (actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1)) {

				click(errorMessageCloseBtn);

				return true;

			} else {
				return false;
			}
		} catch (Exception e) {
			System.err.println("UNABLE TO COMPARE");
			return false;
		}
	}

	@AfterMethod
	public void afterMethodExecution(ITestResult result) throws Exception {
		// System.out.println(res);
		// System.out.println(result.getStatus());
		// System.out.println("This is After method");

		/*
		 * end = System.currentTimeMillis(); NumberFormat formatter = new
		 * DecimalFormat("#0.00000"); System.err.print("**---***---**Execution time is "
		 * + formatter.format((end - start) / 1000d) + " seconds");
		 */

		if (result.getStatus() == ITestResult.SUCCESS) {
			res = "Pass";
			getLogger().info("Test Case is Passed : " + tcName);
			// excelReader.setCellData(xlfile, "Sheet3", 0, 0, res);
			// extentTest.log(LogStatus.PASS, "Test Case is Passed : " + tcName);

			extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));

			System.err.println("Pass : Test Case is Passed from after Method : " + tcName);
			System.err.println(" *****************************************************TEST case Passed: " + tcName);
		}

		else if (result.getStatus() == ITestResult.FAILURE) {
			res = "Fail";
			getLogger().info("Test Case is Failed : " + tcName + "So Taking the Screenshot");
			extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
		    // PRINT ACTUAL EXCEPTION
		    Throwable error = result.getThrowable();

		    if (error != null) {

		        System.err.println("ACTUAL ERROR:");
		        error.printStackTrace();

		        extentTest.fail(error);
		    }

			takeSnapShot();
			System.err.println("Fail : Test Case Is Failed After Method Execution : " + tcName);
			System.err.println(" *****************************************************TEST case Failed: " + tcName);

		} else if (result.getStatus() == ITestResult.SKIP) {
			res = "Skip";
			getLogger().info("Test Case is Skipped : " + tcName + "So Taking the Screenshot");
			extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKKIPPED ", ExtentColor.ORANGE));
			takeSnapShot();
			System.err.println("Skip : Test Case Is Skipped After Method Execution : " + tcName);
		}

	}

	@AfterSuite
	public void closeBrowser() throws Exception {
		if (driver == null) {
			getLogger().info("Driver is pointing to Null : @AfterSuite");
			// Xl.generateReport(getCurrentDateFormatWithTime()+"FocusAutomationExcelReport.xlsx");
		} else {
			driver.close();
		}

	}

	@BeforeTest
	public void intialiseReports() {
		// extentReports = new ExtentReports(baseDir
		// +"\\reports\\"+getCurrentDateFormatWithTime()+"---FocusAutomationReport.html");
		// extentReports.assignProject("FocusAI");

		extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
				baseDir + "\\reports\\" + getCurrentDateFormatWithTime() + "---FocusAutomationReport.html");
		extentReports.attachReporter(sparkReporter);

	}

	public static String getCurrentDateFormatWithTime() {
		String timeStamp = new SimpleDateFormat("MMM" + " " + "dd" + " " + "yyyy" + " " + "HH" + " " + "mm")
				.format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		return timeStamp;
	}

	@AfterTest
	public static void generateReports() throws Exception {
		extentReports.flush();
		// Xl.generateReport(getCurrentDateFormatWithTime()+"FocusAutomationExcelReport.xlsx");
		// extentReports.endTest(extentTest);
	}

	public static String getTCName() {
		return tcName;
	}

	public static String getBaseDir() {
		return baseDir;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static ExtentTest getExtentTest() {
		return extentTest;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void enterUrl(String url) {
		getDriver().get(url);
	}

	public static boolean isElementNotDisplayed(WebElement we) {
		try {
			if (we.isDisplayed()) {
				return true;
			}

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public static Actions getAction() {
		Actions action = new Actions(driver);
		return action;

	}

	public static void waitToClick(WebElement element) throws InterruptedException {

		Thread.sleep(6999);

		waitOn(element);

		System.err.println("Element is Displayed*************");

		element.click();

	}

	public static void getWaitForAlert() {
		new WebDriverWait(getDriver(), 800).ignoring(NoAlertPresentException.class)
				.until(ExpectedConditions.alertIsPresent());
	}

	public static Alert getAlert() {
		alert = getDriver().switchTo().alert();
		return alert;
	}

	public static void getFrame(WebElement ele) {
		getDriver().switchTo().frame(ele);

	}

	public static boolean getIsAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException Ex) {
			return false;
		}
	}

	public void waitForLoad(WebDriver driver) {
		new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static Wait getWebDriverWait() {
		wait = new WebDriverWait(getDriver(), 90);
		return wait;

	}

	public static String getCurrentDateFormat123() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}

	public static Wait getFluentWebDriverWait() {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(90))
				.pollingEvery(Duration.ofMillis(15)).ignoring(WebDriverException.class)
				.ignoring(NoSuchElementException.class);

		return wait;

	}

	public static Wait fluentWaitWith250Sec() {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(120))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(WebDriverException.class)
				.ignoring(NoSuchElementException.class);

		return wait;

	}

	public static Wait getFluentWebDriverWait2() {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(650))
				.pollingEvery(Duration.ofMillis(5)).ignoring(WebDriverException.class)
				.ignoring(NoSuchElementException.class);

		return wait;

	}

	public static String getDate() {

		DateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");
		Calendar cal = Calendar.getInstance();
		// System.out.println(dateFormat.format(cal.getTime()));
		return dateFormat.format(cal.getTime());

	}

	public static String getCurrentDate() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}
	
	public static String getCurrentDate1() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}

	public static String currentDate() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

		String docdate = df.format(date);
		return docdate;
	}

	public static String getCurrentTimeF1() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
		String strDate = dateFormat.format(date);
		System.err.println(strDate);

		return strDate;
	}

	public static String getCurrentDateF2() {
		java.util.Date date = Calendar.getInstance().getTime();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}

	public static String getMonth() {
		DateFormat dateFormat = new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();

		return dateFormat.format(cal.getTime());
	}

	public static String getYear() {
		DateFormat dateFormat = new SimpleDateFormat("YYYY");
		Calendar cal = Calendar.getInstance();

		return dateFormat.format(cal.getTime());
	}

	public static String getCurrentDateF3() {
		java.util.Date date = Calendar.getInstance().getTime();

		DateFormat dateFormat = new SimpleDateFormat("MMM dd YYYY");
		String strDate = dateFormat.format(date);
		System.out.println(strDate);
		return strDate;

	}

	public static String getCurrentdateDayFormat() {
		java.util.Date date = Calendar.getInstance().getTime();

		DateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY");
		String strDate = dateFormat.format(date);
		System.out.println(strDate);
		return strDate;

	}

	public static String getSystemTime() {
		java.util.Date date = Calendar.getInstance().getTime();

		DateFormat dateFormat = new SimpleDateFormat("hh:mma");
		String strDate = dateFormat.format(date);
		System.out.println(strDate);
		return strDate;

	}

	public static String getCurrentDateFormat() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}

	public static String getTextByJs(WebElement element) { // for only getText (Individual text only)

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		String text = (String) js.executeScript("return arguments[0].innerHTML", element);
		return text;
	}

	public static void ClickUsingJs(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", element);

	}

	public static void click1(WebElement element) {

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(element));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
		waitForElement(element);

		element.click();
	}

	 public static void click(WebElement element) {

			new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

			element.click();
		}
		
	
	
	public static void restart() throws IOException, InterruptedException {
/*
		Thread.sleep(2000);

		String batCommand2 = "cmd /c start C:\\Users\\Rakesh\\Desktop\\IisRestart.lnk";
		Thread.sleep(2000);
		Runtime.getRuntime().exec(batCommand2);

		Thread.sleep(10000);

		System.err.println("InetManagerRestart");

		Thread.sleep(9999);
	*/
	}

	public static void prongHornStartAtAdminLevel() throws AWTException, InterruptedException, IOException {
		
		  
		 /* 
		  Thread.sleep(2000);
		  
		  String batCommand2 =
		  "cmd /c start C:\\Users\\Rakesh\\Desktop\\IISRESET.lnk";
		  Thread.sleep(2000); Runtime.getRuntime().exec(batCommand2);
		  
		  Thread.sleep(15000);
		  
		  System.err.println("InetManagerRestart");
		  
		  Thread.sleep(4503);
		  
		  String batCommand =
		  "cmd /c start C:\\Users\\Rakesh\\Desktop\\PronghornStart.lnk";
		  Thread.sleep(2000); Runtime.getRuntime().exec(batCommand);
		  
		  Thread.sleep(10000);
		  
		  System.err.println("Pronghorn Started");
		  
		  Thread.sleep(8965);
		  */
		 }

	public static void InetManagerRestart() throws IOException, InterruptedException {
		
		/*  
		  
		  Thread.sleep(2000);
		  
		  String batCommand2 =
		  "cmd /c start C:\\Users\\Rakesh\\Desktop\\IISRESET.lnk";
		  Thread.sleep(2000); Runtime.getRuntime().exec(batCommand2);
		  
		  Thread.sleep(10000);
		  
		  System.err.println("InetManagerRestart");
		  */
		 }

	public static void prongHornStopAtAdminLevel() throws AWTException, InterruptedException, IOException {
		
		  /*
		  
		  Thread.sleep(2000);
		  
		  String batCommand =
		  "cmd /c start C:\\Users\\Rakesh\\Desktop\\PronghornStop.lnk";
		  Thread.sleep(2000); Runtime.getRuntime().exec(batCommand);
		  
		  Thread.sleep(10000);
		  
		  System.err.println("Pronghorn stopped");
		  
		  */
		  
		 }
	
	public static void prongHornStart() throws AWTException, InterruptedException, IOException {
		
		  /*
		  
		  Thread.sleep(2000);
		  
		  String batCommand =
		  "cmd /c start C:\\Users\\Rakesh\\Desktop\\PronghornStart.lnk";
		  Thread.sleep(2000); Runtime.getRuntime().exec(batCommand);
		  
		  Thread.sleep(10000);
		  
		  System.err.println("Pronghorn stopped");
		  
		  */
		  
		 }
	

	public static void visible(WebElement element) {

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(element));
		waitForElement(element);

	}

	public static void enterText(WebElement element, String Value) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		element.sendKeys(Value);
	}

	public static String getText(WebElement element) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		return element.getText();
	}

	public static void clearValueFromTextBox(WebElement element) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		element.clear();
	}

	public static void tab(WebElement element) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		element.sendKeys(Keys.TAB);
	}

	public static void ScrollToElement(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void checkEraseAllTransaction()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkEraseAllTrans();

	}

	public static void checkEraseAllTrans() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(1999);

		click(homeMenu);

		click(dataMangementMenu);

		Thread.sleep(1999);
		click(eraseAll);

		Thread.sleep(4000);
		//waitOn(eraseTranscationsRadio);
		new WebDriverWait(getDriver(), 150).until(ExpectedConditions.visibilityOf(eraseTranscationsRadio));
		if(eraseTranscationsRadio.isSelected()==false)
		{
			//click(eraseTranscationsRadio);
			eraseTranscationsRadio.click();
		}
		
		Thread.sleep(1999);
		
		click(eraseAllOkBtn);

		Thread.sleep(1999);

		if (getIsAlertPresent()) {
			getWaitForAlert();

			getAlert().accept();
		}

		checkValidationMessage("Data deleted successfully");
		
		Thread.sleep(2999);

	}

	public static String getCurrentdateDayFormatWithFilter(int day) {

		DateFormat df = new SimpleDateFormat("dd MMM YYYY");
		Date date = new Date();

		String docdate = df.format(date);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, day);

		String FilterDate = df.format(c.getTime());

		System.out.println("FilterDate  : " + FilterDate);

		return FilterDate;

	}

	public static boolean checkBackgroundSavingNegativeMessage(String docno)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) {
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("This Transaction will make the Stock Negative");
		expMessage.add("Voucher saved successfully : " + docno);

		System.out.println("Actual Message    : " + actMessage);
		System.out.println("Expected Message  : " + expMessage);

		if (actMessage.equals(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkSavingNegativeMessage(String docno)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("This Transaction will make the Stock Negative");
		expMessage.add("Voucher saved successfully : " + docno);

		HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) {
			String data = test("");
			actMessage.add(data);
		}

		System.out.println("Actual Message    : " + actMessage);
		System.out.println("Expected Message  : " + expMessage);

		if (actMessage.equals(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static void dropDown(WebElement element, String value) {

		new Select(element).selectByValue(value);

	}

	public static void scrollPageDown(WebDriver getDriver) {

		try {
			JavascriptExecutor executor = ((JavascriptExecutor) getDriver());
			executor.executeScript("window.scrollBy(0,1000)");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removetTxt(WebElement element) {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
	}

	public String currentDateFormat() {

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();

		String docdate = df.format(date);
		return docdate;
	}

	public static void scrollPageUp(WebDriver getDriver) {

		try {
			JavascriptExecutor executor = ((JavascriptExecutor) getDriver());
			executor.executeScript("window.scrollBy(0,-600)");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropDown(WebElement element, int index) {

		new Select(element).selectByIndex(index);

	}

	public static void dropDown(String str, WebElement element) {

		new Select(element).selectByVisibleText(str);

	}

	public static void contextClick(WebElement element) {

		try {
			Actions action = new Actions(getDriver()).contextClick(element);

			action.build().perform();

			System.out.println("right clicked the element");
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + element + " was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Element " + element + " was not clickable " + e.getStackTrace());
		}
	}

	public static void moveToElement(WebElement element) {
		try {
			Actions action = new Actions(getDriver()).moveToElement(element).click();

			action.build().perform();

			System.out.println("MoveTo element clicked the element");
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + element + " was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Element " + element + " was not clickable " + e.getStackTrace());
		}
	}

	public static void negativeMessage() {
		if (errorMessage.getText().equalsIgnoreCase("This Transaction will make the Stock Negative"))
			;
		{
			click(errorMessageCloseBtn);
		}
	}

	public static String FilterCurrentDate(int day) {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

		String docdate = df.format(date);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, day);

		String FilterDate = df.format(c.getTime());

		//System.out.println("FilterDate  : " + FilterDate);

		return FilterDate;
	}

	@FindBy(xpath = "//*[text()=' Logout']")
	public static WebElement QUEXElogoutOption;

	public static boolean checkBackgroundSavingMessage(String docno)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException

	{
		try {
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));

			String actErrorMessage = errorMessage.getText();
			String expErrorMessage = "Voucher saved successfully";
			String expErrorMessage1 = ": " + docno;

			if (actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1)) {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();

				System.out.println("ValidationMessage  :  " + actErrorMessage + " Starts With  : " + expErrorMessage
						+ " Ends With " + expErrorMessage1);

				return true;
			}

			else {
				return false;
			}

		} catch (Exception e) {
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());
			return false;
		}

	}

	public static boolean checkBackgroundSavingMessageWithTransNegative(String docno)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {

			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actDisplayList = listOfElements(errorMessageList);

			String expErrorMessage = "Voucher saved successfully";
			String expErrorMessage1 = ": " + docno;

			String expErrorMessage2 = "This Transaction will make the Stock Negative";

			if (actDisplayList.startsWith(expErrorMessage) && actDisplayList.endsWith(expErrorMessage1)
					|| actDisplayList.equalsIgnoreCase(expErrorMessage2)) {
				return true;
			}

			else if (actDisplayList.startsWith(expErrorMessage) && actDisplayList.endsWith(expErrorMessage1)
					&& actDisplayList.equalsIgnoreCase(expErrorMessage2)) {

				return true;
			}

			else {
				return false;
			}

		} catch (Exception e) {
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());
			return false;
		}

	}

	public static boolean checkLoadingMessage()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		try {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			String actVoucherLoadingMessage = errorMessage.getText();
			String expVoucherLoadingMessage = "Voucher loaded successfully";

			System.out.println("VoucherLoadingMessage  : " + actVoucherLoadingMessage + " Value Expected : "
					+ expVoucherLoadingMessage);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();

			if (actVoucherLoadingMessage.startsWith(expVoucherLoadingMessage)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.err.println("UNABLE TO COMPARE");
			return false;
		}
	}

	@FindBy(xpath = "form-group col-xs-12 theme_button_color")
	public static WebElement logoutOptionqcexe;

	@FindBy(xpath = "//*[@id='errmsgDiv']")
	public static WebElement loginPageErrorMesg;

	@FindBy(id = "txtPassword")
	public static WebElement password;

	@FindBy(id = "ddlCompany")
	public static WebElement companyDropDownList;

	@FindBy(id = "btnSignin")
	public static WebElement signIn;

	@FindBy(xpath = "//*[@id='txtUsername']")
	public static WebElement username;

	public static void reLogin(String userName, String passWord)
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {

		// excelReader = new ExcelReader(POJOUtility.getExcelPath());

		Thread.sleep(3000);
		click(userNameDisplay);
		Thread.sleep(1000);
		click(logoutOption);
		Thread.sleep(3000);

		// String unamelt = excelReader.getCellData(xlSheetName, 102, 5);

		// String pawslt = excelReader.getCellData(xlSheetName, 103, 5);

		LoginPage.enterUserName(userName);
		LoginPage.enterPassword(passWord);

		Select company = new Select(companyDropDownList);
		company.selectByValue("108");
		Thread.sleep(2000);

		LoginPage.clickOnSignInBtn();

		try {

			if (loginPageErrorMesg.isDisplayed()) {

				enterText(username, userName);
				enterText(password, passWord);
				Select company1 = new Select(companyDropDownList);
				company1.selectByValue("108");
				Thread.sleep(2000);
				click(signIn);
			}

		} catch (Exception e) {

			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());

			String Exception = e.getMessage();

			// return Exception;

			// TODO: handle exception
		}

		Thread.sleep(3000);

		System.out.println("Signing");
	}

	public void reportCustomizationDeleteOption()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(2000);
		click(sl_OkBtn);

		Thread.sleep(2500);
		click(report_CloseBtn);

		Thread.sleep(2000);
		click(reportCusBtn);

		Thread.sleep(2000);
		click(reportCusDeleteBtn);

		Thread.sleep(2000);

		getAlert().accept();

		checkValidationMessage("Layout Deleted Successfully");

		Thread.sleep(2000);

	}

	public static String checkValidationMessage(String ExpMessage)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(2000);

		try {
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage = errorMessage.getText();
			String expErrorMessage = ExpMessage;

			try {

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();

				System.out.println("ValidationMessage Actual :  " + actErrorMessage);
				System.out.println("ValidationMessage Expctd :  " + expErrorMessage);

				return actErrorMessage;
			} catch (Exception ee) {

				System.out.println("ValidationMessage Actual :  " + actErrorMessage);
				System.out.println("ValidationMessage Expctd :  " + expErrorMessage);

				return actErrorMessage;
			}
		} catch (Exception e) {
			System.err.println("*************************Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());

			String Exception = e.getMessage();

			return Exception;
		}
	}

	public static String test(String ExpMessage)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
		String actErrorMessage = errorMessage.getText();
		String expErrorMessage = ExpMessage;

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();

		System.out.println("ValidationMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage);

		return actErrorMessage;

	}
/*
	public static boolean ListComparisionWOOrder(List<WebElement> elementList, String expRowList) {

		String actRowList = listOfElements(elementList);
		List List1 = new ArrayList<String>(
				Arrays.asList(actRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
		List List2 = new ArrayList<String>(
				Arrays.asList(expRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));

		Collections.sort(List1);
		Collections.sort(List2);

		System.out.println("actList:" + List1);
		System.out.println("expList:" + List2);

		boolean result = List1.size() == List2.size() && List1.equals(List2);
		System.out.println("Two Lists result:" + result);
		return result;

	}
*/
	
	
	 public static  boolean ListComparisionWOOrder(List<WebElement> elementList,String expRowList)
	  {
	      
	      String actRowList = listOfElements(elementList);
	       List List1 = new ArrayList<String>(Arrays.asList(actRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
	       List List2 = new ArrayList<String>(Arrays.asList(expRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
	      
	       System.out.println("actList:"+List1);
		   System.out.println("expList:"+List2);
	     
	       
	          Collections.sort(List1);
	          Collections.sort(List2);
	          
	     
	     
	     
	      return List1.size() == List2.size()&& List1.equals(List2)?true:false;
	  }
	
	@FindBy(xpath = "//*[@class='icon-filter2 hiconright2']")
	public static WebElement reportCustomizeBtn;

	@FindBy(xpath = "//*[@class='icon-delete hiconright2']")
	public static WebElement deleteLayout;

	public void reportCustomizationDelete()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		click(reportCustomizeBtn);

		Thread.sleep(2000);

		click(deleteLayout);

		getWaitForAlert();

		getAlert().accept();

		checkValidationMessage("Layout Deleted Successfully");
	}

	public static void checkLoginToSelectedCompany(String cname) throws InterruptedException {

		try {
			if (username.isDisplayed()) {
				System.err.println("Displayed Focus Login Screen");
			}

		} catch (Exception e) {

			logout();
		}

		Thread.sleep(1500);

		LoginPage lp = new LoginPage(getDriver());

		lp.enterUserName("su");

		lp.enterPassword("su");

		String compname = cname;

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :" + cqSize);

		int i;

		for (i = 0; i < elementCount.size(); i++) {
			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("Company List" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}

		Thread.sleep(2000);

		lp.clickOnSignInBtn();

	}

	public static boolean ListComparsion(List<WebElement> elementList, String exp, String Loc)
			throws InterruptedException {

		String act = listOfElements(elementList);
		String expList = exp;

		System.out.println("ACT " + Loc + " " + act);
		System.out.println("Exp " + Loc + " " + expList);

		if (act.equalsIgnoreCase(expList)) {
			System.err.println(" List Same as Expected------------True");
			return true;

		} else {
			System.err.println(" List NOT EQUALS------------False");
			return false;
		}

	}

	public static String MonthDateYearF1() {
		DateFormat df = new SimpleDateFormat("M/dd/yyyy");
		Date date = new Date();

		String docdate = df.format(date);
		return docdate;
	}

	public static void logout() throws InterruptedException {
		Thread.sleep(2999);

		// ClickUsingJs(userNameDisplayLogo);

		click(userNameDisplayLogo);

		Thread.sleep(2000);

		ClickUsingJs(logoutOption);

		System.err.println("*********Logout Successfully********************************");

	}

	public static void doubleClick(WebElement element) {

		try {
			Actions action = new Actions(getDriver()).doubleClick(element);

			action.build().perform();

			System.out.println("double clicked the element");
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + element + " was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Element " + element + " was not clickable " + e.getStackTrace());
		}
	}

	public static String todaydate123() {
		DateFormat df = new SimpleDateFormat("M/d/yyyy");
		Date date = new Date();
		String TD = df.format(date);
		return TD;
	}

	public static void highlightElement(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		try {

			executor.executeScript(
					"arguments[0].setAttribute('style' , 'background: light-yelow; border: 3px solid red;');", element);
			executor.executeScript(
					"arguments[0].setAttribute('style' , 'background: light-yelow; border: 1px solid white;');",
					element);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String checkDownloadedFileName(WebDriver driver) throws InterruptedException, AWTException {
		/*
		 * String mainWindow = driver.getWindowHandle();
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("window.open()");
		 * 
		 * for(String winHandle : driver.getWindowHandles()) {
		 * driver.switchTo().window(winHandle); }
		 * 
		 * driver.get("chrome://downloads");
		 */

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());

		int count = openTabs.size();

		System.out.println("openTabs : " + count);

		getDriver().switchTo().window(openTabs.get(count - 2));

		getDriver().switchTo().window(openTabs.get(count - 1));

		Thread.sleep(2000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		String fileName = (String) js1.executeScript(
				"return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");

		System.err.println("Download deatils");
		System.out.println("File Name :-" + fileName);

		Thread.sleep(2000);

		/*
		 * driver.close();
		 * 
		 * driver.switchTo().window(mainWindow);
		 */

		getDriver().switchTo().window(openTabs.get(count - 1)).close();

		Thread.sleep(2000);

		getDriver().switchTo().window(openTabs.get(count - 2));

		return fileName;
	}

	@FindBy(xpath = "//*[@id='id_focus_msgbox_title']/div[2]/span")

	static WebElement serverErrorCloseBtn;

	public static void checkServerErrorMessage() {
		try {

			if (serverErrorCloseBtn.isDisplayed() == true) {
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serverErrorCloseBtn));
				serverErrorCloseBtn.click();

				Thread.sleep(2000);
				System.err.println("*********************************************SERVER ERROR MESSAGE DISPLAYED ");
			}

		} catch (Exception e) {
			System.err.println("**********************************  SERVER ERROR MESSAGE  Not DISPLAYED ");
			System.out.println(" Expection  : " + e);

		}
	}

	public static void browserOpen() throws EncryptedDocumentException, InvalidFormatException, IOException {
		baseDir = System.getProperty("user.dir");
		PropertyConfigurator.configure(baseDir + "\\log4j.properties");

		/*
		 * System.setProperty(DriverUtility.chromeKey, baseDir +
		 * DriverUtility.chromeValue);
		 */

		WebDriverManager.chromedriver().setup();

		String downloadFilepath = getBaseDir() + "\\autoIt\\ExportFiles";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		chromePrefs.put("safebrowsing.enabled", "true");
		ChromeOptions options = new ChromeOptions();

		// options.addArguments("--Incognito");

		// options.addArguments("headless");

		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(cap);
		initActivities();

		LoginPage lp = new LoginPage(getDriver());

		lp.checkLoginPageTitleByURLInputInBrowser(DriverUtility.FINUrl);

	}

	public static void re_LunchBrowser()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		/*
		 * Set<Cookie> cookies = null; try { cookies = driver.manage().getCookies(); }
		 * catch (Throwable e) { System.err.println("Error While getting Cookies: " +
		 * e.getMessage()); }
		 * 
		 * Thread.sleep(1999);
		 * 
		 * getDriver().close();
		 * 
		 * System.err.println("--------------------Browser Closed");
		 * 
		 * Thread.sleep(1999);
		 * 
		 * browserOpen();
		 * 
		 * System.err.println("--------------------Browser OPened");
		 * 
		 * Thread.sleep(1999);
		 * 
		 * try { for (Cookie cookie : cookies) { driver.manage().addCookie(cookie); } }
		 * catch (Throwable e) {
		 * 
		 * System.err.println("Error While setting Cookies: " + e.getMessage()); }
		 * 
		 * getDriver().navigate().refresh();
		 */
	}

	public static void checkLoginToSelectedCompany(String cname, String username, String Password)
			throws InterruptedException {
		Thread.sleep(3000);

		LoginPage lp = new LoginPage(getDriver());

		lp.enterUserName(username);

		lp.enterPassword(Password);

		String compname = cname;

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :" + cqSize);

		int i;

		for (i = 0; i < elementCount.size(); i++) {

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("Logined Company" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}

		Thread.sleep(2000);

		lp.clickOnSignInBtn();

		Thread.sleep(45000);
		
		try {
			if (reindexingPopupCancelBtn.isDisplayed()) {
				System.out.println("Reindexing Log is Displaying while Restore Company");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reindexingPopupCancelBtn));
				reindexingPopupCancelBtn.click();

				Thread.sleep(2000);

				lp.clickOnSignInBtn();
				
				System.err.println(
						" #########################################################Successfully Login to Company Name: "
								+ cname);
			}

		}

		catch (Exception e) {
			System.out.println("Reindexing Log is Not Displaying in Restore Company");
		}
		Thread.sleep(4000);
	}

	public static void ReindexPopup() {

		LoginPage lp = new LoginPage(getDriver());

		try {
			if (reindexingPopupCancelBtn.isDisplayed()) {
				System.out.println("Reindexing Log is Displaying while Restore Company");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reindexingPopupCancelBtn));
				reindexingPopupCancelBtn.click();

				Thread.sleep(2000);

				lp.clickOnSignInBtn();
			}

		}

		catch (Exception e) {
			System.out.println("Reindexing Log is Not Displaying in Restore Company");
		}
	}

	@FindBy(xpath = "//div[@id='ReIndexingError_Modal']/div/div")
	private static WebElement reindexingPopup;

	@FindBy(xpath = "(//*[@class='icon-close'])[1]")
	private static WebElement reindexingPopupCloseBtn;

	@FindBy(xpath = "//*[@id='ReIndexingError_Modal']/div/div/div[3]/button")
	private static WebElement reindexingPopupCancelBtn;

	public static void billwisePick()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(500);
		click(billRefNewReferenceTxt);

		Thread.sleep(500);
		click(billRefPickIcon);

		Thread.sleep(500);
		click(billRefOkBtn);

		Thread.sleep(200);

	}

	public static String filterDateBydays(int count) {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, count);

		String FilterDate = df.format(c.getTime());

		System.out.println("date displayed As  : " + FilterDate);
		return FilterDate;
	}

	public static String dateFormat(int count) {
		DateFormat df = new SimpleDateFormat("dd MMM yyyy");

		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, count);

		String dateFormat = df.format(c.getTime());

		System.out.println("date displayed As  : " + dateFormat);

		return dateFormat;

	}

	public static String restoreCompany(String backupName, String companyName)
			throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
		restore.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
		folderpathExpandBtn.click();

		Thread.sleep(3000);

		Robot rb = new Robot();
		StringSelection str = new StringSelection(getBaseDir() + "\\backup\\" + backupName + ".fbak");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
		restoreCompanyBtn.click();

		Thread.sleep(3000);
		String alertText = "";
		try {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
			overRideYesBtn.click();

			System.err.println("COMPANY EXISTS");

			//Thread.sleep(130000);

		} catch (Exception e) {
			System.err.println("NO OLDER COMPANY EXISTS");
		}

		new WebDriverWait(getDriver(), 500).until(ExpectedConditions.alertIsPresent());
		
		if (getIsAlertPresent()) {
			System.err.println("Alert Displayed");
			getWaitForAlert();
			Thread.sleep(2000);
			alertText = getAlert().getText();

			getAlert().accept();
		}

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
		userNameDisplayLogo.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(3000);

		checkLoginToSelectedCompany(companyName, "su", "su");

		Thread.sleep(35000);

		ReindexPopup();
		
	//	getDriver().navigate().refresh();

		Thread.sleep(5000);
/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
		userNameDisplayLogo.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(3000);

		checkLoginToSelectedCompany(companyName, "su", "su");
		Thread.sleep(3000);
*/
		return alertText;

	}

	public static void timeTaken() {
		long start = System.currentTimeMillis();

		WebElement ele = driver.findElement(By.id("ID of some element on the page which will load"));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;

		System.out.println("Total Time for page load - " + totalTime);
	}

	public static boolean checkVoucherSavingMessage(String docno)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage = errorMessage.getText();
			String expErrorMessage = "Voucher saved successfully";
			String expErrorMessage1 = ": " + docno;

			System.out.println("SavingMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage + " "
					+ expErrorMessage1);

			if (actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1)) {
				try {
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();

					return true;
				} catch (Exception ee) {
					return true;
				}
			} else {
				return false;
			}
		} catch (Exception e) {
			System.err.println("UNABLE TO COMPARE");
			return false;
		}
	}

	public static String listOfElements(List<WebElement> elementList) {

		int count = elementList.size();

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			String data = elementList.get(i).getText();

			if (data.isEmpty() == false) {
				list.add(data);
			}
		}

		String actList = list.toString();

		return actList;

	}

	public static String HashSetElements(List<WebElement> elementList) {

		int count = elementList.size();

		HashSet<String> elementset = new HashSet();
		;

		for (int i = 0; i < count; i++) {
			String data = elementList.get(i).getText();

			if (data.isEmpty() == false) {
				elementset.add(data);
			}

		}
		String actList = elementset.toString();

		return actList;

	}

	public static String selectionElementFromList(List<WebElement> elementList, String element) {

		int count = elementList.size();

		ArrayList<String> list = new ArrayList<>();

		String data = "";

		for (int i = 0; i < count; i++) {
			data = elementList.get(i).getText();

			if (data.equalsIgnoreCase(element)) {
				elementList.get(i).click();
			}
		}

		return data;

	}

	public static void visibility(WebElement element) throws InterruptedException {

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(element));

	}

	public static void sendData(WebElement element, String data) throws InterruptedException {

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
		element.click();

		removetTxt(element);
		Thread.sleep(500);
		element.sendKeys(data);
		Thread.sleep(1500);
		element.sendKeys(Keys.TAB);

	}

	public static String selectionElementFromListWithCount(List<WebElement> elementList, String element, int count,
			List<WebElement> elementListToCLick) {

		System.err.println("Entered selectionElementFromListWithCount METHOD");

		ArrayList<String> list = new ArrayList<>();

		String data = "";

		for (int a = 0; a < count; a++) {
			data = elementList.get(a).getText();

			if (data.equalsIgnoreCase(element)) {
				System.out.println(data);

				elementListToCLick.get(a).click();
			}
		}

		return data;

	}

	public static void browserRefresh() throws InterruptedException {
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
	}

	public static void checkDeleteLinkStatus()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {

		Thread.sleep(1000);
		click(homepagePannelOpenBtn);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeBtn));
		customizeBtn.click();

		Thread.sleep(4000);

		

		int custBodyHeaderListCount = custBodyHeaderList.size();

		for (int i = 0; i < custBodyHeaderListCount; i++) {
			String data = custBodyHeaderList.get(i).getText();

			// System.out.println(i + " " + data);

			if (data.equalsIgnoreCase("Link status") || data.equalsIgnoreCase("Balance link value")) {
				custBodyHeaderList.get(i).click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custRemoveBtn));
				custRemoveBtn.click();

				Thread.sleep(1000);

				break;
			}

			if (data.equalsIgnoreCase("Link status") || data.equalsIgnoreCase("Balance link value")) {
				custBodyHeaderList.get(i).click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custRemoveBtn));
				custRemoveBtn.click();

				Thread.sleep(1000);

				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
		custSaveBtn.click();

		String expMessage = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expMessage);

		Thread.sleep(2000);
		click(homepagePannelOpenBtn);

	}

	public static String getCurrentTimeF2() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("h:mm:ss aa");
		String strDate = dateFormat.format(date);
		System.err.println(strDate);

		return strDate;
	}

	public static void elementToClick(WebElement element) throws InterruptedException {
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void errorMessageCloseMethod() {
		try {
			if (errorMessage.isDisplayed()) {
				System.out.println(" Error Message Displayed AS:" + errorMessage.getText());
				errorMessageCloseBtn.click();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static String takeSnapShot() throws Exception {

		String loc = "./ScreenShots";
		TakesScreenshot ts = (TakesScreenshot) BaseEngine.getDriver();
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(loc + "\\" + getCurrentDate() + "\\" + "" + currentDate1() + "" + "---"
				+ BaseEngine.getTCName() + ".jpeg"));
		return loc;

	}

	public static String currentDate1() {

		String date1 = new SimpleDateFormat("MMM" + " " + "dd" + " " + "yyyy" + " " + "HH" + " " + "mm")
				.format(Calendar.getInstance().getTime());

		return date1;

	}

	public static void eraseAlltranactions()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(homeMenu);

		click(dataMangementMenu);

		click(eraseAll);

		Thread.sleep(3000);
		click(eraseTranscationsRadio);

		click(eraseAllOkBtn);
		
		Thread.sleep(3000);

		if (getIsAlertPresent()) {
			getWaitForAlert();

			getAlert().accept();
		}

		checkValidationMessage("Data deleted successfully.");

	}

	public static void restoreCompany(String companyName) throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);

		clickOn(homeMenu);

		clickOn(dataMangementMenu);

		clickOn(restore);

		clickOn(folderpathExpandBtn);

		Thread.sleep(3000);

		Robot rb = new Robot();
		StringSelection str = new StringSelection(getBaseDir() + "\\requiredBackUps\\" + companyName + ".fbak");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		clickOn(restoreCompanyBtn);

		Thread.sleep(3000);

		try {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
			overRideYesBtn.click();

			System.err.println("COMPANY EXISTS");

			Thread.sleep(130000);

		} catch (Exception e) {
			System.err.println("NO OLDER COMPANY EXISTS");
		}

		if (getIsAlertPresent()) {
			System.err.println("Alert Displayed");
			getWaitForAlert();

			getAlert().accept();
		}

		Thread.sleep(3000);

		ScrollToElement(userNameDisplayLogo);

		click(userNameDisplayLogo);

		click(logoutOption);

		Thread.sleep(3000);

		checkLoginToSelectedCompany(companyName, "su", "su");

		Thread.sleep(3000);

		reindexClear();

	}

	public static void mesageMayDisplay() {

		try {
			if (errorMessage.isDisplayed()) {
				System.err.println(errorMessage.getText());
				errorMessageCloseBtn.click();
			}
		} catch (Exception e) {
			System.err.println("No ErrorMesage Found");
		}
	}

	public static void voucherClose() throws InterruptedException {
		Thread.sleep(1000);

		elementToClick(new_CloseBtn);

		Thread.sleep(1500);

		elementToClick(homepageCloseBtn);

	}

	public boolean preErrorMessage() throws NoSuchElementException {
		boolean isPresent = true;

		try {
			if (errorMessage.isDisplayed()) {
				System.out.println("*************Error Message Displayed AS:" + errorMessage.getText());
				errorMessageCloseBtn.click();
			}
		} catch (NoSuchElementException e) {
			System.out.println("---------------No Error Message ");
			isPresent = false;
		}

		return isPresent;
	}

	public static boolean checkBackgroundSavingCashAccountNegativeMessage(String docno)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(1500);

		try {
			int count = errorMessageList.size();

			HashSet<String> actMessage = new HashSet<String>();

			for (int i = 0; i < count; i++) {

				System.err.println(" Mesage Count in loop  : " + count);
				String data = errorMessageList.get(i).getText();
				actMessage.add(data);

				errorMessageCloseBtnList.get(i).click();
			}

			HashSet<String> expMessage = new HashSet<String>();

			expMessage.add("Voucher saved successfully : " + docno);
			// expMessage.add("Saving in background.");
			expMessage.add("This Transaction will make the cash Account Negative");

			System.out.println("Actual Message    : " + actMessage);
			System.out.println("Expected Message  : " + expMessage);

			if (actMessage.equals(expMessage)) {
				return true;
			} else {
				return false;
			}
		}

		catch (Exception e) {
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());
			return false;

		}
	}

	public static void NavigationToPaymentsVAT() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		click(paymentsVATVoucher);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToRecepitsVAT() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		click(receiptsVATMenu);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToCashSales() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialTransactionSalesMenu);
		click(cashSales);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToOpeningBalance() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsJournalsMenu);
		click(openingBalancesVoucher);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToPurchaseVouchersVat() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationTosalesInvoiceVATVoucher() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialTransactionSalesMenu);
		click(salesInvoiceVATVoucher);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToSalesReturnsVoucher() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialTransactionSalesMenu);
		click(salesReturnsVoucher);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToJVVATViewVoucher() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(finTransJournalsMenu);
		click(JVVATViewVoucher);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToCreditNotesVATMenu() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(finTransJournalsMenu);
		click(creditNotesVATMenu);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToDebitNotesVatMenu() throws InterruptedException {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(finTransJournalsMenu);
		
		getAction().moveToElement(debitNotesVatMenu).build().perform();
		Thread.sleep(2000);
		click(debitNotesVatMenu);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToPDRVAT() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		click(PDRVAT);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToPDPVAT() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		click(PDPVAT);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToReceiptsVoucher() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		click(receiptsVoucher);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToPaymentsVoucher() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		click(paymentsVoucher);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToSalesInvoiceVATVoucher() throws InterruptedException {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialTransactionSalesMenu);
		click(salesInvoiceVATVoucher);
		Thread.sleep(6000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToRecepitsFIFOmenu() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		getAction().moveToElement(recepitsFIFOmenu).build().perform();
		click(recepitsFIFOmenu);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToPaymentsFIFOVoucher() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		click(paymentsFIFOVoucher);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void NavigationToSalesReturnFIFO() {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialTransactionSalesMenu);
		click(salesReturnFIFO);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	}

	public static void selectVoucherHeaderCurrency(String select) throws InterruptedException {
		click(voucherHeaderCurrency);
		removetTxt(voucherHeaderCurrency);
		voucherHeaderCurrency.sendKeys(Keys.SPACE);
		selectionElementFromList(currencyListCount, select);
		Thread.sleep(1000);
		tab(voucherHeaderCurrency);

	}

	public static void selectVoucherHeaderAccount(String select) throws InterruptedException {
		click(customerAccountTxt);
		removetTxt(customerAccountTxt);
		customerAccountTxt.sendKeys(Keys.SPACE);
		selectionElementFromList(customerAccountListCount, select);
		Thread.sleep(1500);
		tab(customerAccountTxt);

	}

	public void selectVoucherHeaderPurchaseAccount(String select) throws InterruptedException {
		click(purchasesAccounttxt);
		removetTxt(purchasesAccounttxt);
		purchasesAccounttxt.sendKeys(Keys.SPACE);
		selectionElementFromList(purchasesAccountListCount, select);
		Thread.sleep(1500);
		tab(purchasesAccounttxt);

	}

	public static void selectVoucherHeaderDepartmentTxt(String select) throws InterruptedException {
		click(departmentTxt);
		removetTxt(departmentTxt);
		departmentTxt.sendKeys(Keys.SPACE);
		removetTxt(departmentTxt);
		selectionElementFromList(departmentListCount, select);
		Thread.sleep(1500);
		tab(departmentTxt);

	}

	public static void enter_AccountTxt(String select) throws InterruptedException {
		click(enter_AccountTxt);
		removetTxt(enter_AccountTxt);
		enter_AccountTxt.sendKeys(Keys.SPACE);
		selectionElementFromList(openingBalAccountListInGrid, select);
		Thread.sleep(1500);
		tab(enter_AccountTxt);

	}

	public static void selectVoucherHeaderplaceOFSupplyTxt(String select) throws InterruptedException {
		click(placeOFSupplyTxt);
		removetTxt(placeOFSupplyTxt);
		placeOFSupplyTxt.sendKeys(Keys.SPACE);
		selectionElementFromList(placeOFSupplyList, select);
		Thread.sleep(1500);
		tab(placeOFSupplyTxt);

	}

	public static void selectVoucherHeaderSalesInvoiceVATPlaceOFSupply(String select) throws InterruptedException {
		click(salesInvoiceVATPlaceOFSupply);
		removetTxt(salesInvoiceVATPlaceOFSupply);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		selectionElementFromList(placeOFSupplyList, select);
		Thread.sleep(1500);
		tab(salesInvoiceVATPlaceOFSupply);

	}

	public static void selectPVWareHouseTxt(String select) throws InterruptedException {
		click(pvWareHouseTxt);
		removetTxt(pvWareHouseTxt);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		selectionElementFromList(pvwareHouseListCount, select);
		Thread.sleep(1500);
		tab(pvWareHouseTxt);

	}

	public static void selectWareHouseTxt(String select) throws InterruptedException {
		click(wareHouseTxt);
		removetTxt(wareHouseTxt);
		wareHouseTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		selectionElementFromList(wareHouseListCount, select);
		Thread.sleep(1500);
		tab(wareHouseTxt);

	}

	public static void selectItem(String select) throws InterruptedException {
		click(enter_ItemTxt);
		removetTxt(enter_ItemTxt);
		enter_ItemTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		selectionElementFromList(itemListCount, select);
		Thread.sleep(1500);
		tab(enter_ItemTxt);
	}

	public static void selectCashBankAccountTxt(String select) throws InterruptedException {
		click(newCashBankAccountTxt);
		removetTxt(newCashBankAccountTxt);
		newCashBankAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		selectionElementFromList(cashAndBAnkAccountList, select);
		Thread.sleep(1500);
		tab(newCashBankAccountTxt);

	}

	public static void selectVendorAccountTxt(String select) throws InterruptedException {
		click(vendorAccountTxt);
		removetTxt(vendorAccountTxt);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		selectionElementFromList(vendorAccountListCount, select);
		Thread.sleep(1500);
		tab(vendorAccountTxt);

	}

	public static void enter_WarehouseList(String select) throws InterruptedException {
		click(enter_WarehouseTxt);
		removetTxt(enter_WarehouseTxt);
		enter_WarehouseTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		selectionElementFromList(warehouseBodyComboList, select);
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);

	}

	public void NavigationToPurchaseVoucher() throws InterruptedException {
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);

		click(purchaseVouchersBtn);

		Thread.sleep(2500);
	}

	public static void waitForElement(WebElement ele) {
		fluentWaitWith250Sec().until(ExpectedConditions.elementToBeClickable(ele));

	}

	public static void focusMainSearch(String text) throws InterruptedException {

		click(focusMainSearch);
		focusMainSearch.sendKeys(text);
		Thread.sleep(2000);
		focusMainSearch.sendKeys(Keys.ENTER);

	}

	public void NavigationToMRN() throws InterruptedException {
		click(inventoryMenu);

		click(invTransactionsMenu);

		click(invTransPurchasesMenu);

		click(materialReceiptsNotesBtn);
	}

	public static void voucherHomePageVoucherSelect(String doc) throws InterruptedException {

		Thread.sleep(2000);

		//waitOn(newBtn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

		int count = homePageVoucherNumList.size();

		for (int i = 0; i < count; i++) {
			String data = homePageVoucherNumList.get(i).getText();

			System.err.println(data);
			if (data.equalsIgnoreCase(doc)) {
				getAction().doubleClick(homePageChkboxList.get(i)).build().perform();
			}

		}
		Thread.sleep(1000);
	}

	public static String dateF9() {
		java.util.Date date = Calendar.getInstance().getTime();

		DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}

	public String FilterdateF9(int count) {
		DateFormat df = new SimpleDateFormat("M/d/yyyy");
		Date date = new Date();

		String docdate = df.format(date);
		Calendar c = Calendar.getInstance();

		c.add(Calendar.DATE, +count);

		String FilterDate = df.format(c.getTime());

		System.out.println("FilterDate  : " + FilterDate);

		return FilterDate;
	}

	public static void rightClick(WebElement element) {
		Actions action = new Actions(getDriver());

		action.contextClick(element).build().perform();
	}

	@FindBy(xpath = "//*[@id='ReIndexingError_Modal']/div/div/div[1]/h4")
	public static WebElement reindexHeaderTxt;

	@FindBy(xpath = "//*[@onclick='LOGIN.onCancel_RedirectToLogin(0);']")
	public static WebElement reindexCancelBtn;

	public static void checkRestoreOptionsCompanyAndLogin(String BackUp, String cpName)
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
		restore.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
		folderpathExpandBtn.click();

		Thread.sleep(3500);

		Robot rb = new Robot();

		StringSelection str = new StringSelection(getBaseDir() + "\\backup\\" + BackUp + ".fbak");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		System.out.println(str);
		
		Thread.sleep(4000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
		restoreCompanyBtn.click();

		try {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
			overRideYesBtn.click();
			//Thread.sleep(180000);
		} catch (Exception e) {
			System.err.println("NO OLDER COMPANY EXISTS");
		}

		Thread.sleep(1999);
		  new WebDriverWait(getDriver(), 500).until(ExpectedConditions.alertIsPresent());
		
		if (getIsAlertPresent()) {
			getWaitForAlert();

			getAlert().accept();
		}

		Thread.sleep(1999);

		logout();

		getDriver().navigate().refresh();

		Thread.sleep(1999);

		checkLoginToSelectedCompany(cpName, "su", "su");

		Thread.sleep(5000);

		//reindexClearCANCEL();// Need TO Change as Per Back Up Re- Index Pop Up

		//Thread.sleep(5500);

	}

	public static void reindexClear() throws InterruptedException {

		Thread.sleep(7899);

		/*
		 * as of Now code is comment try {
		 * 
		 * fluentWaitWith250Sec().until(ExpectedConditions.elementToBeClickable(
		 * reindexCancelBtn));
		 * 
		 * if (reindexCancelBtn.isDisplayed()) {
		 * 
		 * System.err.println("Reindexing Log is Displaying while Restore Company");
		 * 
		 * click(reindexCancelBtn);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * click(signIn); }
		 * 
		 * } catch (Exception e) {
		 * System.err.println("Catch Block Executed-----------------------------");
		 * 
		 * }
		 */

	}

	public static Wait waitEle() {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(125))
				.pollingEvery(Duration.ofMillis(250)).ignoring(WebDriverException.class)
				.ignoring(NoSuchElementException.class);

		return wait;

	}

	public static void clickOn(WebElement element) {

		waitEle().until(ExpectedConditions.visibilityOf(element));

		waitEle().until(ExpectedConditions.elementToBeClickable(element));

		waitForElement(element);

		waitAndClick(element);

	}

	private static FluentWait<WebDriver> createFluentWait() {
		return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);

	}

	public static void waitAndClick(WebElement element) {
		FluentWait<WebDriver> wait = createFluentWait();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void waitOn(WebElement element) {

		waitEle().until(ExpectedConditions.elementToBeClickable(element));

		waitForElement(element);

		// waitAndClick(element);
	}

	public static void reindexClearCANCEL() throws InterruptedException

	{

		Thread.sleep(6000);
		
		  
		  try {
		  
		  fluentWaitWith250Sec().until(ExpectedConditions.elementToBeClickable(reindexCancelBtn));
		  
		  click(reindexCancelBtn);
		  
		  System.out.println("Reindexing Log is Displaying while Restore Company");
		  
		  Thread.sleep(2000);
		  
		  click(signIn);
		  
		  } catch (Exception e) { 
		  System.out.println("Reindexing Log is NOT  Displaying while Restore Company");
		 
		  }
		 
	}

	public static  String listOfElements(int val,List<WebElement> elementList)
	{

	int count= elementList.size();

	ArrayList<String> list = new ArrayList<String>();

	for (int i = val; i < count; i++) 
	{
	String data=elementList.get(i).getText();

	if (data.isEmpty() == false) 
	{
	list.add(data);
	}



	}


	String actList=list.toString();

	return actList;

	}

	
	public static  boolean ListComparisionWOOrder(int i,List<WebElement> elementList,String expRowList)
	{
		
		String actRowList = listOfElements(i,elementList);
		 List List1 = new ArrayList<String>(Arrays.asList(actRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
	     List List2 = new ArrayList<String>(Arrays.asList(expRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
	    
	    System.out.println("actList:"+List1); 
	    System.out.println("expList:"+List2);
	    
	    Collections.sort(List1);
	    Collections.sort(List2);
	    
	   
	    boolean result = List1.size() == List2.size()&& List1.equals(List2);
	    System.out.println("Two Lists result:"+result);
		return result;
	}

	
	   public static void scrollToElementJSE(WebElement Element) throws InterruptedException
       {
       	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
       	jse.executeScript("arguments[0].scrollIntoView(true);", Element);
       	Thread.sleep(2000);
       }
	   
	   
	   public static WebElement getWebDriverWaitEle(WebElement ele)
	   {
		  WebElement WEle = new WebDriverWait(getDriver(), 90).until(ExpectedConditions.elementToBeClickable(ele));
		   
		  return WEle; 
		    
		   
	   }
	
	   
	   public static void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
			try {
				if (sourceElement.isDisplayed() && destinationElement.isDisplayed()) {
					Actions action = new Actions(getDriver());
					System.err.println("displaying elements");
					action.dragAndDrop(sourceElement, destinationElement).build().perform();
				} else {
					System.out.println("Element was not displayed to drag");
				}
			} catch (StaleElementReferenceException e) {
				System.out.println("Element with " + sourceElement + "or" + destinationElement
						+ "is not attached to the page document " + e.getStackTrace());
			} catch (NoSuchElementException e) {
				System.out.println("Element " + sourceElement + "or" + destinationElement + " was not found in DOM "
						+ e.getStackTrace());
			} catch (Exception e) {
				System.out.println("Error occurred while performing drag and drop operation " + e.getStackTrace());
			}
		}
	
	   
	   public static String getCurrentMonthDate()
		  {
			  
			  Calendar cal=Calendar.getInstance();
				SimpleDateFormat todayDate = new SimpleDateFormat("M/dd/yy");
				String currentDate = todayDate.format(cal.getTime());
				return currentDate;
		  }
	   
	   
	   public static String getCurrentMonth()
		  {
			  Calendar cal=Calendar.getInstance();
				SimpleDateFormat todayDate = new SimpleDateFormat("MMMM");
				String currentMonth = todayDate.format(cal.getTime());
				return currentMonth;
		  }
	   
	   public static String currentTimeWithDateTimewithDay()
		{
			
			ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss");

	        // 3. Format the ZonedDateTime object into a string
	        String formattedDateTime = now.format(formatter);

	        // 4. Print the result
	        System.out.println("Current Date and Time: " + formattedDateTime);
			return formattedDateTime;
			
		}
	   
	   
	   public static String currentTimeDay()
		{
			
			ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

	        // 3. Format the ZonedDateTime object into a string
	        String formattedDateTime = now.format(formatter);

	        // 4. Print the result
	        System.out.println("Current Time: " + formattedDateTime);
			return formattedDateTime;
			
		}
	   
	   
	   public static String currentDateMonth()
	   {
		   
		   Calendar cal=Calendar.getInstance();
			SimpleDateFormat todayDate = new SimpleDateFormat("dd MM yyyy");
			String currentMonth = todayDate.format(cal.getTime());
			return currentMonth;
	   }
	   
}
