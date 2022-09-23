package Seleninum_Session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Concept {
    public static void main (String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

//        // To Register users.
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Milan");
        driver.findElement(By.id("LastName")).sendKeys("Kantilal");

      driver.findElement(By.name("DateOfBirthDay")).sendKeys("12");
      driver.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
      driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");

//        // To login users.
//        driver.findElement(By.className("ico-login")).click();
//        driver.findElement(By.id("Email")).sendKeys("milan1@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("Milan@123");
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
//
//        //To make push the page
//        Thread.sleep(10000);// 10 Seconds.
//
//        // To log out the user
//
//        driver.findElement(By.className("ico-logout")).click();
//        driver.quit();
//












    }
}
