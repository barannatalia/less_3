package test.java.lesson5;

import main.java.home_task.homeTask_4.HomeTask_2;
import main.java.home_task.homeTask_4.HomeTask_5;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Test_homeTask_TestNG_2 {

    @Test
    public void getPrintName() {
        String name = "Natalia";
        String actualName = HomeTask_2.printName(name);
        int actualLengthPrintString = actualName.length() - 5;             //5 - кількість '\n'
        int expectedLengthPrintString = (name + " ").length() * 10 * 5;    // 10 - кількість імен в стрічці, 5 - кількість стрічок
        assertEquals(
                actualLengthPrintString,
                expectedLengthPrintString,
                "Expected Length: " + expectedLengthPrintString + ", but actual Length: " + actualLengthPrintString);
    }



}
