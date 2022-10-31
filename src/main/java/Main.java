import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        WebDriver browser;
        // Chrome driver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mulikitha\\Documents\\chromedriver (2).exe");
        //setting up the chromedriver class
        browser = new ChromeDriver();
        browser.get(" https://the-internet.herokuapp.com/ ");
        //maximising window
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement J_Alert = browser.findElement(By.xpath("//a[@href='/javascript_alerts']]"));
        J_Alert.click();
        WebElement J_Promt = browser.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        J_Promt.click();


        

    }
}