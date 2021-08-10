package examples.example3;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;
import utils.ExcelUtils;

import java.io.File;

/**
 * @Author Gladson Antony
 * @Date 2021-08-11T00:04:42.165Z
 */

@RunWith(DataProviderRunner.class)
public class ExcelDataProvider {
    @DataProvider
    public static Object[][] excelSheetNameAsMethodName(FrameworkMethod method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/" + method.getName() + ".xlsx");
        System.out.println("\nReading Excel File\n" + file.getAbsolutePath());
        return ExcelUtils.getTableArray(file.getAbsolutePath());
    }

    @DataProvider
    public static Object[][] multiSheetExcelRead(FrameworkMethod method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
        String SheetName = method.getName();
        System.out.println("\nReading Excel File\n" + file.getAbsolutePath());
        System.out.println("Reading Sheet Name- > " + SheetName);
        return ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
    }
}
