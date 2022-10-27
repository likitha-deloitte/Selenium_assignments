package main.java;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//package main.java;

import static org.junit.jupiter.api.Assertions.*;

class sampleoneTest
{
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mulikitha\\Documents\\chromedriver (2).exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();


        // Launch Website
        driver.navigate().to("http://www.javatpoint.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
    }
}
