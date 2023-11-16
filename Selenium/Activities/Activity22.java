package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity22 {

       public static void main(String[] args) {

              WebDriverManager.firefoxdriver().setup();

              WebDriver driver = new FirefoxDriver();
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
              Actions builder = new Actions(driver);

              driver.get("https://www.v1.training-support.net/selenium/popups");
              System.out.println("Title of Home page: " + driver.getTitle());

              // Find sign-in button and hover over it
              WebElement button = driver.findElement(By.className("orange"));
              builder.moveToElement(button).build().perform();

              // Print tooltip message
              String tooltipMessage = button.getAttribute("data-tooltip");
              System.out.println(tooltipMessage);

              // Click the button and wait for modal to appear
              button.click();
              wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

              // Find input fields and input credentials
              WebElement username = driver.findElement(By.id("username"));
              WebElement password = driver.findElement(By.id("password"));

              username.sendKeys("admin");
              password.sendKeys("password");

              // Click to login
              driver.findElement(By.xpath("//button[text()='Log in']")).click();

              // Print login message to user
              String message = driver.findElement(By.id("action-confirmation")).getText();
              System.out.println("Login message to user is: " + message);

              driver.quit();
       }
}
