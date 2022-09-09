package Seleninum_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_WebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Software\\Driver\\geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.ebay.co.uk/");

        String Title =driver.getTitle();
        System.out.println("Page Title:" + Title);


    }
}

