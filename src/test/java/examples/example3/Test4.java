/**
 * @Author Gladson Antony
 * @Date 28-Dec-2017 
 * @Time 7:40:18 PM
 */

package examples.example3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tngtech.java.junit.dataprovider.UseDataProvider;

public class Test4 extends ExcelDataProvider
{	
	@UseDataProvider("multiSheetExcelRead")
	@Test
	public void testAdd(Double a, Double b, Double expected) throws Exception
	{
		Double result = a + b;
		assertEquals(expected, result);
	}
	
	
	@Test
	@UseDataProvider("excelSheetNameAsMethodName")
	public void testAdd_Copy(Double a, Double b, Double expected) 
	{
		Double result = a + b;
		assertEquals(expected, result);
	}

}
