import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class locatorbasic {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name = 'uid']")).sendKeys(
                "mngr532203");
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(
                "vyzYbEh");
        driver.findElement(By.xpath("//input[@type='submit']")).click();



    }

}
