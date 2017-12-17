package example;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import utils.ExcelUtils;

@RunWith(DataProviderRunner.class)
public class Test2 
{
	@DataProvider
	public static Object[][] dataProviderAdd() throws Exception
	{
		File file = new File("src/test/resources/Excel Files/testAdd.xlsx");
		System.out.println("Opening Excel File:" +file.getAbsolutePath());
		Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath());
		return testObjArray;
	}
	
	@Test
	@UseDataProvider("dataProviderAdd")
	public void testAdd(String a, String b, String expected) {
		int result = Integer.parseInt(a) + Integer.parseInt(b);
		assertEquals(Integer.parseInt(expected), result);
	}

}
