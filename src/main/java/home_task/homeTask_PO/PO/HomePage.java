package main.java.home_task.homeTask_PO.PO;

import main.java.home_task.homeTask_PO.TestBaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends TestBaseSetup {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private String searchStr ;
    String popupStrSelect = "[class='popup-css lang-switcher-popup sprite-side']";
    By search = By.cssSelector("[name='search']");
    By popup = By.cssSelector(popupStrSelect);
    By popupClose = By.cssSelector(popupStrSelect + " [class='popup-close']");
    By searchResultItem;
    By searchResultItemMenu;
    By categories = By.cssSelector("li>a[class='menu-categories__link']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
    }

    public HomePage(WebDriver driver, String searchStr) {
        this.driver = driver;
        this.searchStr = searchStr;
        searchResultItem = By.xpath("//span[contains(text(), '" + searchStr + "')]");
        searchResultItemMenu = By.cssSelector("li>a[href*='=" + searchStr + "']");
        wait = new WebDriverWait(this.driver, 10);
    }

    public HomePage open() {
        driver.get("https://rozetka.com.ua/");
        return this;
    }

    public HomePage search(String searchStr) {
        this.searchStr = searchStr;
        WebElement searchEl = driver.findElement(search);
        wait.until(ExpectedConditions.elementToBeClickable(searchEl));
        if( driver.findElements(popup).size() > 0 ) {
            driver.findElement(popupClose).click();
        }
        searchEl.sendKeys(this.searchStr);
        searchEl.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public List<WebElement> getListSearchResults() {
        return (List<WebElement>) driver.findElements(searchResultItem);
    }

    public List<WebElement> getListMenuSearchResults() {
        return (List<WebElement>) driver.findElements(searchResultItemMenu);
    }

    public List<WebElement> getListCategories() {
        return (List<WebElement>) driver.findElements(categories);
    }
}
