package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {

       public static void main(String[] args) {

              WebDriverManager.firefoxdriver().setup();
              WebDriver driver = new FirefoxDriver();

              Actions builder = new Actions(driver);

              //Get the title of the page and print
              driver.get("https://www.v1.training-support.net/selenium/input-events");
              System.out.println("Title of Home page: " + driver.getTitle());

              // Press the key
              builder.sendKeys("S").build().perform();

              // Press CTRL+A and CTRL+C
              builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

              driver.close();
       }
}
