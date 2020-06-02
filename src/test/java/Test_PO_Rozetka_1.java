package test.java;

import main.java.home_task.homeTask_4.HomeTask_1;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.po.ContactPage;
import test.java.po.FaqPage;
import test.java.po.FilterLaptop;
import test.java.po.HomePage;

import static org.testng.Assert.assertTrue;

public class Test_PO_Rozetka_1 extends TestBaseSetup {
    HomePage homePage;
    ContactPage contactPage;
    FaqPage faqPage;
    FilterLaptop filterLaptop;

    @BeforeMethod
    public void initialize() {
        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);
        faqPage = new FaqPage(driver);
        filterLaptop = new FilterLaptop(driver);
    }


    @Test
    public void testC() {
        homePage.open();
        homePage.search("iPhone");
        homePage.clickContacts();
    }

    @Test
    public void testD() {
        homePage.open();
        homePage.clickContacts();
        assertTrue(false);
    }

    @Test
    public void testE() {
        homePage.open();
        driver.findElement(By.id("AAA")).click();
        homePage.search("iPhone");
        homePage.clickContacts();
    }
}
