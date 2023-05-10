package automation.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import automation.actiondriver.Action;
import automation.base.BaseClass;

public class ListenerClass extends ExtentManager implements ITestListener {

	Action action = new Action();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			String imgPath = action.screenShot(BaseClass.getDriver(), result.getName());
			test.log(Status.PASS, "Pass Test case is: " + result.getName());
			// logger.log(Status.PASS, "ScreenShot is Attached to" + result.getName());
			try {
				// logger.pass("ScreenShot is Attached",
				MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build();
				System.out.println("pass to " + result.getName());

				// logger.addScreenCaptureFromPath(imgPath, "ScreenShot is Attached");
				test.addScreenCaptureFromPath(imgPath, "ScreenShot is Attached");
				test.pass("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath,"ScreenShot is Attached").build());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			try {
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
				String imgPath = action.screenShot(BaseClass.getDriver(), result.getName());

				test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromBase64String(imgPath).build());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void onTestSkipped(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
}
