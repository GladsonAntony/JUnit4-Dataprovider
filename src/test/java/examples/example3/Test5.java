/**
 * @Author Gladson Antony
 * @Date 28-Dec-2017 
 * @Time 8:05:03 PM
 */

package examples.example3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class Test5
{
	@UseDataProvider(value="multiSheetExcelRead", location=ExcelDataProvider.class)
	@Test
	public void testAdd(Double a, Double b, Double expected) throws Exception
	{
		Double result = a + b;
		assertEquals(expected, result);
	}
		
	@Test
	@UseDataProvider(value="excelSheetNameAsMethodName",location=ExcelDataProvider.class)
	public void testAdd_Copy(Double a, Double b, Double expected) 
	{
		Double result = a + b;
		assertEquals(expected, result);
	}
}
