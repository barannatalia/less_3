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
    private String laptop = "Apple";
    private By searchItem;
    private List<WebElement> elements;


    public FilterLaptop(WebDriver driver) {
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

    public int getListLaptop(String laptop) {
        logger.info("Laptop: " + laptop);
        this.laptop = laptop;
        if (laptop == "") logger.warn("Laptop is empty");
        String search = "//a[@class='checkbox-filter__link']//input[@id='" + laptop + "']/..";
        logger.debug("Selector: " + search);
        searchItem = By.xpath(search);
        logger.info("Click: " + laptop);
        driver.findElements(searchItem).get(0).click();
        By searchList = By.xpath("//span[contains(text(), '" + laptop + "')]");
        logger.debug("searchList: " + searchList);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchList));
        logger.info("Get list");
        elements = driver.findElements(searchList);
        if (elements.size() == 0)  logger.warn("List is empty");
        logger.info("Qty elements: " + (elements.size() - 1));
        return elements.size() - 1;
    }
}
