package main.java.home_task.homeTask_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_WebDriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        String phone = driver.findElement(By.cssSelector("span[class='link-dashed']")).getText();
        phone = phone.replaceAll("-","").replaceAll(" ","").replaceAll("\\(","").replaceAll("\\)","");
        System.out.println("Phone: " + phone);
        driver.quit();
    }
}
