package Seleninum_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_WebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");
        WebDriver driver =new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");

        String Title =driver.getTitle();
        System.out.println("Page Title:" + Title);

        if (Title.equals("YouTube")){
            System.out.println("Page title is correct");

        }else{
            System.out.println("Page title is incorrect");
        }


        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("milan123@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("Milan1@23");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

       //driver.findElement(By.linkText("Log in")).click();










    }
}
