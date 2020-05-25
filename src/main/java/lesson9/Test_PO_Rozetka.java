package main.java.lesson9;

import main.java.home_task.homeTask_PO.TestBaseSetup;
import main.java.lesson9.PO.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_PO_Rozetka extends TestBaseSetup {


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
    public void initialize() {
        HomePage homePage = new HomePage(driver);
    }


//    @Test
//    public void testA() {
//        homePage.open();
//        driver.get("https://rozetka.com.ua/");
//        if (driver.findElements(popup).size() > 0) {
//            driver.findElement(popupClose).click();
//        }
//
//        wait.until(ExpectedConditions.elementToBeClickable(contactB));
//        driver.findElement(contactB).click();
//        wait.until(ExpectedConditions.elementToBeClickable(qAndAB));
//        driver.findElement(qAndAB).click();
//        wait.until(ExpectedConditions.elementToBeClickable(qaLinks));
//
//    }


}
