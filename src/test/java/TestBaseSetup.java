package test.java;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import test.java.utils.Screenshot;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBaseSetup {
    WebDriver driver;
    Screenshot screenshot;
    private ChromeOptions optionsBrowser = new ChromeOptions();

    @Parameters({"browser"})
    @BeforeMethod
    public void beforeMethod(String browser) {

        try {
            if (browser.equals("Firefox")) {
                driver = new RemoteWebDriver(new URL("http://ec2-18-222-146-209.us-east-2.compute.amazonaws.com:4444/wd/hub"), DesiredCapabilities.firefox());
            } else if (browser.equals("Chrome")) {
                driver = new RemoteWebDriver(new URL("http://ec2-18-222-146-209.us-east-2.compute.amazonaws.com:4444/wd/hub"), DesiredCapabilities.chrome());
            } else {
                driver = new ChromeDriver();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        driver.quit();
    }
}
