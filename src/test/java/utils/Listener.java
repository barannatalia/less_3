package test.java.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.*;

public class Listener implements
        ISuiteListener,
        ITestListener,
        IInvokedMethodListener {
    public Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        logger.trace("IInvokedMethod iInvokedMethod, ITestResult iTestResult");
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("11111111111111111111111");
    }

    @Override
    public void onStart(ISuite iSuite) {

    }

    @Override
    public void onFinish(ISuite iSuite) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("TEST WAS SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
//        Screenshot screenshot = new Screenshot(ITestResult.getContext().getAttribute("driver"));
//        screenshot.getScreenshot(iTestResult);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
