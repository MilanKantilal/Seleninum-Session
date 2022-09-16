package Seleninum_Session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Concept {

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe/");
      //  WebDriver driver = new ChromeDriver();
       // driver.get("https://demo.nopcommerce.com/");

        //Chrome.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        // MSEdge
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 =new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://demo.nopcommerce.com/");

        // Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver2 =new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://demo.nopcommerce.com/");

        driver.quit();
        driver1.quit();
        driver2.quit();







    }
}
