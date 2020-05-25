package main.java.lesson8;

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

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class A_Wait_Intro {
    WebDriver driver;
    String searchStr= "iPhone";
    String popupStrSelect = "iPhone";
    By logo = By.cssSelector("[class='header__logo']");
    By search = By.cssSelector("[name = 'search']");
    By iPhone = By.xpath("//div[@class='goods-tile__title']/a[contains(text(), '" + searchStr + ")]");
//    By popup = By.cssSelector();
    By popupClose = By.cssSelector(popupStrSelect + "[class='popup-close']");
    By suggestion = By.cssSelector("[data-rz-gtm-event='suggestedQuery']");



    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        --disable-notifications
        options.addArguments("--disable-notifications");
        options.addArguments("--window-size=900,1080");
//        options.addArguments("--inkognito");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.manage().window().maximize();

    }


//    @Test
 /*   public void testFirst() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
//        Thread.sleep(5000);
        WebElement searchEl = driver.findElement(search);
        wait.until(ExpectedConditions.elementToBeClickable(searchEl));
        if (driver.findElements(popup).size() > 0 ) {
            driver.findElement(popupClose).click();
        }


//        WebElement iPhone = driver.findElement(By.cssSelector(""));
        searchEl.sendKeys("iPhone");
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//        driver.findElement(search).sendKeys("iPhone");
        searchEl.sendKeys(Keys.ENTER);
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.visibilityOf(driver.findElement(iPhone)));
        driver.get("https://rozetka.com.ua/");
        WebElement searchEl2 = driver.findElement(search);
        wait.until(ExpectedConditions.elementToBeClickable(searchEl2));
        if (driver.findElements(popup).size() > 0 ) {
            driver.findElement(popupClose).click();
        }




//        wait.until(ExpectedConditions.elementToBeClickable(suggestion));
        wait.until(ExpectedConditions.elementToBeClickable(suggestion)).click();
//        driver.findElement(suggestion).click());
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOfElementLocated(iPhone),
                ExpectedConditions.urlContains(searchStr.toLowerCase())
        ));
        String actual = driver.getCurrentUrl();
        String expected = "/#search_text=" + searchStr.toLowerCase();
        assertTrue(actual.contains(expected),
//                String.format("Expected '%s'"%s", ));

        assertEquals();



//        driver.findElement(logo).click();
//        new  WebDriverWait(driver,10).until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(iPhone)));
//        new  WebDriverWait(driver,10).until(ExpectedConditions.stalenessOf(driver.findElement(iPhone)));

    }

    @AfterMethod
    public void afterMetod() {
        driver.quit();
    }*/

}
