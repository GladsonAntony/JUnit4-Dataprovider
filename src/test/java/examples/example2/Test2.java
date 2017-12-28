/**
 * @Author Gladson Antony
 * @Date 28-Dec-2017 
 * @Time 7:40:18 PM
 */

package examples.example2;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import utils.ExcelUtils;

@RunWith(DataProviderRunner.class)
public class Test2 
{
	@DataProvider
	public static Object[][] excelSheetNameAsMethodName(FrameworkMethod method) throws Exception
	{
		File file = new File("./src/test/resources/Excel Files/"+method.getName()+".xlsx");
		System.out.println("Opening Excel File:" +file.getAbsolutePath());
		Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath());
		return testObjArray;
	}
	
	@Test
	@UseDataProvider("excelSheetNameAsMethodName")
	public void testAdd(Double a, Double b, Double expected) 
	{
		Double result = a + b;
		assertEquals(expected, result);
	}
}
