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

String closeC =' '

//row = 4

xlsxData = findTestData('TestData')

for (int row = 1; row <= xlsxData.getRowNumbers(); row++) {
	
println(row)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(xlsxData.getValue('url', row))

WebUI.waitForPageLoad(GlobalVariable.time)

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/00_WelcomePage.png')

WebUI.click(findTestObject('btn_start'))
closeC = xlsxData.getValue('Q1',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('votescore', [('rowNo') : '1', ('vote') : xlsxData.getValue('Q1', row)]))

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/01_Page1.png')

WebUI.click(findTestObject('btn_next'))

closeC = xlsxData.getValue('Q2',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
if (xlsxData.getValue('Q1', row).equalsIgnoreCase("1")||xlsxData.getValue('Q1', row).equalsIgnoreCase("2")){
CustomKeywords.'com.fb180.util.myUtil.myCheckbox1'(findTestObject('Object Repository/checkbox'), xlsxData.getValue('Q2', 
        row))

String[] extract1 = xlsxData.getValue('Q2', row).split(',')

if ((extract1[7]) == 'ON') {
	closeC = xlsxData.getValue('Q2_Other',  row)
	if(closeC == 'close') {
	  WebUI.closeBrowser()
	  closeC =''
	  continue
	}
    WebUI.setText(findTestObject('Object Repository/input_otherText'), xlsxData.getValue('Q2_Other', row))
}

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/02_Page2.png')

WebUI.click(findTestObject('btn_next'))
}

if (xlsxData.getValue('Q1', row).equalsIgnoreCase("4")||xlsxData.getValue('Q1', row).equalsIgnoreCase("5")){
	CustomKeywords.'com.fb180.util.myUtil.myCheckbox1'(findTestObject('Object Repository/checkbox'), xlsxData.getValue('Q3',
			row))
	
	String[] extract1 = xlsxData.getValue('Q3', row).split(',')
	
	if ((extract1[7]) == 'ON') {
		closeC = xlsxData.getValue('Q3_Other',  row)
		if(closeC == 'close') {
		  WebUI.closeBrowser()
		  closeC =''
		  continue
		}
		WebUI.setText(findTestObject('Object Repository/input_otherText'), xlsxData.getValue('Q3_Other', row))
	}
	
	WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/02_Page2.png')
	
	WebUI.click(findTestObject('btn_next'))
	}

closeC = xlsxData.getValue('Q4',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.setText(findTestObject('Object Repository/input_textarea'), xlsxData.getValue('Q4', row))

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/03_Page3.png')

WebUI.click(findTestObject('btn_next'))

closeC = xlsxData.getValue('Q5',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('votescore', [('rowNo') : '1', ('vote') : xlsxData.getValue('Q5', row)]))

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/04_Page4.png')

WebUI.click(findTestObject('btn_next'))

closeC = xlsxData.getValue('Q6',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_choice', [('rowNo') : '1', ('choice') : xlsxData.getValue('Q6', row)]))

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/05_Page5.png')

WebUI.click(findTestObject('btn_next'))

closeC = xlsxData.getValue('Q7',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.selectOptionByLabel(findTestObject('dropdown_list', [('rowNo') : '1']), xlsxData.getValue('Q7', row), true)

closeC = xlsxData.getValue('Q8',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.selectOptionByLabel(findTestObject('dropdown_list', [('rowNo') : '2']), xlsxData.getValue('Q8', row), true)

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/06_Page6.png')

WebUI.click(findTestObject('btn_next'))

closeC = xlsxData.getValue('Q9',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_choice', [('rowNo') : '1', ('choice') : xlsxData.getValue('Q9', row)]))

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/07_Page7.png')

WebUI.click(findTestObject('btn_next'))

if (xlsxData.getValue('Q9', row).equalsIgnoreCase('2')) {
	
	closeC = xlsxData.getValue('Q9_1',  row)
	if(closeC == 'close') {
	  WebUI.closeBrowser()
	  closeC =''
	  continue
	}
    WebUI.selectOptionByLabel(findTestObject('dropdown_list', [('rowNo') : '1']), xlsxData.getValue('Q9_1', row), true)

	closeC = xlsxData.getValue('Q9_2',  row)
	if(closeC == 'close') {
	  WebUI.closeBrowser()
	  closeC =''
	  continue
	}
    WebUI.selectOptionByLabel(findTestObject('dropdown_list', [('rowNo') : '2']), xlsxData.getValue('Q9_2', row), true)

    WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/08_Page8.png')

    WebUI.click(findTestObject('btn_next'))
}

closeC = xlsxData.getValue('Q10',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
CustomKeywords.'com.fb180.util.myUtil.myCheckbox1'(findTestObject('Object Repository/checkbox'), xlsxData.getValue('Q10', 
        row))

String[] extract2 = xlsxData.getValue('Q10', row).split(',')

if ((extract2[8]) == 'ON') {
	
	closeC = xlsxData.getValue('Q10_Other',  row)
	if(closeC == 'close') {
	  WebUI.closeBrowser()
	  closeC =''
	  continue
	}
    WebUI.setText(findTestObject('Object Repository/input_otherText'), xlsxData.getValue('Q10_Other', row))
}

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/09_Page9.png')

WebUI.click(findTestObject('btn_next'))

closeC = xlsxData.getValue('Q11',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_choice', [('rowNo') : '1', ('choice') : xlsxData.getValue('Q11', row)]))

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/10_Page10.png')

WebUI.click(findTestObject('btn_next'))

closeC = xlsxData.getValue('Q12',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.setText(findTestObject('input_text', [('rowNo') : '1']), xlsxData.getValue('Q12', row))

closeC = xlsxData.getValue('Q13',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.setText(findTestObject('input_text', [('rowNo') : '2']), xlsxData.getValue('Q13', row))

closeC = xlsxData.getValue('Q14',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.setText(findTestObject('input_text', [('rowNo') : '3']), xlsxData.getValue('Q14', row))

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/11_Page11.png')

WebUI.click(findTestObject('btn_next'))

WebUI.delay(3)

WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/12_ThankyouPage.png')

WebUI.closeBrowser()

}
