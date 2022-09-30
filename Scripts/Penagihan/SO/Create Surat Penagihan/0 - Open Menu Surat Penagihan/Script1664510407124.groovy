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

CustomKeywords.'commonTest.star.openLoginSO'()

CustomKeywords.'commonTest.star.loginAFSOSO'()

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Create Surat Penagihan/Page_STAR - System Terintegrasi Astra Motor/button_Dashboard_ant-btn ant-btn-default an_9f88f2'))

WebUI.scrollToElement(findTestObject('Object Repository/Create Surat Penagihan/Page_STAR - System Terintegrasi Astra Motor/div_Penagihan'), 
    0)

WebUI.click(findTestObject('Object Repository/Create Surat Penagihan/Page_STAR - System Terintegrasi Astra Motor/div_Penagihan'))

WebUI.click(findTestObject('Object Repository/Create Surat Penagihan/Page_STAR - System Terintegrasi Astra Motor/div_Kuitansi Penagihan'))

WebUI.click(findTestObject('Object Repository/Create Surat Penagihan/Page_STAR - System Terintegrasi Astra Motor/a_Surat Penagihan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Surat Penagihan/Page_STAR - System Terintegrasi Astra Motor/p_Surat Penagihan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Surat Penagihan/Page_STAR - System Terintegrasi Astra Motor/div_Data SelectionTipe DataPilih Kode'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Surat Penagihan/Page_STAR - System Terintegrasi Astra Motor/div_Item DetailsAdd From ListDelete'), 
    0)

WebUI.closeBrowser()

