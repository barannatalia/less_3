package main.java.lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Run_browser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        Thread.sleep(10000);                //очікування
        By search = By.cssSelector("[name='search']");
        WebElement searchEl= driver.findElement(search);
        searchEl.sendKeys("iPhone");
        searchEl.click();
//        driver.findElement(search).sendKeys("iPhone");
        Thread.sleep(10000);
        String name = driver.findElement(By.cssSelector("header-topline__user-link link-dashed")).getText(); //
        System.out.println(name);
        driver.quit();
    }
}
