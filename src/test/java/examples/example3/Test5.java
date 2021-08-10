package examples.example3;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @Author Gladson Antony
 * @Date 2021-08-11T00:05:27.492Z
 */

@RunWith(DataProviderRunner.class)
public class Test5 {
    @UseDataProvider(value = "multiSheetExcelRead", location = ExcelDataProvider.class)
    @Test
    public void testAdd(Double a, Double b, Double expected) {
        Double result = a + b;
        assertEquals(expected, result);
    }

    @Test
    @UseDataProvider(value = "excelSheetNameAsMethodName", location = ExcelDataProvider.class)
    public void testAdd_Copy(Double a, Double b, Double expected) {
        Double result = a + b;
        assertEquals(expected, result);
    }
}
