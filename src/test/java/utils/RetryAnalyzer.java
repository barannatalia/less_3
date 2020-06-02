package test.java.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int curentCount =1;
    private final int max = 2;



    @Override
    public boolean retry(ITestResult iTestResult) {
        if (curentCount < max){
            curentCount ++;
            return true;
        }
        return false;
    }
}
