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

WebUI.navigateToUrl('https://stage.listreports.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Login/Login_Email_Username'), 'mn.flores+agent06@listreports.com')

WebUI.setEncryptedText(findTestObject('Marbz Portal/Page_ListReports  Login/Login_Email_Password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Login/Login_Page_Submit_Button'))

WebUI.delay(10)

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Home/Listpacks_click'))

WebUI.delay(5)

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/ListPacks_My ListPacks_Tab'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_ListPacks created_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_ListPacks shared_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Total clicks_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Listing viewed_Verify Text'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Search by ListPacks name'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Search by ListPacks name'), 'ListPacks')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Search button'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_ListPacks_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Last Shared_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Clicks_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Listing viewed_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Market Area_Verify Text'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Menu button for Edit and Delete'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Edit_btn'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  ListPack/My ListPacks_ListPack Name_etextbox'), 'ListPacks Updated')

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  ListPack/My ListPacks_Description'), 'Write a quick descripton for this ListPack for your personal reference.')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPack/My ListPacks_Edit_Save button'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPack/My ListPacks_Questions on how'))

WebUI.delay(5)

WebUI.closeBrowser()

