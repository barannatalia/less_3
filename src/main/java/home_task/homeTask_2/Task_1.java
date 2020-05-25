package main.java.home_task.homeTask_2;

import main.java.home_task.homeTask_4.HomeTask_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/* Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
*/
public class Task_1 {
    public static int min(int a, int b, int c) {
        return  (a < b ? (a < c ? a : c) : (b < c ? b : c));
    }

}

//    @Test
//    public void getMinimum() {
//        int a = 5;
//        int b = 6;
//        int c = 8;
//        int actualValue = HomeTask_1.minimum(a, b, c);
//        int expectedValue = Math.min(Math.min(a, b), c);
//        assertEquals(
//                actualValue,
//                expectedValue,
//                "Expected value: " + expectedValue + ", but actual value: " + actualValue);
//    }
