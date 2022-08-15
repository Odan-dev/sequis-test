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

WebUI.navigateToUrl('https://app.sequis.co.id/')

WebUI.switchToWindowTitle('Sequis App')

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/button_MULAI CARI AGEN UNTUK SAYA'))

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/div_Pilih provinsi'))

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/div_DKI JAKARTA'))

WebUI.click(findTestObject('WebSpy/Page_Sequis App/button_PILIH1'))

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/div_Pilih kota'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/div_KOTA ADM. JAKARTA BARAT'))

WebUI.click(findTestObject('WebSpy/Page_Sequis App/button_PILIH2'))

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/button_LANJUTKAN'))

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/button_Pilih (1)'))

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/button_LANJUTKAN'))

WebUI.setText(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/input_Bapak_inlineFormInputGroup'), 'test')

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/button_LANJUTKAN'))

WebUI.setText(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/input_Hi, bapak test , mohon masukkan nomor_8714e3'), 
    '123412341234')

WebUI.click(findTestObject('Object Repository/Step4_Valid/Page_Sequis App/button_LANJUTKAN'))

WebUI.closeBrowser()

