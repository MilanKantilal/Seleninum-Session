package Seleninum_Session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        // To Register users.
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();


        driver.findElement(By.id("FirstName")).sendKeys("Milan");
        driver.findElement(By.id("LastName")).sendKeys("Kantilal");

        driver.findElement(By.name("DateOfBirthDay")).sendKeys("12");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");

        driver.findElement(By.id("Email")).sendKeys("milan123@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Software Testing");

        //driver.findElement(By.name("Newsletter")).click();

        driver.findElement(By.id("Password")).sendKeys("milan123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("milan123");

        driver.findElement(By.id("register-button")).click();


        Thread.sleep(20000);// 20 seconds.
        driver.quit();

        //MSedgde
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://demo.nopcommerce.com/");

        driver1.findElement(By.className("ico-register")).click();
        driver1.findElement(By.id("gender-male")).click();


        driver1.findElement(By.id("FirstName")).sendKeys("Milan");
        driver1.findElement(By.id("LastName")).sendKeys("Kantilal");

        driver1.findElement(By.name("DateOfBirthDay")).sendKeys("12");
        driver1.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
        driver1.findElement(By.name("DateOfBirthYear")).sendKeys("1990");

        driver1.findElement(By.id("Email")).sendKeys("milan123@gmail.com");
        driver1.findElement(By.id("Company")).sendKeys("Software Testing");

        driver1.findElement(By.id("Password")).sendKeys("milan123");
        driver1.findElement(By.id("ConfirmPassword")).sendKeys("milan123");

        driver1.findElement(By.id("register-button")).click();


        Thread.sleep(20000);// 20 seconds.
        driver1.quit();


        //Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://demo.nopcommerce.com/");

        driver2.findElement(By.className("ico-register")).click();
        driver2.findElement(By.id("gender-male")).click();


        driver2.findElement(By.id("FirstName")).sendKeys("Milan");
        driver2.findElement(By.id("LastName")).sendKeys("Kantilal");

        driver2.findElement(By.name("DateOfBirthDay")).sendKeys("12");
        driver2.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
        driver2.findElement(By.name("DateOfBirthYear")).sendKeys("1990");

        driver2.findElement(By.id("Email")).sendKeys("milan123@gmail.com");
        driver2.findElement(By.id("Company")).sendKeys("Software Testing");

        driver2.findElement(By.id("Password")).sendKeys("milan123");
        driver2.findElement(By.id("ConfirmPassword")).sendKeys("milan123");

        driver2.findElement(By.id("register-button")).click();


        Thread.sleep(20000);// 20 seconds.
        driver2.quit();










    }
}