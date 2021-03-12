package com.fb180.util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebElement
import org.openqa.selenium.NoSuchElementException
import internal.GlobalVariable

import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class myUtil {

	@Keyword
	def myCheckbox1(TestObject obj, String option) {
		String [] extract = null
		if(!option.isEmpty())
			extract  = option.split(",");
		try {
			if (extract.length >0) {
				List<WebElement> checkBox1 = WebUiCommonHelper.findWebElements(obj, 20);
				for (int i = 0; i < extract.length; i++){
					if (extract[i].equalsIgnoreCase("ON")){
						checkBox1.get(i).click();
					}
				}
				return KeywordUtil.markPassed("checkbox selected Pass");
			}
		} catch(NoSuchElementException e){
			return KeywordUtil.markFailed+ " - Could not find checkbox  Locator not found";
		}
		catch(Exception e){
			return KeywordUtil.markFailed+ " - Could not click checkboxd";
		}
	}
}
