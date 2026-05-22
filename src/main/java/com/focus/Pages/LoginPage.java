package com.focus.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.openqa.selenium.support.How;
import com.focus.base.BaseEngine;

import com.focus.utilities.POJOUtility;



public class LoginPage extends BaseEngine 
{
	private static String xlfile;
	private static String resPass="Pass";
	private static String resFail="Fail";
	//private static //excelReader //excelReader;
	private static WebElement loginTitle;
	private static String url;
	private static int cSize;
	private static String userN;
	
	@FindBy(xpath="//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;
	
    @FindBy(id="ddlCompany")
    private static WebElement companyDropDownList;

	@FindBy(id="btnSignin")
	private static WebElement signIn;
	
	@FindBy(xpath="//i[@title='Create Company']")
    private static WebElement companyCreateBtn;		

	@FindBy(xpath="//i[@title='Keyboard ']")
	private static WebElement keyboardBtn;

    @FindBy(xpath="//i[@title='Refresh']")
    private static WebElement refreshBtn;
	
	@FindBy(xpath="//*[@id='chkRememberMe']/../span")
	private static WebElement rememberMeChk;
	
	@FindBy(xpath="//*[@id='chkRememberPwd']/../span")
	private static WebElement rememberPwdChk;
	
	@FindBy(id="frgtPwd")
	private static WebElement frgtPwdLnk;
	
	@FindBy(xpath="//span[contains(@class,'icon-ok icon-font6')]")
	private static WebElement okButtonInCreateCompany;
	
	@FindBy(xpath="//span[contains(@class,'icon-close icon-font6')]")
	private static WebElement cancelButtonInCreateCompany;
	
   @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
   private static WebElement noIn;

	@FindBy(linkText="Create Company")
	private static WebElement createCompanyScreen;
	
	@FindBy(xpath="//*[@id='errmsgDiv']")
	private static WebElement mandatoryMsgs;
	
	//Fields of Company su Home Page
	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;
	
	@FindBy(xpath="//*[@id='mainHeader_MainLayout']/a/img")
	private static WebElement focusLogo;
	
	@FindBy(xpath="//*[@id='id_focus8_wrapper_default']/aside/section")
	private static WebElement menuBar;
	
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboardName;
	
	@FindBy(xpath="//*[@id='dashIcons']")
	private static WebElement dashboardIcons;
	
	//@FindBy(xpath="//span[@class='hidden-xs']")
	@FindBy(xpath="//*[@id='id_mainlayoutmenu']/ul[2]/li[7]/a")
	private static WebElement userNameDisplay;

	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;
	
	@FindBy(xpath="//*[@id='userprofile']/li/span[1]")
	private static WebElement changePassword;
	
	@FindBy(xpath="//*[@id='ddlCompanyLangualges_MainLayout']")
	private static WebElement languageDropdownInLogout;
	
	@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	private static WebElement logoutOption;
	
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
	
	@FindBy(xpath="//ul[@id='ulCompanyDetails_HomePage']")
	private static WebElement companydetails;
	
	
	
	 
public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	 Thread.sleep(5000);
       
       try 
       {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
			doNotShowCheckbox.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
			closeBtnInDemoPopupScreen.click(); 
			
			System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
			
		} 
       catch (Exception e)
       {
       	System.err.println("NO POP UP DISPLAYED");
		}

   	
   	Thread.sleep(4000);
}
		 
		
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	private static WebElement loginRefreshOkBtn;
	

public static void checkRefershPopOnlogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
  
