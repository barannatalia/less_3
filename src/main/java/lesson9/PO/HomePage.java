package main.java.lesson9.PO;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage open(){
        driver.get("https://rozetka.com.ua/");
        return this;
    }

    public HomePage search(){


        return this;
    }
}
