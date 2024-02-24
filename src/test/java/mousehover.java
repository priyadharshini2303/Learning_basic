import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class mousehover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
        WebElement demo = driver.findElement(By.xpath("//a[text()='Demos']"));

        //JavascriptExecutor js = (JavascriptExecutor) driver;

        //js.executeScript("arguments[0].scrollIntoView();", dpdn);
        //pdn.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(demo).build().perform();
        WebElement cloth = driver.findElement(By.xpath("//a[text()='Download']"));
        actions.moveToElement(cloth).build().perform();



    }

}
