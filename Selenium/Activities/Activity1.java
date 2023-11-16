package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //Get the title of the page and print
        driver.get("https://v1.training-support.net");
        System.out.println("Title of Home page: " + driver.getTitle());

        // Click on 'About Us' button using its id and print title of new page
        driver.findElement(By.id("about-link")).click();
        System.out.println("Title of About page: " + driver.getTitle());

        driver.close();
    }
}