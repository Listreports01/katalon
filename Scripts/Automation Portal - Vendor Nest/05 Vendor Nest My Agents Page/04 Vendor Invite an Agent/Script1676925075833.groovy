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

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Home/p_Ah, my student loans How can I ever repay you'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_My Agents'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  My Agents/h1_My Agents'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Agents/span_Invite'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Agents/input_Invite Agent_autocompleteSearch'), 'Marben')

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  My Agents/em_Didnt find your Agent Add them here'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Agents/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Agents/input_Last Name_last_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Agents/input_Company_company'), 'Automation')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Agents/input_Email_email'), 'mn.flores+testauto@listreports.com')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Agents/input_Phone Number_phone'), '(321) 456 - 8520')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  My Agents/span_250 characters'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Agents/span_We regularly work together'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Agents/input_Last Name_last_name'), 'Test123')

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Agents/span_Invite'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  My Agents/h2_Invitation Sent'), 0)

WebUI.delay(5)

WebUI.closeBrowser()

