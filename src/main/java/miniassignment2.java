import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class miniassignment2
    {

        public static void main(String[] args) {

            // System Property for Chrome Driver
            // Location Of My Chrome Driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mulikitha\\Documents\\chromedriver (2).exe");
            // Instantiate a ChromeDriver class.
            WebDriver driver=new ChromeDriver();
            // Launch Website
            driver.get("https://phptravels.com/demo");
            //Maximize the browser
            driver.manage().window().maximize();
            String actualtitle = driver.getTitle();
            String newtitle = actualtitle.toUpperCase();
            if(newtitle.contains("PHPTRAVELS"))
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            driver.get("https://phptravels.net/login/");
            String title2=driver.getTitle();
            driver.navigate().back();
            String url=driver.getCurrentUrl();
            System.out.println(url);
            WebElement relativeXpathOfLogin = driver.findElement(By.xpath("//a[@hhref=https://phptravels.org/login']"));
            // Click on the Login button
            relativeXpathOfLogin.click();
            driver.navigate().back();
            driver.navigate().refresh();
            driver.close();
        }

    }

