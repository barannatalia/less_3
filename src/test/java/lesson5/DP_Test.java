package test.java.lesson5;

import main.java.lesson5.inheretance.app.Server;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DP_Test {
    Server server;

    @BeforeMethod
    public void beforeMethod() {
        server = new Server();
    }

    @Test (dataProvider = "statuses")
    public void testStatus(int age, String expectedStatus) {
        String actualStatus = server.getStatus(age);
        assertEquals(
                actualStatus,
                expectedStatus,
                "Expected status " + expectedStatus +"with age " + age
        );
    }
// {{2,1},{3,4},{5,6}}
    @DataProvider( name = "statuses")
    public Object[][] getData() {
        return new Object[][] {
                {10,"Student"},
                {18,"Student"},
                {19,"Worker"},
                {25,"Worker"},
                {60,"Pensioner"},
                {61,"Pensioner"},
                {70,"Pensioner"},
                {90,"Pensioner"},
                {91,"!!!"},
                {-10,"!!!"},
        };
    }
    //10, 18,19 25 60 61 70 90 91 -10
}
