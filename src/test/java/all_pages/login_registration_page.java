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
public class login_registration_page {
    public static WebDriver driver;
    //static Logger log = LogManager.getLogger(DriverTest.class);


    public login_registration_page(WebDriver driver) {
        this.driver = driver;
    }

    public static void registrationn_check() throws Exception {


        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
       // WebElement register= driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a"));
        //register.click();
        //log.info("Opening The Required  Website for performing the operations");


        String LoginDetails = "C:\\Users\\mulikitha\\Desktop\\Selinium\\logindetails.xlsx";
        FileInputStream fis = new FileInputStream(LoginDetails);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = null;
        XSSFCell cell = null;
        String fname = "";
        String lname = "";
        String address = "";
        String city = "";
        String state = "";
        double zip = 0;
        double phone = 0;
        double ssn = 0;
        String uname = "";
        String pwd = "";
        String cpwd = "";
        String zip_str = null;
        String phone_str = null;
        String ssn_str = null;

        //row = sheet.getRow(0);
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);

            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (j == 0) {
                    fname = cell.getStringCellValue();
                }
                if (j == 1) {
                    lname = cell.getStringCellValue();
                }
                if (j == 2) {
                    address = cell.getStringCellValue();
                }
                if (j == 3) {
                    city = cell.getStringCellValue();
                }


                if (j == 4) {
                    state = cell.getStringCellValue();
                }
                if (j == 5) {
                    zip = cell.getNumericCellValue();
                    zip_str = String.valueOf(zip);
                }
                if (j == 6) {
                    phone = cell.getNumericCellValue();
                    phone_str = String.valueOf(phone);
                }
                if (j == 7) {
                    ssn = cell.getNumericCellValue();
                    ssn_str = String.valueOf(ssn);
                }
                if (j == 8) {
                    uname = cell.getStringCellValue();
                }
                if (j == 9) {
                    pwd = cell.getStringCellValue();
                }
                if (j == 10) {
                    cpwd = cell.getStringCellValue();
                }
            }
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys(fname);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys(lname);


        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys(address);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys(city);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys(state);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys(zip_str);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys(phone_str);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys(ssn_str);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[10]/td[2]/input")).sendKeys(uname);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[11]/td[2]/input")).sendKeys(pwd);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[12]/td[2]/input")).sendKeys(cpwd);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();
        Thread.sleep(5000);
    }
}
