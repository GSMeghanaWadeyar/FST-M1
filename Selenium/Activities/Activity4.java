package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

            public static void main(String[] args) {

            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();

            //Get the title of the page and print
            driver.get("https://www.v1.training-support.net/selenium/target-practice");
            System.out.println("Title of Home page: " + driver.getTitle());

            // Find the 3rd & 5th header and print its text
            String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
            System.out.println(thirdHeaderText);

            String fifthHeaderColor = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
            System.out.println(fifthHeaderColor);

            // Find the violet button and print its classes
            String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
            System.out.println(violetButtonClass);

            // Find the grey button and print its text
            String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
            System.out.println(greyButtonText);

            driver.close();
        }
}
