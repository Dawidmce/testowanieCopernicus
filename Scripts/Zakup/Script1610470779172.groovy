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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.click(findTestObject('Zakup/Page_STORE/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Zakup/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Zakup/Page_STORE/a_Cart'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Zakup/Page_STORE/button_Place Order'))

WebUI.waitForElementVisible(findTestObject('Zakup/Page_STORE/input_Name_name'), 3)

WebUI.setText(findTestObject('Zakup/Page_STORE/input_Name_name'), name)

WebUI.setText(findTestObject('Zakup/Page_STORE/input_Country_country'), country)

WebUI.setText(findTestObject('Zakup/Page_STORE/input_City_city'), city)

WebUI.setText(findTestObject('Zakup/Page_STORE/input_Credit card_card'), credit_card)

WebUI.setText(findTestObject('Zakup/Page_STORE/input_Month_month'), cardmonth)

WebUI.setText(findTestObject('Zakup/Page_STORE/input_Year_year'), cardyear)

WebUI.click(findTestObject('Zakup/Page_STORE/button_Purchase'))

