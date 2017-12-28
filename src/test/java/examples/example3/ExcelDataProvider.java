/**
 * @Author Gladson Antony
 * @Date 28-Dec-2017 
 * @Time 7:40:18 PM
 */

package examples.example3;

import java.io.File;

import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

import utils.ExcelUtils;

@RunWith(DataProviderRunner.class)
public class ExcelDataProvider 
{
	@DataProvider
	public static Object[][] excelSheetNameAsMethodName(FrameworkMethod method) throws Exception
	{
		File file = new File("./src/test/resources/Excel Files/"+method.getName()+".xlsx");
		System.out.println("\nReading Excel File\n" +file.getAbsolutePath());
		Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath());
		return testObjArray;
	}
	
	@DataProvider
	public static Object[][] multiSheetExcelRead(FrameworkMethod method) throws Exception
	{
		File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
		String SheetName = method.getName();
		System.out.println("\nReading Excel File\n" +file.getAbsolutePath());
		System.out.println("Reading Sheet Name- > " +SheetName);
		Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
		return testObjArray;
	}
}
