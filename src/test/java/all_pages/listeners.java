package all_pages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {


    public void onStart(ITestContext arg) {
        System.out.println("Start Test Execution ..."+arg.getName());
    }


    public void onFinish(ITestContext arg) {
        System.out.println("Finish test execution...."+arg.getName());
    }


    public void onTestStart(ITestResult result) {
        System.out.println("Starts tests..."+result.getName());
    }


    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped tests..."+result.getName());
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("Failure tests..."+result.getName());
    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("Passed tests..."+result.getName());
    }


}