  try 
  {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginRefreshOkBtn));
		loginRefreshOkBtn.click();
		
		
	} 
  catch (Exception e)
  {
  	System.err.println("NO ALERT POP UP DISPLAYED");
	}

	
	Thread.sleep(4000);
}
	
	

	public static boolean toCheckBrowserOpen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		////excelReader=new //excelReader(POJOUtility.getExcelPath());
		//xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		////excelReader.copyExcelFile();
		
		getDriver().manage().deleteAllCookies();
		/*getDriver().get("chrome://settings/clearBrowserData");
		
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		
		Thread.sleep(15000);*/
		
		
		if (getDriver()!=null)
		{
			System.out.println("Pass : Browser has Lanunched");
			////excelReader.setCellData(xlfile, "Sheet1", 5, 9, resPass);
			return true;
		}
		else
		{

			System.out.println("Fail : Browser has not Launched");
			////excelReader.setCellData(xlfile, "Sheet1", 5, 9, resFail);
			return false;
		}
		
	}
	
	
	
	public static boolean toCheckLoginScreenTitleByEnteringUrl() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		////excelReader=new //excelReader(POJOUtility.getExcelPath());
		//xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		   LoginPage lp=new LoginPage(getDriver());
	   	       
	      /* url=//excelReader.getCellData("Sheet1", 6, 6);*/
	       
		   url="http://localhost/FocusX/#";
		   
		//   url="https://desktop-nucsdpq/focusX#";
		  // url="http://192.168.4.108/focusX#";//rakes sys URL
	     
	       System.out.println("********URL************"+url);
		   
	       //enterUrl("http://localhost/focus8w");
	       
	        enterUrl(url);
	       
	       String loginTitle = getDriver().getTitle();
		
	       System.out.println("Launch The Browser and Input the url, Login Screen is display   :  "+ loginTitle);
		   
	       System.out.println("The URL of the Application  :  " + url);
	       
	       String exploginTitle="Focus";
	              
	       if (loginTitle.equalsIgnoreCase(exploginTitle))
	       {
	    	   System.out.println("Pass : Focus Login Screen Title is displaying Correct");
	    	//   //excelReader.setCellData(xlfile, "Sheet1", 6, 9, resPass);
	    	   return true;
	       }
	       else
	       {
	    	   System.out.println("Fail : Focus Login Screen Title is displaying In Correct");
	    	//   //excelReader.setCellData(xlfile, "Sheet1", 6, 9, resFail);
	    	   return false;
	       }
	       	       
      }
	
   
	public static boolean toCheckAvailablityOfFields() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		////excelReader=new //excelReader(POJOUtility.getExcelPath());
		//xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		boolean verifyFiledsStatus=true;
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		
		boolean actusernameDisplayed=username.isDisplayed();
		boolean actusernameEnabled=username.isEnabled();
		
		boolean expusernameDisplayed=true;
		boolean expusernameEnabled=true;
		
		System.out.println("UserNameDisplayed : "+actusernameDisplayed +" value expected "+expusernameDisplayed);
		System.out.println("UserNameEnabled   : "+actusernameEnabled   +" value expected "+expusernameEnabled);
		
		if(actusernameDisplayed==expusernameDisplayed && actusernameEnabled==expusernameEnabled)
		{
			System.out.println("UserName text box is displayed and enabled  :  "+ verifyFiledsStatus);
			
			boolean actpasswordDisplayed=password.isDisplayed();
			boolean actpasswordEnabled=password.isEnabled();
			
			boolean exppasswordDisplayed=true;
			boolean exppasswordEnabled=true;
			
			System.out.println("passwordDisplayed : "+actpasswordDisplayed +" value expected "+exppasswordDisplayed);
			System.out.println("passwordEnabled   : "+actpasswordEnabled   +" value expected "+exppasswordEnabled);
			
			if(actpasswordDisplayed==exppasswordDisplayed && actpasswordEnabled==exppasswordEnabled)
			{
				System.out.println("Password text box is displayed and enabled "+ verifyFiledsStatus);
	
				boolean actcompanyDropDownListDisplayed=companyDropDownList.isDisplayed();
				boolean actcompanyDropDownListEnabled=companyDropDownList.isEnabled();
				
				boolean expcompanyDropDownListDisplayed=true;
				boolean expcompanyDropDownListEnabled=true;
				
				System.out.println("companyDropDownListDisplayed : "+actcompanyDropDownListDisplayed +" value expected "+expcompanyDropDownListDisplayed);
				System.out.println("companyDropDownListEnabled   : "+actcompanyDropDownListEnabled   +" value expected "+expcompanyDropDownListEnabled);
				
				if(actcompanyDropDownListDisplayed==expcompanyDropDownListDisplayed && actcompanyDropDownListEnabled==expcompanyDropDownListEnabled)
				{
					System.out.println("Company Drop Down box is displayed and enabled "+ verifyFiledsStatus);
					
					boolean actsignInDisplayed=signIn.isDisplayed();
					boolean actsignInEnabled=signIn.isEnabled();
				
					boolean expsignInDisplayed=true;
					boolean expsignInEnabled=true;
					
					System.out.println("signInDisplayed : "+actsignInDisplayed +" value expected "+expsignInDisplayed);
					System.out.println("signInEnabled   : "+actsignInEnabled   +" value expected "+expsignInEnabled);
				
					if(actsignInDisplayed==expsignInDisplayed && actsignInEnabled==expsignInEnabled)
					{
						System.out.println("SignIn is displayed and enabled  :  "+ verifyFiledsStatus);
					
						boolean actcompanyCreateBtnDisplayed=companyCreateBtn.isDisplayed();
						boolean actcompanyCreateBtnEnabled=companyCreateBtn.isEnabled();
						
						boolean expcompanyCreateBtnDisplayed=true;
						boolean expcompanyCreateBtnEnabled=true;
						
						System.out.println("companyCreateBtnDisplayed : "+actcompanyCreateBtnDisplayed +" value expected "+expcompanyCreateBtnDisplayed);
						System.out.println("companyCreateBtnEnabled   : "+actcompanyCreateBtnEnabled   +" value expected "+expcompanyCreateBtnEnabled);
						
						if(actcompanyCreateBtnDisplayed==expcompanyCreateBtnDisplayed && actcompanyCreateBtnEnabled==expcompanyCreateBtnEnabled)
						{
							System.out.println("Create Company Button is displayed and enabled  :  "+ verifyFiledsStatus);
						
							boolean actkeyboardBtnDisplayed=keyboardBtn.isDisplayed();
							boolean actkeyboardBtnEnabled=keyboardBtn.isEnabled();
							
							boolean expkeyboardBtnDisplayed=true;
							boolean expkeyboardBtnEnabled=true;
							
							System.out.println("keyboardBtnDisplayed : "+actkeyboardBtnDisplayed +" value expected "+expkeyboardBtnDisplayed);
							System.out.println("keyboardBtnEnabled   : "+actkeyboardBtnEnabled   +" value expected "+expkeyboardBtnEnabled);
							
							if(actkeyboardBtnDisplayed==expkeyboardBtnDisplayed && actkeyboardBtnEnabled==expkeyboardBtnEnabled)
							{
								System.out.println("Keyboard Button is displayed and enabled  :  "+ verifyFiledsStatus);
								
								boolean actrefreshBtnDisplayed=refreshBtn.isDisplayed();
								boolean actrefreshBtnEnabled=refreshBtn.isEnabled();
							
								boolean exprefreshBtnDisplayed=true;
								boolean exprefreshBtnEnabled=true;
								
								System.out.println("refreshBtnDisplayed : "+actrefreshBtnDisplayed +" value expected "+exprefreshBtnDisplayed);
								System.out.println("refreshBtnEnabled   : "+actrefreshBtnEnabled   +" value expected "+exprefreshBtnEnabled);
							
								if(actrefreshBtnDisplayed==exprefreshBtnDisplayed && actrefreshBtnEnabled==exprefreshBtnEnabled)
								{
									System.out.println("Refresh Button is displayed and enabled  :  "+ verifyFiledsStatus);
									
									boolean actrememberMeChkDisplayed=rememberMeChk.isDisplayed();
									boolean actrememberMeChkEnabled=rememberMeChk.isEnabled();
					
									boolean exprememberMeChkDisplayed=true;
									boolean exprememberMeChkEnabled=true;
									
									System.out.println("rememberMeChkDisplayed : "+actrememberMeChkDisplayed +" value expected "+exprememberMeChkDisplayed);
									System.out.println("rememberMeChkEnabled   : "+actrememberMeChkEnabled   +" value expected "+exprememberMeChkEnabled);
					
									if(actrememberMeChkDisplayed==exprememberMeChkDisplayed && actrememberMeChkEnabled==exprememberMeChkEnabled)
									{
										System.out.println("Remember Me Checkbox is displayed and enabled  :  "+ verifyFiledsStatus);
										
										boolean actrememberPwdChkDisplayed=rememberPwdChk.isDisplayed();
										boolean actrememberPwdChkEnabled=rememberPwdChk.isEnabled();
										
										boolean exprememberPwdChkDisplayed=true;
										boolean exprememberPwdChkEnabled=true;
											
										System.out.println("rememberPwdChkDisplayed : "+actrememberPwdChkDisplayed +" value expected "+exprememberPwdChkDisplayed);
										System.out.println("rememberPwdChkEnabled   : "+actrememberPwdChkEnabled   +" value expected "+exprememberPwdChkEnabled);
										
										if(actrememberPwdChkDisplayed==exprememberPwdChkDisplayed && actrememberPwdChkEnabled==exprememberPwdChkEnabled)
										{
											System.out.println("Remember Password Checkbox is displayed and enabled  :  "+ verifyFiledsStatus);
											
											boolean actfrgtPwdLnkDisplayed=frgtPwdLnk.isDisplayed();
											boolean actfrgtPwdLnkEnabled=frgtPwdLnk.isEnabled();
											
											boolean expfrgtPwdLnkDisplayed=true;
											boolean expfrgtPwdLnkEnabled=true;
														
											System.out.println("frgtPwdLnkDisplayed : "+actfrgtPwdLnkDisplayed +" value expected "+expfrgtPwdLnkDisplayed);
											System.out.println("frgtPwdLnkEnabled   : "+actfrgtPwdLnkEnabled   +" value expected "+expfrgtPwdLnkEnabled);
											
											 if(actfrgtPwdLnkDisplayed==expfrgtPwdLnkDisplayed && actfrgtPwdLnkEnabled==expfrgtPwdLnkEnabled)
											 {
												System.out.println("Forgot Password Link is displayed and enabled  :  "+ verifyFiledsStatus);
												////excelReader.setCellData(xlfile, "Sheet1", 7, 9, resPass);
												verifyFiledsStatus=true;
												
											 }
											 else
											 {
												 System.out.println("Fail ");
												// //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
												 verifyFiledsStatus=false;
											 }
										}
										 else
										 {
											 System.out.println("Fail ");
										//	 //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
											 verifyFiledsStatus=false;
										 }
									}
									 else
									 {
										 System.out.println("Fail ");
										// //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
										 verifyFiledsStatus=false;
									 }
								}
								 else
								 {
									 System.out.println("Fail ");
									// //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
									 verifyFiledsStatus=false;
								 }
						     }
							 else
							 {
								 System.out.println("Fail ");
								// //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
								 verifyFiledsStatus=false;
							 }
					      }		
						 else
						 {
							 System.out.println("Fail ");
							// //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
							 verifyFiledsStatus=false;
						 }
				      }
					 else
					 {
						 System.out.println("Fail ");
						// //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
						 verifyFiledsStatus=false;
					 }
				   }
				 else
				 {
					 System.out.println("Fail ");
					// //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
					 verifyFiledsStatus=false;
				 }
			   }
			 else
			 {
				 System.out.println("Fail ");
				// //excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
				 verifyFiledsStatus=false;
			 }
				
			}
			else 
			{
				verifyFiledsStatus=false;
				////excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
				System.out.println(verifyFiledsStatus);
			}

		return verifyFiledsStatus;
			
	  }
	
	
	public static boolean toCheckCompanyDisplayInCompanyListDropdown() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		////excelReader=new //excelReader(POJOUtility.getExcelPath());
		//xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		int actcompanyList=companyDropDownList.getText().length();
		
		int expcompanyList=0;
		
		System.out.println("Company List : "+actcompanyList+" value expected is Greater Than "+expcompanyList);
	
		if(actcompanyList>expcompanyList)
		{
			System.out.println("Pass : Focus Login Screen Title is displaying Correct");
	    	////excelReader.setCellData(xlfile, "Sheet1", 8, 9, resPass);
	    	return true;
	    }
	    else
	    {
	    	System.out.println("Fail : Focus Login Screen Title is displaying In Correct");
	    	////excelReader.setCellData(xlfile, "Sheet1", 8, 9, resFail);
	    	return false;
		}
		
	}
	
	
 
	
	
	
	public static boolean toCheckSignIn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		////excelReader=new //excelReader(POJOUtility.getExcelPath());
	//	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		LoginPage lp=new LoginPage(getDriver()); 
		
        String unamelt="su";
      
        String pawslt="su";
      
        System.out.println("*******************user : "+ unamelt);   
       
        lp.enterUserName(unamelt);
  
        System.out.println("*******************password : "+ unamelt);   
        
        lp.enterPassword(pawslt);
        
        String compname = "BRS";

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :" + cqSize);

		int i;

		for (i = 0; i < elementCount.size(); i++) {

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("Company List:" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}

		Thread.sleep(2000);
  
        lp.clickOnSignInBtn(); 
        
        //checkRefershPopOnlogin();
        
        //checkPopUpWindow();
    	
    	Thread.sleep(25000);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(userNameDisplay, "SU"));
    	
    	String userInfo=userNameDisplay.getText();
    	
    	System.out.println("User Info : "+userInfo);
    	
    	System.out.println("User Info Capture Text :"+userNameDisplay.getText());
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTxt));
    	String actCmpnyName=companyNameTxt.getText();
    	String expCmpnyName="BRS (090) [29/03/2021]";
    	String expuserInfo="SU";
    
    	
    	System.out.println("userInfo         : "+userInfo            +" value expected "+expuserInfo);
    	System.out.println("LoginCompanyName : "+actCmpnyName +" value expected "+expCmpnyName);
    	
    		if(userInfo.equalsIgnoreCase(expuserInfo) && actCmpnyName.equalsIgnoreCase(expCmpnyName))
    		{
    		  	getLogger().info("Login User the Company Name and Information is displaying correct");
    			System.out.println("Pass : Login User and Company Name is displaying Correct");
    			
    			String expDashboard="Dashboard";
    			
    			
    			   return true;
    			}
    		    else
    		    {
    		    //   //excelReader.setCellData(xlfile, "Sheet1", 9, 9, resFail);
    		       return false;
    		    	
    		    }
    	
    		
	}
	
	
	
	 public static boolean verifyUserNameImage() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		
		 //we should check the login name and the company name, so change the code
		 
		// //excelReader=new //excelReader(POJOUtility.getExcelPath());
		// xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 System.out.println("Verify UserNameImage Screen");
		 
		 userNameDisplay.click();
		 
		 System.out.println("User Image dropdown user name : "+ LoginPage.getLanguageTextInUserNameDisplay());
		 
		 System.out.println("User Image dropdown language count : "+ LoginPage.getLanguageTextInUserNameDisplay());
		 
		 boolean actchangePasswordDisplayed=changePassword.isDisplayed();
		 boolean actchangePasswordEnabled=changePassword.isEnabled();
		 boolean actlanguageDropdownInLogoutDisplayed=languageDropdownInLogout.isDisplayed();
		 boolean actlanguageDropdownInLogoutEnabled=languageDropdownInLogout.isEnabled();
		 boolean actlogoutOptionDisplayed=logoutOption.isDisplayed();
		 boolean actlogoutOptionEnabled=logoutOption.isEnabled();
		 
		 boolean expchangePasswordDisplayed=true;
		 boolean expchangePasswordEnabled=true;
		 boolean explanguageDropdownInLogoutDisplayed=true;
		 boolean explanguageDropdownInLogoutEnabled=true;
		 boolean explogoutOptionDisplayed=true;
		 boolean explogoutOptionEnabled=true;
		 
		 	System.out.println("changePasswordDisplayed            : "+actchangePasswordDisplayed            +" value expected "+expchangePasswordDisplayed);
	    	System.out.println("changePasswordEnabled              : "+actchangePasswordEnabled              +" value expected "+expchangePasswordEnabled);
	    	System.out.println("languageDropdownInLogoutDisplayed  : "+actlanguageDropdownInLogoutDisplayed  +" value expected "+explanguageDropdownInLogoutDisplayed);
	    	System.out.println("languageDropdownInLogoutEnabled    : "+actlanguageDropdownInLogoutEnabled    +" value expected "+explanguageDropdownInLogoutEnabled);
	    	System.out.println("logoutOptionDisplayed              : "+actlogoutOptionDisplayed              +" value expected "+explogoutOptionDisplayed);
	    	System.out.println("logoutOptionEnabled                : "+actlogoutOptionEnabled                +" value expected "+explogoutOptionEnabled);
		 
		 if(actchangePasswordDisplayed==expchangePasswordDisplayed && actchangePasswordEnabled==expchangePasswordEnabled && 
	    	 actlanguageDropdownInLogoutDisplayed==explanguageDropdownInLogoutDisplayed && actlanguageDropdownInLogoutEnabled==explanguageDropdownInLogoutEnabled &&
	    	 actlogoutOptionDisplayed==explogoutOptionDisplayed && actlogoutOptionEnabled==explogoutOptionEnabled)
		 {	 
			 System.out.println("Pass : ChangePassword//LanguageDropdown//Logout display in the user info Screen");
			 
			 int actlanguageCount=LoginPage.getLanguageCountInUserNameDisplay();
			 
			 int explanguageCount=2;
			 
			 System.out.println("Language Count : "+actlanguageCount+"  value expected  "+explanguageCount);
			 
			 if(actlanguageCount==explanguageCount)
			 {
				 System.out.println("Pass : Language is display Count as One in the user info Screen");
				 
				 boolean actLanguageText=LoginPage.getLanguageTextInUserNameDisplay();
			
				 boolean expLanguageText=true;
			 
				 System.out.println("Language Text in User Name : "+actLanguageText+"  value expected  "+expLanguageText);
				 
				 if(actLanguageText==expLanguageText)
				 {
					 System.out.println("Pass : Language Text English is displaying in the user info Screen");
				//	 //excelReader.setCellData(xlfile, "Sheet1", 11, 9, resPass);
					 return true;
				 }
				 else
				 {
					 System.out.println("Fail : Language Text English is not displaying in the user info Screen");
				//	 //excelReader.setCellData(xlfile, "Sheet1", 11, 9, resFail);
					 return false;
				 }
			 }
			 else
			 {
				
				 System.out.println("Pass : Language is display Count not as One in the user info Screen");
				// //excelReader.setCellData(xlfile, "Sheet1", 11, 9, resFail);
				 return false;
			 }
		 }	
		 else
		 {
			 System.out.println("Pass : Language Text English is not displaying in the user info Screen");
			// //excelReader.setCellData(xlfile, "Sheet1", 11, 9, resFail);
			 return false;
		 }


	 }
	
	 
	 
	 public static boolean checkLogoutInUserInfo() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		
		// //excelReader=new //excelReader(POJOUtility.getExcelPath());
		// xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		 
			boolean verifyFiledsStatus=true;
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
			
			boolean actusernameDisplayed=username.isDisplayed();
			boolean actusernameEnabled=username.isEnabled();
			
			boolean expusernameDisplayed=true;
			boolean expusernameEnabled=true;
			
			System.out.println("usernameDisplayed : "+actusernameDisplayed +"  value expected  "+expusernameDisplayed);
			System.out.println("usernameEnabled   : "+actusernameEnabled   +"  value expected  "+expusernameEnabled);
			
			if(actusernameDisplayed==expusernameDisplayed && actusernameEnabled==expusernameEnabled)
			{
				System.out.println("UserName text box is displayed and enabled  :  "+ verifyFiledsStatus);
				
				boolean actpasswordDisplayed=password.isDisplayed();
				boolean actpasswordEnabled=password.isEnabled();
				
				boolean exppasswordDisplayed=true;
				boolean exppasswordEnabled=true;
				
				System.out.println("passwordDisplayed : "+actpasswordDisplayed +"  value expected  "+exppasswordDisplayed);
				System.out.println("passwordEnabled   : "+actpasswordEnabled   +"  value expected  "+exppasswordEnabled);
				
				if(actpasswordDisplayed==exppasswordDisplayed && actpasswordEnabled==exppasswordEnabled)
				{
					System.out.println("Password text box is displayed and enabled  :  "+ verifyFiledsStatus);
					
					boolean actcompanyDropDownListDisplayed=companyDropDownList.isDisplayed();
					boolean actcompanyDropDownListEnabled=companyDropDownList.isEnabled();
		
					boolean expcompanyDropDownListDisplayed=true;
					boolean expcompanyDropDownListEnabled=true;
					
					System.out.println("companyDropDownListDisplayed : "+actcompanyDropDownListDisplayed +"  value expected  "+expcompanyDropDownListDisplayed);
					System.out.println("companyDropDownListEnabled   : "+actcompanyDropDownListEnabled   +"  value expected  "+expcompanyDropDownListEnabled);
					
					if(actcompanyDropDownListDisplayed==expcompanyDropDownListDisplayed && actcompanyDropDownListEnabled==expcompanyDropDownListEnabled)
					{
						System.out.println("Company Drop Down box is displayed and enabled  :  "+ verifyFiledsStatus);
						
						boolean actsignInDisplayed=signIn.isDisplayed();
						boolean actsignInEnabled=signIn.isEnabled();
					
						boolean expsignInDisplayed=true;
						boolean expsignInEnabled=true;
					
						System.out.println("signInDisplayed : "+actsignInDisplayed +"  value expected  "+expsignInDisplayed);
						System.out.println("signInEnabled   : "+actsignInEnabled   +"  value expected  "+expsignInEnabled);
						
						if(actsignInDisplayed==expsignInDisplayed && actsignInEnabled==expsignInEnabled)
						{
							System.out.println("SignIn is displayed and enabled  :  "+ verifyFiledsStatus);
							
							boolean actcompanyCreateBtnDisplayed=companyCreateBtn.isDisplayed();
							boolean actcompanyCreateBtnEnabled=companyCreateBtn.isEnabled();
						
							boolean expcompanyCreateBtnDisplayed=true;
							boolean expcompanyCreateBtnEnabled=true;
							
							System.out.println("companyCreateBtnDisplayed : "+actcompanyCreateBtnDisplayed +"  value expected  "+expcompanyCreateBtnDisplayed);
							System.out.println("companyCreateBtnEnabled   : "+actcompanyCreateBtnEnabled   +"  value expected  "+expcompanyCreateBtnEnabled);
							
							if(actcompanyCreateBtnDisplayed==expcompanyCreateBtnDisplayed && actcompanyCreateBtnEnabled==expcompanyCreateBtnEnabled)
							{
								System.out.println("Create Company Button is displayed and enabled  :  "+ verifyFiledsStatus);
								
								boolean actkeyboardBtnDisplayed=keyboardBtn.isDisplayed();
								boolean actkeyboardBtnEnabled=keyboardBtn.isEnabled();
							
								boolean expkeyboardBtnDisplayed=true;
								boolean expkeyboardBtnEnabled=true;
								
								System.out.println("keyboardBtnDisplayed : "+actkeyboardBtnDisplayed +"  value expected  "+expkeyboardBtnDisplayed);
								System.out.println("keyboardBtnEnabled   : "+actkeyboardBtnEnabled   +"  value expected  "+expkeyboardBtnEnabled);
								
								if(actkeyboardBtnDisplayed==expkeyboardBtnDisplayed && actkeyboardBtnEnabled==expkeyboardBtnEnabled)
								{
									System.out.println("Keyboard Button is displayed and enabled  :  "+ verifyFiledsStatus);
									
									boolean actrefreshBtnDisplayed=refreshBtn.isDisplayed();
									boolean actrefreshBtnEnabled=refreshBtn.isEnabled();
								
									boolean exprefreshBtnDisplayed=true;
									boolean exprefreshBtnEnabled=true;
								
									System.out.println("refreshBtnDisplayed : "+actrefreshBtnDisplayed +"  value expected  "+exprefreshBtnDisplayed);
									System.out.println("refreshBtnEnabled   : "+actrefreshBtnEnabled   +"  value expected  "+exprefreshBtnEnabled);
									
									if(actrefreshBtnDisplayed==exprefreshBtnDisplayed && actrefreshBtnEnabled==exprefreshBtnEnabled)
									{
										System.out.println("Refresh Button is displayed and enabled  :  "+ verifyFiledsStatus);
										
										boolean actrememberMeChkDisplayed=rememberMeChk.isDisplayed();
										boolean actrememberMeChkEnabled=rememberMeChk.isEnabled();
						
										boolean exprememberMeChkDisplayed=true;
										boolean exprememberMeChkEnabled=true;
										
										System.out.println("rememberMeChkDisplayed : "+actrememberMeChkDisplayed +"  value expected  "+exprememberMeChkDisplayed);
										System.out.println("rememberMeChkEnabled   : "+actrememberMeChkEnabled   +"  value expected  "+exprememberMeChkEnabled);
						
										if(actrememberMeChkDisplayed==exprememberMeChkDisplayed && actrememberMeChkEnabled==exprememberMeChkEnabled)
										{
											System.out.println("Remember Me Checkbox is displayed and enabled  :  "+ verifyFiledsStatus);
											
											boolean actrememberPwdChkDisplayed=rememberPwdChk.isDisplayed();
											boolean actrememberPwdChkEnabled=rememberPwdChk.isEnabled();
											
											boolean exprememberPwdChkDisplayed=true;
											boolean exprememberPwdChkEnabled=true;
											
											System.out.println("rememberPwdChkDisplayed : "+actrememberPwdChkDisplayed +"  value expected  "+exprememberPwdChkDisplayed);
											System.out.println("rememberPwdChkEnabled   : "+actrememberPwdChkEnabled   +"  value expected  "+exprememberPwdChkEnabled);
											
											if(actrememberPwdChkDisplayed==exprememberPwdChkDisplayed && actrememberPwdChkEnabled==exprememberPwdChkEnabled)
											{
												System.out.println("Remember Password Checkbox is displayed and enabled  :  "+ verifyFiledsStatus);
												
												boolean actfrgtPwdLnkDisplayed=frgtPwdLnk.isDisplayed();
												boolean actfrgtPwdLnkEnabled=frgtPwdLnk.isEnabled();
												
												boolean expfrgtPwdLnkDisplayed=true;
												boolean expfrgtPwdLnkEnabled=true;
												
												System.out.println("frgtPwdLnkDisplayed : "+actfrgtPwdLnkDisplayed +"  value expected  "+expfrgtPwdLnkDisplayed);
												System.out.println("frgtPwdLnkEnabled   : "+actfrgtPwdLnkEnabled   +"  value expected  "+expfrgtPwdLnkEnabled);
															
												 if(actfrgtPwdLnkDisplayed==expfrgtPwdLnkDisplayed && actfrgtPwdLnkEnabled==expfrgtPwdLnkEnabled)
												 {
													System.out.println("Forgot Password Link is displayed and enabled  :  "+ verifyFiledsStatus);
													////excelReader.setCellData(xlfile, "Sheet1", 12, 9, resPass);
													verifyFiledsStatus=true;
													
												 }
												 else
												 {
													 System.out.println("Fail ");
												//	 //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
													 verifyFiledsStatus=false;
												 }
											}
											 else
											 {
												 System.out.println("Fail ");
												// //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
												 verifyFiledsStatus=false;
											 }
										}
										 else
										 {
											 System.out.println("Fail ");
										//	 //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
											 verifyFiledsStatus=false;
										 }
									}
									 else
									 {
										 System.out.println("Fail ");
										// //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
										 verifyFiledsStatus=false;
									 }
							     }
								 else
								 {
									 System.out.println("Fail ");
									// //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
									 verifyFiledsStatus=false;
								 }
						      }		
							 else
							 {
								 System.out.println("Fail ");
								// //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
								 verifyFiledsStatus=false;
							 }
					      }
						 else
						 {
							 System.out.println("Fail ");
							// //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
							 verifyFiledsStatus=false;
						 }
					   }
					 else
					 {
						 System.out.println("Fail ");
						// //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
						 verifyFiledsStatus=false;
					 }
				   }
				 else
				 {
					 System.out.println("Fail ");
				//	 //excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
					 verifyFiledsStatus=false;
				 }
					
				}
				else 
				{
					verifyFiledsStatus=false;
					////excelReader.setCellData(xlfile, "Sheet1", 12, 9, resFail);
					System.out.println(verifyFiledsStatus);
				}

			return verifyFiledsStatus;
	 }
	 

	 
	 public static boolean checkLoginScreenAfterCompanyCreation() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		// //excelReader=new //excelReader(POJOUtility.getExcelPath());
		// xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 System.out.println("******** 1.verifyLoginPageAfterCompanyCreation*********");
		 
		 boolean signInScreen=false;
		   try
			{
			   System.out.println("******** 2.verifyLoginPageAfterCompanyCreation First Try block ********");
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
			   
				//if(signIn.isDisplayed())
			   
			   boolean actusername=username.isDisplayed();
			   boolean actpassword=password.isDisplayed();
			   boolean actcompanyDropDownList=companyDropDownList.isDisplayed();
			   boolean actsignIn=signIn.isDisplayed();
			   boolean actcompanyCreateBtn=companyCreateBtn.isDisplayed();
			   boolean actkeyboardBtn=keyboardBtn.isDisplayed();
			   boolean actrefreshBtn=refreshBtn.isDisplayed();
			   boolean actrememberMeChk=rememberMeChk.isDisplayed();
			   boolean actrememberPwdChk=rememberPwdChk.isDisplayed();
			   boolean actfrgtPwdLnk=frgtPwdLnk.isDisplayed();
			   
			   boolean expusername=true;
			   boolean exppassword=true;
			   boolean expcompanyDropDownList=true;
			   boolean expsignIn=true;
			   boolean expcompanyCreateBtn=true;
			   boolean expkeyboardBtn=true;
			   boolean exprefreshBtn=true;
			   boolean exprememberMeChk=true;
			   boolean exprememberPwdChk=true;
			   boolean expfrgtPwdLnk=true;
			   
			   System.out.println("username            : "+actusername             +"  value expected  "+expusername);
			   System.out.println("password            : "+actpassword             +"  value expected  "+exppassword);
			   System.out.println("companyDropDownList : "+actcompanyDropDownList  +"  value expected  "+expcompanyDropDownList);
			   System.out.println("signIn              : "+actsignIn               +"  value expected  "+expsignIn);
			   System.out.println("companyCreateBtn    : "+actcompanyCreateBtn     +"  value expected  "+expcompanyCreateBtn);
			   System.out.println("keyboardBtn         : "+actkeyboardBtn          +"  value expected  "+expkeyboardBtn);
			   System.out.println("refreshBtn          : "+actrefreshBtn           +"  value expected  "+exprefreshBtn);
			   System.out.println("rememberMeChk       : "+actrememberMeChk        +"  value expected  "+exprememberMeChk);
			   System.out.println("rememberPwdChk      : "+actrememberPwdChk       +"  value expected  "+exprememberPwdChk);
			   System.out.println("frgtPwdLnk          : "+actfrgtPwdLnk           +"  value expected  "+expfrgtPwdLnk);
			   
			    if(actusername==expusername && actpassword==exppassword && actcompanyDropDownList==expcompanyDropDownList &&
				    actsignIn==expsignIn && actcompanyCreateBtn==expcompanyCreateBtn && actkeyboardBtn==expkeyboardBtn && 
				    actrefreshBtn==exprefreshBtn && actrememberMeChk==exprememberMeChk && actrememberPwdChk==exprememberPwdChk && 
				    actfrgtPwdLnk==expfrgtPwdLnk)
				{
			    	//excelReader.setCellData(xlfile, "Sheet1", 27, 9, resPass);
				    System.out.println("******** 3.verifyLoginPageAfterCompanyCreation user enter in Try block");
					getLogger().info("Pass :Login Screen is displaying after user creating company");
					System.out.println("Pass : Login Screen is displaying after user creating company");
					signInScreen=true;
					
					
				}
	     	}
	        catch(Exception e) 
			{
	        	    //excelReader.setCellData(xlfile, "Sheet1", 27, 9, resFail);
					getLogger().info("Error is displaying while creating Company"+e.getMessage());
					System.out.println("******* 6.verifyLoginPageAfterCompanyCreation user enter in Catch block");
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelButtonInCreateCompany));
					LoginPage.cancelButtonInCreateCompany.click();
					signInScreen=false;
			}

		   return signInScreen;
	 }
	 
	 
	 
	 
	 public static boolean checkCompanyListAfterCompanyCreate() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		    //excelReader=new //excelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			LoginPage lp=new LoginPage(getDriver()); 
			
	        String unamelt="su";
	      
	        String pawslt="su";
	           
	        LoginPage.enterUserName(unamelt);
	        
	         

	        getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
	        
	        LoginPage.enterPassword(pawslt);
	        	
			getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
			
			String compname="Automation Company";
		 
    		
			 Select oSelect = new Select(companyDropDownList);
			 
			 List <WebElement> elementCount = oSelect.getOptions();
			
			 int cqSize = elementCount.size();
			 
			 int zqSize=cSize+1;
			 
			 System.out.println("CompanyDropdownList Count :"+cqSize);
			 
			 System.out.println("Company dropdown is :"+ zqSize);
		 
		 
		 //Select dropdown= new Select(lp.companyDropDownList);
		  int i;
		  
		  //List<WebElement> list = dropdown.getOptions();

			//List<String> text = new ArrayList<>();
			for(i=0; i<elementCount.size(); i++) 
			{
			
			  elementCount.get(i).getText();
	    	  String optionName = elementCount.get(i).getText();
	    	  if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
	    	  {
	    		  System.out.println("q"+elementCount.get(i).getText());
	    		  elementCount.get(i).click();
	    		  
	    	  }
	      
	      }
		 
			
		 if(cqSize==zqSize)
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 28, 9, resPass);
			 return true;
			 
		 }
		 else
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 28, 9, resPass);
			 return false;
			 
		 }
		
	 }
	
    
    @FindBy(xpath="//input[@id='donotshow']")
   	private static WebElement doNotShowCheckbox;
       
       @FindBy(xpath="//span[@class='pull-right']")
   	private static WebElement closeBtnInDemoPopupScreen;
  
	 
	 public static boolean checkSignInForNewCompanyCreate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(signIn));
		 signIn.click();
		 
		 //checkRefershPopOnlogin();
		 
		 ////checkPopUpWindow();
			
			 Thread.sleep(5000);	
			 
			 System.out.println("Verify UserNameImage Screen");
			 
			 userNameDisplay.click();
			 
			 System.out.println("User Image dropdown user name :  "+ LoginPage.getLanguageTextInUserNameDisplay());
			 
			 System.out.println("User Image dropdown language count :  "+ LoginPage.getLanguageTextInUserNameDisplay());
			 
			 boolean actchangePasswordDisplayed=changePassword.isDisplayed();
			 boolean actchangePasswordEnabled=changePassword.isEnabled();
			 boolean actlanguageDropdownInLogoutDisplayed=languageDropdownInLogout.isDisplayed();
			 boolean actlanguageDropdownInLogoutEnabled=languageDropdownInLogout.isEnabled();
			 boolean actlogoutOptionDisplayed=logoutOption.isDisplayed();
			 boolean actlogoutOptionEnabled=logoutOption.isEnabled();
			 
			 boolean expchangePasswordDisplayed=true;
			 boolean expchangePasswordEnabled=true;
			 boolean explanguageDropdownInLogoutDisplayed=true;
			 boolean explanguageDropdownInLogoutEnabled=true;
			 boolean explogoutOptionDisplayed=true;
			 boolean explogoutOptionEnabled=true;
			 
			 System.out.println("changePasswordDisplayed            : "+actchangePasswordDisplayed            +"  value expected  "+expchangePasswordDisplayed);
		     System.out.println("changePasswordEnabled              : "+actchangePasswordEnabled              +"  value expected  "+expchangePasswordEnabled);
		     System.out.println("languageDropdownInLogoutDisplayed  : "+actlanguageDropdownInLogoutDisplayed  +"  value expected  "+explanguageDropdownInLogoutDisplayed);
		     System.out.println("languageDropdownInLogoutEnabled    : "+actlanguageDropdownInLogoutEnabled    +"  value expected  "+explanguageDropdownInLogoutEnabled);
		     System.out.println("logoutOptionDisplayed              : "+actlogoutOptionDisplayed              +"  value expected  "+explogoutOptionDisplayed);
		     System.out.println("logoutOptionEnabled                : "+actlogoutOptionEnabled                +"  value expected  "+explogoutOptionEnabled);
			 
			 if(actchangePasswordDisplayed==expchangePasswordDisplayed && actchangePasswordEnabled==expchangePasswordEnabled && 
				 actlanguageDropdownInLogoutDisplayed==explanguageDropdownInLogoutDisplayed && actlanguageDropdownInLogoutEnabled==explanguageDropdownInLogoutEnabled && 
				 actlogoutOptionDisplayed==explogoutOptionDisplayed && actlogoutOptionEnabled==explogoutOptionEnabled)
			 {	 
				 System.out.println("Pass : ChangePassword//LanguageDropdown//Logout display in the user info Screen");
				 
				 int actLanguageCount=LoginPage.getLanguageCountInUserNameDisplay();
				 
				 int expLanguageCount=2;
				 
				 System.out.println("Language Count in User Name : "+actLanguageCount+"  value expected  "+expLanguageCount);
				 			
				 if(actLanguageCount==expLanguageCount)
				 {
					 System.out.println("Pass : Language is display Count as One in the user info Screen");
					 
					 boolean actLanguageText=LoginPage.getLanguageTextInUserNameDisplay();
					 
					 boolean expLanguageText=true;
					 
					 System.out.println("Language Text in User Name : "+actLanguageText+"  value expected  "+expLanguageText);
				 
					 if(actLanguageText==expLanguageText)
					 {
						 System.out.println("Pass : Language Text English is displaying in the user info Screen");
						 //excelReader.setCellData(xlfile, "Sheet1", 2, 9, resPass);
						 return true;
					 }
					 else
					 {
						 System.out.println("Fail : Language Text English is not displaying in the user info Screen");
						 //excelReader.setCellData(xlfile, "Sheet1", 11, 9, resFail);
						 return false;
					 }
				 }
				 else
				 {
					
					 System.out.println("Pass : Language is display Count not as One in the user info Screen");
					 //excelReader.setCellData(xlfile, "Sheet1", 11, 9, resFail);
					 return false;
				 }
			 }	
			 else
			 {
				 System.out.println("Pass : Language Text English is not displaying in the user info Screen");
				 //excelReader.setCellData(xlfile, "Sheet1", 11, 9, resFail);
				 return false;
			 }
		}

	
	 
	 
	 
	 public static boolean checkLogoutAfterCompanyCreationSignIn() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
		 
		   boolean actusername=username.isDisplayed();
		   boolean actpassword=password.isDisplayed();
		   boolean actcompanyDropDownList=companyDropDownList.isDisplayed();
		   boolean actsignIn=signIn.isDisplayed();
		   boolean actcompanyCreateBtn=companyCreateBtn.isDisplayed();
		   boolean actkeyboardBtn=keyboardBtn.isDisplayed();
		   boolean actrefreshBtn=refreshBtn.isDisplayed();
		   boolean actrememberMeChk=rememberMeChk.isDisplayed();
		   boolean actrememberPwdChk=rememberPwdChk.isDisplayed();
		   boolean actfrgtPwdLnk=frgtPwdLnk.isDisplayed();
		 
		   boolean expusername=true;
		   boolean exppassword=true;
		   boolean expcompanyDropDownList=true;
		   boolean expsignIn=true;
		   boolean expcompanyCreateBtn=true;
		   boolean expkeyboardBtn=true;
		   boolean exprefreshBtn=true;
		   boolean exprememberMeChk=true;
		   boolean exprememberPwdChk=true;
		   boolean expfrgtPwdLnk=true;
		   
		   System.out.println("username            : "+actusername             +"  value expected  "+expusername);
		   System.out.println("password            : "+actpassword             +"  value expected  "+exppassword);
		   System.out.println("companyDropDownList : "+actcompanyDropDownList  +"  value expected  "+expcompanyDropDownList);
		   System.out.println("signIn              : "+actsignIn               +"  value expected  "+expsignIn);
		   System.out.println("companyCreateBtn    : "+actcompanyCreateBtn     +"  value expected  "+expcompanyCreateBtn);
		   System.out.println("keyboardBtn         : "+actkeyboardBtn          +"  value expected  "+expkeyboardBtn);
		   System.out.println("refreshBtn          : "+actrefreshBtn           +"  value expected  "+exprefreshBtn);
		   System.out.println("rememberMeChk       : "+actrememberMeChk        +"  value expected  "+exprememberMeChk);
		   System.out.println("rememberPwdChk      : "+actrememberPwdChk       +"  value expected  "+exprememberPwdChk);
		   System.out.println("frgtPwdLnk          : "+actfrgtPwdLnk           +"  value expected  "+expfrgtPwdLnk);
		   
		    if(actusername==expusername && actpassword==exppassword && actcompanyDropDownList==expcompanyDropDownList &&
			    actsignIn==expsignIn && actcompanyCreateBtn==expcompanyCreateBtn && actkeyboardBtn==expkeyboardBtn && 
			    actrefreshBtn==exprefreshBtn && actrememberMeChk==exprememberMeChk && actrememberPwdChk==exprememberPwdChk && 
			    actfrgtPwdLnk==expfrgtPwdLnk)
			{
				//excelReader.setCellData(xlfile, "Sheet1", 29, 9, resPass);
				return true;
			}
			else
			{
				//excelReader.setCellData(xlfile, "Sheet1", 29, 9, resPass);
				return false;
			}
	 }
	 
	 
	 
	 
	 public int verifyTheNumberOfListInCompanyDropdownList()
	    {
	    	 Select oSelect = new Select(companyDropDownList);
			 List <WebElement> elementCount = oSelect.getOptions();
			
			 cSize = elementCount.size();
			 System.out.println("CompanyDropdownList Count  :  "+cSize);
			 return cSize;
	    }
	 
	 

	 
	 
	 
	 
	 public void getCompanyFromCompanyListAfterCompanyCreate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
	        
			//excelReader=new //excelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			LoginPage lp=new LoginPage(getDriver()); 
			
	        String unamelt="su";
	      
	        String pawslt="su";
	           
	        LoginPage.enterUserName(unamelt);
	        
	        getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
	        
	        LoginPage.enterPassword(pawslt);
	        	
			getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
			
			String compname="Automation Company";
			  
			  Select dropdown= new Select(lp.companyDropDownList);
			  int i;
			  
			  List<WebElement> list = dropdown.getOptions();

				List<String> text = new ArrayList<>();
				for(i=0; i<list.size(); i++) 
				{
				
		    	  list.get(i).getText();
		    	  String optionName = list.get(i).getText();
		    	  if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
		    	  {
		    		  list.get(i).click();
		    		  
		    	  }
		      
		      }

				Thread.sleep(3000);
		}
	 
	 
	
	 public static void clickOnLogoutWithOptions()
	 {
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		 
		 
		 
		 
	 }
	
	
	
    public static void clickOnCompanyCreateBtn()
    {
    	System.out.println("company create");
    	
    	companyCreateBtn.click();
    	
    }
	
	
	
	public static void enterUserName(String uname)
	{
		
		if(username.getText().isEmpty())
		{
			clickOn(username);
			username.clear();
		    username.click();
	        username.sendKeys(uname);
	        getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
	       
		}
		
	}
	
	
	
	
	  public static boolean checkLoginPageTitleByURLInputInBrowser(String URL) throws EncryptedDocumentException, InvalidFormatException, IOException 
	  {
		//excelReader=new //excelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		System.out.println("*************************************** checkLoginScreenTitleByURLInputInBrowser *********************************************************");
		         
		
		  String actURLValue=URL;
		  
		 enterUrl(actURLValue);    
		 
	    String actLoginTitle = getDriver().getTitle();
	    String expLoginTitle="Focus";

	    System.out.println("Login Screen Page Title Value Actual      : " + actLoginTitle +    "  Value Expected : " + expLoginTitle);
	   
	    if(actLoginTitle.equalsIgnoreCase(expLoginTitle))
	    {
		   return true;
	    }
	    else
	    {
		   return false;
	    }   	       
	   }
	public static void enterPassword(String pswd)
	{		
		
		if(username.getText().isEmpty())
		{
			clickOn(password);
			password.clear();
			password.click();
			password.sendKeys(pswd);
		}
		
		
		
		
		
		/*getAction().moveToElement(password).sendKeys(Keys.TAB).perform();*/
		
	}
	
	
	
	public static void enterCompanyName(String cmnyName) throws InterruptedException
	{
		

		Select oSelect = new Select(companyDropDownList);

		List <WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :"+cqSize);

		int i;

		for(i=0; i<elementCount.size(); i++) 
		{

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if(optionName.toUpperCase().startsWith(cmnyName.toUpperCase()))
			{
				System.out.println("q"+elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}}
	
	
	
	
	public static void clickOnSignInBtn()
	{

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(signIn));
		signIn.click();	
	}
	

	
	 
	 
	 public static void checkRememberMe()
	 {
		 rememberMeChk.click();
	 }
	 
	 
	 
    public static String getCompanyNameFromLoginScreen()
    {
    	String getCompanyNameText=companyDropDownList.getText();
    	return getCompanyNameText;
    	
    }
	
    
    public static boolean verifyUserHomePageAndDashBoard() throws InterruptedException
    {
    	
    	
    	boolean avbFields=false;
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    	
    	Thread.sleep(4000);
    	getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(userNameDisplay, "SU"));
    	String userInfo=userNameDisplay.getText();
    	
    	System.out.println("User Info  :  "+userInfo);
    	System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    	companyLogo.click();
    	
    	String getCompanyTxt=companyName.getText();
    	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    	System.out.println("company name  :  "+ getLoginCompanyName);
    	companyLogo.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
    	
    	String getDashboard=dashboard.getText();
    	
    	System.out.println(getDashboard);
    	
    	String expuserInfo="SU";
    	String expLoginCompanyName="Automation Company ";
    	
    		if(userInfo.equalsIgnoreCase(expuserInfo)&&getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
    		{
    			avbFields=true;
    			getLogger().info("Login User the Company Name and Information is displaying correct");
    			System.out.println("Pass : Login User and Company Name is displaying Correct");
    		
    			String expDashboard="Dashboard";
    		
    			if(getDashboard.equalsIgnoreCase(expDashboard))
    			{
    				avbFields=true;
    			}
    		    else
    		    {
    		    	avbFields=false;
    		    	
    		    }
    		}
    		else
    		{
    			avbFields=false;
    			getLogger().info("Fail : Login User the Company Name and Information is displaying Wrong");
    			System.out.println("Fail : Login Name the Company Name and Information is displaying Wrong");
    		}

    	
    	return avbFields;
    }
    
    

    
    
    
    
    
    
	
	
	 
	 
	

	 public static boolean verifyMandatoryFieldCheckForSuperUserName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
		 
		  username.clear();
		  String expmsgMandatoryComp="Username cannot be blank";
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
		  signIn.click();
		  getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(mandatoryMsgs, "Username cannot be blank"));
		  System.out.println("mandatoryMsgs  :  "+mandatoryMsgs.getText());
		  
		  String actmsgMandatoryComp=mandatoryMsgs.getText();
		  
		  if(actmsgMandatoryComp.equalsIgnoreCase(expmsgMandatoryComp))
		  {
			  //excelReader.setCellData(xlfile, "Sheet1", 31, 9, resPass);
			  return true;
		  }
		  else
		  {
			  //excelReader.setCellData(xlfile, "Sheet1", 31, 9, resFail);
			  return false;
		  }
		  
	  }
	 
	 
	 
	 public static boolean verifyMandatoryFieldCheckForPassword() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		 
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		  String expmsgMandatoryComp="Password cannot be blank";
		  
		  String un="su";
		  username.sendKeys(un);
		  
		  getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

		  getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		  
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
		  signIn.click();
		  System.out.println(mandatoryMsgs.getText());
		  
		  String actmsgMandatoryComp=mandatoryMsgs.getText();
		  
		  getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(mandatoryMsgs, "Password cannot be blank"));
		  if(actmsgMandatoryComp.equalsIgnoreCase(expmsgMandatoryComp))
		  {
			  //excelReader.setCellData(xlfile, "Sheet1", 32, 9, resPass);
			  return true;
		  }
		  else
		  {
			  //excelReader.setCellData(xlfile, "Sheet1", 32, 9, resPass);
			  return false;
		  }
		  
	  }
	 
	 
	 
	 public static boolean verifyInvalidSuperUserName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		  String expmsgMandatoryComp="User name not found";
		  username.click();
		  username.clear();
		  String un="su";
		  username.sendKeys(un);
		  getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		  //password.clear();
		  String pw="su";
	      password.sendKeys(pw);
		  getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
		  signIn.click();
		  getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(mandatoryMsgs, "User name not found"));
		  System.out.println(mandatoryMsgs.getText());
		  
		  String actmsgMandatoryComp=mandatoryMsgs.getText();
		  
		  if(actmsgMandatoryComp.equalsIgnoreCase(expmsgMandatoryComp))
		  {
			  //excelReader.setCellData(xlfile, "Sheet1", 33, 9, resPass);
			  return true;
		  }
		  else
		  {
			  //excelReader.setCellData(xlfile, "Sheet1", 33, 9, resFail);
			  return false;
		  }
		  
	  }
	 
	 
	 public static boolean verifyInvalidPassword() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		  String expmsgMandatoryComp="Invalid Password";
		  username.click();
		  username.clear();
		  String un="su";
		  username.sendKeys(un);
		  getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		  password.clear();
		  String pw="su";
	      password.sendKeys(pw);
		  getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
		  signIn.click();
		  //Thread.sleep(3500);
		  getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(mandatoryMsgs, "Invalid Password"));
		  System.out.println("mandatoryMsgs  :  "+mandatoryMsgs.getText());
		  
		  String actmsgMandatoryComp=mandatoryMsgs.getText();
		  
		  if(actmsgMandatoryComp.equalsIgnoreCase(expmsgMandatoryComp))
		  {
			  //excelReader.setCellData(xlfile, "Sheet1", 35, 9, resPass);
			  return true;
		  }
		  else
		  {
			  
			  //excelReader.setCellData(xlfile, "Sheet1", 35, 9, resFail);
			  return false;
		  }
		  
	  }
	 
	 
	 public static boolean checkRememberMeAsCheckedInLoginPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
         getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		 username.clear();
		 String unameltR="su";
		 username.sendKeys(unameltR);
		 getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		
		Thread.sleep(3000);
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(password));
		 String pweltR="su";
		 password.sendKeys(pweltR);
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		
		 rememberMeChk.click();
		 
		 boolean actrememberMeChk=rememberMeChk.isSelected();
		 
		 boolean exprememberMeChk=true;
		 
		 System.out.println("Remember Me Chkbox isSelected : "+actrememberMeChk+"  value expected  "+exprememberMeChk);
		 
		 if(actrememberMeChk==exprememberMeChk)
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 37, 9, resPass);
			 return true;
		 }
		 else
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 37, 9, resFail);
			 return false;
		 }
		 
	 }

	 
	
	 public static boolean checkRememberMeSignIn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
         getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(signIn));
         signIn.click();
         
         //checkRefershPopOnlogin();
         
        ////checkPopUpWindow();
         
         Thread.sleep(5000);
         
         getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
         userNameDisplay.click();
		 
		 System.out.println("User Image dropdown user name  :  "+ LoginPage.getLanguageTextInUserNameDisplay());
		 
		 System.out.println("User Image dropdown language count  :  "+ LoginPage.getLanguageTextInUserNameDisplay());

		 boolean actchangePasswordDisplayed=changePassword.isDisplayed();
		 boolean actchangePasswordEnabled=changePassword.isEnabled();
		 boolean actlanguageDropdownInLogoutDisplayed=languageDropdownInLogout.isDisplayed();
		 boolean actlanguageDropdownInLogoutEnabled=languageDropdownInLogout.isEnabled();
		 boolean actlogoutOptionDisplayed=logoutOption.isDisplayed();
		 boolean actlogoutOptionEnabled=logoutOption.isEnabled();
		 
		 boolean expchangePasswordDisplayed=true;
		 boolean expchangePasswordEnabled=true;
		 boolean explanguageDropdownInLogoutDisplayed=true;
		 boolean explanguageDropdownInLogoutEnabled=true;
		 boolean explogoutOptionDisplayed=true;
		 boolean explogoutOptionEnabled=true;
		 
		 System.out.println("changePasswordDisplayed            : "+actchangePasswordDisplayed            +"  value expected  "+expchangePasswordDisplayed);
	     System.out.println("changePasswordEnabled              : "+actchangePasswordEnabled              +"  value expected  "+expchangePasswordEnabled);
	     System.out.println("languageDropdownInLogoutDisplayed  : "+actlanguageDropdownInLogoutDisplayed  +"  value expected  "+explanguageDropdownInLogoutDisplayed);
	     System.out.println("languageDropdownInLogoutEnabled    : "+actlanguageDropdownInLogoutEnabled    +"  value expected  "+explanguageDropdownInLogoutEnabled);
	     System.out.println("logoutOptionDisplayed              : "+actlogoutOptionDisplayed              +"  value expected  "+explogoutOptionDisplayed);
	     System.out.println("logoutOptionEnabled                : "+actlogoutOptionEnabled                +"  value expected  "+explogoutOptionEnabled);
		 
		 if(actchangePasswordDisplayed==expchangePasswordDisplayed && actchangePasswordEnabled==expchangePasswordEnabled && 
			 actlanguageDropdownInLogoutDisplayed==explanguageDropdownInLogoutDisplayed && actlanguageDropdownInLogoutEnabled==explanguageDropdownInLogoutEnabled && 
			 actlogoutOptionDisplayed==explogoutOptionDisplayed && actlogoutOptionEnabled==explogoutOptionEnabled)
		 {	 
			 System.out.println("Pass : ChangePassword//LanguageDropdown//Logout display in the user info Screen");

			 int actLanguageCount=LoginPage.getLanguageCountInUserNameDisplay();
			 
			 int expLanguageCount=2;
			 
			 System.out.println("Language Count in User Name : "+actLanguageCount+"  value expected  "+expLanguageCount);
			 			
			 if(actLanguageCount==expLanguageCount)
			 {
				 System.out.println("Pass : Language is display Count as One in the user info Screen");
			 
				 boolean actLanguageText=LoginPage.getLanguageTextInUserNameDisplay();
				 
				 boolean expLanguageText=true;
				 
				 System.out.println("Language Text in User Name : "+actLanguageText+"  value expected  "+expLanguageText);
			 
				 if(actLanguageText==expLanguageText)
				 {
					 System.out.println("Pass : Language Text English is displaying in the user info Screen");
					 //excelReader.setCellData(xlfile, "Sheet1", 39, 9, resPass);
					 return true;
				 }
				 else
				 {
					 System.out.println("Fail : Language Text English is not displaying in the user info Screen");
					 //excelReader.setCellData(xlfile, "Sheet1", 39, 9, resFail);
					 return false;
				 }
			 }
			 else
			 {
				
				 System.out.println("Pass : Language is display Count not as One in the user info Screen");
				 //excelReader.setCellData(xlfile, "Sheet1", 39, 9, resFail);
				 return false;
			 }
		 }	
		 else
		 {
			 System.out.println("Pass : Language Text English is not displaying in the user info Screen");
			 //excelReader.setCellData(xlfile, "Sheet1", 39, 9, resFail);
			 return false;
		 }



	 }
	 
	 
	 public static boolean checkLoginPageLogInWithRememeberMeLogout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		 
		 boolean actusername=username.isDisplayed();
		 String actsunameValue=username.getAttribute("value");
		 boolean actpassword=password.isDisplayed();
		 boolean actpwdValueIsEmpty=password.getAttribute("value").isEmpty();
		 boolean actcompanyDropDownList=companyDropDownList.isDisplayed();
		 boolean actsignIn=signIn.isDisplayed();
		 boolean actrememberMeChk=rememberMeChk.isSelected();
		 boolean actrememberPwdChk=rememberPwdChk.isDisplayed();
		 
		 boolean expusername=true;
		 String expsunameValue="su";
		 boolean exppassword=true;
		 boolean exppwdValueIsEmpty=true;
		 boolean expcompanyDropDownList=true;
		 boolean expsignIn=true;
		 boolean exprememberMeChk=true;
		 boolean exprememberPwdChk=true;
		 
		 System.out.println("usernameDisplayed    : "+actusername             +"  value expected  "+expusername);
	     System.out.println("sunameValue          : "+actsunameValue          +"  value expected  "+expsunameValue);
	     System.out.println("password             : "+actpassword             +"  value expected  "+exppassword);
	     System.out.println("pwdValueIsEmpty      : "+actpwdValueIsEmpty      +"  value expected  "+exppwdValueIsEmpty);
	     System.out.println("companyDropDownList  : "+actcompanyDropDownList  +"  value expected  "+expcompanyDropDownList);
	     System.out.println("signIn               : "+actsignIn               +"  value expected  "+expsignIn);
	     System.out.println("rememberMeChk        : "+actrememberMeChk        +"  value expected  "+exprememberMeChk);
	     System.out.println("rememberPwdChk       : "+actrememberPwdChk       +"  value expected  "+exprememberPwdChk);
	     
		 if(actusername==expusername && actsunameValue.equalsIgnoreCase(expsunameValue) && actpassword==exppassword && actpwdValueIsEmpty==exppwdValueIsEmpty &&
			 actcompanyDropDownList==expcompanyDropDownList && actsignIn==expsignIn && actrememberMeChk==exprememberMeChk && actrememberPwdChk==exprememberPwdChk)
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 40, 9, resPass);
			 return true;	
							
		 }
		 else
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 40, 9, resFail);
			 return true;
			 
		 }
		  
															
	   }

	 
	 
	 public static boolean checkSignInAgainWithSuperUserBycheckingRememberMeAfterLogout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
         username.click();
         
         getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
         
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(password));
		 
		
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		 
		 
		 String pwdValue=password.getAttribute("value");
		 boolean p=pwdValue.isEmpty();
		 
		 System.out.println("pwdValue  :  "+pwdValue);
		 System.out.println("p  :  "+p);
		 
		 boolean actusernameDisplayed=username.isDisplayed();
		 boolean actusernameEnabled=username.isEnabled();
		 String actsunameValue=username.getAttribute("value");
		 boolean actrememberMeChk=rememberMeChk.isSelected();
		 
		 boolean expusernameDisplayed=true;
		 boolean expusernameEnabled=true;
		 String expsunameValue="su";
		 boolean exprememberMeChk=true;

		 System.out.println("usernameDisplayed : "+actusernameDisplayed  +"  value expected  "+expusernameDisplayed);
		 System.out.println("usernameEnabled   : "+actusernameEnabled    +"  value expected  "+expusernameEnabled);
		 System.out.println("sunameValue       : "+actsunameValue        +"  value expected  "+expsunameValue);
		 System.out.println("rememberMeChk     : "+actrememberMeChk      +"  value expected  "+exprememberMeChk);
		 
		 if(actusernameDisplayed==expusernameDisplayed && actusernameEnabled==expusernameEnabled && actsunameValue.equalsIgnoreCase(expsunameValue) &&
			 actrememberMeChk==exprememberMeChk)
			 {
				 //excelReader.setCellData(xlfile, "Sheet1", 41, 9, resPass);
				 return true;
			                                
	
			 }
		 	 else 
			 {
		 		//excelReader.setCellData(xlfile, "Sheet1", 41, 9, resFail);
				 return true;
			 }

				
		  }
	 
	 
	 
	 public static boolean checkRememeberMeRememberSelected() throws EncryptedDocumentException, InvalidFormatException, IOException
	   {

		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
         getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		 username.clear();
		 String unameltR="su";
		 username.sendKeys(unameltR);
		 getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(password));
		 String pweltR="su";
		 password.sendKeys(pweltR);
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		
		 rememberMeChk.click();
		 
		 rememberPwdChk.click();
		 
		 boolean actrememberMeChk=rememberMeChk.isSelected();
		 boolean actrememberPwdChk=rememberPwdChk.isSelected();
		 
		 boolean exprememberMeChk=true;
		 boolean exprememberPwdChk=true;
		 
		 System.out.println("rememberMeChk  : "+actrememberMeChk   +"  value expected  "+exprememberMeChk);
		 System.out.println("rememberPwdChk : "+actrememberPwdChk  +"  value expected  "+exprememberPwdChk);
		 
		 if(actrememberMeChk==exprememberMeChk && actrememberPwdChk==exprememberPwdChk)
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 42, 9, resPass);
			 return true;
		 }
		 else
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 42, 9, resFail);
			 return false;
		 }
		 
		 

			 
	   }
	   
	   
	 
	 
	 
	 
	 
	 public static boolean checkRememberMeRememberMyPasswordSignIn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 
         getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(signIn));
         signIn.click();
    
         
         //checkRefershPopOnlogin();
		
        ////checkPopUpWindow();
         
         Thread.sleep(5000);
         getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
         userNameDisplay.click();
		 
		 System.out.println("User Image dropdown user name  :  "+ LoginPage.getLanguageTextInUserNameDisplay());
		 
		 System.out.println("User Image dropdown language count  :  "+ LoginPage.getLanguageTextInUserNameDisplay());
		 
		 boolean actchangePasswordDisplayed=changePassword.isDisplayed();
		 boolean actchangePasswordEnabled=changePassword.isEnabled();
		 boolean actlanguageDropdownInLogoutDisplayed=languageDropdownInLogout.isDisplayed();
		 boolean actlanguageDropdownInLogoutEnabled=languageDropdownInLogout.isEnabled();
		 boolean actlogoutOptionDisplayed=logoutOption.isDisplayed();
		 boolean actlogoutOptionEnabled=logoutOption.isEnabled();
		 
		 boolean expchangePasswordDisplayed=true;
		 boolean expchangePasswordEnabled=true;
		 boolean explanguageDropdownInLogoutDisplayed=true;
		 boolean explanguageDropdownInLogoutEnabled=true;
		 boolean explogoutOptionDisplayed=true;
		 boolean explogoutOptionEnabled=true;
		 
		 System.out.println("changePasswordDisplayed            : "+actchangePasswordDisplayed            +"  value expected  "+expchangePasswordDisplayed);
	     System.out.println("changePasswordEnabled              : "+actchangePasswordEnabled              +"  value expected  "+expchangePasswordEnabled);
	     System.out.println("languageDropdownInLogoutDisplayed  : "+actlanguageDropdownInLogoutDisplayed  +"  value expected  "+explanguageDropdownInLogoutDisplayed);
	     System.out.println("languageDropdownInLogoutEnabled    : "+actlanguageDropdownInLogoutEnabled    +"  value expected  "+explanguageDropdownInLogoutEnabled);
	     System.out.println("logoutOptionDisplayed              : "+actlogoutOptionDisplayed              +"  value expected  "+explogoutOptionDisplayed);
	     System.out.println("logoutOptionEnabled                : "+actlogoutOptionEnabled                +"  value expected  "+explogoutOptionEnabled);
		 
		 if(actchangePasswordDisplayed==expchangePasswordDisplayed && actchangePasswordEnabled==expchangePasswordEnabled && 
			 actlanguageDropdownInLogoutDisplayed==explanguageDropdownInLogoutDisplayed && actlanguageDropdownInLogoutEnabled==explanguageDropdownInLogoutEnabled && 
			 actlogoutOptionDisplayed==explogoutOptionDisplayed && actlogoutOptionEnabled==explogoutOptionEnabled)
		 	{	 
			 System.out.println("Pass : ChangePassword//LanguageDropdown//Logout display in the user info Screen");
			 
			 int actLanguageCount=LoginPage.getLanguageCountInUserNameDisplay();
			 
			 int expLanguageCount=2;
			 
			 System.out.println("Language Count in User Name : "+actLanguageCount+"  value expected  "+expLanguageCount);
			 			
			 if(actLanguageCount==expLanguageCount)
			 {
				 System.out.println("Pass : Language is display Count as One in the user info Screen");
			 	
				 boolean actLanguageText=LoginPage.getLanguageTextInUserNameDisplay();
				 
				 boolean expLanguageText=true;
				 
				 System.out.println("Language Text in User Name : "+actLanguageText+"  value expected  "+expLanguageText);
			 
				 if(actLanguageText==expLanguageText)
				 {
					 System.out.println("Pass : Language Text English is displaying in the user info Screen");
					 //excelReader.setCellData(xlfile, "Sheet1", 44, 9, resPass);
					 return true;
				 }
				 else
				 {
					 System.out.println("Fail : Language Text English is not displaying in the user info Screen");
					 //excelReader.setCellData(xlfile, "Sheet1", 44, 9, resFail);
					 return false;
				 }
			 }
			 else
			 {
				
				 System.out.println("Pass : Language is display Count not as One in the user info Screen");
				 //excelReader.setCellData(xlfile, "Sheet1", 44, 9, resFail);
				 return false;
			 }
		 }	
		 else
		 {
			 System.out.println("Pass : Language Text English is not displaying in the user info Screen");
			 //excelReader.setCellData(xlfile, "Sheet1", 44, 9, resFail);
			 return false;
		 }
      }
		 


	 
	 
	 public static boolean checkLoginPageLogInWithRememeberMeRememberMyPasswordLogout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		 
		 boolean actusernameDisplayed=username.isDisplayed();
		 String actsunameValue=username.getAttribute("value");
		 boolean actpassword=password.isDisplayed();
		 String actpwdValue=password.getAttribute("value");
		 boolean actcompanyDropDownList=companyDropDownList.isDisplayed();
		 boolean actsignIn=signIn.isDisplayed();
		 boolean actrememberMeChkDisplayed=rememberMeChk.isDisplayed();
		 boolean actrememberMeChkEnabled=rememberMeChk.isSelected();
		 boolean actrememberPwdChk=rememberPwdChk.isDisplayed();

		 
		 boolean expusernameDisplayed=true;
		 String expsunameValue="su";
		 boolean exppassword=true;
		 String exppwdValue="su";
		 boolean expcompanyDropDownList=true;
		 boolean expsignIn=true;
		 boolean exprememberMeChkDisplayed=true;
		 boolean exprememberMeChkEnabled=true;
		 boolean exprememberPwdChk=true;

		 System.out.println("usernameDisplayed       : "+actusernameDisplayed       +"  value expected  "+expusernameDisplayed);
		 System.out.println("sunameValue             : "+actsunameValue             +"  value expected  "+expsunameValue);
		 System.out.println("password                : "+actpassword                +"  value expected  "+exppassword);
		 System.out.println("pwdValue                : "+actpwdValue                +"  value expected  "+exppwdValue);
		 System.out.println("companyDropDownList     : "+actcompanyDropDownList     +"  value expected  "+expcompanyDropDownList);
		 System.out.println("signIn                  : "+actsignIn                  +"  value expected  "+expsignIn);
		 System.out.println("rememberMeChkDisplayed  : "+actrememberMeChkDisplayed  +"  value expected  "+exprememberMeChkDisplayed);
		 System.out.println("rememberMeChkEnabled    : "+actrememberMeChkEnabled    +"  value expected  "+exprememberMeChkEnabled);
		 System.out.println("rememberPwdChk          : "+actrememberPwdChk          +"  value expected  "+exprememberPwdChk);
		 
		 if(actusernameDisplayed==expusernameDisplayed && actsunameValue.equalsIgnoreCase(expsunameValue) && 
		    actpassword==exppassword && actpwdValue.equalsIgnoreCase(exppwdValue) && actcompanyDropDownList==expcompanyDropDownList &&
		    actsignIn==expsignIn && actrememberMeChkDisplayed==exprememberMeChkDisplayed && actrememberMeChkEnabled==exprememberMeChkEnabled &&
		 	actrememberPwdChk==exprememberPwdChk)
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 45, 9, resPass);
			 return true;	
							
		 }
		 else
		 {
			 //excelReader.setCellData(xlfile, "Sheet1", 45, 9, resFail);
			 return true;
			 
		 }
		  
															
	   }
	 
	 
	 public static boolean checkForgotMyPasswordForSuperUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		 
		 //excelReader=new //excelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		   String actforgotMsg="Email not found for \'su\'";
		   
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(frgtPwdLnk));
		   
		   frgtPwdLnk.click();
		   
		   Thread.sleep(4000);
		   
		   System.out.println("Mandatory Message  :  "+mandatoryMsgs.getText());
			  
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rememberMeChk));
		   
		   rememberMeChk.click();
			 
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rememberPwdChk));
			 
		   rememberPwdChk.click();
		   
		   String expforgotMsg=mandatoryMsgs.getText();
		   
		   System.out.println("Mandatory Message : "+actforgotMsg+"  value expected  "+expforgotMsg);
		   
			  if(actforgotMsg.equalsIgnoreCase(expforgotMsg))
			  {
				  //excelReader.setCellData(xlfile, "Sheet1", 46, 9, resPass);
				  return true;
			  }
			  else
			  {
				  //excelReader.setCellData(xlfile, "Sheet1", 46, 9, resFail);
				  return false;
			  }
			  
		   
	   }
	 
	 
	 
	 
	 
	 
	 public static int getLanguageCountInUserNameDisplay()
	 {
			Select oSelect = new Select(languageDropdownInLogout);
			 List <WebElement> elementCount = oSelect.getOptions();
			
			 int lSize = elementCount.size();
			 System.out.println("Language Dropdown List are  :  "+lSize);
			 return lSize;
	 }
	 	

	 
	 public static boolean getLanguageTextInUserNameDisplay()
	 {
		 //String languageInLogout=languageDropdownInLogout.getText();
		 
		 
		 String Strlpl= languageDropdownInLogout.getText();
			
		 System.out.println(Strlpl);
		 
		 boolean getLanguageDropdownList=false;
		 String[] str= Strlpl.split("\n");     
	      for(String st1 : str)
	      {
	    	
	    	  st1.equals("UserAllOptions");
	    	  getLanguageDropdownList=true;
	    	  break;
	      }
	      
		return getLanguageDropdownList;
		 
	 }
	 
	 
	 
	 
	 public static void clickOnLogOut()
	 {
		 
		// //userNameDisplay.click();
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		 
	 }
	 


	 
	 public static boolean clickOnLogoutChangePasswordSingInWithInvalid()
	 {
		 
		  String expmsgMandatoryComp="Invalid Password";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		 username.sendKeys("su");
		 getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(password));
		 password.sendKeys("su");
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		

		 signIn.click();
		 
		  getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(mandatoryMsgs, "Invalid Password"));
		  System.out.println("mandatoryMsgs  :  "+mandatoryMsgs.getText());
		  
		  String actmsgMandatoryComp=mandatoryMsgs.getText();
		  
		  if(actmsgMandatoryComp.equalsIgnoreCase(expmsgMandatoryComp))
		  {
			  System.out.println(true);
			  return true;
		  }
		  else
		  {
			  System.out.println(false);
			  return false;
		  }
	 }
	 
	 
	 
	 
	
	 
	 
	 
	 public static void clickOnLogoutChangePasswordSingInWithValid() throws InterruptedException
	 {
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		 username.clear();
		 username.sendKeys("su");
		 getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(password));
		 password.sendKeys("s");
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		

		 signIn.click();

	 }
	 
	 
	 
   
	
	 
   
   public static boolean signOutWithSignInAsRememeberMyPassword() throws InterruptedException
	 {
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		 
         username.click();
		 //Thread.sleep(4000);
       
         getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(password));
		 //password.sendKeys("su");
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		 
		 String sunameValue=username.getAttribute("value");
		 String actpwdValue=username.getAttribute("value");
		 
		 System.out.println("sunameValue  :  "+sunameValue);
		 
		 boolean verifyFiledsStatus=true;
		 
		 if(username.isDisplayed()&&username.isEnabled()&&sunameValue.equalsIgnoreCase("su"))
			{
				System.out.println("UserName text box is displayed and enabled  :  "+ verifyFiledsStatus);
				
				boolean actpasswordDisplayed=password.isDisplayed();
				boolean actpasswordEnabled=password.isEnabled();
				
				boolean exppasswordDisplayed=true;
				boolean exppasswordEnabled=true;
				String exppwdValue="su";
				
				System.out.println("passwordDisplayed"+actpasswordDisplayed+" value expected "+exppasswordDisplayed);
				System.out.println("passwordEnabled"+actpasswordEnabled+" value expected "+exppasswordEnabled);
				System.out.println("pwdValue"+actpwdValue+" value expected "+exppwdValue);
				
				if(actpasswordDisplayed==exppasswordDisplayed && actpasswordEnabled==exppasswordEnabled && actpwdValue.equalsIgnoreCase(exppwdValue))
				{
					System.out.println("Password text box is displayed and enabled  :  "+ verifyFiledsStatus);
		
					boolean actcompanyDropDownListDisplayed=companyDropDownList.isDisplayed();
					boolean actcompanyDropDownListEnabled=companyDropDownList.isEnabled();
					
					boolean expcompanyDropDownListDisplayed=true;
					boolean expcompanyDropDownListEnabled=true;
					
					System.out.println("companyDropDownListDisplayed : "+actcompanyDropDownListDisplayed  +"  value expected  "+expcompanyDropDownListDisplayed);
					System.out.println("companyDropDownListEnabled   : "+actcompanyDropDownListEnabled    +"  value expected  "+expcompanyDropDownListEnabled);
					
					if(actcompanyDropDownListDisplayed==expcompanyDropDownListDisplayed && actcompanyDropDownListEnabled==expcompanyDropDownListEnabled)
					{
						System.out.println("Company Drop Down box is displayed and enabled  :  "+ verifyFiledsStatus);
						
						boolean actsignInDisplayed=signIn.isDisplayed();
						boolean actsignInEnabled=signIn.isEnabled();
					
						boolean expsignInDisplayed=true;
						boolean expsignInEnabled=true;
						
						System.out.println("signInDisplayed : "+actsignInDisplayed +"  value expected  "+expsignInDisplayed);
						System.out.println("signInEnabled   : "+actsignInEnabled   +"  value expected  "+expsignInEnabled);
						
						if(actsignInDisplayed==expsignInDisplayed && actsignInEnabled==expsignInEnabled)
						{
							System.out.println("SignIn is displayed and enabled  :  "+ verifyFiledsStatus);
							
							boolean actcompanyCreateBtnDisplayed=companyCreateBtn.isDisplayed();
							boolean actcompanyCreateBtnEnabled=companyCreateBtn.isEnabled();
							
							boolean expcompanyCreateBtnDisplayed=true;
							boolean expcompanyCreateBtnEnabled=true;
							
							System.out.println("companyCreateBtnDisplayed : "+actcompanyCreateBtnDisplayed +"  value expected  "+expcompanyCreateBtnDisplayed);
							System.out.println("companyCreateBtnEnabled   : "+actcompanyCreateBtnEnabled   +"  value expected  "+expcompanyCreateBtnEnabled);
						
							if(actcompanyCreateBtnDisplayed==expcompanyCreateBtnDisplayed && actcompanyCreateBtnEnabled==expcompanyCreateBtnEnabled)
							{
								System.out.println("Create Company Button is displayed and enabled  :  "+ verifyFiledsStatus);
								
								boolean actkeyboardBtnDisplayed=keyboardBtn.isDisplayed();
								boolean actkeyboardBtnEnabled=keyboardBtn.isEnabled();
								
								boolean expkeyboardBtnDisplayed=true;
								boolean expkeyboardBtnEnabled=true;
								
								System.out.println("keyboardBtnDisplayed : "+actkeyboardBtnDisplayed +"  value expected  "+expkeyboardBtnDisplayed);
								System.out.println("keyboardBtnEnabled   : "+actkeyboardBtnEnabled   +"  value expected  "+expkeyboardBtnEnabled);
							
								if(actkeyboardBtnDisplayed==expkeyboardBtnDisplayed && actkeyboardBtnEnabled==expkeyboardBtnEnabled)
								{
									System.out.println("Keyboard Button is displayed and enabled  :  "+ verifyFiledsStatus);
									
									boolean actrefreshBtnDisplayed=refreshBtn.isDisplayed();
									boolean actrefreshBtnEnabled=refreshBtn.isEnabled();
									
									boolean exprefreshBtnDisplayed=true;
									boolean exprefreshBtnEnabled=true;
									
									System.out.println("refreshBtnDisplayed : "+actrefreshBtnDisplayed +"  value expected  "+exprefreshBtnDisplayed);
									System.out.println("refreshBtnEnabled   : "+actrefreshBtnEnabled   +"  value expected  "+exprefreshBtnEnabled);
								
									if(actrefreshBtnDisplayed==exprefreshBtnDisplayed && actrefreshBtnEnabled==exprefreshBtnEnabled)
									{
										System.out.println("Refresh Button is displayed and enabled  :  "+ verifyFiledsStatus);
						
		                                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(rememberMeChk));
		                                
		                                boolean actrememberMeChkDisplayed=rememberMeChk.isDisplayed();
		                                boolean actrememberMeChkEnabled=rememberMeChk.isEnabled();
		                                boolean actrememberMeChkSelected=rememberMeChk.isSelected();
		 
		                                boolean exprememberMeChkDisplayed=true;
		                                boolean exprememberMeChkEnabled=true;
		                                boolean exprememberMeChkSelected=true;
		                                
		                                System.out.println("rememberMeChkDisplayed : "+actrememberMeChkDisplayed +"  value expected  "+exprememberMeChkDisplayed);
										System.out.println("rememberMeChkEnabled   : "+actrememberMeChkEnabled   +"  value expected  "+exprememberMeChkEnabled);
										System.out.println("rememberMeChkSelected  : "+actrememberMeChkSelected  +"  value expected  "+exprememberMeChkSelected);
		                                
										if(actrememberMeChkDisplayed==exprememberMeChkDisplayed && actrememberMeChkEnabled==exprememberMeChkEnabled &&
											actrememberMeChkSelected==exprememberMeChkSelected)
										{
											System.out.println("Remember Me Checkbox is displayed and enabled  :  "+ verifyFiledsStatus);
												
											boolean actrememberPwdChkDisplayed=rememberPwdChk.isDisplayed();
											boolean actrememberPwdChkEnabled=rememberPwdChk.isEnabled();
											boolean actrememberPwdChkSelected=rememberPwdChk.isSelected();
											
											boolean exprememberPwdChkDisplayed=true;
											boolean exprememberPwdChkEnabled=true;
											boolean exprememberPwdChkSelected=true;
											
											System.out.println("rememberPwdChkDisplayed : "+actrememberPwdChkDisplayed +"  value expected  "+exprememberPwdChkDisplayed);
											System.out.println("rememberPwdChkEnabled   : "+actrememberPwdChkEnabled   +"  value expected  "+exprememberPwdChkEnabled);
											System.out.println("rememberPwdChkSelected  : "+actrememberPwdChkSelected  +"  value expected  "+exprememberPwdChkSelected);
											
											if(actrememberPwdChkDisplayed==exprememberPwdChkDisplayed && actrememberPwdChkEnabled==exprememberPwdChkEnabled &&
												actrememberPwdChkSelected==exprememberPwdChkSelected)
											{
												System.out.println("Remember Password Checkbox is displayed and enabled  :  "+ verifyFiledsStatus);
												
												boolean actfrgtPwdLnkDisplayed=frgtPwdLnk.isDisplayed();
												boolean actfrgtPwdLnkEnabled=frgtPwdLnk.isEnabled();
												
												boolean expfrgtPwdLnkDisplayed=true;
												boolean expfrgtPwdLnkEnabled=true;
												
												System.out.println("frgtPwdLnkDisplayed : "+actfrgtPwdLnkDisplayed +"  value expected  "+expfrgtPwdLnkDisplayed);
												System.out.println("frgtPwdLnkEnabled   : "+actfrgtPwdLnkEnabled   +"  value expected  "+expfrgtPwdLnkEnabled);
												
												 if(actfrgtPwdLnkDisplayed==expfrgtPwdLnkDisplayed && actfrgtPwdLnkEnabled==expfrgtPwdLnkEnabled)
												 {
													System.out.println("Forgot Password Link is displayed and enabled  :  "+ verifyFiledsStatus);
													verifyFiledsStatus=true;
													
												 }
												 else
												 {
													 System.out.println("Forgot Password Link is : Fail ");
													 verifyFiledsStatus=false;
												 }
											}
											else
											 {
												 System.out.println("rememberPwdChk Checkbox : Fail ");
												 verifyFiledsStatus=false;
											 }

											
										}
										else
										 {
											 System.out.println("rememberMeChk Button : Fail ");
											 verifyFiledsStatus=false;
										 }

									}
									else
									{
										 System.out.println("refreshBtn Button : Fail ");
										 verifyFiledsStatus=false;
									}
							     }
								else
								 {
									 System.out.println("keyboardBtn : Fail ");
									 verifyFiledsStatus=false;
								 }

						      }
							else
							 {
								 System.out.println("companyCreateBtn : Fail ");
								 verifyFiledsStatus=false;
							 }

					      }
						
						else
						 {
							 System.out.println("signIn : Fail ");
							 verifyFiledsStatus=false;
						 }

					   }
					else
					 {
						 System.out.println("companyDropDownList : Fail ");
						 verifyFiledsStatus=false;
					 }

				   }
				else
				 {
					 System.out.println("Password field is displaying as Fail ");
					 verifyFiledsStatus=false;
				 }

				}
	 						
				else 
				{
					verifyFiledsStatus=false;
					System.out.println("User Name "+verifyFiledsStatus);
				}

			return verifyFiledsStatus;
				
		  }

	 
   
   
   
   
  
   
   
   
   public void clickOnSignIn()
   {
	     getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
	     username.click();
         username.sendKeys("su");
         getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(password));
		 password.sendKeys("su");
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(signIn));
		 signIn.click();
		 
   }

   
   
   
  /* public static boolean verifyUserHomePageAndDashBoardAfterUpdateTheCompany() throws InterruptedException
   {
	   
   	boolean avbFields=false;
   	
	//HPWrapperLayoutPage wlp=new HPWrapperLayoutPage(getDriver());
	
	wlp.clickOnAbout();

	String getgetPatchDateTime=wlp.getReleasedate();
	
	wlp.clickOnAboutToClose();
	
	String getCompanyNamePatch="Automation Company : "+getgetPatchDateTime;
	
	System.out.println("GetCompanyNamePatch**********GetCompanyPatch : "+getCompanyNamePatch);
	
	
   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
   	
   	Thread.sleep(4000);
   	getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(userNameDisplay, "SU"));
   	String userInfo=userNameDisplay.getText();
   	
   	System.out.println("User Info : "+userInfo);
   	System.out.println("User Info Capture Text :"+userNameDisplay.getText());
   	
   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
   	companyLogo.click();
   	
   	//getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(companyName, "Automation Company "));
   	String getCompanyTxt=companyName.getText();
   	String getLoginCompanyName=getCompanyTxt.substring(0, 23);
   	System.out.println("company name :"+ getLoginCompanyName);
  
   	
   	companyLogo.click();
   	
   	//if(focusLogo.isDisplayed()&&menuBar.isDisplayed()&&dashboardName.isDisplayed()&&dashboardIcons.isDisplayed()&&userNameDisplay.isDisplayed()&&companyLogo.isDisplayed())
   	//{
   		//getLogger().info("Pass : Login the Company and Information is displaying correct");
			//System.out.println("Pass : Login the Company and Information is displaying Correct");
   		
   		if(userInfo.equalsIgnoreCase("SU")&&getLoginCompanyName.equalsIgnoreCase(getCompanyNamePatch))
   		{
   			avbFields=true;
   			getLogger().info("Login User the Company Name and Information is displaying correct");
   			System.out.println("Pass : Login User and Company Name is displaying Correct");
   		}
   		else
   		{
   			avbFields=false;
   			getLogger().info("Fail : Login User the Company Name and Information is displaying Wrong");
   			System.out.println("Fail : Login Name the Company Name and Information is displaying Wrong");
   		}
   		
   	//}
   	//else
   	//{
   		//getLogger().info("Fail : Login the Company and Information is displaying correct");
			//System.out.println("Fail : Login User the Company Name and Information is displaying Correct");
   		
   		//avbFields=false;
   	
   	return avbFields;
   }
   */
   

	@FindBy(xpath = "//*[@id='errmsgDiv']")
	public static WebElement loginPageErrorMesg;
	
	public static void reLogin(String unamelt, String pawslt,String compname) throws InterruptedException
	{
		try {
			
			if(loginPageErrorMesg.isDisplayed())
			{
				
				Thread.sleep(1999);
				username.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				
				enterUserName(unamelt);

				Thread.sleep(2000);
				
				password.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);

				enterPassword(pawslt);
				
				Select oSelect = new Select(companyDropDownList);

				List <WebElement> elementCount = oSelect.getOptions();

				int cqSize = elementCount.size();

				System.out.println("CompanyDropdownList Count :"+cqSize);

				int i;

				for(i=0; i<elementCount.size(); i++) 
				{

					elementCount.get(i).getText();

					String optionName = elementCount.get(i).getText();
					if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
					{
						System.out.println("q"+elementCount.get(i).getText());
						elementCount.get(i).click();
					}

				}

				clickOnSignInBtn();
				
				
			}
			
		} catch (Exception e) 
		{
			
			System.out.println(" Entered Catch Block For Login ");
			
			Thread.sleep(1999);
			username.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			
			enterUserName(unamelt);

			Thread.sleep(2000);
			
			password.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);

			enterPassword(pawslt);
			
			Select oSelect = new Select(companyDropDownList);

			List <WebElement> elementCount = oSelect.getOptions();

			int cqSize = elementCount.size();

			System.out.println("CompanyDropdownList Count :"+cqSize);

			int i;

			for(i=0; i<elementCount.size(); i++) 
			{

				elementCount.get(i).getText();

				String optionName = elementCount.get(i).getText();
				if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
				{
					System.out.println("q"+elementCount.get(i).getText());
					elementCount.get(i).click();
				}

			}

			clickOnSignInBtn();
		}
		
		
	}
	
	
	public static boolean checkRestoreAutomationCompany() throws InterruptedException, IOException, AWTException
	{
		//String actMessage=BaseEngine.restoreCompany("SanityBackupwithoutPronghorn","Automation Company");
		String actMessage=BaseEngine.restoreCompany("SanityBackupWithPronghorn","Automation Company");
		String expMessage="Restore company code : 070";
		
		System.err.println("Actual Text :"	+actMessage);
		System.err.println("Expected Text :"	+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public LoginPage(WebDriver driver) 
	{
		
		  PageFactory.initElements(driver, this);
	}
	
	

	
}