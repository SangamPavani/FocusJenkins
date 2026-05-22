package com.focus.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.focus.base.BaseEngine;

public class WebElements {
	

	@FindBy(xpath = "//*[@id='id_fconfirm_btn2']")
	public static WebElement popUpOKBtn;
	
	
	@FindBy(xpath = "//*[@id='id_fconfirm_body']/div/div/span")
	public static WebElement popUpTxtArea;
	
	
	
	
	@FindBy(xpath = "//input[@id='id_body_536870916']")
	public static WebElement pvWarehouseTxt;
	
	@FindBy(xpath = "//*[@id='txtsrch-term']")
	public static WebElement accountSearchTextArea;
	
	@FindBy(xpath = "//*[@id='iCurrencyId']")
	public static WebElement localCurrencyComboBox;
	
	
	@FindBy(xpath = "(//*[@id='btnMasterSaveClick'])[1]")
	public static WebElement accountSave2Btn;
	
	
	@FindBy(xpath = "//a[@id='1106']//span[contains(text(),'Department')]")
	public static WebElement departmentMenu;
	
	

	@FindBy(xpath="//input[@id='optAPTag']")
	public static WebElement apTagTxt;
	
	@FindBy(xpath="//*[@id='optARTag']")
	public static WebElement arTagTxt;
	
	@FindBy(xpath = "//*[@id='cbmSearchOnField']")
	public static WebElement billwiseFilterDrpdwn;
	
	@FindBy(xpath = "//*[@id='optFATag']")
	public static WebElement depTypeDrpDwn;
	
	
	
	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-1']")
	public static WebElement sl_Binselect1stRow_2ndColumn;
	
	@FindBy(xpath = "//*[@id='misc_arapNarration']")
	public static WebElement misNarraitionDrpdwn;
	
	@FindBy(xpath = "//*[@id='id_body_16777296']")
	public static WebElement enterRemarksTxt;
	
	

	@FindBy(xpath = "//*[@id='id_header_67108943']")
	public static WebElement salesInvoiceVATNarrTxt;

	@FindBy(xpath = "(//*[@id='30'])[2]")
	public static WebElement RMABtn;

	@FindBy(xpath = "(//*[@id='8'])[2]")
	public static WebElement BinsBtn;

	@FindBy(xpath = "//*[@id='chkEnableBins']//..//span")
	public static WebElement enableBinChkBox;

	@FindBy(xpath = "//*[@id='chkEnableBins']")
	public static WebElement enableBinChkBoxISselected;

	@FindBy(xpath = "//*[@id='btnMasterEdit']")
	public static WebElement itemEditBtn;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[12]")
	public static List<WebElement> itemList;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
	public static List<WebElement> itemListChkBox;

	@FindBy(xpath = "//*[@id='1000']/span")
	public static WebElement homeMasterMenu;

	@FindBy(xpath = "//*[@id='221']/span")
	public static WebElement homeMasterItemMenu;

	@FindBy(xpath = "//*[@id='1105']/span")
	public static WebElement homeMasterItem_ItemMenu;

	@FindBy(xpath = "//*[@title='BatchRMA']//..//input")
	public static WebElement batchRMAItemChkbox;

	@FindBy(xpath = "//*[@title='BINRMA']//..//input")
	public static WebElement binRMAItemChkbox;

	@FindBy(xpath = "//*[@id='btnNew']")
	public static WebElement itemNewBtn;

	@FindBy(xpath = "(//*[@id='btnMasterSaveClick']/i)[1]")
	public static WebElement newGeneralSaveBtn;

	@FindBy(xpath = "(//*[@id='6'])[2]")
	public static WebElement InventoryBtn;

	@FindBy(xpath = "//*[@id='ReservationByBatch']")
	public static WebElement reserveByBatchChkboxIsSelected;

	@FindBy(xpath = "//*[@id='ReservationByBin']")
	public static WebElement reserveByBinChkboxIsSelected;

	@FindBy(xpath = "//*[@id='ReservationByRMA']")
	public static WebElement reserveByRMAChkboxIsSelected;

	@FindBy(xpath = "//*[@id='ReservationByBatch']//..//span")
	public static WebElement reserveByBatchChkbox;

	@FindBy(xpath = "//*[@id='ReservationByBin']//..//span")
	public static WebElement reserveByBinChkbox;

	@FindBy(xpath = "//*[@id='ReservationByRMA']//..//span")
	public static WebElement reserveByRMAChkbox;

	@FindBy(xpath = "//*[@id='IntegrateInventoryWithAccounts']//..//span")
	public static WebElement integrateInventoryWithAccountsChkbox;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr/td[20]")
	public static List<WebElement> entryPageRow20List;

	@FindBy(xpath = "//*[@id='btnAuthorize']")
	public static WebElement userLevelAuthbtn;

	@FindBy(xpath = "//*[@id='id_Reservation_Modal_SalesOrder']/div[2]/div/div[3]/div/ul[4]/li[3]/div/div[2]")
	public static WebElement res_OkBtn;

	@FindBy(xpath = "//li[@id='btnPickQuantity']")
	public static WebElement res_PickBtn;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> masterAccNameList;

	@FindBy(xpath = "//*[@id='Id_BinReservation_FGrid_body']/tr/td")
	public static List<WebElement> binReservationPopGridBody;

	@FindBy(xpath = "//*[@id='Id_BatchBinReservation_FGrid_body']/tr/td")
	public static List<WebElement> batchBinReservationPopGridBody;

	@FindBy(xpath = "//*[@id='Id_BatchReservation_FGrid_body']/tr/td")
	public static List<WebElement> batchReservationPopGridBody;

	@FindBy(xpath = "//*[@id='Id_BinReservation_FGrid_body']/tr/td[5]")
	public static List<WebElement> binReservationPopGridBin;

	@FindBy(xpath = "//*[@id='Id_BinReservation_FGrid_body']/tr/td[3]")
	public static List<WebElement> binReservationPopGridQtyToRelease;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[8]/div/label")
	public static List<WebElement> masterAccChkBoxList;

	@FindBy(xpath = "//*[@id='Id_BatchBinReservation_FGrid_col_1-2']")
	public static WebElement reserveScreen1stROW;

	@FindBy(xpath = "//*[@id='Id_BatchReservation_FGrid_col_1-2']")
	public static WebElement reserveScreenBatchReserv1stROW;
	
	
	@FindBy(xpath = "//*[@id='Id_BinReservation_FGrid_body']/tr/td[3]")
	public static WebElement reserveWithBinRow1;
	
	
	
	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[1]/td[2]/input")
	public static WebElement workFlowRow1ChkBoxCL;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[1]/td")
	public static List<WebElement> workFlowRow1list;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[2]/td")
	public static List<WebElement> workFlowRow2list;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[3]/td")
	public static List<WebElement> workFlowRow3list;

	@FindBy(xpath = "//input[@id='id_body_37']")
	public static WebElement enter_Expirydate;

	@FindBy(xpath = "//*[@id='sName']")
	public static WebElement userLevelNametxt;

	@FindBy(xpath = "//*[@id='chkAPTag']/following-sibling::span")
	public static WebElement maintainAPBtTAGChkbox;

	@FindBy(xpath = "//*[@id='chkAPTag']")
	public static WebElement maintainAPBtTAGChkboxIsSelected;

	@FindBy(xpath = "//*[@id='APaccountssettings']/button")
	public static WebElement maintainAPBtTAGMinmiseBtn;

	@FindBy(xpath = "//*[@id='ARAccountsSettings']/button")
	public static WebElement maintainARBtTAGMinmiseBtn;

	// Installment TAB

	@FindBy(xpath = "//*[@id='id_li_Adjustment_Tab_Installment']/a/span")
	public static WebElement billrefinstallmentTAB;

	@FindBy(xpath = "//*[@id='cmbRecFrequency']")
	public static WebElement installmntFrequencyDrpdwn;

	@FindBy(xpath = "//*[@id='txtNoOfInstallment']")
	public static WebElement installmnt_NoofInstallmentstextbox;

	@FindBy(xpath = "//*[@id='id_Installment_Grid_row_heading']//th")
	public static List<WebElement> installmentgridheaderlist;

	@FindBy(xpath = "//*[@id='id_Installment_Grid_body']/tr[1]/td")
	public static List<WebElement> installmentgridrow1list;

	@FindBy(xpath = "//*[@id='id_Installment_Grid_body']/tr/td[2]")
	public static List<WebElement> installmentgridDueDateColList;

	@FindBy(xpath = "//*[@id='id_Installment_Grid_body']/tr/td[3]")
	public static List<WebElement> installmentgridTransactionCurrencyColList;

	@FindBy(xpath = "//*[@id='id_Installment_Grid_body']/tr/td[4]")
	public static List<WebElement> installmentgridBaseCurrencyColList;

	@FindBy(xpath = "//*[@id='id_Installment_Grid_body']/tr/td[6]")
	public static List<WebElement> installmentgridAdjustedAmountColList;

	@FindBy(xpath = "//*[@id='chkARTag']/following-sibling::span")
	public static WebElement maintainARBtTAGChkbox;

	@FindBy(xpath = "//*[@id='chkARTag']")
	public static WebElement maintainARBtTAGChkboxIsSelected;
	
	
	
	

	@FindBy(xpath = "//*[@id='sCode']")
	public static WebElement userLevelCodeTxt;

	@FindBy(xpath = "//*[@title='Alerts']")
	public static WebElement userLevelAlertElement;

	@FindBy(xpath = "//*[@id='0']/span")
	public static WebElement alertFirstElement;

	@FindBy(xpath = "(//*[@id='1']/span)[1]")
	public static WebElement alertSecoundElement;

	@FindBy(xpath = "//*[@id='masterChild_1']/a/span")
	public static WebElement alertSecound_ChildElement;

	@FindBy(xpath = "//*[@id='btnProperties']")
	public static WebElement itemPropertiesBtn;
	
	
	@FindBy(xpath = "//*[@title='BR COGS ITEM']//..//input")
	public static WebElement brCogsChkbox;
	
	

	@FindBy(xpath = "//input[@id='chkDontMaintainStockbyBatch']")
	public static WebElement dontMaintainStockByBatchChkboxIsSelected;

	@FindBy(xpath = "//input[@id='chkDontMaintainStockbyBatch']/following-sibling::span")
	public static WebElement dontMaintainStockByBatchChkbox;

	@FindBy(xpath = "//input[@id='chkDontinputBin']/following-sibling::span")
	public static WebElement dontInputBinChkbox;

	@FindBy(xpath = "//input[@id='chkDontinputBin']")
	public static WebElement dontInputBinChkboxIsSelected;

	@FindBy(xpath = "//input[@id='chkDontMaintainStocksByRMA']/following-sibling::span")
	public static WebElement dontMaintainStockByRMAChkbox;

	@FindBy(xpath = "//input[@id='chkDontMaintainStocksByRMA']")
	public static WebElement dontMaintainStockByRMAChkboxIsSelected;

	@FindBy(xpath = "//*[@id='btnPropOk']")
	public static WebElement itemPropertiesOkBtn;

	@FindBy(xpath = "//div[@id='divMasterProperty']/ul/li/span[2]")
	public static WebElement itemPropertiesCancelBtn;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public static WebElement logoutOption;
	

	@FindBy(xpath = "//*[@id='id_BreakUpByTag_Grid_body']/tr[1]/td")
	public static List<WebElement> breakUpDetaisTABRow1List;

	

	@FindBy(xpath = "//a[contains(text(),'SU')]")
	public static WebElement userNameSUDisplay;

	@FindBy(xpath = "//*[@id='ulCompanyDetails_HomePage']/li[1]")
	public static WebElement companyName;

	@FindBy(xpath = "//*[@id='id_footer']/strong")
	public static WebElement dashbordPageFooterFiledTxt;

	@FindBy(xpath = "//button[contains(text(),'Reservation')]")
	public static WebElement reservationexpandBtn;

	@FindBy(xpath = "//button[contains(text(),'Inventory Settings')]")
	public static WebElement voucherInventorySettingexpandBtn;

	@FindBy(xpath = "//*[@id='companyLogo']")
	public static WebElement companyLogo;
	

	@FindBy(xpath="//*[@id='id_search_menu']//input")
	public static WebElement focusMainSearch;
	
	

	@FindBy(xpath = "//div[@id='Layout_Popup']//input[2]")
	public static WebElement noIn;

	@FindBy(xpath = "//input[@id='donotshow']")
	public static WebElement doNotShowCheckbox;

	@FindBy(xpath = "//span[@class='pull-right']")
	public static WebElement closeBtnInDemoPopupScreen;

	@FindBy(xpath = "//*[@id='dashName']")
	public static WebElement dashboard;

	@FindBy(xpath = "//i[@class='icon-font7 icon-import-from-excel']")
	public static WebElement importFromExcelIcon;

	@FindBy(id = "ddlCompany")
	public static WebElement companyDropDownList;

	@FindBy(xpath = "//*[@id='107']")
	public static WebElement editCompanyMenu;

	@FindBy(xpath = "//input[@id='CreatedDate']")
	public static WebElement accountingDate;

	@FindBy(xpath = "//*[@class='icon-ok hiconright2']")
	public static WebElement okButtonInCreateCompany;

	// Company Menu
	@FindBy(xpath = "//*[@id='2']")
	public static WebElement companyMenu;

	// Masters Menu
	@FindBy(xpath = "//*[@id='1000']")
	public static WebElement mastersMenu;

	// Currency Menu
	@FindBy(xpath = "//*[@id='220']")
	public static WebElement currencyMenu;

	@FindBy(xpath = "//*[@id='id_option']")
	public static WebElement baseCurrencyTxt;

	@FindBy(xpath = "//*[@id='EffectiveDate']")
	public static WebElement withEffectiveDateTxt;

	@FindBy(xpath = "//*[@id='EffectiveDate_input_container']/div[1]/i[2]")
	public static WebElement ExchangeDate_calBtn;

	@FindBy(xpath = "//*[@id='ExchangeTable_col_1-1']")
	public static WebElement gridcurrencyName1Txt;

	@FindBy(xpath = "//*[@id='ExchangeTable_col_1-3']")
	public static WebElement row1RateTxt;

	@FindBy(xpath = "//*[@id='ExchangeTable_col_2-3']")
	public static WebElement row2RateTxt;

	@FindBy(xpath = "//*[@id='ExchangeTable_Rate']")
	public static WebElement exchangeRateEnterRate;

	@FindBy(xpath = "(//i[@class='icon-save hiconright2'])[1]")
	public static WebElement exchangeRateSaveBtn;

	@FindBy(xpath = "//*[@class='icon-close hiconright2']")
	public static WebElement exchangeRateCloseBtn;

	@FindBy(xpath = "//*[@id='ExchangeTable_body']/tr[1]/td")
	public static List<WebElement> exchangeRateGridRow1List;

	@FindBy(xpath = "//*[@id='ExchangeTable_body']/tr[2]/td")
	public static List<WebElement> exchangeRateGridRow2List;

	@FindBy(xpath = "//span[contains(text(),'Currency Master')]")
	public static WebElement currencyMasterMenu;

	@FindBy(xpath = "//*[@id='71']")
	public static WebElement exchangeRateMenu;

	@FindBy(xpath = "//input[@id='uploadFile']")
	public static WebElement importFilePathTxt;

	// input[@id='uploadBtn']
	@FindBy(xpath = "//*[@id='formLoadDataExcel']/div/div/span/span")
	public static WebElement importFileBtn;

	@FindBy(xpath = "//div[contains(text(),'Exchange Rate Fields')]")
	public static WebElement importFileExchangeRateColumnName;

	@FindBy(xpath = "//div[contains(text(),'External Fields')]")
	public static WebElement importFileExternalFieldsColumnName;

	@FindBy(xpath = "//td[@id='ImportTable_col_1-1']")
	public static WebElement importFileBaseCurrencyName;

	@FindBy(xpath = "//td[@id='ImportTable_col_1-2']")
	public static WebElement importFileBaseCurrencyValue;

	@FindBy(xpath = "//td[@id='ImportTable_col_2-1']")
	public static WebElement importFileEffectiveDateName;

	@FindBy(xpath = "//td[@id='ImportTable_col_2-2']")
	public static WebElement importFileEffectiveDateValue;

	@FindBy(xpath = "//td[@id='ImportTable_col_3-1']")
	public static WebElement importFileDefinedCurrencyName;

	@FindBy(xpath = "//td[@id='ImportTable_col_3-2']")
	public static WebElement importFileDefinedCurrencyValue;

	@FindBy(xpath = "//td[@id='ImportTable_col_4-1']")
	public static WebElement importFileRateName;

	@FindBy(xpath = "//td[@id='ImportTable_col_4-2']")
	public static WebElement importFileRateValue;

	@FindBy(xpath = "//td[@id='ImportTable_col_5-1']")
	public static WebElement importFileSelectedCurrencyName;

	@FindBy(xpath = "//td[@id='ImportTable_col_5-2']")
	public static WebElement importFileSelectedCurrencyValue;

	@FindBy(xpath = "//button[@id='btnImportData']")
	public static WebElement importDataBtn;

	@FindBy(xpath = "//button[@id='btnCloseImport']")
	public static WebElement closeImportBtn;

	@FindBy(xpath = "//span[contains(text(),'Select Sheet')]")
	public static WebElement selectSheetName;

	@FindBy(xpath = "//select[@id='ImportTable_ExternalField']")
	public static WebElement selectTextFromComboBox;

	@FindBy(xpath = "//div[@id='popUpdataSheetName']")
	public static WebElement sheetNamesDisplayArea;

	@FindBy(xpath = "//li[@class='clsSheetName']")
	public static WebElement SmokeMasters;
	
	@FindBy(xpath = "//li[text()='Sheet1']")
	public static WebElement Sheet1;

	@FindBy(xpath = "//li[text()='Sheet2']")
	public static WebElement Sheet2;
	
	@FindBy(xpath = "//li[text()='Sheet3']")
	public static WebElement Sheet3;
	
	@FindBy(xpath = "//li[text()='Sheet4']")
	public static WebElement Sheet4;
	
	@FindBy(xpath = "//li[text()='MisMatch']")
	public static WebElement SheetMisMatch;
	
	@FindBy(xpath = "//li[text()='Currency']")
	public static WebElement SheetCurrency;
	
	@FindBy(xpath = "//button[@id='btnSheetOk']")
	public static WebElement sheetOkBtn;

	@FindBy(xpath = "//button[@id='btnSheetClose']")
	public static WebElement sheetCloseBtn;

	@FindBy(xpath = "//input[@id='HeaderChkBox']")
	public static WebElement homePageHeaderSelectAllChkbox;

	@FindBy(xpath = "//input[@id='HeaderChkBox']")
	public static WebElement voucherHeaderChkbox;

	// Copy document Screen Elements

	@FindBy(xpath = "//*[@id='id_copydoc_grid2_tbody']/tr/td[3]")
	public static List<WebElement> cdPop_AccountList;

	@FindBy(xpath = "//*[@id='id_TranTable']/tbody/tr")
	public static List<WebElement> homePageVoucherList;

	@FindBy(xpath = "//*[@id='id_copydoc_grid2_tbody']/tr/td[4]")
	public static List<WebElement> cdPop_DebitList;

	@FindBy(xpath = "//*[@id='id_copydoc_grid2_tbody']/tr/td[5]")
	public static List<WebElement> cdPop_CreditList;

	@FindBy(xpath = "//*[@id='id_copydoc_grid2_tbody']/tr/td[6]")
	public static List<WebElement> cdPop_ReferenceList;

	@FindBy(xpath = "//div[@class='col-xs-11 font-4']")
	public static WebElement getErrorOnClickCheckBoxInCopyDocument;

	@FindBy(xpath = "//button[@class='btn Fbutton fixed']")
	public static WebElement getErrorInCopyDocumentCloseBtn;

	@FindBy(xpath = "//input[@id='optCopyDocType']")
	public static WebElement cd_vouchertypeTxt;

	@FindBy(xpath = "//select[@id='id_searchoncolumns']")
	public static WebElement cd_searchOnDropdown1;

	@FindBy(xpath = "//div[5]//select[1]")
	public static WebElement cd_searchOnDropdown2;

	@FindBy(xpath = "//input[@id='srch_doc']")
	public static WebElement cd_searchTxt;

	@FindBy(xpath = "//input[@id='id_transaction_entry_copydocument_refresh']")
	public static WebElement cd_refreshBtn;

	@FindBy(xpath = "//input[@id='id_transaction_entry_copydocument_filter_togglebutton']")
	public static WebElement cd_filterBtn;

	@FindBy(xpath = "//input[@id='copydoc_HeaderChkBox']")
	public static WebElement cd_HeaderChkBox;

	@FindBy(xpath = "//tbody/tr[@id='tr_copydoc_voucher_1']/td[1]/input[1]")
	public static WebElement cd_FirstChkBox;

	@FindBy(xpath = "//input[@id='id_chkclubsimilartxn']")
	public static WebElement cd_clubsimilarTransChkBox;

	@FindBy(xpath = "//div[@class='col-xs-2 no_padding_left_right']//input[@class='Fbutton']")
	public static WebElement cd_SelectallBtn;

	@FindBy(xpath = "//button[@id='btn_firstPage']")
	public static WebElement cd_firstBtn;

	@FindBy(xpath = "//button[@id='btn_previousPage']")
	public static WebElement cd_PreviousBtn;

	@FindBy(xpath = "//button[@id='input_pagenumber']")
	public static WebElement cd_PageNo;

	@FindBy(xpath = "//button[@id='btn_nextPage']")
	public static WebElement cd_nextBtn;

	@FindBy(xpath = "//button[@id='btn_lastPage']")
	public static WebElement cd_LastBtn;

	@FindBy(xpath = "//input[@id='id_transaction_copydoc_ok']")
	public static WebElement cd_OkBtn;

	@FindBy(xpath = "//input[@id='id_transaction_copydoc_cancel']")
	public static WebElement cd_CancelBtn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]/span")
	public static WebElement entryPageSecoundRowNumberBtn;

	@FindBy(xpath = "//*[@id='id_TranTable']/tbody/tr/td[3]")
	public static List<WebElement> paymnetsPendingBillsSlNoList;

	@FindBy(xpath = "//*[@id='id_header_268435459_table_body']/tr/td[2]")
	public static List<WebElement> openingBalDepartmentList;

	@FindBy(xpath = "//*[@id='id_transactionentry_save']")
	public static WebElement openingBalancesSaveBtn;

	@FindBy(xpath = "//*[@id='2028']")
	public static WebElement openingBalancesVoucher;

	@FindBy(xpath = "//*[@id='2023']")
	public static WebElement financialsTransactionsJournalsMenu;

	@FindBy(xpath = "//body/section[@id='mainDiv']/div[@id='id_focus8_wrapper_default']/div[1]/section[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public static WebElement entryPageplusIcon;

	@FindBy(xpath = "//label[@id='id_transactionentry_footer_panel_summary_value_18']")
	public static WebElement vocFooterdebitAmount;

	@FindBy(xpath = "//label[@id='id_transactionentry_footer_panel_summary_value_19']")
	public static WebElement vocFooterCreditAmount;

	@FindBy(xpath = "//td[@id='AccountAmount_col_5-1']")
	public static WebElement billRefGridVendorRow5;

	@FindBy(xpath = "//td[@id='AccountAmount_col_6-1']")
	public static WebElement billRefGridVendorRow6;

	@FindBy(xpath = "//*[@id='61']")
	public static WebElement financialsTransactionMenu;

	@FindBy(xpath = "//*[@id='2001']")
	public static WebElement cashAndBankMenu;

	@FindBy(xpath = "//*[@id='2002']")
	public static WebElement receiptsVoucher;

	@FindBy(xpath = "//*[@id='2003']")
	public static WebElement paymentsVoucher;

	@FindBy(xpath = "//span[contains(text(),'Payments VAT')]")
	public static WebElement paymentsVATVoucher;

	@FindBy(xpath = "//span[contains(text(),'Receipts VAT')]")
	public static WebElement recepitsVATVoucher;

	@FindBy(xpath = "//span[contains(text(),'JV VAT View')]")
	public static WebElement JVVATViewVoucher;

	@FindBy(xpath = "//a[text()='Pending Bills']")
	public static WebElement pendingBillsBtn;

	@FindBy(xpath = "//tr[@id='trRender_1']//td//input")
	public static WebElement pendingBillsGridRow1Chkbox;

	@FindBy(xpath = "//tr[@id='trRender_2']//td//input")
	public static WebElement pendingBillsGridRow2Chkbox;

	@FindBy(xpath = "//tr[@id='trRender_3']//td//input")
	public static WebElement pendingBillsGridRow3Chkbox;
	
	@FindBy(xpath = "//tr[@id='trRender_4']//td//input")
	public static WebElement pendingBillsGridRow4Chkbox;
	
	@FindBy(xpath = "//tr[@id='trRender_5']//td//input")
	public static WebElement pendingBillsGridRow5Chkbox;
	
	@FindBy(xpath = "//tr[@id='trRender_6']//td//input")
	public static WebElement pendingBillsGridRow6Chkbox;

	@FindBy(xpath = "//*[@id='navigationtab2']")
	public static WebElement settingMiscellaneousTab;

	@FindBy(xpath = "//*[@id='navigationtab14']")
	public static WebElement settingInventoryTab;

	@FindBy(xpath = "//*[@id='panelsStayOpen-headingten']/button")
	public static WebElement mis_ARAPExpandBtn;

	@FindBy(xpath = "//*[@id='misc_arapchkInputPaymentTerms']//following-sibling::span")
	public static WebElement arap_PaymentTermsChkbox;

	@FindBy(xpath = "//*[@id='misc_arapchkInputPaymentTerms']")
	public static WebElement arap_PaymentTermsChkboxIsSelected;

	@FindBy(xpath = "//*[@id='panelsStayOpen-headingten']/button")
	public static WebElement settingARAPExpansionBtn;

	@FindBy(xpath = "//button[contains(text(),'AR/AP')]")
	public static WebElement settingARAPExpand;

	@FindBy(xpath = "//select[@id='misc_CurrencyAddCurrencyIn']")
	public static WebElement miscAddCurrencyDropdown;

	@FindBy(xpath = "//input[@id='misc_currencyInputExchangeRate']")
	public static WebElement miscInputExchangeRateChkboxIsSelected;

	@FindBy(xpath = "//input[@id='misc_currencyInputExchangeRate']/following-sibling::span")
	public static WebElement miscInputExchangeRateChkbox;

	@FindBy(xpath = "//input[@id='misc_currencyInputLocalExchangeRate']/following-sibling::span")
	public static WebElement miscInputLocalExchangeRateChkbox;

	@FindBy(xpath = "//input[@id='misc_currencyInputLocalExchangeRate']")
	public static WebElement miscInputLocalExchangeRateChkboxIsSelected;

	@FindBy(xpath = "//*[@id='misc_CurrencyAddCurrencyIn']")
	public static WebElement addCurrencyDrpdwn;

	@FindBy(xpath = "//select[@id='misc_arapDueDate']")
	public static WebElement miscDueDateDropdown;

	@FindBy(xpath = "//*[@id='updateButton']/i")
	public static WebElement settingUpdateIcon;

	@FindBy(xpath = "//*[@id='btnCustomizeClose']/i")
	public static WebElement settingCloseIcon;

	@FindBy(xpath = "//label[contains(text(),'Copy Document')]")
	public static WebElement CopyDocumentBtn;

	@FindBy(xpath = "//label[contains(text(),'Copy to Clipboard')]")
	public static WebElement copytoClipboardBtn;

	@FindBy(xpath = "//*[@id='Cogs']/button")
	public static WebElement SettingMenuinvCogsExpandBtn;

	@FindBy(xpath = "//*[@id='doc_TagsTable_col_1-2']")
	public static WebElement Postion1;

	@FindBy(xpath = "//*[@id='doc_TagsTable_col_2-2']")
	public static WebElement Postion2;

	@FindBy(xpath = "//*[@id='doc_TagsPositionDropDown']")
	public static WebElement enter_Postion;

	@FindBy(xpath = "//*[@id='doc_TagsTable_col_1-3']")
	public static WebElement dependency1;

	@FindBy(xpath = "//*[@id='txtbox_doc_TagsDepedencyDropDown']")
	public static WebElement dependencyTxt1;

	@FindBy(xpath = "//*[@id='tabsHideDiv']/a/span")
	public static WebElement config_Settings_ToggleButton;

	@FindBy(xpath = "//a[@id='navigationtab4']")
	public static WebElement viewBtn;

	@FindBy(xpath = "//*[@id='views_existingViews']")
	public static WebElement existingViewTxt;

	@FindBy(xpath = "(//*[@title='Move Up'])[2]")
	public static WebElement viewTABMoveUpButton;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[12]")
	public static List<WebElement> masterItemFcaptionList;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
	public static List<WebElement> masterItemChkBoxList;

	@FindBy(xpath = "//input[@id='id_body_536870915']")
	public static WebElement enterBodyDepTxt;

	@FindBy(xpath = "//input[@id='txtOnAccount']")
	public static WebElement billRefAccountTxt;

	@FindBy(xpath = "//*[@id='id_li_Adjustment_Tab_BreakUpByTag']/a/span")
	public static WebElement billBreakUpByTagTab;

	@FindBy(xpath = "//*[@id='id_BreakUpByTag_Grid_body']/tr[1]/td")
	public static List<WebElement> breakUpTagRow1List;

	@FindBy(xpath = "//*[@id='id_BreakUpByTag_Grid_body']/tr[2]/td")
	public static List<WebElement> breakUpTagRow2List;

	@FindBy(xpath = "//*[@id='spnSaveView']/i")
	public static WebElement viewTABSave;

	@FindBy(xpath = "//*[@id='views_User_1']")
	public static WebElement viewTABSUUserChkbox;

	@FindBy(xpath = "//*[@id='views_User_1']/following-sibling::span")
	public static WebElement viewTABSUUserChkboxSelected;

	@FindBy(xpath = "//*[@id='views_FieldsTable']/tbody/tr/td[3]")
	public static List<WebElement> viewFiledNameList;

	@FindBy(xpath = "//*[@id='panelsStayOpen-headingTwo']/button")

	public static WebElement viewTabLoginBtn;

	@FindBy(xpath = "//*[@id='documentCustomizationUL']")
	public static WebElement settingCong_DocCustimeBtn;

	@FindBy(xpath = "(//*[@id='3334'])[2]")
	public static WebElement doccus_SalesInvoiceVATBtn;

	@FindBy(xpath = "//*[@id='27']/span")
	public static WebElement restore;

	@FindBy(xpath = "//*[@id='HeaderChkBox']")
	public static WebElement entryPageHeaderChkbox;

	@FindBy(xpath = "//button[@class='btn Fbutton']")
	public static WebElement folderpathExpandBtn;
	

	@FindBy(xpath = "//*[@id='id_header_32']")
	public static WebElement salesHeaderPaymentTerms;
	
	
	@FindBy(xpath = "//table[@class='CommonReportTable']//tr//td[15]")
	public static List<WebElement> custReportPaymentTermsCol;
	
	
	
	
	
	@FindBy(xpath = "//*[@id='id_rc_search_inputbox']")
	public static WebElement report_CusSearchTxt;
	
	
	@FindBy(xpath = "//table[@class='CommonReportTable']//tr//td[7]")
	public static List<WebElement> SalesReg_ReportPaymentTermsCol;
	

	

	@FindBy(xpath = "//*[@class='icon-restore hiconright2']")
	public static WebElement restoreCompanyBtn;

	@FindBy(xpath = "//button[text()='Yes']")
	public static WebElement overRideYesBtn;

	@FindBy(xpath = "//button[text()='No']")
	public static WebElement overRideNoBtn;

	@FindBy(xpath = "//button[@class='Fbutton'][contains(text(),'Cancel')]")
	public static WebElement overRideCancelBtn;

	@FindBy(xpath = "//label[contains(text(),'Paste from Clipboard')]")
	public static WebElement pastefromClipboardBtn;

	@FindBy(xpath = "//label[contains(text(),'Raise a Cheque Return')]")
	public static WebElement raiseaChequeReturnBtn;

	@FindBy(xpath = "//label[contains(text(),'Add To Stock')]")
	public static WebElement addToStockBtn;

	@FindBy(xpath = "//label[contains(text(),'Posting details')]")
	public static WebElement postingDetailsBtn;

	@FindBy(xpath = "//label[contains(text(),'Reverse Entry')]")
	public static WebElement reversEntryBtn;

	@FindBy(xpath = "//label[contains(text(),'Export to XML')]")
	public static WebElement exporttoXMLBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_settings']/label")
	public static WebElement settingBtn;

	@FindBy(xpath = "//label[contains(text(),'Calculator')]")
	public static WebElement calculatorBtn;

	@FindBy(xpath = "//label[contains(text(),'Auto Load')]")
	public static WebElement autoLoadBtn;
	
	@FindBy(xpath="//*[@class='icon-settings hiconright2']")
	public static WebElement homePageSettingbtn;
	

	@FindBy(xpath = "//tbody[@id='id_body_536870916_table_body']/tr/td[2]")
	public static List<WebElement> pvWarehouseTxtList;

	

	@FindBy(xpath = "//*[@id='misc_chkdntPostCogs']")
	public static WebElement doNotPostCogsChkBox;
	

	@FindBy(xpath = "//input[@id='id_header_268435460']")
	public static WebElement warehouseHeaderTxt;
	
	
	// Vouchers Home Page Ribbon Control
	@FindBy(xpath = "//*[@id='id_transaction_homescreen_new']/i")
	public static WebElement newBtn;
	
	@FindBy(xpath = "//*[@id='2013']/span")
	public static WebElement MaterialReceiptsNotesBtn;

	@FindBy(xpath = "//*[@id='id_transaction_homescreen_edit']/i")
	public static WebElement editBtn;

	@FindBy(xpath = "//*[@id='btnTransHomePrint]/i")
	public static WebElement printBtn;

	@FindBy(xpath = "//*[@id='id_transaction_homescreen_Delete']/i")
	public static WebElement deleteBtn;

	@FindBy(xpath = "//span[@class='icon-authorize icon-font6']")
	public static WebElement authorizeBtn;

	@FindBy(xpath = "//*[@id='id_transaction_homescreen_Suspend']/i")
	public static WebElement suspendBtn;

	@FindBy(xpath = "//span[@class='icon-reject2 icon-font6']")
	public static WebElement rejectBtn;

	@FindBy(xpath = "//span[@class='icon-cheque icon-font6']")
	public static WebElement chequeReturnBtn;

	@FindBy(xpath = "//span[@class='icon-printbarcode icon-font6']")
	public static WebElement printBarCodeBtn;

	@FindBy(xpath = "//*[@id='id_transaction_homescreen_convert']/i")
	public static WebElement convertBtn;

	@FindBy(xpath = "//span[@class='icon-export icon-font6']")
	public static WebElement exportToXMLBtn;

	@FindBy(xpath = "(//*[@class='icon-settings hiconright2'])[1]")
	public static WebElement settingsBtn;
	
	
	@FindBy(xpath = "//*[@onclick='TRANSACTION_MAINSCREEN.onSettings_Click(this, event);']")
	public static WebElement homePage_SettingBtn;
	
	
	
	
	

	@FindBy(xpath = "//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")
	public static WebElement homeCloseBtn;

	@FindBy(xpath = "//button[contains(text(),'Last')]")
	public static WebElement reportLastButton;

	// Vouchers Home Page Options

	@FindBy(xpath = "//*[@id='id_transaction_viewcontainer']/li[1]/a")
	public static WebElement allVouchersOption;

	@FindBy(xpath = "//a[@class='transaction_viewname_anchor font-5']")
	public static WebElement pendingBillsOption;

	@FindBy(xpath = "//input[@id='SelectDefaultView']")
	public static WebElement selectDefaultViewChkBox;

	@FindBy(xpath = "//span[@class='icon-sorting icon-font6 toolbar_button_image theme_button_color dropdown-toggle']")
	public static WebElement sortingBtn;

	@FindBy(xpath = "//div[@id='btnCreateView']//span[@class='icon-new icon-font6']")
	public static WebElement createViewBtn;

	@FindBy(xpath = "//*[@id='panelsStayOpen-headingOne']/button")
	public static WebElement homepagePannelOpenBtn;

	@FindBy(xpath = "//*[@id='btnCustomize']/i")
	public static WebElement customizeBtn;

	@FindBy(xpath = "//span[@class='icon-filter icon-font6']")
	public static WebElement filterBtn;
	
	
	@FindBy(xpath = "//*[@class='icon-filter hiconright2']")
	public static WebElement homePage_filterBtn;
	
	@FindBy(xpath = "//*[@id='a']")
	public static WebElement homePage_filterBtn_CusBtn;
	
	@FindBy(xpath = "(//input[@placeholder='Select Field'])[2]")
	public static WebElement homePage_filterBtn_SelectFiledTxt;
	
	
	@FindBy(xpath = "//a[text()='Date']")
	public static WebElement dateField;
	
	
	@FindBy(xpath = "(//*[@class='custom-select borderr'])[8]")
	public static WebElement selectFieldDrpdwn;
	
	
	@FindBy(xpath = "(//*[@class='custom-select borderr'])[9]")
	public static WebElement selectField_CompareDrpdwn;
	
	
	@FindBy(xpath = "//*[@id='advancefilter_date_2057_2']")
	public static WebElement filter_DateTxt;
	
	
	@FindBy(xpath = "//*[@id='btnSetFilterVal']")
	public static WebElement filter_OkBtn;
	
	

	/*
	 * @FindBy(xpath="//span[@id='reportRefresh']") public static WebElement
	 * refreshBtn;
	 */

	@FindBy(xpath = "//span[@id='transhomeRefresh']")
	public static WebElement refreshBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-export']")
	public static WebElement exportBtn;

	// Options Button (Display Option)
	@FindBy(xpath = "//span[@id='transOptions']")
	public static WebElement optionsBtn;

	@FindBy(xpath = "//a[contains(text(),'Auto Adjust Width')]")
	public static WebElement autoAdjustWidthBtn;

	@FindBy(xpath = "//a[contains(text(),'Fit To Screen')]")
	public static WebElement fitToScreenBtn;

	@FindBy(xpath = "//a[contains(text(),'Normal')]")
	public static WebElement normalBtn;

	// Voucher Home Page Grid Header Columns
	@FindBy(xpath = "//input[@id='HeaderChkBox']")
	public static WebElement grid_HeaderChkBox;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[3]")
	public static WebElement grid_Header_Date;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[4]")
	public static WebElement grid_Header_VoucherNumber;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[5]")
	public static WebElement grid_Header_CreatedBy;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[6]")
	public static WebElement grid_Header_ModifiedBy;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[7]")
	public static WebElement grid_Header_CreatedDate;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[8]")
	public static WebElement grid_Header_ModifiedDate;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[9]")
	public static WebElement grid_Header_CreatedTime;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[10]")
	public static WebElement grid_Header_ModifiedTime;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[11]")
	public static WebElement grid_Header_Suspended;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[12]")
	public static WebElement grid_Header_Cancelled;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[13]")
	public static WebElement grid_Header_AuthorizationStatus;

	// Grid Voucher DetailsBtn
	@FindBy(xpath = "//tr[@id='trRender_1']//i[@class='icon-info icon-font7']")
	public static WebElement grid_VoucherDetailsBtn1;

	@FindBy(xpath = "//tr[@id='trRender_2']//i[@class='icon-info icon-font7']")
	public static WebElement grid_VoucherDetailsBtn2;

	// Grid CheckBox 1 And 2

	@FindBy(xpath = "//tr[@id='trRender_1']//td//input")
	public static WebElement grid_ChkBox1;

	@FindBy(xpath = "//tr[@id='trRender_2']//td//input")
	public static WebElement grid_ChkBox2;

	@FindBy(xpath = "//tr[@id='trRender_3']//td//input")
	public static WebElement grid_ChkBox3;

	@FindBy(xpath = "//tr[@id='trRender_4']//td//input")
	public static WebElement grid_ChkBox4;

	// Vouchers Home Page Footer
	@FindBy(xpath = "//div[@id='tblFooterReportRender']//input[@id='txtSearch']")
	public static WebElement searchField;

	@FindBy(xpath = "//button[@id='frstPage']")
	public static WebElement firstPageBtn;

	@FindBy(xpath = "//button[@id='id_previousPage']")
	public static WebElement previousPageBtn;

	@FindBy(xpath = "//button[@id='id_pagenumber']")
	public static WebElement currentPageNo;

	@FindBy(xpath = "//button[@id='id_nextPage']")
	public static WebElement nextPageBtn;

	@FindBy(xpath = "//button[@id='lstPage']")
	public static WebElement lastPageBtn;

	// Vouchers Entry Page Ribbon Control Options
	@FindBy(xpath = "//span[@class='icon-scroll icon-font6']")
	public static WebElement freeFlowBtn;

	@FindBy(xpath = "//span[@class='icon-header icon-font6']")
	public static WebElement jumpToHeaderSectionBtn;

	@FindBy(xpath = "//span[@class='icon-panel icon-font6']")
	public static WebElement jumpToBodySectionBtn;

	@FindBy(xpath = "//span[@class='icon-footer icon-font6']")
	public static WebElement jumpToFooterBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_new']")
	public static WebElement new_newBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_save']/a/span")
	public static WebElement saveBtn;

	@FindBy(xpath = "//i[@class='icon-arrow hiconright']")
	public static WebElement userNameDisplay;

	@FindBy(xpath = "//div[@class='adminprofile']")
	public static WebElement userNameDisplayLogo;

	@FindBy(xpath = "//*[@id='companyLogo']/parent::a/following-sibling::ul/li[1]")
	public static WebElement companyNameX;

	@FindBy(xpath = "//*[@id='ulCompanyDetails_HomePage']/li[1]")
	public static WebElement companyDetailsTxt;

	@FindBy(xpath = "(//*[@id='id_footer']//strong)[2]")
	public static WebElement companyDetailsTxt1;
	
	@FindBy(xpath = "//*[@id='2033']")
	public static WebElement inventoryTransactionsStocksMenu;

	@FindBy(xpath = "//*[@id='trRender_1']/td[2]/input")
	public static WebElement homePageRow1Chkbox;

	@FindBy(xpath = "//*[@id='id_transactionentry_previous']/a/span")
	public static WebElement previousBtn;

	@FindBy(xpath = "//*[@class='icon icon-new Accpluseicon text-collapsed']")
	public static WebElement documnetInfoExpBtn;
	
	@FindBy(xpath = "//*[@class='icon-collapse btn-img theme_color-inverse transentry-float-button']")
	public static WebElement infoExpandBtn;
	
	
	@FindBy(xpath = "//*[@class='icon icon-new Accpluseicon text-collapsed']")
	public static WebElement plusExpandBtn;
	
	
	
	

	
	
	
	@FindBy(xpath = "//*[@class='Mcard']/div[2]/table/tbody/tr/td[3]")
	public static List<WebElement> documnetInfoValuesList;

	@FindBy(xpath = "//*[@class='Mcard']/div[2]/table/tbody/tr/td[1]")
	public static List<WebElement> documnetInfoStatusList;

	@FindBy(xpath = "//*[@id='id_transactionentry_next']/a/span")
	public static WebElement nextBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_print']")
	public static WebElement new_PrintBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_suspend']")
	public static WebElement new_SuspendBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_close']/a/span")
	public static WebElement new_CloseBtn;
	
	@FindBy(xpath = "//*[@id='DonotUseRealTimeRate']//following-sibling::span")
	public static WebElement DonotUseRealTimeRateChkBOx;
	
	@FindBy(xpath = "//*[@id='DonotUseRealTimeRate']")
	public static WebElement donotUseRealTimeRateChkBOxIsSelected;
	

	@FindBy(xpath = "//*[@id='id_transactionentry_delete']/a/span")
	public static WebElement new_DeleteBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_more']/span")
	public static WebElement toggleBtn;

	@FindBy(xpath = "//*[contains(text(),'Raise a Cheque Return')]")
	public static WebElement RaiseAChequeReturnBtn;

	@FindBy(xpath = "//label[contains(text(),'Copy Document')]")
	public static WebElement copyDocumentOption;

	@FindBy(xpath = "//label[contains(text(),'Copy to Clipboard')]")
	public static WebElement copyToClipBoardOption;

	@FindBy(xpath = "//label[contains(text(),'Paste from Clipboard')]")
	public static WebElement pasteFromClipBoardOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_raisechequereturn']")
	public static WebElement raiseCheckReturnOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_addtostock']")
	public static WebElement addToStockOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_markconvert']")
	public static WebElement markConvertedOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_bominput']")
	public static WebElement bOMinputOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_autoallocate']")
	public static WebElement autoAllocateOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_reverseentry']")
	public static WebElement reverseEntryOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_printbarcode']")
	public static WebElement printBarCodeOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetails']")
	public static WebElement postingDetailsOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_exporttoxml']")
	public static WebElement exportToXMLOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_settings']")
	public static WebElement settingsOption;

	// Voucher Entry Page Header Fields
	@FindBy(xpath = "//input[@id='id_header_1']")
	public static WebElement documentNumberTxt;

	@FindBy(xpath = "//*[@id='id_header_1_input_image']/span")
	public static WebElement documentNumberdropdown_ExpansionBtn;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement dateTxt;

	@FindBy(xpath = "//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	public static WebElement dateTxt_CalenderBtn;

	@FindBy(xpath = "//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	public static WebElement calender_TodayBtn;

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement caskBankAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
	public static WebElement caskBankAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
	public static WebElement cashBankAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
	public static WebElement cashBankAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
	public static WebElement cashBankAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
	public static WebElement cashBankAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
	public static WebElement cashBankAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	public static WebElement cashBankAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
	public static WebElement cashBankAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement cashBankAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement cashBankAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
	public static WebElement cashBankAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement cashBankAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement cashBankAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_268435459']")
	public static WebElement departmentTxt;
	
	@FindBy(xpath = "//input[@id='id_header_268435460']")
	public static WebElement warehouse1Txt;

	@FindBy(xpath = "//input[@id='id_header_268435470']")
	public static WebElement PDRVATPlaceOfSupplyTXt;

	@FindBy(xpath = "//input[@id='id_header_67108951']")
	public static WebElement chequeNoTxt;

	@FindBy(xpath = "//*[@id='id_header_268435459_input_image']/span")
	public static WebElement department_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_268435459_input_settings']/span")
	public static WebElement department_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_268435459_customize_popup_container']")
	public static WebElement department_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_268435459_customize_popup_footer']//input[1]")
	public static WebElement department_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_268435459_customize_popup_standardfields_list']")
	public static WebElement department_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_268435459_customize_popup_standardfields_header']")
	public static WebElement department_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_268435459_customize_popup_standardfields_alignment']")
	public static WebElement department_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_268435459_customize_popup_standardfields_width']")
	public static WebElement department_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement department_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement department_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_268435459_search_container']//input[2]")
	public static WebElement department_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement department_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement department_Settings_CancelBtn;

	@FindBy(xpath = "//*[@id='id_header_6']")
	public static WebElement maturityDateTxt;

	@FindBy(xpath = "//*[@id='id_header_6_input_image']/span']")
	public static WebElement maturityDateTxt_CalenderBtn;

	@FindBy(xpath = "//input[@id='id_header_3']")
	public static WebElement purchaseAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_3_input_image']/span")
	public static WebElement purchaseAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_3_input_settings']/span")
	public static WebElement purchaseAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_3_customize_popup_container']")
	public static WebElement purchaseAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_3_customize_popup_footer']//input[1]")
	public static WebElement purchaseAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_list']")
	public static WebElement purchaseAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_header']")
	public static WebElement purchaseAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_alignment']")
	public static WebElement purchaseAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_width']")
	public static WebElement purchaseAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement purchaseAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement purchaseAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_3_search_container']//input[2]")
	public static WebElement purchaseAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement purchaseAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement purchaseAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement vendorAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
	public static WebElement vendorAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
	public static WebElement vendorAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
	public static WebElement vendorAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
	public static WebElement vendorAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
	public static WebElement vendorAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
	public static WebElement vendorAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	public static WebElement vendorAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
	public static WebElement vendorAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement vendorAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement vendorAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
	public static WebElement vendorAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement vendorAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement vendorAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_3']")
	public static WebElement salesAccountTxt;

	@FindBy(xpath = "//*[@id='id_body_33554463']")
	public static WebElement salesInvoice_AQ;

	
	
	
	@FindBy(xpath = "//*[@id='id_header_3_input_image']/span")
	public static WebElement salesAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_3_input_settings']/span")
	public static WebElement salesAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_3_customize_popup_container']")
	public static WebElement salesAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_3_customize_popup_footer']//input[1]")
	public static WebElement salesAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_list']")
	public static WebElement salesAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_header']")
	public static WebElement salesAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_alignment']")
	public static WebElement salesAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_width']")
	public static WebElement salesAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement salesAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement salesAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_3_search_container']//input[2]")
	public static WebElement salesAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement salesAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement salesAccount_Settings_CancelBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
	public static WebElement customerAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
	public static WebElement customerAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
	public static WebElement customerAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
	public static WebElement customerAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
	public static WebElement customerAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
	public static WebElement customerAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	public static WebElement customerAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
	public static WebElement customerAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement customerAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement customerAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
	public static WebElement customerAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement customerAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement customerAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_12']")
	public static WebElement accountTxt;

	@FindBy(xpath = "//*[@id='id_header_12_input_image']/span")
	public static WebElement account_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
	public static WebElement account_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
	public static WebElement account_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
	public static WebElement account_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
	public static WebElement account_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
	public static WebElement account_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	public static WebElement account_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
	public static WebElement account_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement account_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement account_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
	public static WebElement account_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement account_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement account_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_31']")
	public static WebElement issuesReceiptsTxt;

	@FindBy(xpath = "//input[@id='id_header_268435460']")
	public static WebElement wareHouseTxt;

	@FindBy(xpath = "//*[@id='id_header_268435460_input_image']/span")
	public static WebElement wareHouse_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_268435460_input_settings']/span")
	public static WebElement wareHouse_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_268435460_customize_popup_container']")
	public static WebElement wareHouse_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_268435460_customize_popup_footer']//input[1]")
	public static WebElement wareHouse_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_268435460_customize_popup_standardfields_list']")
	public static WebElement wareHouse_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_268435460_customize_popup_standardfields_header']")
	public static WebElement wareHouse_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_268435460_customize_popup_standardfields_alignment']")
	public static WebElement wareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_268435460_customize_popup_standardfields_width']")
	public static WebElement wareHouse_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement wareHouse_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement wareHouse_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_268435460_search_container']//input[2]")
	public static WebElement wareHouse_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement wareHouse_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement wareHouse_Settings_CancelBtn;

	@FindBy(xpath = "//span[contains(text(),'sName')]")
	public static WebElement customize_sName;

	@FindBy(xpath = "//span[@class='vcenter'][contains(text(),'Code')]")
	public static WebElement customize_sCode;

	@FindBy(xpath = "//span[contains(text(),'Alias')]")
	public static WebElement customize_Alias;

	@FindBy(xpath = "//span[@class='vcenter'][contains(text(),'Group')]")
	public static WebElement customize_bGroup;

	@FindBy(xpath = "//span[contains(@class,'vcenter')][contains(text(),'Balance')]")
	public static WebElement customize_Balance;

	@FindBy(xpath = "//input[@id='id_header_67108920']")
	public static WebElement appropriateBasedOndropdown;

	@FindBy(xpath = "//input[@id='id_header_67108921']")
	public static WebElement additionalValueTxt;

	@FindBy(xpath = "//input[@id='id_header_21']")
	public static WebElement raiseReceiptsChkBox;

	@FindBy(xpath = "//input[@id='id_header_67108865']")
	public static WebElement receipts_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108868']")
	public static WebElement payments_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108927']")
	public static WebElement paymentsVAT_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108947']")
	public static WebElement recepitsVAT_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108948']")
	public static WebElement recepitsVAT_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108956']")
	public static WebElement JVVAT_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108871']")
	public static WebElement pettyCash_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108874']")
	public static WebElement postDatedReceipts_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108968']")
	public static WebElement PDRVAT_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108965']")
	public static WebElement PDPVAT_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_268435470']")
	public static WebElement PDPVAT_JuridictionTxt;

	@FindBy(xpath = "//input[@id='id_header_268435471']")
	public static WebElement PDRVAT_JuridictionTxt;

	@FindBy(xpath = "//input[@id='id_header_67108865']")
	public static WebElement postDatedPayments_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108880']")
	public static WebElement purchaseVouchers_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108881']")
	public static WebElement purchaseReturns_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108884']")
	public static WebElement salesInvoice_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108886']")
	public static WebElement salesOrder_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108928']")
	public static WebElement salesInvoiceNewNarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108885']")
	public static WebElement salesReturns_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108913']")
	public static WebElement cashSales_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108914']")
	public static WebElement hirePurchaseSales_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108890']")
	public static WebElement journalEntries_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108916']")
	public static WebElement forexJV_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108910']")
	public static WebElement interDepartmentalJV_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108888']")
	public static WebElement nonStandardJournalEntries_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108960']")
	public static WebElement debitNotes_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108911']")
	public static WebElement debitNotesLineWise_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108893']")
	public static WebElement creditNotes_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108962']")
	public static WebElement creditNotesVatNarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108912']")
	public static WebElement creditNotesLineWisePayroll_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108894']")
	public static WebElement openingBalance_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108891']")
	public static WebElement fixedAssetDepreciationVoucher_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108909']")
	public static WebElement requestForQuote_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108903']")
	public static WebElement purchasesQuotations_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108882']")
	public static WebElement purchasesOrders_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108882']")
	public static WebElement materialReceiptsNotes_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108904']")
	public static WebElement salesQuotationss_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108887']")
	public static WebElement deliveryNotes_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108917']")
	public static WebElement posSales_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108918']")
	public static WebElement productionOrder_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108886']")
	public static WebElement salesOrders_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108895']")
	public static WebElement shortagesinStock_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108896']")
	public static WebElement excessesinStocks_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108897']")
	public static WebElement stockTransfers_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108898']")
	public static WebElement openingStocks_NarrationTxt;

	@FindBy(xpath = "//*[@id='id_header_67108923']")
	public static WebElement openingStocksNEW_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108908']")
	public static WebElement materialRequisition_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108866']")
	public static WebElement receipts_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108869']")
	public static WebElement payments_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108928']")
	public static WebElement paymentsVAT_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108872']")
	public static WebElement pettyCash_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108875']")
	public static WebElement postDatedReceipts_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108878']")
	public static WebElement postDatedPayments_ChequeNoTxt;

	// Voucher Entry Page Body Fields

	@FindBy(xpath = "//input[@id='id_body_536870916']")
	public static WebElement pvWareHouseTxt;

	@FindBy(xpath = "//td[@id='id_body_536870916_input_image']//span[@class='icon-down-arrow optioncontrol_arrow_margin']")
	public static WebElement pvWareHouse_ExpansionBtn;

	@FindBy(xpath = "//td[@id='id_body_536870916_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	public static WebElement pvWareHouse_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_body_536870916_customize_popup_container']")
	public static WebElement pvWareHouse_Settings_Container;

	@FindBy(xpath = "//div[@id='id_body_536870916_customize_popup_footer']//input[1]")
	public static WebElement pvWareHouse_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_body_536870916_customize_popup_standardfields_list']")
	public static WebElement pvWareHouse_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_body_536870916_customize_popup_standardfields_header']")
	public static WebElement pvWareHouse_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_body_536870916_customize_popup_standardfields_alignment']")
	public static WebElement pvWareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_body_536870916_customize_popup_standardfields_width']")
	public static WebElement pvWareHouse_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement pvWareHouse_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement pvWareHouse_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_body_536870916_search_container']//input[2]")
	public static WebElement pvWareHouse_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	public static WebElement pvWareHouse_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	public static WebElement pvWareHouse_Settings_CancelBtn;

	// Grid Elements
	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	public static WebElement grid_Header_Account;

	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	public static WebElement grid_Header_Item;

	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	public static WebElement grid_Header_DebitAC;

	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_2']")
	public static WebElement grid_Header_CreditAC;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
	public static WebElement firstRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]")
	public static WebElement secondRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]")
	public static WebElement thirdRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[1]")
	public static WebElement fourthRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[1]")
	public static WebElement fifthRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[1]")
	public static WebElement sixthRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[1]")
	public static WebElement seventhRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[1]")
	public static WebElement eigthRowIndex;

	@FindBy(xpath = "//label[contains(text(),'Delete Row')]")
	public static WebElement deleteRowBtn;

	@FindBy(xpath = "//label[contains(text(),'Insert Row')]")
	public static WebElement insertRowBtn;

	@FindBy(xpath = "//span[@class='icon-selectall icon-font8']")
	public static WebElement selectRowBtn;

	@FindBy(xpath = "//span[@class='icon-unselectall1 icon-font8']")
	public static WebElement unSelectRowBtn;

	@FindBy(xpath = "//*[contains(text(),'Duplicate Row')]")
	public static WebElement duplicateRowBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_summary_btn_expand']")
	public static WebElement entryPageFooterExpandBtn;

	@FindBy(xpath = "//input[@id='id_body_16777336']")
	public static WebElement enterJVVATTaxCode;

	@FindBy(xpath = "//input[@id='id_body_16777340']")
	public static WebElement enterDebitVATTaxCode;

	@FindBy(xpath = "//input[@id='id_body_16777342']")
	public static WebElement enterCreditVATTaxCode;

	@FindBy(xpath = "//input[@id='id_body_16777346']")
	public static WebElement enterTaxcode;

	@FindBy(xpath = "//input[@id='id_body_16777344']")
	public static WebElement enterPVPVATTaxcode;

	@FindBy(xpath = "//*[@id='id_body_12_input_image']/span")
	public static WebElement enter_Account_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_12_input_settings']/span")
	public static WebElement enter_Account_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_12_customize_popup_container']")
	public static WebElement enter_Account_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_12_customize_popup_footer']//input[1]")
	public static WebElement enter_Account_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_list']")
	public static WebElement enter_Account_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_header']")
	public static WebElement enter_Account_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_alignment']")
	public static WebElement enter_Account_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_width']")
	public static WebElement enter_Account_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement enter_Account_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement enter_Account_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_12_search_container']//input[2]")
	public static WebElement enter_Account_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement enter_Account_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement enter_Account_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_16']")
	public static WebElement enter_Amount;

	@FindBy(xpath = "//textarea[@id='id_body_16777219']")
	public static WebElement enter_Receipts_Remarks;

	@FindBy(xpath = "//textarea[@id='id_body_16777222']")
	public static WebElement enter_Payments_Remarks;

	@FindBy(xpath = "//textarea[@id='id_body_16777225']")
	public static WebElement enter_PettyCash_Remarks;

	@FindBy(xpath = "//textarea[@id='id_body_16777228']")
	public static WebElement enter_PostDatedReceipts_Remarks;

	@FindBy(xpath = "//textarea[@id='id_body_16777231']")
	public static WebElement enter_PostDatedPaymentss_Remarks;

	@FindBy(xpath = "//input[@id='id_body_23']")
	public static WebElement enter_ItemTxt;

	@FindBy(xpath = "//*[@id='id_body_23_input_image']/span")
	public static WebElement item_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_23_input_settings']/span")
	public static WebElement item_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_body_23_customize_popup_container']")
	public static WebElement item_Settings_Container;

	@FindBy(xpath = "//div[@id='id_body_23_customize_popup_footer']//input[1]")
	public static WebElement item_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_body_23_customize_popup_standardfields_list']")
	public static WebElement item_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_body_23_customize_popup_standardfields_header']")
	public static WebElement item_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_body_23_customize_popup_standardfields_alignment']")
	public static WebElement item_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_body_23_customize_popup_standardfields_width']")
	public static WebElement item_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement item_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement item_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_body_23_search_container']//input[2]")
	public static WebElement item_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement item_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement item_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_24']")
	public static WebElement enter_UnitTxt;

	@FindBy(xpath = "//*[@id='id_body_24_input_image']/span")
	public static WebElement unit_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_24_input_settings']/span")
	public static WebElement unit_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_body_24_customize_popup_container']")
	public static WebElement unit_Settings_Container;

	@FindBy(xpath = "//div[@id='id_body_24_customize_popup_footer']//input[1]")
	public static WebElement unit_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_body_24_customize_popup_standardfields_list']")
	public static WebElement unit_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_body_24_customize_popup_standardfields_header']")
	public static WebElement unit_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_body_24_customize_popup_standardfields_alignment']")
	public static WebElement unit_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_body_24_customize_popup_standardfields_width']")
	public static WebElement unit_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement unit_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement unit_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_body_24_search_container']//input[2]")
	public static WebElement unit_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement unit_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement unit_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_26']")
	public static WebElement enter_Quantity;
	
	@FindBy(xpath = "//*[@id='id_fconfirm_body']")
	public static WebElement popUpBody;
	
	
	@FindBy(xpath = "//*[@id='id_fconfirm_btn2']")
	public static WebElement popUp_NoBTN;
	
	@FindBy(xpath = "//*[@id='id_fconfirm_btn1']")
	public static WebElement popUp_YesBTN;
	
	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table']/tbody/tr/td[4]")
	public static List<WebElement> entryPage_Col3List;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table']/tbody/tr/td[5]")
	public static List<WebElement> entryPage_Col4List;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table']/tbody/tr/td[6]")
	public static List<WebElement> entryPage_Col5List;
	
	
	
	
	

	@FindBy(xpath = "//input[@id='id_body_27']")
	public static WebElement enter_Rate;
	
	@FindBy(xpath = "//*[@id='Id_StockReservation_FGrid_col_1-4']")
	public static WebElement ReserPopUpStockItemRow1EnterQty;

	@FindBy(xpath = "//*[contains(text(),'Convert to Sales invoice VAT')]")
	public static WebElement convertToSalesInvoiceVAT;
	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr/td")
	public static List<WebElement> vouEntryPageBodyList;
	
	
	@FindBy(xpath="//*[@id='id_body_33554552']")
	public static WebElement enterCGSTTxt;
	
	
	@FindBy(xpath="//*[@id='id_body_33554553']")
	public static WebElement enterSGSTTxt;
	
	
	@FindBy(xpath="//*[@id='id_body_33554554']")
	public static WebElement enterIGSTTxt;

	
	@FindBy(xpath="(//label[@data-text='Net']/span)[2]")
	public static WebElement entryPageFooterNetAmt;
	
			@FindBy(xpath="//*[@id='id_transactionentry_summary_static']/div/div/div[1]")
			public static List<WebElement> footerPopupCol1;
			
			@FindBy(xpath="//*[@id='id_transactionentry_summary_static']/div/div/div[2]")
			public static List<WebElement> footerPopupCol2;
			
	
	
	
	
	@FindBy(xpath="//*[@id='id_footer_134217846']")
	public static WebElement entryPageSalesFooterRoundOFFValue;
	

	

	@FindBy(xpath = "//*[@id='2088']/span")
	public static WebElement pettyCashNewRefrenceBtn;

	@FindBy(xpath = "//*[@id='2061']/span")
	public static WebElement salesReturnsVATBtn;

	@FindBy(xpath = "//*[@id='2087']/span")
	public static WebElement PDRNewReferenceBtn;

	@FindBy(xpath = "//*[@id='id_body_28']")
	public static WebElement enter_Gross;

	@FindBy(xpath = "//input[@id='id_body_13']")
	public static WebElement enter_Batch;

	@FindBy(xpath = "//input[@id='id_body_12']")
	public static WebElement enter_DebitACTxt;

	@FindBy(xpath = "//*[@id='id_body_12_input_image']/span")
	public static WebElement enter_DebitAC_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_12_input_settings']/span")
	public static WebElement enter_DebitAC_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_12_customize_popup_container']")
	public static WebElement enter_DebitAC_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_12_customize_popup_footer']//input[1]")
	public static WebElement enter_DebitAC_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_list']")
	public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_header']")
	public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_alignment']")
	public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_width']")
	public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_12_search_container']//input[2]")
	public static WebElement enter_DebitAC_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement enter_DebitAC_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement enter_DebitAC_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_39']")
	public static WebElement enter_CreditACTxt;

	@FindBy(xpath = "//*[@id='id_body_39_input_image']/span")
	public static WebElement enter_CreditAC_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_39_input_settings']/span")
	public static WebElement enter_CreditAC_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_39_customize_popup_container']")
	public static WebElement enter_CreditAC_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_39_customize_popup_footer']//input[1]")
	public static WebElement enter_CreditAC_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_39_customize_popup_standardfields_list']")
	public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_39_customize_popup_standardfields_header']")
	public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_39_customize_popup_standardfields_alignment']")
	public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_39_customize_popup_standardfields_width']")
	public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_39_search_container']//input[2]")
	public static WebElement enter_CreditAC_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement enter_CreditAC_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement enter_CreditAC_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_18']")
	public static WebElement enter_DebitTxt;

	@FindBy(xpath = "//input[@id='id_body_19']")
	public static WebElement enter_CreditTxt;

	@FindBy(xpath = "//textarea[@id='id_body_16777241']")
	public static WebElement enter_NonStandardJournalEntries_RemarksTxt;

	@FindBy(xpath = "//input[@id='id_body_87']")
	public static WebElement enter_Warehouse2Txt;

	@FindBy(xpath = "//*[@id='id_body_87_input_image']/span")
	public static WebElement enter_Warehouse2_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_87_input_settings']/span")
	public static WebElement enter_Warehouse2_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_87_customize_popup_container']")
	public static WebElement enter_WareHouse2_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_87_customize_popup_footer']//input[1]")
	public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_87_customize_popup_standardfields_list']")
	public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_87_customize_popup_standardfields_header']")
	public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_87_customize_popup_standardfields_alignment']")
	public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_87_customize_popup_standardfields_width']")
	public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_87_search_container']//input[2]")
	public static WebElement enter_WareHouse2_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	public static WebElement enter_WareHouse2_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	public static WebElement enter_WareHouse2_Settings_CancelBtn;

	// Right Panel InfoSide Bar
	@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
	public static WebElement infoSideBarCustomizeBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
	public static WebElement infoSideBarMinimizeExpandBtn;

	@FindBy(xpath = "//li[@id='Trans_Dash_Save']//span[text()='Save']")
	public static WebElement customizeSaveBtn;

	@FindBy(xpath = "//span[@class='noWrap clsBlueColor'][contains(text(),'Cancel')]")
	public static WebElement customizeCancelBtn;

	@FindBy(xpath = "//input[@id='searchBoxTrans']")
	public static WebElement customizeSearchTxt;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@class='icon-search searchicon']")
	public static WebElement customizeSearchBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='g']")
	public static WebElement graphBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='Newgraph']")
	public static WebElement newGraphOption;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='r']")
	public static WebElement reportBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewReport']")
	public static WebElement newReportOption;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='i']")
	public static WebElement infoPanelBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewInfopanel']")
	public static WebElement newInfoPanelOption;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
	public static WebElement workFlowBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewWorkflow']")
	public static WebElement newWorkFlowOption;

	@FindBy(xpath = "//a[@id='DocumentInfoOption']")
	public static WebElement otherDashlets;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//label[contains(@class,'theme_icon-color')][contains(text(),'Document Info')]")
	public static WebElement documentInfo;

	/*
	 * @FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
	 * public static WebElement workFlowBtn;
	 * 
	 * @FindBy(
	 * xpath="//div[@id='Dashboard_Graph_panelID_Trans']//a[contains(text(),'New Workflow')]"
	 * ) public static WebElement newWorkFlowOption;
	 * 
	 * @FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='d']")
	 * public static WebElement otherDashlets;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='id_Dashlet4']//a")
	 * public static WebElement documentInfo;
	 */
	/*
	 * @FindBy(
	 * xpath="//span[contains(@class,'icon-left-and-right-panel-icon icon-font6 no_padding_left_right')]"
	 * ) public static WebElement infoSideBarMinimizeExpandBtn;
	 */

	@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
	public static WebElement infoSideBarExpandBtn;

	// Footer Section
	@FindBy(xpath = "//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	public static WebElement netLabel;

	@FindBy(xpath = "//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	public static WebElement netAmount;

	@FindBy(xpath = "//*[@id='id_transactionentry_summary_static']/div/div[1]")
	public static WebElement footerAmtLabel;

	@FindBy(xpath = "//label[@id='id_transactionentry_footer_panel_summary_value_16']")
	public static WebElement footerAmount;

	@FindBy(xpath = "//*[@id='id_transactionentry_summary_btn_expand']")
	public static WebElement footerExpandBtn;

	// Navigation of Voucher Menus

	// Financial Menu and Sub Menus

	@FindBy(xpath = "//a[@id='61']//span[contains(text(),'Transactions')]")
	public static WebElement transactionsExpandBtn;

	@FindBy(xpath = "//a[@id='2007']//span[contains(text(),'Purchases')]")
	public static WebElement purchasesExpandBtn;

	@FindBy(xpath = "//span[contains(text(),'Purchases Vouchers')]")
	public static WebElement purchaseVouchersBtn;

	// Inventory Menu and Sub Menus

	@FindBy(xpath = "//input[@id='id_header_268435470']")
	public static WebElement purchaseVoucherVATPlaceOFSupply;

	@FindBy(xpath = "//*[@id='2033']")
	public static WebElement invTransStocksMenu;

	@FindBy(xpath = "//span[contains(text(),'Stock Analysis by Batch')]")
	public static WebElement stockAnalysisByBatchMenu;

	@FindBy(xpath = "//*[@id='2035']")
	public static WebElement excessInStocksMenu;

	@FindBy(xpath = "//*[@id='trRender_1']/td[2]/input")
	public static WebElement entryPageRow1Chkbox;
	
	
	@FindBy(xpath = "//*[text()='Pending Bills']")
	public static WebElement pendingBillsVIEW;
	
	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td")
	public static List<WebElement> entryPageRow1List;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td")
	public static List<WebElement> entryPageRow2List;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td")
	public static List<WebElement> entryPageRow3List;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td")
	public static List<WebElement> entryPageRow4List;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td")
	public static List<WebElement> entryPageRow5List;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td")
	public static List<WebElement> entryPageRow6List;
	
	

	@FindBy(xpath = "//*[@id='trRender_1']/td")
	public static List<WebElement> voucherHomePageRow1List;

	@FindBy(xpath = "//*[@id='2034']")
	public static WebElement shortageInStocksMenu;

	@FindBy(xpath = "//a[@id='2049']")
	public static WebElement openingStocksNewVoucher;

	@FindBy(xpath = "//a[@id='137']//span[contains(text(),'Transactions')]")
	public static WebElement inventoryTransactionsMenu;

	@FindBy(xpath = "//*[@id='139']")
	public static WebElement inventoryTransactionsPurchasesMenu;

	@FindBy(xpath = "//*[@id='2010']")
	public static WebElement requestForQuoteVoucher;

	@FindBy(xpath = "//*[@id='2011']")
	public static WebElement purchasesQuotationsVoucher;

	@FindBy(xpath = "//*[@id='2012']")
	public static WebElement purchasesOrdersVoucher;

	@FindBy(xpath = "//*[@id='2013']")
	public static WebElement materialReceiptNotesVoucher;

	@FindBy(xpath = "//*[@id='140']")
	public static WebElement inventoyTransactionsSalesMenu;

	@FindBy(xpath = "//*[@id='2018']")
	public static WebElement salesQuotationsVoucher;

	@FindBy(xpath = "//*[@id='2019']")
	public static WebElement deliveryNotesVoucher;

	@FindBy(xpath = "//*[@id='2022']")
	public static WebElement posSalesVoucher;

	@FindBy(xpath = "//*[@id='2045']")
	public static WebElement productionOrdersVoucher;

	@FindBy(xpath = "//*[@id='2017']")
	public static WebElement salesOrdersVoucher;

	@FindBy(xpath = "//*[@id='2034']")
	public static WebElement shortagesInStockVoucher;

	@FindBy(xpath = "//*[@id='2035']")
	public static WebElement excessesInStocksVoucher;

	@FindBy(xpath = "//*[@id='2036']")
	public static WebElement stockTransfersVoucher;

	@FindBy(xpath = "//*[@id='2037']")
	public static WebElement openingStocksVoucher;

	@FindBy(xpath = "//*[@id='2038']")
	public static WebElement materialRequisitionVoucher;

	@FindBy(xpath = "//*[@id='2049']")
	public static WebElement stockAdjustmentVoucher;

	@FindBy(xpath = "//*[@id='164']")
	public static WebElement holdAndUnholdStockVoucher;

	@FindBy(xpath = "//*[@id='93']")
	public static WebElement stockReconciliation;

	@FindBy(xpath = "//*[@id='99']")
	public static WebElement stockAllocation;

	// Validation and Confirmation messages
	
	@FindBy(xpath = "//*[@id='idGlobalError']/div/div[2]")
	public static WebElement errorMessage;
	
	
	

	
	
	

	@FindBy(xpath = "//*[text()='This Transaction will make the Stock Negative']")
	public static WebElement errorMessageStock;
	
	
	
	@FindBy(xpath = "//*[@id='idGlobalError']/div/div[2]")
	public static List<WebElement> errorMessageList;

	@FindBy(xpath = "//*[@id='idGlobalError']/div/div/button")
	public static List<WebElement> errorMessageCloseBtnList;

	@FindBy(id = "txtPassword")
	public static WebElement password;
	
	  @FindBy(xpath = "//*[@id='idGlobalError']/div[1]/div[1]/button") 
	  public static WebElement errorMessageClose2Btn;
	 

	@FindBy(xpath = "//*[@class='btn-close alert-message-close']")
	public static WebElement errorMessageCloseBtn;
	
	
	
	
	
	

	// Dash board Page
	@FindBy(xpath = "//*[@title='Dashboard']")
	public static WebElement labelDashboard;

	@FindBy(xpath = "//*[@id='Select_dash']")
	public static WebElement selectDashboard;

	@FindBy(xpath = "//*[@id='Dashboard_AddDash']")
	public static WebElement newAddDashBoard;

	@FindBy(xpath = "//*[@id='Dashboard_Dash_Config']")
	public static WebElement dashboardCustomizationSettings;
	
	
	@FindBy(xpath = "//*[@id='id_header_67108966']")
	public static WebElement PDPChequeNumber;

	// Vouchers Settings Options
	@FindBy(xpath = "//*[@id='updateButton']")
	public static WebElement updateBtn;

	@FindBy(xpath = "//*[@id='btnCustomizeClose']")
	public static WebElement settings_closeBtn;

	// Documents Tab
	@FindBy(xpath = "//div[@class='font-5 theme_background-color-inverse theme_color-inverse']")
	public static WebElement documentsTab;
	

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[1]/td")
	public static List<WebElement> billRefRow1List;
	
	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[2]/td")
	public static List<WebElement> billRefRow2List;
	
	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[3]/td")
	public static List<WebElement> billRefRow3List;
	
	
	
	

	@FindBy(xpath = "//li[@id='navigationtab1']")
	public static WebElement documentsTabForMaterialReceiptNotes;

	@FindBy(xpath = "//span[@id='DocumentLoadMasterPopupBtn']")
	public static WebElement loadMastersBtn;

	@FindBy(xpath = "//select[@id='doc_voucherDropDown']")
	public static WebElement loadmasterDropDown;

	@FindBy(xpath = "//button[@id='btnSelectDependMaster']")
	public static WebElement selectAllBtn;

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	public static WebElement resetBtn;

	@FindBy(xpath = "//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
	public static WebElement okBtn;

	@FindBy(xpath = "//*[@id='editScreen_CustomizeButtons']/span[1]")
	public static WebElement deleteTagBtn;

	@FindBy(xpath = "//span[@id='DocumentAddGroupPopupBtn']")
	public static WebElement addGroupBtn;

	@FindBy(xpath = "//input[@id='doc_GroupName']")
	public static WebElement groupNameTXt;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	public static WebElement addBtn;

	@FindBy(xpath = "//div[@class='col-xs-12 form-group']//button[@id='btnCancel']")
	public static WebElement cancelBtn;

	@FindBy(xpath = "//div[@id='voucherTabContent']//span[2]")
	public static WebElement deletegroupBtn;

	@FindBy(xpath = "//input[@id='doc_title']")
	public static WebElement titleTxt;

	@FindBy(xpath = "//input[@id='doc_baseDocument']")
	public static WebElement baseDocumentTxt;

	@FindBy(xpath = "//input[@id='txtbox_doc_Accountdepandency']")
	public static WebElement accountDependencyTxt;

	@FindBy(xpath = "//span[contains(text(),'iExchangeAdjustmentGainAC')]")
	public static WebElement iExchangeAdjustmentGainACChkBox;

	@FindBy(xpath = "//span[contains(text(),'iExchangeAdjustmentLossAC')]")
	public static WebElement iExchangeAdjustmentLossACChkBox;

	@FindBy(xpath = "//span[contains(text(),'iPrimaryAccount')]")
	public static WebElement iPrimaryAccountChkBox;

	@FindBy(xpath = "//span[contains(text(),'iCity')]")
	public static WebElement iCityChkBox;

	@FindBy(xpath = "//span[contains(text(),'iDeliveryCity')]")
	public static WebElement iDeliverycityChkBox;

	@FindBy(xpath = "//span[contains(text(),'iBankAc')]")
	public static WebElement iBankACChkBox;

	@FindBy(xpath = "//span[contains(text(),'iPDCDiscountedAC')]")
	public static WebElement iPDCDiscountedACChkBox;

	@FindBy(xpath = "//input[@id='txtbox_doc_Productdepandency']")
	public static WebElement itemDependencyTxt;

	@FindBy(xpath = "//span[contains(text(),'Outlet__')]")
	public static WebElement outletChkBox;

	@FindBy(xpath = "//span[contains(text(),'iCostofShortageStockAC')]")
	public static WebElement iCostofShortageStockACChkBox;

	@FindBy(xpath = "//span[contains(text(),'iCostofExcessStockAC')]")
	public static WebElement iCostofExcessStockACChkBox;

	@FindBy(xpath = "//span[contains(text(),'iCostofSaleReturnAC')]")
	public static WebElement iCostofSaleReturnACChkBox;

	@FindBy(xpath = "//span[contains(text(),'iPurchaseVarianceAC')]")
	public static WebElement iPurchaseVarianceACChkBox;

	@FindBy(xpath = "//span[contains(text(),'iDefaultBaseUnit')]")
	public static WebElement iDefaultBaseUnitChkBox;

	@FindBy(xpath = "//span[contains(text(),'iDefaultSalesUnit')]")
	public static WebElement iDefaultSalesUnitChkBox;

	@FindBy(xpath = "//span[contains(text(),'iDefaultPurchaseUnit')]")
	public static WebElement iDefaultPurchaseUnitChkBox;

	@FindBy(xpath = "//span[contains(text(),'iCostOfIssueAccount')]")
	public static WebElement iCostOfIssueAccountChkBox;

	@FindBy(xpath = "//span[contains(text(),'iStocksAccount')]")
	public static WebElement iStocksAccountChkBox;

	@FindBy(xpath = "//span[contains(text(),'iSalesAccount')]")
	public static WebElement iSalesAccountChkBox;

	@FindBy(xpath = "//li[12]//div[1]//label[1]//span[1]")
	public static WebElement otherdetails1Box;

	@FindBy(xpath = "//li[13]//div[1]//label[1]//span[1]")
	public static WebElement replenishment1ChkBox;

	@FindBy(xpath = "//span[contains(text(),'Reorder__')]")
	public static WebElement reorderChkBox;

	@FindBy(xpath = "//span[contains(text(),'iCategory')]")
	public static WebElement iCategoryChkBox;

	@FindBy(xpath = "//span[contains(text(),'iWIPAccount')]")
	public static WebElement iWIPAccountChkBox;

	@FindBy(xpath = "//span[contains(text(),'Classification__')]")
	public static WebElement classificationChkBox;

	@FindBy(xpath = "//li[18]//div[1]//label[1]//span[1]")
	public static WebElement repelenishment2ChkBox;

	@FindBy(xpath = "//li[19]//div[1]//label[1]//span[1]")
	public static WebElement otherDetails2ChkBox;

	@FindBy(xpath = "//span[contains(text(),'iBin')]")
	public static WebElement iBinChkBox;

	@FindBy(xpath = "//span[contains(text(),'iAlternateCategory')]")
	public static WebElement iAlternateCategoryChkBox;

	@FindBy(xpath = "//span[contains(text(),'iTaxCode')]")
	public static WebElement iTaxCodeChkBox;

	@FindBy(xpath = "//select[@id='doc_Accountdepandency_Filter']")
	public static WebElement accountfilterDropdown;

	@FindBy(xpath = "//select[@id='doc_Itemdepandency_Filter']")
	public static WebElement itemfilterDropdown;

	// Documents Tab Grid Elements

	// first row

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_1-0']")
	public static WebElement firstrow;

	@FindBy(xpath = "//div[contains(text(),'Delete Row')]")
	public static WebElement doc_deleterowBtn;

	@FindBy(xpath = "//div[contains(text(),'Insert Row')]")
	public static WebElement doc_insertRowBtn;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_1-1']")
	public static WebElement masters1;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_1-2']")
	public static WebElement position1;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_1-3']")
	public static WebElement showDependency1;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_1-4']")
	public static WebElement group1;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_1-5']")
	public static WebElement filter1;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_1-6']")
	public static WebElement mandatory1;

	// Second Row // Delete and Insert row are same

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_2-0']")
	public static WebElement secondRow;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_2-1']")
	public static WebElement masters2;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_2-2']")
	public static WebElement position2;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_2-3']")
	public static WebElement showDependency2;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_2-4']")
	public static WebElement group2;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_2-5']")
	public static WebElement filter2;

	@FindBy(xpath = "//td[@id='doc_TagsTable_col_2-6']")
	public static WebElement mandatory2;

	// After clicking // Properties Changes which are same for all rows

	@FindBy(xpath = "//select[@id='doc_TagsTableMasterDropDown']")
	public static WebElement masterDropDown;

	@FindBy(xpath = "//select[@id='doc_TagsPositionDropDown']")
	public static WebElement positionDropdown;

	@FindBy(xpath = "//input[@id='txtbox_doc_TagsDepedencyDropDown']")
	public static WebElement showDependencyDropdown;

	@FindBy(xpath = "//input[@id='doc_TagsGroupTxtbox']")
	public static WebElement groupTxt;

	@FindBy(xpath = "//select[@id='docFilter']")
	public static WebElement filterDropdown;

	@FindBy(xpath = "//select[@id='doc_MandatoryDropDown']")
	public static WebElement mandatoryDropDown;

	// Views Tab
	@FindBy(xpath = "//span[@class='icon-views'")
	public static WebElement viewsTab;

	// Export Fields
	@FindBy(xpath = "//span[contains(text(),'Export Fields')]")
	public static WebElement exportFieldsTab;

	// Triggers
	@FindBy(xpath = "//span[@class='icon-trigger icon-font7']")
	public static WebElement triggersTab;

	// Document Numbering
	@FindBy(xpath = "//span[contains(text(),'Document Numbering')]")
	public static WebElement documentNumberingTab;

	// Hire Purchase
	@FindBy(xpath = "//span[contains(text(),'Hire Purchase')]")
	public static WebElement hirePurchasetab;

	// Reports Tab
	@FindBy(xpath = "//span[@class='icon-text70 icon-font7']")
	public static WebElement reportsTab;

	// Schemes
	@FindBy(xpath = "//span[contains(text(),'Schemes')]")
	public static WebElement schemestab;

	// Bin Inward Elements

	@FindBy(xpath = "//input[@id='id_bins_totalquantity']")
	public static WebElement binTotalQty;

	@FindBy(xpath = "//div[@class='modal-body']//div[4]")
	public static WebElement binBaseUOM;

	@FindBy(xpath = "//input[@id='srch_bin']")
	public static WebElement binSearchTxt;

	@FindBy(xpath = "//*[@class='icon-search form-control-feedback searchicon searchicon-extra']")
	public static WebElement binSearchBtn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-0']")
	public static WebElement binselect1stRow_1stColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-1']")
	public static WebElement binselect1stRow_2ndColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-3']")
	public static WebElement binselect1stRow_3rdColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-5']")
	public static WebElement binselect1stRow_4thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-6']")
	public static WebElement binselect1stRow_5thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-7']")
	public static WebElement binselect1stRow_6thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-8']")
	public static WebElement binselect1stRow_7thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_1-12']")
	public static WebElement binselect1stRow_8thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_2-0']")
	public static WebElement binselect2ndRow_1stColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_2-1']")
	public static WebElement binselect2ndRow_2ndColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_2-3']")
	public static WebElement binselect2ndRow_3rdColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_2-5']")
	public static WebElement binselect2ndRow_4thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_2-6']")
	public static WebElement binselect2ndRow_5thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_2-7']")
	public static WebElement binselect2ndRow_6thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_2-8']")
	public static WebElement binselect2ndRow_7thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_2-12']")
	public static WebElement binselect2ndRow_8thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_3-0']")
	public static WebElement binselect3rdRow_1stColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_3-1']")
	public static WebElement binselect3rdRow_2ndColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_3-3']")
	public static WebElement binselect3rdRow_3rdColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_3-5']")
	public static WebElement binselect3rdRow_4thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_3-6']")
	public static WebElement binselect3rdRow_5thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_3-7']")
	public static WebElement binselect3rdRow_6thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_3-8']")
	public static WebElement binselect3rdRow_7thColumn;

	@FindBy(xpath = "//td[@id='id_transaction_bins_grid_col_3-12']")
	public static WebElement binselect3rdRow_8thColumn;

	@FindBy(xpath = "//span[@class='icon-sum']")
	public static WebElement binRowSum;

	@FindBy(xpath = "//tfoot[@id='id_transaction_bins_grid_foot']//td[2]")
	public static WebElement binRowSum_2ndColumn;

	@FindBy(xpath = "//tfoot[@id='id_transaction_bins_grid_foot']//td[4]")
	public static WebElement binSelect4htRow_3rdColumn;

	@FindBy(xpath = "//tfoot[@id='id_transaction_bins_grid_foot']//td[6]")
	public static WebElement binRowSum_4thColumn;

	@FindBy(xpath = "//tfoot[@id='id_transaction_bins_grid_foot']//td[7]")
	public static WebElement binRowSum_5thColumn;

	@FindBy(xpath = "//tfoot[@id='id_transaction_bins_grid_foot']//td[8]")
	public static WebElement binRowSum_6thColumn;

	@FindBy(xpath = "//tfoot[@id='id_transaction_bins_grid_foot']//td[9]")
	public static WebElement binRowSum_7thColumn;

	@FindBy(xpath = "//tfoot[@id='id_transaction_bins_grid_foot']//td[12]")
	public static WebElement binRowSum_8thColumn;

	@FindBy(xpath = "//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
	public static WebElement binSumInward;

	@FindBy(xpath = "//input[@id='id_bins_balance']")
	public static WebElement binBalanceTxt;

	@FindBy(xpath = "//div[@id='id_btnalternatecategorycheck']//div[@class='toolbar_button_image']")
	public static WebElement binAlternateCategoryCheckBtn;

	@FindBy(xpath = "//*[@id='id_btnautoallocate']")
	public static WebElement binAutoAllocateBtn;

	@FindBy(xpath = "//span[@class='icon-pick icon-font4']")
	public static WebElement binPickBtn;
	
	@FindBy(xpath = "//div[@id='id_btnautoallocategroup']//div[@class='toolbar_button_image']")
	public static WebElement binAutoAllocateWithinGroupBtn;

	@FindBy(xpath = "//input[@id='id_bins_ok']")
	public static WebElement binOkBtn;

	@FindBy(xpath = "//div[@class='col-xs-9 pull-right']//span[@class='icon-close icon-font6']")
	public static WebElement binCancelBtn;

	@FindBy(xpath = "//*[@id='id_reportmenudisplay']//i[@class='icon-close hiconright2']")
	public static WebElement report_CloseBtn;

	@FindBy(xpath = "//*[@id='div_Clear']")
	public static WebElement RMAPopupClearBtn;

	@FindBy(xpath = "//*[@id='panelsStayOpen-headingTwo']/button")
	public static WebElement settingPostingDetailsExpandBtn;

	@FindBy(xpath = "(//*[@id='panelsStayOpen-headingTwo']/button)[2]")
	public static WebElement BatchBinExpandBtn;

	@FindBy(xpath = "//*[@id='misc_PostingUpdateFA']/following-sibling::span")
	public static WebElement updateStockChkbox;

	@FindBy(xpath = "//*[@id='misc_PostingUpdateFA']")
	public static WebElement updateStockIsSelected;

	@FindBy(xpath = "(//button[contains(text(),'Cancel')])[2]")
	public static WebElement RMAPopupCancelBtn;

	@FindBy(xpath = "(//*[@class='icon-close'])[4]")
	public static WebElement RMAPopupCloseBtn;

	@FindBy(xpath = "//div[@id='Modal_Search_Body']/div[3]/label")
	public static WebElement rmaNumberofItemsLabel;

	@FindBy(xpath = "//th[@id='RMA_Table_control_heading_1']/div")
	public static WebElement rmaTableHeadingRMA;

	@FindBy(xpath = "//th[@id='RMA_Table_control_heading_2']/div")
	public static WebElement rmaTableHeadingDocumentNo;

	@FindBy(xpath = "//th[@id='RMA_Table_control_heading_3']/div")
	public static WebElement rmaTableHeadingDocumentDate;

	@FindBy(xpath = "//div[@id='RMAModel_Bottom']/div[1]/label")
	public static WebElement rmaClearBtn;

	@FindBy(xpath = "//div[@id='RMAModel_Bottom']/div[2]/label")
	public static WebElement rmaOkBtn;

	@FindBy(xpath = "//div[@id='RMAModel_Bottom']/div[3]/label")
	public static WebElement rmaCancelBtn;

	@FindBy(xpath = "//div[@id='Modal_Header']/div[2]/span/i")
	public static WebElement rmaCloseBtn;

	@FindBy(xpath = "//td[@id='RMA_Table_col_1-1']")
	public static WebElement rmaTableRow1Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_2-1']")
	public static WebElement rmaTableRow2Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_3-1']")
	public static WebElement rmaTableRow3Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_4-1']")
	public static WebElement rmaTableRow4Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_5-1']")
	public static WebElement rmaTableRow5Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_6-1']")
	public static WebElement rmaTableRow6Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_7-1']")
	public static WebElement rmaTableRow7Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_8-1']")
	public static WebElement rmaTableRow8Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_9-1']")
	public static WebElement rmaTableRow9Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_10-1']")
	public static WebElement rmaTableRow10Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_11-1']")
	public static WebElement rmaTableRow11Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_12-1']")
	public static WebElement rmaTableRow12Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_13-1']")
	public static WebElement rmaTableRow13Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_14-1']")
	public static WebElement rmaTableRow14Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_15-1']")
	public static WebElement rmaTableRow15Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_16-1']")
	public static WebElement rmaTableRow16Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_17-1']")
	public static WebElement rmaTableRow17Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_18-1']")
	public static WebElement rmaTableRow18Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_19-1']")
	public static WebElement rmaTableRow19Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_20-1']")
	public static WebElement rmaTableRow20Column1;

	@FindBy(xpath = "//td[@id='RMA_Table_col_1-2']")
	public static WebElement rmaTableRow1Column2;

	@FindBy(xpath = "//td[@id='RMA_Table_col_1-3']")
	public static WebElement rmaTableRow1Column3;

	@FindBy(xpath = "//td[@id='id_body_38_input_image']/img")
	public static WebElement rmaExpansionBtn;

	// ----------------------------------------------------------------------------------------------------------
	// Edit Screen Tab

	@FindBy(xpath = "//*[@id='navigationtab13']")
	public static WebElement editScreenTab;

	@FindBy(xpath = "//*[@id='navigationtab13']")
	public static WebElement salesInvoiceVATeditScreenTab;

	@FindBy(xpath = "//i[@class='icon-add icon-font7']")
	public static WebElement editScreenaddBtn;

	@FindBy(xpath = "//a[contains(text(),'Field Details')]")
	public static WebElement editScreenFieldDetailsTab;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_Caption']")
	public static WebElement editScreenCaptionTxt;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_DataType']")
	public static WebElement editScreenCaptionDataTypeDropdown;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_DefaultValue']")
	public static WebElement editScreenDefaultValueTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_noofDecimals']")
	public static WebElement editScreenNoOfDecimalsDropdown;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_toolTip']")
	public static WebElement editScreenToolTipTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_bannerText']")
	public static WebElement editScreenBannerTextTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_MinValue']")
	public static WebElement editScreenMinimunValueTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_MaxValue']")
	public static WebElement editScreenMaximunValueTxt;
	
	@FindBy(xpath="//a[@id='4']")
	public static WebElement MiselleanousBtn;
	
	@FindBy(xpath="//*[@id='id_header_3']")
	public static WebElement saleslist;
	

	@FindBy(xpath = "//*[@id='cmbBehaviour']")
	public static WebElement editScreenAddFieldsBehaviourDropdown;
	
	                 
	@FindBy(xpath = "//*[@id='editScreen_qtyFormula_formulaText']")
	public static WebElement rateFormulaTXT;
	
	@FindBy(xpath="//*[text()='Sales Returns']")
	public static WebElement  salesReturnsBtn;
	

	@FindBy(xpath = "//*[@id='editScreen_qtyFormula_textbox']")
	public static WebElement editScreenAddBehaviourformulaTxt;

	@FindBy(xpath = "//*[@id='editScreen_qtyFormula_Ok']")
	public static WebElement editScreenAddBehaviourFormulaokBtn;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
	public static WebElement editScreenPreloadTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
	public static WebElement editScreenRestrictformulaTxt;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_RoundOff']")
	public static WebElement editScreenRoundOffsDropdown;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_RoundOffTo']")
	public static WebElement editScreenRoundOffToTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_RestrictMsg']")
	public static WebElement editScreenRestrictMessageTxt;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_AddToNet']")
	public static WebElement editScreenAddToNetDropdown;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_AddToStock']")
	public static WebElement editScreenAddToStockDropDown;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_Position']")
	public static WebElement editScreenpositionDropdown;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_Columnwidth']")
	public static WebElement editScreenColumnWidthTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkValinBaseCurency']")
	public static WebElement editScreenValueInBaseCurrencyChkBox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkValinBaseCurency']")
	public static WebElement editScreenHideFromSummaryChkBox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkPostToAcc']")
	public static WebElement editScreenPostToAccountChkBox;

	@FindBy(xpath = "//input[@id='acc1-1']")
	public static WebElement editScreenAccount1Radio;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_defaultAcc1']")
	public static WebElement editScreenAccount1Txt;

	@FindBy(xpath = "//*[@id='editScreen_FieldsCustomization_defaultAcc1_input_image']/span")
	public static WebElement editScreenAccount1ExpandBtn;

	@FindBy(xpath = "//*[@id='editScreen_FieldsCustomization_defaultAcc1_input_settings']/span")
	public static WebElement editScreenAccount1SettingsBtn;

	@FindBy(xpath = "//div[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_container']")
	public static WebElement editScreenAccount1Container;

	@FindBy(xpath = "//div[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_footer']//input[1]")
	public static WebElement editScreenAccount1StandardFiledsBtn;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_list']")
	public static WebElement editScreenAccount1StandardFiledsDropdown;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_header']")
	public static WebElement editScreenAccount1StandardFiledsHeaderTxt;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_alignment']")
	public static WebElement editScreenAccount1StandardFiledsAllignmentDropdown;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_width']")
	public static WebElement editScreenAccount1StandardFiledsWidthTxt;

	@FindBy(xpath = "//section[@id='page_Content']//input[3]")
	public static WebElement editScreenAccount1StandardFiledsokBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	public static WebElement editScreenAccount1StandardFiledscancelBtn;

	@FindBy(xpath = "//div[@id='editScreen_FieldsCustomization_defaultAcc1_search_container']//input[2]")
	public static WebElement editScreenAccount1deleteColumnBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[3]")
	public static WebElement editScreenAccount1okBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	public static WebElement editScreenAccount1cancelBtn;

	@FindBy(xpath = "//input[@id='acc2-2']")
	public static WebElement editScreenAccount2Radio;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_defaultAcc2']")
	public static WebElement editScreenAccount2Txt;

	@FindBy(xpath = "//*[@id='editScreen_FieldsCustomization_defaultAcc2_input_image']/span")
	public static WebElement editScreenAccount2ExpandBtn;

	@FindBy(xpath = "//*[@id='editScreen_FieldsCustomization_defaultAcc2_input_settings']/span")
	public static WebElement editScreenAccount2SettingsBtn;

	@FindBy(xpath = "//div[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_container']")
	public static WebElement editScreenAccount2Container;

	@FindBy(xpath = "//div[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_footer']//input[1]")
	public static WebElement editScreenAccount2StandardFiledsBtn;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_list']")
	public static WebElement editScreenAccount2StandardFiledsDropdown;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_header']")
	public static WebElement editScreenAccount2StandardFiledsHeaderTxt;

	@FindBy(xpath = "//select[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_alignment']")
	public static WebElement editScreenAccount2StandardFiledsAllignmentDropdown;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_width']")
	public static WebElement editScreenAccount2StandardFiledsWidthTxt;

	@FindBy(xpath = "//section[@id='page_Content']//input[3]")
	public static WebElement editScreenAccount2StandardFiledsokBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	public static WebElement editScreenAccount2StandardFiledscancelBtn;

	@FindBy(xpath = "//div[@id='editScreen_FieldsCustomization_defaultAcc2_search_container']//input[2]")
	public static WebElement editScreenAccount2deleteColumnBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[3]")
	public static WebElement editScreenAccount2okBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	public static WebElement editScreenAccount2cancelBtn;

	@FindBy(xpath = "//input[@id='acc1-3']")
	public static WebElement editScreenAccount1VariableRadio;

	@FindBy(xpath = "//input[@id='Account_1Var']")
	public static WebElement editScreenAccount1VariableTxt;

	@FindBy(xpath = "//input[@id='acc2-4']")
	public static WebElement editScreenAccount2VariableRadio;

	@FindBy(xpath = "//input[@id='Account_2Var']")
	public static WebElement editScreenAccount2VariableTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_RegularExpr']")
	public static WebElement editScreenRegularExpTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_ErrorMsg']")
	public static WebElement editScreenerrorMessageTxt;

	// properties

	@FindBy(xpath = "//a[contains(text(),'Properties')]")
	public static WebElement editScreenPropertiesTab;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkAuditTrail']")
	public static WebElement editScreenauditTrailChkBox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkCantExprt']")
	public static WebElement editScreencantExportChkBox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkCantImprt']")
	public static WebElement editScreencantImportChkbox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkHidden']")
	public static WebElement editScreenhiddenChkbox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkMandatory']")
	public static WebElement editScreenmandatorychkBox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkNotAvailForReports']")
	public static WebElement editScreennotAvailableForReportsChkBox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_chkReadOnly']")
	public static WebElement editScreenreadOnlyChkBox;

	@FindBy(xpath = "//span[contains(text(),'Apply')]")
	public static WebElement editScreenApplyBtn;

	@FindBy(xpath = "//span[@id='editScreen_FieldsCustomization_Close']")
	public static WebElement editScreencloseBtn;

	@FindBy(xpath = "//a[@href='#editScreen_FieldsCustomization_ExternalModules']")
	public static WebElement editScreenExternalModulesTab;

	// External Module Tab is named As EFES And ELV For Each Screen
	// (ReceiptsEFES,ReceiptsELV )
	// External Functions(External Fields) Changes From Screen to Screen

	// Formatting Tab

	@FindBy(xpath = "//*[@id='editScreen_FieldsCustomization_tabs']/li[3]/a")
	public static WebElement editScreenformattingTab;

	@FindBy(xpath = "//*[@id='fontFamily_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenFontFamilyDropdown;

	@FindBy(xpath = "//*[@id='fontStyle_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenFontStyleDropdown;

	@FindBy(xpath = "//*[@id='fontWeight_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenFontWeightDropdown;

	@FindBy(xpath = "//*[@id='fontSizes_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenFontSizeDropdown;

	@FindBy(xpath = "//*[@id='fontForeColor_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenForeColourDropdown;

	@FindBy(xpath = "//*[@id='fontBackColor_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenBackColourDropdown;

	@FindBy(xpath = "//*[@id='chkBaseline_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenBaseLineCheckbox;

	@FindBy(xpath = "//*[@id='chkOverLine_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenOverLineCheckbox;

	@FindBy(xpath = "//*[@id='chkStrikeThrough_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement EditScreenStrikeThroughCheckbox;

	@FindBy(xpath = "//*[@id='chkUnderline_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenUnderlineCheckbox;

	@FindBy(xpath = "//*[@id='previewfont_editScreen_FieldsCustomization_FontCtrl']")
	public static WebElement editScreenFontPreviewTxt;

	@FindBy(xpath = "//*[@id='editScreen_FieldsCustomization_Formatting_chkenableFont']")
	public static WebElement editScreenenableFontChkbox;

	@FindBy(xpath = "//i[@class='icon-copyfields icon-font7']")
	public static WebElement editScreenLoadFieldsBtn;

	@FindBy(xpath = "//select[@id='editScreen_voucherDropDown']")
	public static WebElement editScreenLoadFieldsDropdown;

	@FindBy(xpath = "//*[@id='editScreen_copyFieldsDiv']/div[3]/button[1]")
	public static WebElement editScreenselectAllBtn;

	@FindBy(xpath = "//div[@id='editScreen_copyFieldsDiv']//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
	public static WebElement editScreenokBtn;

	@FindBy(xpath = "//input[@id='searchlayout2']")
	public static WebElement editScreenSearchTxt;

	@FindBy(xpath = "//button[@id='btnEditScreenPrev']")
	public static WebElement editScreenPreviousBtn;

	@FindBy(xpath = "//button[@id='btnEditScreenNext']")
	public static WebElement editScreenNextBtn;

	@FindBy(xpath = "//*[@id='editScreen_tabContent']/label")
	public static WebElement editScreenRatePreloadLabel;

	@FindBy(xpath = "//select[@id='cmbBehaviour']")
	public static WebElement editScreenBehaviourDropdown;

	@FindBy(xpath = "//input[@id='editScreen_qtyPreLoaded_textbox']")
	public static WebElement editScreenQuantityPreloadedTxt;

	@FindBy(xpath = "//input[@id='editScreen_qtyPreLoaded_formulaText']")
	public static WebElement formulaTxt;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_expandedFormula']")
	public static WebElement expandeFormula;

	// Grid Elements
	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_1-2']//span[@class='icon-collepse icon-font8']")
	public static WebElement editScreenTransactionExpandBtn;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_2-2']")
	public static WebElement editScreenQuantity;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_2-3']")
	public static WebElement editScreenqty;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_3-2']")
	public static WebElement editScreenRate;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_3-3']")
	public static WebElement editScreenrt;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_4-2']")
	public static WebElement editScreenAlternateQty;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_4-3']")
	public static WebElement editScreenqtya;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_5-2']")
	public static WebElement editScreengrossAmount;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_5-3']")
	public static WebElement editScreengr;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_6-2']")
	public static WebElement editScreenStockValue;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_6-3']")
	public static WebElement editScreenstkv;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_7-2']")
	public static WebElement editScreenAccount;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_7-3']")
	public static WebElement EditScreenacc;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_8-2']")
	public static WebElement editScreenAccount2;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_8-3']")
	public static WebElement editScreenacc2;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_9-2']")
	public static WebElement editScreenExchangeRate;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_9-3']")
	public static WebElement editScreenexrt;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_10-2']")
	public static WebElement editScreenqtyinBaseUnit;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_10-3']")
	public static WebElement editScreenqtyb;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_11-2']")
	public static WebElement editScreenCurrency;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_11-3']")
	public static WebElement editScreencrn;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_12-2']")
	public static WebElement editScreenValueOfThetagMasterIDofTheTag;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_12-3']")
	public static WebElement editScreentgval;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_13-2']")
	public static WebElement editScreenNetAmount;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_13-3']")
	public static WebElement EditScreennet;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_14-2']")
	public static WebElement editScreenNetAmountInOriginalCurrency;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_14-3']")
	public static WebElement editScreenneto;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_15-2']")
	public static WebElement editScreenTotalQuantity;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_15-3']")
	public static WebElement editScreentqty;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_16-2']")
	public static WebElement editScreenTotalGross;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_16-3']")
	public static WebElement editScreentgr;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_17-2']//span[@class='icon-expand icon-font8']")
	public static WebElement screenFiledExpandBtn;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_18-2']")
	public static WebElement mrnQtyInput;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_18-3']")
	public static WebElement sb1;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_19-2']")
	public static WebElement mrnQtyCalculatedValue;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_19-3']")
	public static WebElement sbo1;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_20-2']")
	public static WebElement qtyBalancedInput;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_20-3']")
	public static WebElement sb2;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_21-2']")
	public static WebElement qtyCalculatedValue;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_21-3']")
	public static WebElement sbO2;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_22-2']")
	public static WebElement averagerateInput;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_22-3']")
	public static WebElement sb3;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_23-2']")
	public static WebElement avreageRateCalculatedValue;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_23-3']")
	public static WebElement sbO3;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_24-2']")
	public static WebElement addValueInput;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_24-3']")
	public static WebElement sb4;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_25-2']")
	public static WebElement addValueInputCalculatedValue;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_25-3']")
	public static WebElement sbO4;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_26-2']//span[@class='icon-collepse icon-font8']")
	public static WebElement layoutFieldExpandBtn;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_27-2']")
	public static WebElement appropriateBasedOnInput;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_27-3']")
	public static WebElement lh0;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_28-2']")
	public static WebElement additionalValueInput;

	@FindBy(xpath = "//td[@id='formulaGrideditScreen_qtyPreLoaded_col_28-3']")
	public static WebElement lh1;

	// Grid Completed

	@FindBy(xpath = "//input[@id='editScreen_qtyPreLoaded_availableVariables']")
	public static WebElement editScreenqtyFormulaSearchTxt;

	@FindBy(xpath = "//button[@id='editScreen_qtyPreLoaded_PlusOpt']")
	public static WebElement editScreenqtyPlusBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'-')]")
	public static WebElement editScreenqtyMinusBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded']//button[3]")
	public static WebElement editScreenqtyDivideBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'*')]")
	public static WebElement editScreenqtyMultiplyBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded']//button[5]")
	public static WebElement editScreenqtyBrackets1Btn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded']//button[6]")
	public static WebElement editScreenqtyBrackets2Btn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'~')]")
	public static WebElement editScreenqtyTildeBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'&')]")
	public static WebElement editScreenqtyAndBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'%')]")
	public static WebElement editScreenqtyPercentBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//div[@id='operationButtons']//button[@class='btn btn-link'][contains(text(),']')]")
	public static WebElement editScreenqtySquarebracketBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'|')]")
	public static WebElement editScreenqtyVerticalBarBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'\')]")
	public static WebElement editScreenqtyBackSlashBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'<')]")
	public static WebElement editScreenqtyLessThanbtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'>')]")
	public static WebElement editScreenqtyGreaterThanBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'=')]")
	public static WebElement editScreenqtyExclamationBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'=')]")
	public static WebElement editScreenqtyEqualBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'?:')]")
	public static WebElement editScreenqtyQuestionBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'^')]")
	public static WebElement editScreenqtyCaretBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'DateDiff()')]")
	public static WebElement editScreenqtyDateDiffBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Cond()')]")
	public static WebElement editScreenqtyCondBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Min()')]")
	public static WebElement editScreenqtyMinBtn;

	@FindBy(xpath = "//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Max()')]")
	public static WebElement editScreenqtyMaxBtn;

	@FindBy(xpath = "//button[@id='editScreen_qtyPreLoaded_Ok']")
	public static WebElement editScreenqtyConditionokBtn;

	@FindBy(xpath = "//button[@id='editScreen_qtyPreLoaded_Cancel']")
	public static WebElement editScreenqtyConditioncancelBtn;

	@FindBy(xpath = "//*[@id='editScreen_qtyFormula_textbox']")
	public static WebElement editScreenformulaTxt;

	// CustomizeGrid

	@FindBy(xpath = "//i[@class='icon-custamize icon-font7']")
	public static WebElement editScreencustomizeGridBtn;

	@FindBy(xpath = "//span[contains(text(),'Apportion')")
	public static WebElement editScreenApportionBtn;

	@FindBy(xpath = "//span[contains(text(),'Audit Trial')]")
	public static WebElement editScreenAuditTrialBtn;

	@FindBy(xpath = "//span[contains(text(),'Back color')]")
	public static WebElement editScreenbackColorBtn;

	@FindBy(xpath = "//span[contains(text(),'Banner text')]")
	public static WebElement editScreenbannerTextBtn;

	@FindBy(xpath = "//span[contains(text(),'Cannot be exported')]")
	public static WebElement editScreencannotBeExportedBtn;

	@FindBy(xpath = "//span[contains(text(),'Cannot be imported')]")
	public static WebElement editScreencannotBeImportedBtn;

	@FindBy(xpath = "//span[contains(text(),'Column Span')]")
	public static WebElement editScreencolumnSpanBtn;

	@FindBy(xpath = "//span[contains(text(),'Copy from Parent')]")
	public static WebElement editScreencopyFromParentBtn;

	@FindBy(xpath = "//span[contains(text(),'DataType')]")
	public static WebElement editScreendataTypeBtn;

	@FindBy(xpath = "//span[contains(text(),'Default Value')]")
	public static WebElement editScreenDefaultValueBtn;

	@FindBy(xpath = "//span[contains(text(),'Error message')]")
	public static WebElement editScreenerrorMessageBtn;

	@FindBy(xpath = "//span[contains(text(),'External module attached')]")
	public static WebElement editScreenExternalModuleAttachedBtn;

	@FindBy(xpath = "//span[contains(text(),'Field Order')]")
	public static WebElement editScreenFilterOrderBtn;

	@FindBy(xpath = "//span[contains(text(),'Font')]")
	public static WebElement editScreenFontBtn;

	@FindBy(xpath = "//span[contains(text(),'Group Name')]")
	public static WebElement editScreengroupNameBtn;

	@FindBy(xpath = "//span[contains(text(),'Hide left panel')]")
	public static WebElement editScreenHideLeftPanelBtn;

	@FindBy(xpath = "//span[contains(text(),'Information Field')]")
	public static WebElement editScreenInformationFieldBtn;

	@FindBy(xpath = "//span[contains(text(),'Mandatory')]")
	public static WebElement editScreenMandatoryBtn;

	@FindBy(xpath = "//span[contains(text(),'Mass Update')]")
	public static WebElement editScreenMassupdateBtn;

	@FindBy(xpath = "//span[contains(text(),'Maximum Value')]")
	public static WebElement editScreenMaximumValueBtn;

	@FindBy(xpath = "//span[contains(text(),'Merge Field')]")
	public static WebElement editScreenMergerFieldBtn;

	@FindBy(xpath = "//span[contains(text(),'Minimum Value')]")
	public static WebElement editScreenMinimumValueBtn;

	@FindBy(xpath = "//span[contains(text(),'No Of Decimals')]")
	public static WebElement editScreenNoOfDecimalsBtn;

	@FindBy(xpath = "//span[contains(text(),'Not available for reports')]")
	public static WebElement editScreenNotAvailableForReportsBtn;

	@FindBy(xpath = "//span[contains(text(),'Read Only')]")
	public static WebElement editScreenReadOnlyBtn;

	@FindBy(xpath = "//span[contains(text(),'Regular expression')]")
	public static WebElement editScreenRegularExpressionBtn;

	@FindBy(xpath = "//span[contains(text(),'Restrict formula')]")
	public static WebElement editScreenRestrictFormulaBtn;

	@FindBy(xpath = "//span[contains(text(),'Restrict Message')]")
	public static WebElement editScreenRestrictMessageBtn;

	@FindBy(xpath = "//span[contains(text(),'Round Offs')]")
	public static WebElement editScreenRoundsOffsBtn;

	@FindBy(xpath = "//span[contains(text(),'Row Span')]")
	public static WebElement editScreenRowSpanBtn;

	@FindBy(xpath = "//span[contains(text(),'Rule Attached')]")
	public static WebElement editScreenRuleAttachedBtn;

	@FindBy(xpath = "//span[contains(text(),'Tooltip')]")
	public static WebElement editScreenToolTipBtn;

	@FindBy(xpath = "//span[contains(text(),'Variable name')]")
	public static WebElement editScreenVariableNameBtn;

	// Body Tab

	@FindBy(xpath = "//a[contains(text(),'Body')]")
	public static WebElement editScreenBodyTab;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_1 _1']//span[@id='editIcon']")
	public static WebElement editScreenBody1stRowEditBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_1 _1']//span[@id='deleteIcon']")
	public static WebElement editScreenBody1stRowDeleteBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_2 _1']//span[@id='editIcon']")
	public static WebElement editScreenBody2ndRowEditBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_2 _1']//span[@id='deleteIcon']")
	public static WebElement editScreenBody2ndRowDeleteBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_3 _1']//span[@id='editIcon']")
	public static WebElement editScreenBody3rdRowEditBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_3 _1']//span[@id='deleteIcon']")
	public static WebElement editScreenBody3rdRowDeleteBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_4 _1']//span[@id='editIcon']")
	public static WebElement editScreenBody4thRowEditBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_4 _1']//span[@id='deleteIcon']")
	public static WebElement editScreenBody4thRowDeleteBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_5 _1']//span[@id='editIcon']")
	public static WebElement editScreenBody5thRowEditBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_5 _1']//span[@id='deleteIcon']")
	public static WebElement editScreenBody5thRowDeleteBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_6 _1']//span[@id='editIcon']")
	public static WebElement editScreenBody6thRowEditBtn;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_6 _1']//span[@id='deleteIcon']")
	public static WebElement editScreenBody6thRowDeleteBtn;

	@FindBy(xpath = "//div[@id='editScreen_body']//button[@class='icon-up-arrow Fbutton']")
	public static WebElement editScreenBodyUpArrowBtn;

	@FindBy(xpath = "//div[@id='editScreen_body']//button[@class='icon-down-arrow Fbutton']")
	public static WebElement editScreenBodyDownArrowBtn;

	// Footer Tab

	@FindBy(xpath = "//a[contains(text(),'Footer')]")
	public static WebElement editScreenFooterTab;

	@FindBy(xpath = "//td[@id='editScreen_footerrow_1 _1']//span[@id='editIcon']")
	public static WebElement editScreenFooter1stRowEditBtn;

	@FindBy(xpath = "//td[@id='editScreen_footerrow_1 _1']//span[@id='deleteIcon']")
	public static WebElement editScreenFooter1stRowDeleteBtn;

	@FindBy(xpath = "//td[@id='editScreen_footerrow_2 _1']//span[@id='editIcon']")
	public static WebElement editScreenFooter2ndRowEditBtn;

	@FindBy(xpath = "//td[@id='editScreen_footerrow_2 _1']//span[@id='deleteIcon']")
	public static WebElement editScreenFooter2ndRowDeleteBtn;

	@FindBy(xpath = "//div[@id='editScreen_footer']//button[@class='icon-up-arrow Fbutton']")
	public static WebElement editScreenFooterUpArrowBtn;

	@FindBy(xpath = "//div[@id='editScreen_footer']//button[@class='icon-down-arrow Fbutton']")
	public static WebElement editScreenFooterDownArrowBtn;

	@FindBy(xpath = "//label[contains(text(),'Quantity preloaded')]")
	public static WebElement qtyPreloadedLabel;

	@FindBy(xpath = "//input[@id='editScreen_qtyPreLoaded_textbox']")
	public static WebElement qtyPreloadedTxt;

	@FindBy(xpath = "//input[@id='editScreen_qtyPreLoaded_formulaText']")
	public static WebElement qtyPreloadedformulaTxt;

	@FindBy(xpath = "//input[@id='editScreen_qtyPreLoaded_availableVariables']")
	public static WebElement qtyPreloadedFormulaSearchTxt;

	@FindBy(xpath = "//button[@id='editScreen_qtyPreLoaded_Ok']")
	public static WebElement qtyPreloadedFormulaokBtn;

	@FindBy(xpath = "//button[@id='editScreen_qtyPreLoaded_Cancel']")
	public static WebElement qtyPreloadedFormulacancelBtn;

	@FindBy(xpath = "//*[@id='editScreen_copyFieldsOptFields']/div[1]/label/span")
	public static WebElement editScreenLoadFields1stChkBox;

	@FindBy(xpath = "//*[@id='editScreen_copyFieldsOptFields']/div[2]/label/span")
	public static WebElement editScreenLoadFields2ndChkBox;

	@FindBy(xpath = "//*[@id='editScreen_copyFieldsOptFields']/div[3]/label/span")
	public static WebElement editScreenLoadFields3rdChkBox;

	@FindBy(xpath = "//*[@id='editScreen_copyFieldsOptFields']/div[4]/label/span")
	public static WebElement editScreenLoadFields4thChkBox;

	@FindBy(xpath = "//*[@id='editScreen_copyFieldsOptFields']/div[5]/label/span")
	public static WebElement editScreenLoadFields5hChkBox;

	@FindBy(xpath = "//*[@id='editScreen_copyFieldsOptFields']/div[6]/label/span")
	public static WebElement editScreenLoadFields6thChkBox;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_PreLoad_formulaText']")
	public static WebElement preloadformulaTxt;

	@FindBy(xpath = "//input[@id='editScreen_FieldsCustomization_PreLoad_availableVariables']")
	public static WebElement preloadFormulaSearchTxt;

	@FindBy(xpath = "//button[@id='editScreen_FieldsCustomization_PreLoad_Ok']")
	public static WebElement preloadFormulaokBtn;

	@FindBy(xpath = "//button[@id='editScreen_FieldsCustomization_PreLoad_Cancel']")
	public static WebElement preloadFormulacancelBtn;

	@FindBy(xpath = "//td[@id='editScreen_footerrow_1 _3']")
	public static WebElement editScreenFooter1stRowCaption;

	@FindBy(xpath = "//td[@id='editScreen_footerrow_1 _3']")
	public static WebElement editScreenFooter2ndRowCaption;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_1 _3']")
	public static WebElement editScreenbody1stRowCaption;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_2 _3']")
	public static WebElement editScreenbody2ndRowCaption;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_3 _3']")
	public static WebElement editScreenbody3rdRowCaption;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_4 _3']")
	public static WebElement editScreenbody4thRowCaption;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_5 _3']")
	public static WebElement editScreenbody5thRowCaption;

	// Add To Stock Status

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_1 _14']")
	public static WebElement editScreenbody1stRowAddtoStock;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_2 _14']")
	public static WebElement editScreenbody2ndRowAddtoStock;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_3 _14']")
	public static WebElement editScreenbody3rdRowAddtoStock;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_4 _14']")
	public static WebElement editScreenbody4thRowAddtoStock;

	@FindBy(xpath = "//td[@id='editScreen_bodyrow_5 _14']")
	public static WebElement editScreenbody5thRowAddtoStock;

	// Suspend Status Of Entry Page
	@FindBy(xpath = "//tr[1]//td[11]")
	public static WebElement suspendStatusRow1;

	// Inentory Menu

	@FindBy(xpath = "//a[@id='137']//span[contains(text(),'Transactions')]")
	public static WebElement invTransactionsMenu;

	@FindBy(xpath = "//a[@id='139']//span[contains(text(),'Purchases')]")
	public static WebElement invTransPurchasesMenu;

	@FindBy(xpath = "//a[@id='140']//span[contains(text(),'Sales')]")
	public static WebElement invTransSalesMenu;

	@FindBy(xpath = "//a[@id='200']//span[contains(text(),'Reports')]")
	public static WebElement inventoryReportsMenu;

	@FindBy(xpath = "//span[contains(text(),'Order Management')]")
	public static WebElement orderManagementMenu;

	@FindBy(xpath = "//*[@id='645']")
	public static WebElement stockBalByWarehouse;

	// Home Menu
	@FindBy(xpath = "//*[@id='1' and @title='Home']")
	public static WebElement homeMenu;

	@FindBy(xpath = "//select[@id='misc_arapOptions']")
	public static WebElement Setting_MisOptiosnsDrpdwn;

	@FindBy(xpath = "//input[@id='id_body_536870915']")
	public static WebElement enter_DepartmentTxt;

	// Financial Menu

	// Fixed Assets Menu
	@FindBy(xpath = "//span[@class='icon-assets icon-font1']")
	public static WebElement fixedAssetsMenu;

	// Production Menu
	@FindBy(xpath = "//span[@class='icon-production icon-font1']")
	public static WebElement productionMenu;

	// Point Of Sale Menu
	@FindBy(xpath = "//div[contains(text(),'Point of Sale')]")
	public static WebElement pointOfSaleMenu;

	// Quality Of Control Menu
	@FindBy(xpath = "//span[@class='icon-quotationanalysis icon-font1']")
	public static WebElement qualityControlMenu;

	// Settings Menu
	@FindBy(xpath = "//*[@title='Settings']")
	public static WebElement SettingsMenu;

	// Login Page
	@FindBy(xpath = "//*[@id='txtUsername']")
	public static WebElement username;

	@FindBy(xpath = "//input[@id='id_body_14']")
	public static WebElement enterBody_Currency;

	@FindBy(xpath = "//input[@id='id_body_15']")
	public static WebElement enterBody_ExchangeRate;

	@FindBy(xpath = "//input[@id='id_body_145']")
	public static WebElement enterBody_LocExgRate;

	@FindBy(xpath = "(//*[@id='16']/span)[1]")
	public static WebElement SettingsmenuBtn;

	@FindBy(xpath = "//input[@id='id_body_12']")
	public static WebElement enter_SalesAccount;

	@FindBy(xpath = "//tbody[@id='id_body_12_table_body']/tr/td[2]")
	public static List<WebElement> salesAccountBodyComboList;

	@FindBy(xpath = "//input[@id='id_body_33554522']")
	public static WebElement enter_PvTaxable;

	@FindBy(xpath = "//input[@id='id_body_12']")
	public static WebElement enter_PurchaseAccountTxt;

	@FindBy(xpath = "//input[@id='id_body_33554521']")
	public static WebElement enter_PvVat;

	@FindBy(xpath = "//input[@id='id_body_16777328']")
	public static WebElement enter_TaxCode;
	
	@FindBy(xpath = "//input[@id='id_body_16777323']")
	public static WebElement enter_TaxCode1;

	@FindBy(xpath = "//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
	public static List<WebElement> grid_CheckBoxList;

	@FindBy(xpath = "//*[@id='id_header_4_table_body']/tr")
	public static List<WebElement> customerAccountList;

	@FindBy(xpath = "//tbody[@id='tblBodyTransRender']/tr/td[4]")
	public static List<WebElement> grid_VoucherNoList;

	@FindBy(xpath = "//input[@id='id_header_11']")
	public static WebElement voucherHeaderExchangeRate;

	@FindBy(xpath = "//input[@id='id_header_268435470']")
	public static WebElement placeOFSupplyTxt;

	@FindBy(xpath = "//input[@id='id_header_268435471']")
	public static WebElement jurisdictionTxt;

	@FindBy(xpath = "//a[@id='2014']")
	public static WebElement financialTransactionSalesMenu;

	@FindBy(xpath = "//*[@id='id_transactionentry_save']/a/span")
	public static WebElement vouEntryPageSaveBtn;

	@FindBy(xpath = "//span[contains(text(),'Sales invoice VAT')]")
	public static WebElement salesInvoiceVATVoucher;

	@FindBy(xpath = "//input[@id='id_header_268435470']")
	public static WebElement salesInvoiceVATPlaceOFSupply;

	@FindBy(xpath = "//tbody[@id='id_header_268435470_table_body']/tr/td[2]")
	public static List<WebElement> placeOFSupplyList;

	@FindBy(xpath = "//tbody[@id='id_header_4_table_body']/tr/td[2]")
	public static List<WebElement> customerAccountListCount;
	
	@FindBy(xpath="//*[@title='STOCK ITEM']//..//input")
	public static WebElement  stockItem_ItemChkbox;
	
	@FindBy(xpath="//*[@id='divMandatoryValidationsSupCode']/../table/tbody//tr[1]//td[5]")
	public static WebElement  stockItem_ODBodyR1C2;
	
	@FindBy(xpath="//*[@id='divMandatoryValidationsSupCode']/../table/tbody//tr[2]//td[5]")
	public static WebElement  stockItem_ODBodyR2C2;
	
	
	
	  @FindBy(xpath="//*[@id='iSupplier']")
	  public static WebElement supplierRow1;

	  
	  @FindBy(xpath="//*[@id='iSupplier']")
	  public static WebElement supplierRow2;

	  
	  //@FindBy(xpath="//*[@id='iSupplier']")
	  @FindBy(xpath="//*[@id='sBarcode']")
	  public static WebElement enterSupplier;

	  


	
	@FindBy(xpath = "//tbody[@id='id_header_3_table_body']/tr/td[2]")
	public static List<WebElement> purchasesAccountListCount;
	
	@FindBy(xpath = "//tbody[@id='id_header_4_table_body']/tr/td[2]")
	public static List<WebElement> cnAccountListCount;

	@FindBy(xpath = "//tbody[@id='id_body_536870916_table_body']/tr/td[2]")
	public static List<WebElement> pvwareHouseListCount;

	@FindBy(xpath = "//input[@id='id_body_33554502']")
	public static WebElement so_enter_AQTxt;

	@FindBy(xpath = "//input[@id='id_body_33554503']")
	public static WebElement so_enter_FQTxt;

	@FindBy(xpath = "//tbody[@id='id_body_23_table_body']/tr/td[2]")
	public static List<WebElement> itemListCount;

	@FindBy(xpath = "//input[@id='id_body_16777328']")
	public static WebElement enterSalesTaxcode;

	@FindBy(xpath = "//input[@id='id_body_33554511']")
	public static WebElement enter_AQTxt;

	@FindBy(xpath = "//input[@id='id_body_33554512']")
	public static WebElement enter_FQTxt;

	@FindBy(xpath = "//input[@id='id_body_33554543']")
	public static WebElement enter_SalesNewRefAQTxt;

	@FindBy(xpath = "//input[@id='id_body_33554544']")
	public static WebElement enter_SalesNewRefFQTxt;

	@FindBy(xpath = "//button[contains(text(),'Pick on FIFO')]")
	public static WebElement batchPickOnFIFOIcon;

	@FindBy(xpath = "//*[@id='div_Ok1']")
	public static WebElement batchOkIcon;

	@FindBy(xpath = "//*[@id='Id_RMAReservation_FGrid_body']/tr/td[4]")
	public static List<WebElement> salesOrdPopUPRMANoList;

	@FindBy(xpath = "//*[@id='Id_RMAReservation_FGrid_body']/tr/td[5]/input")
	public static List<WebElement> salesOrdPopUPRMAChkbox;

	@FindBy(xpath = "//*[@id='Id_RMAReservation_FGrid_body']/tr/td[6]/input")
	public static List<WebElement> salesOrdPopUPRMAChkboxUpdate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[1]/td")
	public static List<WebElement> workFlowRow1List;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[1]/td")
	public static List<WebElement> salesInvoiceBatchPopupRow1List;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr/td[2]")
	public static List<WebElement> salesInvoiceBatchNoList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_workflow_popup_control_heading_ctrl_1']")
	public static WebElement workFlowSelectAllChkbox;

	@FindBy(xpath = "(//input[@value='Ok'])[3]")
	public static WebElement workFlowOkBtn;

	// Recepits

	@FindBy(xpath = "//input[@id='id_body_16777330']")
	public static WebElement enterReceiptsVATTaxCode;

	@FindBy(xpath = "//input[@id='id_header_268435470']")
	public static WebElement placeofSupplyTxt;

	@FindBy(xpath = "//tbody[@id='id_header_268435470_table_body']/tr/td[2]")
	public static List<WebElement> placeofSupplyList;

	@FindBy(xpath = "//tbody[@id='id_header_268435471_table_body']/tr/td[2]")
	public static List<WebElement> jurisdictionList;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[3]")
	public static List<WebElement> billwiseAdjustBillsDocList;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[13]")
	public static List<WebElement> billwiseAdjustBillsAdjustColumn;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[2]/input")
	public static List<WebElement> billwiseAdjustBillsChkBoxList;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[1]/td[2]/input")
	public static WebElement billrefAdjuBills1stChkbox;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[2]/td[2]/input")
	public static WebElement billrefAdjuBills2ndChkbox;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[3]/td[2]/input")
	public static WebElement billrefAdjuBills3rdChkbox;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr")
	public static List<WebElement> billRefAdjustBillsGridList;

	@FindBy(xpath = "//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	public static WebElement recepitsFooterAmt;

	@FindBy(xpath = "//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
	public static List<WebElement> voucherGridIndexChkBox;

	@FindBy(xpath = "//a[contains(text(),'Pending Sales Orders')]")
	public static WebElement homepagePendingSalesOrders;

	@FindBy(xpath = "//span[contains(text(),'Sales Returns')]")
	public static WebElement salesReturnsVoucher;

	@FindBy(xpath = "//a[contains(text(),'Pending Sales invoice VAT')]")
	public static WebElement pendingSalesInvoicesView;

	@FindBy(xpath = "//tbody[@id='tblBodyTransRender']/tr/td[5]")
	public static List<WebElement> voucherGridDocNo;

	@FindBy(xpath = "//*[@id='2023']")
	public static WebElement finTransJournalsMenu;
	
	
	@FindBy(xpath="(//*[contains(text(),'Journal Entries')])[1]")
	public static WebElement  journalEntriesBtn;

	@FindBy(xpath = "//input[@id='id_body_16777336']")
	public static WebElement jvvatTaxcode;

	@FindBy(xpath = "//*[@id='id_header_6_input_container']/div[1]/i[2]")
	public static WebElement dueDateCalenderIcon;

	@FindBy(xpath = "//*[@id='id_header_6_day_today']/td/span[1]")
	public static WebElement todaysDatePicker;

	@FindBy(xpath = "//span[contains(text(),'Credit Notes VAT')]")
	public static WebElement creditNotesVATMenu;

	@FindBy(xpath = "//span[contains(text(),'Debit Notes VAT')]")
	public static WebElement debitNotesVatMenu;

	@FindBy(xpath = "//*[@id='id_body_12_table_body']/tr/td[2]")
	public static List<WebElement> accountListCount;

	@FindBy(xpath = "//tbody[@id='tblBodyTransRender']/tr[1]/td[11]")
	public static WebElement voucherHomeRow1SuspendedStatus;

	@FindBy(xpath = "//tbody[@id='tblBodyTransRender']/tr[1]/td[12]")
	public static WebElement voucherHomePageSuspendedStatus;

	// PDC VOUCHERS

	@FindBy(xpath = "//*[@id='16']")
	public static WebElement settingsMenu;

	@FindBy(xpath = "//span[contains(text(),'Configure Transactions')]")
	public static WebElement settingsConfigureTransactions;

	@FindBy(xpath = "//ul[@id='preferenceUL']//ul//li//a[@id='3']")
	public static WebElement ARAPBtn;
	
	@FindBy(xpath="//*[@id='chktagrestrictionsinadjustments']")
	public static WebElement enableAcTagInAdjustmentsChkbox;
	
	
	@FindBy(xpath="//*[@id='chktagrestrictionsinadjustments']/following-sibling::span")
	public static WebElement enableAcTagInAdjustmentsChkboxSelect;
	
	
	
	@FindBy(xpath = "//*[@id='dvPickCreditDayFromSalesAC_1']")
	public static WebElement paymentTermsRadioBtn;
	
	

	@FindBy(xpath = "//*[@id='chkChangepaymenttermininvoice']//following-sibling::span")
	public static WebElement changePaymentTermsChkbox;
	
	
	@FindBy(xpath = "//*[@id='chkChangepaymenttermininvoice']")
	public static WebElement changePaymentTermsChkboxIsSelected;
	
	@FindBy(xpath = "//*[@id='txtsrch-term']")
	public static WebElement itemmastersearchbox;

	@FindBy(xpath = "//input[@id='iCreditDays']")
	public static WebElement creditdaysTxt;
	
	@FindBy(xpath = "//*[@id='Accounts']")
	public static WebElement accountingTAG;
	
	@FindBy(xpath = "//*[@id='dvPickCreditDayFromSalesAC_2']")
	public static WebElement pickcreditDaysFromSalesAcc;
	

	@FindBy(xpath = "//*[@id='Inventory']")
	public static WebElement inventoryTAG;
	
	@FindBy(xpath = "//*[@class='btn Fbutton fixed']")
	public static WebElement RunTime_serverErrorCloseBtn;
	
	
	
	@FindBy(xpath = "//*[@id='5']")
	public static WebElement PDCMenu;

	@FindBy(xpath = "//*[@id='dvCheckPDC']/div/label/span")
	public static WebElement pdcPostDatedChequeChkbox;

	@FindBy(xpath = "//input[@id='chkAutoCheckMaturedPDC']")
	public static WebElement pdcAutoCheckforMaturedChkbox;

	@FindBy(xpath = "//*[@id='gphDisplayInLedger']")
	public static WebElement pdcDisplayinLedgerChkbox;

	@FindBy(xpath = "//*[@id='gphDisplayInLedger']/following-sibling::span")
	public static WebElement pdcDisplayinLedgerChkboxisselcted;

	@FindBy(xpath = "//input[@id='chkDependsonmaintainbillwiseforAR_AP']")
	public static WebElement dependsonmaintainbillwiseforAR_APChkboxIsSelected;

	@FindBy(xpath = "//input[@id='chkDependsonmaintainbillwiseforAR_AP']/following-sibling::span")
	public static WebElement dependsonmaintainbillwiseforAR_APChkbox;

	@FindBy(xpath = "//input[@id='chkInputNarrationInReferences']")
	public static WebElement inputNarrationInReferencesChkbox;

	@FindBy(xpath = "(//span[text()='Preferences'])[2]")
	public static WebElement Setting_PerferenceMenu;

	@FindBy(xpath = "//input[@id='id_header_21']")
	public static WebElement salesVATRaiseReceiptChkbox;

	@FindBy(xpath = "//*[@id='chkReverseACPostPDCConversion']")
	public static WebElement pdcReseverseAccountpostingOnPDCConversionChkbox;

	@FindBy(xpath = "//*[@id='chkReverseACPostPDCConversion']/following-sibling::span")
	public static WebElement pdcReseverseAccountpostingOnPDCConversionChkboxIsSelected;

	@FindBy(xpath = "//*[@id='id_transactionentry_save']")
	public static WebElement voucherSaveBtn;

	@FindBy(xpath = "//input[@id='PDCDiscountedAccount']")
	public static WebElement pdcCheckDiscountingTxt;

	@FindBy(xpath = "//input[@id='PDCDiscountedVoucherType']")
	public static WebElement pdcChequeDiscountingVoucherType;

	@FindBy(xpath = "//*[text()='PDC']")
	public static WebElement PDCBtn;
	
					 
	@FindBy(xpath = "//*[@class='icon-filter2 hiconright2']")
	public static WebElement reportCusBtn;
	
	
	@FindBy(xpath = "//*[@class='icon-delete hiconright2']")
	public static WebElement reportCusDeleteBtn;
	
	
	@FindBy(xpath = "(//*[@class='icon-delete hiconright2'])[1]")
	public static WebElement homepageDeleteBtn;
	
	

	@FindBy(xpath = "//*[@id='gphDisplayInLedger']/following-sibling::span")
	public static WebElement displayLedgerAndBalanceChkbox;

	@FindBy(xpath = "//*[@id='gphDisplayInLedger']")
	public static WebElement displayLedgerAndBalanceChkboxIsSelcted;

	@FindBy(xpath = "//*[@id='chkPostDatedCheques']")
	public static WebElement postDatedChequeChkboxIsSelcted;

	@FindBy(xpath = "//*[@id='chkPostDatedCheques']/following-sibling::span")
	public static WebElement postDatedChequeChkbox;

	@FindBy(xpath = "//*[@id='navigationtab3']")
	public static WebElement editLayoutTab;

	@FindBy(xpath = "//*[@class='icon-new hiconright2']")
	public static WebElement editLayoutAddFieldsBtn;

	@FindBy(xpath = "//*[@id='EditLayout_FieldsCustomization_FieldDetails_Caption']")
	public static WebElement editLayoutCaptionTxt;

	@FindBy(xpath = "//*[@value='Apply']")
	public static WebElement editLayoutApplyBtn;

	@FindBy(xpath = "//input[@id='id_header_67108998']")
	public static WebElement voucherHeaderPDCNOTxt;

	@FindBy(xpath = "//input[@id='id_header_67109035']")
	public static WebElement voucherPaymentsHeaderPDCNOTxt;

	@FindBy(xpath = "//*[@id='90']/span")
	public static WebElement convertMaturedPDCs;

	@FindBy(xpath = "//div[@class='navText']//span[contains(text(),'Convert Matured PDCs')]")
	public static WebElement convertMaturedPDCsLabel;

	@FindBy(xpath = "//*[@id='219']")
	public static WebElement autoPostingMenu;

	@FindBy(xpath = "//*[@id='90']")
	public static WebElement convertMaturedPDCSMenu;

	@FindBy(xpath = "//input[@id='start_date']")
	public static WebElement asOnDateTxt;

	@FindBy(xpath = "//input[@id='chkReassign']")
	public static WebElement reassignChkbox;

	@FindBy(xpath = "//*[@id='PDCConversionContainer']/div[2]/div[2]/label/span")
	public static WebElement postOnDateChkbox;

	@FindBy(xpath = "//input[@id='post_date']")
	public static WebElement postOnDateTxt;

	@FindBy(xpath = "//input[@id='chkSelectAll']")
	public static WebElement gridSelectAllOption;

	@FindBy(xpath = "//input[@id='chkColumn']")
	public static WebElement gridSelectAllCOl;

	@FindBy(xpath = "//input[@id='chkSelect1']")
	public static WebElement gridSelectRow1Chkbox;

	@FindBy(xpath = "//input[@id='chkSelect3']")
	public static WebElement gridSelectRow3Chkbox;

	@FindBy(xpath = "//input[@id='chkSelect2']")
	public static WebElement gridSelectRow2Chkbox;

	@FindBy(xpath = "//input[@id='vNo1']")
	public static WebElement gridVoucherNoRow1Chkbox;

	@FindBy(xpath = "//input[@id='vNo2']")
	public static WebElement gridVoucherNoRow2Chkbox;

	@FindBy(xpath = "//input[@id='DateNo1']")
	public static WebElement gridVoucherDateRow1Chkbox;

	@FindBy(xpath = "//input[@id='DateNo2']")
	public static WebElement gridVoucherDateRow2Chkbox;

	@FindBy(xpath = "//i[@class='icon-font6 icon-clear']")
	public static WebElement convertMaturedPDCsClearIcon;

	@FindBy(xpath = "//*[@id='btnOK']")
	public static WebElement convertMaturedPDCsOkIcon;

	@FindBy(xpath = "//*[@id='btnReportcancel']/a/i")
	public static WebElement convertMaturedPDCsCancelIcon;

	@FindBy(xpath = "//div[contains(text(),'PDC Doc')]")
	public static WebElement gridPDCTxt;

	@FindBy(xpath = "//div[contains(text(),'Converted Document')]")
	public static WebElement gridConvertedDocumentTxt;

	@FindBy(xpath = "//div[contains(text(),'Bank')]")
	public static WebElement gridBankTxt;

	@FindBy(xpath = "//th[@id='mytable_control_heading_7']//div[contains(text(),'Voucher No')]")
	public static WebElement gridVoucherNoTxt;

	@FindBy(xpath = "//div[contains(text(),'Voucher Date')]")
	public static WebElement gridVoucherBodyTxt;

	@FindBy(xpath = "//div[contains(text(),'Prefix')]")
	public static WebElement gridPrefixTxt;

	@FindBy(xpath = "//input[@id='DepositingBank']")
	public static WebElement pdcVoucherDepositingBankDropdown;

	@FindBy(xpath = "//input[@id='btnDepositingBank']")
	public static WebElement pdcVoucherApplyIcon;

	@FindBy(xpath = "//i[@class='icon-custamize icon-font6']")
	public static WebElement pdcCustamizeIcon;

	@FindBy(xpath = "//*[@id='btnOkToConvert']/a/i")
	public static WebElement pdcVoucherOkIcon;

	@FindBy(xpath = "//*[@id='btnReportcancel']/a/i")
	public static WebElement pdcVoucherCancelIcon;

	@FindBy(xpath = "//div[contains(text(),'Number')]")
	public static WebElement gridNumberTxt;

	@FindBy(xpath = "//div[contains(text(),'Maturity Date')]")
	public static WebElement gridMatureDateTXt;

	@FindBy(xpath = "//div[contains(text(),'Name')]")
	public static WebElement gridNameTxt;

	@FindBy(xpath = "//div[contains(text(),'Applied Bank')]")
	public static WebElement gridAppliedBankTxt;

	@FindBy(xpath = "//div[contains(text(),'Amount')]")
	public static WebElement gridAmountTxt;

	@FindBy(xpath = "//div[contains(text(),'Reassigned V No')]")
	public static WebElement gridReassignesVoucherNoTxt;

	// Post Dated Recepits

	@FindBy(xpath = "//*[@id='chkColumn_1']")
	public static WebElement pdcGridRow1Chkbox;

	
	@FindBy(xpath = "//*[@id='mainTable_body']/tr[1]/td")
	public static List<WebElement> PDC_Row1List;
	
	
	@FindBy(xpath = "//*[@id='mainTable_body']/tr[2]/td")
	public static List<WebElement> PDC_Row2List;
	
	
	
	@FindBy(xpath = "//td[@id='mainTable_col_1-3']")
	public static WebElement pdcGridRow1Col3;

	@FindBy(xpath = "//td[@id='mainTable_col_1-4']")
	public static WebElement pdcGridRow1Col4;

	@FindBy(xpath = "//td[@id='mainTable_col_1-5']") // *[@id='mainTable_col_1-3']
	public static WebElement pdcGridRow1Col5;

	@FindBy(xpath = "//td[@id='mainTable_col_1-6']")
	public static WebElement pdcGridRow1Col6;

	@FindBy(xpath = "//td[@id='mainTable_col_1-7']")
	public static WebElement pdcGridRow1Col7;

	@FindBy(xpath = "//td[@id='mainTable_col_1-8']")
	public static WebElement pdcGridRow1Col8;

	@FindBy(xpath = "//td[@id='mainTable_col_1-10']")
	public static WebElement pdcGridRow1Col9;

	@FindBy(xpath = "//input[@id='chkColumn_2']")
	public static WebElement pdcGridRow2Chkbox;

	@FindBy(xpath = "//td[@id='mainTable_col_2-3']")
	public static WebElement pdcGridRow2Col3;

	@FindBy(xpath = "//td[@id='mainTable_col_2-4']")
	public static WebElement pdcGridRow2Col4;

	@FindBy(xpath = "//td[@id='mainTable_col_2-5']")
	public static WebElement pdcGridRow2Col5;

	@FindBy(xpath = "//td[@id='mainTable_col_2-6']")
	public static WebElement pdcGridRow2Col6;

	@FindBy(xpath = "//td[@id='mainTable_col_2-7']")
	public static WebElement pdcGridRow2Col7;

	@FindBy(xpath = "//td[@id='mainTable_col_2-8']")
	public static WebElement pdcGridRow2Col8;

	@FindBy(xpath = "//td[@id='mainTable_col_2-10']")
	public static WebElement pdcGridRow2Col9;

	@FindBy(xpath = "//input[@id='chkColumn_3']")
	public static WebElement pdcGridRow3Chkbox;

	@FindBy(xpath = "//td[@id='mainTable_col_3-3']")
	public static WebElement pdcGridRow3Col3;

	@FindBy(xpath = "//td[@id='mainTable_col_3-4']")
	public static WebElement pdcGridRow3Col4;

	@FindBy(xpath = "//td[@id='mainTable_col_3-5']")
	public static WebElement pdcGridRow3Col5;

	@FindBy(xpath = "//td[@id='mainTable_col_3-6']")
	public static WebElement pdcGridRow3Col6;

	@FindBy(xpath = "//td[@id='mainTable_col_3-7']")
	public static WebElement pdcGridRow3Col7;

	@FindBy(xpath = "//td[@id='mainTable_col_3-8']")
	public static WebElement pdcGridRow3Col8;

	@FindBy(xpath = "//td[@id='mainTable_col_3-10']")
	public static WebElement pdcGridRow3Col9;

	@FindBy(xpath = "//input[@id='chkColumn_4']")
	public static WebElement pdcGridRow4Chkbox;

	@FindBy(xpath = "//td[@id='mainTable_col_4-3']")
	public static WebElement pdcGridRow4Col3;

	@FindBy(xpath = "//td[@id='mainTable_col_4-4']")
	public static WebElement pdcGridRow4Col4;

	@FindBy(xpath = "//td[@id='mainTable_col_4-5']")
	public static WebElement pdcGridRow4Col5;

	@FindBy(xpath = "//td[@id='mainTable_col_4-6']")
	public static WebElement pdcGridRow4Col6;

	@FindBy(xpath = "//td[@id='mainTable_col_4-7']")
	public static WebElement pdcGridRow4Col7;

	@FindBy(xpath = "//td[@id='mainTable_col_4-8']")
	public static WebElement pdcGridRow4Col8;

	@FindBy(xpath = "//td[@id='mainTable_col_4-10']")
	public static WebElement pdcGridRow4Col9;

	@FindBy(xpath = "//span[contains(text(),'PDR VAT')]")
	public static WebElement PDRVAT;

	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_5']//div[contains(text(),'Exchange Diff')]")
	public static WebElement gridExchangeDiffTxt;

	@FindBy(xpath = "//div[contains(text(),'Local Exchange Diff')]")
	public static WebElement gridLocalExchangeDiff;

	@FindBy(xpath = "//div[contains(text(),'Account')]")
	public static WebElement gridAccTxt;

	@FindBy(xpath = "//div[contains(text(),'Amount')]")
	public static WebElement gridAmtTxt;

	@FindBy(xpath = "//div[contains(text(),'Reference')]")
	public static WebElement gridReferenceTxt;

	@FindBy(xpath = "//div[contains(text(),'Remarks')]")
	public static WebElement vocbodyRemarksTxt;

	@FindBy(xpath = "//div[contains(text(),'Tax Code')]")
	public static WebElement vocbodyTaxCodeTxt;

	@FindBy(xpath = "//div[contains(text(),'VAT')]")
	public static WebElement vocbodyVATTxt;

	@FindBy(xpath = "//div[contains(text(),'Amount')]")
	public static WebElement vocBodyAmountTxt;

	@FindBy(xpath = "//div[contains(text(),'Remarks')]")
	public static WebElement vocBodyRemarksTxt;

	@FindBy(xpath = "//div[contains(text(),'Account')]")
	public static WebElement vocBodyAccTxt;

	@FindBy(xpath = "//div[contains(text(),'Debit')]")
	public static WebElement vocBodyDebitTxt;

	@FindBy(xpath = "//div[contains(text(),'Credit')]")
	public static WebElement vocBodyCreditTxt;

	@FindBy(xpath = "//div[contains(text(),'Reference')]")
	public static WebElement vocBodyReferenceTxt;

	@FindBy(xpath = "//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
	public static List<WebElement> wareHouseListCount;

	@FindBy(xpath = "//*[@id='id_header_268435470_table_body']/tr/td[2]")
	public static List<WebElement> placeOfSupplyList;

	@FindBy(xpath = "//*[@id='id_header_268435471_table_body']/tr/td[2]")
	public static List<WebElement> jurdictionList;

	@FindBy(xpath = "//tbody//input[@placeholder='Value']")
	public static WebElement pdcVoucherFilterDateTxt;

	@FindBy(xpath = "//input[@id='advancefilter_date_90_0']")
	public static WebElement enter_PDCFilterDate;
	
	
	@FindBy(xpath = "//*[@id='start_date']")
	public static WebElement PDCStartDate;
	

	@FindBy(xpath = "//button[@id='btnFilterPDCDetails']")
	public static WebElement pdcVoucherFilterBtn;

	@FindBy(xpath = "//*[@id='id_transaction_homescreen_edit']")
	public static WebElement enrtyPageEditBtn;

	@FindBy(xpath = "//*[@id='tblBodyTransRender']/tr/td[5]")
	public static List<WebElement> homePageVoucherNumList;

	@FindBy(xpath = "//*[@id='tblBodyTransRender']/tr/td[2]/input")
	public static List<WebElement> homePageChkboxList;
	
	@FindBy(xpath = "//*[@id='tblBodyTransRender']/tr/td[4]")
	public static List<WebElement> homePageNumberList;
	
	
	

	@FindBy(xpath = "//input[@id='id_header_67108969']")
	public static WebElement PDRVATChequeNoTxt;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[11]")
	public static List<WebElement> masterGridBodyName;

	@FindBy(xpath = "//td[contains(text(),'Customer New Reference')]//..//input")
	public static WebElement cusNewRefMasterChkBOx;

	@FindBy(xpath = "//td[contains(text(),'Customer Semi Adjustment')]//..//input")
	public static WebElement cusSemiAdjustMasterChkBOx;

	@FindBy(xpath = "//*[@id='divBtnGroup7']")
	public static WebElement AccMaster_VATSettingTAB;

	@FindBy(xpath = "//*[@id='JURID']")
	public static WebElement AccMaster_JURIDTxt;

	@FindBy(xpath = "//*[@id='PlaceOfSupply']")
	public static WebElement AccMaster_VATSettingPlaceOfSupplyTxt;

	@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
	public static WebElement mastersaveBtn;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[8]//input")
	public static List<WebElement> masterGridBodyChkbox;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[11]")
	public static List<WebElement> masterGridNameText;

	@FindBy(xpath = "//input[@id='id_header_86']")
	public static WebElement stockTransferWarehouse1;

	@FindBy(xpath = "//*[@id='90_0_AdvanceFilter_']/table/tbody/tr/td[1]/select")
	public static WebElement pdcFilterConjuctionDropdown;

	@FindBy(xpath = "//tbody//input[@placeholder='Select Field']")
	public static WebElement pdcFilterStartdateField;

	@FindBy(xpath = "//*[@id='90_0_AdvanceFilter_']/table/tbody/tr/td[3]/select")
	public static WebElement pdcFilterOperatorDropdown;

	@FindBy(xpath = "//*[@id='90_0_AdvanceFilter_']/table/tbody/tr/td[4]/select")
	public static WebElement pdcFilterCompareWithDropdown;;

	@FindBy(xpath = "//td[@id='mytable_col_1-5']")
	public static WebElement gridRow1SelectBankCol;

	@FindBy(xpath = "//td[@id='mytable_col_3-5']")
	public static WebElement gridRow3SelectBankCol;

	@FindBy(xpath = "//td[@id='mytable_col_4-5']")
	public static WebElement gridRow4SelectBankCol;

	@FindBy(xpath = "//td[@id='mytable_col_2-5']")
	public static WebElement gridRow2SelectBankCol;

	@FindBy(xpath = "//input[@id='mytableoptReversePosting']")
	public static WebElement gridEnterBank;

	@FindBy(xpath = "//span[contains(text(),'PDP VAT')]")
	public static WebElement PDPVAT;

	// FA REPORTS

	@FindBy(xpath = "//*[@id='500']")
	public static WebElement ledger;

	@FindBy(xpath = "//*[@id='658']")
	public static WebElement ledgerDetail;

	@FindBy(xpath = "//*[@id='501']")
	public static WebElement subLedger;

	@FindBy(xpath = "//*[@id='82']")
	public static WebElement cashAndBankBooksMenu;

	@FindBy(xpath = "//*[@id='510']")
	public static WebElement cashBookReport;

	@FindBy(xpath = "//*[@id='511']")
	public static WebElement bankBookReport;

	@FindBy(xpath = "//*[@id='512']")
	public static WebElement pettyCashBokReport;

	@FindBy(xpath = "//*[@id='513']")
	public static WebElement dayBookReport;

	@FindBy(xpath = "//*[@id='83']")
	public static WebElement bankReconciliationReport;

	@FindBy(xpath = "//*[@id='84']")
	public static WebElement bankReconciliationImport;

	@FindBy(xpath = "//*[@id='85']")
	public static WebElement customerVendorReconciliation;

	@FindBy(xpath = "//*[@id='537']")
	public static WebElement bankReconciliationStatement;

	@FindBy(xpath = "//*[@id='162']")
	public static WebElement chequeDiscountingMenu;

	@FindBy(xpath = "//*[@id='502']")
	public static WebElement salesReportsMenu;

	@FindBy(xpath = "//*[@id='503']")
	public static WebElement salesRegisterReport;

	@FindBy(xpath = "//*[@id='504']")
	public static WebElement salesReturnRegisterReport;

	@FindBy(xpath = "//*[@id='505']")
	public static WebElement summarySalesBookReport;

	@FindBy(xpath = "//*[@id='628']")
	public static WebElement monthlySalesBookReport;

	@FindBy(xpath = "//*[@id='629']")
	public static WebElement topCustomersListReport;

	@FindBy(xpath = "//*[@id='506']")
	public static WebElement purchaseReportsMenu;

	@FindBy(xpath = "//*[@id='507']")
	public static WebElement purchaseRegisterReport;

	@FindBy(xpath = "//*[@id='508']")
	public static WebElement purchaseReturnRegisteReport;

	@FindBy(xpath = "//*[@id='509']")
	public static WebElement summaryPurchaseBookReport;

	@FindBy(xpath = "//*[@id='514']")
	public static WebElement registersReportMenu;

	@FindBy(xpath = "//*[@id='516']")
	public static WebElement openingBalanceRegisterReport;

	@FindBy(xpath = "//*[@id='515']")
	public static WebElement journalEntriesRegisterReport;

	@FindBy(xpath = "//span[contains(text(),'Credit Note Register')]")
	public static WebElement creditNoteRegisterReport;

	@FindBy(xpath = "//*[@id='610']")
	public static WebElement debitNoteRegisterReport;

	@FindBy(xpath = "//*[@id='598']")
	public static WebElement receiptsRegisterReport;

	@FindBy(xpath = "//*[@id='599']")
	public static WebElement paymentRegisterReport;

	@FindBy(xpath = "//*[@id='518']")
	public static WebElement pdcReceiptsRegisterReport;

	@FindBy(xpath = "//*[@id='519']")
	public static WebElement pdcPaymentsRegisterReport;

	@FindBy(xpath = "//*[@id='517']")
	public static WebElement entryJournalRegisterReport;

	@FindBy(xpath = "//span[contains(text(),'Entry journal detail report')]")
	public static WebElement entryJournalDetailReport;

	@FindBy(xpath = "//*[@id='523']")
	public static WebElement salesAndPurchasesReportMenu;

	@FindBy(xpath = "//*[@id='524']")
	public static WebElement salesGroupedByCustomerReport;

	@FindBy(xpath = "//*[@id='525']")
	public static WebElement salesGroupedByProductReport;

	@FindBy(xpath = "//*[@id='526']")
	public static WebElement salesGroupedByDepartmentReport;

	@FindBy(xpath = "//*[@id='527']")
	public static WebElement purchasesGroupedByVendorReport;

	@FindBy(xpath = "//*[@id='528']")
	public static WebElement purchasesGroupedByProductReport;

	@FindBy(xpath = "//*[@id='529']")
	public static WebElement purchasesGroupedByDepartmentReport;

	@FindBy(xpath = "//*[@id='568']")
	public static WebElement MiscellaneousAnalysisReportMenu;

	@FindBy(xpath = "//*[@id='569']")
	public static WebElement peakAndLowBalancesReport;

	@FindBy(xpath = "//*[@id='570']")
	public static WebElement comprativeAnalysisReport;

	@FindBy(xpath = "//*[@id='571']")
	public static WebElement transactionsTypeAnalysisReport;

	@FindBy(xpath = "//*[@id='572']")
	public static WebElement abcAnalysisReport;

	@FindBy(xpath = "//*[@id='597']")
	public static WebElement interestCalculationReport;

	@FindBy(xpath = "//*[@id='536']")
	public static WebElement mastersInformationMenu;

	@FindBy(xpath = "//*[@id='538']")
	public static WebElement masterInfoMenu;

	@FindBy(xpath = "//*[@id='144']")
	public static WebElement productLabelMenu;

	@FindBy(xpath = "//*[@id='573']")
	public static WebElement unitConversionMenu;

	@FindBy(xpath = "//*[@id='147']")
	public static WebElement skidDefinitionMenu;

	@FindBy(xpath = "//*[@id='520']")
	public static WebElement auditTrailMenu;

	@FindBy(xpath = "//*[@id='521']")
	public static WebElement auditTrailtransactionsReport;

	@FindBy(xpath = "//*[@id='522']")
	public static WebElement aAuditTrailloginsReport;

	@FindBy(xpath = "//*[@id='204']")
	public static WebElement accountQuery;

	@FindBy(xpath = "//span[contains(text(),'Transaction authorization report')]")
	public static WebElement transactionAuthorizationReport;

	@FindBy(xpath = "//*[@id='711']//span[contains(text(),'Master authorization report')]")
	public static WebElement masterAuthorizationReport;

	@FindBy(xpath = "//div[@id='spnhiererchy']//select[@id='iTreeId']")
	public static WebElement sl_Dropdown1;

	@FindBy(xpath = "//div[@id='spnhiererchy']//select[@id='iTreeViewId']")
	public static WebElement sl_Dropdown2;

	@FindBy(xpath = "//label[@id='oncheckaccorderan']")
	public static WebElement sl_oncheckBtn;

	@FindBy(xpath = "//input[@id='txtsrch-term']")
	public static WebElement sl_SearhItemTxt;

	@FindBy(xpath = "//i[contains(@class,'icon-search theme_color-inverse')]")
	public static WebElement sl_SearchBtn;

	@FindBy(xpath = "//input[@id='cmbUserTypeMaster']")
	public static WebElement sl_MasterTypeTxt;

	@FindBy(xpath = "//span[contains(@class,'icon-font6 icon-external-module theme_icon-color')]")
	public static WebElement sl_AutoAdjustColumnsBtn;

	@FindBy(xpath = "//a[contains(@class,'clsMasterName')][contains(text(),'ITEMS GROUP')]")
	public static WebElement sl_ItemGroupsBtn;

	@FindBy(xpath = "//input[@id='liSelectAllMasters']")
	public static WebElement sl_HeaderSelectChkBox;

	@FindBy(xpath = "//i[contains(@class,'icon-font6 icon-schedule')]")
	public static WebElement sl_ScheduleBtn;

	@FindBy(xpath = "//i[contains(@class,'icon-font6 icon-custamize')]")
	public static WebElement sl_CustomizeBtn;

	@FindBy(xpath = "//i[contains(@class,'icon-font6 icon-filter')]")
	public static WebElement sl_FilterBtn;

	@FindBy(xpath = "(//*[@class='icon-ok hiconright2'])[1]")
	public static WebElement sl_OkBtn;

	@FindBy(xpath = "(//*[@class='icon-close hiconright2'])[1]")
	public static WebElement sl_CloseBtn;

	@FindBy(xpath = "(//*[@class='icon-close hiconright2'])[1]")
	public static WebElement setting_CloseBtn;

	@FindBy(xpath = "//select[@id='DateOptions_']")
	public static WebElement sl_DateOptionDropdown;
	
	@FindBy (xpath="//input[@id='id_body_85']")
	public static WebElement enter_Bin;

	@FindBy(xpath = "//input[@id='id_starting_date_']")
	public static WebElement sl_StartDateTxt;

	@FindBy(xpath = "//td[@id='id_starting_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]")
	public static WebElement sl_StartDateCalanderBtn;

	@FindBy(xpath = "//input[@id='id_ending_date_']")
	public static WebElement sl_EndDateTxt;

	@FindBy(xpath = "//td[@id='id_ending_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]")
	public static WebElement sl_EndDateCalanderBtn;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[8]/label/span")
	public static WebElement sl_IncludeServiceTypeItemChkBox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[8]/label/span")
	public static WebElement sl_IncludeOpeBalChkBox;

	@FindBy(xpath = "//select[@id='RITLayout_']")
	public static WebElement sl_LayoutDropdown;

	@FindBy(xpath = "//select[@id='RITOutput_']")
	public static WebElement sl_OutputDropdown;

	@FindBy(xpath = "//div[contains(@class,'first')]//input[contains(@class,'btn btn-xs Fbutton')]")
	public static WebElement sl_FirstBtn;

	@FindBy(xpath = "//div[contains(@class,'prev')]//input[contains(@class,'btn btn-xs Fbutton')]")
	public static WebElement sl_PreviousBtn;

	@FindBy(xpath = "//input[@id='btn1']")
	public static WebElement sl_PageBtn;

	@FindBy(xpath = "//div[contains(@class,'next')]//input[contains(@class,'btn btn-xs Fbutton')]")
	public static WebElement sl_NextBtn;

	@FindBy(xpath = "//div[contains(@class,'End')]//input[contains(@class,'btn btn-xs Fbutton')]")
	public static WebElement sl_EndBtn;

	@FindBy(xpath = "//tr[1]//td[8]//div[1]//label[1]")
	public static WebElement sl_1stRowChkBox;

	@FindBy(xpath = "//tr[2]//td[8]//div[1]//label[1]")
	public static WebElement sl_2ndRowChkBox;

	////////

	@FindBy(xpath = "//span[@id='reportSort']")
	public static WebElement report_sortingBtn;

	@FindBy(xpath = "//span[@id='reportRefresh']")
	public static WebElement report_RefreshBtn;

	@FindBy(xpath = "//span[@id='print_report_']")
	public static WebElement report_PrintBtn;

	@FindBy(xpath = "//*[@id='reportRenderControls']/ul/li/span[4]")
	public static WebElement report_ExportBtn;

	/*
	 * @FindBy( xpath="//i[contains(@class,'theme_button_color dropdown-toggle')]")
	 * public static WebElement report_sortingBtn;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-font6 icon-refresh')]") private
	 * static WebElement report_RefreshBtn;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-font6 icon-print')]") private static
	 * WebElement report_PrintBtn;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-font6 icon-export')]") private
	 * static WebElement report_ExportBtn;
	 */

	/*
	 * @FindBy(
	 * xpath="//i[contains(@class,'icon-font6 icon-graph ImagesinArabic')]") public
	 * static WebElement report_GraphBtn;
	 */

	@FindBy(xpath = "//span[@id='GraphIcon']")
	public static WebElement report_GraphBtn;

	@FindBy(xpath = "//*[@class='icon-backtrack hiconright2']")
	public static WebElement report_BackTrackBtn;

	/*
	 * @FindBy(
	 * xpath="//span[@id='reportCustomize_']//i[contains(@class,'icon-font6 icon-custamize')]"
	 * ) public static WebElement report_ReportCustomizeBtn;
	 */
	
	

	@FindBy(xpath = "//*[@data-fieldname='Payment terms']//span[text()='Payment terms']")
	public static WebElement report_CusPaymentTermsFld;
	
	
	@FindBy(xpath = "//*[@id='id_rc_columnheadertable']/thead/tr/th")
	public static List<WebElement> report_CusColList;
	
	
	
	@FindBy(xpath = "//*[@id='liSelectAllMasters']")
	public static WebElement selectallbtn;
	
	
	@FindBy(xpath = "//*[@id='MasterGroup__101']")
	public static WebElement report_AccTxt;

	
	@FindBy(xpath = "//*[@id='MasterGroup__101_option']")
	public static WebElement report_AccTxt1;
	@FindBy(xpath = "//*[@class='icon-custamize hiconright2']")
	public static WebElement report_ReportCustomizeBtn;

	/*
	 * @FindBy(
	 * xpath="//span[@id='filterIcon_']//i[contains(@class,'icon-font6 icon-filter')]"
	 * ) public static WebElement report_FilterBtn;
	 */

	@FindBy(xpath = "//*[@id='id_reportmenudisplay']/ul/li[9]")
	public static WebElement report_FilterBtn;

	@FindBy(xpath = "//li[contains(text(),'Filter')]")
	public static WebElement filter_FilterBtn;

	@FindBy(xpath = "//*[@id='idFilterCustomizeIcon']")
	public static WebElement report_FilterCustomizeBtn;

	@FindBy(xpath = "//span[@id='a']")
	public static WebElement report_Filter_FilterBtn;

	@FindBy(xpath = "//*[@id='551_0_AdvanceFilter']/table/tbody/tr/td[1]/select")
	public static WebElement reportsAdvanced_WhereDropDown;

	@FindBy(xpath = "//tbody//input[@placeholder='Select Field']")
	public static WebElement reportsAdvanced_SelectFielddropdown;

	@FindBy(xpath = "//table/tbody/tr/td[3]/select")
	public static WebElement reportsAdvanced_SelectOperatorDropDown;

	@FindBy(xpath = "//table/tbody/tr/td[4]/select")
	public static WebElement reportsAdvanced_ComparewithDropDown;

	@FindBy(xpath = "//table/tbody/tr/td[5]/input")
	public static WebElement reportsAdvanced_ValueTxt;

	@FindBy(xpath = "//input[@id='advancefilter_master_551_0']")
	public static WebElement reportsAdvanced_EnterValue;

	@FindBy(xpath = "//table/tbody/tr/td[7]/span")
	public static WebElement reportsAdvanced_AddIconBtn;

	@FindBy(xpath = "//table/tbody/tr/td[6]/span")
	public static WebElement reportsAdvanced_DeleteIcon1Btn;

	@FindBy(xpath = "//table/tbody/tr[2]/td[6]/span")
	public static WebElement reportsAdvanced__DeleteIcon2Btn;

	@FindBy(xpath = "//div[@id='filterTree_551_0_AdvanceFilter']//a[@id='536870916']")
	public static WebElement reports_AdvancedFilter_SelectField_WH_ExpandBtn;

	@FindBy(xpath = "//div[@id='filterTree_551_0_AdvanceFilter']//a[@id='5058']")
	public static WebElement reports_AdvancedFilter_SelectField_WH_NameBtn;

	@FindBy(xpath = "//input[@id='chkSaveFilter']")
	public static WebElement report_FilterSaveFilterPermanentlyChkBox;

	@FindBy(xpath = "//*[@id='filterRefresh']")
	public static WebElement report_Filter_RefreshBtn;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
	public static WebElement report_Filter_RefreshConditionBtn;

	@FindBy(xpath = "//i[contains(@class,'icon icon-ok')]")
	public static WebElement report_FilterOkBtn;

	@FindBy(xpath = "//i[contains(@class,'icon icon-close')]")
	public static WebElement report_FilterCancelBtn;

	@FindBy(xpath = "//div[@id='dvfilter_']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]")
	public static WebElement report_FilterDownBtn;

	@FindBy(xpath = "//i[contains(@class,'icon-font6 icon-analyze')]")
	public static WebElement report_AnalyzeBtn;

	@FindBy(xpath = "//i[contains(@class,'icon-font6 icon-cross-reference')]")
	public static WebElement report_CrossReferenceBtn;

	@FindBy(xpath = "//i[contains(@class,'icon-font6 icon-options')]")
	public static WebElement report_OptionsBtn;

	@FindBy(xpath = "//div[@id='dvoptions_']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]")
	public static WebElement report_OptionsDownBtn;

	/*
	 * @FindBy(
	 * xpath="//span[@id='reportClose_']//i[contains(@class,'icon-font6 icon-close')]"
	 * ) public static WebElement report_CloseBtn;
	 * 
	 * @FindBy(xpath="//button[@id='frstPage_']") public static WebElement
	 * report_FirstBtn;
	 * 
	 * @FindBy(xpath="//button[@id='prvPage_']") public static WebElement
	 * report_PreviousBtn;
	 * 
	 * @FindBy(xpath="//button[@id='pgnumber_']") public static WebElement
	 * report_PageNoBtn;
	 * 
	 * @FindBy(xpath=
	 * "/html/body/section/div[2]/div/section[1]/section[2]/div[1]/div[3]/div[2]/button[4]")
	 * public static WebElement report_NextBtn;
	 * 
	 * @FindBy(xpath="//button[@id='lstPage_']") public static WebElement
	 * report_LastBtn;
	 */

	@FindBy(xpath = "//div[@id='REPORTRENDERNEWControls']/ul/li/span[13]")
	public static WebElement reportWithLevel_CloseBtn;

	@FindBy(xpath = "(//button[contains(text(), 'First')])[1]")
	public static WebElement report_FirstBtn;

	@FindBy(xpath = "(//button[contains(text(), 'Previous')])[1]")
	public static WebElement report_PreviousBtn;

	@FindBy(xpath = "//*[@id='divPagebuttons']//button[3]")
	public static WebElement report_PageNoBtn;

	@FindBy(xpath = "(//button[contains(text(), 'Next')])[1]")
	public static WebElement report_NextBtn;

	@FindBy(xpath = "//button[contains(text(), 'Last')]")
	public static WebElement report_LastBtn;

	@FindBy(xpath = "(//button[contains(text(), 'Last')])[1]")
	public static WebElement report_LastBtn1;
	
	@FindBy(xpath = "//input[@id='txtSearchReport']")
	public static WebElement report_SearchTxt;

	@FindBy(xpath = "//*[@id='trRender_0']/td[1]")
	public static WebElement sl_1stRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[2]")
	public static WebElement sl_1stRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[3]")
	public static WebElement sl_1stRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[4]")
	public static WebElement sl_1stRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[5]")
	public static WebElement sl_1stRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[6]")
	public static WebElement sl_1stRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[7]")
	public static WebElement sl_1stRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[8]")
	public static WebElement sl_1stRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[9]")
	public static WebElement sl_1stRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[10]")
	public static WebElement sl_1stRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[11]")
	public static WebElement sl_1stRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[12]")
	public static WebElement sl_1stRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[13]")
	public static WebElement sl_1stRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[14]")
	public static WebElement sl_1stRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[15]")
	public static WebElement sl_1stRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[16]")
	public static WebElement sl_1stRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[17]")
	public static WebElement sl_1stRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[18]")
	public static WebElement sl_1stRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[19]")
	public static WebElement sl_1stRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[20]")
	public static WebElement sl_1stRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[21]")
	public static WebElement sl_1stRow21thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[22]")
	public static WebElement sl_1stRow22thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[23]")
	public static WebElement sl_1stRow23thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[24]")
	public static WebElement sl_1stRow24thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[25]")
	public static WebElement sl_1stRow25thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[26]")
	public static WebElement sl_1stRow26thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[27]")
	public static WebElement sl_1stRow27thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[28]")
	public static WebElement sl_1stRow28thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[29]")
	public static WebElement sl_1stRow29thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[30]")
	public static WebElement sl_1stRow30thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[31]")
	public static WebElement sl_1stRow31thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[32]")
	public static WebElement sl_1stRow32thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[33]")
	public static WebElement sl_1stRow33thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[34]")
	public static WebElement sl_1stRow34thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[35]")
	public static WebElement sl_1stRow35thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[36]")
	public static WebElement sl_1stRow36thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[37]")
	public static WebElement sl_1stRow37thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[38]")
	public static WebElement sl_1stRow38thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[39]")
	public static WebElement sl_1stRow39thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[40]")
	public static WebElement sl_1stRow40thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[41]")
	public static WebElement sl_1stRow41thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[42]")
	public static WebElement sl_1stRow42thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[43]")
	public static WebElement sl_1stRow43thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[44]")
	public static WebElement sl_1stRow44thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[45]")
	public static WebElement sl_1stRow45thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[46]")
	public static WebElement sl_1stRow46thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[47]")
	public static WebElement sl_1stRow47thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[48]")
	public static WebElement sl_1stRow48thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[49]")
	public static WebElement sl_1stRow49thCol;

	@FindBy(xpath = "//*[@id='trRender_0']/td[50]")
	public static WebElement sl_1stRow50thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[1]")
	public static WebElement sl_2ndRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[2]")
	public static WebElement sl_2ndRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[3]")
	public static WebElement sl_2ndRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[4]")
	public static WebElement sl_2ndRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[5]")
	public static WebElement sl_2ndRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[6]")
	public static WebElement sl_2ndRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[7]")
	public static WebElement sl_2ndRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[8]")
	public static WebElement sl_2ndRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[9]")
	public static WebElement sl_2ndRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[10]")
	public static WebElement sl_2ndRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[11]")
	public static WebElement sl_2ndRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[12]")
	public static WebElement sl_2ndRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[13]")
	public static WebElement sl_2ndRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[14]")
	public static WebElement sl_2ndRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[15]")
	public static WebElement sl_2ndRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[16]")
	public static WebElement sl_2ndRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[17]")
	public static WebElement sl_2ndRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[18]")
	public static WebElement sl_2ndRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[19]")
	public static WebElement sl_2ndRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[20]")
	public static WebElement sl_2ndRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[21]")
	public static WebElement sl_2ndRow21thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[22]")
	public static WebElement sl_2ndRow22thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[23]")
	public static WebElement sl_2ndRow23thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[24]")
	public static WebElement sl_2ndRow24thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[25]")
	public static WebElement sl_2ndRow25thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[26]")
	public static WebElement sl_2ndRow26thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[27]")
	public static WebElement sl_2ndRow27thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[28]")
	public static WebElement sl_2ndRow28thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[29]")
	public static WebElement sl_2ndRow29thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[30]")
	public static WebElement sl_2ndRow30thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[31]")
	public static WebElement sl_2ndRow31thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[32]")
	public static WebElement sl_2ndRow32thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[33]")
	public static WebElement sl_2ndRow33thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[34]")
	public static WebElement sl_2ndRow34thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[35]")
	public static WebElement sl_2ndRow35thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[36]")
	public static WebElement sl_2ndRow36thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[37]")
	public static WebElement sl_2ndRow37thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[38]")
	public static WebElement sl_2ndRow38thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[39]")
	public static WebElement sl_2ndRow39thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[40]")
	public static WebElement sl_2ndRow40thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[41]")
	public static WebElement sl_2ndRow41thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[42]")
	public static WebElement sl_2ndRow42thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[43]")
	public static WebElement sl_2ndRow43thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[44]")
	public static WebElement sl_2ndRow44thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[45]")
	public static WebElement sl_2ndRow45thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[46]")
	public static WebElement sl_2ndRow46thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[47]")
	public static WebElement sl_2ndRow47thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[48]")
	public static WebElement sl_2ndRow48thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[49]")
	public static WebElement sl_2ndRow49thCol;

	@FindBy(xpath = "//*[@id='trRender_1']/td[50]")
	public static WebElement sl_2ndRow50thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[1]")
	public static WebElement sl_3rdRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[2]")
	public static WebElement sl_3rdRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[3]")
	public static WebElement sl_3rdRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[4]")
	public static WebElement sl_3rdRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[5]")
	public static WebElement sl_3rdRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[6]")
	public static WebElement sl_3rdRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[7]")
	public static WebElement sl_3rdRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[8]")
	public static WebElement sl_3rdRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[9]")
	public static WebElement sl_3rdRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[10]")
	public static WebElement sl_3rdRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[11]")
	public static WebElement sl_3rdRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[12]")
	public static WebElement sl_3rdRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[13]")
	public static WebElement sl_3rdRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[14]")
	public static WebElement sl_3rdRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[15]")
	public static WebElement sl_3rdRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[16]")
	public static WebElement sl_3rdRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[17]")
	public static WebElement sl_3rdRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[18]")
	public static WebElement sl_3rdRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[19]")
	public static WebElement sl_3rdRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[20]")
	public static WebElement sl_3rdRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[21]")
	public static WebElement sl_3rdRow21thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[22]")
	public static WebElement sl_3rdRow22thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[23]")
	public static WebElement sl_3rdRow23thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[24]")
	public static WebElement sl_3rdRow24thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[25]")
	public static WebElement sl_3rdRow25thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[26]")
	public static WebElement sl_3rdRow26thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[27]")
	public static WebElement sl_3rdRow27thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[28]")
	public static WebElement sl_3rdRow28thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[29]")
	public static WebElement sl_3rdRow29thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[30]")
	public static WebElement sl_3rdRow30thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[31]")
	public static WebElement sl_3rdRow31thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[32]")
	public static WebElement sl_3rdRow32thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[33]")
	public static WebElement sl_3rdRow33thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[34]")
	public static WebElement sl_3rdRow34thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[35]")
	public static WebElement sl_3rdRow35thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[36]")
	public static WebElement sl_3rdRow36thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[37]")
	public static WebElement sl_3rdRow37thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[38]")
	public static WebElement sl_3rdRow38thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[39]")
	public static WebElement sl_3rdRow39thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[40]")
	public static WebElement sl_3rdRow40thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[41]")
	public static WebElement sl_3rdRow41thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[42]")
	public static WebElement sl_3rdRow42thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[43]")
	public static WebElement sl_3rdRow43thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[44]")
	public static WebElement sl_3rdRow44thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[45]")
	public static WebElement sl_3rdRow45thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[46]")
	public static WebElement sl_3rdRow46thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[47]")
	public static WebElement sl_3rdRow47thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[48]")
	public static WebElement sl_3rdRow48thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[49]")
	public static WebElement sl_3rdRow49thCol;

	@FindBy(xpath = "//*[@id='trRender_2']/td[50]")
	public static WebElement sl_3rdRow50thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[1]")
	public static WebElement sl_4thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[2]")
	public static WebElement sl_4thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[3]")
	public static WebElement sl_4thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[4]")
	public static WebElement sl_4thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[5]")
	public static WebElement sl_4thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[6]")
	public static WebElement sl_4thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[7]")
	public static WebElement sl_4thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[8]")
	public static WebElement sl_4thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[9]")
	public static WebElement sl_4thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[10]")
	public static WebElement sl_4thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[11]")
	public static WebElement sl_4thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[12]")
	public static WebElement sl_4thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[13]")
	public static WebElement sl_4thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[14]")
	public static WebElement sl_4thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[15]")
	public static WebElement sl_4thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[16]")
	public static WebElement sl_4thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[17]")
	public static WebElement sl_4thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[18]")
	public static WebElement sl_4thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[19]")
	public static WebElement sl_4thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[20]")
	public static WebElement sl_4thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[21]")
	public static WebElement sl_4thRow21thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[22]")
	public static WebElement sl_4thRow22thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[23]")
	public static WebElement sl_4thRow23thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[24]")
	public static WebElement sl_4thRow24thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[25]")
	public static WebElement sl_4thRow25thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[26]")
	public static WebElement sl_4thRow26thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[27]")
	public static WebElement sl_4thRow27thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[28]")
	public static WebElement sl_4thRow28thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[29]")
	public static WebElement sl_4thRow29thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[30]")
	public static WebElement sl_4thRow30thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[31]")
	public static WebElement sl_4thRow31thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[32]")
	public static WebElement sl_4thRow32thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[33]")
	public static WebElement sl_4thRow33thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[34]")
	public static WebElement sl_4thRow34thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[35]")
	public static WebElement sl_4thRow35thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[36]")
	public static WebElement sl_4thRow36thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[37]")
	public static WebElement sl_4thRow37thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[38]")
	public static WebElement sl_4thRow38thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[39]")
	public static WebElement sl_4thRow39thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[40]")
	public static WebElement sl_4thRow40thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[41]")
	public static WebElement sl_4thRow41thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[42]")
	public static WebElement sl_4thRow42thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[43]")
	public static WebElement sl_4thRow43thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[44]")
	public static WebElement sl_4thRow44thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[45]")
	public static WebElement sl_4thRow45thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[46]")
	public static WebElement sl_4thRow46thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[47]")
	public static WebElement sl_4thRow47thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[48]")
	public static WebElement sl_4thRow48thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[49]")
	public static WebElement sl_4thRow49thCol;

	@FindBy(xpath = "//*[@id='trRender_3']/td[50]")
	public static WebElement sl_4thRow50thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[1]")
	public static WebElement sl_5thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[2]")
	public static WebElement sl_5thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[3]")
	public static WebElement sl_5thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[4]")
	public static WebElement sl_5thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[5]")
	public static WebElement sl_5thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[6]")
	public static WebElement sl_5thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[7]")
	public static WebElement sl_5thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[8]")
	public static WebElement sl_5thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[9]")
	public static WebElement sl_5thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[10]")
	public static WebElement sl_5thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[11]")
	public static WebElement sl_5thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[12]")
	public static WebElement sl_5thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[13]")
	public static WebElement sl_5thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[14]")
	public static WebElement sl_5thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[15]")
	public static WebElement sl_5thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[16]")
	public static WebElement sl_5thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[17]")
	public static WebElement sl_5thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[18]")
	public static WebElement sl_5thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[19]")
	public static WebElement sl_5thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[20]")
	public static WebElement sl_5thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[21]")
	public static WebElement sl_5thRow21thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[22]")
	public static WebElement sl_5thRow22thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[23]")
	public static WebElement sl_5thRow23thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[24]")
	public static WebElement sl_5thRow24thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[25]")
	public static WebElement sl_5thRow25thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[26]")
	public static WebElement sl_5thRow26thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[27]")
	public static WebElement sl_5thRow27thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[28]")
	public static WebElement sl_5thRow28thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[29]")
	public static WebElement sl_5thRow29thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[30]")
	public static WebElement sl_5thRow30thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[31]")
	public static WebElement sl_5thRow31thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[32]")
	public static WebElement sl_5thRow32thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[33]")
	public static WebElement sl_5thRow33thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[34]")
	public static WebElement sl_5thRow34thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[35]")
	public static WebElement sl_5thRow35thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[36]")
	public static WebElement sl_5thRow36thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[37]")
	public static WebElement sl_5thRow37thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[38]")
	public static WebElement sl_5thRow38thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[39]")
	public static WebElement sl_5thRow39thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[40]")
	public static WebElement sl_5thRow40thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[41]")
	public static WebElement sl_5thRow41thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[42]")
	public static WebElement sl_5thRow42thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[43]")
	public static WebElement sl_5thRow43thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[44]")
	public static WebElement sl_5thRow44thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[45]")
	public static WebElement sl_5thRow45thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[46]")
	public static WebElement sl_5thRow46thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[47]")
	public static WebElement sl_5thRow47thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[48]")
	public static WebElement sl_5thRow48thCol;
	
	 @FindBy(xpath="//*[@id='lblnchecked']/input") 
	 public static WebElement selectGridSecondRow;

	@FindBy(xpath = "//*[@id='trRender_4']/td[49]")
	public static WebElement sl_5thRow49thCol;

	@FindBy(xpath = "//*[@id='trRender_4']/td[50]")
	public static WebElement sl_5thRow50thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[1]")
	public static WebElement sl_6thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[2]")
	public static WebElement sl_6thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[3]")
	public static WebElement sl_6thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[4]")
	public static WebElement sl_6thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[5]")
	public static WebElement sl_6thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[6]")
	public static WebElement sl_6thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[7]")
	public static WebElement sl_6thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[8]")
	public static WebElement sl_6thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[9]")
	public static WebElement sl_6thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[10]")
	public static WebElement sl_6thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[11]")
	public static WebElement sl_6thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[12]")
	public static WebElement sl_6thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[13]")
	public static WebElement sl_6thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[14]")
	public static WebElement sl_6thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[15]")
	public static WebElement sl_6thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[16]")
	public static WebElement sl_6thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[17]")
	public static WebElement sl_6thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[18]")
	public static WebElement sl_6thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[19]")
	public static WebElement sl_6thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[20]")
	public static WebElement sl_6thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[21]")
	public static WebElement sl_6thRow21thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[22]")
	public static WebElement sl_6thRow22thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[23]")
	public static WebElement sl_6thRow23thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[24]")
	public static WebElement sl_6thRow24thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[25]")
	public static WebElement sl_6thRow25thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[26]")
	public static WebElement sl_6thRow26thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[27]")
	public static WebElement sl_6thRow27thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[28]")
	public static WebElement sl_6thRow28thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[29]")
	public static WebElement sl_6thRow29thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[30]")
	public static WebElement sl_6thRow30thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[31]")
	public static WebElement sl_6thRow31thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[32]")
	public static WebElement sl_6thRow32thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[33]")
	public static WebElement sl_6thRow33thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[34]")
	public static WebElement sl_6thRow34thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[35]")
	public static WebElement sl_6thRow35thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[36]")
	public static WebElement sl_6thRow36thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[37]")
	public static WebElement sl_6thRow37thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[38]")
	public static WebElement sl_6thRow38thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[39]")
	public static WebElement sl_6thRow39thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[40]")
	public static WebElement sl_6thRow40thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[41]")
	public static WebElement sl_6thRow41thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[42]")
	public static WebElement sl_6thRow42thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[43]")
	public static WebElement sl_6thRow43thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[44]")
	public static WebElement sl_6thRow44thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[45]")
	public static WebElement sl_6thRow45thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[46]")
	public static WebElement sl_6thRow46thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[47]")
	public static WebElement sl_6thRow47thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[48]")
	public static WebElement sl_6thRow48thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[49]")
	public static WebElement sl_6thRow49thCol;

	@FindBy(xpath = "//*[@id='trRender_5']/td[50]")
	public static WebElement sl_6thRow50thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[1]")
	public static WebElement sl_7thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[2]")
	public static WebElement sl_7thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[3]")
	public static WebElement sl_7thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[4]")
	public static WebElement sl_7thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[5]")
	public static WebElement sl_7thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[6]")
	public static WebElement sl_7thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[7]")
	public static WebElement sl_7thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[8]")
	public static WebElement sl_7thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[9]")
	public static WebElement sl_7thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[10]")
	public static WebElement sl_7thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[11]")
	public static WebElement sl_7thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[12]")
	public static WebElement sl_7thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[13]")
	public static WebElement sl_7thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[14]")
	public static WebElement sl_7thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[15]")
	public static WebElement sl_7thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[16]")
	public static WebElement sl_7thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[17]")
	public static WebElement sl_7thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[18]")
	public static WebElement sl_7thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[19]")
	public static WebElement sl_7thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_6']/td[20]")
	public static WebElement sl_7thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[1]")
	public static WebElement sl_8thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[2]")
	public static WebElement sl_8thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[3]")
	public static WebElement sl_8thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[4]")
	public static WebElement sl_8thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[5]")
	public static WebElement sl_8thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[6]")
	public static WebElement sl_8thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[7]")
	public static WebElement sl_8thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[8]")
	public static WebElement sl_8thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[9]")
	public static WebElement sl_8thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[10]")
	public static WebElement sl_8thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[11]")
	public static WebElement sl_8thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[12]")
	public static WebElement sl_8thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[13]")
	public static WebElement sl_8thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[14]")
	public static WebElement sl_8thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[15]")
	public static WebElement sl_8thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[16]")
	public static WebElement sl_8thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[17]")
	public static WebElement sl_8thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[18]")
	public static WebElement sl_8thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[19]")
	public static WebElement sl_8thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_7']/td[20]")
	public static WebElement sl_8thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[1]")
	public static WebElement sl_9thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[2]")
	public static WebElement sl_9thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[3]")
	public static WebElement sl_9thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[4]")
	public static WebElement sl_9thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[5]")
	public static WebElement sl_9thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[6]")
	public static WebElement sl_9thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[7]")
	public static WebElement sl_9thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[8]")
	public static WebElement sl_9thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[9]")
	public static WebElement sl_9thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[10]")
	public static WebElement sl_9thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[11]")
	public static WebElement sl_9thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[12]")
	public static WebElement sl_9thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[13]")
	public static WebElement sl_9thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[14]")
	public static WebElement sl_9thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[15]")
	public static WebElement sl_9thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[16]")
	public static WebElement sl_9thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[17]")
	public static WebElement sl_9thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[18]")
	public static WebElement sl_9thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[19]")
	public static WebElement sl_9thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_8']/td[20]")
	public static WebElement sl_9thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[1]")
	public static WebElement sl_10thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[2]")
	public static WebElement sl_10thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[3]")
	public static WebElement sl_10thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[4]")
	public static WebElement sl_10thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[5]")
	public static WebElement sl_10thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[6]")
	public static WebElement sl_10thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[7]")
	public static WebElement sl_10thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[8]")
	public static WebElement sl_10thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[9]")
	public static WebElement sl_10thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[10]")
	public static WebElement sl_10thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[11]")
	public static WebElement sl_10thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[12]")
	public static WebElement sl_10thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[13]")
	public static WebElement sl_10thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[14]")
	public static WebElement sl_10thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[15]")
	public static WebElement sl_10thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[16]")
	public static WebElement sl_10thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[17]")
	public static WebElement sl_10thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[18]")
	public static WebElement sl_10thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[19]")
	public static WebElement sl_10thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_9']/td[20]")
	public static WebElement sl_10thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[1]")
	public static WebElement sl_11thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[2]")
	public static WebElement sl_11thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[3]")
	public static WebElement sl_11thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[4]")
	public static WebElement sl_11thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[5]")
	public static WebElement sl_11thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[6]")
	public static WebElement sl_11thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[7]")
	public static WebElement sl_11thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[8]")
	public static WebElement sl_11thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[9]")
	public static WebElement sl_11thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[10]")
	public static WebElement sl_11thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[11]")
	public static WebElement sl_11thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[12]")
	public static WebElement sl_11thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[13]")
	public static WebElement sl_11thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[14]")
	public static WebElement sl_11thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[15]")
	public static WebElement sl_11thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[16]")
	public static WebElement sl_11thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[17]")
	public static WebElement sl_11thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[18]")
	public static WebElement sl_11thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[19]")
	public static WebElement sl_11thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_10']/td[20]")
	public static WebElement sl_11thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[1]")
	public static WebElement sl_12thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[2]")
	public static WebElement sl_12thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[3]")
	public static WebElement sl_12thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[4]")
	public static WebElement sl_12thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[5]")
	public static WebElement sl_12thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[6]")
	public static WebElement sl_12thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[7]")
	public static WebElement sl_12thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[8]")
	public static WebElement sl_12thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[9]")
	public static WebElement sl_12thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[10]")
	public static WebElement sl_12thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[11]")
	public static WebElement sl_12thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[12]")
	public static WebElement sl_12thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[13]")
	public static WebElement sl_12thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[14]")
	public static WebElement sl_12thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[15]")
	public static WebElement sl_12thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[16]")
	public static WebElement sl_12thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[17]")
	public static WebElement sl_12thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[18]")
	public static WebElement sl_12thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[19]")
	public static WebElement sl_12thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_11']/td[20]")
	public static WebElement sl_12thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[1]")
	public static WebElement sl_13thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[2]")
	public static WebElement sl_13thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[3]")
	public static WebElement sl_13thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[4]")
	public static WebElement sl_13thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[5]")
	public static WebElement sl_13thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[6]")
	public static WebElement sl_13thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[7]")
	public static WebElement sl_13thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[8]")
	public static WebElement sl_13thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[9]")
	public static WebElement sl_13thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[10]")
	public static WebElement sl_13thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[11]")
	public static WebElement sl_13thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[12]")
	public static WebElement sl_13thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[13]")
	public static WebElement sl_13thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[14]")
	public static WebElement sl_13thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[15]")
	public static WebElement sl_13thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[16]")
	public static WebElement sl_13thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[17]")
	public static WebElement sl_13thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[18]")
	public static WebElement sl_13thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[19]")
	public static WebElement sl_13thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_12']/td[20]")
	public static WebElement sl_13thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[1]")
	public static WebElement sl_14thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[2]")
	public static WebElement sl_14thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[3]")
	public static WebElement sl_14thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[4]")
	public static WebElement sl_14thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[5]")
	public static WebElement sl_14thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[6]")
	public static WebElement sl_14thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[7]")
	public static WebElement sl_14thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[8]")
	public static WebElement sl_14thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[9]")
	public static WebElement sl_14thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[10]")
	public static WebElement sl_14thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[11]")
	public static WebElement sl_14thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[12]")
	public static WebElement sl_14thRow12thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[13]")
	public static WebElement sl_14thRow13thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[14]")
	public static WebElement sl_14thRow14thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[15]")
	public static WebElement sl_14thRow15thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[16]")
	public static WebElement sl_14thRow16thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[17]")
	public static WebElement sl_14thRow17thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[18]")
	public static WebElement sl_14thRow18thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[19]")
	public static WebElement sl_14thRow19thCol;

	@FindBy(xpath = "//*[@id='trRender_13']/td[20]")
	public static WebElement sl_14thRow20thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[1]")
	public static WebElement sl_15thRow1stCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[2]")
	public static WebElement sl_15thRow2ndCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[3]")
	public static WebElement sl_15thRow3rdCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[4]")
	public static WebElement sl_15thRow4thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[5]")
	public static WebElement sl_15thRow5thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[6]")
	public static WebElement sl_15thRow6thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[7]")
	public static WebElement sl_15thRow7thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[8]")
	public static WebElement sl_15thRow8thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[9]")
	public static WebElement sl_15thRow9thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[10]")
	public static WebElement sl_15thRow10thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[11]")
	public static WebElement sl_15thRow11thCol;

	@FindBy(xpath = "//*[@id='trRender_14']/td[12]")
	public static WebElement sl_15thRow12thCol;

	private int bankRecRow1ListCount;

	@FindBy(xpath = "//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li/a/span")
	public static List<WebElement> financialReportList;

	@FindBy(xpath = "//*[@id='id_header_3_table_body']/tr")
	public static List<WebElement> salesAccList;

	@FindBy(xpath = "//div[@id='idGlobalError']")
	public static WebElement validationConfirmationMessage;

	@FindBy(xpath = "//tbody[@id='LandingGridBody']/tr")
	public static List<WebElement> stockLedgerHometableRowCount;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr/td[3]")
	public static List<WebElement> reportVocGridList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr")
	public static List<WebElement> reportRowList;
	
	
	
	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[1]/td")
	public static List<WebElement> report1stRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[2]/td")
	public static List<WebElement> report2ndRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[3]/td")
	public static List<WebElement> report3rdRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[4]/td")
	public static List<WebElement> report4thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[5]/td")
	public static List<WebElement> report5thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[6]/td")
	public static List<WebElement> report6thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[7]/td")
	public static List<WebElement> report7thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[8]/td")
	public static List<WebElement> report8thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[9]/td")
	public static List<WebElement> report9thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[10]/td")
	public static List<WebElement> report10thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[11]/td")
	public static List<WebElement> report11thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[12]/td")
	public static List<WebElement> report12thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[13]/td")
	public static List<WebElement> report13thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[14]/td")
	public static List<WebElement> report14thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[15]/td")
	public static List<WebElement> report15thRowList;

	// Cheque Discounting

	@FindBy(xpath = "//input[@id='optnCtrlCheqDisBank']")
	public static WebElement bankAccountTxt;

	@FindBy(xpath = "//input[@id='optctrlCheqDisCustomer']")
	public static WebElement CD_customerAccountTxt;

	@FindBy(xpath = "//input[@id='DepositingBank']")
	public static WebElement discountingBankTxt;

	@FindBy(xpath = "//i[@class='icon-reset icon-font6']")
	public static WebElement cd_LoadBtn;

	@FindBy(xpath = "//input[@id='txtMarginPercentageId']")
	public static WebElement cd_MarginTxt;

	@FindBy(xpath = "//input[@id='btnDepositingBank']")
	public static WebElement cd_ApplyBtn;

	@FindBy(xpath = "//i[@class='icon-clear icon-font6']")
	public static WebElement cd_clearBtn;

	@FindBy(xpath = "//*[@id='btnSave']/a/i")
	public static WebElement cd_saveBtn;

	@FindBy(xpath = "//*[@id='btnClose']/i")
	public static WebElement cd_CloseBtn;

	@FindBy(xpath = "//thead[@id='ChequeDiscountingTable_head']/tr/th/div")
	public static List<WebElement> cd_tableHeadeList;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-2']")
	public static WebElement disCustomerRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-3']")
	public static WebElement disVoucherRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-4']")
	public static WebElement disMaturityDateRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-5']")
	public static WebElement disChequeNumberRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-6']")
	public static WebElement disAmountRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-7']")
	public static WebElement disDiscountlimitRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-8']")
	public static WebElement disDiscountAmtRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-9']")
	public static WebElement disBankRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-10']")
	public static WebElement disMarginRow1;

	@FindBy(xpath = "//td[@id='ChequeDiscountingTable_col_1-11']")
	public static WebElement disPostOnDateRow1;

	@FindBy(xpath = "//*[@id='optnCtrlCheqDisBank_table_body']/tr/td[2]")
	public static List<WebElement> chequeDisList;

	@FindBy(xpath = "//*[@id='ChequeDiscountingTable_body']/tr[1]/td")
	public static List<WebElement> chequeDisBodyGridList;

	@FindBy(xpath = "//*[@id='ChequeDiscountingTable_body']")
	public static WebElement chequeDisBodyGrid;

	@FindBy(xpath = "//select[@id='RITCombobox__3']")
	public static WebElement considerDatesBasedOnDropDown;

	@FindBy(xpath = "//input[@id='FOption_517_0_DefaultFilter_0']")
	public static WebElement enterJEDefaultItemTxt;

	@FindBy(xpath = "/html/body/section/div[1]/div/div/div[2]/ul/li[4]/a/i")
	public static WebElement filteRITEMExpandBtn;

	@FindBy(xpath = "//*[@id='FilterFields_209_0']/li[3]/a")
	public static WebElement filterSalesItemExpandBtn;

	@FindBy(xpath = "/html/body/section/div[1]/div/div/div[2]/ul/ul[4]/li[1]/div/label/span")
	public static WebElement filterItemNameChkbox;

	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr/td[2]")
	public static List<WebElement> reportDateList;

	@FindBy(xpath = "//input[@id='FOption_674_0_DefaultFilter_0']")
	public static WebElement enterJEDefaultAccTxt;

	@FindBy(xpath = "//input[@id='MasterGroup__101']")
	public static WebElement reportaccountTxt;

	@FindBy(xpath = "//*[@id='MasterGroup__101_table_body']/tr/td[2]")
	public static List<WebElement> reportaccountTxtList;

	@FindBy(xpath = "//select[@id='RITCombobox__1']")
	public static WebElement includePdcDropDown;

	@FindBy(xpath = "//select[@id='RITCombobox__5']")
	public static WebElement sortingDropDown;

	@FindBy(xpath = "//select[@id='RITCombobox__10']")
	public static WebElement includeNonAuthorizedDataDropDown;

	@FindBy(xpath = "//input[@id='RITCheckbox__6']")
	public static WebElement displayUnRealizedLossorGainChkBox;

	@FindBy(xpath = "//input[@id='RITCheckbox__4']")
	public static WebElement ignoreConvertedPdcChkBox;

	@FindBy(xpath = "//input[@id='FOption_531_0_DefaultFilter_0']")
	public static WebElement trailBalFilterAccTxt;

	@FindBy(xpath = "(//a[contains(text(),'Account')]/i[1])[1]")
	public static WebElement filterAccountExpandBtn;

	@FindBy(xpath = "(//*[@id='5002']/following-sibling::span)[1]")
	public static WebElement filterAccNameChkbox;

	@FindBy(xpath = "//*[@id='FilterFields_534_0']/ul[1]/li[1]/div/label/span")
	public static WebElement tradingAccProfitAndLossNameChkbox;

	@FindBy(xpath = "(//*[@class='icon-close hiconright2'])[1]")
	public static WebElement homepageCloseBtn;

	@FindBy(xpath = "(//*[@class='icon-close hiconright2'])[1]")
	public static WebElement voucherhomeCloseBtn;

	@FindBy(xpath = "(//*[@class='icon-close hiconright2'])")
	public static WebElement SIVATSettingCloseCloseBtn;

	@FindBy(xpath = "//*[@id='FilterFields_535_0']/ul[1]/li[1]/div/label/span")
	public static WebElement balanceSheetCusFilterNameChkbox;

	@FindBy(xpath = "//*[@id='FilterFields_531_0']/ul[1]/li[1]/div/label/span")
	public static WebElement TrailBal_filterAccNameChkbox;

	@FindBy(xpath = "/html/body/section/div[1]/div/div/div[3]/input[1]")
	public static WebElement filter_FilterOkButton;

	@FindBy(xpath = "//*[@id='FOption_513_0_DefaultFilter_0']")
	public static WebElement enterDefaultAccTxt;

	@FindBy(xpath = "//input[@id='FOption_659_0_DefaultFilter_0']")
	public static WebElement enterVATDefaultAccTxt;

	@FindBy(xpath = "//*[@id='filter_Okbtn_']")
	public static WebElement filterOkButton;

	@FindBy(xpath = "//*[@id='531']")
	public static WebElement trialBalanceReport;

	@FindBy(xpath = "//*[@id='532']")
	public static WebElement profitandLossReport;

	@FindBy(xpath = "//*[@id='533']")
	public static WebElement tradingAccountReport;

	@FindBy(xpath = "//*[@id='534']")
	public static WebElement tradingandProfitAndLossReport;

	@FindBy(xpath = "//*[@id='535']")
	public static WebElement balanceSheetReport;

	@FindBy(xpath = "//*[@id='592']")
	public static WebElement finalAccountSchedulesReport;

	@FindBy(xpath = "//*[@id='593']")
	public static WebElement fundFlowReport;

	@FindBy(xpath = "//*[@id='594']")
	public static WebElement cashFlowReport;

	@FindBy(xpath = "//*[@id='252']")
	public static WebElement cashFlowCalendarReport;

	@FindBy(xpath = "//*[@id='595']")
	public static WebElement cashFlowAnalysisReport;

	@FindBy(xpath = "//*[@id='632']")
	public static WebElement advanceCashFlowReport;

	@FindBy(xpath = "//*[@id='630']")
	public static WebElement incomeExpenseTrendsReport;

	@FindBy(xpath = "//*[@id='655']")
	public static WebElement receivablePayableReport;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[4]/label/span")
	public static WebElement report5chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[8]/label/span")
	public static WebElement report9chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[9]/label/span")
	public static WebElement report10chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[10]/label/span")
	public static WebElement report11chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[11]/label/span")
	public static WebElement report12chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[12]/label/span")
	public static WebElement report13chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[13]/label/span")
	public static WebElement report14chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[14]/label/span")
	public static WebElement report15chkbox;

	@FindBy(xpath = "//*[@id='divBtnGroup4']")
	public static WebElement ItemNewOtherDetailsBtn;

	@FindBy(xpath = "//*[@id='divBtnGroup4']")
	public static WebElement otherDetaislTAB;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[7]/label/span")
	public static WebElement report8chkbox;

	@FindBy(xpath = "//input[@id='FOption_533_0_DefaultFilter_0']")
	public static WebElement tradingAccFilterAccTxt;

	@FindBy(xpath = "//input[@id='FOption_534_0_DefaultFilter_0']")
	public static WebElement tradingAccProfitAndLossCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_535_0_DefaultFilter_0']")
	public static WebElement balSheetCusAccTxt;

	@FindBy(xpath = "//*[@id='id_rc_complete_tree_container']/div[2]/ul/li/span")
	public static WebElement defaultExpandBtn;

	@FindBy(xpath = "//span[contains(text(),'Particulars')]")
	public static WebElement cusParticularBtn;

	@FindBy(xpath = "//*[@id='TCol1']/span")
	public static WebElement cusAccField;

	@FindBy(xpath = "//div[@id='id_focus_msgbox_main']")
	public static WebElement ServerErrorPopup;

	@FindBy(xpath = "//div[@id='id_focus_msgbox_title']/div[2]/span")
	public static WebElement ServerErrorPopupCloseBtn;
	
	
	@FindBy(xpath = "(//*[@aria-label='Close'])[2]")
	public static WebElement ServerCloseIcon;
	
	

	@FindBy(xpath = "//*[@id='id_focus_msgbox_detail']/span/h2/i")
	public static WebElement ServerErrorPopupTxt;

	@FindBy(xpath = "//input[@id='FOption_592_0_DefaultFilter_0']")
	public static WebElement finalaAccScheduleAccTxt;

	@FindBy(xpath = "//input[@id='FOption_593_0_DefaultFilter_0']")
	public static WebElement fundFlowCUsAccTxt;

	@FindBy(xpath = "//input[@id='FOption_594_0_DefaultFilter_0']")
	public static WebElement cashFlowCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_595_0_DefaultFilter_0']")
	public static WebElement cashFlowAnalysisCusAccTxt;

	@FindBy(xpath = "//a[@id='33']")
	public static WebElement budgetPlanningReport;

	@FindBy(xpath = "//input[@id='FOption_655_0_DefaultFilter_0']")
	public static WebElement recAndPayCusAccTxt;

	// Receivable and Payable Analysis Reports Starts from Here

	@FindBy(xpath = "//a[@id='558']//span[contains(text(),'Receivable and Payable Analysis')]")
	public static WebElement receivableAndPayableAnalysisMenu;

	@FindBy(xpath = "//a[@id='605']//span[contains(text(),'Customer Detail')]")
	public static WebElement customerDetailMenu;

	@FindBy(xpath = "//span[contains(text(),'Customer Summary')]")
	public static WebElement customerSummaryMenu;

	@FindBy(xpath = "//a[@id='606']//span[contains(text(),'Vendor Detail')]")
	public static WebElement vendorDetailMenu;

	@FindBy(xpath = "//a[@id='608']//span[contains(text(),'Vendor Summary')]")
	public static WebElement vendorSummaryMenu;

	@FindBy(xpath = "//a[@id='75']//span[contains(text(),'Letter of Credit')]")
	public static WebElement letterOfCreditReport;

	@FindBy(xpath = "//span[contains(text(),'Release Letter of Credit')]")
	public static WebElement releaseLetterOfCreditReport;

	@FindBy(xpath = "//span[contains(text(),'Customer Listing of Outstanding Bills')]")
	public static WebElement customerDetailsCustomerListingOfOutstandingBillsReport;

	@FindBy(xpath = "//span[contains(text(),'Customer Statements')]")
	public static WebElement customerDetailsCustomerStatementsReport;

	@FindBy(xpath = "//span[contains(text(),'Customer Due Date Analysis')]")
	public static WebElement customerDetailsCustomerDueDateAnalysisReport;

	@FindBy(xpath = "//a[@id='563']//span[contains(text(),'Ageing Details')]")
	public static WebElement customerDetailsCustomerAgeingDetailsReport;

	@FindBy(xpath = "//span[contains(text(),'Customer Detail Ageing by Due Date')]")
	public static WebElement customerDetailsCustomerDetailAgeingByDueDateReport;

	@FindBy(xpath = "//a[@id='566']//span[contains(text(),'Overdue Analysis')]")
	public static WebElement customerDetailsCustomerOverdueAnalysisReport;

	@FindBy(xpath = "//span[contains(text(),'Customer Ageing Summary')]")
	public static WebElement customerSummaryCustomerAgeingSummaryReport;

	@FindBy(xpath = "//a[@id='565']//span[contains(text(),'Summary Ageing by Due Date')]")
	public static WebElement customerSummaryAgeingByDueDateReport;

	@FindBy(xpath = "//a[@id='567']//span[contains(text(),'Overdue Summary')]")
	public static WebElement customerSummaryCustomerOverDueSummeryReport;

	@FindBy(xpath = "//span[contains(text(),'Customer bill-wise summary')]")
	public static WebElement customerSummaryCustomerBillWiseSummeryReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Listing of Outstanding Bills')]")
	public static WebElement vendorDetailsVendorListingOfOutstandingBillsReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Statements')]")
	public static WebElement vendorDetailsVendorStatementsReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Due Date Analysis')]")
	public static WebElement vendorDetailsVendorDueDateAnalysisReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Ageing Details')]")
	public static WebElement vendorDetailsVendorAgeingDetailsReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Detail Ageing by Due Date')]")
	public static WebElement vendorDetailsVendorDetailsAgeingByDueDateReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Overdue Analysis')]")
	public static WebElement vendorDetailsVendorOverdueAnalysisReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Ageing Summary')]")
	public static WebElement vendorSummeryVendorAgeingSummaryReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Summary Ageing by Due Date')]")
	public static WebElement vendorSummeryVendorSummaryAgeingByDueDateReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor Overdue Summary')]")
	public static WebElement vendorSummeryVendorOverdueSummaryReport;

	@FindBy(xpath = "//span[contains(text(),'Vendor bill-wise summary')]")
	public static WebElement vendorSummeryVendorBillWiseSummaryReport;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody")
	public static WebElement reportsTable;

	@FindBy(xpath = "//div[@id='REPORTRENDERNEWControls']/ul/li/span[6]")
	public static WebElement sl_BackTrackBtn;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr/td[3]")
	public static List<WebElement> reportTableColumn2RowsList;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[1]/div[1]/div[2]/table/tbody/tr/td")
	public static List<WebElement> backTrackItemDetailsMonthsTableList;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[1]/div[1]/div[2]/table")
	public static WebElement backTrackItemDetailsMonthsTable;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	public static WebElement backTrackItemDetailsMonths1stRow1stCol;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[1]/div[1]/div[2]/table/tbody/tr[2]/td[1]")
	public static WebElement backTrackItemDetailsMonths2ndRow1stCol;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[2]/div[1]/div[2]/table/tbody/tr/td")
	public static List<WebElement> backTrackItemDetailsDaysTableList;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[2]/div[1]/div[2]/table")
	public static WebElement backTrackItemDetailsDaysTable;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	public static WebElement backTrackItemDetailsDays1stRow1stCol;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[3]/div[1]/div[2]/table/tbody/tr/td")
	public static List<WebElement> backTrackItemDetailsVouchersTableList;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[3]/div[1]/div[2]/table")
	public static WebElement backTrackItemDetailsVouchersTable;

	@FindBy(xpath = "//div[@id='dvReportRenderBacktracking']/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	public static WebElement backTrackItemDetailsVouchers1stRow1stCol;

	// Voucher Entry Page Header Fields

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement vcustomerAccountTxt;

	@FindBy(xpath = "//input[@id='id_header_268435460']")
	public static WebElement warehouseTxt;

	@FindBy(xpath = "//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
	public static List<WebElement> warehouseHeaderComboList;

	@FindBy(xpath = "//tbody[@id='id_body_23_table_body']/tr/td[2]")
	public static List<WebElement> itemComboList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]")
	public static WebElement select1stRow_17thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
	public static WebElement select1stRow_18thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[20]")
	public static WebElement select1stRow_19thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[21]")
	public static WebElement select1stRow_20thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[22]")
	public static WebElement select1stRow_21stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[23]")
	public static WebElement select1stRow_22ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[24]")
	public static WebElement select1stRow_23rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[25]")
	public static WebElement select1stRow_24thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[14]")
	public static WebElement select2ndRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[18]")
	public static WebElement select2ndRow_17thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[19]")
	public static WebElement select2ndRow_18thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[20]")
	public static WebElement select2ndRow_19thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[18]")
	public static WebElement select3rdRow_17thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[19]")
	public static WebElement select3rdRow_18thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[20]")
	public static WebElement select3rdRow_19thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[21]")
	public static WebElement select3rdRow_20thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[22]")
	public static WebElement select3rdRow_21stColumn;
	
	
	@FindBy(xpath="//*[@id='RITCombobox__2']") 
	public static WebElement osr_includeBillsDropdown;

	@FindBy(xpath = "//input[@id='FOption_559_0_DefaultFilter_0']")
	public static WebElement cusOutStandingBillsCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_560_0_DefaultFilter_0']")
	public static WebElement cusStatementCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_561_0_DefaultFilter_0']")
	public static WebElement custDuDateAnalysisCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_563_0_DefaultFilter_0']")
	public static WebElement custAgeingDetailsAnalysisCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_564_0_DefaultFilter_0']")
	public static WebElement custAgeingDetailsDueDateCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_566_0_DefaultFilter_0']")
	public static WebElement custOverDueDateCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_541_0_DefaultFilter_0']")
	public static WebElement venListingOutstandBillCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_542_0_DefaultFilter_0']")
	public static WebElement vendorStatementCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_543_0_DefaultFilter_0']")
	public static WebElement vendorDueDateCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_545_0_DefaultFilter_0']")
	public static WebElement vendorAgeingDetailAnalysisCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_546_0_DefaultFilter_0']")
	public static WebElement vendorAgeingDetailByDueDateCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_548_0_DefaultFilter_0']")
	public static WebElement vendorOverDueCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_544_0_DefaultFilter_0']")
	public static WebElement vendorAheingSummaryAnalysisCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_547_0_DefaultFilter_0']")
	public static WebElement vendorAgeingSummaryByDueDateCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_549_0_DefaultFilter_0']")
	public static WebElement vendorSummeryOverDueCusAccTxt;

	@FindBy(xpath = "//input[@id='FOption_634_0_DefaultFilter_0']")
	public static WebElement vendorSummeryBillwiseCusAccTxt;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[6]/label/span")
	public static WebElement report7chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[15]/label/span")
	public static WebElement report16chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[20]/label/span")
	public static WebElement report21chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[16]/label/span")
	public static WebElement report17chkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[17]/label/span")
	public static WebElement report18chkbox;

	

	@FindBy(xpath = "//input[@id='txtBackUpFile']")
	public static WebElement backUpEnterFileNameTxt;

	@FindBy(xpath = "//*[@id='BackUpControls']/ul/li/div[1]/div[2]")
	public static WebElement backUpScreenBackUpBtn;

	@FindBy(xpath = "//*[@id='26']/span")
	public static WebElement backup;

	// Manual Adjustmnet Screen starts from here

	@FindBy(xpath = "//select[@id='id_SelectARAP']")
	public static WebElement MA_ARAPDrpdwn;

	@FindBy(xpath = "//input[@id='optTag']")
	public static WebElement MA_DepDrpDwn;

	@FindBy(xpath = "//select[@id='id_SelectType']")
	public static WebElement MA_SelectTypeDrpdwn;

	@FindBy(xpath = "//input[@id='optAccount']")
	public static WebElement MA_AccountDrpdwn;

	@FindBy(xpath = "//input[@id='optCurrency']")
	public static WebElement MA_CurrencyDrpDwn;

	@FindBy(xpath = "//span[@id='btnLoad']")
	public static WebElement MA_LoadBtn;

	@FindBy(xpath = "//span[@id='btnOk']")
	public static WebElement MA_OkBtn;

	@FindBy(xpath = "//span[@id='btnCancel']")
	public static WebElement MA_CanelBtn;

	@FindBy(xpath = "//*[@id='id_DrAdj_Grid_body']/tr")
	public static WebElement MA_DebitRowList;

	@FindBy(xpath = "//*[@id='id_CrAdj_Grid_body']/tr")
	public static WebElement MA_CreditRowList;

	@FindBy(xpath = "//label[@id='id_lblLeftGridTotal']")
	public static WebElement MA_DebitTotalSum;

	@FindBy(xpath = "//label[@id='id_lblRightGridTotal']")
	public static WebElement MA_CreditTotalSum;

	@FindBy(xpath = "//*[@id='20']/span")
	public static WebElement utilitesMenu;

	@FindBy(xpath = "//*[@id='3316']/span")
	public static WebElement ManualAdjustemntMenu;

	@FindBy(xpath = "//*[@id='id_CrAdj_Grid_col_1-1']/input")
	public static WebElement MA_CreditSide1stRowChkBox;

	@FindBy(xpath = "//*[@id='id_DrAdj_Grid_col_1-1']/input")
	public static WebElement MA_DebitSide1stRowChkBox;

	@FindBy(xpath = "//*[@id='id_DrAdj_Grid_body']/tr[1]/td")
	public static List<WebElement> MA_DebitSideRow1list;

	@FindBy(xpath = "//*[@id='id_CrAdj_Grid_body']/tr[1]/td")
	public static List<WebElement> MA_CreditSideRow1list;

	@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
	public static WebElement infosideMinimiseBtn;

	// DataManagement menu
	@FindBy(xpath = "//*[contains(text(),' Data Management ')]")
	public static WebElement dataMangementMenu;

	@FindBy(xpath = "//*[@id='115']")
	public static WebElement eraseAll;

	@FindBy(xpath = "//*[@id='navbarSupportedContent2']/ul/li[2]/a/i")
	public static WebElement eraseAllCancelBtn;

	@FindBy(xpath = "//input[@id='idEraseTransaction']")
	public static WebElement eraseTranscationsRadio;

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	public static WebElement loginRefreshOkBtn;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li/a/div/div")
	public static List<WebElement> menusList;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li/a/span")
	public static List<WebElement> inventoryMenusList;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li[1]/ul/li/a/span")
	public static List<WebElement> inventoryTransactionsMenusList;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li[1]/ul/li[3]/ul/li/a/span")
	public static List<WebElement> inventoryTransactionsStocksMenusList;

	@FindBy(xpath = "//*[@id='dv_TranHomeHeading']/nav/div[2]/div/div/div[2]")
	public static List<WebElement> openingStocksNewToolBarButtons;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li[2]/ul/li/a/span")
	public static List<WebElement> financialsMenusList;

	@FindBy(xpath = "//*[@id='62']/span")
	public static WebElement finCreditManagMenu;

	@FindBy(xpath = "//*[@id='81']")
	public static WebElement financialsReportsMenu;

	@FindBy(xpath = "//*[@id='60']")
	public static WebElement financialsMenu;

	@FindBy(xpath = "//input[@id='id_transactionentry_raisechequereturn_popup_vouchertype']")
	public static WebElement unadjsutedChqueReturCunbobox;

	@FindBy(xpath = "//*[@id='id_transactionentry_raisechequereturn_popup_footer']//div/input[1]")
	public static WebElement unadjsutedChqueReturnPopOkBtn;

	@FindBy(xpath = "//*[@id='63']/span")
	public static WebElement paymentTerms;

	@FindBy(xpath = "//a[@id='1104']//span[contains(text(),'Account')]")
	public static WebElement accounts;

	@FindBy(xpath = "//input[@id='sName']")
	public static WebElement newGeneralName;

	@FindBy(xpath = "//input[@id='sCode']")
	public static WebElement newGeneralCode;

	@FindBy(xpath = "//*[@class='icon-delete hiconright2']")
	public static WebElement payTerms_DeleteBtn;

	@FindBy(xpath = "(//*[@id='btnMasterSaveClick'])[1]")
	public static WebElement masterSaveBtn;

	@FindBy(xpath = "//*[@id='PaymentTermsSave']")
	public static WebElement payTerms_SaveBtn;

	@FindBy(xpath = "//*[@id='btnClose']")
	public static WebElement payTerms_CloseBtn;

	@FindBy(xpath = "//*[@id='ReminderNavBar']/div/nav/ol/li")
	public static List<WebElement> payTerms_Label;

	@FindBy(xpath = "//*[@id='PaymentTermsGrid_head']/tr/th")
	public static List<WebElement> payTerms_HeaderList;

	@FindBy(xpath = "//*[@id='PaymentTermsGrid_body']/tr[1]/td")
	public static List<WebElement> payTerms_Row1List;

	@FindBy(xpath = "//*[@id='PaymentTermsGrid_body']/tr[2]/td")
	public static List<WebElement> payTerms_Row2List;

	@FindBy(xpath = "//*[@id='PaymentTermsGrid_col_1-2']")
	public static WebElement pt_SelectRow1_1stCol;

	@FindBy(xpath = "//*[@id='PaymentTermsGrid_col_2-2']")
	public static WebElement pt_SelectRow2_1stCol;

	@FindBy(xpath = "//*[@id='id_Code']")
	public static WebElement pt_EnterCode;

	@FindBy(xpath = "//*[@id='id_Desc']")
	public static WebElement pt_EnterDes;

	@FindBy(xpath = "//*[@id='DiscountAccCtrlOption']")
	public static WebElement pt_EnterDisAcc;

	@FindBy(xpath = "//*[@id='slopt1']")
	public static WebElement pt_EnterDuDate;

	@FindBy(xpath = "//*[@id='opt1Txt']")
	public static WebElement pt_EnterDuDateDays;

	@FindBy(xpath = "//*[@id='dis1slopt1']")
	public static WebElement pt_EnterDisDate;

	@FindBy(xpath = "//*[@id='dis1opt1Txt']")
	public static WebElement pt_EnterDisDateDays;

	@FindBy(xpath = "//*[@id='id_Dis']")
	public static WebElement pt_EnterDisPercentage1;

	@FindBy(xpath = "//*[@id='dis2slopt1']")
	public static WebElement pt_EnterDis_DisDueDate1;

	@FindBy(xpath = "//*[@id='dis2opt1Txt']")
	public static WebElement pt_EnterDis_DisDueDateDays1;

	@FindBy(xpath = "//*[@id='id_Dis2']")
	public static WebElement pt_EnterDisPercentage2;

	@FindBy(xpath = "//*[@id='dis3slopt1']")
	public static WebElement pt_EnterDis_DisDueDate2;

	@FindBy(xpath = "//*[@id='dis3opt1Txt']")
	public static WebElement pt_EnterDis_DisDueDateDays2;

	@FindBy(xpath = "//*[@id='id_Dis3']")
	public static WebElement pt_enterDis3;

	@FindBy(xpath = "//*[@id='PaymentTermsGrid_col_1-1']")
	public static WebElement pt_selectRow1;

	@FindBy(xpath = "//*[@id='PaymentTermsGrid_col_1-7']")
	public static WebElement pt_selectRow1_7thcol;

	@FindBy(xpath = "//*[@id='530']")
	public static WebElement financialsFinalAccountsMenu;

	@FindBy(xpath = "//*[@id='558']")
	public static WebElement financialsReceivableAndPayableAnalysisMenu;

	@FindBy(xpath = "//*[@id='3301']")
	public static WebElement financialsBudgetMenu;

	@FindBy(xpath = "//*[@id='3311']")
	public static WebElement financialsOnlinePaymentsMenu;

	public static int cSize;

	@FindBy(xpath = "//table[@id='id_rc_columnheadertable']/thead/tr/th/div/p")
	public static List<WebElement> custBodyHeaderList;

	@FindBy(xpath = "//*[@id='plnCustomizecolumn']/div/span[4]/a")
	public static WebElement custRemoveBtn;

	@FindBy(xpath = "//*[@id='Save']/i")
	public static WebElement custSaveBtn;

	@FindBy(xpath = "//*[@id='btnCustomizeClose']/div[1]/span")
	public static WebElement custCancelBtn;

	@FindBy(xpath = "//*[@id='id_header_4_table_body']/tr")
	public static List<WebElement> cashAndBAnkAccountList;

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement newCashBankAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_6']")
	public static WebElement voucherHeaderDueDate;

	@FindBy(xpath = "//*[text()='Pending Bills']")
	public static WebElement pendingBillsViewBtn;

	@FindBy(xpath = "//*[@id='2005']")
	public static WebElement postDatedRecepitsMenu;

	@FindBy(xpath = "//*[@id='2006']")
	public static WebElement postDatedPaymentsMenu;

	@FindBy(xpath = "//*[@id='mytable_body']/tr/td[3]")
	public static List<WebElement> pdcCheckBoxlist;

	@FindBy(xpath = "//*[@id='mytable_body']/tr/td[4]")
	public static List<WebElement> pdcDOClist;

	@FindBy(xpath = "//*[@id='mytable_body']/tr/td[6]")
	public static List<WebElement> pdcBanklist;

	@FindBy(xpath = "//*[@id='mytable_ConvertedDocument']")
	public static WebElement enterToConvert;

	@FindBy(xpath = "(//td[contains(text(),'Post-Dated Receipts')]//following-sibling::td)[1]")
	public static WebElement postDatedReceiptsConvertCOl;

	@FindBy(xpath = "(//td[contains(text(),'Post-Dated Payments')]//following-sibling::td)[1]")
	public static WebElement postDatedPaymentsConvertCOl;

	@FindBy(xpath = "//*[@id='id_header_10']")
	public static WebElement voucherHeaderCurrency;
	
	@FindBy(xpath = "//*[@id='id_header_11']")
	public static WebElement exchangeRateTxt;

	@FindBy(xpath = "//*[@id='id_header_145']")
	public static WebElement voucherHeaderLocalExchangeRate;

	@FindBy(xpath = "//table[@id='id_TranTable']/tbody")
	public static WebElement voucherBodyGridRowCount;

	@FindBy(xpath = "//tbody[@id='id_body_12_table_body']/tr/td[2]")
	public static List<WebElement> bodyAccountListInGrid;

	@FindBy(xpath = "//*[@id='id_body_39_table_body']/tr")
	public static List<WebElement> bodyCreditAccountListInGrid;

	// Bill Reference Screen

	@FindBy(xpath = "//input[@id='txtNewReference']")
	public static WebElement billRefNewReferenceTxt;

	@FindBy(xpath = "//input[@id='txtOnAccount']")
	public static WebElement billRefTxtOnAccount;

	@FindBy(xpath = "//input[@id='Searchtxt']")
	public static WebElement billRefSearchTxt;

	@FindBy(xpath = "//select[@id='cbmShowBillForAdjustment']")
	public static WebElement billRefNewReferenceDropdown;

	@FindBy(xpath = "//select[@id='cbmShowBills']")
	public static WebElement billRefShowBillsDropdown;

	@FindBy(xpath = "//th[@id='id_Adjustment_Grid_control_heading_11']//div[contains(text(),'Due Date')]")
	public static WebElement billRefGridHeaderDueDate;

	@FindBy(xpath = "//th[@id='id_Adjustment_Grid_control_heading_16']//div[contains(text(),'Currency')]")
	public static WebElement billRefGridHeaderCurrency;

	@FindBy(xpath = "//th[@id='id_Adjustment_Grid_control_heading_21']//div[contains(text(),'Original Amt')]")
	public static WebElement billRefGridHeaderOrginalAmt;

	@FindBy(xpath = "//th[@id='id_Adjustment_Grid_control_heading_23']//div[contains(text(),'Balance Amount')]")
	public static WebElement billRefGridHeaderBalanceAmt;

	@FindBy(xpath = "//th[@id='id_Adjustment_Grid_control_heading_33']//div[contains(text(),'Adjustment Amount')]")
	public static WebElement billRefGridHeaderAdjustmentAmt;

	@FindBy(xpath = "//div[contains(text(),'Native Currency')]")
	public static WebElement billRefGridHeaderNativeCurrency;

	@FindBy(xpath = "//th[@id='id_Adjustment_Grid_control_heading_41']//div[contains(text(),'Narration')]")
	public static WebElement billRefGridHeaderNarration;

	@FindBy(xpath = "//th[@id='id_Adjustment_Grid_control_heading_50']//div[contains(text(),'Previous Adjustment Amount')]")
	public static WebElement billRefGridHeaderPreviosAdjustmentAmt;

	@FindBy(xpath = "//td[@id='id_Adjustment_Grid_col_1-0']")
	public static WebElement billRefGridFirstRow;

	@FindBy(xpath = "//td[@id='id_Adjustment_Grid_col_1-1']//input")
	public static WebElement billRefGridFirstRowChkbox;

	@FindBy(xpath = "//td[@id='id_Adjustment_Grid_col_2-1']//input")
	public static WebElement billRefGridSecondRowChkbox;

	@FindBy(xpath = "//td[@id='id_Adjustment_Grid_col_3-1']//input")
	public static WebElement billRefGridThirdRowChkbox;

	@FindBy(xpath = "//*[@id='Searchtxt']")
	public static WebElement billwise_SearchTxt;

	@FindBy(xpath = "//*[@id='cbmSearchOnField']")
	public static WebElement billwise_CmbDrp;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[13]")
	public static WebElement billRefGridFirstRowAdjustmentAmtTxt;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[2]/td[13]")
	public static WebElement billRefGridSecondRowAdjustmentAmtTxt;

	@FindBy(xpath = "//td[@id='id_Adjustment_Grid_col_3-33']")
	public static WebElement billRefGridThirdRowAdjustmentAmtTxt;

	@FindBy(xpath = "//td[@id='id_Adjustment_Grid_col_1-41']")
	public static WebElement billRefGridFirstNarrationTxt;

	@FindBy(xpath = "//td[@id='id_Adjustment_Grid_col_2-41']")
	public static WebElement billRefGridSecondNarrationTxt;

	@FindBy(xpath = "//td[@id='id_Adjustment_Grid_col_3-41']")
	public static WebElement billRefGridThirdNarrationTxt;

	@FindBy(xpath = "//input[@id='id_Narration']")
	public static WebElement narrationToWrite;

	@FindBy(xpath = "//input[@id='id_limit']")
	public static WebElement adjustAmtToWrite;

	@FindBy(xpath = "//div[@class='col-xs-6 navbar-header']//div[@class='navText']")
	public static WebElement billRefPaymentsBillReferenceLabel;

	@FindBy(xpath = "//div[@class='col-sm-12 col-md-3']//input[@class='Fbutton']")
	public static WebElement billRefAdjustOnFIFOBtn;

	@FindBy(xpath = "//*[@id='id_Pick']/a/span")
	public static WebElement billRefPickIcon;

	@FindBy(xpath = "//*[@id='id_Ok']/a/span")
	public static WebElement billRefOkBtn;
	
	@FindBy(xpath = "//*[@value='Adjust on FIFO']")
	public static WebElement adjustOnFifoBtn;
	

	@FindBy(xpath = "//*[@id='id_Cancel']/a/span")
	public static WebElement billRefcancel;

	@FindBy(xpath = "//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	public static WebElement billRefSummatyValueNet;

	@FindBy(xpath = "//i[@class='icon-ok hiconright2']")
	public static WebElement eraseAllOkBtn;

	@FindBy(xpath = "//td[@id='AccountAmount_col_1-1']")
	public static WebElement billRefGridVendorRow1;

	@FindBy(xpath = "//td[@id='AccountAmount_col_1-2']")
	public static WebElement billRefGridVendorAmtRow1;

	@FindBy(xpath = "//td[@id='AccountAmount_col_2-1']")
	public static WebElement billRefGridVendorRow2;

	@FindBy(xpath = "//td[@id='AccountAmount_col_2-2']")
	public static WebElement billRefGridVendorAmtRow2;

	@FindBy(xpath = "//td[@id='AccountAmount_col_3-1']")
	public static WebElement billRefGridVendorRow3;

	@FindBy(xpath = "//td[@id='AccountAmount_col_4-1']")
	public static WebElement billRefGridVendorRow4;

	@FindBy(xpath = "//label[@id='tbNewRefAmountAdjValue']")
	public static WebElement amtAdjustedAgainstNewREfinOtherVouchers;

	@FindBy(xpath = "//label[@id='tbAmountToAdjustInTransCurrencyValue']")
	public static WebElement transactionCurency;

	@FindBy(xpath = "//label[@id='tbAmountToAdjustInBaseCurrencyValue']")
	public static WebElement baseCurrency;

	@FindBy(xpath = "//label[@id='tbAmountToAdjustInLocalCurrencyValue']")
	public static WebElement localCurrencyDhs;

	@FindBy(xpath = "//label[@id='tbNewRefBalAmountValue']")
	public static WebElement balanceNewReferenceAmt;

	@FindBy(xpath = "//li[@id='id_li_Adjustment_Tab_BreakUpByTag']//span[@class='font-5'][contains(text(),'Break Up by Tag')]")
	public static WebElement breakUpByTagTab;

	@FindBy(xpath = "//span[@class='font-5'][contains(text(),'Adjustment')]")
	public static WebElement adjustmentTab;

	@FindBy(xpath = "//td[@id='id_BreakUpByTag_Grid_col_1-9']")
	public static WebElement breakUpByTagDueDate;

	@FindBy(xpath = "//td[@id='id_BreakUpByTag_Grid_col_1-10']")
	public static WebElement breakUpByTagDepartment;

	@FindBy(xpath = "//td[@id='id_BreakUpByTag_Grid_col_1-18']")
	public static WebElement breakUpByTagBaseCurrency;

	@FindBy(xpath = "//td[@id='id_BreakUpByTag_Grid_col_1-17']")
	public static WebElement breakUpByTagBillCurrency;

	@FindBy(xpath = "//td[@id='id_BreakUpByTag_Grid_col_1-20']")
	public static WebElement breakUpByTagBaseConversionRate;

	@FindBy(xpath = "//td[@id='id_BreakUpByTag_Grid_col_1-21']")
	public static WebElement breakUpByTagBaseLocalCurrency;

	@FindBy(xpath = "//label[@id='txtblkAmountadjusted']")
	public static WebElement billRefAdjustAmountInTransCurency;

	@FindBy(xpath = "//label[@id='txtblkAmounttobeadjust']")
	public static WebElement billRefBalanceAmountAdjustInTrnasCurrency;
	

	@FindBy(xpath = "//*[@id='id_BillWise_IP_BaseCurrencyValue']")
	public static WebElement conversationRateBaseCurrencyRate2;
	

	@FindBy(xpath = "//label[@id='id_BillWise_IP_LocalConversionRateValue']")
	public static WebElement billRefInfoBarLocalCurrencyRate;

	@FindBy(xpath = "//label[@id='tbAmountToAdjustInTransCurrencyValue']")
	public static WebElement billRefTransactionCurency;

	@FindBy(xpath = "//label[@id='tbAmountToAdjustInBaseCurrencyValue']")
	public static WebElement billRefBaseCurrency;

	@FindBy(xpath = "//label[@id='id_BillWise_IP_AccountName']")
	public static WebElement breakUpDetailsAccount;

	@FindBy(xpath = "//label[@id='id_BillWise_IP_ProductName']")
	public static WebElement breakUpDetailsItem;

	@FindBy(xpath = "//label[@id='id_BillWise_IP_TagName']")
	public static WebElement breakUpDetailsDepartment;

	@FindBy(xpath = "//*[@id='id_BillWise_IP_BaseCurrencyValue']")
	public static WebElement conversationRateBaseCurrencyRate;

	@FindBy(xpath = "//*[@id='id_BillWise_IP_LocalConversionRateValue']")
	public static WebElement conversationRateLocalCurrencyRate;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAEDTranAmountValue']")
	public static WebElement asOnEntryDateTransAmt;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAEDBaseConversionValue']")
	public static WebElement asOnEntryDateBaseConcersationRate;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAEDBaseAmountValue']")
	public static WebElement asOnEntryDateBaseAmount;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAEDLocalConversionValue']")
	public static WebElement asOnEntryDateLocConversationRate;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAEDLocalAmountValue']")
	public static WebElement asOnEntryDateAmt;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAADTranAmountValue']")
	public static WebElement balOnAdjstDateTransAmt;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAADBaseConversionValue']")
	public static WebElement balOnAdjstDateBasrConversionRate;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAADBaseAmountValue']")
	public static WebElement balOnAdjstDateBaseAmount;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAADLocalConversionValue']")
	public static WebElement balOnAdjstDateLocalConversionRate;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAADLocalAmountValue']")
	public static WebElement balOnAdjstDateAmt;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAdjTranAmountValue']")
	public static WebElement adjustmentsAmount1;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAdjBaseAmountValue']")
	public static WebElement adjustmentsAmount2;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblAdjLocalAmountValue']")
	public static WebElement adjustmentsAmount3;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblNativeCurrencyValue']")
	public static WebElement adjustmentsAmount4;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblExDiffTranAmountValue']")
	public static WebElement exchangeGainLossForBaseCurrency;

	@FindBy(xpath = "//label[@id='id_infoPanel_lblExDiffLocalAmountValue']")
	public static WebElement exchangeGainLossForLocalCurrency;

	@FindBy(xpath = "//input[@id='id_limit']")
	public static WebElement gridEnterAdjustAmtRow1;

	// Billreference Body Grid Elements

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[1]/td[8]")
	public static WebElement gridOrginalAmtRow1;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[2]/td[8]")
	public static WebElement gridOrginalAmtRow2;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[3]/td[8]")
	public static WebElement gridOrginalAmtRow3;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[4]/td[8]")
	public static WebElement gridOrginalAmtRow4;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[5]/td[8]")
	public static WebElement gridOrginalAmtRow5;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[1]/td[10]")
	public static WebElement gridBalanceAmtRow1;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[2]/td[10]")
	public static WebElement gridBalanceAmtRow2;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[3]/td[10]")
	public static WebElement gridBalanceAmtRow3;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[4]/td[10]")
	public static WebElement gridBalanceAmtRow4;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[5]/td[10]")
	public static WebElement gridBalanceAmtRow5;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[1]/td[13]")
	public static WebElement gridAdjustmentAmtRow1;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[2]/td[13]")
	public static WebElement gridAdjustmentAmtRow2;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[3]/td[13]")
	public static WebElement gridAdjustmentAmtRow3;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[4]/td[13]")
	public static WebElement gridAdjustmentAmtRow4;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[5]/td[13]")
	public static WebElement gridAdjustmentAmtRow5;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']")
	public static WebElement billRefAdjustBills;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr")
	public static List<WebElement> billRefAdjustBillsGrid;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[1]/td[3]")
	public static WebElement billRefAdjustBillsRow1DocNo;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[2]/td[3]")
	public static WebElement billRefAdjustBillsRow2DocNo;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[3]/td[3]")
	public static WebElement billRefAdjustBillsRow3DocNo;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[4]/td[3]")
	public static WebElement billRefAdjustBillsRow4DocNo;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr[5]/td[3]")
	public static WebElement billRefAdjustBillsRow5DocNo;

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr/td[2]")
	public static WebElement InfoSideBarDocRow1;

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr/td[3]")
	public static WebElement InfoSideBarAmtRow1;

	@FindBy(xpath = "//tbody[@id='InfPnlAdjGrd_body']//td[4]")
	public static WebElement InfoSideBarBaseAmtRow1;

	// Row 2

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr[2]/td[2]")
	public static WebElement InfoSideBarDocRow2;

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr[2]/td[3]")
	public static WebElement InfoSideBarAmtRow2;

	@FindBy(xpath = "//tbody[@id='InfPnlAdjGrd_body']//tr[2]//td[4]")
	public static WebElement InfoSideBarBaseAmtRow2;

	// Row 3

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr[3]/td[2]")
	public static WebElement InfoSideBarDocRow3;

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr[3]/td[3]")
	public static WebElement InfoSideBarAmtRow3;

	@FindBy(xpath = "//tbody[@id='InfPnlAdjGrd_body']//tr[3]//td[4]")
	public static WebElement InfoSideBarBaseAmtRow3;

	// Row 4

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr[4]/td[2]")
	public static WebElement InfoSideBarDocRow4;

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr[4]/td[3]")
	public static WebElement InfoSideBarAmtRow4;

	@FindBy(xpath = "//tbody[@id='InfPnlAdjGrd_body']//tr[4]//td[4]")
	public static WebElement InfoSideBarBaseAmtRow4;

	// row 5

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr[5]/td[2]")
	public static WebElement InfoSideBarDocRow5;

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr[5]/td[3]")
	public static WebElement InfoSideBarAmtRow5;

	@FindBy(xpath = "//tbody[@id='InfPnlAdjGrd_body']//tr[5]//td[4]")
	public static WebElement InfoSideBarBaseAmtRow5;

	@FindBy(xpath = "//tbody[@id='id_body_12_table_body']/tr/td[2]")
	public static List<WebElement> openingBalAccountListInGrid;

	@FindBy(xpath = "//input[@id='id_body_19']")
	public static WebElement enter_OBCreditACTxt;

	@FindBy(xpath = "//*[@id='lblAccount']")
	public static WebElement billRefPartyName;

	// Purchase Voucher VAT
	@FindBy(xpath = "//*[@id='2007']")
	public static WebElement financialsTransactionsPurchaseMenu;

	@FindBy(xpath = "//*[@id='2057']")
	public static WebElement purchaseVouchersVat;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr/td")
	public static List<WebElement> reportBodyList;

	@FindBy(xpath = "//input[@id='RITCheckbox__2']")
	public static WebElement movedAccOnlyChkBox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[6]/label/span")
	public static WebElement showallConsildateAmtChkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[5]/label/span")
	public static WebElement includePurchaseReturnChkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[7]/label/span")
	public static WebElement printAccIndexChkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[8]/label/span")
	public static WebElement freshPageAccChkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[9]/label/span")
	public static WebElement printAsStatementAccChkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[10]/label/span")
	public static WebElement ignoreTransBalProfitAndLossChkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[11]/label/span")
	public static WebElement displayTotalAtEndOfGroupChkbox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[12]/label/span")
	public static WebElement dontMoveAccBasedOnBalChkbox;

	@FindBy(xpath = "//input[@id='RITCheckbox__6']")
	public static WebElement displayUnReliziedchkbox;

	@FindBy(xpath = "//input[@id='RITCheckbox__4']")
	public static WebElement ignoreConvertedPDCChkbox;

	@FindBy(xpath = "//input[@id='RITCheckbox__7']")
	public static WebElement displayedMaturedPDCChkbox;

	@FindBy(xpath = "//a[@id='207']")
	public static WebElement vatReportMenu;

	@FindBy(xpath = "//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[7]/ul/li/a/span")
	public static List<WebElement> vatReportList;

	@FindBy(xpath = "//span[contains(text(),'Purchase Account Report')]")
	public static WebElement purchaseAccountReport;

	@FindBy(xpath = "//span[contains(text(),'VAT detailed report')]")
	public static WebElement vatDetailedReport;

	@FindBy(xpath = "//span[contains(text(),'Sales Account Report')]")
	public static WebElement salesAccountReport;

	@FindBy(xpath = "//span[contains(text(),'Sales by Customer Report')]")
	public static WebElement salesByCustomerReport;

	@FindBy(xpath = "//span[contains(text(),'VAT summary report')]")
	public static WebElement vatSummaryReport;

	@FindBy(xpath = "//span[contains(text(),'VAT audit file')]")
	public static WebElement vatAuditFileReport;

	@FindBy(xpath = "//span[contains(text(),'VAT return report')]")
	public static WebElement vatReturnReport;

	@FindBy(xpath = "//span[contains(text(),'Sales advance VAT report')]")
	public static WebElement salesAdvanceVatReport;

	@FindBy(xpath = "//select[@id='RITCombobox__1']")
	public static WebElement transactionTypeDropDown;

	@FindBy(xpath = "//select[@id='RITCombobox__2']")
	public static WebElement voucherTypeDropDown;

	@FindBy(xpath = "//select[@id='RITCombobox__3']")
	public static WebElement selectDealersDropDown;

	// Bank Reconciliation

	@FindBy(xpath = "//*[@id='btnSaveDisable']")
	public static WebElement BRsaveBtn;

	@FindBy(xpath = "//div[contains(text(),'Backtrack')]")
	public static WebElement backTrackBtn;

	@FindBy(xpath = "//div[contains(text(),'Customize')]")
	public static WebElement BRcustomizeBtn;

	@FindBy(xpath = "//div[contains(text(),'Cancel')]")
	public static WebElement BRcancelBtn;

	@FindBy(xpath = "//input[@id='OptCtrlBank']")
	public static WebElement reportbankTxt;

	@FindBy(xpath = "//*[@id='OptCtrlBank_table_body']/tr/td[2]")
	public static List<WebElement> reportbankList;

	@FindBy(xpath = "//select[@id='sortOrder']")
	public static WebElement sortOrderDropDown;

	@FindBy(xpath = "//select[@id='selectStatus']")
	public static WebElement selectStatusDropDown;

	@FindBy(xpath = "//select[@id='DatePeriod']")
	public static WebElement datePeriodDropDown;

	@FindBy(xpath = "//input[@id='chkShow']")
	public static WebElement showConsolidatedAmountsForBankDeposits;

	@FindBy(xpath = "//select[@id='SelectDebit']")
	public static WebElement selectDrCrDropDown;

	@FindBy(xpath = "//div[@id='btnAdvFilterText']")
	public static WebElement advanceFilterBtn;
	
	@FindBy(xpath = "//*[@id='a']")
	public static WebElement advanceFilterBtn1;

	//@FindBy(xpath = "//span[@id='btnClear']")
	@FindBy(xpath="//input[@value='Clear']")
	public static WebElement clearBtn;

	@FindBy(xpath = "//*[@id='selectContainer']/div[5]/div[2]/div/input[3]")
	public static WebElement LoadBtn;

	@FindBy(xpath = "(//*[@id='panelsStayOpen-headingOne'])[2]")
	public static WebElement settingMis_VoucherAccSettingExpandBtn;

	@FindBy(xpath = "//button[@id='btnPendingBills']")
	public static WebElement BRpendingBillsBtn;

	@FindBy(xpath = "//button[@id='btnRaiseReceipt']")
	public static WebElement raiseReceiptsBtn;

	@FindBy(xpath = "//button[@id='btnRaisePayment']")
	public static WebElement raisePaymentsBtn;

	@FindBy(xpath = "//thead[@id='BRTable_head']/tr/th/div")
	public static List<WebElement> reporttableHeadeList;

	@FindBy(xpath = "//*[@id='BRTable_body']/tr[1]/td")
	public static List<WebElement> bankRecRow1List;

	@FindBy(xpath = "//*[@id='BRTable_body']/tr[2]/td")
	public static List<WebElement> bankRecRow2List;

	@FindBy(xpath = "//*[@id='BRTable_body']/tr[3]/td")
	public static List<WebElement> bankRecRow3List;

	@FindBy(xpath = "//*[@id='BRTable_body']/tr[4]/td")
	public static List<WebElement> bankRecRow4List;

	@FindBy(xpath = "//*[@id='BRTable_body']/tr[5]/td")
	public static List<WebElement> bankRecRow5List;

	@FindBy(xpath = "//*[@id='BRTable_body']/tr[6]/td")
	public static List<WebElement> bankRecRow6List;

	@FindBy(xpath = "//*[@id='BRTable_body']/tr[7]/td")
	public static List<WebElement> bankRecRow7List;

	@FindBy(xpath = "//*[@id='BRTable_body']/tr[8]/td")
	public static List<WebElement> bankRecRow8List;
	
	@FindBy(xpath = "//*[@id='BRTable_body']/tr[9]/td")
	public static List<WebElement> bankRecRow9List;
	
	@FindBy(xpath = "//*[@id='BRTable_body']/tr[10]/td")
	public static List<WebElement> bankRecRow10List;

	@FindBy(xpath = "//label[@id='bookBal']")
	public static WebElement bankRecBookBal;

	@FindBy(xpath = "//*[@id='CancelCreateUser']/i")
	public static WebElement bankRecCloseBn;

	@FindBy(xpath = "//label[@id='outDebits']")
	public static WebElement bankRecOutDebits;

	@FindBy(xpath = "//label[@id='outCredits']")
	public static WebElement bankRecOutCredits;

	@FindBy(xpath = "//label[@id='clearedBal']")
	public static WebElement bankRecClearedBal;

	@FindBy(xpath = "//label[@id='OpeningBalance']")
	public static WebElement bankRecOpenBal;

	@FindBy(xpath = "//label[@id='debitCounts']")
	public static WebElement bankRecDebitCounts;

	@FindBy(xpath = "//label[@id='creditCounts']")
	public static WebElement bankRecCreditCounts;

	@FindBy(xpath = "//input[@id='bankBal']")
	public static WebElement bankRecBankBal;

	@FindBy(xpath = "//label[@id='diff']")
	public static WebElement bankRecDif;

	@FindBy(xpath = "//*[@id='OptCtrlBank_table_body']/tr/td[2]")
	public static List<WebElement> bankList;

	// Bank reconciliation statement

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[6]/label/span")
	public static WebElement brsshowConsolidatedAmountsChkBox;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[7]/label/span")
	public static WebElement brsIncludePdcChkBox;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr/td[2]")
	public static List<WebElement> report1stColList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr/td[3]")
	public static List<WebElement> report2ndColList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr/td[4]")
	public static List<WebElement> report3rdColList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr/td[5]")
	public static List<WebElement> report4thColList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr/td[6]")
	public static List<WebElement> report5thColList;

	@FindBy(xpath = "//tbody[@id='id_header_4_table_body']/tr/td[2]")
	public static List<WebElement> vendorAccountListCount;

	@FindBy(xpath = "//input[@id='id_body_536870916']")
	public static WebElement enter_WarehouseTxt;

	@FindBy(xpath = "//*[@id='id_body_536870916_table_body']/tr")
	public static List<WebElement> pvvGridWarehouseList;

	@FindBy(xpath = "//*[@id='id_body_23_table_body']/tr/td[2]")
	public static List<WebElement> pvvGridItemList;

	@FindBy(xpath = "//tbody[@id='id_body_536870916_table_body']/tr/td[2]")
	public static List<WebElement> warehouseBodyComboList;

	@FindBy(xpath = "//tbody[@id='id_header_86_table_body']/tr/td[2]")
	public static List<WebElement> st_warehouse1HeaderComboList;

	@FindBy(xpath = "//tbody[@id='id_body_87_table_body']/tr/td[2]")
	public static List<WebElement> st_warehouse2BodyComboList;

	@FindBy(xpath = "//tbody[@id='id_header_3_table_body']/tr/td[2]")
	public static List<WebElement> purchaseAccountListCount;

	@FindBy(xpath = "//*[@id='dvReportInputs']/div[4]/label/span")
	public static WebElement clubCashSalesForTheDayChkBox;

	@FindBy(xpath = "//*[@id='722']/span")
	public static WebElement virtualBankReport;

	@FindBy(xpath = "//*[@id='updateButton']/i")
	public static WebElement settingUpdateBtn;

	@FindBy(xpath = "//*[@id='id_header_32']")
	public static WebElement headerPayTerms;

	@FindBy(xpath = "//*[@id='2062']")
	public static WebElement receiptsVATMenu;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid']/tbody/tr[1]/td")
	public static List<WebElement> billWiseGridRow1List;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid']/tbody/tr[2]/td")
	public static List<WebElement> billWiseGridRow2List;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid']/tbody/tr[3]/td")
	public static List<WebElement> billWiseGridRow3List;

	@FindBy(xpath = "(//*[@class='icon-close hiconright2'])[1]")
	public static WebElement settingCloseBtn;

	@FindBy(xpath = "(//*[@id='id_transactionentry_header1_section']/div/div/div/div)[15]/input")
	public static WebElement pvHeaderLocalDiffTxt;

	@FindBy(xpath = "(//*[@id='id_transactionentry_header1_section']/div/div/div/div)[14]/input")
	public static WebElement pvHeaderExchangeDiffTxt;

	@FindBy(xpath = "//select[@id='misc_arapARAPOptions']")
	public static WebElement arapDrpDwn;

	@FindBy(xpath = "//*[@id='misc_arapOptions']")
	public static WebElement rec_arapDrpDwn;

	@FindBy(xpath = "//select[@id='misc_arapOptions']")
	public static WebElement settingMisOptionsDrpDwn;

	@FindBy(xpath = "//input[@id='misc_arapchkSelectbillsbeforeamt']")
	public static WebElement settingMisSelectBillBeforeAmtChkbox;
	
	
	

	@FindBy(xpath = "//*[@id='misc_arapchkSelectbillsbeforeamt']/following-sibling::span")
	public static WebElement settingMisSelectBillBeforeAmtChkboxISSelected;

//input[@id='misc_arapchkSelectbillsbeforeamt']/following-sibling::span

	@FindBy(xpath = "//input[@id='id_misc_adjustbillinline']")
	public static WebElement settingMisAdjustBillInLineChkbox;

	@FindBy(xpath = "//input[@id='misc_arapchkPostdiscountbasedoncrdays']")
	public static WebElement settingMisPostDiscountBasedOncreditDaysChkbox;

	@FindBy(xpath = "//select[@id='misc_arapNarration']")
	public static WebElement settingMisPostNarrationdrpdwn;

	@FindBy(xpath = "//span[contains(text(),'Payments FIFO')]")
	public static WebElement paymentsFIFOVoucher;

/////////////////////////////////

	@FindBy(xpath = "//*[@id='2083']/span")
	public static WebElement salesNewRefMenu;

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement customerAccountTxt;

	@FindBy(xpath = "//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
	public static List<WebElement> departmentListCount;

	@FindBy(xpath = "//tbody[@id='id_header_10_table_body']/tr/td[2]")
	public static List<WebElement> currencyListCount;
	
	@FindBy(xpath = "/html/body/section/div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]/input[2]")
	public static WebElement EnterDepBody;
	
	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	public static WebElement select1stRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	public static WebElement select1stRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	public static WebElement select1stRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	public static WebElement select1stRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	public static WebElement select1stRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	public static WebElement select1stRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	public static WebElement select1stRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	public static WebElement select1stRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	public static WebElement select1stRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	public static WebElement select1stRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	public static WebElement select1stRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	public static WebElement select1stRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	public static WebElement select1stRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	public static WebElement select1stRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	public static WebElement select1stRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	public static WebElement select1stRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
	public static WebElement select2ndRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
	public static WebElement select2ndRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
	public static WebElement select2ndRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
	public static WebElement select2ndRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
	public static WebElement select2ndRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
	public static WebElement select2ndRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	public static WebElement select2ndRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	public static WebElement select2ndRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
	public static WebElement select2ndRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	public static WebElement select2ndRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
	public static WebElement select2ndRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
	public static WebElement select2ndRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
	public static WebElement select2ndRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
	public static WebElement select2ndRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
	public static WebElement select2ndRow_16thColumn;

	@FindBy(xpath = "//*[@id='2020']/span")
	public static WebElement cashSales;
	
	
	
	@FindBy(xpath = "//*[text()='Convert to Purchases Vouchers']")
	public static WebElement convertTOPurchaseVoucher;
	

	@FindBy(xpath = "//*[@id='id_body_33554559']")
	public static WebElement enterdiscountCharges;
	
	

	
	@FindBy(xpath="//*[text()='Material Receipt Notes']")
	public static WebElement  materialReceiptsNotesBtn;

	@FindBy(xpath="//*[@id='id_body_33554558']")
	public static WebElement enterBankCharges;
	
	
	@FindBy(xpath="//*[@id='id_footer_134217749']")
	public static WebElement entryPageFooterTxt;
	
	@FindBy(xpath="//*[text()='Pending Material Receipt Notes']")
	public static WebElement pendingMRNLink;
	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
	public static WebElement select3rdRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
	public static WebElement select3rdRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
	public static WebElement select3rdRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
	public static WebElement select3rdRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
	public static WebElement select3rdRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
	public static WebElement select3rdRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	public static WebElement select3rdRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	public static WebElement select3rdRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
	public static WebElement select3rdRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
	public static WebElement select3rdRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
	public static WebElement select3rdRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
	public static WebElement select3rdRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
	public static WebElement select3rdRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
	public static WebElement select3rdRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
	public static WebElement select3rdRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
	public static WebElement select3rdRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
	public static WebElement select4thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[3]")
	public static WebElement select4thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]")
	public static WebElement select4thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[5]")
	public static WebElement select4thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
	public static WebElement select4thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[7]")
	public static WebElement select4thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
	public static WebElement select4thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
	public static WebElement select4thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[10]")
	public static WebElement select4thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[11]")
	public static WebElement select4thRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[12]")
	public static WebElement select4thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[13]")
	public static WebElement select4thRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[14]")
	public static WebElement select4thRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[15]")
	public static WebElement select4thRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]")
	public static WebElement select4thRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]")
	public static WebElement select4thRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
	public static WebElement select5thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[3]")
	public static WebElement select5thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[4]")
	public static WebElement select5thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]")
	public static WebElement select5thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]")
	public static WebElement select5thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]")
	public static WebElement select5thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	public static WebElement select5thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	public static WebElement select5thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]")
	public static WebElement select5thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[11]")
	public static WebElement select5thRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[12]")
	public static WebElement select5thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[13]")
	public static WebElement select5thRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[14]")
	public static WebElement select5thRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[15]")
	public static WebElement select5thRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[16]")
	public static WebElement select5thRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[17]")
	public static WebElement select5thRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]")
	public static WebElement select6thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[3]")
	public static WebElement select6thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]")
	public static WebElement select6thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[5]")
	public static WebElement select6thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]")
	public static WebElement select6thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]")
	public static WebElement select6thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	public static WebElement select6thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	public static WebElement select6thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]")
	public static WebElement select6thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[11]")
	public static WebElement select6thRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[12]")
	public static WebElement select6thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[13]")
	public static WebElement select6thRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[14]")
	public static WebElement select6thRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[15]")
	public static WebElement select6thRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[16]")
	public static WebElement select6thRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[17]")
	public static WebElement select6thRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[2]")
	public static WebElement select7thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[3]")
	public static WebElement select7thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]")
	public static WebElement select7thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[5]")
	public static WebElement select7thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[6]")
	public static WebElement select7thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[7]")
	public static WebElement select7thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[8]")
	public static WebElement select7thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]")
	public static WebElement select7thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]")
	public static WebElement select7thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[2]")
	public static WebElement select8thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[3]")
	public static WebElement select8thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]")
	public static WebElement select8thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[5]")
	public static WebElement select8thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[6]")
	public static WebElement select8thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[7]")
	public static WebElement select8thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[8]")
	public static WebElement select8thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]")
	public static WebElement select8thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]")
	public static WebElement select8thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[2]")
	public static WebElement select9thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[3]")
	public static WebElement select9thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]")
	public static WebElement select9thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[5]")
	public static WebElement select9thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[6]")
	public static WebElement select9thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[7]")
	public static WebElement select9thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[8]")
	public static WebElement select9thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]")
	public static WebElement select9thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]")
	public static WebElement select9thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[2]")
	public static WebElement select10thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[3]")
	public static WebElement select10thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[4]")
	public static WebElement select10thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[5]")
	public static WebElement select10thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[6]")
	public static WebElement select10thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[7]")
	public static WebElement select10thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[8]")
	public static WebElement select10thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[9]")
	public static WebElement select10thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[10]")
	public static WebElement select10thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[2]")
	public static WebElement select11thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[3]")
	public static WebElement select11thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[4]")
	public static WebElement select11thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[5]")
	public static WebElement select11thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[6]")
	public static WebElement select11thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[7]")
	public static WebElement select11thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[8]")
	public static WebElement select11thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[9]")
	public static WebElement select11thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[10]")
	public static WebElement select11thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[2]")
	public static WebElement select12thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[3]")
	public static WebElement select12thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[4]")
	public static WebElement select12thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[5]")
	public static WebElement select12thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[6]")
	public static WebElement select12thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[7]")
	public static WebElement select12thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[8]")
	public static WebElement select12thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[9]")
	public static WebElement select12thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[10]")
	public static WebElement select12thRow_9thColumn;

	@FindBy(xpath = "//input[@id='id_body_12']")
	public static WebElement enter_AccountTxt;

	@FindBy(xpath = "//input[@id='id_body_16777332']")
	public static WebElement enterpayVATTaxCode;

	/*
	 * @FindBy(xpath="//input[@id='id_body_16777306']") public static WebElement
	 * enterpayVATTaxCode;
	 */

	/*
	 * @FindBy(xpath="//input[@id='id_body_16777330']") public static WebElement
	 * enterReceiptsVATTaxCode;
	 */

	@FindBy(xpath = "//a[@id='2075']")
	public static WebElement salesReturnFIFO;

	@FindBy(xpath = "//a[@id='2055']")
	public static WebElement recepitsFIFOmenu;

	@FindBy(xpath = "//*[@id='tblBodyTransRender']/tr")
	public static List<WebElement> voucherBodyGridRowCountList;

	@FindBy(xpath = "//a[@id='2076']")
	public static WebElement openingBalFIFOMenu;

	@FindBy(xpath = "//*[@id='2077']")
	public static WebElement JVFIFOMenu;

	@FindBy(xpath = "//*[@id='2032']")
	public static WebElement journalEntriesMenu;

	@FindBy(xpath = "//*[@id='2025']")
	public static WebElement forexJVVoucher;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetail_popup']/div/div/div[2]/div/div[2]/div[1]/div/div")
	public static List<WebElement> postingDetailsDebitList;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetail_popup']/div/div/div[2]/div/div[2]/div[1]/div/div[1]")
	public static List<WebElement> postingDetailsDebitSecList_AccList;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetail_popup']/div/div/div[2]/div/div[2]/div[2]/div/div")
	public static List<WebElement> postingDetailsCreditList;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetail_popup']/div/div/div[2]/div/div[2]/div[2]/div/div[1]")
	public static List<WebElement> postingDetailsCreditSec_AccList;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetail_popup']/div/div/div[2]/div/div[3]/div[1]/div/div[2]")
	public static WebElement postingDetailsDebitSum;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetail_popup']/div/div/div[2]/div/div[3]/div[2]/div/div[2]")
	public static WebElement postingDetailsCreditSum;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetail_popup']/div[2]/div/div[1]/span/i")
	public static WebElement postingDetailsCloseBtn;

	@FindBy(xpath = "//a[@id='2079']")
	public static WebElement PDPFIFOMenu;

	@FindBy(xpath = "//*[@id='id_transactionentry_save']/a/span")
	public static WebElement MRsaveBtn;

	@FindBy(xpath = "//*[@id='InfPnlAdjGrd_body']/tr/td")
	public static List<WebElement> baseAmtList;

	@FindBy(xpath = "//span[contains(text(),'PDR FIFO')]")
	public static WebElement PDRFIFO;

	@FindBy(xpath = "//a[@id='2004']")
	public static WebElement pettyCash;

	@FindBy(xpath = "//*[@id='2026']/span")
	public static WebElement debitnoteMenu;

	@FindBy(xpath = "//*[@id='2067']")
	public static WebElement debitnoteVATMenu;

	@FindBy(xpath = "//*[@id='2080']")
	public static WebElement pettyCashFIFO;

	@FindBy(xpath = "//span[contains(text(),'Inter Dep FIFO')]")
	public static WebElement interDepFifo;

	@FindBy(xpath = "//*[@id='2082']")
	public static WebElement NonJVFIFO;

	@FindBy(xpath = "//*[@id='2015']")
	public static WebElement salesInvoiceVoucher;

	;
	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[3]")
	public static List<WebElement> entryPageAdjBillsDocList;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[2]")
	public static List<WebElement> entryPageAdjBillsChkboxList;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[13]")
	public static List<WebElement> entryPageAdjBillsAdjustAmtList;

	@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
	public static WebElement infosideBarBtn;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[2]/input")
	public static WebElement entrypageAdjsutmentBillsrow1Chkbox;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td")
	public static List<WebElement> entrypageAdjsutmentBillsList;

	@FindBy(xpath = "(//*[@id='id_transaction_entry_workflow_togglebutton'])[2]")
	public static WebElement entryPageBillwiseExpandBtn;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[13]")
	public static WebElement entryPageBillwiseAdjustMentTxt;

	@FindBy(xpath = "//input[@id='id_limit']")
	public static WebElement entryPageBillwise_EnterAdjustMentTxt;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_head']/tr[1]/th")
	public static List<WebElement> adjustmentbillsHeaderList;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[4]")
	public static WebElement adjustmentbillsBillNo;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[18]")
	public static List<WebElement> billRefGridNativeCurrencyList;

	@FindBy(xpath = "//*[@id='id_Adjustment_Grid_body']/tr/td[10]")
	public static List<WebElement> billRefGridBalAmtList;

	@FindBy(xpath = "//span[@id='editLayout_FieldsCustomization_Close']//i[@class='icon-cancel icon-font7']")
	public static WebElement editLayoutcloseBtn;

	@FindBy(xpath = "//i[@class='icon-close icon-font6']")
	public static WebElement closeBtn;

	@FindBy(xpath = "(//*[contains(text(),'bill no')])[1]//following-sibling::div/input")
	public static WebElement pvVATBillNoTxt;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement masterCloseBtn;

	@FindBy(xpath = "//*[@id='iAccountType']")
	public static WebElement masterAccTypeDrpDwn;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[16]/td")
	public static List<WebElement> report16thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[17]/td")
	public static List<WebElement> report17thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[18]/td")
	public static List<WebElement> report18thRowList;

	@FindBy(xpath = "//div[@id='dvReportDetails']/div/table/tbody/tr[19]/td")
	public static List<WebElement> report19thRowList;

	@FindBy(xpath = "//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[8]/ul/li/a/span")
	public static List<WebElement> registerList;

	@FindBy(xpath = "//input[@id='id_body_33554464']")
	public static WebElement enter_SALESINVOICEFQTxt;

	@FindBy(xpath = "//div[contains(text(),'Header/Footer')]")
	public static WebElement sl_cusHeaderAndFooter;

	@FindBy(xpath = "//*[@id='forHf']/span[3]/span/i[1]")
	public static WebElement sl_cusHeaderAndFooterSaveBtn;

	@FindBy(xpath = "//a[contains(text(),'Save')]")
	public static WebElement HFsave_SaveBtn;

	@FindBy(xpath = "//input[@id='id_PopuplayoutName']")
	public static WebElement HFsavePop_SaveTxt;

	@FindBy(xpath = "//button[@id='btn_PopUpOk']")
	public static WebElement HFsavePop_OKBtn;

	@FindBy(xpath = "//*[@id='REPORTRENDERNEWControls']/ul/li/span[7]")
	public static WebElement reportScreenCustomizeBtn;

	@FindBy(xpath = "//span[@class='icon-filter icon-font7']")
	public static WebElement vat_filterBtn;

	@FindBy(xpath = "//span[@class='icon-ok icon-font7']")
	public static WebElement vat_OkBtn;

	@FindBy(xpath = "//span[@class='icon-close icon-font7']")
	public static WebElement vat_CloseBtn;

	@FindBy(xpath = "//select[@id='ddlVATHomeRepDateOpt']")
	public static WebElement vat_DateOptionDropdown;

	@FindBy(xpath = "//input[@id='VATHomeReport_StartDate']")
	public static WebElement vat_StartDateTxt;

	@FindBy(xpath = "//td[@id='VATHomeReport_StartDate_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	public static WebElement vat_StartDateCalanderBtn;

	@FindBy(xpath = "//input[@id='VATHomeReport_EndDate']")
	public static WebElement vat_EndDateTxt;

	@FindBy(xpath = "//td[@id='VATHomeReport_EndDate_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	public static WebElement vat_EndDateCalanderBtn;

	@FindBy(xpath = "//select[@id='ddlVATHomeRepOutPut']")
	public static WebElement vat_OutputDropdown;

	@FindBy(xpath = "//*[@id='2089']/span")
	public static WebElement nonJVNewReferenceBtn;

	@FindBy(xpath = "//span[contains(text(),'Local amount based on filter')]")
	public static WebElement localAmountBasedOnFilterChkBox;

	@FindBy(xpath = "//input[@id='FOption_569_0_DefaultFilter_0']")
	public static WebElement filterEnterPeakAndLowTxt;

	@FindBy(xpath = "//input[@id='FOption_538_0_DefaultFilter_0']")
	public static WebElement filterMasterInfoTxt;

	@FindBy(xpath = "//input[@id='FOption_677_0_DefaultFilter_0']")
	public static WebElement enterVATSalesDefaultItemTxt;

	@FindBy(xpath = "//input[@id='FOption_209_0_DefaultFilter_0']")
	public static WebElement enterVATDefaultItemTxt;

	@FindBy(xpath = "//input[@id='RITCheckbox__1']")
	public static WebElement displayMonthlyTotalChkBox;

	@FindBy(xpath = "//input[@id='RITCheckbox__1']")
	public static WebElement yearWiseComparsionChkbox;

	@FindBy(xpath = "//span[contains(text(),'Include Sales Return voucher')]")
	public static WebElement includeSalesReturnsVoucherChkBox;

	@FindBy(xpath = "//*[@id='tblsummary']/tr/td")
	public static List<WebElement> vatSummaryList;

	@FindBy(xpath = "//div[@id='myNavbarVATSummaryRep']//span[@class='icon-close icon-font7']")
	public static WebElement vatSummaryExistBtn;

	@FindBy(xpath = "//table[@id='tblCompanyInfo']//td[9]")
	public static WebElement periodEndsTxt;

	@FindBy(xpath = "//table[@id='tblCompanyInfo']//td[9]")
	public static WebElement FAFCrestionDateTxt;

	@FindBy(xpath = "//*[@id='tblCompanyInfo']/tbody/tr/td[11]")
	public static WebElement productVersionTxt;

	@FindBy(xpath = "//*[@id='tblPurListing']/tbody/tr/td[1]")
	public static List<WebElement> purchaseSupplierName;

	@FindBy(xpath = "//*[@id='tblPurListing']/tbody/tr/td[4]")
	public static List<WebElement> purchaseInvoiceNoList;

	@FindBy(xpath = "//*[@id='tblPurListing']/tbody/tr/td[7]")
	public static List<WebElement> purchaseProductDescList;

	@FindBy(xpath = "//*[@id='tblPurListing']/tbody/tr/td[8]")
	public static List<WebElement> purchaseValueAED;

	@FindBy(xpath = "//*[@id='tblPurListing']/tbody/tr/td[9]")
	public static List<WebElement> purchaseVATVAlueAED;

	@FindBy(xpath = "//*[@id='tblPurListing']/tbody/tr/td[10]")
	public static List<WebElement> purchaseTAxcode;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[2]/div/div[3]/label[4]")
	public static WebElement purchaseTransCountTotal;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[2]/div/div[3]/label[3]")
	public static WebElement purchaseVatTotalAED;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[2]/div/div[3]/label[2]")
	public static WebElement purchaseTotalAED;

//Sales Grid

	@FindBy(xpath = "//*[@id='tblSupplySalListing']/tbody/tr/td[1]")
	public static List<WebElement> CustomerNameList;

	@FindBy(xpath = "//*[@id='tblSupplySalListing']/tbody/tr/td[4]")
	public static List<WebElement> salesInvoiceNoList;

	@FindBy(xpath = "//*[@id='tblSupplySalListing']/tbody/tr/td[6]")
	public static List<WebElement> salesProductDescList;

	@FindBy(xpath = "//*[@id='tblSupplySalListing']/tbody/tr/td[7]")
	public static List<WebElement> salesSupplyValueAED;

	@FindBy(xpath = "//*[@id='tblSupplySalListing']/tbody/tr/td[8]")
	public static List<WebElement> salesVatValueAED;

	@FindBy(xpath = "//*[@id='tblSupplySalListing']/tbody/tr/td[9]")
	public static List<WebElement> salesTaxcode;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[3]/div/div[3]/label[4]")
	public static WebElement salesTransCountTotal;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[3]/div/div[3]/label[3]")
	public static WebElement salesVatTotalAED;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[3]/div/div[3]/label[2]")
	public static WebElement salesTotalAED;

//Ledger

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[2]")
	public static List<WebElement> ledgerAccountIDList;

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[3]")
	public static List<WebElement> ledgerAccountNameList;

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[4]")
	public static List<WebElement> ledgerTransDescList;

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[5]")
	public static List<WebElement> ledgerNameList;

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[7]")
	public static List<WebElement> ledgeSourceDocIDList;

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[8]")
	public static List<WebElement> ledgeSourceTypeList;

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[9]")
	public static List<WebElement> ledgeDebitList;

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[10]")
	public static List<WebElement> ledgeCreditList;

	@FindBy(xpath = "//*[@id='tblGeneralLedger']/tbody/tr/td[11]")
	public static List<WebElement> ledgeBalList;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[4]/div/div[3]/label[5]")
	public static WebElement GLTCurrency;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[4]/div/div[3]/label[4]")
	public static WebElement TransCountTotal;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[4]/div/div[3]/label[3]")
	public static WebElement totalcredit;

	@FindBy(xpath = "//*[@id='VATAuditFileBody']/div[4]/div/div[3]/label[2]")
	public static WebElement totalDebit;

	@FindBy(xpath = "//div[contains(text(),'Exit')]")
	public static WebElement vat_ExitBtn;

	@FindBy(xpath = "//*[@id='VATMonthlyReturnRepKSABody']//tr/td")
	public static List<WebElement> vatMonthlyreturnReportList;

	@FindBy(xpath = "//div[contains(text(),'Back')]")
	public static WebElement vat_BackBtn;

	@FindBy(xpath = "//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[10]/ul/li/a/span")
	private static List<WebElement> miscellaneousAnalysisReportList;

	@FindBy(xpath = "//div[@id='REPORTRENDERNEWControls']/ul/li/span[1]")
	private static WebElement reportSortingBtn;

	@FindBy(xpath = "//div[@id='REPORTRENDERNEWControls']/ul/li/ul/li[1]")
	private static WebElement sortingAscendingBtn;

	@FindBy(xpath = "//div[@id='REPORTRENDERNEWControls']/ul/li/ul/li[2]")
	private static WebElement sortingDecendingBtn;

	@FindBy(xpath = "//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[11]/ul/li/a/span")
	private static List<WebElement> mastersInformationReportList;

	@FindBy(xpath = "//input[@id='opt_DocumentTypeID']")
	private static WebElement documentTxt;

	@FindBy(xpath = "//input[@id='opt_LayoutID']")
	private static WebElement layoutTxt;

	@FindBy(xpath = "//input[@id='idrdDocument']")
	private static WebElement documentRadioBtn;

	@FindBy(xpath = "//input[@id='idrdProduct']")
	private static WebElement itemRadioBtn;

	@FindBy(xpath = "//i[@class='icon-add-preview icon-font6']")
	private static WebElement pl_previewBtn;

	@FindBy(xpath = "//i[@class='icon-print icon-font6']")
	private static WebElement pl_printBtn;

	@FindBy(xpath = "//i[@class='icon-close icon-font6']")
	private static WebElement pl_CloseBtn;

// Skid Definition

	@FindBy(xpath = "//input[@id='skidId']")
	private static WebElement skid;

	@FindBy(xpath = "//input[@id='txtprefix']")
	private static WebElement prefixTxt;

	@FindBy(xpath = "//input[@id='txtStartingNumber']")
	private static WebElement startingNoTxt;

	@FindBy(xpath = "//input[@id='chkSkid']")
	private static WebElement enableReprintChkBox;

	@FindBy(xpath = "//input[@id='txtQuantity']")
	private static WebElement quantityTxt;

	@FindBy(xpath = "//span[@class='icon-analyze icon-font6']")
	private static WebElement sd_PreviewBtn;

	@FindBy(xpath = "//span[@class='icon-print icon-font6']")
	private static WebElement sd_PrintBtn;

	@FindBy(xpath = "//span[@class='icon-close']")
	private static WebElement sd_CloseBtn;

	@FindBy(xpath = "//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[12]/ul/li/a/span")
	private static List<WebElement> auditTrailList;

	@FindBy(xpath = "//span[contains(text(),'Excluded eleted transactions')]")
	private static WebElement excludedElectedTransactionsChkBox;

	@FindBy(xpath = "//span[contains(text(),'Exclude modified transactions')]")
	private static WebElement excludeModifiedTransactionsChkBox;

	@FindBy(xpath = "//span[contains(text(),'Include manual closed link')]")
	private static WebElement includeManualClosedLinkChkBox;

	@FindBy(xpath = "//select[@id='RITCombobox__5']")
	private static WebElement displayOrderDropDown;

	@FindBy(xpath = "//input[@id='RITTable__0']")
	private static WebElement reportVoucherTxt;

	@FindBy(xpath = "//*[@id='RITTable__0_table_body']/tr/td[2]")
	private static List<WebElement> reportVoucherTxtList;

	@FindBy(xpath = "//input[@id='RITTable__0']")
	private static WebElement reportUsersTxt;

	@FindBy(xpath = "//*[@id='RITTable__0_table_body']/tr/td[2]")
	private static List<WebElement> reportUsersTxtList;

// Account Query

	@FindBy(xpath = "//input[@id='accountQuery']")
	private static WebElement accountQueryTxt;

	@FindBy(xpath = "//button[@class='btn btn-default btn-sm']")
	private static WebElement getAccountDetailsBtn;

	@FindBy(xpath = "//label[contains(text(),'Opening Balance :')]")
	private static WebElement aq_OpeningBalanceLable;

	@FindBy(xpath = "//label[contains(text(),'Credit :')]")
	private static WebElement aq_CreditLable;

	@FindBy(xpath = "//label[contains(text(),'Debit :')]")
	private static WebElement aq_DebitLable;

	@FindBy(xpath = "//div[5]//label[1]")
	private static WebElement aq_BalanceLable;

	@FindBy(xpath = "//table[@id='creditTransTable']//th[contains(text(),'Date')]")
	private static WebElement ltc_Date;

	@FindBy(xpath = "//table[@id='creditTransTable']//th[contains(text(),'Voucher')]")
	private static WebElement ltc_Vocuher;

	@FindBy(xpath = "//table[@id='creditTransTable']//th[contains(text(),'Account')]")
	private static WebElement ltc_Account;

	@FindBy(xpath = "//th[contains(text(),'Credit')]")
	private static WebElement ltc_Credit;

	@FindBy(xpath = "//table[@id='debitTransTable']//th[contains(text(),'Date')]")
	private static WebElement ltd_Date;

	@FindBy(xpath = "//table[@id='debitTransTable']//th[contains(text(),'Voucher')]")
	private static WebElement ltd_Vocuher;

	@FindBy(xpath = "//table[@id='debitTransTable']//th[contains(text(),'Account')]")
	private static WebElement ltd_Account;

	@FindBy(xpath = "//th[contains(text(),'Debit')]")
	private static WebElement ltd_Dedit;

	@FindBy(xpath = "//span[@class='icon-panel icon-font7 pull-right']")
	private static WebElement deptWiseBalnceExpandBtn;

	@FindBy(xpath = "//i[@class='icon-clear icon-font6']")
	private static WebElement aq_ClearBtn;

	@FindBy(xpath = "//i[@class='icon-close icon-font6']")
	private static WebElement aq_CloseBtn;

	@FindBy(xpath = "//span[@id='openingBal']")
	private static WebElement AQ_OpnBal;

	@FindBy(xpath = "//span[@id='credit']")
	private static WebElement AQ_Credit;

	@FindBy(xpath = "//span[@id='debit']")
	private static WebElement AQ_Debit;

	@FindBy(xpath = "//span[@id='balance']")
	private static WebElement AQ_Balance;

	@FindBy(xpath = "//*[@id='creditTransTable']/tbody/tr/td[2]")
	private static List<WebElement> AQ_CreditTransVouList;

	@FindBy(xpath = "//*[@id='creditTransTable']/tbody/tr/td[3]")
	private static List<WebElement> AQ_CreditTransAccountList;

	@FindBy(xpath = "//*[@id='creditTransTable']/tbody/tr/td[4]")
	private static List<WebElement> AQ_CreditTransCreditList;

	@FindBy(xpath = "//*[@id='debitTransTable']/tbody/tr/td[2]")
	private static List<WebElement> AQ_DebitTransVouList;

	@FindBy(xpath = "//*[@id='debitTransTable']/tbody/tr/td[3]")
	private static List<WebElement> AQ_DebitTransAccountList;

	@FindBy(xpath = "//*[@id='debitTransTable']/tbody/tr/td[4]")
	private static List<WebElement> AQ_DebitTransDebitList;

	@FindBy(xpath = "//*[@id='tagWiseTransData']/tbody/tr/td")
	private static List<WebElement> AQ_DepartmentList;

/////////////////////////

	@FindBy(xpath = "//div[@id='dv_TranHomeHeading']//span[@id='dv_sVoucherName']")
	private static WebElement openingStocksLabel;

	@FindBy(xpath = "//div[@id='dv_TranHomeHeading']//span[@id='dv_sVoucherName']")
	private static WebElement stocksTransferLabel;

	/*
	 * @FindBy(xpath="//input[@id='id_body_536870916']") private static WebElement
	 * pvWareHouseTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_268435460']") private static WebElement
	 * wareHouseTxt;
	 */

	@FindBy(xpath = "//*[@id='id_header_87']")
	private static WebElement stockTransferWareHouse2InHeaderTxt;
	/*
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_printbarcode']") private static
	 * WebElement printBarCodeOption;
	 */

	@FindBy(xpath = "//span[contains(text(),'Inventory Options')]")
	private static WebElement inventoryTab;

	@FindBy(xpath = "//input[@id='inventoryOpt_chkStocktransferInput']")
	private static WebElement warehouse2HeaderChkBox;

// Header Section Completed

	/*
	 * ///// Options Btn (Display Option)
	 * 
	 * @FindBy(xpath="//span[@id='transOptions']") private static WebElement
	 * optionsBtn;
	 * 
	 * @FindBy(xpath="//a[contains(text(),'Auto Adjust Width')]") private static
	 * WebElement autoAdjustWidthBtn;
	 * 
	 * @FindBy(xpath="//a[contains(text(),'Fit To Screen')]") private static
	 * WebElement fitToScreenBtn;
	 * 
	 * @FindBy(xpath="//a[contains(text(),'Normal')]") private static WebElement
	 * normalBtn;
	 * 
	 */

// Grid Elements

	/*
	 * //Grid Header CheckBox
	 * 
	 * @FindBy(xpath="//input[@id='HeaderChkBox']") private static WebElement
	 * grid_HeaderChkBox;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //Grid CheckBox 1 And 2
	 * 
	 * @FindBy(xpath="//tr[@id='trRender_1']//td//input") private static WebElement
	 * grid_ChkBox1;
	 * 
	 * @FindBy(xpath="//tr[@id='trRender_2']//td//input") private static WebElement
	 * grid_ChkBox2;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//span[@class='icon-menu icon-font4']") private static
	 * WebElement toggleBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_copydocument']") private static
	 * WebElement copyDocumentOption;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_copytoclipboard']") private
	 * static WebElement copyToClipBoardOption;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_pastefromclipboard']") private
	 * static WebElement pasteFromClipBoardOption;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_raisechequereturn']") private
	 * static WebElement raiseCheckReturnOption;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_addtostock']") private static
	 * WebElement addToStockOption;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_markconvert']") private static
	 * WebElement markConvertedOption;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_bominput']") private static
	 * WebElement bomInputOption;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_autoallocate']") private static
	 * WebElement autoAllocateOption;
	 * 
	 * @FindBy(xpath="//*[@id='id_transactionentry_reverseentry']") private static
	 * WebElement reverseEntryOption;
	 * 
	 * 
	 * ////// Header Section Completed
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='id_header_1_input_image']/span") private static
	 * WebElement documentNumberDropdown_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_2']") private static WebElement
	 * dateTxt;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']"
	 * ) private static WebElement dateTxt_CalenderBtn;
	 * 
	 * @FindBy(xpath=
	 * "//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	 * private static WebElement calender_TodayBtn;
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='id_header_4']") private static WebElement
	 * cashBankAccountTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_4_input_image']/span") private static
	 * WebElement cashBankAccount_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_4_input_settings']/span") private static
	 * WebElement cashBankAccount_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_customize_popup_container']") private
	 * static WebElement cashBankAccount_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
	 * private static WebElement cashBankAccount_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_4_customize_popup_standardfields_list']") private
	 * static WebElement cashBankAccount_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_4_customize_popup_standardfields_header']") private
	 * static WebElement cashBankAccount_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * cashBankAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_4_customize_popup_standardfields_width']") private
	 * static WebElement cashBankAccount_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * cashBankAccount_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * cashBankAccount_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]") private
	 * static WebElement cashBankAccount_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * cashBankAccount_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * cashBankAccount_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_268435459']") private static WebElement
	 * departmentTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_268435459_input_image']/span") private
	 * static WebElement department_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_268435459_input_settings']/span") private
	 * static WebElement department_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_268435459_customize_popup_container']")
	 * private static WebElement department_Settings_Container;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='id_header_268435459_customize_popup_footer']//input[1]") private
	 * static WebElement department_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_268435459_customize_popup_standardfields_list']")
	 * private static WebElement
	 * department_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_268435459_customize_popup_standardfields_header']")
	 * private static WebElement department_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_268435459_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * department_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_268435459_customize_popup_standardfields_width']")
	 * private static WebElement department_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * department_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * department_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@id='id_header_268435459_search_container']//input[2]")
	 * private static WebElement department_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * department_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * department_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_6']") private static WebElement
	 * maturityDateTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_6_input_image']/span']") private static
	 * WebElement maturityDateTxt_CalenderBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_3']") private static WebElement
	 * purchaseAccountTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_3_input_image']/span") private static
	 * WebElement purchaseAccount_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_3_input_settings']/span") private static
	 * WebElement purchaseAccount_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_3_customize_popup_container']") private
	 * static WebElement purchaseAccount_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
	 * private static WebElement purchaseAccount_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_3_customize_popup_standardfields_list']") private
	 * static WebElement purchaseAccount_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_3_customize_popup_standardfields_header']") private
	 * static WebElement purchaseAccount_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_3_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * purchaseAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_3_customize_popup_standardfields_width']") private
	 * static WebElement purchaseAccount_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * purchaseAccount_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * purchaseAccount_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]") private
	 * static WebElement purchaseAccount_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * purchaseAccount_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * purchaseAccount_Settings_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='id_header_4']") private static WebElement
	 * vendorAccountTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_4_input_image']/span") private static
	 * WebElement vendorAccount_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_4_input_settings']/span") private static
	 * WebElement vendorAccount_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_customize_popup_container']") private
	 * static WebElement vendorAccount_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
	 * private static WebElement vendorAccount_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_4_customize_popup_standardfields_list']") private
	 * static WebElement vendorAccount_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_4_customize_popup_standardfields_header']") private
	 * static WebElement vendorAccount_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * vendorAccount_Settings_StandardFieldsBtn_AlignmentDropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_4_customize_popup_standardfields_width']") private
	 * static WebElement vendorAccount_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * vendorAccount_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * vendorAccount_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]") private
	 * static WebElement vendorAccount_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * vendorAccount_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * vendorAccount_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_3']") private static WebElement
	 * salesAccountTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_3_input_image']/span") private static
	 * WebElement salesAccount_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_3_input_settings']/span") private static
	 * WebElement salesAccount_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_3_customize_popup_container']") private
	 * static WebElement salesAccount_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
	 * private static WebElement salesAccount_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_3_customize_popup_standardfields_list']") private
	 * static WebElement salesAccount_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_3_customize_popup_standardfields_header']") private
	 * static WebElement salesAccount_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_3_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * salesAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_3_customize_popup_standardfields_width']") private
	 * static WebElement salesAccount_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * salesAccount_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * salesAccount_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]") private
	 * static WebElement salesAccount_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * salesAccount_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * salesAccount_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_4']") private static WebElement
	 * customerAccountTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_4_input_image']/span") private static
	 * WebElement customerAccount_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_4_input_settings']/span") private static
	 * WebElement customerAccount_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_customize_popup_container']") private
	 * static WebElement customerAccount_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
	 * private static WebElement customerAccount_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_4_customize_popup_standardfields_list']") private
	 * static WebElement customerAccount_Settings_StandardFieldsBtn_FieldDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_4_customize_popup_standardfields_header']") private
	 * static WebElement customerAccount_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * customerAccount_Settings_StandardFieldsBtn_AlignmentDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_4_customize_popup_standardfields_width']") private
	 * static WebElement customerAccount_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * customerAccount_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * customerAccount_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]") private
	 * static WebElement customerAccount_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * customerAccount_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * customerAccount_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_12']") private static WebElement
	 * accountTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_12_input_image']/span") private static
	 * WebElement account_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_4_input_settings']/span") private static
	 * WebElement account_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_customize_popup_container']") private
	 * static WebElement account_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
	 * private static WebElement account_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_4_customize_popup_standardfields_list']") private
	 * static WebElement account_Settings_StandardFieldsBtn_FieldDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_4_customize_popup_standardfields_header']") private
	 * static WebElement account_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	 * private static WebElement account_Settings_StandardFieldsBtn_Alignmentdrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_4_customize_popup_standardfields_width']") private
	 * static WebElement account_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * account_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * account_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]") private
	 * static WebElement account_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * account_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * account_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_31']") private static WebElement
	 * issuesReceiptsTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_268435460']") private static WebElement
	 * warehouseTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_268435460_input_image']/span") private
	 * static WebElement warehouse_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_header_268435460_input_settings']/span") private
	 * static WebElement warehouse_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_268435460_customize_popup_container']")
	 * private static WebElement warehouse_Settings_Container;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='id_header_268435460_customize_popup_footer']//input[1]") private
	 * static WebElement warehouse_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_268435460_customize_popup_standardfields_list']")
	 * private static WebElement warehouse_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_268435460_customize_popup_standardfields_header']")
	 * private static WebElement warehouse_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_268435460_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * warehouse_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_268435460_customize_popup_standardfields_width']")
	 * private static WebElement warehouse_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * warehouse_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * warehouse_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_268435460_search_container']//input[2]")
	 * private static WebElement warehouse_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * warehouse_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * warehouse_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'sName')]") private static WebElement
	 * customize_sName;
	 * 
	 * @FindBy(xpath="//span[@class='vcenter'][contains(text(),'Code')]") private
	 * static WebElement customize_sCode;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Alias')]") private static WebElement
	 * customize_Alias;
	 * 
	 * @FindBy(xpath="//span[@class='vcenter'][contains(text(),'Group')]") private
	 * static WebElement customize_bGroup;
	 * 
	 * @FindBy(xpath=
	 * "//span[contains(@class,'vcenter')][contains(text(),'Balance')]") private
	 * static WebElement customize_Balance;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108920']") private static WebElement
	 * appropriateBasedOnDrpdwn;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108921']") private static WebElement
	 * additionalValueTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_21']") private static WebElement
	 * raiseReceiptsChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108865']") private static WebElement
	 * receipts_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108868']") private static WebElement
	 * payments_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108871']") private static WebElement
	 * pettyCash_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108874']") private static WebElement
	 * postDatedReceipts_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108865']") private static WebElement
	 * postDatedPayments_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108880']") private static WebElement
	 * purchaseVouchers_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108881']") private static WebElement
	 * purchaseReturns_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108884']") private static WebElement
	 * salesInvoice_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108885']") private static WebElement
	 * salesReturns_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108913']") private static WebElement
	 * cashSales_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108914']") private static WebElement
	 * hirePurchaseSales_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108890']") private static WebElement
	 * journalEntries_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108916']") private static WebElement
	 * forexJV_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108910']") private static WebElement
	 * interDepartmentalJV_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108888']") private static WebElement
	 * nonStandardJournalEntries_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108892']") private static WebElement
	 * debitNotes_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108911']") private static WebElement
	 * debitNotesLineWise_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108893']") private static WebElement
	 * creditNotes_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108912']") private static WebElement
	 * creditNotesLineWisePayroll_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108894']") private static WebElement
	 * openingBalance_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108891']") private static WebElement
	 * fixedAssetDepreciationVoucher_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108909']") private static WebElement
	 * requestForQuote_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108903']") private static WebElement
	 * purchasesQuotations_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108882']") private static WebElement
	 * purchasesOrders_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108882']") private static WebElement
	 * materialReceiptsNotes_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108904']") private static WebElement
	 * salesQuotations_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108887']") private static WebElement
	 * deliveryNotes_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108917']") private static WebElement
	 * posSales_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108918']") private static WebElement
	 * productionOrder_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108886']") private static WebElement
	 * salesOrders_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108895']") private static WebElement
	 * shortageInStock_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108896']") private static WebElement
	 * excessesInStock_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108897']") private static WebElement
	 * stockTransfers_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108898']") private static WebElement
	 * openingStocks_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108923']") private static WebElement
	 * openingStocksNEW_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108908']") private static WebElement
	 * materialRequisition_NarrationTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108866']") private static WebElement
	 * receipts_ChequeNoTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108869']") private static WebElement
	 * payments_ChequeNoTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108872']") private static WebElement
	 * pettyCash_ChequeNoTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108875']") private static WebElement
	 * postDatedReceipts_ChequeNoTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_67108878']") private static WebElement
	 * postDatedPayments_ChequeNoTxt;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='id_body_536870916']") private static WebElement
	 * pvWarehouseTxt;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='id_body_536870916_input_image']//span[@class='icon-down-arrow optioncontrol_arrow_margin']"
	 * ) private static WebElement pvWarehouse_ExpansionBtn;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='id_body_536870916_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement pvWarehouse_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_body_536870916_customize_popup_container']")
	 * private static WebElement pvWarehouse_Settings_Container;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='id_body_536870916_customize_popup_footer']//input[1]") private
	 * static WebElement pvWarehouse_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_body_536870916_customize_popup_standardfields_list']")
	 * private static WebElement
	 * pvWarehouse_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_body_536870916_customize_popup_standardfields_header']")
	 * private static WebElement pvWarehouse_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_body_536870916_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * pvWarehouse_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_body_536870916_customize_popup_standardfields_width']")
	 * private static WebElement pvWarehouse_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * pvWarehouse_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * pvWarehouse_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_body_536870916_search_container']//input[2]")
	 * private static WebElement pvWarehouse_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[3]") private static WebElement
	 * pvWarehouse_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[@class='panel']//input[4]") private static WebElement
	 * pvWarehouse_Settings_CancelBtn;
	 * 
	 * // Grid Elements
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//th[@id='id_transaction_entry_detail_table_control_heading_1']") private
	 * static WebElement grid_Header_Account;
	 * 
	 * @FindBy(xpath=
	 * "//th[@id='id_transaction_entry_detail_table_control_heading_1']") private
	 * static WebElement grid_Header_Item;
	 * 
	 * @FindBy(xpath=
	 * "//th[@id='id_transaction_entry_detail_table_control_heading_1']") private
	 * static WebElement grid_Header_DebitAC;
	 * 
	 * @FindBy(xpath=
	 * "//th[@id='id_transaction_entry_detail_table_control_heading_2']") private
	 * static WebElement Grid_Header_CreditAC;
	 * 
	 * //
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]") private
	 * static WebElement firstRowIndex;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]") private
	 * static WebElement secondRowIndex;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]") private
	 * static WebElement thirdRowIndex;
	 * 
	 * @FindBy(xpath="//span[@class='icon-delete icon-font8']") private static
	 * WebElement deleteRowBtn;
	 * 
	 * @FindBy(xpath="//span[@class='icon-insertrow icon-font8']") private static
	 * WebElement insertRowBtn;
	 * 
	 * @FindBy(xpath="//span[@class='icon-selectall icon-font8']") private static
	 * WebElement selectRowBtn;
	 * 
	 * @FindBy(xpath="//span[@class='icon-unselectall1 icon-font8']") private static
	 * WebElement unSelectRowBtn;
	 * 
	 * @FindBy(xpath="//span[@class='icon-clone icon-font8']") private static
	 * WebElement duplicateRowBtn;
	 * 
	 * //
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_control_heading_14']") private
	 * static WebElement pvEntryPageTableHeader14thCol;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_control_heading_15']") private
	 * static WebElement pvEntryPageTableHeader15thCol;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_control_heading_16']") private
	 * static WebElement pvEntryPageTableHeader16thCol;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]") private
	 * static WebElement select1stRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]") private
	 * static WebElement select1stRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]") private
	 * static WebElement select1stRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]") private
	 * static WebElement select1stRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]") private
	 * static WebElement select1stRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]") private
	 * static WebElement select1stRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]") private
	 * static WebElement select1stRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]") private
	 * static WebElement select1stRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]") private
	 * static WebElement select1stRow_9thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]") private
	 * static WebElement select1stRow_10thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]") private
	 * static WebElement select1stRow_11thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]") private
	 * static WebElement select1stRow_12thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]") private
	 * static WebElement select1stRow_13thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]") private
	 * static WebElement select1stRow_14thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]") private
	 * static WebElement select1stRow_15thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]") private
	 * static WebElement select1stRow_16thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]") private
	 * static WebElement select1stRow_17thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]") private
	 * static WebElement select1stRow_18thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[20]") private
	 * static WebElement select1stRow_19thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[21]") private
	 * static WebElement select1stRow_20thColumn;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]") private
	 * static WebElement select2ndRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]") private
	 * static WebElement select2ndRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]") private
	 * static WebElement select2ndRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]") private
	 * static WebElement select2ndRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]") private
	 * static WebElement select2ndRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]") private
	 * static WebElement select2ndRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]") private
	 * static WebElement select2ndRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]") private
	 * static WebElement select2ndRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]") private
	 * static WebElement select2ndRow_9thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]") private
	 * static WebElement select2ndRow_11thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]") private
	 * static WebElement select2ndRow_12thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]") private
	 * static WebElement select2ndRow_10thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]") private
	 * static WebElement select2ndRow_14thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]") private
	 * static WebElement select2ndRow_15thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]") private
	 * static WebElement select2ndRow_16thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[18]") private
	 * static WebElement select2ndRow_17thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[19]") private
	 * static WebElement select2ndRow_18thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[20]") private
	 * static WebElement select2ndRow_19thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[21]") private
	 * static WebElement select2ndRow_20thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[22]") private
	 * static WebElement select2ndRow_21thColumn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]") private
	 * static WebElement select3rdRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]") private
	 * static WebElement select3rdRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]") private
	 * static WebElement select3rdRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]") private
	 * static WebElement select3rdRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]") private
	 * static WebElement select3rdRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]") private
	 * static WebElement select3rdRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]") private
	 * static WebElement select3rdRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]") private
	 * static WebElement select3rdRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]") private
	 * static WebElement select3rdRow_9thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]") private
	 * static WebElement select3rdRow_10thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]") private
	 * static WebElement select3rdRow_11thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]") private
	 * static WebElement select3rdRow_12thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]") private
	 * static WebElement select3rdRow_13thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]") private
	 * static WebElement select3rdRow_14thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]") private
	 * static WebElement select3rdRow_15thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]") private
	 * static WebElement select3rdRow_16thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[18]") private
	 * static WebElement select3rdRow_17thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[19]") private
	 * static WebElement select3rdRow_18thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[20]") private
	 * static WebElement select3rdRow_19thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[21]") private
	 * static WebElement select3rdRow_20thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[22]") private
	 * static WebElement select3rdRow_21thColumn;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]") private
	 * static WebElement select4thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[3]") private
	 * static WebElement select4thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]") private
	 * static WebElement select4thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[5]") private
	 * static WebElement select4thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]") private
	 * static WebElement select4thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[7]") private
	 * static WebElement select4thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]") private
	 * static WebElement select4thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]") private
	 * static WebElement select4thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[10]") private
	 * static WebElement select4thRow_9thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[11]") private
	 * static WebElement select4thRow_10thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[12]") private
	 * static WebElement select4thRow_11thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[13]") private
	 * static WebElement select4thRow_12thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[14]") private
	 * static WebElement select4thRow_13thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[15]") private
	 * static WebElement select4thRow_14thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]") private
	 * static WebElement select4thRow_15thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]") private
	 * static WebElement select4thRow_16thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[18]") private
	 * static WebElement select4thRow_17thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[19]") private
	 * static WebElement select4thRow_18thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[20]") private
	 * static WebElement select4thRow_19thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[21]") private
	 * static WebElement select4thRow_20thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[22]") private
	 * static WebElement select4thRow_21thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]") private
	 * static WebElement select5thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[3]") private
	 * static WebElement select5thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[4]") private
	 * static WebElement select5thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]") private
	 * static WebElement select5thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]") private
	 * static WebElement select5thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]") private
	 * static WebElement select5thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]") private
	 * static WebElement select5thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]") private
	 * static WebElement select5thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]") private
	 * static WebElement select5thRow_9thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[11]") private
	 * static WebElement select5thRow_10thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[12]") private
	 * static WebElement select5thRow_11thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[13]") private
	 * static WebElement select5thRow_12thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[14]") private
	 * static WebElement select5thRow_13thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[15]") private
	 * static WebElement select5thRow_14thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[16]") private
	 * static WebElement select5thRow_15thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[17]") private
	 * static WebElement select5thRow_16thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[18]") private
	 * static WebElement select5thRow_17thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[19]") private
	 * static WebElement select5thRow_18thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[20]") private
	 * static WebElement select5thRow_19thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[21]") private
	 * static WebElement select5thRow_20thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[22]") private
	 * static WebElement select5thRow_21thColumn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]") private
	 * static WebElement select6thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[3]") private
	 * static WebElement select6thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]") private
	 * static WebElement select6thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[5]") private
	 * static WebElement select6thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]") private
	 * static WebElement select6thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]") private
	 * static WebElement select6thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]") private
	 * static WebElement select6thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]") private
	 * static WebElement select6thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]") private
	 * static WebElement select6thRow_9thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[11]") private
	 * static WebElement select6thRow_10thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[12]") private
	 * static WebElement select6thRow_11thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[13]") private
	 * static WebElement select6thRow_12thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[14]") private
	 * static WebElement select6thRow_13thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[15]") private
	 * static WebElement select6thRow_14thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[16]") private
	 * static WebElement select6thRow_15thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[17]") private
	 * static WebElement select6thRow_16thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[18]") private
	 * static WebElement select6thRow_17thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[19]") private
	 * static WebElement select6thRow_18thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[20]") private
	 * static WebElement select6thRow_19thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[21]") private
	 * static WebElement select6thRow_20thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[2]") private
	 * static WebElement select7thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[3]") private
	 * static WebElement select7thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]") private
	 * static WebElement select7thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[5]") private
	 * static WebElement select7thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[6]") private
	 * static WebElement select7thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[7]") private
	 * static WebElement select7thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[8]") private
	 * static WebElement select7thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]") private
	 * static WebElement select7thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]") private
	 * static WebElement select7thRow_9thColumn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[2]") private
	 * static WebElement select8thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[3]") private
	 * static WebElement select8thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]") private
	 * static WebElement select8thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[5]") private
	 * static WebElement select8thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[6]") private
	 * static WebElement select8thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[7]") private
	 * static WebElement select8thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[8]") private
	 * static WebElement select8thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]") private
	 * static WebElement select8thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]") private
	 * static WebElement select8thRow_9thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[2]") private
	 * static WebElement select9thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[3]") private
	 * static WebElement select9thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]") private
	 * static WebElement select9thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[5]") private
	 * static WebElement select9thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[6]") private
	 * static WebElement select9thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[7]") private
	 * static WebElement select9thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[8]") private
	 * static WebElement select9thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]") private
	 * static WebElement select9thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]") private
	 * static WebElement select9thRow_9thColumn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[2]") private
	 * static WebElement select10thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[3]") private
	 * static WebElement select10thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[4]") private
	 * static WebElement select10thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[5]") private
	 * static WebElement select10thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[6]") private
	 * static WebElement select10thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[7]") private
	 * static WebElement select10thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[8]") private
	 * static WebElement select10thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[9]") private
	 * static WebElement select10thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[10]") private
	 * static WebElement select10thRow_9thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[2]") private
	 * static WebElement select11thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[3]") private
	 * static WebElement select11thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[4]") private
	 * static WebElement select11thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[5]") private
	 * static WebElement select11thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[6]") private
	 * static WebElement select11thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[7]") private
	 * static WebElement select11thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[8]") private
	 * static WebElement select11thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[9]") private
	 * static WebElement select11thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[10]") private
	 * static WebElement select11thRow_9thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[2]") private
	 * static WebElement select12thRow_1stColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[3]") private
	 * static WebElement select12thRow_2ndColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[4]") private
	 * static WebElement select12thRow_3rdColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[5]") private
	 * static WebElement select12thRow_4thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[6]") private
	 * static WebElement select12thRow_5thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[7]") private
	 * static WebElement select12thRow_6thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[8]") private
	 * static WebElement select12thRow_7thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[9]") private
	 * static WebElement select12thRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[10]") private
	 * static WebElement select12thRow_9thColumn;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='MasterGroup__101']") private static WebElement
	 * subLedgerAccountTxt;
	 * 
	 * @FindBy(xpath="//span[@class='optioncontrol_arrow_margin icon-down-arrow']")
	 * private static WebElement subLedgerAccount_ExpansionBtn;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='MasterGroup__101_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement subLedgerAccount_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='MasterGroup__101_customize_popup_container']")
	 * private static WebElement subLedgerAccount_Settings_Container;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='MasterGroup__101_customize_popup_footer']//input[1]") private
	 * static WebElement subLedgerAccount_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='MasterGroup__101_customize_popup_standardfields_list']")
	 * private static WebElement
	 * subLedgerAccount_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='MasterGroup__101_customize_popup_standardfields_header']")
	 * private static WebElement
	 * subLedgerAccount_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='MasterGroup__101_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * subLedgerAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='MasterGroup__101_customize_popup_standardfields_width']")
	 * private static WebElement
	 * subLedgerAccount_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//section[@id='reportView']//input[3]") private static
	 * WebElement subLedgerAccount_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//section[@id='reportView']//input[4]") private static
	 * WebElement subLedgerAccount_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@id='MasterGroup__101_search_container']//input[2]")
	 * private static WebElement subLedgerAccount_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//section[@id='reportView']//input[3]") private static
	 * WebElement subLedgerAccount_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//section[@id='reportView']//input[4]") private static
	 * WebElement subLedgerAccount_Settings_CancelBtn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='1']/div/div") private static WebElement homeMenu;
	 * 
	 * @FindBy(xpath="//*[@id='25']/span") private static WebElement
	 * dataMangementMenu;
	 * 
	 * @FindBy(xpath="//*[@id='115']/span") private static WebElement eraseAllMenu;
	 * 
	 * @FindBy(xpath="//*[@id='idEraseTransaction']") private static WebElement
	 * EraseAllTansactionChkbox;
	 * 
	 * @FindBy(xpath="//input[@id='idErasedata']") private static WebElement
	 * EraseAllDataChkbox;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='myNavbar']/ul/li/span[1]/i") private static
	 * WebElement EraseAllOKBtn;
	 * 
	 * @FindBy(xpath="//*[@id='myNavbar']/ul/li/span[2]/i") private static
	 * WebElement eraseAllCancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='1000']/span") private static WebElement
	 * homeMasterMenu;
	 * 
	 * @FindBy(xpath="//a[@id='1115']") private static WebElement binsMenu;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='221']/span") private static WebElement
	 * homeMasterItemMenu;
	 * 
	 * @FindBy(xpath="//*[@id='1105']/span") private static WebElement
	 * homeMasterItem_ItemMenu;
	 * 
	 * @FindBy(xpath="//*[@id='1114']/span") private static WebElement
	 * ItemUnitsMenu;
	 * 
	 * @FindBy(xpath="//*[@id='72']/span") private static WebElement
	 * ItemUnitConversionMenu;
	 * 
	 * @FindBy(xpath="//*[@id='76']/span") private static WebElement
	 * ItemSellerPriceBookMenu;
	 * 
	 * @FindBy(xpath="//*[@id='80']/span") private static WebElement
	 * ItemBuyerPriceBookMenu;
	 * 
	 * @FindBy(xpath="//*[@id='18']/span") private static WebElement
	 * ItemBarcodeDefinitionMenu;
	 * 
	 * 
	 * //Item Master
	 * 
	 * @FindBy(xpath="//*[@id='spnHeaderText']") private static WebElement
	 * item_ItemLabel;
	 * 
	 * @FindBy(xpath="//*[@id='btnNew']") private static WebElement itemNewBtn;
	 * 
	 * @FindBy(xpath="//*[@id='divBtnGroup0']/div/a") private static WebElement
	 * ItemNewnewGeneralBtn;
	 * 
	 * @FindBy(xpath="//input[@id='sName']") private static WebElement
	 * newGeneralName;
	 * 
	 * @FindBy(xpath="//input[@id='sCode']") private static WebElement
	 * newGeneralCode;
	 * 
	 * @FindBy(xpath="//select[@id='iProductType']") private static WebElement
	 * newGeneralItemTypeDropDown;
	 * 
	 * @FindBy(xpath="//input[@id='fReorderLevel']") private static WebElement
	 * newGeneralReorderLevel;
	 * 
	 * @FindBy(xpath="//input[@id='iBinCapacity']") private static WebElement
	 * newGeneralBinCapacity;
	 * 
	 * @FindBy(xpath="//select[@id='iValuationMethod']") private static WebElement
	 * newGeneralValuationMethodDropDown;
	 * 
	 * @FindBy(xpath="//input[@id='iCategory']") private static WebElement
	 * newGeneralCategoryDropDown;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement newGeneralCategorySettingBtn;
	 * 
	 * @FindBy(xpath="//select[@id='iProductMake']") private static WebElement
	 * newGeneralItemMakeDropDown;
	 * 
	 * @FindBy(xpath="//input[@id='Printer']") private static WebElement
	 * newGeneralPrint;
	 * 
	 * @FindBy(xpath="//input[@id='iAlternateCategory']") private static WebElement
	 * newGeneralAlternativeCategoryDropdown;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iAlternateCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement newGeneralAlternativeCategoryDropdownSettingBtn;
	 * 
	 * @FindBy(xpath="//textarea[@id='sDescription']") private static WebElement
	 * newGeneralDescription;
	 * 
	 * @FindBy(xpath="//input[@id='bPerishableItem']") private static WebElement
	 * newGeneralPerishableItemCheckBox;
	 * 
	 * @FindBy(xpath="//input[@id='iBin']") private static WebElement
	 * newGeneralBinDropdown;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iBin_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement newGeneralBinDropdownSettingBtn;
	 * 
	 * @FindBy(xpath="//input[@id='pImage']") private static WebElement
	 * newGeneralUploadImageOrFileBtn;
	 * 
	 * @FindBy(xpath="//*[@id='btnMasterSaveClick']/i") private static WebElement
	 * newGeneralSaveBtn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	 * private static WebElement newGeneralCLoseBtn;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='divBtnGroup1']/div/a") private static WebElement
	 * ItemNewUnitsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iDefaultBaseUnit']") private static WebElement
	 * itemUnitsDefaultBaseUnitDropdown;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iDefaultBaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement itemUnitsDefaultBaseUnitSetting;
	 * 
	 * @FindBy(xpath="//input[@id='iDefaultSalesUnit']") private static WebElement
	 * itemUnitsDefaultSalesUnitDropdown;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iDefaultSalesUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement itemUnitsDefaultSalesUnitSettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iDefaultPurchaseUnit']") private static
	 * WebElement itemUnitsDefaultPurchaseUnitDropDown;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iDefaultPurchaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement itemUnitsDefaultPurchaseUnitSettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='fLength']") private static WebElement
	 * itemUnitsLength;
	 * 
	 * @FindBy(xpath="//input[@id='fWidth']") private static WebElement
	 * itemUnitswidth;
	 * 
	 * @FindBy(xpath="//input[@id='fHeight']") private static WebElement
	 * itemUnitsHeight;
	 * 
	 * @FindBy(xpath="//*[@id='fCBM']") private static WebElement itemUnitsCBM;
	 * 
	 * @FindBy(xpath="//input[@id='fWeight']") private static WebElement
	 * itemUnitsWeight;
	 * 
	 * @FindBy(xpath="//input[@id='iPalletUnit']") private static WebElement
	 * itemUnitsPalletUnitTxt;
	 * 
	 * @FindBy(xpath="//input[@id='fPalletQty']") private static WebElement
	 * itemUnitsPalletQtyTxt;
	 * 
	 * @FindBy(xpath="//input[@id='fPalletLength']") private static WebElement
	 * itemUnitsPalletLengthTXt;
	 * 
	 * @FindBy(xpath="//input[@id='fPalletWidth']") private static WebElement
	 * itemUnitsPalletWidthTxt;
	 * 
	 * @FindBy(xpath="//input[@id='fPalletHeight']") private static WebElement
	 * itemUnitsPalletHeightTxt;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='divBtnGroup2']/div/a") private static WebElement
	 * itemNewSettingsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='fStandardCost']") private static WebElement
	 * NewSettingsStandardCost;
	 * 
	 * @FindBy(xpath="//*[@id='fOverheadCost']") private static WebElement
	 * NewSettingsOverheadCost;
	 * 
	 * @FindBy(xpath="//*[@id='fIndirectCost']") private static WebElement
	 * NewSettingsIndirectCost;
	 * 
	 * @FindBy(xpath="//*[@id='fProfit']") private static WebElement
	 * NewSettingsProfit;
	 * 
	 * @FindBy(xpath="//*[@id='iDontshowproductexpireddays']") private static
	 * WebElement NewSettingsDontshowproductexpireddays;
	 * 
	 * @FindBy(xpath="//*[@id='iTaxCode']") private static WebElement
	 * NewSettingsTaxCode;
	 * 
	 * @FindBy(xpath="//*[@id='iTaxCode_input_settings']/span") private static
	 * WebElement NewSettingsTaxCodeSttingsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='btnMasterSaveClick']") private static WebElement
	 * NewSettingsSaveBtn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	 * private static WebElement NewSettingsCloseBtn;
	 * 
	 * @FindBy(xpath="//*[@id='divBtnGroup3']/div/a") private static WebElement
	 * ItemNewClassificationBtn;
	 * 
	 * @FindBy(xpath="//*[@id='iABCCodeValue']") private static WebElement
	 * newItemClassificationABC_CodeValueDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='iABCCodeMargin']") private static WebElement
	 * newItemClassificationABC_CodeMarginDropdOwn;
	 * 
	 * @FindBy(xpath="//*[@id='iABCCodeRevenue']") private static WebElement
	 * newItemClassificationABCCodeRevenueDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='iABCCodeCarryingCost']") private static WebElement
	 * newItemClassificationABCCodeCarryingCostDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='sBarcode1']") private static WebElement
	 * newItemClassificationBarcode1;
	 * 
	 * @FindBy(xpath="//*[@id='sBarcode2']") private static WebElement
	 * newItemClassificationBarcode2;
	 * 
	 * @FindBy(xpath="//*[@id='sBarcode3']") private static WebElement
	 * newItemClassificationBarcode3;
	 * 
	 * @FindBy(xpath="//*[@id='iUnit1']") private static WebElement
	 * newItemgridFirstrowUnit;
	 * 
	 * @FindBy(xpath="//*[@id='sBarcode1']") private static WebElement
	 * newItemgridFirstrowBarcode;
	 * 
	 * //Grid element
	 * 
	 * @FindBy(xpath="//*[@id='sBatch1']") private static WebElement
	 * newItemClassificationgridFirstrowBatch;
	 * 
	 * @FindBy(xpath="//*[@id='iUnit2']") private static WebElement
	 * newItemClassificationgridSecondrowUnit;
	 * 
	 * @FindBy(xpath="//*[@id='sBarcode2']") private static WebElement
	 * newItemClassificationgridSecondrowBarcode;
	 * 
	 * @FindBy(xpath="//*[@id='sBatch2']") private static WebElement
	 * newItemClassificationgridSecondrowBatch;
	 * 
	 * @FindBy(xpath="//*[@id='iUnit3']") private static WebElement
	 * newItemClassificationgridThridrowUnit;
	 * 
	 * @FindBy(xpath="//*[@id='sBarcode3']") private static WebElement
	 * newItemClassificationgridThridrowBarcode;
	 * 
	 * @FindBy(xpath="//*[@id='sBatch3']") private static WebElement
	 * newItemClassificationgridThridrowBatch;
	 * 
	 * @FindBy(xpath="//*[@id='iUnit_input_settings']") private static WebElement
	 * newItemClassificationgridUnitSettings;
	 * 
	 * @FindBy(xpath="//*[@id='divBtnGroup4']/div/a") private static WebElement
	 * ItemNewOtherDetailsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iCostOfIssueAccount']") private static WebElement
	 * newOtherDetailsCostOfIssueitem;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iCostOfIssueAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement newOtherDetailsCostOfIssueitemsettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iStocksAccount']") private static WebElement
	 * newOtherDetailsStocksitem;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iStocksAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement newOtherDetailsiStocksitemsettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iSalesAccount']") private static WebElement
	 * newOtherDetailsSalesAccount;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iSalesAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']"
	 * ) private static WebElement newOtherDetailsSalesitemsettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iWIPAccount']") private static WebElement
	 * newOtherDetailsWIPitem;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iWIPAccount_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]"
	 * ) private static WebElement newOtherDetailsWIPitemsettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iCostofShortageStockAC']") private static
	 * WebElement newOtherDetailsCostofShortageStockAC;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iCostofShortageStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]"
	 * ) private static WebElement newOtherDetailsCostofShortageStockACsettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iCostofExcessStockAC']") private static
	 * WebElement newOtherDetailsCostofExcessStockAC;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iCostofExcessStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]"
	 * ) private static WebElement OtherDetailsCostofExcessStockACsettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iCostofSaleReturnAC']") private static WebElement
	 * OtherDetailsCostofSaleReturnAC;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iCostofSaleReturnAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]"
	 * ) private static WebElement OtherDetailsCostofSaleReturnACsettingsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='iPurchaseVarianceAC']") private static WebElement
	 * OtherDetailsPurchaseVarianceAC;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='iPurchaseVarianceAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]"
	 * ) private static WebElement OtherDetailsPurchaseVarianceACsettingsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='btnMasterSaveClick']") private static WebElement
	 * newOtherDetailsSaveBtn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	 * private static WebElement newOtherDetailsCloseBtn;
	 * 
	 * 
	 * 
	 * //
	 * 
	 * @FindBy(xpath="//input[@id='id_body_12']") private static WebElement
	 * enter_AccountTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_12_input_image']/span") private static
	 * WebElement enter_Account_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_12_input_settings']/span") private static
	 * WebElement enter_Account_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_12_customize_popup_container']") private
	 * static WebElement enter_Account_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
	 * private static WebElement enter_Account_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_12_customize_popup_standardfields_list']") private
	 * static WebElement enter_Account_Settings_StandardFieldsBtn_FieldDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_12_customize_popup_standardfields_header']") private
	 * static WebElement enter_Account_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_12_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * enter_Account_Settings_StandardFieldsBtn_AlignmentDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_12_customize_popup_standardfields_width']") private
	 * static WebElement enter_Account_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement enter_Account_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement enter_Account_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]") private
	 * static WebElement enter_Account_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement enter_Account_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement enter_Account_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_16']") private static WebElement
	 * enter_Amount;
	 * 
	 * @FindBy(xpath="//textarea[@id='id_body_16777219']") private static WebElement
	 * enter_Receipts_Remarks;
	 * 
	 * @FindBy(xpath="//textarea[@id='id_body_16777222']") private static WebElement
	 * enter_Payments_Remarks;
	 * 
	 * @FindBy(xpath="//textarea[@id='id_body_16777225']") private static WebElement
	 * enter_PettyCash_Remarks;
	 * 
	 * @FindBy(xpath="//textarea[@id='id_body_16777228']") private static WebElement
	 * enter_PostDatedReceipts_Remarks;
	 * 
	 * @FindBy(xpath="//textarea[@id='id_body_16777231']") private static WebElement
	 * enter_PostDatedPaymentss_Remarks;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_23']") private static WebElement
	 * enter_ItemTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_23_input_image']/span") private static
	 * WebElement item_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_23_input_settings']/span") private static
	 * WebElement item_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_body_23_customize_popup_container']") private
	 * static WebElement item_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_body_23_customize_popup_footer']//input[1]")
	 * private static WebElement item_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_body_23_customize_popup_standardfields_list']") private
	 * static WebElement item_Settings_StandardFieldsBtn_FieldDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_body_23_customize_popup_standardfields_header']") private
	 * static WebElement item_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_body_23_customize_popup_standardfields_alignment']")
	 * private static WebElement item_Settings_StandardFieldsBtn_AlignmentDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_body_23_customize_popup_standardfields_width']") private
	 * static WebElement item_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement item_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement item_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_body_23_search_container']//input[2]") private
	 * static WebElement item_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement item_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement item_Settings_CancelBtn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='id_body_24']") private static WebElement
	 * enter_UnitTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_24_input_image']/span") private static
	 * WebElement unit_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_24_input_settings']/span") private static
	 * WebElement unit_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_body_24_customize_popup_container']") private
	 * static WebElement unit_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_body_24_customize_popup_footer']//input[1]")
	 * private static WebElement unit_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_body_24_customize_popup_standardfields_list']") private
	 * static WebElement unit_Settings_StandardFieldsBtn_FieldDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_body_24_customize_popup_standardfields_header']") private
	 * static WebElement unit_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_body_24_customize_popup_standardfields_alignment']")
	 * private static WebElement unit_Settings_StandardFieldsBtn_AlignmentDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_body_24_customize_popup_standardfields_width']") private
	 * static WebElement unit_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement unit_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement unit_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_body_24_search_container']//input[2]") private
	 * static WebElement unit_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement unit_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement unit_Settings_CancelBtn;
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='id_body_26']") private static WebElement
	 * enter_Quantity;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_27']") private static WebElement
	 * enter_Rate;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_28']") private static WebElement
	 * enter_Gross;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_33554439']") private static WebElement
	 * enter_Discount;
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='id_body_33554436']") private static WebElement
	 * PurReturnsenter_Discount;
	 * 
	 * 
	 * 
	 * @FindBy (xpath="//input[@id='id_body_38']") private static WebElement
	 * enter_RMA;
	 * 
	 * @FindBy (xpath="//input[@id='id_body_85']") private static WebElement
	 * enter_Bin;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_13']") private static WebElement
	 * enter_Batch;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_12']") private static WebElement
	 * enter_DebitACTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_12_input_image']/span") private static
	 * WebElement enter_DebitAC_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_12_input_settings']/span") private static
	 * WebElement enter_DebitAC_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_12_customize_popup_container']") private
	 * static WebElement enter_DebitAC_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
	 * private static WebElement enter_DebitAC_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_12_customize_popup_standardfields_list']") private
	 * static WebElement enter_DebitAC_Settings_StandardFieldsBtn_FieldDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_12_customize_popup_standardfields_header']") private
	 * static WebElement enter_DebitAC_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_12_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * enter_DebitAC_Settings_StandardFieldsBtn_AlignmentDrpdwn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_12_customize_popup_standardfields_width']") private
	 * static WebElement enter_DebitAC_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement enter_DebitAC_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement enter_DebitAC_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]") private
	 * static WebElement enter_DebitAC_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement enter_DebitAC_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement enter_DebitAC_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_39']") private static WebElement
	 * enter_CreditACTxt;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_39_input_image']/span") private static
	 * WebElement enter_CreditAC_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_39_input_settings']/span") private static
	 * WebElement enter_CreditAC_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_39_customize_popup_container']") private
	 * static WebElement enter_CreditAC_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_39_customize_popup_footer']//input[1]")
	 * private static WebElement enter_CreditAC_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_39_customize_popup_standardfields_list']") private
	 * static WebElement enter_CreditAC_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_39_customize_popup_standardfields_header']") private
	 * static WebElement enter_CreditAC_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_39_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * enter_CreditAC_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_39_customize_popup_standardfields_width']") private
	 * static WebElement enter_CreditAC_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement enter_CreditAC_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement enter_CreditAC_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_39_search_container']//input[2]") private
	 * static WebElement enter_CreditAC_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement enter_CreditAC_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement enter_CreditAC_Settings_CancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_18']") private static WebElement
	 * enter_DebitTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_19']") private static WebElement
	 * enter_CreditTxt;
	 * 
	 * @FindBy(xpath="//textarea[@id='id_body_16777241']") private static WebElement
	 * enter_NonStandardJournalEntries_RemarksTxt;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_87']") private static WebElement
	 * enter_Warehouse2Txt;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_87_input_image']/span") private static
	 * WebElement enter_Warehouse2_ExpansionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_body_87_input_settings']/span") private static
	 * WebElement enter_Warehouse2_SettingsBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_87_customize_popup_container']") private
	 * static WebElement enter_WareHouse2_Settings_Container;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_87_customize_popup_footer']//input[1]")
	 * private static WebElement enter_WareHouse2_Settings_StandardFieldsBtn;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_87_customize_popup_standardfields_list']") private
	 * static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_Fielddropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_87_customize_popup_standardfields_header']") private
	 * static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_HeaderTxt;
	 * 
	 * @FindBy(xpath=
	 * "//select[@id='id_header_87_customize_popup_standardfields_alignment']")
	 * private static WebElement
	 * enter_WareHouse2_Settings_StandardFieldsBtn_Alignmentdropdown;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_header_87_customize_popup_standardfields_width']") private
	 * static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_WidthTxt;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement enter_WareHouse2_Settings_StandardFieldsBtn_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement enter_WareHouse2_Settings_StandardFieldsBtn_CancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='id_header_87_search_container']//input[2]") private
	 * static WebElement enter_WareHouse2_Settings_DeleteColumnBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[3]") private static
	 * WebElement enter_WareHouse2_Settings_OkBtn;
	 * 
	 * @FindBy(xpath="//div[contains(@class,'panel')]//input[4]") private static
	 * WebElement enter_WareHouse2_Settings_CancelBtn;
	 * 
	 * 
	 * ////////////
	 * 
	 * // Right Panel*** InfoSide Bar
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
	 * private static WebElement infoSideBarCustomizeBtn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
	 * private static WebElement customizeCloseBtn;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='id_transactionentry_infopanel_customize_container']//li[@id='Dash_Save']")
	 * private static WebElement customizeSaveBtn;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='id_transactionentry_infopanel_customize_container']//li[@id='Dash_Close']")
	 * private static WebElement customizeCancelBtn;
	 * 
	 * @FindBy(xpath="//input[@id='searchBoxTrans']") private static WebElement
	 * customizeSearchTxt;
	 * 
	 * @FindBy(xpath="//*[@id='Dashboard_Graph_panelID_Trans']/div[1]/i") private
	 * static WebElement customizeSearchBtn;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//a[@id='GraphOption']") private
	 * static WebElement graphBtn;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='Newgraph']") private
	 * static WebElement newGraphOption;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//a[@id='ReportOption']") private
	 * static WebElement reportBtn;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewReport']") private
	 * static WebElement newReportOption;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//a[@id='InfopanelOption']")
	 * private static WebElement infoPanelBtn;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewInfopanel']") private
	 * static WebElement newInfoPanelOption;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//a[@id='workflow']") private
	 * static WebElement workFlowBtn;
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewWorkflow']") private
	 * static WebElement newWorkFlowOption;
	 * 
	 * @FindBy(xpath="//a[@id='DocumentInfoOption']") private static WebElement
	 * docInfoBtn;
	 * 
	 * @FindBy(xpath="//li[@id='id_Dashlet0']//a") private static WebElement
	 * newDocInfoOption;
	 * 
	 * @FindBy(
	 * xpath="//span[@class='icon-left-and-right-panel-icon icon-font6 no_padding_left_right']"
	 * ) private static WebElement infoSideBarExpandBtn;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * // Footer Section
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//label[@id='id_transactionentry_footer_panel_summary_value_net']") private
	 * static WebElement netLabel;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	 * private static WebElement net_Amount;
	 * 
	 * 
	 * /////////////////////////////////////////////////////
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='81']/span") private static WebElement
	 * financialsReportsMenu;
	 * 
	 * @FindBy(xpath="//a[@id='500']//span[contains(text(),'Ledger')]") private
	 * static WebElement ledger;
	 * 
	 * @FindBy(xpath="//*[@id='658']/span") private static WebElement ledgerDetail;
	 * 
	 * @FindBy(xpath="//*[@id='501']/span") private static WebElement subLedger;
	 * 
	 * @FindBy(xpath="//*[@id='82']/span") private static WebElement
	 * cashAndBankBooksMenu;
	 * 
	 * @FindBy(xpath="//*[@id='510']/span") private static WebElement
	 * cashBookReport;
	 * 
	 * @FindBy(xpath="//*[@id='511']/span") private static WebElement
	 * bankBookReport;
	 * 
	 * @FindBy(xpath="//*[@id='512']/span") private static WebElement
	 * pettyCashBokReport;
	 * 
	 * @FindBy(xpath="//*[@id='513']/span") private static WebElement dayBookReport;
	 * 
	 * @FindBy(xpath="//*[@id='83']/span") private static WebElement
	 * bankReconciliationReport;
	 * 
	 * @FindBy(xpath="//*[@id='84']/span") private static WebElement
	 * bankReconciliationImport;
	 * 
	 * @FindBy(xpath="//*[@id='85']/span") private static WebElement
	 * customerVendorReconciliation;
	 * 
	 * @FindBy(xpath="//*[@id='537']/span") private static WebElement
	 * bankReconciliationStatement;
	 * 
	 * @FindBy(xpath="//*[@id='162']/span") private static WebElement
	 * chequeDiscountingMenu;
	 * 
	 * @FindBy(xpath="//*[@id='502']/span") private static WebElement
	 * salesReportsMenu;
	 * 
	 * @FindBy(xpath="//*[@id='503']/span") private static WebElement
	 * salesRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='504']/span") private static WebElement
	 * salesReturnRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='505']/span") private static WebElement
	 * summarySalesBookReport;
	 * 
	 * @FindBy(xpath="//*[@id='628']/span") private static WebElement
	 * monthlySalesBookReport;
	 * 
	 * @FindBy(xpath="//*[@id='629']/span") private static WebElement
	 * topCustomersListReport;
	 * 
	 * @FindBy(xpath="//*[@id='506']/span") private static WebElement
	 * purchaseReportsMenu;
	 * 
	 * @FindBy(xpath="//*[@id='507']/span") private static WebElement
	 * purchaseRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='508']/span") private static WebElement
	 * purchaseReturnRegisteReport;
	 * 
	 * @FindBy(xpath="//*[@id='509']/span") private static WebElement
	 * summaryPurchaseBookReport;
	 * 
	 * @FindBy(xpath="//*[@id='514']/span") private static WebElement
	 * registersReportMenu;
	 * 
	 * @FindBy(xpath="//*[@id='516']/span") private static WebElement
	 * openingBalanceRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='515']/span") private static WebElement
	 * journalEntriesRegisterReport;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Credit Note Register')]") private
	 * static WebElement creditNoteRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='610']/span") private static WebElement
	 * debitNoteRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='598']/span") private static WebElement
	 * receiptsRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='599']/span") private static WebElement
	 * paymentRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='518']/span") private static WebElement
	 * pdcReceiptsRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='519']/span") private static WebElement
	 * pdcPaymentsRegisterReport;
	 * 
	 * @FindBy(xpath="//*[@id='517']/span") private static WebElement
	 * entryJournalRegisterMenu;
	 * 
	 * @FindBy(xpath="//*[@id='523']/span") private static WebElement
	 * salesAndPurchasesReportMenu;
	 * 
	 * @FindBy(xpath="//*[@id='524']/span") private static WebElement
	 * salesGroupedByCustomerReport;
	 * 
	 * @FindBy(xpath="//*[@id='525']/span") private static WebElement
	 * salesGroupedByProductReport;
	 * 
	 * @FindBy(xpath="//*[@id='526']/span") private static WebElement
	 * salesGroupedByDepartmentReport;
	 * 
	 * @FindBy(xpath="//*[@id='527']/span") private static WebElement
	 * purchasesGroupedByVendorReport;
	 * 
	 * @FindBy(xpath="//*[@id='528']/span") private static WebElement
	 * purchasesGroupedByProductReport;
	 * 
	 * @FindBy(xpath="//*[@id='529']/span") private static WebElement
	 * purchasesGroupedByDepartmentReport;
	 * 
	 * @FindBy(xpath="//*[@id='568']/span") private static WebElement
	 * MiscellaneousAnalysisReportMenu;
	 * 
	 * @FindBy(xpath="//*[@id='569']/span") private static WebElement
	 * peakAndLowBalancesReport;
	 * 
	 * @FindBy(xpath="//*[@id='570']/span") private static WebElement
	 * comprativeAnalysisReport;
	 * 
	 * @FindBy(xpath="//*[@id='571']/span") private static WebElement
	 * transactionsTypeAnalysisReport;
	 * 
	 * @FindBy(xpath="//*[@id='572']/span") private static WebElement
	 * abcAnalysisReport;
	 * 
	 * @FindBy(xpath="//*[@id='597']/span") private static WebElement
	 * interestCalculationReport;
	 * 
	 * @FindBy(xpath="//*[@id='536']/span") private static WebElement
	 * mastersInformationMenu;
	 * 
	 * @FindBy(xpath="//*[@id='538']/span") private static WebElement
	 * masterInfoMenu;
	 * 
	 * @FindBy(xpath="//*[@id='144']/span") private static WebElement
	 * productLabelMenu;
	 * 
	 * @FindBy(xpath="//*[@id='573']/span") private static WebElement
	 * unitConversionMenu;
	 * 
	 * @FindBy(xpath="//*[@id='147']/span") private static WebElement
	 * skidDefinitionMenu;
	 * 
	 * @FindBy(xpath="//*[@id='520']/span") private static WebElement
	 * auditTrailMenu;
	 * 
	 * @FindBy(xpath="//*[@id='521']/span") private static WebElement
	 * auditTrailtransactionsReport;
	 * 
	 * @FindBy(xpath="//*[@id='522']/span") private static WebElement
	 * aAuditTrailloginsReport;
	 * 
	 * @FindBy(xpath="//*[@id='204']/span") private static WebElement accountQuery;
	 * 
	 * 
	 * 
	 * @FindBy (xpath="//select[@id='RITCombobox__1']") private static WebElement
	 * includePDCDrpDwn;
	 * 
	 * @FindBy (xpath="//select[@id='RITCombobox__1']") private static WebElement
	 * stockTypeOrValidation;
	 * 
	 * @FindBy (xpath="//select[@id='RITCombobox__10']") private static WebElement
	 * includeNonAuthorizeDataDrpDwn;
	 * 
	 * @FindBy (xpath="//select[@id='RITCombobox__5']") private static WebElement
	 * sortingDrpDwn;
	 * 
	 * @FindBy (xpath="//input[@id='RITCheckbox__2']") private static WebElement
	 * movedAccountOnlyChkBox;
	 * 
	 * @FindBy (xpath="//input[@id='RITCheckbox__3']") private static WebElement
	 * printAccountIndexChkBox;
	 * 
	 * @FindBy (xpath="//input[@id='RITCheckbox__9']") private static WebElement
	 * freshAccountForEachPageChkBox;
	 * 
	 * @FindBy (xpath="//input[@id='RITCheckbox__11']") private static WebElement
	 * printAsStatmentOfAccountChkBox;
	 * 
	 * @FindBy (xpath="//input[@id='RITCheckbox__6']") private static WebElement
	 * displayUnrealizedLossOrGainChkBox;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//div[@class='theme_color font-6']") public static WebElement
	 * errorMessage;
	 * 
	 * @FindBy(xpath="//span[@class='icon-reject2 theme_color']") public static
	 * WebElement errorMessageCloseBtn;
	 * 
	 * //Dash board Page
	 * 
	 * @FindBy(xpath="//*[@id='dashName']") private static WebElement labelDashboard
	 * ;
	 * 
	 * @FindBy(xpath="//*[@id='Select_dash']") private static WebElement
	 * selectDashboard ;
	 * 
	 * @FindBy(xpath="//*[@id='Dashboard_AddDash']") private static WebElement
	 * newAddDashBoard;
	 * 
	 * @FindBy(xpath="//*[@id='Dashboard_Dash_Config']") private static WebElement
	 * dashboardCustomizationSettings;
	 * 
	 * 
	 * /////////////////////
	 * 
	 * //Settings Screen
	 * 
	 * @FindBy(xpath="//span[@id='updateButton']") private static WebElement
	 * updateBtn;
	 * 
	 * @FindBy(xpath="//i[@class='icon-close icon-font6']") private static
	 * WebElement settings_closeBtn;
	 * 
	 * 
	 * //Documents Tab
	 * 
	 * 
	 * @FindBy(
	 * xpath="//div[@class='font-5 theme_background-color-inverse theme_color-inverse']"
	 * ) private static WebElement documentsTab;
	 * 
	 * @FindBy(xpath="//li[@id='navigationtab1']") private static WebElement
	 * documentsTabForMaterialReceiptNotes;
	 * 
	 * 
	 * @FindBy(xpath="//span[@id='DocumentLoadMasterPopupBtn']") private static
	 * WebElement loadMastersBtn;
	 * 
	 * @FindBy(xpath="//select[@id='doc_voucherDropDown']") private static
	 * WebElement loadmasterDropDown;
	 * 
	 * @FindBy(xpath="//button[@id='btnSelectDependMaster']") private static
	 * WebElement selectAllBtn;
	 * 
	 * @FindBy(xpath="//button[contains(text(),'Reset')]") private static WebElement
	 * resetBtn;
	 * 
	 * @FindBy(xpath="//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
	 * private static WebElement okBtn;
	 * 
	 * @FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/span[1]") private
	 * static WebElement deleteTagBtn;
	 * 
	 * @FindBy(xpath="//span[@id='DocumentAddGroupPopupBtn']") private static
	 * WebElement addGroupBtn;
	 * 
	 * @FindBy(xpath="//input[@id='doc_GroupName']") private static WebElement
	 * groupNameTXt;
	 * 
	 * @FindBy(xpath="//button[contains(text(),'Add')]") private static WebElement
	 * addBtn;
	 * 
	 * @FindBy(xpath="//div[@class='col-xs-12 form-group']//button[@id='btnCancel']"
	 * ) private static WebElement cancelBtn;
	 * 
	 * @FindBy(xpath="//div[@id='voucherTabContent']//span[2]") private static
	 * WebElement deletegroupBtn;
	 * 
	 * @FindBy(xpath="//input[@id='doc_title']") private static WebElement titleTxt;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	 * private static WebElement titleTxt;
	 * 
	 * @FindBy(xpath="//input[@id='doc_baseDocument']") private static WebElement
	 * baseDocumentTxt;
	 * 
	 * @FindBy(xpath="//input[@id='txtbox_doc_Accountdepandency']") private static
	 * WebElement accountDependencyTxt;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentGainAC')]") private
	 * static WebElement iExchangeAdjustmentGainACChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentLossAC')]") private
	 * static WebElement iExchangeAdjustmentLossACChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iPrimaryAccount')]") private static
	 * WebElement iPrimaryAccountChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iCity')]") private static WebElement
	 * iCityChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iDeliveryCity')]") private static
	 * WebElement iDeliverycityChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iBankAc')]") private static WebElement
	 * iBankACChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iPDCDiscountedAC')]") private static
	 * WebElement iPDCDiscountedACChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='txtbox_doc_Productdepandency']") private static
	 * WebElement itemDependencyTxt;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Outlet__')]") private static
	 * WebElement outletChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iCostofShortageStockAC')]") private
	 * static WebElement iCostofShortageStockACChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iCostofExcessStockAC')]") private
	 * static WebElement iCostofExcessStockACChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iCostofSaleReturnAC')]") private
	 * static WebElement iCostofSaleReturnACChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iPurchaseVarianceAC')]") private
	 * static WebElement iPurchaseVarianceACChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iDefaultBaseUnit')]") private static
	 * WebElement iDefaultBaseUnitChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iDefaultSalesUnit')]") private static
	 * WebElement iDefaultSalesUnitChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iDefaultPurchaseUnit')]") private
	 * static WebElement iDefaultPurchaseUnitChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iCostOfIssueAccount')]") private
	 * static WebElement iCostOfIssueAccountChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iStocksAccount')]") private static
	 * WebElement iStocksAccountChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iSalesAccount')]") private static
	 * WebElement iSalesAccountChkBox;
	 * 
	 * @FindBy(xpath="//li[12]//div[1]//label[1]//span[1]") private static
	 * WebElement otherdetails1Box;
	 * 
	 * @FindBy(xpath="//li[13]//div[1]//label[1]//span[1]") private static
	 * WebElement replenishment1ChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Reorder__')]") private static
	 * WebElement reorderChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iCategory')]") private static
	 * WebElement iCategoryChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iWIPAccount')]") private static
	 * WebElement iWIPAccountChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Classification__')]") private static
	 * WebElement classificationChkBox;
	 * 
	 * @FindBy(xpath="//li[18]//div[1]//label[1]//span[1]") private static
	 * WebElement repelenishment2ChkBox;
	 * 
	 * @FindBy(xpath="//li[19]//div[1]//label[1]//span[1]") private static
	 * WebElement otherDetails2ChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iBin')]") private static WebElement
	 * iBinChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iAlternateCategory')]") private static
	 * WebElement iAlternateCategoryChkBox;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'iTaxCode')]") private static
	 * WebElement iTaxCodeChkBox;
	 * 
	 * @FindBy(xpath="//select[@id='doc_Accountdepandency_Filter']") private static
	 * WebElement accountfilterDropdown;
	 * 
	 * @FindBy(xpath="//select[@id='doc_Itemdepandency_Filter']") private static
	 * WebElement itemfilterDropdown;
	 * 
	 * 
	 * // Documents Grid Elements
	 * 
	 * // first row
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_1-0']") private static WebElement
	 * firstrow;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Delete Row')]") private static
	 * WebElement Doc_deleterowBtn;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Insert Row')]") private static
	 * WebElement Doc_insertRowBtn;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_1-1']") private static WebElement
	 * masters1;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_1-2']") private static WebElement
	 * position1;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_1-3']") private static WebElement
	 * showDependency1;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_1-4']") private static WebElement
	 * group1;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_1-5']") private static WebElement
	 * filter1;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_1-6']") private static WebElement
	 * mandatory1;
	 * 
	 * 
	 * // Second Row... delete and insert row are same
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_2-0']") private static WebElement
	 * secondRow;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_2-1']") private static WebElement
	 * masters2;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_2-2']") private static WebElement
	 * position2;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_2-3']") private static WebElement
	 * showDependency2;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_2-4']") private static WebElement
	 * group2;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_2-5']") private static WebElement
	 * filter2;
	 * 
	 * @FindBy(xpath="//td[@id='doc_TagsTable_col_2-6']") private static WebElement
	 * mandatory2;
	 * 
	 * // After clicking *** Properties Changes which are same for all rows
	 * 
	 * @FindBy(xpath="//select[@id='doc_TagsTableMasterDropDown']") private static
	 * WebElement masterDropDown;
	 * 
	 * @FindBy(xpath="//select[@id='doc_TagsPositionDropDown']") private static
	 * WebElement positionDropdown;
	 * 
	 * @FindBy(xpath="//input[@id='txtbox_doc_TagsDepedencyDropDown']") private
	 * static WebElement showDependencyDropdown;
	 * 
	 * @FindBy(xpath="//input[@id='doc_TagsGroupTxtbox']") private static WebElement
	 * groupTxt;
	 * 
	 * @FindBy(xpath="//select[@id='docFilter']") private static WebElement
	 * filterDropdown;
	 * 
	 * @FindBy(xpath="//select[@id='doc_MandatoryDropDown']") private static
	 * WebElement mandatoryDropDown;
	 * 
	 * // Grid Elements completed
	 * 
	 * // Right Panel
	 * 
	 * // Home ***************************
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_1']/a/i") private static WebElement
	 * homeExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_2']/a/i") private static WebElement
	 * companyExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_3']/a/i") private static WebElement
	 * newComapanyBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_131']/a/i") private static WebElement
	 * yearEndProcesBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_125']/a/i") private static WebElement
	 * interComapnyTransactionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_134']/a/i") private static WebElement
	 * synchronizationBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_6']/a/i") private static WebElement
	 * securityBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_1000']/a/i") private static WebElement
	 * mastersExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_220']/a/i") private static WebElement
	 * currencyBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_221']/a/i") private static WebElement
	 * itemBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8002']/a/i") private static WebElement
	 * schemesExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8015']/a/i") private static WebElement
	 * discountDefinitionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_224']/a/i") private static WebElement
	 * mrpBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_225']/a/i") private static WebElement
	 * qcBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_234']/a/i") private static WebElement
	 * warehouseManagementSystemBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_251']/a/i") private static WebElement
	 * maintainceBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8001']/a/i") private static WebElement
	 * pointofSaleExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8005']/a/i") private static WebElement
	 * memberBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8006']/a/i") private static WebElement
	 * giftVoucherBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_1025']/a/i") private static WebElement
	 * pointOfSaleTableManagementBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_1103']/a/i") private static WebElement
	 * payrollBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_1056']/a/i") private static WebElement
	 * tdsAnnexureBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_16']/a/i") private static WebElement
	 * settingsExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_66']/a/i") private static WebElement
	 * authorizationBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_25']/a/i") private static WebElement
	 * datamanagementBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_20']/a/i") private static WebElement
	 * utilitiesBtn;
	 * 
	 * 
	 * // Finance *************************
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_60']/a/i") private static WebElement
	 * financeExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_61']/a/i") private static WebElement
	 * financeTransactionExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_2001']/a/i") private static WebElement
	 * cashBankBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_2007']/a/i") private static WebElement
	 * financePurchasesBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_2014']/a/i") private static WebElement
	 * financeSalesBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_2023']/a/i") private static WebElement
	 * journalsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_2039']/a/i") private static WebElement
	 * manufacturingBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_219']/a/i") private static WebElement
	 * autoPostingsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_62']/a/i") private static WebElement
	 * creditManagementExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_217']/a/i") private static WebElement
	 * delinquencyBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_81']/a/i") private static WebElement
	 * financeReportsExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_82']/a/i") private static WebElement
	 * cashAndBankBookBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_502']/a/i") private static WebElement
	 * salesReportBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_506']/a/i") private static WebElement
	 * purchaseReportBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_207']/a/i") private static WebElement
	 * vatBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_514']/a/i") private static WebElement
	 * registersBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_523']/a/i") private static WebElement
	 * salesAndPurchaseAnalysisBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_568']/a/i") private static WebElement
	 * miscellaneousAnalysisBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_536']/a/i") private static WebElement
	 * masterInformationBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_520']/a/i") private static WebElement
	 * financeReportsAuditTrialBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_50001']/a/i") private static WebElement
	 * fixedAssetBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_530']/a/i") private static WebElement
	 * finalAccountsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_558']/a/i") private static WebElement
	 * receiveableAndPayableAnalysisExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_605']/a/i") private static WebElement
	 * customerDetailBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_607']/a/i") private static WebElement
	 * customerSummaryBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_606']/a/i") private static WebElement
	 * vendorDetailBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_608']/a/i") private static WebElement
	 * vendorSummaryBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_3301']/a/i") private static WebElement
	 * budgetExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_3304']/a/i") private static WebElement
	 * reviseBudgetBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_3321']/a/i") private static WebElement
	 * budgetReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_3311']/a/i") private static WebElement
	 * onlinepaymentsBtn;
	 * 
	 * 
	 * // Financial Menu and Sub Menus
	 * 
	 * @FindBy(xpath="//*[@id='60']/div/span") private static WebElement
	 * financialsMenu;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='2007']/span") private static WebElement
	 * financialsTransactionsPurchaseMenu;
	 * 
	 * @FindBy(xpath="//*[@id='2008']/span") private static WebElement
	 * purchaseVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2009']/span") private static WebElement
	 * purchaseReturnsVoucher;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='2014']/span") private static WebElement
	 * financialsTransactionsSalesMenu;
	 * 
	 * @FindBy(xpath="//*[@id='2015']/span") private static WebElement
	 * salesInvoicesVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2016']/span") private static WebElement
	 * salesReturnsVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2020']/span") private static WebElement cashSales;
	 * 
	 * @FindBy(xpath="//*[@id='2021']/span") private static WebElement
	 * hirePurchaseSales;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='2032']/span") private static WebElement
	 * journalsEntriesVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2025']/span") private static WebElement
	 * forexJVVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2029']/span") private static WebElement
	 * interdepartmentaljvVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2024']/span") private static WebElement
	 * oldJouranlEntriesVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2026']/span") private static WebElement
	 * debitNotesVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2030']/span") private static WebElement
	 * debitNotesLinewiseVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2027']/span") private static WebElement
	 * creditNotesVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2031']/span") private static WebElement
	 * creditNotesLinewiseVoucher;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='2046']/span") private static WebElement
	 * fixedAssetsDepreciationVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='219']/span") private static WebElement
	 * financialsTransactionsAutoPostingsMenu;
	 * 
	 * @FindBy(xpath="//*[@id='77']/span") private static WebElement
	 * recurringJournalVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='79']/span") private static WebElement
	 * postRecurringJournal;
	 * 
	 * @FindBy(xpath="//*[@id='92']/span") private static WebElement
	 * recurringJournalTemplate;
	 * 
	 * @FindBy(xpath="//*[@id='91']/span") private static WebElement postInterest;
	 * 
	 * @FindBy(xpath="//*[@id='90']/span") private static WebElement
	 * convertMaturedPDCs;
	 * 
	 * @FindBy(xpath="//*[@id='161']/span") private static WebElement
	 * assignPDCLimit;
	 * 
	 * @FindBy(xpath="//*[@id='166']/span") private static WebElement
	 * stockReplenishment;
	 * 
	 * @FindBy(xpath="//*[@id='62']/span") private static WebElement
	 * financialsCreditManagementMenu;
	 * 
	 * @FindBy(xpath="//*[@id='63']/span") private static WebElement paymentTerms;
	 * 
	 * @FindBy(xpath="//*[@id='64']/span") private static WebElement financeTerms;
	 * 
	 * @FindBy(xpath="//*[@id='65']/span") private static WebElement reminderTerms;
	 * 
	 * @FindBy(xpath="//*[@id='89']/span") private static WebElement sendReminder;
	 * 
	 * @FindBy(xpath="//*[@id='217']/span") private static WebElement delinquency;
	 * 
	 * @FindBy(xpath="//*[@id='73']/span") private static WebElement questionnarie;
	 * 
	 * @FindBy(xpath="//*[@id='218']/span") private static WebElement
	 * delinquencyMgmt;
	 * 
	 * @FindBy(xpath="//*[@id='35']/span") private static WebElement creidtApproval;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //Inventory *************************
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_135']/a/i") private static WebElement
	 * inventoryExpandBtn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_139']/a/i") private static WebElement
	 * inventoryPurchasesBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_140']/a/i") private static WebElement
	 * inventorySalesBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_2033']/a/i") private static WebElement
	 * stocksBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_200']/a/i") private static WebElement
	 * inventoryReportsExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_540']/a/i") private static WebElement
	 * binsReportBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_621']/a/i") private static WebElement
	 * stockAgeingAnalysisBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_550']/a/i") private static WebElement
	 * ordermanagementExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_600']/a/i") private static WebElement
	 * analysisOfLinkedUnlinkedDocumentsBtn;
	 * 
	 * //Fixed Asset************************
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_136']/a/i") private static WebElement
	 * fixedAssetExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_138']/a/i") private static WebElement
	 * fixedAssetTransactionExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_50010']/a/i") private static WebElement
	 * fixedAssetReportsBtn;
	 * 
	 * //Production ***********************
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_3000']/a/i") private static WebElement
	 * productionExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_3001']/a/i") private static WebElement
	 * productionTransactionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_625']/a/i") private static WebElement
	 * productionReportBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_3006']/a/i") private static WebElement
	 * mrpSettingsBtn;
	 * 
	 * //Point Of Sale ***********************************
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8000']/a/i") private static WebElement
	 * pointofSale_ExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8004']/a/i") private static WebElement
	 * mainScreenBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8500']/a/i") private static WebElement
	 * posReportsExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8501']/a/i") private static WebElement
	 * retailSaleReportBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8507']/a/i") private static WebElement
	 * summarysalesReportBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8513']/a/i") private static WebElement
	 * preOrderReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8523']/a/i") private static WebElement
	 * memberReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8530']/a/i") private static WebElement
	 * memberPointsReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8535']/a/i") private static WebElement
	 * itemReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8540']/a/i") private static WebElement
	 * cashReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8545']/a/i") private static WebElement
	 * stockReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8550']/a/i") private static WebElement
	 * periodicSalesReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8556']/a/i") private static WebElement
	 * lastYearComaprisionReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8562']/a/i") private static WebElement
	 * miscellaneousReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8571']/a/i") private static WebElement
	 * restaurantReportsBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8900']/a/i") private static WebElement
	 * reportsTableManagementBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8003']/a/i") private static WebElement
	 * utilitiesExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_8027']/a/i") private static WebElement
	 * bbqConversionBtn;
	 * 
	 * 
	 * //Quality Control *****************
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_150']/a/i") private static WebElement
	 * qualityControlExpandBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_151']/a/i") private static WebElement
	 * qualityControlTransactionBtn;
	 * 
	 * @FindBy(xpath="//*[@id='id_menu_tree_152']/a/i") private static WebElement
	 * qualityControlReportsBtn;
	 * 
	 * 
	 * 
	 * // Views Tab
	 * 
	 * 
	 * @FindBy(xpath="//span[@class='icon-views'") private static WebElement
	 * viewsTab;
	 * 
	 * 
	 * 
	 * //Export Fields
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Export Fields')]") private static
	 * WebElement exportFieldsTab;
	 * 
	 * //Triggers
	 * 
	 * @FindBy(xpath="//span[@class='icon-trigger icon-font7']") private static
	 * WebElement triggersTab;
	 * 
	 * //Document Numbering
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Document Numbering')]") private static
	 * WebElement documentNumberingTab;
	 * 
	 * //Hire Purchase
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Hire Purchase')]") private static
	 * WebElement hirePurchasetab;
	 * 
	 * 
	 * 
	 * //Reports Tab
	 * 
	 * @FindBy(xpath="//span[@class='icon-text70 icon-font7']") private static
	 * WebElement reportsTab;
	 * 
	 * //Schemes
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Schemes')]") private static WebElement
	 * schemestab;
	 * 
	 * 
	 * 
	 * 
	 * ////////////////////
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Inventory')]") private static
	 * WebElement inventoryMenu;
	 * 
	 * @FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	 * private static WebElement invTransactionsMenu;
	 * 
	 * @FindBy(xpath="//*[@id='139']/span") private static WebElement
	 * invTransPurchasesMenu;
	 * 
	 * @FindBy(xpath="//*[@id='2010']/span") private static WebElement
	 * requestForQuoteVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2011']/span") private static WebElement
	 * purchasesQuotationsVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2012']/span") private static WebElement
	 * purchasesOrdersVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2013']/span") private static WebElement
	 * materialReceiptNotesVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='140']/span") private static WebElement
	 * invTransSalesMenu;
	 * 
	 * @FindBy(xpath="//*[@id='2018']/span") private static WebElement
	 * salesQuotationsVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2019']/span") private static WebElement
	 * deliveryNotesVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2022']/span") private static WebElement
	 * posSalesVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2045']/span") private static WebElement
	 * productionOrdersVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2017']/span") private static WebElement
	 * salesOrdersVoucher;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='2034']/span") private static WebElement
	 * shortagesInStockVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2035']/span") private static WebElement
	 * excessesInStocksVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2036']/span") private static WebElement
	 * stockTransfersVoucher;
	 * 
	 * @FindBy(xpath="//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
	 * private static WebElement openingStocksVoucher;
	 * 
	 * @FindBy(xpath="//a[@id='2049']//span[contains(text(),'Opening Stocks New')]")
	 * private static WebElement openingStocksNEWVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2038']/span") private static WebElement
	 * materialRequisitionVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='2049']/span") private static WebElement
	 * stockAdjustmentVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='164']/span") private static WebElement
	 * holdAndUnholdStockVoucher;
	 * 
	 * @FindBy(xpath="//*[@id='93']/span") private static WebElement
	 * stockReconciliation;
	 * 
	 * @FindBy(xpath="//*[@id='99']/span") private static WebElement
	 * stockAllocation;
	 * 
	 * @FindBy(xpath="//a[@id='200']//span[contains(text(),'Reports')]") private
	 * static WebElement inventoryReportsMenu;
	 * 
	 * @FindBy(xpath="//a[@id='202']//span[contains(text(),'Item Query')]") private
	 * static WebElement itemQuery;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Stock Ledger')]") private static
	 * WebElement stockLedger;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Opening Stocks Register')]") private
	 * static WebElement openingStocksRegister;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Stock Statement')]") private static
	 * WebElement stockStatement;
	 * 
	 * @FindBy(xpath="//a[@id='575']//span[contains(text(),'Stock Movement')]")
	 * private static WebElement stockMovement;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Multi Level Stock Movement')]")
	 * private static WebElement multiLevelStockMovement;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Virtual Stock Analysis')]") private
	 * static WebElement virtualStockAnalysis;
	 * 
	 * @FindBy(xpath="//a[@id='578']") private static WebElement stockValuation;
	 * 
	 * @FindBy(xpath="//a[@id='656']") private static WebElement stockReportByTag;
	 * 
	 * @FindBy(xpath="//a[@id='579']//span[contains(text(),'ABC Analysis')]")
	 * private static WebElement abcAnalysis;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Stock Analysis by Batch')]") private
	 * static WebElement stockAnalysisByBatch;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Stock Analysis by RMA')]") private
	 * static WebElement stockAnalysisByRMA;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Bins Report')]") private static
	 * WebElement binsReportMenu;
	 * 
	 * @FindBy(xpath="//*[@id='587']/span") private static WebElement
	 * stockDetailsByBins;
	 * 
	 * @FindBy(xpath="//*[@id='588']/span") private static WebElement
	 * stockBalancesByBins;
	 * 
	 * @FindBy(xpath="//*[@id='589']/span") private static WebElement
	 * stockBalancesByItemByBins;
	 * 
	 * @FindBy(xpath="//*[@id='590']/span") private static WebElement
	 * expiredStockByBins;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Stock balance by warehouse')]")
	 * private static WebElement stockBalanceByWarehouse;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Stock ageing analysis')]") private
	 * static WebElement stockAgeingAnalysisMenu;
	 * 
	 * @FindBy(xpath="//*[@id='582']/span") private static WebElement
	 * ageingAnalysis;
	 * 
	 * @FindBy(xpath="//*[@id='622']/span") private static WebElement
	 * ageingAnalysisByBatch;
	 * 
	 * @FindBy(xpath="//*[@id='623']/span") private static WebElement
	 * ageingAnalysisByRMA;
	 * 
	 * @FindBy(xpath="//*[@id='591']/span") private static WebElement
	 * ageingStockByBins;
	 * 
	 * @FindBy(xpath="//*[@id='646']/span") private static WebElement
	 * ageingByItemByBins;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Reorder Report')]") private static
	 * WebElement reorderReport;
	 * 
	 * @FindBy(xpath="//a[@id='584']//span[contains(text(),'Fast Moving Item')]")
	 * private static WebElement fastMovingItem;
	 * 
	 * @FindBy(xpath="//a[@id='585']//span[contains(text(),'Slow Moving Item')]")
	 * private static WebElement slowMovingItem;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Peak/Low Balances')]") private static
	 * WebElement peakORLowBalances;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Best Selling Item')]") private static
	 * WebElement bestSellingItem;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Raise Indent Item with Low Stock')]")
	 * private static WebElement raiseIndentItemWithLowStock;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Stock transfer report')]") private
	 * static WebElement stockTransferReport;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Raise request for quote')]") private
	 * static WebElement raiseRequestForQuote;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Stock reservation report')]") private
	 * static WebElement stockReservationReport;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Transaction type-wise stock report')]"
	 * ) private static WebElement transactionTypeWiseStockReport;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Order Management')]") private static
	 * WebElement orderManagementMenu;
	 * 
	 * @FindBy(xpath="//*[@id='600']/span") private static WebElement
	 * analysisOfLinkedORUnlinkedDocumentsMenu;
	 * 
	 * @FindBy(xpath="//*[@id='601']/span") private static WebElement
	 * listingOfDocuments;
	 * 
	 * @FindBy(xpath="//*[@id='602']/span") private static WebElement
	 * listingOfDocumentsByDueDate;
	 * 
	 * @FindBy(xpath="//*[@id='603']/span") private static WebElement
	 * ageingOfPendingDocuments;
	 * 
	 * @FindBy(xpath="//*[@id='604']/span") private static WebElement
	 * ageingofPendingDocumentsByDueDate;
	 * 
	 * @FindBy(xpath="//*[@id='624']/span") private static WebElement
	 * linkChainAnalysis;
	 * 
	 * @FindBy(xpath="//*[@id='657']/span") private static WebElement
	 * pendingVoucherReport;
	 * 
	 * @FindBy(xpath="//*[@id='201']/span") private static WebElement
	 * quotationAnalysis;
	 * 
	 * @FindBy(xpath="//*[@id='555']/span") private static WebElement
	 * purchasesQuotation;
	 * 
	 * @FindBy(xpath="//*[@id='556']/span") private static WebElement
	 * salesQuotation;
	 * 
	 * @FindBy(xpath="//*[@id='574']/span") private static WebElement
	 * lowestQuotation;
	 * 
	 * @FindBy(xpath="//*[@id='553']/span") private static WebElement
	 * purchasesOrders;
	 * 
	 * @FindBy(xpath="//*[@id='554']/span") private static WebElement salesOrders;
	 * 
	 * ///////////////////////////////////////////////////////////////////
	 * 
	 * 
	 * // Item Query Elements
	 * 
	 * @FindBy(xpath="//input[@id='productQuery']") private static WebElement
	 * IQ_ItemTxt;
	 * 
	 * @FindBy(xpath="//button[contains(text(),'GetStock')]") private static
	 * WebElement IQ_getStockBtn;
	 * 
	 * @FindBy(xpath="//button[contains(text(),'Customize')]") private static
	 * WebElement IQ_customizeBtn;
	 * 
	 * @FindBy(xpath="//span[@id='id_productquery_button_clear']") private static
	 * WebElement IQ_clearBtn;
	 * 
	 * @FindBy(xpath="//span[@id='id_productquery_button_close']") private static
	 * WebElement IQ_closeBtn;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Opening Stock Quantity:')]") private
	 * static WebElement IQ_OpeningStockQtyLable;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Pending purchases orders :')]")
	 * private static WebElement IQ_PendingPurchaseOrdersLable;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Current Stock :')]") private static
	 * WebElement IQ_CurrentStockLable;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Pending Sales Orders :')]") private
	 * static WebElement IQ_PendingSalesOrdersLable;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Avg. Stock Rate :')]") private static
	 * WebElement IQ_AvgStockRateLable;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Qty to be Ordered :')]") private
	 * static WebElement IQ_QtytobeOrderedLable;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Base Unit :')]") private static
	 * WebElement IQ_BaseUnitLable;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Value :')]") private static
	 * WebElement IQ_ValueLable;
	 * 
	 * @FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Date')]")
	 * private static WebElement IQ_PurDate;
	 * 
	 * @FindBy(
	 * xpath="//table[@id='purchaseTable']//th[contains(text(),'Voucher No')]")
	 * private static WebElement IQ_PurVoucherNo;
	 * 
	 * @FindBy(xpath="//th[contains(text(),'Vendor')]") private static WebElement
	 * IQ_PurVendor;
	 * 
	 * @FindBy(xpath=
	 * "//table[@id='purchaseTable']//th[contains(text(),'Quantity')]") private
	 * static WebElement IQ_PurQty;
	 * 
	 * @FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Rate')]")
	 * private static WebElement IQ_PurRate;
	 * 
	 * @FindBy(xpath=
	 * "//table[@id='purchaseTable']//th[contains(text(),'Currency')]") private
	 * static WebElement IQ_PurCurrency;
	 * 
	 * @FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Date')]")
	 * private static WebElement IQ_SaleDate;
	 * 
	 * @FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Voucher No')]")
	 * private static WebElement IQ_SaleVoucherNo;
	 * 
	 * @FindBy(xpath="//th[contains(text(),'Customer')]") private static WebElement
	 * IQ_SaleCustomer;
	 * 
	 * @FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Quantity')]")
	 * private static WebElement IQ_SaleQty;
	 * 
	 * @FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Rate')]")
	 * private static WebElement IQ_SaleRate;
	 * 
	 * @FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Currency')]")
	 * private static WebElement IQ_SaleCurrency;
	 * 
	 * @FindBy(xpath="//span[@id='openingStock']") private static WebElement
	 * IQ_OpeningStockQuantity;
	 * 
	 * @FindBy(xpath="//span[@id='currentStock']") private static WebElement
	 * IQ_CurrentStock;
	 * 
	 * @FindBy(xpath="//span[@id='avgStockRate']") private static WebElement
	 * IQ_AvgStockRate;
	 * 
	 * @FindBy(xpath="//span[@id='value']") private static WebElement IQ_Value;
	 * 
	 * @FindBy(xpath="//span[@id='iBaseUnit']") private static WebElement
	 * IQ_BaseUnit;
	 * 
	 * @FindBy(xpath="//span[@id='purchaseOrdered']") private static WebElement
	 * IQ_PendingPurchaseOrders;
	 * 
	 * @FindBy(xpath="//span[@id='salesOrdered']") private static WebElement
	 * IQ_PendingSalesOrders;
	 * 
	 * @FindBy(xpath="//span[@id='quantityToBeOrdered']") private static WebElement
	 * IQ_QtyToBeOrdered;
	 * 
	 * 
	 * // Purchase Table
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[1]") private static
	 * WebElement Pur1strow_1stColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[2]") private static
	 * WebElement Pur1strow_2ndColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[3]") private static
	 * WebElement Pur1strow_3rdColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[4]") private static
	 * WebElement Pur1strow_4thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[5]") private static
	 * WebElement Pur1strow_5thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[6]") private static
	 * WebElement Pur1strow_6thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[1]") private static
	 * WebElement Pur2ndrow_1stColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[2]") private static
	 * WebElement Pur2ndrow_2ndColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[3]") private static
	 * WebElement Pur2ndrow_3rdColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[4]") private static
	 * WebElement Pur2ndrow_4thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[5]") private static
	 * WebElement Pur2ndrow_5thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[6]") private static
	 * WebElement Pur2ndrow_6thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[1]") private static
	 * WebElement Pur3rdrow_1stColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[2]") private static
	 * WebElement Pur3rdrow_2ndColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[3]") private static
	 * WebElement Pur3rdrow_3rdColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[4]") private static
	 * WebElement Pur3rdrow_4thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[5]") private static
	 * WebElement Pur3rdrow_5thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[6]") private static
	 * WebElement Pur3rdrow_6thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//td[contains(text(),'Quantity Purchased Till Date:')]")
	 * private static WebElement QtyPurchasedTillDate;
	 * 
	 * @FindBy(xpath="//div[@class='form-group col-xs-12']//tr[4]//td[2]") private
	 * static WebElement PurTotal;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']//tr[1]/td[2]") private static
	 * WebElement IQ_WH1stRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']//tr[1]/td[3]") private static
	 * WebElement IQ_WH1stRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']//tr[1]/td[4]") private static
	 * WebElement IQ_WH1stRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']//tr[1]/td[5]") private static
	 * WebElement IQ_WH1stRow4thCol;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']//tr[2]/td[2]") private static
	 * WebElement IQ_WH2ndRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']//tr[2]/td[3]") private static
	 * WebElement IQ_WH2ndRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']//tr[2]/td[4]") private static
	 * WebElement IQ_WH2ndRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']//tr[2]/td[5]") private static
	 * WebElement IQ_WH2ndRow4thCol;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[1]/td[2]") private static
	 * WebElement iq_Bin1stRow1stCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[1]/td[3]") private static
	 * WebElement iq_Bin1stRow2ndCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[1]/td[4]") private static
	 * WebElement iq_Bin1stRow3rdCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[1]/td[5]") private static
	 * WebElement iq_Bin1stRow4thCol;
	 * 
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[2]/td[2]") private static
	 * WebElement iq_Bin2ndRow1stCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[2]/td[3]") private static
	 * WebElement iq_Bin2ndRow2ndCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[2]/td[4]") private static
	 * WebElement iq_Bin2ndRow3rdCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[2]/td[5]") private static
	 * WebElement iq_Bin2ndRow4thCol;
	 * 
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[3]/td[2]") private static
	 * WebElement iq_Bin3rdRow1stCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[3]/td[3]") private static
	 * WebElement iq_Bin3rdRow2ndCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[3]/td[4]") private static
	 * WebElement iq_Bin3rdRow3rdCol;
	 * 
	 * @FindBy(xpath="//table[@id='BinTableData']//tr[3]/td[5]") private static
	 * WebElement iq_Bin3rdRow4thCol;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='1']/td[2]") private static WebElement
	 * WH1strow_2ndColumn;
	 * 
	 * @FindBy(xpath="//*[@id='1']/td[3]") private static WebElement
	 * WH1strow_3rdColumn;
	 * 
	 * @FindBy(xpath="//*[@id='1']/td[4]") private static WebElement
	 * WH1strow_4thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='1']/td[5]") private static WebElement
	 * WH1strow_5thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='1']/td[6]") private static WebElement
	 * WH1strow_6thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='2']/td[2]") private static WebElement
	 * WH2ndrow_2ndColumn;
	 * 
	 * @FindBy(xpath="//*[@id='2']/td[3]") private static WebElement
	 * WH2ndrow_3rdColumn;
	 * 
	 * @FindBy(xpath="//*[@id='2']/td[4]") private static WebElement
	 * WH2ndrow_4thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='2']/td[5]") private static WebElement
	 * WH2ndrow_5thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='2']/td[6]") private static WebElement
	 * WH2ndrow_6thColumn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='7']/td[2]") private static WebElement
	 * WH3rdrow_2ndColumn;
	 * 
	 * @FindBy(xpath="//*[@id='7']/td[3]") private static WebElement
	 * WH3rdrow_3rdColumn;
	 * 
	 * @FindBy(xpath="//*[@id='7']/td[4]") private static WebElement
	 * WH3rdrow_4thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='7']/td[5]") private static WebElement
	 * WH3rdrow_5thColumn;
	 * 
	 * @FindBy(xpath="//*[@id='7']/td[6]") private static WebElement
	 * WH3rdrow_6thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[4]/td[2]") private static
	 * WebElement WHStockTotal;
	 * 
	 * @FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[4]/td[4]") private static
	 * WebElement WHValueTotal;
	 * 
	 * // Balance by bins
	 * 
	 * @FindBy (xpath="//div[@id='PrdtDetails']/div[4]/div/span") private static
	 * WebElement BalancebyBinsExpandBtn;
	 * 
	 * 
	 * @FindBy (xpath="//span[@id='ProdQuery_ShowSellandBuyRatesPopup']") private
	 * static WebElement sellingRatesAndBuyingRateExpansionBtn;
	 * 
	 * ///////////////////////////////////////
	 * 
	 * 
	 * 
	 * // Stock Ledger Elements
	 * 
	 * @FindBy(xpath="//div[@id='spnhiererchy']//select[@id='iTreeId']") private
	 * static WebElement sl_Dropdown1;
	 * 
	 * @FindBy(xpath="//div[@id='spnhiererchy']//select[@id='iTreeViewId']") private
	 * static WebElement sl_Dropdown2;
	 * 
	 * @FindBy(xpath="//label[@id='oncheckaccorderan']") private static WebElement
	 * sl_oncheckBtn;
	 * 
	 * @FindBy(xpath="//input[@id='txtsrch-term']") private static WebElement
	 * sl_SearchItemTxt;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-search theme_color-inverse')]")
	 * private static WebElement sl_SearchBtn;
	 * 
	 * @FindBy(xpath="//input[@id='cmbUserTypeMaster']") private static WebElement
	 * sl_MasterTypeTxt;
	 * 
	 * @FindBy(
	 * xpath="//span[contains(@class,'icon-font6 icon-external-module theme_icon-color')]"
	 * ) private static WebElement sl_AutoAdjustColumnsBtn;
	 * 
	 * @FindBy(
	 * xpath="//a[contains(@class,'clsMasterName')][contains(text(),'ITEMS GROUP')]"
	 * ) private static WebElement sl_SearchItemTxt;
	 * 
	 * @FindBy(xpath="//input[@id='txtsrch-term']") private static WebElement
	 * sl_SearhItemTxt;
	 * 
	 * @FindBy(
	 * xpath="//a[contains(@class,'clsMasterName')][contains(text(),'ITEMS GROUP')]"
	 * ) private static WebElement sl_ItemGroupsBtn;
	 * 
	 * @FindBy(xpath="//input[@id='liSelectAllMasters']") private static WebElement
	 * sl_HeaderSelectChkBox;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-font6 icon-schedule')]") private
	 * static WebElement sl_ScheduleBtn;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-font6 icon-custamize')]") private
	 * static WebElement sl_CustomizeBtn;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-font6 icon-filter')]") private
	 * static WebElement sl_FilterBtn;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-font6 icon-ok')]") private static
	 * WebElement sl_OkBtn;
	 * 
	 * @FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]") private static
	 * WebElement sl_CloseBtn;
	 * 
	 * @FindBy(xpath="//select[@id='DateOptions_']") private static WebElement
	 * sl_DateOptionDropdown;
	 * 
	 * @FindBy(xpath="//input[@id='id_starting_date_']") private static WebElement
	 * sl_StartDateTxt;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='id_starting_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]"
	 * ) private static WebElement sl_StartDateCalanderBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_ending_date_']") private static WebElement
	 * sl_EndDateTxt;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='id_ending_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]"
	 * ) private static WebElement sl_EndDateCalanderBtn;
	 * 
	 * @FindBy(xpath="//*[@id='MasterSingle__101']") private static WebElement
	 * sl_WarehouseTxt;
	 * 
	 * @FindBy(xpath="//*[@id='MasterGroup__101']") private static WebElement
	 * sl_AgeingAnalysisWarehouseTxt;
	 * 
	 * @FindBy(xpath="//*[@id='RITCheckbox__6']") private static WebElement
	 * sl_IgnoreInternalTransferForAgeingChkbox;
	 * 
	 * @FindBy(xpath="//*[@id='RITCombobox__2']") private static WebElement
	 * sl_ReportingLevelDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='RITCheckbox__4']") private static WebElement
	 * sl_DisplayLinearReportChkbox;
	 * 
	 * @FindBy(xpath="//*[@id='RITCombobox__1']") private static WebElement
	 * sl_StockValuationDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='RITCombobox__1']") private static WebElement
	 * sl_StockTypeDropdown;
	 * 
	 * @FindBy(xpath="//input[@id='RITCheckbox__3']") private static WebElement
	 * sl_IncludeServiceTypeItemChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='RITCheckbox__9']") private static WebElement
	 * sl_AgeingIncludeServiceTypeItemChkBox;
	 * 
	 * @FindBy(xpath="//select[@id='RITLayout_']") private static WebElement
	 * sl_LayoutDropdown;
	 * 
	 * @FindBy(xpath="//select[@id='RITOutput_']") private static WebElement
	 * sl_OutputDropdown;
	 * 
	 * 
	 * 
	 * @FindBy(
	 * xpath="//div[contains(@class,'first')]//input[contains(@class,'btn btn-xs Fbutton')]"
	 * ) private static WebElement sl_FirstBtn;
	 * 
	 * @FindBy(
	 * xpath="//div[contains(@class,'prev')]//input[contains(@class,'btn btn-xs Fbutton')]"
	 * ) private static WebElement sl_PreviousBtn;
	 * 
	 * @FindBy(xpath="//input[@id='btn1']") private static WebElement sl_PageBtn;
	 * 
	 * @FindBy(
	 * xpath="//div[contains(@class,'next')]//input[contains(@class,'btn btn-xs Fbutton')]"
	 * ) private static WebElement sl_NextBtn;
	 * 
	 * @FindBy(
	 * xpath="//div[contains(@class,'End')]//input[contains(@class,'btn btn-xs Fbutton')]"
	 * ) private static WebElement sl_EndBtn;
	 * 
	 * @FindBy(xpath="//tr[1]//td[8]//div[1]//label[1]//input") private static
	 * WebElement sl_1stRowChkBox;
	 * 
	 * @FindBy(xpath="//tr[2]//td[8]//div[1]//label[1]//input") private static
	 * WebElement sl_2ndRowChkBox;
	 * 
	 * @FindBy(xpath="//tr[3]//td[8]//div[1]//label[1]//input") private static
	 * WebElement sl_3rdRowChkBox;
	 * 
	 * @FindBy(xpath="//tr[4]//td[8]//div[1]//label[1]//input") private static
	 * WebElement sl_4thRowChkBox;
	 * 
	 * 
	 * ////////
	 * 
	 * @FindBy(xpath="//span[@id='reportSort']") private static WebElement
	 * report_sortingBtn;
	 * 
	 * @FindBy(xpath="//span[@id='reportRefresh']") private static WebElement
	 * report_RefreshBtn;
	 * 
	 * @FindBy(xpath="//span[@id='print_report_']") private static WebElement
	 * report_PrintBtn;
	 * 
	 * @FindBy(xpath="//span[@class='dropdown']") private static WebElement
	 * report_ExportBtn;
	 * 
	 * @FindBy(xpath="//span[@id='GraphIcon']") private static WebElement
	 * report_GraphBtn;
	 * 
	 * @FindBy(xpath="//span[@id='BackTrackIcon']") private static WebElement
	 * report_BackTrackBtn;
	 * 
	 * @FindBy(xpath="//span[@id='reportCustomize']") private static WebElement
	 * report_ReportCustomizeBtn;
	 * 
	 * @FindBy(xpath="//span[@id='filterIcon']") private static WebElement
	 * report_FilterBtn;
	 * 
	 * @FindBy(
	 * xpath="//div[@id='dvfilter']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]"
	 * ) private static WebElement report_FilterDownBtn;
	 * 
	 * @FindBy(xpath="//span[@id='analyzeIcon']") private static WebElement
	 * report_AnalyzeBtn;
	 * 
	 * @FindBy(xpath="//span[@id='CrossrefrenceIcon']") private static WebElement
	 * report_CrossReferenceBtn;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Options')]") private static WebElement
	 * report_OptionsBtn;
	 * 
	 * @FindBy(
	 * xpath="//div[@id='dvoptions']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]"
	 * ) private static WebElement report_OptionsDownBtn;
	 * 
	 * @FindBy(xpath="//span[@id='reportClose_']//i[@class='icon-font6 icon-close']"
	 * ) private static WebElement report_CloseBtn;
	 * 
	 * @FindBy(xpath="//button[@id='frstPage_']") private static WebElement
	 * report_FirstBtn;
	 * 
	 * @FindBy(xpath="//button[@id='prvPage_']") private static WebElement
	 * report_PreviousBtn;
	 * 
	 * @FindBy(xpath="//button[@id='pgnumber_']") private static WebElement
	 * report_PageNoBtn;
	 * 
	 * @FindBy(xpath="//button[@id='nxtPage_']") private static WebElement
	 * report_NextBtn;
	 * 
	 * @FindBy(xpath="//button[@id='lstPage_']") private static WebElement
	 * report_LastBtn;
	 * 
	 * @FindBy(xpath="//input[@id='txtSearchReport']") private static WebElement
	 * report_SearchTxt;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[1]") private static WebElement
	 * sl_1stRow1stCol;
	 * 
	 * @FindBy(xpath=
	 * "//body[1]/section[1]/div[2]/div[1]/section[1]/section[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	 * private static WebElement sl_1stRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[3]") private static WebElement
	 * sl_1stRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[4]") private static WebElement
	 * sl_1stRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[5]") private static WebElement
	 * sl_1stRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[6]") private static WebElement
	 * sl_1stRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[7]") private static WebElement
	 * sl_1stRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[8]") private static WebElement
	 * sl_1stRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[9]") private static WebElement
	 * sl_1stRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[10]") private static WebElement
	 * sl_1stRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[11]") private static WebElement
	 * sl_1stRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[12]") private static WebElement
	 * sl_1stRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[13]") private static WebElement
	 * sl_1stRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[14]") private static WebElement
	 * sl_1stRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[15]") private static WebElement
	 * sl_1stRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[16]") private static WebElement
	 * sl_1stRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[17]") private static WebElement
	 * sl_1stRow17thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[18]") private static WebElement
	 * sl_1stRow18thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[19]") private static WebElement
	 * sl_1stRow19thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_1']/td[20]") private static WebElement
	 * sl_1stRow20thCol;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[1]") private static WebElement
	 * sl_2ndRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[2]") private static WebElement
	 * sl_2ndRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[3]") private static WebElement
	 * sl_2ndRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[4]") private static WebElement
	 * sl_2ndRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[5]") private static WebElement
	 * sl_2ndRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[6]") private static WebElement
	 * sl_2ndRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[7]") private static WebElement
	 * sl_2ndRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[8]") private static WebElement
	 * sl_2ndRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[9]") private static WebElement
	 * sl_2ndRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[10]") private static WebElement
	 * sl_2ndRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[11]") private static WebElement
	 * sl_2ndRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[12]") private static WebElement
	 * sl_2ndRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[13]") private static WebElement
	 * sl_2ndRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[14]") private static WebElement
	 * sl_2ndRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[15]") private static WebElement
	 * sl_2ndRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[16]") private static WebElement
	 * sl_2ndRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[17]") private static WebElement
	 * sl_2ndRow17thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[18]") private static WebElement
	 * sl_2ndRow18thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[19]") private static WebElement
	 * sl_2ndRow19thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_2']/td[20]") private static WebElement
	 * sl_2ndRow20thCol;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[1]") private static WebElement
	 * sl_3rdRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[2]") private static WebElement
	 * sl_3rdRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[3]") private static WebElement
	 * sl_3rdRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[4]") private static WebElement
	 * sl_3rdRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[5]") private static WebElement
	 * sl_3rdRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[6]") private static WebElement
	 * sl_3rdRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[7]") private static WebElement
	 * sl_3rdRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[8]") private static WebElement
	 * sl_3rdRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[9]") private static WebElement
	 * sl_3rdRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[10]") private static WebElement
	 * sl_3rdRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[11]") private static WebElement
	 * sl_3rdRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[12]") private static WebElement
	 * sl_3rdRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[13]") private static WebElement
	 * sl_3rdRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[14]") private static WebElement
	 * sl_3rdRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[15]") private static WebElement
	 * sl_3rdRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[16]") private static WebElement
	 * sl_3rdRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[17]") private static WebElement
	 * sl_3rdRow17thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[18]") private static WebElement
	 * sl_3rdRow18thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[19]") private static WebElement
	 * sl_3rdRow19thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_3']/td[20]") private static WebElement
	 * sl_3rdRow20thCol;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[1]") private static WebElement
	 * sl_4thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[2]") private static WebElement
	 * sl_4thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[3]") private static WebElement
	 * sl_4thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[4]") private static WebElement
	 * sl_4thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[5]") private static WebElement
	 * sl_4thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[6]") private static WebElement
	 * sl_4thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[7]") private static WebElement
	 * sl_4thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[8]") private static WebElement
	 * sl_4thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[9]") private static WebElement
	 * sl_4thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[10]") private static WebElement
	 * sl_4thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[11]") private static WebElement
	 * sl_4thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[12]") private static WebElement
	 * sl_4thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[13]") private static WebElement
	 * sl_4thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[14]") private static WebElement
	 * sl_4thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[15]") private static WebElement
	 * sl_4thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[16]") private static WebElement
	 * sl_4thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[17]") private static WebElement
	 * sl_4thRow17thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[18]") private static WebElement
	 * sl_4thRow18thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[19]") private static WebElement
	 * sl_4thRow19thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_4']/td[20]") private static WebElement
	 * sl_4thRow20thCol;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[1]") private static WebElement
	 * sl_5thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[2]") private static WebElement
	 * sl_5thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[3]") private static WebElement
	 * sl_5thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[4]") private static WebElement
	 * sl_5thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[5]") private static WebElement
	 * sl_5thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[6]") private static WebElement
	 * sl_5thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[7]") private static WebElement
	 * sl_5thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[8]") private static WebElement
	 * sl_5thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[9]") private static WebElement
	 * sl_5thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[10]") private static WebElement
	 * sl_5thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[11]") private static WebElement
	 * sl_5thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[12]") private static WebElement
	 * sl_5thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[13]") private static WebElement
	 * sl_5thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[14]") private static WebElement
	 * sl_5thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[15]") private static WebElement
	 * sl_5thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[16]") private static WebElement
	 * sl_5thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[17]") private static WebElement
	 * sl_5thRow17thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[18]") private static WebElement
	 * sl_5thRow18thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[19]") private static WebElement
	 * sl_5thRow19thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_5']/td[20]") private static WebElement
	 * sl_5thRow20thCol;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[1]") private static WebElement
	 * sl_6thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[2]") private static WebElement
	 * sl_6thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[3]") private static WebElement
	 * sl_6thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[4]") private static WebElement
	 * sl_6thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[5]") private static WebElement
	 * sl_6thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[6]") private static WebElement
	 * sl_6thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[7]") private static WebElement
	 * sl_6thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[8]") private static WebElement
	 * sl_6thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[9]") private static WebElement
	 * sl_6thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[10]") private static WebElement
	 * sl_6thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[11]") private static WebElement
	 * sl_6thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[12]") private static WebElement
	 * sl_6thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[13]") private static WebElement
	 * sl_6thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[14]") private static WebElement
	 * sl_6thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[15]") private static WebElement
	 * sl_6thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[16]") private static WebElement
	 * sl_6thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[17]") private static WebElement
	 * sl_6thRow17thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[18]") private static WebElement
	 * sl_6thRow18thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[19]") private static WebElement
	 * sl_6thRow19thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_6']/td[20]") private static WebElement
	 * sl_6thRow20thCol;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[1]") private static WebElement
	 * sl_7thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[2]") private static WebElement
	 * sl_7thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[3]") private static WebElement
	 * sl_7thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[4]") private static WebElement
	 * sl_7thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[5]") private static WebElement
	 * sl_7thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[6]") private static WebElement
	 * sl_7thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[7]") private static WebElement
	 * sl_7thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[8]") private static WebElement
	 * sl_7thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[9]") private static WebElement
	 * sl_7thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[10]") private static WebElement
	 * sl_7thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[11]") private static WebElement
	 * sl_7thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[12]") private static WebElement
	 * sl_7thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[13]") private static WebElement
	 * sl_7thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[14]") private static WebElement
	 * sl_7thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[15]") private static WebElement
	 * sl_7thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[16]") private static WebElement
	 * sl_7thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_7']/td[17]") private static WebElement
	 * sl_7thRow17thCol;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[1]") private static WebElement
	 * sl_8thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[2]") private static WebElement
	 * sl_8thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[3]") private static WebElement
	 * sl_8thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[4]") private static WebElement
	 * sl_8thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[5]") private static WebElement
	 * sl_8thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[6]") private static WebElement
	 * sl_8thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[7]") private static WebElement
	 * sl_8thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[8]") private static WebElement
	 * sl_8thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[9]") private static WebElement
	 * sl_8thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[10]") private static WebElement
	 * sl_8thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[11]") private static WebElement
	 * sl_8thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[12]") private static WebElement
	 * sl_8thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[13]") private static WebElement
	 * sl_8thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[14]") private static WebElement
	 * sl_8thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[15]") private static WebElement
	 * sl_8thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[16]") private static WebElement
	 * sl_8thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_8']/td[17]") private static WebElement
	 * sl_8thRow17thCol;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[1]") private static WebElement
	 * sl_9thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[2]") private static WebElement
	 * sl_9thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[3]") private static WebElement
	 * sl_9thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[4]") private static WebElement
	 * sl_9thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[5]") private static WebElement
	 * sl_9thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[6]") private static WebElement
	 * sl_9thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[7]") private static WebElement
	 * sl_9thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[8]") private static WebElement
	 * sl_9thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[9]") private static WebElement
	 * sl_9thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[10]") private static WebElement
	 * sl_9thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[11]") private static WebElement
	 * sl_9thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[12]") private static WebElement
	 * sl_9thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[13]") private static WebElement
	 * sl_9thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[14]") private static WebElement
	 * sl_9thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[15]") private static WebElement
	 * sl_9thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[16]") private static WebElement
	 * sl_9thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_9']/td[17]") private static WebElement
	 * sl_9thRow17thCol;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[1]") private static WebElement
	 * sl_10thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[2]") private static WebElement
	 * sl_10thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[3]") private static WebElement
	 * sl_10thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[4]") private static WebElement
	 * sl_10thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[5]") private static WebElement
	 * sl_10thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[6]") private static WebElement
	 * sl_10thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[7]") private static WebElement
	 * sl_10thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[8]") private static WebElement
	 * sl_10thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[9]") private static WebElement
	 * sl_10thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[10]") private static WebElement
	 * sl_10thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[11]") private static WebElement
	 * sl_10thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[12]") private static WebElement
	 * sl_10thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[13]") private static WebElement
	 * sl_10thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[14]") private static WebElement
	 * sl_10thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[15]") private static WebElement
	 * sl_10thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[16]") private static WebElement
	 * sl_10thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_10']/td[17]") private static WebElement
	 * sl_10thRow17thCol;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[1]") private static WebElement
	 * sl_11thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[2]") private static WebElement
	 * sl_11thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[3]") private static WebElement
	 * sl_11thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[4]") private static WebElement
	 * sl_11thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[5]") private static WebElement
	 * sl_11thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[6]") private static WebElement
	 * sl_11thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[7]") private static WebElement
	 * sl_11thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[8]") private static WebElement
	 * sl_11thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[9]") private static WebElement
	 * sl_11thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[10]") private static WebElement
	 * sl_11thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[11]") private static WebElement
	 * sl_11thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[12]") private static WebElement
	 * sl_11thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[13]") private static WebElement
	 * sl_11thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[14]") private static WebElement
	 * sl_11thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[15]") private static WebElement
	 * sl_11thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[16]") private static WebElement
	 * sl_11thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_11']/td[17]") private static WebElement
	 * sl_11thRow17thCol;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[1]") private static WebElement
	 * sl_12thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[2]") private static WebElement
	 * sl_12thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[3]") private static WebElement
	 * sl_12thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[4]") private static WebElement
	 * sl_12thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[5]") private static WebElement
	 * sl_12thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[6]") private static WebElement
	 * sl_12thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[7]") private static WebElement
	 * sl_12thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[8]") private static WebElement
	 * sl_12thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[9]") private static WebElement
	 * sl_12thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[10]") private static WebElement
	 * sl_12thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[11]") private static WebElement
	 * sl_12thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[12]") private static WebElement
	 * sl_12thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[13]") private static WebElement
	 * sl_12thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[14]") private static WebElement
	 * sl_12thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[15]") private static WebElement
	 * sl_12thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[16]") private static WebElement
	 * sl_12thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_12']/td[17]") private static WebElement
	 * sl_12thRow17thCol;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[1]") private static WebElement
	 * sl_13thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[2]") private static WebElement
	 * sl_13thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[3]") private static WebElement
	 * sl_13thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[4]") private static WebElement
	 * sl_13thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[5]") private static WebElement
	 * sl_13thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[6]") private static WebElement
	 * sl_13thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[7]") private static WebElement
	 * sl_13thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[8]") private static WebElement
	 * sl_13thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[9]") private static WebElement
	 * sl_13thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[10]") private static WebElement
	 * sl_13thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[11]") private static WebElement
	 * sl_13thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[12]") private static WebElement
	 * sl_13thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[13]") private static WebElement
	 * sl_13thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[14]") private static WebElement
	 * sl_13thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[15]") private static WebElement
	 * sl_13thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[16]") private static WebElement
	 * sl_13thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_13']/td[17]") private static WebElement
	 * sl_13thRow17thCol;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[1]") private static WebElement
	 * sl_14thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[2]") private static WebElement
	 * sl_14thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[3]") private static WebElement
	 * sl_14thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[4]") private static WebElement
	 * sl_14thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[5]") private static WebElement
	 * sl_14thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[6]") private static WebElement
	 * sl_14thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[7]") private static WebElement
	 * sl_14thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[8]") private static WebElement
	 * sl_14thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[9]") private static WebElement
	 * sl_14thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[10]") private static WebElement
	 * sl_14thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[11]") private static WebElement
	 * sl_14thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[12]") private static WebElement
	 * sl_14thRow12thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[13]") private static WebElement
	 * sl_14thRow13thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[14]") private static WebElement
	 * sl_14thRow14thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']td[15]") private static WebElement
	 * sl_14thRow15thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[16]") private static WebElement
	 * sl_14thRow16thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_14']/td[17]") private static WebElement
	 * sl_14thRow17thCol;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[1]") private static WebElement
	 * sl_15thRow1stCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[2]") private static WebElement
	 * sl_15thRow2ndCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[3]") private static WebElement
	 * sl_15thRow3rdCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[4]") private static WebElement
	 * sl_15thRow4thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[5]") private static WebElement
	 * sl_15thRow5thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[6]") private static WebElement
	 * sl_15thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[7]") private static WebElement
	 * sl_15thRow7thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[8]") private static WebElement
	 * sl_15thRow8thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[9]") private static WebElement
	 * sl_15thRow9thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[10]") private static WebElement
	 * sl_15thRow10thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[11]") private static WebElement
	 * sl_15thRow11thCol;
	 * 
	 * @FindBy(xpath="//*[@id='trRender_15']/td[12]") private static WebElement
	 * sl_15thRow12thCol;
	 * 
	 * 
	 * 
	 * /////////////////////////////////
	 * 
	 * // Opening Stock Register Elements
	 * 
	 * @FindBy (xpath="//li[@id='154']/a[2]") private static WebElement
	 * osr_ItemsGroupBtn;
	 * 
	 * @FindBy(xpath="//select[@id='DateOptions_']") private static WebElement
	 * osr_dateOptionDropdown;
	 * 
	 * @FindBy(xpath="//input[@id='id_starting_date_']") private static WebElement
	 * osr_StartDateTxt;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='id_starting_date__input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']"
	 * ) private static WebElement osr_startdateCalanderBtn;
	 * 
	 * @FindBy(xpath="//input[@id='id_ending_date_']") private static WebElement
	 * osr_EndDateTxt;
	 * 
	 * @FindBy(
	 * xpath="//td[@id='id_ending_date__input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']"
	 * ) private static WebElement osr_EndDateCalanderBtn;
	 * 
	 * @FindBy(xpath="//select[@id='RITLayout_']") private static WebElement
	 * osr_layoutDropdown;
	 * 
	 * @FindBy(xpath="//select[@id='RITOutput_']") private static WebElement
	 * osr_outputDropdown;
	 * 
	 * @FindBy(xpath="//i[@class='icon-font6 icon-schedule']") private static
	 * WebElement osr_ScheduleBtn;
	 * 
	 * @FindBy(xpath="//i[@class='icon-font6 icon-custamize']") private static
	 * WebElement osr_CustomizeBtn;
	 * 
	 * @FindBy(xpath="//i[@class='icon-font6 icon-filter']") private static
	 * WebElement osr_FilterBtn;
	 * 
	 * @FindBy(xpath="//i[@class='icon-font6 icon-ok']") private static WebElement
	 * osr_OkBtn;
	 * 
	 * @FindBy(xpath="//i[@class='icon-font6 icon-close']") private static
	 * WebElement osr_CloseBtn;
	 * 
	 * ///////
	 * 
	 * @FindBy(xpath="//input[@id='id_body_37']") private static WebElement
	 * enter_Expirydate;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_36']") private static WebElement
	 * enter_MfgDate;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_108']") private static WebElement
	 * enter_BatchRate;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_109']") private static WebElement
	 * enter_BatchRateValue1;
	 * 
	 * @FindBy(xpath="//input[@id='id_body_110']") private static WebElement
	 * enter_BatchRateValue2;
	 * 
	 * 
	 * ////////////////////////
	 * 
	 * // Finance Reports Almost Common Some Fields Are Added Below
	 * 
	 * @FindBy (xpath="//li[@id='18']/a[1]") private static WebElement
	 * assetsExpandOrCollepseBtn;
	 * 
	 * @FindBy(xpath="//li[@id='18']/a[2]") private static WebElement assets;
	 * 
	 * @FindBy(xpath="//li[@id='17']/a[2]") private static WebElement fixedAssets;
	 * 
	 * @FindBy (xpath="//li[@id='23']/a[1]") private static WebElement
	 * currentAssetsExpandOrCollepseBtn;
	 * 
	 * @FindBy(xpath="//li[@id='23']/a[2]") private static WebElement currentAssets;
	 * 
	 * @FindBy(xpath="//li[@id='8']/a[2]") private static WebElement cashAndBank;
	 * 
	 * @FindBy(xpath="//li[@id='13']/a[2]") private static WebElement inventories;
	 * 
	 * @FindBy(xpath="//li[@id='22']/a[2]") private static WebElement
	 * accountsReceivable;
	 * 
	 * @FindBy (xpath="//li[@id='83']/a[2]") private static WebElement
	 * customerUpdateGroup;
	 * 
	 * @FindBy(xpath="//li[@id='72']/a[2]") private static WebElement investments;
	 * 
	 * @FindBy (xpath="//li[@id='25']/a[1]") private static WebElement
	 * expensesExpensionOrCollepseBtn;
	 * 
	 * @FindBy(xpath="//li[@id='25']/a[2]") private static WebElement expenses;
	 * 
	 * @FindBy(xpath="//li[@id='24']/a[2]") private static WebElement
	 * directExpenses;
	 * 
	 * @FindBy (xpath="//li[@id='73']/a[1]") private static WebElement
	 * indirectExpensesExpandOrCollepseBtn;
	 * 
	 * @FindBy(xpath="//li[@id='73']/a[2]") private static WebElement
	 * indirectExpenses;
	 * 
	 * @FindBy(xpath="//li[@id='54']/a[2]") private static WebElement
	 * administrativeExpenses;
	 * 
	 * @FindBy(xpath="//li[@id='60']/a[2]") private static WebElement
	 * employeeBenefits;
	 * 
	 * @FindBy(xpath="//li[@id='64']/a[2]") private static WebElement
	 * financialCharges;
	 * 
	 * @FindBy(xpath="//li[@id='69']/a[2]") private static WebElement gainAndLoss;
	 * 
	 * @FindBy(xpath="//li[@id='26']/a[2]") private static WebElement
	 * controlAccounts;
	 * 
	 * @FindBy (xpath="//li[@id='29']/a[1]") private static WebElement
	 * revenueExpandOrCollepseBtn;
	 * 
	 * @FindBy(xpath="//li[@id='29']/a[2]") private static WebElement revenue;
	 * 
	 * @FindBy (xpath="//li[@id='28']/a[2]") private static WebElement sales;
	 * 
	 * @FindBy (xpath="//li[@id='33']/a[1]") private static WebElement
	 * equitiesExpandOrCollepseBtn;
	 * 
	 * @FindBy(xpath="//li[@id='33']/a[2]") private static WebElement equities;
	 * 
	 * @FindBy (xpath="//li[@id='32']/a[2]") private static WebElement capital;
	 * 
	 * @FindBy (xpath="//li[@id='39']/a[1]") private static WebElement
	 * liabilitiesExpandOrCollepseBtn;
	 * 
	 * @FindBy (xpath="//li[@id='39']/a[2]") private static WebElement liabilities;
	 * 
	 * @FindBy (xpath="//li[@id='38']/a[1]") private static WebElement
	 * loansAndBorrowingsExpandOrCollepseBtn;
	 * 
	 * @FindBy (xpath="//li[@id='38']/a[2]") private static WebElement
	 * loansAndBorrowings;
	 * 
	 * @FindBy (xpath="//li[@id='37']/a[2]") private static WebElement loans;
	 * 
	 * @FindBy (xpath="//li[@id='42']/a[2]") private static WebElement
	 * accruedLiabilities;
	 * 
	 * @FindBy (xpath="//li[@id='45']/a[2]") private static WebElement tradePayable;
	 * 
	 * @FindBy (xpath="//li[@id='48']/a[2]") private static WebElement provisions;
	 * 
	 * /////////////////////////////////////////////////////////////////////////
	 * 
	 * 
	 * @FindBy (xpath="//input[@id='txtSerialNo']") private static WebElement
	 * RMAPopupSerialNumberTxtField;
	 * 
	 * @FindBy (xpath="//input[@id='txtQuantity']") private static WebElement
	 * RMAPopupQuantityTxtField;
	 * 
	 * @FindBy (xpath="//div[@id='img_add']/span") private static WebElement
	 * RMAPopupAddBtn;
	 * 
	 * @FindBy (xpath="//div[@id='Modal_Search_Body']/div[3]/label") private static
	 * WebElement RMAPopupNumberofItemsLabel;
	 * 
	 * @FindBy (xpath="//label[@id='lblItems']") private static WebElement
	 * RMAPopupNumberOfItems;
	 * 
	 * @FindBy (xpath="//th[@id='RMA_Table_control_heading_1']/div") private static
	 * WebElement RMAPopupTableHeadingRMA;
	 * 
	 * @FindBy (xpath="//th[@id='RMA_Table_control_heading_2']/div") private static
	 * WebElement RMAPopupTableHeadingDocumentNo;
	 * 
	 * @FindBy (xpath="//th[@id='RMA_Table_control_heading_3']/div") private static
	 * WebElement RMAPopupTableHeadingDocumentDate;
	 * 
	 * @FindBy (xpath="//div[@id='RMAModel_Bottom']/div[1]/label") private static
	 * WebElement RMAPopupClearBtn;
	 * 
	 * @FindBy (xpath="//div[@id='RMAModel_Bottom']/div[2]/label") private static
	 * WebElement RMAPopupOkBtn;
	 * 
	 * @FindBy (xpath="//div[@id='RMAModel_Bottom']/div[3]/label") private static
	 * WebElement RMAPopupCancelBtn;
	 * 
	 * @FindBy (xpath="//div[@id='Modal_Header']/div[2]/span/i") private static
	 * WebElement RMAPopupCloseBtn;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_1-1']") private static WebElement
	 * RMAPopupTableRow1Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_2-1']") private static WebElement
	 * RMAPopupTableRow2Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_3-1']") private static WebElement
	 * RMAPopupTableRow3Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_4-1']") private static WebElement
	 * RMAPopupTableRow4Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_5-1']") private static WebElement
	 * RMAPopupTableRow5Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_6-1']") private static WebElement
	 * RMAPopupTableRow6Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_7-1']") private static WebElement
	 * RMAPopupTableRow7Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_8-1']") private static WebElement
	 * RMAPopupTableRow8Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_9-1']") private static WebElement
	 * RMAPopupTableRow9Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_10-1']") private static WebElement
	 * RMAPopupTableRow10Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_11-1']") private static WebElement
	 * RMAPopupTableRow11Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_12-1']") private static WebElement
	 * RMAPopupTableRow12Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_13-1']") private static WebElement
	 * RMAPopupTableRow13Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_14-1']") private static WebElement
	 * RMAPopupTableRow14Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_15-1']") private static WebElement
	 * RMAPopupTableRow15Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_16-1']") private static WebElement
	 * RMAPopupTableRow16Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_17-1']") private static WebElement
	 * RMAPopupTableRow17Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_18-1']") private static WebElement
	 * RMAPopupTableRow18Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_19-1']") private static WebElement
	 * RMAPopupTableRow19Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_20-1']") private static WebElement
	 * RMAPopupTableRow20Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_21-1']") private static WebElement
	 * RMAPopupTableRow21Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_22-1']") private static WebElement
	 * RMAPopupTableRow22Column1;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_1-2']") private static WebElement
	 * RMAPopupTableRow1Column2;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_1-3']") private static WebElement
	 * RMAPopupTableRow1Column3;
	 * 
	 * @FindBy (xpath="//td[@id='id_body_38_input_image']/img") private static
	 * WebElement RMAPopupExpansionBtn;
	 * 
	 * @FindBy (xpath=
	 * "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
	 * private static WebElement infoSideBarBtn;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[4]") private static WebElement
	 * savedVoucher1stRowVoucherNumer;
	 * 
	 * @FindBy (xpath="//span[@id='reportClose']") private static WebElement
	 * sl_ReportsCloseBtn;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[2]") private static WebElement
	 * stockStatmentReportOpeningBalance;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[5]") private static WebElement
	 * stockStatmentReportBalanceQuantity;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[6]") private static WebElement
	 * stockStatmentReportValue;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[2]") private static WebElement
	 * stockMovementOpeningBalanceQty;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[3]") private static WebElement
	 * stockMovementOpeningBalanceValue;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[8]") private static WebElement
	 * stockMovementBalanceQuantity;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[9]") private static WebElement
	 * stockMovementBalanceStockValue;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[10]") private static WebElement
	 * stockMovementAverageRate;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[2]") private static WebElement
	 * multiLevelStockMovementOpeningBalanceQty;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[3]") private static WebElement
	 * multiLevelStockMovementOpeningBalanceValue;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[8]") private static WebElement
	 * multiLevelStockMovementBalanceQuantity;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[9]") private static WebElement
	 * multiLevelStockMovementBalanceStockValue;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[10]") private static WebElement
	 * multiLevelStockMovementAverageRate;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[2]") private static WebElement
	 * virtualStockAnalysisStockBal;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[6]") private static WebElement
	 * virtualStockAnalysisVirtualStock;
	 * 
	 * @FindBy (xpath="//span[contains(text(),'Stock valuation of')]") private
	 * static WebElement stockValidationReportsLabel;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[4]") private static WebElement
	 * stockValidationQuantity;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[5]") private static WebElement
	 * stockValidationStockValue;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[6]") private static WebElement
	 * stockValidationUnitPrice;
	 * 
	 * 
	 * //Stock Analysis by RMA Reports Table //RMA Number
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[1]") private static WebElement
	 * rmaNumber1stRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[1]") private static WebElement
	 * rmaNumber2ndRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[1]") private static WebElement
	 * rmaNumber3rdRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_4']/td[1]") private static WebElement
	 * rmaNumber4thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_5']/td[1]") private static WebElement
	 * rmaNumber5thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_6']/td[1]") private static WebElement
	 * rmaNumber6thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_7']/td[1]") private static WebElement
	 * rmaNumbeR9thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_8']/td[1]") private static WebElement
	 * rmaNumber8thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_9']/td[1]") private static WebElement
	 * rmaNumber9thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_10']/td[1]") private static WebElement
	 * rmaNumber10thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_11']/td[1]") private static WebElement
	 * rmaNumber11thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_12']/td[1]") private static WebElement
	 * rmaNumber12thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_13']/td[1]") private static WebElement
	 * rmaNumber13thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_14']/td[1]") private static WebElement
	 * rmaNumber14thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[1]") private static WebElement
	 * rmaNumberPg2_1stRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[1]") private static WebElement
	 * rmaNumberPg2_2ndRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[1]") private static WebElement
	 * rmaNumberPg2_3rdRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_4']/td[1]") private static WebElement
	 * rmaNumberPg2_4thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_5']/td[1]") private static WebElement
	 * rmaNumberPg2_5thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_6']/td[1]") private static WebElement
	 * rmaNumberPg2_6thRow;
	 * 
	 * 
	 * //Quantity
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[2]") private static WebElement
	 * quantity1stRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[2]") private static WebElement
	 * quantity2ndRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[2]") private static WebElement
	 * quantity3rdRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_4']/td[2]") private static WebElement
	 * quantity4thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_5']/td[2]") private static WebElement
	 * quantity5thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_6']/td[2]") private static WebElement
	 * quantity6thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_7']/td[2]") private static WebElement
	 * quantity7thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_8']/td[2]") private static WebElement
	 * quantity8thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_9']/td[2]") private static WebElement
	 * quantity9thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_10']/td[2]") private static WebElement
	 * quantity10thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_11']/td[2]") private static WebElement
	 * quantity11thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_12']/td[2]") private static WebElement
	 * quantity12thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_13']/td[2]") private static WebElement
	 * quantity13thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_14']/td[2]") private static WebElement
	 * quantity14thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[2]") private static WebElement
	 * quantityPg2_1stRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[2]") private static WebElement
	 * quantityPg2_2ndRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[2]") private static WebElement
	 * quantityPg2_3rdRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_4']/td[2]") private static WebElement
	 * quantityPg2_4thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_5']/td[2]") private static WebElement
	 * quantityPg2_5thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_6']/td[2]") private static WebElement
	 * quantityPg2_6thRow;
	 * 
	 * //Rate
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[3]") private static WebElement
	 * rate1stRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[3]") private static WebElement
	 * rate2ndRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[3]") private static WebElement
	 * rate3rdRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_4']/td[3]") private static WebElement
	 * rate4thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_5']/td[3]") private static WebElement
	 * rate5thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_6']/td[3]") private static WebElement
	 * rate6thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_7']/td[3]") private static WebElement
	 * rate7thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_8']/td[3]") private static WebElement
	 * rate8thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_9']/td[3]") private static WebElement
	 * rate9thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_10']/td[3]") private static WebElement
	 * rate10thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_11']/td[3]") private static WebElement
	 * rate11thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_12']/td[3]") private static WebElement
	 * rate12thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_13']/td[3]") private static WebElement
	 * rate13thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_14']/td[3]") private static WebElement
	 * rate14thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[3]") private static WebElement
	 * ratePg2_1stRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[3]") private static WebElement
	 * ratePg2_2ndRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[3]") private static WebElement
	 * ratePg2_3rdRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_4']/td[3]") private static WebElement
	 * ratePg2_4thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_5']/td[3]") private static WebElement
	 * ratePg2_5thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_6']/td[3]") private static WebElement
	 * ratePg2_6thRow;
	 * 
	 * //Stock Value
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[4]") private static WebElement
	 * stockValue1stRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[4]") private static WebElement
	 * stockValue2ndRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[4]") private static WebElement
	 * stockValue3rdRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_4']/td[4]") private static WebElement
	 * stockValue4thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_5']/td[4]") private static WebElement
	 * stockValue5thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_6']/td[4]") private static WebElement
	 * stockValue6thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_7']/td[4]") private static WebElement
	 * stockValue7thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_8']/td[4]") private static WebElement
	 * stockValue8thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_9']/td[4]") private static WebElement
	 * stockValue9thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_10']/td[4]") private static WebElement
	 * stockValue10thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_11']/td[4]") private static WebElement
	 * stockValue11thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_12']/td[4]") private static WebElement
	 * stockValue12thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_13']/td[4]") private static WebElement
	 * stockValue13thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_14']/td[4]") private static WebElement
	 * stockValue14thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[4]") private static WebElement
	 * stockValuePg2_1stRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_2']/td[4]") private static WebElement
	 * stockValuePg2_2ndRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_3']/td[4]") private static WebElement
	 * stockValuePg2_3rdRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_4']/td[4]") private static WebElement
	 * stockValuePg2_4thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_5']/td[4]") private static WebElement
	 * stockValuePg2_5thRow;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_6']/td[4]") private static WebElement
	 * stockValuePg2_6thRow;
	 * 
	 * @FindBy (xpath="//button[@id='pgnumber_']") private static WebElement
	 * rmaReportsCurrentPageBtn;
	 * 
	 * @FindBy (xpath="//td[@id='RMA_Table_col_8-4']") private static WebElement
	 * RMAPopupTable8thRowClrBtn;
	 * 
	 * @FindBy (xpath="//tr[@id='trRender_1']/td[2]") private static WebElement
	 * savedVoucher1stRowChkBox;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy (xpath="//input[@id='RITNumber__11']") private static WebElement
	 * slab1;
	 * 
	 * @FindBy (xpath="//input[@id='RITNumber__12']") private static WebElement
	 * slab2;
	 * 
	 * @FindBy (xpath="//input[@id='RITNumber__13']") private static WebElement
	 * slab3;
	 * 
	 * @FindBy (xpath="//input[@id='RITNumber__14']") private static WebElement
	 * slab4;
	 * 
	 * @FindBy (xpath="//input[@id='RITNumber__15']") private static WebElement
	 * slab5;
	 * 
	 * @FindBy (xpath="//input[@id='RITNumber__16']") private static WebElement
	 * slab6;
	 * 
	 * @FindBy (xpath="//input[@id='RITNumber__17']") private static WebElement
	 * slab7;
	 * 
	 * @FindBy (xpath="//select[@id='RITCombobox__8']") private static WebElement
	 * slabUptoDrpdwn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//tr[@id='id_header_2_day_grid']") private static WebElement
	 * cal;
	 * 
	 * 
	 * @FindBy(xpath="//select[@id='id_header_2_month']") private static WebElement
	 * month;
	 * 
	 * @FindBy(xpath="//select[@id='id_header_2_year']") private static WebElement
	 * year;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//input[contains(@name,'chkRowCheck')]") private static
	 * WebElement selectGridFirstRow;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='lblnchecked']/input") private static WebElement
	 * selectGridSecondRow;
	 * 
	 * 
	 * @FindBy(xpath="//select[@id='iValuationMethod']") private static WebElement
	 * validationMethodDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='btnMasterEdit']") private static WebElement
	 * itemEditBtn;
	 * 
	 * @FindBy(xpath="//*[@id='btnDelete']") private static WebElement
	 * itemDeleteBtn;
	 * 
	 * @FindBy(xpath="//*[@id='btnClose']") private static WebElement itemCloseBtn;
	 * 
	 * @FindBy(xpath="//*[@id='toggle_ribbon']") private static WebElement
	 * itemToggleRibbonBtn;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='btnMasterSaveClick']") private static WebElement
	 * itemEditSaveBtn;
	 * 
	 * @FindBy(xpath="//*[@id='btnMasterCopy']") private static WebElement
	 * itemEditCpoyBtn;
	 * 
	 * @FindBy(xpath="//*[@id='btnMasterClone']") private static WebElement
	 * itemEditCloneBtn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
	 * private static WebElement itemEditCloseBtn;
	 * 
	 * @FindBy(xpath="//*[@id='divBtnGroup0']/div/a") private static WebElement
	 * ItemEditGeneralBtn;
	 * 
	 * @FindBy(xpath="//*[@id='sName']") private static WebElement EditGeneralName;
	 * 
	 * @FindBy(xpath="//*[@id='sCode']") private static WebElement EditGeneralCode;
	 * 
	 * @FindBy(xpath="//*[@id='iProductType']") private static WebElement
	 * EditGeneralItemTypeDropDown;
	 * 
	 * @FindBy(xpath="//*[@id='fReorderLevel']") private static WebElement
	 * EditGeneralReorderLevel;
	 * 
	 * @FindBy(xpath="//*[@id='iBinCapacity']") private static WebElement
	 * EditGeneralBinCapacity;
	 * 
	 * @FindBy(xpath="//*[@id='iValuationMethod']") private static WebElement
	 * EditGeneralValuationMethodDropDown;
	 * 
	 * @FindBy(xpath="//*[@id='iCategory']") private static WebElement
	 * EditGeneralCategoryDropDown;
	 * 
	 * @FindBy(xpath="//*[@id='iCategory_input_settings']/span") private static
	 * WebElement EditGeneralCategorySettingBtn;
	 * 
	 * @FindBy(xpath="//*[@id='iProductMake']") private static WebElement
	 * EditGeneralItemMakeDropDown;
	 * 
	 * @FindBy(xpath="//*[@id='Printer']") private static WebElement
	 * EditGeneralPrint;
	 * 
	 * @FindBy(xpath="//*[@id='iAlternateCategory']") private static WebElement
	 * EditGeneralAlternativeCategoryDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='iAlternateCategory_input_settings']/span") private
	 * static WebElement EditGeneralAlternativeCategoryDropdownSettingBtn;
	 * 
	 * @FindBy(xpath="//*[@id='sDescription']") private static WebElement
	 * EditGeneralDescription;
	 * 
	 * @FindBy(xpath="//*[@id='bPerishableItem']") private static WebElement
	 * EditGeneralPerishableItemCheckBox;
	 * 
	 * @FindBy(xpath="//*[@id='iBin']") private static WebElement
	 * EditGeneralBinDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='iBin_input_settings']/span") private static
	 * WebElement EditGeneralBinDropdownSettingBtn;
	 * 
	 * @FindBy(xpath="//*[@id='BrowsepImage']") private static WebElement
	 * EditGeneralUploadImageOrFileBtn;
	 * 
	 * @FindBy(xpath="//*[@id='btnMasterSaveClick']/i") private static WebElement
	 * EditGeneralSaveBtn;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='GenerateEditMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	 * private static WebElement EditGeneralCLoseBtn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy (xpath="//span[@id='sp_search']") private static WebElement
	 * RMAPopupSerialNoExpansionBtn;
	 * 
	 * @FindBy (xpath="//input[@id='Search_txtSearchBox']") private static
	 * WebElement searchRMASearchTxtField;
	 * 
	 * @FindBy (xpath="//input[@id='Search_txtQuantity']") private static WebElement
	 * searchRMAQuantityTxtField;
	 * 
	 * @FindBy (xpath="//label[@id='Search_lblItems']") private static WebElement
	 * searchRMANoOfItemsTxt;
	 * 
	 * @FindBy (xpath="//input[@id='chkSelectALL']") private static WebElement
	 * searchRMASelectAllChkBox;
	 * 
	 * @FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[4]/td[1]/input") private
	 * static WebElement searchRMA4ChkBox;
	 * 
	 * @FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[101]/td[1]/input") private
	 * static WebElement searchRMA101ChkBox;
	 * 
	 * @FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[102]/td[1]/input") private
	 * static WebElement searchRMA102ChkBox;
	 * 
	 * @FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[103]/td[1]/input") private
	 * static WebElement searchRMA103ChkBox;
	 * 
	 * @FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[2]/td[1]/input") private
	 * static WebElement searchRMA2ndRowChkBox;
	 * 
	 * @FindBy (xpath="//table[@id='RMASearchTable']/thead/tr/td[2]") private static
	 * WebElement searchRMATableHeadingSerialNo;
	 * 
	 * @FindBy (xpath="//table[@id='RMASearchTable']/thead/tr/td[3]") private static
	 * WebElement searchRMATableHeadingDocNo;
	 * 
	 * @FindBy (xpath="//table[@id='RMASearchTable']/thead/tr/td[4]") private static
	 * WebElement searchRMATableHeadingDate;
	 * 
	 * @FindBy (xpath="//*[@id='SearchModal_Content']/div[3]/div/div[1]/label")
	 * private static WebElement searchRMAOkBtn;
	 * 
	 * @FindBy (xpath="//*[@id='SearchModal_Content']/div[3]/div/div[2]/label")
	 * private static WebElement searchRMACancelBtn;
	 * 
	 * @FindBy (xpath="//*[@id='SearchModal_Content']/div[1]/div[2]/span/i") private
	 * static WebElement searchRMACloseBtn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//a[@id='16']//div[@class='form-group theme_menu_color']")
	 * private static WebElement SettingsmenuBtn;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Configure Transactions')]") private
	 * static WebElement ConfigureTransactionBtn;
	 * 
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Preferences')]") private static
	 * WebElement PreferencesBtn;
	 * 
	 * @FindBy(xpath="//div[@id='docCustomization']") private static WebElement
	 * DocumentCustomizationBtn;
	 * 
	 * @FindBy(xpath="//a[@id='0']") private static WebElement TagsBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='1']") private static
	 * WebElement AccountsBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='2']") private static
	 * WebElement BudgetBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='3']") private static
	 * WebElement ARAPBtn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//a[@id='5']") private static WebElement PDCBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='6']") private static
	 * WebElement InventoryBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='7']") private static
	 * WebElement BatchBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='30']") private static
	 * WebElement RMABtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='8']") private static
	 * WebElement BinsBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='9']") private static
	 * WebElement HirePurchaseBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='10']") private static
	 * WebElement QuotationAnalysisBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='34']") private static
	 * WebElement RFIDBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='29']") private static
	 * WebElement AutoIndentBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='14']") private static
	 * WebElement ABCAnalysisBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='11']") private static
	 * WebElement ReportBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='12']") private static
	 * WebElement InternetBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='13']") private static
	 * WebElement MailSettingsBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='16']") private static
	 * WebElement MastersBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='17']") private static
	 * WebElement ExternalModulesBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='18']") private static
	 * WebElement InfoBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='19']") private static
	 * WebElement ProductionBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='20']") private static
	 * WebElement MrpBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='22']") private static
	 * WebElement FixedAssetsBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='25']") private static
	 * WebElement VatBtn;
	 * 
	 * @FindBy(xpath="//a[@id='28']") private static WebElement PosBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='35']") private static
	 * WebElement WareHouseManagementBtn;
	 * 
	 * @FindBy(xpath="//a[@id='36']") private static WebElement LetterForCreditBtn;
	 * 
	 * @FindBy(xpath="//ul[@id='preferenceUL']//a[@id='37']") private static
	 * WebElement PronghornBnt;
	 * 
	 * @FindBy(xpath="//input[@id='txtVoucherWizard']") private static WebElement
	 * SearchTxt;
	 * 
	 * @FindBy(xpath="//span[@id='updateButton']") private static WebElement
	 * UpdateBtn;
	 * 
	 * @FindBy(xpath="//i[@class='icon-close icon-font6']") private static
	 * WebElement CloseBtn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='chkRMASupport']") private static WebElement
	 * RmaSupportChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkRMAbasedalternateQuantity']") private static
	 * WebElement RMAbasedalternateQuantityChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkRMANumberAlwaysnumeric']") private static
	 * WebElement RMANumberAlwaysnumericChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkRMANumberUniqueAcrossAllItems']") private
	 * static WebElement RMANumberUniqueAcrossAllItemsChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkInputRMANo']") private static WebElement
	 * InputRMANoChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkRMANumberCantBeUsed']") private static
	 * WebElement RMANumberCantBeUsedChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='PrefixVoucherNo']") private static WebElement
	 * PrefixVoucherNoChkBox;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='txtUsername']") private static WebElement username;
	 * 
	 * @FindBy(id="txtPassword") private static WebElement password;
	 * 
	 * @FindBy(id="btnSignin") private static WebElement signIn;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[1]/td[2]") private static
	 * WebElement stockTransferRMA1stRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[2]/td[2]") private static
	 * WebElement stockTransferRMA2ndRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[3]/td[2]") private static
	 * WebElement stockTransferRMA3rdRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[4]/td[2]") private static
	 * WebElement stockTransferRMA4thRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[5]/td[2]") private static
	 * WebElement stockTransferRMA5thRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[6]/td[2]") private static
	 * WebElement stockTransferRMA6thRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[7]/td[2]") private static
	 * WebElement stockTransferRMA7thRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[8]/td[2]") private static
	 * WebElement stockTransferRMA8thRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[9]/td[2]") private static
	 * WebElement stockTransferRMA9thRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[10]/td[2]") private static
	 * WebElement stockTransferRMA10thRow1stColumn;
	 * 
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[1]/td[3]") private static
	 * WebElement stockTransferRMA1stRow2ndColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[2]/td[3]") private static
	 * WebElement stockTransferRMA2ndRow2ndColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[1]/td[4]") private static
	 * WebElement stockTransferRMA1stRow3rdColumn;
	 * 
	 * @FindBy (xpath="//*[@id='RMA_Table_body']/tr[2]/td[4]") private static
	 * WebElement stockTransferRMA2ndRow3rdColumn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='donotshow']") private static WebElement
	 * DontShowChkBox;
	 * 
	 * 
	 * @FindBy(xpath="//a[@id='2014']//span[contains(text(),'Sales')]") private
	 * static WebElement financialTransactionSalesMenu;
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Sales invoice VAT')]") private static
	 * WebElement salesInvoiceVATVoucher;
	 * 
	 * @FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	 * private static WebElement inventoryTransactionsMenu;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//tr[@id='id_header_2_day_grid']") private static WebElement
	 * calDates;
	 * 
	 * 
	 * @FindBy(xpath="//select[@id='id_header_2_month']") private static WebElement
	 * monthDropDwn;
	 * 
	 * @FindBy(xpath="//select[@id='id_header_2_year']") private static WebElement
	 * yearDropDwn;
	 * 
	 * 
	 * @FindBy(xpath="//tr[@id='id_header_2_day_grid']") private static WebElement
	 * salesInvoiceCalenderDates;
	 * 
	 * 
	 * @FindBy(xpath="//select[@id='id_header_2_month']") private static WebElement
	 * salesInvoiceCalenderMonthDropdwn;
	 * 
	 * @FindBy(xpath="//select[@id='id_header_2_year']") private static WebElement
	 * salesInvoiceCalenderYearDropdwn;
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='id_header_6']") private static WebElement
	 * voucherHeaderDueDate;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_10']") private static WebElement
	 * voucherHeaderCurrency;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_11']") private static WebElement
	 * voucherHeaderExchangeRate;
	 * 
	 * @FindBy(xpath="//input[@id='id_header_145']") private static WebElement
	 * voucherHeaderLocalExchangeRate;
	 * 
	 * 
	 * // Batch Popup Elements
	 * 
	 * @FindBy(xpath="//label[@id='lblitem']") private static WebElement
	 * batchItemName;
	 * 
	 * @FindBy(xpath="//label[@id='lblTotalQty']") private static WebElement
	 * batchTotalQtyAmt;
	 * 
	 * @FindBy(xpath="//label[@id='lblAdjustQty']") private static WebElement
	 * batchAdjustQtyAmt;
	 * 
	 * 
	 * @FindBy(xpath="//label[@id='lblBalnceQty']") private static WebElement
	 * batchBalanceAmt;
	 * 
	 * @FindBy(
	 * xpath="//div[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 P_ingBottom')]//div[2]//input[1]"
	 * ) private static WebElement batchExipiringInRadioBtn;
	 * 
	 * @FindBy(xpath=
	 * "//section[@id='page_Content']//div[@class='row']//div//div[3]//input[1]")
	 * private static WebElement batchExipiringAfetrRadioBtn;
	 * 
	 * @FindBy(xpath="//input[@id='txtWithin']") private static WebElement
	 * batchWithInTxt;
	 * 
	 * @FindBy(xpath="//*[@id='Id_MRPBatch_Grid_control_heading_6']") private static
	 * WebElement batchTableHeaderRateColumn;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-1']") private static
	 * WebElement batchTable1stRow1stCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-2']") private static
	 * WebElement batchTable1stRow2ndCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-5']") private static
	 * WebElement batchTable1stRow3rdCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-6']") private static
	 * WebElement batchTable1stRow4thCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-7']") private static
	 * WebElement batchTable1stRow5thCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-7']/input") private static
	 * WebElement enter_BatchTableQtyAdjusted;
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-13']") private static
	 * WebElement batchTable1stRow6thCol;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_2-1']") private static
	 * WebElement batchTable2ndRow1stCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-2']") private static
	 * WebElement batchTable2ndRow2ndCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-5']") private static
	 * WebElement batchTable2ndRow3rdCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-6']") private static
	 * WebElement batchTable2ndRow4thCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-7']") private static
	 * WebElement batchTable2ndRow5thCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-13']") private static
	 * WebElement batchTable2ndRow6thCol;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_3-1']") private static
	 * WebElement batchTable3rdRow1stCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-2']") private static
	 * WebElement batchTable3rdRow2ndCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-5']") private static
	 * WebElement batchTable3rdRow3rdCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-6']") private static
	 * WebElement batchTable3rdRow4thCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-7']") private static
	 * WebElement batchTable3rdRow5thCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-13']") private static
	 * WebElement batchTable3rdRow6thCol;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_4-1']") private static
	 * WebElement batchTable4thRow1stCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-2']") private static
	 * WebElement batchTable4thRow2ndCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-5']") private static
	 * WebElement batchTable4thRow3rdCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-6']") private static
	 * WebElement batchTable4thRow4thCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-7']") private static
	 * WebElement batchTable4thRow5thCol;
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-13']") private static
	 * WebElement batchTable4thRow6thCol;
	 * 
	 * @FindBy(xpath="//*[@id='MRPBatch_AdjBatchQty']") private static WebElement
	 * batchTableEnterQtyAdjusted;
	 * 
	 * 
	 * @FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']/tr") private static
	 * List<WebElement> batchPopupTable;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//i[@class='icon-refresh icon-font7']") private static
	 * WebElement batchRefreshBtn;
	 * 
	 * @FindBy(xpath="//input[@id='Batch_Search']") private static WebElement
	 * batchSearchTxt;
	 * 
	 * @FindBy(xpath="//input[@class='Fcheckbox']") private static WebElement
	 * batchShowAllAvalibleBatches;
	 * 
	 * @FindBy(xpath="//label[contains(text(),'Customization')]") private static
	 * WebElement batchCustomizationIcon;
	 * 
	 * @FindBy(xpath="//i[@class='icon-pick icon-font5']") private static WebElement
	 * batchPickOnFIFOIcon;
	 * 
	 * @FindBy(xpath="//label[@id='div_Ok']") private static WebElement batchOkIcon;
	 * 
	 * @FindBy(
	 * xpath="//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12']//div[6]//label[1]"
	 * ) private static WebElement batchTotalAdjustedQty;
	 * 
	 * @FindBy(xpath="//*[@id='MBatch_Content']/div[3]/div/div[3]/div[4]/label")
	 * private static WebElement batchCancelIcon;
	 * 
	 * @FindBy(xpath="//*[@id='MBatch_Content']/div[1]/div[2]/span/i") private
	 * static WebElement batchCloseIcon;
	 * 
	 * @FindBy(xpath="//*[@id='MBatch_Content']/div[2]/div/div[5]/div/div[3]")
	 * private static WebElement batchTotalQuantity;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//span[@id='btnPick']") private static WebElement pickBtn;
	 * 
	 * @FindBy(xpath="//input[@id='txtNewReference']") private static WebElement
	 * newReferenceTxt;
	 * 
	 * @FindBy(xpath="//span[@id='btnOk']") private static WebElement Bill_OkBtn;
	 * 
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[1]") private static
	 * WebElement iq_stockTransaction1stRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[2]") private static
	 * WebElement iq_stockTransaction1stRow2ndColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[3]") private static
	 * WebElement iq_stockTransaction1stRow3rdColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[4]") private static
	 * WebElement iq_stockTransaction1stRow4thColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[5]") private static
	 * WebElement iq_stockTransaction1stRow5thColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[6]") private static
	 * WebElement iq_stockTransaction1stRow6thColumn;
	 * 
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[1]") private static
	 * WebElement iq_stockTransaction2ndRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[2]") private static
	 * WebElement iq_stockTransaction2ndRow2ndColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[3]") private static
	 * WebElement iq_stockTransaction2ndRow3rdColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[4]") private static
	 * WebElement iq_stockTransaction2ndRow4thColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[5]") private static
	 * WebElement iq_stockTransaction2ndRow5thColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[6]") private static
	 * WebElement iq_stockTransaction2ndRow6thColumn;
	 * 
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[1]") private static
	 * WebElement iq_stockTransaction3rdRow1stColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[2]") private static
	 * WebElement iq_stockTransaction3rdRow2ndColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[3]") private static
	 * WebElement iq_stockTransaction3rdRow3rdColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[4]") private static
	 * WebElement iq_stockTransaction3rdRow4thColumn;
	 * 
	 * @FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[5]") private static
	 * WebElement iq_stockTransaction3rdRow5thColumn;
	 * 
	 * @FindBy (xpath=
	 * "//tr[@id='id_ending_date__day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	 * private static WebElement sl_EndDateCalender_TodayBtn;
	 * 
	 * 
	 * 
	 * @FindBy (xpath="//*[@id='id_ending_date__month']") private static WebElement
	 * endDateCalMonthDrpdwn;
	 * 
	 * @FindBy (xpath="//*[@id='id_ending_date__year']") private static WebElement
	 * endDateCalYearDrpdwn;
	 * 
	 * @FindBy (xpath="//*[@id='id_ending_date__day_grid']/td/table/tbody") private
	 * static WebElement endDateCalDates;
	 * 
	 * 
	 * @FindBy (xpath="//*[@id='id_starting_date__month']") private static
	 * WebElement startDateCalMonthDrpdwn;
	 * 
	 * @FindBy (xpath="//*[@id='id_starting_date__year']") private static WebElement
	 * startDateCalYearDrpdwn;
	 * 
	 * @FindBy (xpath="//*[@id='id_starting_date__day_grid']/td/table/tbody")
	 * private static WebElement startDateCalDates;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr") private static
	 * List<WebElement> reportsBodyGridRowsCount;
	 * 
	 * 
	 * @FindBy (xpath="//*[@id='tblBodyTransRender']/tr[1]/td[11]") private static
	 * WebElement grid_1stRowSuspendStatus;
	 * 
	 * @FindBy (xpath="//*[@id='tblBodyTransRender']/tr[2]/td[11]") private static
	 * WebElement grid_2ndRowSuspendStatus;
	 * 
	 * 
	 * @FindBy (xpath=
	 * "//*[@id='id_transaction_entry_detail_table_control_heading_1']/div[1]")
	 * private static WebElement stockTransferWarehouse2TableHeader;
	 * 
	 * 
	 * @FindBy (xpath="//input[@id='id_header_86']") private static WebElement
	 * stockTransferWarehouse1;
	 * 
	 * @FindBy (xpath="//*[@id='tblBodyReportRender']/tr") private static
	 * List<WebElement> reports_TableBody;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='chkEnableBatchNumbers']") private static
	 * WebElement EnableBatchesNoChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkAllowNegativeQuantity']") private static
	 * WebElement AllowNegativeBatchesQtyChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkDontAcceptDupDoc']") private static WebElement
	 * DontAcceptDuplicateBatchesChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkExpiryDatesBatches']") private static
	 * WebElement ExpiryDatesOfBatchesChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkExpiryDatesOptional']") private static
	 * WebElement ExpiryDateOptionalChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkIgnoreDayInExpiry']") private static
	 * WebElement IgnoringDayInExpiryChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkCalculateExpiryDateFromItem']") private static
	 * WebElement CalculateExpiryDateFromItemChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkCantSellBatchesNxt']") private static
	 * WebElement CantSellBatchesNxtChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkDontClubBatchesMfDt']") private static
	 * WebElement DontClubBatchesMfDtChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkSortBatchesExpDate']") private static
	 * WebElement SortBatchesExpDateChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkInputBatchMrp']") private static WebElement
	 * InputBatchMrpChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkLoadAllDtlsBatch']") private static WebElement
	 * LoadAllDtlsBatchChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkManufacturingDateByBaches']") private static
	 * WebElement ManufacturingDateByBatchesChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkSuggestNextBatchNoDoc']") private static
	 * WebElement SuggestNextBatchNoDocChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkConsolidateBatchesByBatchNo']") private static
	 * WebElement ConsolidateBatchesByBatchNoChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='chkHideRatesOption']") private static WebElement
	 * HideRatesOptionChkBox;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='chkDonotshowbatchesconsumedinsuspendedandpendingdocuments']")
	 * private static WebElement
	 * donotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox;
	 * 
	 * @FindBy(xpath="//input[@id='txtValue1']") private static WebElement
	 * InputBatch_Value1Txt;
	 * 
	 * @FindBy(xpath="//input[@id='txtValue2']") private static WebElement
	 * InputBatch_Value2Txt;
	 * 
	 * @FindBy(xpath="//input[@id='txtNoofbatch']") private static WebElement
	 * CantSellBatches_Txt;
	 * 
	 * @FindBy(xpath="//select[@id='cmbBatchExpire']") private static WebElement
	 * CantSellBatches_Dropdown;
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-4']") private static
	 * WebElement batchTableManufactureDate;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='iExpiryDays']") private static WebElement
	 * itemCreationSettingsTabExpiryDaysTxt;
	 * 
	 * 
	 * @FindBy(xpath="//span[contains(text(),'Edit Screen')]") private static
	 * WebElement editScreenTab;
	 * 
	 * @FindBy(xpath="//*[@id='cmbBehaviour']") private static WebElement
	 * editScreenAddFieldsBehaviourDropdown;
	 * 
	 * @FindBy(xpath="//*[@id='id_footer_134217731']") private static WebElement
	 * pvVoucherFooterDiscountTxt;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//table[@id='id_transaction_bins_grid']") private static
	 * WebElement binPopGrid;
	 * 
	 * // Bin Inward Elements
	 * 
	 * @FindBy (xpath="//input[@id='id_bins_totalquantity']") private static
	 * WebElement binTotalQty;
	 * 
	 * @FindBy (xpath="//div[@class='modal-body']//div[4]") private static
	 * WebElement binBaseUOM;
	 * 
	 * @FindBy (xpath="//input[@id='srch_bin']") private static WebElement
	 * binSearchTxt;
	 * 
	 * @FindBy (xpath="//i[@class='icon-search']") private static WebElement
	 * binSearchBtn;
	 * 
	 * 
	 * 
	 * @FindBy
	 * (xpath="//*[@id='TransactionNewBin']/div/div/div[2]/div[1]/div[7]/button")
	 * private static WebElement binSearchBtn;
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']") private static
	 * WebElement binselect1stRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']") private static
	 * WebElement binselect1stRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']") private static
	 * WebElement binselect1stRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']") private static
	 * WebElement binselect1stRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']") private static
	 * WebElement binselect1stRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']") private static
	 * WebElement binselect1stRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']") private static
	 * WebElement binselect1stRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']") private static
	 * WebElement binselect1stRow_8thColumn;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']") private static
	 * WebElement sl_Binselect1stRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']") private static
	 * WebElement sl_Binselect1stRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']") private static
	 * WebElement sl_Binselect1stRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-4']") private static
	 * WebElement sl_Binselect1stRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']") private static
	 * WebElement sl_Binselect1stRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']") private static
	 * WebElement sl_Binselect1stRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']") private static
	 * WebElement sl_Binselect1stRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']") private static
	 * WebElement sl_Binselect1stRow_8thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']") private static
	 * WebElement sl_Binselect1stRow_9thColumn;
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-0']") private static
	 * WebElement binselect2ndRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-1']") private static
	 * WebElement binselect2ndRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-3']") private static
	 * WebElement binselect2ndRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-5']") private static
	 * WebElement binselect2ndRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-6']") private static
	 * WebElement binselect2ndRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-7']") private static
	 * WebElement binselect2ndRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-8']") private static
	 * WebElement binselect2ndRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-12']") private static
	 * WebElement binselect2ndRow_8thColumn;
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-0']") private static
	 * WebElement binselect3rdRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-1']") private static
	 * WebElement binselect3rdRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-3']") private static
	 * WebElement binselect3rdRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-5']") private static
	 * WebElement binselect3rdRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-6']") private static
	 * WebElement binselect3rdRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-7']") private static
	 * WebElement binselect3rdRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-8']") private static
	 * WebElement binselect3rdRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-12']") private static
	 * WebElement binselect3rdRow_8thColumn;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_transaction_bins_grid_control_heading_ctrl_12']") private
	 * static WebElement binEnter8thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-0']") private static
	 * WebElement binselect4thRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-1']") private static
	 * WebElement binselect4thRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-3']") private static
	 * WebElement binselect4thRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-5']") private static
	 * WebElement binselect4thRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-6']") private static
	 * WebElement binselect4thRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-7']") private static
	 * WebElement binselect4thRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-8']") private static
	 * WebElement binselect4thRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-12']") private static
	 * WebElement binselect4thRow_8thColumn;
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-0']") private static
	 * WebElement binselect5thRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-1']") private static
	 * WebElement binselect5thRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-3']") private static
	 * WebElement binselect5thRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-5']") private static
	 * WebElement binselect5thRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-6']") private static
	 * WebElement binselect5thRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-7']") private static
	 * WebElement binselect5thRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-8']") private static
	 * WebElement binselect5thRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-12']") private static
	 * WebElement binselect5thRow_8thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-0']") private static
	 * WebElement binselect6thRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-1']") private static
	 * WebElement binselect6thRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-3']") private static
	 * WebElement binselect6thRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-5']") private static
	 * WebElement binselect6thRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-6']") private static
	 * WebElement binselect6thRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-7']") private static
	 * WebElement binselect6thRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-8']") private static
	 * WebElement binselect6thRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-12']") private static
	 * WebElement binselect6thRow_8thColumn;
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-0']") private static
	 * WebElement binselect7thRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-1']") private static
	 * WebElement binselect7thRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-3']") private static
	 * WebElement binselect7thRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-5']") private static
	 * WebElement binselect7thRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-6']") private static
	 * WebElement binselect7thRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-7']") private static
	 * WebElement binselect7thRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-8']") private static
	 * WebElement binselect7thRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-12']") private static
	 * WebElement binselect7thRow_8thColumn;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-0']") private static
	 * WebElement binselect8thRow_1stColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-1']") private static
	 * WebElement binselect8thRow_2ndColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-3']") private static
	 * WebElement binselect8thRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-5']") private static
	 * WebElement binselect8thRow_4thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-6']") private static
	 * WebElement binselect8thRow_5thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-7']") private static
	 * WebElement binselect8thRow_6thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-8']") private static
	 * WebElement binselect8thRow_7thColumn;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-12']") private static
	 * WebElement binselect8thRow_8thColumn;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//span[@class='icon-sum']") private static WebElement
	 * binRowSum;
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[2]") private
	 * static WebElement binRowSum_2ndColumn;
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[4]") private
	 * static WebElement binSelect4htRow_3rdColumn;
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[6]") private
	 * static WebElement binRowSum_4thColumn;
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[7]") private
	 * static WebElement binRowSum_5thColumn;
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[8]") private
	 * static WebElement binRowSum_6thColumn;
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[9]") private
	 * static WebElement binRowSum_7thColumn;
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[12]") private
	 * static WebElement binRowSum_8thColumn;
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]") private
	 * static WebElement binRowTotalToBeAllocated;
	 * 
	 * 
	 * 
	 * @FindBy (xpath="//input[@id='id_bins_balance']") private static WebElement
	 * binBalanceTxt;
	 * 
	 * @FindBy (xpath=
	 * "//div[@id='id_btnalternatecategorycheck']//div[@class='toolbar_button_image']")
	 * private static WebElement binAlternateCategoryCheckBtn;
	 * 
	 * @FindBy
	 * (xpath="//div[@id='id_btnautoallocate']//div[@class='toolbar_button_image']")
	 * private static WebElement binAutoAllocateBtn;
	 * 
	 * @FindBy (xpath="//span[@class='icon-pick icon-font4']") private static
	 * WebElement binPickBtn;
	 * 
	 * @FindBy (xpath=
	 * "//div[@id='id_btnautoallocategroup']//div[@class='toolbar_button_image']")
	 * private static WebElement binAutoAllocateWithinGroupBtn;
	 * 
	 * @FindBy (xpath="//div[@id='id_bins_ok']//span[@class='icon-ok icon-font6']")
	 * private static WebElement binOkBtn;
	 * 
	 * @FindBy
	 * (xpath="//div[@class='col-xs-9 pull-right']//span[@class='icon-close icon-font6']"
	 * ) private static WebElement binCancelBtn;
	 * 
	 * @FindBy (xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
	 * private static WebElement binSumInward;
	 * 
	 * 
	 * // Bin OutWard Elements
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//th[@id='id_transaction_bins_grid_control_heading_1']//div[contains(text(),'Bin')]")
	 * private static WebElement binHeader_Bin;
	 * 
	 * @FindBy(xpath=
	 * "//th[@id='id_transaction_bins_grid_control_heading_3']//div[contains(text(),'Stock')]")
	 * private static WebElement binHeader_Stock;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Stock(Pcs)')]") private static
	 * WebElement binHeader_StockPcs;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Capacity')]") private static WebElement
	 * binHeader_Capacity;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Load')]") private static WebElement
	 * binHeader_Load;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Free space')]") private static
	 * WebElement binHeader_FreeSpace;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'Free Quantity')]") private static
	 * WebElement binHeader_FreeQty;
	 * 
	 * @FindBy(xpath="//div[contains(text(),'To be Picked')]") private static
	 * WebElement binHeader_ToBePicked;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']") private static
	 * WebElement binoutwardRow1Index;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']") private static
	 * WebElement binoutwardRow1Bin;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']") private static
	 * WebElement binoutwardRow1Stock;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-4']") private static
	 * WebElement binoutwardRow1StockPcs;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']") private static
	 * WebElement binoutwardRow1Capacity;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']") private static
	 * WebElement binoutwardRow1Load;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']") private static
	 * WebElement binoutwardRow1FreeSpace;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']") private static
	 * WebElement binoutwardRow1FreeQty;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']") private static
	 * WebElement binoutwardRow1ToBePicked;
	 * 
	 * @FindBy(xpath=
	 * "//input[@id='id_transaction_bins_grid_control_heading_ctrl_12']") private
	 * static WebElement binoutwardToInputInToBePicked;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-0']") private static
	 * WebElement binoutwardRow2Index;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-1']") private static
	 * WebElement binoutwardRow2Bin;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-3']") private static
	 * WebElement binoutwardRow2Stock;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-4']") private static
	 * WebElement binoutwardRow2StockPcs;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-5']") private static
	 * WebElement binoutwardRow2Capacity;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-6']") private static
	 * WebElement binoutwardRow2Load;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-7']") private static
	 * WebElement binoutwardRow2FreeSpace;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-8']") private static
	 * WebElement binoutwardRow2FreeQty;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-12']") private static
	 * WebElement binoutwardRow2ToBePicked;
	 * 
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-0']") private static
	 * WebElement binoutwardRow3Index;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-1']") private static
	 * WebElement binoutwardRow3Bin;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-3']") private static
	 * WebElement binoutwardRow3Stock;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-4']") private static
	 * WebElement binoutwardRow3StockPcs;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-5']") private static
	 * WebElement binoutwardRow3Capacity;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-6']") private static
	 * WebElement binoutwardRow3Load;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-7']") private static
	 * WebElement binoutwardRow3FreeSpace;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-8']") private static
	 * WebElement binoutwardRow3FreeQty;
	 * 
	 * @FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-12']") private static
	 * WebElement binoutwardRow3ToBePicked;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]") private
	 * static WebElement binoutwardRowTotalToBePicked;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='id_bins_ok']") private static WebElement
	 * binOkButtonStatus;
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_workflow_popup_col_1-1']/input")
	 * private static WebElement enterL_ExcessInStocksPopupRow1ChkBox;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_entry_detail_workflow_popup_col_2-1']/input")
	 * private static WebElement enterL_ExcessInStocksPopupRow2ChkBox;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='id_transaction_workflow_popup_heading']/div/ul/li[3]/div/div[1]/span")
	 * private static WebElement enterL_ExcessInStocksPopupOkBtn;
	 * 
	 * 
	 */

//Master Main Header Fields		
	@FindBy(xpath = "//*[@id='btnNew']/i")
	public static WebElement masterNewBtn;

//Name
	@FindBy(xpath = "//input[@id='sName']")
	public static WebElement nameTxt;

//Code
	@FindBy(xpath = "//input[@id='sCode']")
	public static WebElement codeTxt;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement mastercloseBtn;

	@FindBy(xpath = "//*[@id='135']")
	public static WebElement inventoryMenu;

	@FindBy(xpath = "//*[@id='1107']")
	public static WebElement warehouseMenu;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]/i")
	public static WebElement newCloseBtn;

	@FindBy(xpath = "//input[@id='rbnReserveBy']")
	public static WebElement reserveByRadioBtn;

	@FindBy(xpath = "//*[@id='chkBatch']/following-sibling::span")
	public static WebElement batchCheckbox;

	@FindBy(xpath = "//*[@id='chkBin']/following-sibling::span")
	public static WebElement binCheckbox;

	@FindBy(xpath = "//*[@id='chkRMA']/following-sibling::span")
	public static WebElement RMACheckbox;

	@FindBy(xpath = "//*[@id='chkBatch']")
	public static WebElement batchCheckboxIsSelected;

	@FindBy(xpath = "//*[@id='chkBin']")
	public static WebElement binCheckboxIsSelected;

	@FindBy(xpath = "//*[@id='chkRMA']")
	public static WebElement RMACheckboxIsSelected;
	
	@FindBy(xpath = "//*[@onclick='TRANSACTION_MAINSCREEN.onSuspend_Click();']")
	public static WebElement SuspendBtn;
	
	@FindBy(xpath = "//*[@id='Id_BatchReservation_FGrid_body']/tr[1]/td")
	public static List<WebElement> reserve_BatchPopupRow1List;
	
	
	@FindBy(xpath = "//*[@id='Id_BatchReservation_FGrid_col_1-2']")
	public static WebElement batchPopupRow1Pick;
	
	@FindBy(xpath = "//*[@id='btnPickQuantity']")
	public static WebElement reservePickicon;
	
	@FindBy(xpath = "//*[@onclick='RESERVATION.CancelReservation();']")
	public static WebElement reserveDiscardBtn;
	
	@FindBy(xpath = "//*[@onclick='RESERVATION.GetReservationData();']")
	public static WebElement reserveOkBtn;
	

	@FindBy(xpath="//input[@id='id_body_33554460']")
	public static WebElement  enter_SOAQ;

	@FindBy(xpath="//input[@id='id_body_33554461']")
	public static WebElement  enter_SOFQ;


	
	


	@FindBy(xpath = "//*[@id='divModal_properties']/div[2]/table/tbody/tr[1]/td/label/span")
	public static WebElement dontMaintainStockbyBatchCheckbox;

	@FindBy(xpath = "//*[@id='divModal_properties']/div[2]/table/tbody/tr[2]/td/label/span")
	public static WebElement dontinputBinCheckbox;

	@FindBy(xpath = "//*[@id='divModal_properties']/div[2]/table/tbody/tr[3]/td/label/span")
	public static WebElement dontMaintainStocksByRMACheckbox;

	@FindBy(xpath = "//*[@id='divModal_properties']/div[2]/table/tbody/tr[2]/td/label/span")
	private static WebElement PropertiesDontMaintainStockbyBatchChekbox;

	@FindBy(xpath = "//*[@id='divBtnGroup1']")
	public static WebElement unitsTab;

	@FindBy(xpath = "//*[@id='divBtnGroup1']")
	public static WebElement accMastersettingTAB;

	@FindBy(xpath = "//*[@id='iPaymentTerms']")
	public static WebElement accMastersettingTAB_PayTermsTxt;

	@FindBy(xpath = "//input[@id='iDefaultBaseUnit']")
	public static WebElement unitsTxt;

	@FindBy(xpath = "//a[@id='8001']")
	public static WebElement pointOFSaleMenu;

	@FindBy(xpath = "//a[@id='1150']")
	public static WebElement pointOFSale_CategoryMenu;

	@FindBy(xpath = "//*[@id='btnPropOk']")
	public static WebElement ItemPropertiesOkBtn;

	@FindBy(xpath = "//*[@id='navbarSupportedContent2']/ul/li[3]/a/i")
	public static WebElement CloseBtn;

	@FindBy(xpath = "//input[@id='cmbUserTypeMaster']")
	public static WebElement mastercmbMasterTxt;

	@FindBy(xpath = "//*[@id='btnMasterEdit']")
	public static WebElement masterEditBtn;

//RMA POpup Window
	@FindBy(xpath = "//div[@id='Modal_Header']/h5")
	public static WebElement rmaScreenTitle;

	@FindBy(xpath = "//input[@id='txtSerialNo']")
	public static WebElement rmaSerialNumberTxtField;

	@FindBy(xpath = "//i[@id='sp_search']")
	public static WebElement rmaSearchGridField;

	@FindBy(xpath = "//*[@id='RMASearchTable']/tbody/tr/td[2]")
	public static List<WebElement> rmaSerialNos;

	@FindBy(xpath = "//*[@id='RMASearchTable']/tbody/tr/td/input")
	public static List<WebElement> rmaSerialNoCheckBoxes;

	@FindBy(xpath = "//*[@id='RMA_Table_body']/tr/td[2]")
	public static List<WebElement> rmaSerialNoList;

	@FindBy(xpath = "//input[@id='chkSelectALL']")
	public static WebElement searchRmaSelectAllGridCheckBox;

	@FindBy(xpath = "(//button[@id='div_OK'])[2]")
	public static WebElement searchRmaOkBtn;

	@FindBy(xpath = "//input[@id='txtQuantity']")
	public static WebElement rmaQuantityTxtField;

	@FindBy(xpath = "//i[@class='icon icon-add']")
	public static WebElement rmaAddBtn;

	@FindBy(xpath = "//button[@id='div_OK']")
	public static WebElement RMAPopupOkBtn;

	// Changes After Suite Completion

	@FindBy(xpath = "//*[@id='id_transactionentry_summary']/div/div[2]/div/span")
	public static WebElement vouEntryPage_FooterExpandBtn;

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement vendorAccounttxt;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement purchaseDatetxt;

	@FindBy(xpath = "//input[@id='id_header_3']")
	public static WebElement purchasesAccounttxt;

	@FindBy(xpath = "//input[@id='id_header_268435459']")
	public static WebElement purchasesDepartmenttxt;

	@FindBy(xpath = "//input[@id='id_body_536870916']")
	public static WebElement enterWarehousettxt;

	@FindBy(xpath = "//input[@id='id_body_23']")
	public static WebElement enterItemttxt;
	
	@FindBy(xpath = "//*[@id='id_body_23_container']//tr/td[2]")
	public static List<WebElement> itemtxt123;

	@FindBy(xpath = "//input[@id='id_body_26']")
	public static WebElement enterQuantitytxt;

	@FindBy(xpath = "//input[@id='id_body_27']")
	public static WebElement enterRatetxt;

	@FindBy(xpath = "//input[@id='id_body_13']")
	public static WebElement enterBatchtxt;

	@FindBy(xpath = "//input[@id='id_body_38']")
	public static WebElement enterRmatxt;

	@FindBy(xpath = "//*[@id='id_transaction_bins_grid_body']/tr//td")
	public static List<WebElement> binInwardGridList;

	@FindBy(xpath = "//*[@id='RMA_Table_body']/tr/td[2]")
	public static List<WebElement> RMAInwardPopUpCol1;

	@FindBy(xpath = "//*[@id='RMA_Table_body']/tr/td[3]")
	public static List<WebElement> RMAInwardPopUpCol2;

	@FindBy(xpath = "//*[@class='icon-settings hiconright2']")
	public static WebElement vouHomePage_settingsBtn;

	@FindBy(xpath = "//textarea[@id='id_body_16777279']")
	public static WebElement enterBatCodetxt;

	@FindBy(xpath = "//*[@id='navigationtab2']/div")
	public static WebElement vouSetting_MicellaneousTab;

	@FindBy(xpath = "//*[@id='misc_currencyPostExgRateDiff']")
	public static WebElement miscel_PostDiffExchangeRateChkboxIsSelected;

	@FindBy(xpath = "//*[@id='misc_currencyPostExgRateDiff']/following-sibling::span")
	public static WebElement miscel_PostDiffExchangeRateChkbox;
	
	@FindBy(xpath = "//*[@id='misc_currencyPostExgRateDiff']")
	public static WebElement miscel_PostDiffExchangeRateIsSelected;
	
	
	

	@FindBy(xpath = "//*[@id='chkMaintainARTransactionCurrencies']/following-sibling::span")
	public static WebElement miscel_MaintainARTransactionCurrencies;

	@FindBy(xpath = "//*[@id='chkMaintainAPTransactionCurrencies']/following-sibling::span")
	public static WebElement miscel_chkMaintainAPTransactionCurrencies;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_head']/tr/th/div")
	public static List<WebElement> vouEntryPage_BodyGridHeadList;

	@FindBy(xpath = "//*[@id='navigationtab2']")
	public static WebElement miscellaneousTabInDC;

	@FindBy(xpath = "(//*[@id='panelsStayOpen-headingThree']/button)[2]")
	public static WebElement mis_CurrencyExpBtn;

	@FindBy(xpath = "//*[@id='2027']/span")
	public static WebElement creditNotesVoucher;

	@FindBy(xpath = "//input[@id='id_body_536870915']")
	public static WebElement enterPaymentsDepTxt;

	@FindBy(xpath = "//*[@id='2032']/span")
	public static WebElement journalsEntriesVoucher;

	@FindBy(xpath = "//*[@id='id_header_67109041']")
	public static WebElement headerExchangeDiffTxt;

	@FindBy(xpath = "//*[@id='id_header_67109042']")
	public static WebElement headerLocExchangeDiffTxt;

	@FindBy(xpath = "(//*[@id='17'])[2]")
	public static WebElement extMODMenu;

	@FindBy(xpath = "//*[@id='cmbOnEvent_VT_0_4']")
	public static WebElement extMOD_OnEvntMthdDrpDwn;

	@FindBy(xpath = "//*[@id='cmbModuleType_VT_0_4']")
	public static WebElement extMOD_ModuleTypeDepDwn;

	@FindBy(xpath = "//*[@id='txtModuleName_VT_0_4']")
	public static WebElement extMOD_ModuleNametxt;

	@FindBy(xpath = "//*[@id='cmbClassname_VT_0_4']")
	public static WebElement extMOD_ClassName;

	@FindBy(xpath = "//*[@id='idFunctionName_VT_0_4']")
	public static WebElement extMOD_FunctionNameTxt;

	@FindBy(xpath = "//*[@id='txtMenuName_VT_0_4']")
	public static WebElement extMOD_HomeMenu;

	@FindBy(xpath = "//*[@id='txtButtonCaption_VT_0_4']")
	public static WebElement extMOD_CaptionTxt;

	@FindBy(xpath = "//*[@id='btnOnMenu_VT_0_4']")
	public static WebElement extMOD_MenusExpBtn;

	@FindBy(xpath = "//*[@id='btnInsert_VT_0_4']")
	public static WebElement extMOD_InsertBtn;

	@FindBy(xpath = "//*[@id='btnRemove_VT_0_4']")
	public static WebElement extMOD_RemoveBtn;

	@FindBy(xpath = "//*[@id='MenuTree']/li/a/span")
	public static List<WebElement> extMOD_MenuPopUpList;

	@FindBy(xpath = "//*[@id='MenuTree']/li/a/i")
	public static List<WebElement> extMOD_MenuPopUpExpBtnList;

	@FindBy(xpath = "(//*[@id='id_menu_tree_137']/a/span)[2]")
	public static WebElement extMOD_PopupInvTransMenu;

	@FindBy(xpath = "//*[@id='dvMenu_VT_0_4']/div[2]/div/div[3]/div/input[1]")
	public static WebElement extMOD_PopupOkbtn;

	// External modules

	@FindBy(xpath = "//select[@id='cmbOnEvent_VT_0_4']")
	public static WebElement extMOD_OnEventDrpdwn;

	@FindBy(xpath = "//select[@id='cmbModuleType_VT_0_4']")
	public static WebElement extMOD_ModuleTypeDrpdwn;

	@FindBy(xpath = "//select[@id='cmbClassname_VT_0_4']")
	public static WebElement extMOD_CLassNameDrpdwn;

	@FindBy(xpath = "//input[@id='txtModuleName_VT_0_4']")
	public static WebElement extMOD_ModuleNAmeTXt;

	@FindBy(xpath = "//select[@id='cmbFunctionName_VT_0_4']")
	public static WebElement extMOD_FunctionNAmeDrpdwn;

	@FindBy(xpath = "//*[@id='extBody_VT_0_4']/tr[1]/td[1]/input")
	public static WebElement extMOD_GridRow1Chkbox;

	@FindBy(xpath = "//*[@id='id_ExtModuleTable']/thead/tr/th")
	public static List<WebElement> extMOD_BodyGridList;

	@FindBy(xpath = "//*[@id='extBody_VT_0_4']/tr[1]/td")
	public static List<WebElement> extMOD_GridRow1List;

	@FindBy(xpath = "//*[@id='extBody_VT_0_4']/tr[2]/td")
	public static List<WebElement> extMOD_GridRow2List;

	@FindBy(xpath = "//*[@id='extBody_VT_0_4']/tr[3]/td")
	public static List<WebElement> extMOD_GridRow3List;

	@FindBy(xpath = "//*[@id='extBody_VT_0_4']/tr")
	public static List<WebElement> extMOD_GridRowCount;

	@FindBy(xpath = "//*[@id='selectAllMasters_']//..//span")
	public static WebElement sl_SelectAllItemsChkBox;

	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[1]/td")
	public static List<WebElement> reportRow1List;

	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[2]/td")
	public static List<WebElement> reportRow2List;

	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[3]/td")
	public static List<WebElement> reportRow3List;

	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[4]/td")
	public static List<WebElement> reportRow4List;

	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[5]/td")
	public static List<WebElement> reportRow5List;

	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[6]/td")
	public static List<WebElement> reportRow6List;

	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[7]/td")
	public static List<WebElement> reportRow7List;
	
	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[8]/td")
	public static List<WebElement> reportRow8List;
	
	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[9]/td")
	public static List<WebElement> reportRow9List;
	
	@FindBy(xpath = "//*[@id='dvReportDetails']/div/table/tbody/tr[10]/td")
	public static List<WebElement> reportRow10List;
	
	@FindBy(xpath="//*[@id='ReorderLevel']")
	public static WebElement checkReorderlevelChkBox;
	
	@FindBy(xpath="//*[@id='ReorderLevel']/../span")
	public static WebElement checkReorderlevelChkBoxSelected;
	
	@FindBy(xpath="//*[@id='Id_StockReservation_FGrid_body']//tr[1]//td[5]")
	public static WebElement enterStdReservationCol;
	
	@FindBy(xpath="//input[@id='txtQtyToReserve']")
	public static WebElement enter_QtyToReserve;
	
	@FindBy(xpath="//*[@id='140']")
	public static WebElement  inventoryTransactionsSalesMenu; 
	
	@FindBy(xpath="//input[@id='txtNewReference']")
	public static WebElement newReferenceTxt;
	
	@FindBy(xpath="//*[@id=\"id_footer\"]/strong")
	public static WebElement companyNameTxt;
	

}
