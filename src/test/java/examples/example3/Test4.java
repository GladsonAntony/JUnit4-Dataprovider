package examples.example3;

import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author Gladson Antony
 * @Date 2021-08-11T00:05:08.944Z
 */

public class Test4 extends ExcelDataProvider {
    @UseDataProvider("multiSheetExcelRead")
    @Test
    public void testAdd(Double a, Double b, Double expected) {
        Double result = a + b;
        assertEquals(expected, result);
    }


    @Test
    @UseDataProvider("excelSheetNameAsMethodName")
    public void testAdd_Copy(Double a, Double b, Double expected) {
        Double result = a + b;
        assertEquals(expected, result);
    }

}
