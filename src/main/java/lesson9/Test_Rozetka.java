package main.java.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_Rozetka {
    WebDriver driver;
    WebDriverWait wait;
    String searchStr = "iPhone";
    String popupStrSelect = "[class='popup-css lang-switcher-popup sprite-side']";
    By logo = By.cssSelector("[class='logo-link responsive-img logo-link-svg']");
    By search = By.cssSelector("[name='text']");
    By iPhone = By.xpath("//div[@class='g-i-tile-i-title clearfix']/a[contains(text(), '" + searchStr + "')]");


    By popup = By.cssSelector(popupStrSelect);
    By popupClose = By.cssSelector(popupStrSelect + " [class='popup-close']");
    By suggestion = By.cssSelector("[data-rz-gtm-event='suggestedQuery']");
    By contactB = By.cssSelector("[href='https://rozetka.com.ua/contacts/']");
    By qAndAB = By.cssSelector("[href='https://rozetka.com.ua/faq/']");
    By qaLinks = By.cssSelector("[name='slider-block-active']");


    @BeforeMethod
    public void beforeMetod() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--window-size=1300,1080");
        //options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testA() {
        driver.get("https://rozetka.com.ua/");
//        WebElement searchEl = driver.findElement(search);
//        wait.until(ExpectedConditions.elementToBeClickable(searchEl));
        if (driver.findElements(popup).size() > 0) {
            driver.findElement(popupClose).click();
        }

//        searchEl.sendKeys(searchStr);
//        searchEl.sendKeys(Keys.ENTER);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(iPhone)));
//        driver.get("https://rozetka.com.ua/notebooks/c80004/filter/preset=workteaching/");
//        WebElement searchEl2 = driver.findElement(search);
//        wait.until(ExpectedConditions.elementToBeClickable(searchEl2));
//        if (driver.findElements(popup).size() > 0) {
//            driver.findElement(popupClose).click();
//        }
        wait.until(ExpectedConditions.elementToBeClickable(contactB));
        driver.findElement(contactB).click();
        wait.until(ExpectedConditions.elementToBeClickable(qAndAB));
        driver.findElement(qAndAB).click();
        wait.until(ExpectedConditions.elementToBeClickable(qaLinks));

    }

    @AfterMethod
    public void afterMetod() {

    }
}
