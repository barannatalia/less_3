package test.java.lesson5;

import main.java.lesson5.inheretance.app.Server;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestServer {
    Server server;

    @BeforeClass
    public void setUp(){   // beforeClass
        System.out.println("beforeClass");
    }

    @BeforeMethod
    public void initialize(){
        this.server = new Server();
    }
    @Test
    public void getUserShouldReturnProperAmount() {
//        Server server = new Server();
        String userName = server.getUsers(); //
        int actualUserAmount = userName.split(", ").length;
        int expectedUserAmount = 2;
        assertEquals(
                actualUserAmount,
                expectedUserAmount,
                "Expected amount " + expectedUserAmount + "but actual");

    }

    @Test
    public void getUserShouldReturnAllNamesInUpperase() {
//        Server server = new Server();
        String[] userName = server.getUsers().split(", "); //
        for (String name:userName){
            String actualFirstChar = String.valueOf(name.charAt(0));
            String expectedFirstChar = String.valueOf(name.charAt(0)).toUpperCase();
              assertTrue(actualFirstChar.equals(expectedFirstChar));
        }
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    }



