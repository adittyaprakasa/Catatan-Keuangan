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



Mobile.tap(findTestObject('Object Repository/button_Tambah'), 0)

Mobile.tap(findTestObject('Object Repository/tab_Pengeluaran'), 0)

Mobile.tap(findTestObject('Object Repository/input_Tanggal'), 0)

Date date = new Date()

getTanggal = date.format('dd')

hari_ini = getTanggal.toInteger()

println(hari_ini)

besok = (hari_ini + 1)

if (besok == 32) {
    besok = 1

    println(besok)
} else {
    besok = besok

    println(besok)
}

tanggal = besok

Mobile.tap(findTestObject('Object Repository/input_Number', [('date') : "$tanggal"]), 0)

Mobile.tap(findTestObject('Object Repository/button_OK'), 0)

Mobile.tap(findTestObject('Object Repository/dropdownCategory'), 0)

Mobile.scrollToText('Belanja', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView - Belanja'), 0)

Mobile.setText(findTestObject('Object Repository/input_Jumlah'), '2000', 0)

Mobile.setText(findTestObject('Object Repository/input_Keterangan'), 'Belanja', 0)

Mobile.tap(findTestObject('Object Repository/button_Simpan'), 0)

 

