package Seleninum_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_WebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Software\\Driver\\geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");

        String Title =driver.getTitle();
        System.out.println("Page Title:" + Title);

        if (Title.equals("YouTube")){
            System.out.println("Page title is correct");

        }else{
            System.out.println("Page title is incorrect");
        }



    }
}

