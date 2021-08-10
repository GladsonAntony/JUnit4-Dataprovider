package examples.example1;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @Author Gladson Antony
 * @Date 2021-08-11T00:02:30.293Z
 */

@RunWith(DataProviderRunner.class)
public class Test1 {

    @DataProvider
    public static Object[][] dataProviderAdd() {
        return new Object[][]{{0, 0, 0}, {1, 1, 2}, {1, 2, 1}};
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