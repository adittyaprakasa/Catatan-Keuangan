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



pemasukan = Mobile.getText(findTestObject('Cek Saldo/text_Pemasukan'), 0)

pengeluaran = Mobile.getText(findTestObject('Cek Saldo/textPengeluaran'), 0)

saldo = Mobile.getText(findTestObject('Cek Saldo/text_Saldo'), 0)

nominal = WebUI.callTestCase(findTestCase('Pengeluaran/Hari Ini/Pengeluaran Hari Ini - Asuransi'), [:], FailureHandling.STOP_ON_FAILURE)

pemasukan = pemasukan.replace('.', '')

pemasukan = pemasukan.toInteger()

println(pemasukan)

pengeluaran = pengeluaran.replace('.', '')

pengeluaran = pengeluaran.toInteger()

println(pengeluaran)

saldo = saldo.replace('.', '')

saldo = saldo.toInteger()

pengeluaranAkhir = pengeluaran + nominal

saldoAkhir = (pemasukan - pengeluaranAkhir)

pengeluaranAkhir1 = pengeluaranAkhir.toString()

println pengeluaranAkhir 

saldoAkhir = saldoAkhir.toString()

println(saldoAkhir)

//Get pemasukan pengeluaran dan saldo terbaru
newPemasukan = Mobile.getText(findTestObject('Cek Saldo/text_Pemasukan'), 0)

newPengeluaran = Mobile.getText(findTestObject('Cek Saldo/textPengeluaran'), 0)

newSaldo = Mobile.getText(findTestObject('Cek Saldo/text_Saldo'), 0)

newPengeluaran = newPengeluaran.replace('.', '')

newSaldo = newSaldo.replace('.', '')

println(saldo)

Mobile.verifyMatch(saldoAkhir, newSaldo, false)

Mobile.verifyMatch(pengeluaranAkhir1, newPengeluaran, false)

