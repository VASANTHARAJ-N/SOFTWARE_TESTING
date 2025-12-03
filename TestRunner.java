package runner;

import java.io.IOException;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.*;


class Testrunner extends Base
{ 
    WebDriverHelper help=new WebDriverHelper(driver);
    Reporter report = new Reporter();
    ExtentReports reports = report.generateExtentReport("report");
    ExtentTest test = null;
    @BeforeMethod
    void lauch()
    {
        openBrowser();
    }
    @Test
    void test()
    {
        test=reports.createTest("sampletest");
         for(int i=0;i<300;i++)
    {
      LoggerHandler.info("click on signin");
      test.pass("click");
    }
        Screenshot.captureScreenShot("gapfactory_screenshot");
        test.addScreenCaptureFromPath("/home/coder/project/workspace/Project/screenshots/gapfactory_screenshot2025.12.03.16.05.52.png");//path will be different

      //enter you code according to testCase

        help.hoverOverElement(By.xpath("xpath");


        
    }
    @AfterMethod
    void teardown()
    {
        driver.quit();
        reports.flush();
    }
}
