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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.FileInputStream;
public class transfer_fund {
    public static WebDriver driver;
   // static Logger log = LogManager.getLogger(DriverTest.class);


    public transfer_fund(WebDriver driver) {
        this.driver = driver;
    }

    public static String transfer(String accno) throws Exception {

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        WebElement staticDropdown=driver.findElement(By.xpath("//select[@id='toAccountId']"));
        Select dropdown=new Select(staticDropdown);
        dropdown.selectByVisibleText(accno);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        System.out.println("Amount Transferred Successfully");
        return accno;
    }
}

