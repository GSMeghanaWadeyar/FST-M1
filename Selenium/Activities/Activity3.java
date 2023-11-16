package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //Get the title of the page and print
        driver.get("https://www.v1.training-support.net/selenium/login-form");
        System.out.println("Title of Home page: " + driver.getTitle());

        // Find the username, password fields by xpath and enter the username, password
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        // Find and click login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        // Print login message
        String messageToUser = driver.findElement(By.xpath("//input[@id='action-confirmation']")).getText();
        System.out.println("Login message: " + messageToUser);

        driver.close();
    }
}
