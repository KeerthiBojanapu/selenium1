package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
	public void onTestStart(ITestResult result) {
		
		System.out.println("test has started");
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(" test case passed successfully");
	}
		

	public void onTestFailure(ITestResult result) {
		
		System.out.println("test case failed");
		
	}

	
	

}
