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

public class FindTransaction {
    public static WebDriver driver;

    public FindTransaction(WebDriver driver) {
        this.driver = driver;
    }

    public static void findtransaction() throws Exception {

        WebElement findtransaction = driver.findElement(By.xpath("//a[text()='Find Transactions']"));
        findtransaction.click();
        WebElement Date = driver.findElement(By.xpath("//input[@id='criteria.onDate']"));
        Date.sendKeys("10-27-2022");

        WebElement findtransaction2 = driver.findElement(By.xpath("(//button[@class='button'])[2]"));
        findtransaction2.click();
        // driver.execute_script("window.history.go(-1)")
        WebElement amount = driver.findElement(By.xpath("//input[@id='criteria.amount']"));
        amount.sendKeys("100");
        WebElement findtransaction4 = driver.findElement(By.xpath("(//button[@class='button'])[4]"));
        findtransaction4.click();
        WebElement results = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1"));
        try {
            Assert.assertTrue(results.isDisplayed() && results.isEnabled());
            System.out.println("Results are Displayed");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Results are not Displayed");
        }

    }
}
