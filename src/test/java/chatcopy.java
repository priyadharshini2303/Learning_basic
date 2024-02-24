import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class chatcopy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the jQuery UI "Droppable" demo
        driver.get("https://jqueryui.com/droppable/");

        // Switch to the iframe containing the droppable element
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        // Locate the source and target elements
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));

        // Perform the drag-and-drop action
        Actions action = new Actions(driver);
        action.dragAndDrop(sourceElement, targetElement).perform();

        // Switch back to the default content
        driver.switchTo().defaultContent();

        // Close the browser when done
        driver.quit();
    }
}

