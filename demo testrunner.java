package runner;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.*;


class Testrunner extends Base
{ Reporter report = new Reporter();
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
      test = reports.createTest("click on Blog");
      LoggerHandler.info("click on signin");
      test.pass("click");
      for(int i=0;i<300;i++)
      {
        LoggerHandler.info("click on signin");
        test.pass("click");
      }
      Screenshot.captureScreenShot("agronetto_screenshot");
      test.addScreenCaptureFromPath("/home/coder/project/workspace/Project/screenshots/agronetto_screenshot2025.08.25.03.53.54.png");
      WebDriverHelper helper = new WebDriverHelper(driver);
      // helper.clickOnElement(By.xpath("(//div[@data-hrf=\"https://agroline.com/login/\"])[1]"));
      // helper.clickOnElement(By.xpath("(//div[@class=\"example-companies\"]/a)[1]"));
      // helper.switchToNewWindow();
      // helper.clickOnElement(By.xpath("//a[@class='verified-dealer-title js-link-into-dialog']"));
      // helper.clickOnElement(By.xpath("//a[@class='contact-with-dealer-button']"));
      // driver.navigate().to("https://agronetto.com/");
      // helper.javascriptScroll(By.xpath("(//a[@href='https://agroline.com/blog/'])[1]"));
      // helper.clickOnElement(By.xpath("(//a[@href='https://agroline.com/blog/'])[1]"));
      // helper.hoverOverElement(By.xpath("(//div[@class='projects-menu'])[1]"));
      // helper.clickOnElement(By.xpath("(//ul[@class=\"project-list\"]/li)[2]"));
      // helper.switchToNewWindow();
      // driver.navigate().to("https://agronetto.com/");
      // helper.clickOnElement(By.xpath("//div[@data-id='spares']"));
      // helper.sendKeys(By.xpath("//input[@name='spcid']"), "37178");
      // helper.enterAction(By.xpath("//input[@name='spcid']"));
      // helper.clickOnElement(By.xpath("//span[@class='current sl-orders-select__current']"));
      // helper.clickOnElement(By.xpath("(//div[@class='sl-orders-select-dropdown']/span)[3]"));

      
    }
    @AfterMethod
    void teardown()
    {
        driver.quit();
    }
    @AfterClass
    void report()
    {
        reports.flush();
    }
}
