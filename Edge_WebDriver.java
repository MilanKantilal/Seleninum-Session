package Seleninum_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_WebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");
        WebDriver driver =new EdgeDriver();
        driver.get("http://www.yahoo.co.uk/");

        String Title =driver.getTitle();
        System.out.println("Page Title:" + Title);


    }
}
