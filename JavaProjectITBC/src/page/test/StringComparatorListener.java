package page.test;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class StringComparatorListener extends TestListenerAdapter {

	    @Override
	    public void onTestFailure(ITestResult iTestResult) {
	        System.out.println("Test nije prošao! The TEST failed!");
	        super.onTestFailure(iTestResult);
	    }

	    @Override
	    public void onTestSuccess(ITestResult iTestResult) {
	        System.out.println("Test je prošao! The TEST passed!");
	        super.onTestSuccess(iTestResult);
	    }
	}