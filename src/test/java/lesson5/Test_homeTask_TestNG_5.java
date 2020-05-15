package test.java.lesson5;

import main.java.home_task.homeTask_4.HomeTask_5;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test_homeTask_TestNG_5 {

    @Parameters({"str"})
    @Test
    public void getReverseString(@Optional("Hello world!!!") String str) {
        String actualString = HomeTask_5.reverseString(str);
        String expectedString = new StringBuffer(str).reverse().toString();
        assertEquals(
                actualString,
                expectedString,
                "Expected value: " + expectedString + ", but actual value: " + actualString);
    }
}
