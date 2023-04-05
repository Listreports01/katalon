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

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables library/div_Weekly Talking Points'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Shareables/textarea_Select a template_personal_info'), 
    't')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Shareables/input_test_MuiBox-root jss1113 sc-eHgmQL fE_bdd5c0'), 
    '90001')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/span_Add'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/span_Share'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/svg_Mozilla Firefox_MuiSvgIcon-root MuiSvgI_bf137c'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/div_Share'))

WebUI.navigateToUrl('https://www.facebook.com/login.php?skip_api_login=1&api_key=966242223397117&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fsharer.php%3Fu%3Dhttp%253A%252F%252Flstrep.co%252FqaThWzMPK4&cancel_url=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Fclose_window%2F%3Fapp_id%3D966242223397117%26connect%3D0%23_%3D_&display=popup&locale=en_US')

WebUI.delay(5)

WebUI.closeBrowser()

