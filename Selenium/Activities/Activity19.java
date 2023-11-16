package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity19 {

       public static void main(String[] args) {

              WebDriverManager.firefoxdriver().setup();

              WebDriver driver = new FirefoxDriver();
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

              driver.get("https://www.v1.training-support.net/selenium/javascript-alerts");
              System.out.println("Home page title: " + driver.getTitle());

              // Find and click button to open the alert
              driver.findElement(By.id("confirm")).click();

              // Switch focus to alert and Print text in the alert
              Alert confirmAlert = driver.switchTo().alert();
              String alertText = confirmAlert.getText();
              System.out.println("Text in alert: " + alertText);

              // Close the alert by clicking OK
              confirmAlert.accept();

              driver.quit();
       }
}
