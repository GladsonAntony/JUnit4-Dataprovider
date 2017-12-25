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
public class Test3 
{
	
	@DataProvider
	public static Object[][] multiSheetExcelRead(FrameworkMethod method) throws Exception
	{
		File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
		String SheetName = method.getName();
		System.out.println(SheetName);
		Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
		return testObjArray;
	}
	
	@UseDataProvider("multiSheetExcelRead")
	@Test
	public void testAdd(Double a, Double b, Double expected) throws Exception
	{
		Double result = a + b;
		assertEquals(expected, result);
	}

}
