package Seleninum_Session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Custom_xPath {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        // Using Custom creators.

        /* 1. Property -
        Syntax: htmnltag[@property 'value'] */

        driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
        //driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();

        /* 2. Properties
        Syntax : htmltag[@property = 'value' and @property = 'value'] */

        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']")).click();

        /* 3. Using contain in xpath
        Syntax: //htmltag[contains(@propety, 'value')] */

        driver.findElement(By.xpath("//button [contains(@class, 'button-1 search-box-button' )]")).click();

        /* 4. With and without contains.
        Syntax: //htmltag [@property='value' and contains (@property,'value')] */

        driver.findElement(By.xpath("//button[@type='button' and contains (@class, 'button-1 newsletter-subscribe-button')]")).click();

        /* 5. Text ()
        Syntax: //htmltag[text()='value' */
        driver.findElement(By.xpath("//strong[text()='Do you like nopCommerce?']")).click();







    }
}
