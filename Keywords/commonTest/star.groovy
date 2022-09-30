package commonTest

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class star {
	//Dealer option
	@Keyword
	def openLoginDealer() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.URL)

		WebUI.verifyElementPresent(findTestObject('Login/LoginDealer'), 3)

		WebUI.click(findTestObject('Login/LoginDealer'))

	}

	@Keyword
	def loginAFSODealer() {
		WebUI.setText(findTestObject('Login/Dealer Login/Username'), GlobalVariable.usernameAFSODealer)

		WebUI.setText(findTestObject('Login/Dealer Login/Password'), 'Star@demo123')

		WebUI.click(findTestObject('Login/Dealer Login/ButtonLogin'))

		WebUI.verifyElementPresent(findTestObject('Login/User Login Show'), 3)

		WebUI.getText(findTestObject('Login/User Login Show'))

		WebUI.verifyElementText(findTestObject('Login/User Login Show'), GlobalVariable.nameAFSODealer)
	}

	@Keyword
	def loginKasirDealer() {
		WebUI.setText(findTestObject('Login/Dealer Login/Username'), GlobalVariable.usernameKasirDealer)

		WebUI.setText(findTestObject('Login/Dealer Login/Password'), 'Star@demo123')

		WebUI.click(findTestObject('Login/Dealer Login/ButtonLogin'))

		WebUI.verifyElementPresent(findTestObject('Login/User Login Show'), 3)

		WebUI.getText(findTestObject('Login/User Login Show'))

		WebUI.verifyElementText(findTestObject('Login/User Login Show'), GlobalVariable.nameKasirDealer)
	}

	@Keyword
	def loginBranchHeadDealer() {
		WebUI.setText(findTestObject('Login/Dealer Login/Username'), GlobalVariable.usernameBranchHeadDealer)

		WebUI.setText(findTestObject('Login/Dealer Login/Password'), 'Star@demo123')

		WebUI.click(findTestObject('Login/Dealer Login/ButtonLogin'))

		WebUI.verifyElementPresent(findTestObject('Login/User Login Show'), 3)

		WebUI.getText(findTestObject('Login/User Login Show'))

		WebUI.verifyElementText(findTestObject('Login/User Login Show'), GlobalVariable.nameBranchHeadDealer)
	}

	//SO Option

	@Keyword
	def openLoginSO() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.URL)

		WebUI.verifyElementPresent(findTestObject('Login/LoginSO'), 3)

		WebUI.click(findTestObject('Login/LoginSO'))
	}

	@Keyword
	def loginAFSOSO() {
		WebUI.setText(findTestObject('Login/SO Login/Username'), 'tstafs01a000@ai.astra.co.id')

		WebUI.click(findTestObject('Login/SO Login/LoginButton'))

		WebUI.setText(findTestObject('Login/SO Login/Password'), 'Kanada@1050')

		WebUI.click(findTestObject('Login/SO Login/LoginButton'))

		WebUI.click(findTestObject('Login/SO Login/LoginButton'))

		WebUI.verifyElementPresent(findTestObject('Login/User Login Show'), 3)

		WebUI.getText(findTestObject('Login/User Login Show'))

		WebUI.verifyElementText(findTestObject('Login/User Login Show'), 'afso1')

	}

	@Keyword
	def loginKasirSO() {
		WebUI.setText(findTestObject('Login/SO Login/Username'), 'tstcsr01a000@ai.astra.co.id')

		WebUI.click(findTestObject('Login/SO Login/LoginButton'))

		WebUI.setText(findTestObject('Login/SO Login/Password'), 'Moskow@3043')

		WebUI.click(findTestObject('Login/SO Login/LoginButton'))

		WebUI.click(findTestObject('Login/SO Login/LoginButton'))

		WebUI.verifyElementPresent(findTestObject('Login/User Login Show'), 3)

		WebUI.getText(findTestObject('Login/User Login Show'))

		WebUI.verifyElementText(findTestObject('Login/User Login Show'), 'cashier1')

	}

}
