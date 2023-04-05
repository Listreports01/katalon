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

WebUI.setText(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Login/Agent Email'), GlobalVariable.AgentNestUser)

WebUI.setText(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Login/Agent Password'), 
    GlobalVariable.DecryptPass)

WebUI.click(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Login/Agent Submit'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Home/ListReports Logo'))

WebUI.click(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Home/Marketing Kits Page'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ListReports  Marketing Kits/Marketing Kits Text'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Marketing Kits/New Marketing Kit btn'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  New ListReport/Property Address TBox'), '90001')

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/90001 Hoey Chapel Option'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/span_I affirm that I am the listing agent a_3776e9'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ListReports  New ListReport/Congratulations Text'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ListReports  New ListReport/You have successfully requested a new Text'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/Marketing Kit Ok btn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ListReports  Marketing Kits/Marketing Kits Text'))

WebUI.delay(5)

WebUI.closeBrowser()

