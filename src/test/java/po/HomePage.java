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
        }
        search.clear();
        search.sendKeys(this.searchStr);
        search.sendKeys(Keys.ENTER);
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(searchResultItem)); //1
        //wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultItem)); // 2
        wait.until(new ExpectedCondition<Boolean>() { // 3
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
        wait.until(ExpectedConditions.elementToBeClickable(contactBtn));
        contactBtn.click();
        return this;
    }
    public List<WebElement> getListCategories() {
        final List<WebElement> elements = driver.findElements((By) categories);
        return elements;
    }
}
