package Seleninum_Session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Selectors {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");


        /* CSS Selector Path.
        Syntax: htmltag[property="value"]
        i.e button[class^="button-2 vote-poll-button"]

        text method in CSS
        Syntax:tagname[property^="partial value"] ^ means text will start with
        i.e input[id^="Pass"]

        Syntax: tagname[property$="Partial value"] $ means text will end with
        i.e input[id$="ord"]



         */

    }
}
