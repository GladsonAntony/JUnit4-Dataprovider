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
 * @Date 2021-08-11T00:02:30.293Z
 */

@RunWith(DataProviderRunner.class)
public class Test2 {
    @DataProvider
    public static Object[][] excelSheetNameAsMethodName(FrameworkMethod method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/" + method.getName() + ".xlsx");
        System.out.println("Opening Excel File:" + file.getAbsolutePath());
        return ExcelUtils.getTableArray(file.getAbsolutePath());
    }

    @Test
    @UseDataProvider("excelSheetNameAsMethodName")
    public void testAdd(Double a, Double b, Double expected) {
        Double result = a + b;
        assertEquals(expected, result);
    }
}
