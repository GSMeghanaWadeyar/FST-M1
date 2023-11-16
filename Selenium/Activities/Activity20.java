package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity20 {

       public static void main(String[] args) {

              WebDriverManager.firefoxdriver().setup();

              WebDriver driver = new FirefoxDriver();
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

              driver.get("https://www.v1.training-support.net/selenium/javascript-alerts");
              System.out.println("Title of Home page: " + driver.getTitle());

              // Find and click the button to open alert
              driver.findElement(By.id("prompt")).click();

              // Switch focus to alert and print text in the alert
              Alert promtAlert = driver.switchTo().alert();
              String alertText = promtAlert.getText();
              System.out.println("Text in alert: " + alertText);

              // Type into alert and close it
              promtAlert.sendKeys("Awesome!");
              promtAlert.accept();

              driver.quit();
       }
}
