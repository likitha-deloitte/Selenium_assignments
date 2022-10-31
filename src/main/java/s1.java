import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class s1 {

    private static WebDriver driver;
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mulikitha\\Documents\\chromedriver (2).exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(" https://the-internet.herokuapp.com/ ");

       WebElement frames = driver.findElement(By.xpath("//a[@href='/frames']"));
       frames.click();

       WebElement nestedframes = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
       nestedframes.click();

       WebElement lestframe = driver.findElement(By.xpath("frame[@name='frame-left']"));
       System.out.println(lestframe.getAttribute("title"));

        //WebElement leftframe = driver.findElement(By.xpath("frame[@name='frame-left']"));
        //String title = leftframe.getAttribute("title");

        
    }

        
}
