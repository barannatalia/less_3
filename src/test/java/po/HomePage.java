package test.java.po;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.utils.PropertyLoader;

import java.util.List;

public class HomePage extends BasePage{
    private final WebDriver driver;
    private final WebDriverWait wait;
    private String searchStr;
    private final String popupStrSelect = "[class='popup-css lang-switcher-popup sprite-side']";

//    By categories = By.cssSelector("li>a[class='menu-categories__link']");

    @FindBy(css = "[name='search']")
    private WebElement search;
    @FindBy(css = popupStrSelect)
    private List<WebElement> popup;
    @FindBy(css = popupStrSelect + " [class='popup-close']")
    private WebElement popupClose;
    @FindBy(css = popupStrSelect + " [class='popup-close']")
    private List<WebElement> categories;
    @FindBy(css = "li>a[class='menu-categories__link']")
    //@CacheLookup
    private WebElement contactBtn;


    public HomePage(WebDriver driver) {
        logger.trace("Home page initialized");
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
        PageFactory.initElements(driver, this);
    }

    public HomePage open() {
        logger.info("Open");
        driver.get("https://rozetka.com.ua/");
        logger.debug("URL: " + driver.getCurrentUrl());
        return this;
    }

    public HomePage search(String searchStr) {
        logger.info("Search on home page by " + searchStr);
        this.searchStr = searchStr;
        final By searchResultItem = By
                .xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + searchStr.toLowerCase() + "')]");
        wait.until(ExpectedConditions.elementToBeClickable(search));
        if( popup.size() > 0 ) {
            popupClose.click();
            logger.info("Pop-up is closed");
        }
        search.clear();
        logger.info("Clear");
        search.sendKeys(this.searchStr);
        search.sendKeys(Keys.ENTER);
        logger.info("Press ENTER");
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                int amount = driver.findElements(searchResultItem).size();
                return amount > 0;
            }
        });

        return this;
    }

    public HomePage clickContacts() {
        logger.info("Click contacts");
        logger.error("ERROR: " + contactBtn);
        wait.until(ExpectedConditions.elementToBeClickable(contactBtn));
        contactBtn.click();

        return this;
    }
    public List<WebElement> getListCategories() {
        logger.info("Get categories");
        return (List<WebElement>) driver.findElements((By) categories);
    }
}
