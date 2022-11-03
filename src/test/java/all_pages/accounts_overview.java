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
public class accounts_overview {
    public static WebDriver driver;
    //static Logger log = LogManager.getLogger(DriverTest.class);
    public accounts_overview(WebDriver driver) {
        this.driver = driver;
    }

    public static void account_overview() throws Exception {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/parabank/overview.htm']")).click();
        Thread.sleep(4000);
        WebElement clickBtn=driver.findElement(By.xpath("//table[@id='accountTable']//tr[position()=last()-1]//td[1]//a"));
        Thread.sleep(3000);
        clickBtn.click();
        //Dropdown1
        System.out.println("clicking on overview last account no.");
        WebElement staticDropdown=driver.findElement(By.xpath("//select[@id='month']"));
        Select dropdown=new Select(staticDropdown);
        dropdown.selectByIndex(11);
        //Dropdown2
        WebElement staticDropdown1=driver.findElement(By.xpath("//select[@id='transactionType']"));
        Select dropdown1=new Select(staticDropdown1);
        dropdown1.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='transactionTable']//tr[position()=last()]//td[2]//a")).click();
        String transactionId=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/table/tbody/tr[1]/td[2]")).getText();
    }
}