package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
        public static void main(String[] args) {

            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();

            // Open the page and print the title
            driver.get("https://www.v1.training-support.net/selenium/login-form");
            System.out.println("Title of Home page: " + driver.getTitle());

            // Find the username, password fields and enter the username, password
            driver.findElement(By.id("username")).sendKeys("admin");
            driver.findElement(By.id("password")).sendKeys("password");

            // Find and click login button
            driver.findElement(By.xpath("//button[text()='Log in']")).click();

            // Print login message
            String messageToUser = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("Login message: " + messageToUser);

            driver.close();
        }
    }

