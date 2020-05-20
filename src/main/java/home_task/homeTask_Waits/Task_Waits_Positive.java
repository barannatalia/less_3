package main.java.home_task.homeTask_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_Waits_Positive {
    WebDriver driver;
    WebDriverWait wait;
    By goPersonalAccount = By.cssSelector("[class='header-topline__user-link link-dashed']");
    By signup = By.cssSelector("[class='auth-modal__register-link']");
    By name = By.cssSelector("[formcontrolname ='name']");
    By nameFild = By.cssSelector("[class='form__row js-name validation_type_error']");
    By username = By.cssSelector("[formcontrolname ='username']");
    By usernameFild = By.cssSelector("[class='form__row js-contact validation_type_error']");
    By password = By.cssSelector("[formcontrolname ='password']");
    By passwordFild = By.cssSelector("[class='form__row js-new_password validation_type_error']");
    By register = By.cssSelector("[class='button button_size_large button_color_green auth-modal__submit']");
    String inputStr = "Nataliia";


    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--window-size=1300,1080");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testPositive() {
        driver.get("https://rozetka.com.ua/");
        WebElement goPersonalAccountEl = driver.findElement(goPersonalAccount);
        wait.until(ExpectedConditions.elementToBeClickable(goPersonalAccountEl));
        goPersonalAccountEl.click();
        WebElement signupEl = driver.findElement(signup);
        wait.until(ExpectedConditions.elementToBeClickable(signupEl));
        signupEl.click();

        WebElement nameEL = driver.findElement(name);
        WebElement usernameEl = driver.findElement(username);
        WebElement passwordEl = driver.findElement(password);
        WebElement registerEl = driver.findElement(register);
        nameEL.click();
        usernameEl.click();
        passwordEl.click();
        registerEl.click();
        wait.until(ExpectedConditions.attributeToBe(driver.findElement(nameFild), "border-color", "rgb(51, 51, 51)"));
        wait.until(ExpectedConditions.attributeToBe(driver.findElement(usernameFild), "border-color", "rgb(51, 51, 51)"));
        wait.until(ExpectedConditions.attributeToBe(driver.findElement(passwordFild), "border-color", "rgb(51, 51, 51)"));
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}