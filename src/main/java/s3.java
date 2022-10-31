import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class s3 {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mulikitha\\Documents\\chromedriver (2).exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(" https://the-internet.herokuapp.com/");

        WebElement J_Alert = driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        J_Alert.click();
        Thread.sleep(2000);
        WebElement J_Promt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        J_Promt.click();
        Thread.sleep(2000);

        String str = "Test";
        driver.switchTo().alert().sendKeys(str);
        driver.switchTo().alert().accept();
        String str1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(str1);
        if (str1.equals("You entered: " + str))
        {
            System.out.println("similar text entered");
        }
        else {
            System.out.println("not matched");
        }
    }
}