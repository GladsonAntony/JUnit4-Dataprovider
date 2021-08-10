package examples.example2;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;
import utils.ExcelUtils;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * @Author Gladson Antony
 * @Date 2021-08-11T00:04:16.010Z
 */

@RunWith(DataProviderRunner.class)
public class Test3 {

    @DataProvider
    public static Object[][] multiSheetExcelRead(FrameworkMethod method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
        String SheetName = method.getName();
        System.out.println(SheetName);
        return ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
    }

    @UseDataProvider("multiSheetExcelRead")
    @Test
    public void testAdd(Double a, Double b, Double expected) {
        Double result = a + b;
        assertEquals(expected, result);
    }

}
