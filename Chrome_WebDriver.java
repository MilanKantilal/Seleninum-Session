package Seleninum_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chrome_WebDriver {
    public static void main(String[] args) throws InterruptedException {
        //2 Set up the chrome driver path.

        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");


        //1 Create instance of web drivers

        WebDriver driver =new ChromeDriver();

        //3 Navigate to web page.
       driver.get("https://demo.nopcommerce.com/");

        //4. Get page title.
       //System.out.println(driver.getTitle());

       String Title =driver.getTitle();
       System.out.println("Page Title:" + Title);

       //5. Expected vs Actual Validation (use of if else condition...)

        if (Title.equals("nopCommerce demo store")){
            System.out.println("Page title is correct");

        }else{
            System.out.println("Page title is incorrect");
        }

        //6. Navigation (login particular functionality)

        driver.findElement(By.className("ico-login")).click();

        driver.navigate().back();

        // To make push page.
        Thread.sleep(8000);// 8 seconds

        driver.navigate().forward();

        //7. Maximize and minimise and refresh windows.

        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.navigate().refresh();


        //8. Get URL or current URL

        String URL=driver.getCurrentUrl();
        System.out.println("Current URL:" + URL);

        //9. Close the windows.

        driver.quit(); // to close entire/all windows.
     //   driver.close(); // To close particular windows or tab use.





        }

    }

