package test.java.lesson5;

import main.java.home_task.homeTask_4.HomeTask_1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test_homeTask_DP_1 {

    @Test(dataProvider = "minimum")
    public void testMinimum(int a, int b, int c, int expectedValue) {
        int actualValue = HomeTask_1.minimum(a, b, c);
        assertEquals(
                actualValue,
                expectedValue,
                "Expected value: " + expectedValue + ", but actual value: " + actualValue);
    }

    @DataProvider(name = "minimum")
    public Object[][] getMinimum() {
        return new Object[][] {
                {9, 3, 5, 3},
                {9, 6, 5, 5},
                {9, 8, 6, 6},
                {1, 3, 5, 1},
                {4, 6, 5, 4},
        };
    }
}
