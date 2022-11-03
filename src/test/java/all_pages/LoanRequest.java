package all_pages;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.FileInputStream;

public class LoanRequest {
    public static WebDriver driver;

    public LoanRequest (WebDriver driver) {
        this.driver = driver;
    }

    public static void requestloan() throws Exception {
        WebElement LoanRequest= driver.findElement(By.xpath("//a[text()='Request Loan']"));
        try {
            Assert.assertTrue(LoanRequest.isDisplayed()&&LoanRequest.isEnabled());
            System.out.println("LoanRequest is Displayed");
            Thread.sleep(2000);
            LoanRequest.click();
        }
        catch (Exception exception) {
            System.out.println("LoanRequest is not Displayed");
        }

        WebElement loanamount= driver.findElement(By.xpath("//input[@id='amount']"));
        loanamount.sendKeys("100");
        WebElement downpayement= driver.findElement(By.xpath("//input[@id='downPayment']"));
        downpayement.sendKeys("100");
        WebElement fromacc= driver.findElement(By.xpath("//select[@id='fromAccountId']"));
        fromacc.click();
        WebElement Submitbutton= driver.findElement(By.xpath("//input[@class='button']"));
        Submitbutton.click();
        WebElement error= driver.findElement(By.xpath("//p[@class='error']"));
        try {
            Assert.assertTrue(error.isDisplayed()&&error.isEnabled());
            System.out.println("Error is Displayed");
            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println("Error is not Displayed");
        }

    }
}


