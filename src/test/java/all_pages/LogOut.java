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

public class LogOut {
    public static WebDriver driver;

    public LogOut(WebDriver driver) {
        this.driver = driver;
    }

    public static void logout() throws Exception {

        WebElement logout = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a"));
        logout.click();
    }
}
