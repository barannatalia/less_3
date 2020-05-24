package main.java.home_task.homeTask_PO;

import main.java.home_task.homeTask_PO.PO.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class Test_iPhone_Samsung extends TestBaseSetup{
    HomePage homePage;

    @Test
    public void test_iPhone() {
        String strSearch = "iPhone";
        homePage = new HomePage(driver, strSearch);
        homePage.open()
                .search(strSearch)
                .getListSearchResults();
        List<WebElement> webLinks = homePage.getListSearchResults();
        for (WebElement element: webLinks);{
            assertEquals(strSearch, webLinks.toString().contains(strSearch) ? strSearch : 0);
        }
    }

    @Test
    public void test_Samsung() {
        String strSearch = "samsung";
        homePage = new HomePage(driver, strSearch);
        homePage.open()
                .search(strSearch)
                .getListMenuSearchResults();
        List<WebElement> webLinks_1 = homePage.getListMenuSearchResults();
        for (WebElement element: webLinks_1);{
            assertEquals(strSearch, webLinks_1.toString().contains(strSearch) ? strSearch : 0);
        }
    }

    @Test
    public void test_Categories() {
        homePage = new HomePage(driver);
        homePage.open()
                .getListCategories();
        List<WebElement> webLinks = homePage.getListCategories();
        assertEquals(16, webLinks.size());
    }

}
