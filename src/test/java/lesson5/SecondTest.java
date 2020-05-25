package test.java.lesson5;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTest {

    @Parameters({"browser"})
    @Test
    public static void successLogin(@Optional("firefox") String browser) {
        System.out.println("Hello 2   " + browser);

    }
}
