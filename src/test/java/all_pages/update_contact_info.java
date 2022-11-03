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

public class update_contact_info {
    public static WebDriver driver;

    public update_contact_info (WebDriver driver) {
        this.driver = driver;
    }

    public static void update() throws Exception {
        WebElement updatecontact = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a"));
        updatecontact.click();
        Thread.sleep(2000);

        String LoginDetails = "C:\\Users\\mulikitha\\Desktop\\Selinium\\updateinfo.xlsx";
        FileInputStream fis = new FileInputStream(LoginDetails);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = null;
        XSSFCell cell = null;
        double updatephone = 0;
        String str_updatephone = "";


        //row = sheet.getRow(0);
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);

            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (j == 0) {
                    updatephone = cell.getNumericCellValue();
                    str_updatephone = String.valueOf(updatephone);
                }

            }
        }
        WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[7]/td[2]/input"));
        ele.clear();
        Thread.sleep(2000);
        ele.sendKeys(str_updatephone);
        Thread.sleep(2000);
        WebElement updatebutton = driver.findElement(By.xpath("//input[@class='button']"));
        updatebutton.click();
        Thread.sleep(2000);

        WebElement updatemessage = driver.findElement(By.xpath("//p[text()='Your updated phone number have been added to the system.']"));
        try
        {
            Assert.assertTrue(updatemessage.isDisplayed() && updatemessage.isEnabled());
            System.out.println("update successfully");
        }
        catch(Exception e)
        {
            System.out.println("update failed"); }
        Thread.sleep(2000);
    }
}

