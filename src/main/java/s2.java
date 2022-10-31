import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class s2 {

    private static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mulikitha\\Documents\\chromedriver (2).exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(" https://jqueryui.com/droppable/");


        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action =new Actions(driver);
        action.dragAndDrop(source,destination).perform();

        


    }
}