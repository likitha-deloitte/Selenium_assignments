package all_pages;

//import TestSuites.DriverTest;
//import TestSuitesWork.DriveTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.FileInputStream;
public class BillPay{
    public static WebDriver driver;
    //static Logger log = LogManager.getLogger(DriverTest.class);


    public BillPay(WebDriver driver) {
        this.driver = driver;
    }
    public static void Bill() throws Exception
    {

        WebElement BillpayService = driver.findElement(By.xpath("//a[text()='Bill Pay']"));
        Assert.assertTrue(BillpayService.isDisplayed()&&BillpayService.isEnabled());
        BillpayService.click();
        System.out.println("Clicked on BILLPAY SERVICE ");
        Thread.sleep(2000);


        String BillDetails = "C:\\Users\\mulikitha\\Desktop\\Selinium\\BillDetails.xlsx";
        FileInputStream fis = new FileInputStream(BillDetails);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = null;
        XSSFCell cell = null;
        String pname = "";
        String addr = "";
        String city = "";
        String state = "";
        double zip = 0;
        double phone = 0;
        double accn = 0;
        double accnverify = 0;
        double amt = 0;

        String zip_str = null;
        String phone_str = null;
        String accn_str = null;
        String accnverify_str = null;
        String amt_str = null;

        //row = sheet.getRow(0);
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);

            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (j == 0) {
                    pname = cell.getStringCellValue();
                }
                if (j == 1) {
                    addr = cell.getStringCellValue();
                }
                if (j == 2) {
                    city = cell.getStringCellValue();
                }
                if (j == 3) {
                    state = cell.getStringCellValue();
                }
                if (j == 4) {
                    zip = cell.getNumericCellValue();
                    zip_str = String.valueOf(zip);
                }
                if (j == 5) {
                    phone = cell.getNumericCellValue();
                    phone_str = String.valueOf(phone);
                }
                if (j == 6) {
                    accn= cell.getNumericCellValue();
                    accn_str = String.valueOf(accn);
                }
                if (j == 7) {
                    accnverify= cell.getNumericCellValue();
                    accnverify_str = String.valueOf(accnverify);
                }

                if (j == 8) {
                    amt = cell.getNumericCellValue();
                    amt_str = String.valueOf(zip);
                }
            }
        }


        WebElement Payeename = driver.findElement(By.xpath("//input[@name='payee.name']"));
        Payeename.sendKeys(pname);
        Thread.sleep(2000);
        WebElement address = driver.findElement(By.xpath("//input[@name='payee.address.street']"));
        address.sendKeys(addr);
        Thread.sleep(2000);
        WebElement City = driver.findElement(By.xpath("//input[@name='payee.address.city']"));
        City.sendKeys(city);
        Thread.sleep(2000);
        WebElement State = driver.findElement(By.xpath("//input[@name='payee.address.state']"));
        State.sendKeys(state);
        Thread.sleep(2000);
        WebElement Zipcode = driver.findElement(By.xpath("//input[@name='payee.address.zipCode']"));
        Zipcode.sendKeys(zip_str);
        Thread.sleep(2000);
        WebElement PhoneNumber = driver.findElement(By.xpath("//input[@name='payee.phoneNumber']"));
        PhoneNumber.sendKeys(phone_str);
        Thread.sleep(2000);
        WebElement PayeeAccountNo = driver.findElement(By.xpath("//input[@name='payee.accountNumber']"));
        PayeeAccountNo.sendKeys(accn_str);
        Thread.sleep(2000);
        WebElement VerifyAccount = driver.findElement(By.xpath("//input[@name='verifyAccount']"));
        VerifyAccount.sendKeys(accnverify_str);
        Thread.sleep(2000);
        WebElement amount = driver.findElement(By.xpath("//input[@name='amount']"));
        amount.sendKeys(amt_str);
        Thread.sleep(2000);
        WebElement FromAccountID = driver.findElement(By.xpath("//select[@name='fromAccountId']"));
        FromAccountID.click();
        Thread.sleep(2000);
        WebElement AccountOption = driver.findElement(By.xpath("//select[@name='fromAccountId']/option[1]"));
        AccountOption.click();
        Thread.sleep(2000);
        WebElement SendPayment = driver.findElement(By.xpath("//input[@class='button']"));
        SendPayment.click();
        Thread.sleep(2000);
        WebElement BILLSUCCESSMSG = driver.findElement(By.xpath("//h1[text()='Bill Payment Complete']"));
        try
        {
            Assert.assertTrue(BILLSUCCESSMSG.isDisplayed() && BILLSUCCESSMSG.isEnabled());
            Thread.sleep(2000);
        } catch(Exception e)

        {
            System.out.println("BILLSUCCESSMSG is NOT Displayed");
        }
    }

}
