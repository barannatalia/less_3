package test.java.po;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FilterLaptop {
    public Logger logger = LogManager.getLogger(FaqPage.class);
    private final WebDriver driver;
    private final WebDriverWait wait;
    private String laptop="Apple";


    public FilterLaptop (WebDriver driver) {
        this.logger.trace("FilterLaptop initialized");
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public FilterLaptop open() {
        logger.info("Open 'Ноутбуки'");
        driver.get("https://rozetka.com.ua/ua/notebooks/c80004/");
        logger.debug("URL: " + driver.getCurrentUrl());
        return this;
    }

    public List<WebElement> getListLaptop(String laptop) {
        logger.info("Find: " + laptop);
        this.laptop = laptop;

        By searchItem = By.cssSelector("input[id='" + laptop + "']");
        logger.debug("Selector: " + laptop);
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchItem));
//        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(searchItem));
        webElement.click();
        logger.info("Click: " + laptop);
        By searchList = By.xpath("//span[contains(text(), '"  + laptop + "')]");
        List<WebElement> elements = driver.findElements((By) searchList);
        logger.info("Qty elements: " + elements.size());
        return elements;
    }
}
