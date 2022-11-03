package all_pages;

//import TestSuites.DriverTest;
//import TestSuitesWork.DriveTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.record.UserSViewEnd;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.FileInputStream;

import static java.sql.DriverManager.getDriver;

public class open_new_account {
    public static WebDriver driver;
    //static Logger log = LogManager.getLogger(DriverTest.class);


    public open_new_account(WebDriver driver) {
        this.driver = driver;
    }

    public static String accountopening() throws Exception {
        WebElement acc = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a"));
        acc.click();
        //select SAVINGS from dropdown
        WebElement savingsacc = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        Select select = new Select(savingsacc);
        select.selectByVisibleText("SAVINGS");
        Thread.sleep(1000);
        //click create new account
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input")).click();
        Thread.sleep(1000);
        //looking for 'Account Opened!' message
        String msg = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
        //holds new account id
        //String accID = driver.findElement(By.xpath("//*[@id=\"newAccountId\"]")).getText();
        String Account_no = driver.findElement(By.xpath("//*[@id=\"newAccountId\"]")).getText();
        return Account_no;


    }

    //Validating the Account Details
    public static String Validate_Account(String accno) throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='newAccountId']")).click();
        Thread.sleep(2000);
        String visibleAccno = driver.findElement(By.id("accountId")).getText();
        String accType = "SAVINGS";
        String visibleAccTypes = driver.findElement(By.id("accountType")).getText();
        String Balance = driver.findElement(By.xpath("//td[@id='balance']")).getText();
        String AvlBalance = driver.findElement(By.xpath("//td[@id='availableBalance']")).getText();
        if (accno.equals(visibleAccno))
            System.out.println("Account no. is matched");
        if (accType.equals(visibleAccTypes))
            System.out.println("Account is Savings");
        System.out.println("Balance: " + Balance);
        System.out.println("Available Balance: " + AvlBalance);
        return accno;
    }



}

