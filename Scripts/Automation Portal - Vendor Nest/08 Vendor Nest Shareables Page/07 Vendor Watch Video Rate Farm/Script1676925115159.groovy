import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Email Address'), 
    GlobalVariable.VendorEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Password'), 
    GlobalVariable.EncryptPass)

WebUI.click(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Submit btn'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Home/h3_Shareables'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Shareables'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Shareables library/h2_Browse Shareables'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables library/div_Share now'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables library/div_Rate Farm'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Shareables/h2_1. What would you like to share'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Shareables/div_Questions Watch a demo'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/svg'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/div_Mozilla Firefox_w-vulcan--background w-_45253b'))

WebUI.delay(5)

WebUI.closeBrowser()

