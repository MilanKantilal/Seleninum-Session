package Seleninum_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chrome_WebDriver {
    public static void main(String[] args) {
        //2 Set up the chrome driver path.

        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");


        //1 Create instance of web drivers

        WebDriver driver =new ChromeDriver();

        //3 Navigate to web page.
       driver.get("https://www.YouTube.co.uk/");

        //4. Get page title.
       //System.out.println(driver.getTitle());

       String Title =driver.getTitle();
       System.out.println("Page Title:" + Title);

       //5. Expected vs Actual Validation (use of if else condition...)

        if (Title.equals("YouTube")){
            System.out.println("Page title is correct");

        }else{
            System.out.println("Page title is incorrect");
        }

        }

    }

