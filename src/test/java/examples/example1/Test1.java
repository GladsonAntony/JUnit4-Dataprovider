/**
 * @Author Gladson Antony
 * @Date 28-Dec-2017 
 * @Time 7:40:18 PM
 */

package examples.example1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class Test1 {

	@DataProvider
	public static Object[][] dataProviderAdd() {
		return new Object[][] { { 0, 0, 0 }, { 1, 1, 2 }, { 1, 2, 1 } };
	}

	@Test
	@UseDataProvider("dataProviderAdd")
	public void testAdd(int a, int b, int expected) {
		// Given:

		// When:
		int result = a + b;

		// Then:
		assertEquals(expected, result);
	}
}