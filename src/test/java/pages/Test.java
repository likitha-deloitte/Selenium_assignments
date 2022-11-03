package pages;

import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Test {
    public static WebDriver driver;
    //static Logger log = (Logger) LogManager.getLogger(BeforeAfterTest.class);

    @BeforeTest
    public void launchBrowser() {
        BasicConfigurator.configure();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mulikitha\\Documents\\chromedriver (2).exe");
        //driver= new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterTest
    public void closeBrowser()
    {
        //driver.close();
    }
}
