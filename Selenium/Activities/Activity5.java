package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {

     public static void main(String[] args) {

            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();

            Actions builder = new Actions(driver);

            //Get the title of the page and print
            driver.get("https://www.v1.training-support.net/selenium/input-events");
            System.out.println("Title of Home page: " + driver.getTitle());

            // Perform left click and print front side text
            builder.click().pause(1000).build().perform();
            String frontText = driver.findElement(By.className("active")).getText();
            System.out.println(frontText);

            // Perform left click and print front side text
            builder.doubleClick().pause(1000).build().perform();
            frontText = driver.findElement(By.className("active")).getText();
            System.out.println(frontText);

            // Perform left click and print front side text
            builder.contextClick().pause(1000).build().perform();
            frontText = driver.findElement(By.className("active")).getText();
            System.out.println(frontText);

            driver.close();
        }
}
