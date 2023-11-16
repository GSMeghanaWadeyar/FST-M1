package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {

       public static void main(String[] args) {

              WebDriverManager.firefoxdriver().setup();
              WebDriver driver = new FirefoxDriver();

              Actions builder = new Actions(driver);

              //Get the title of page and print
              driver.get("https://www.v1.training-support.net/selenium/drag-drop");
              System.out.println("Title of Home page: " + driver.getTitle());

              // Find the elements football, dropzone1 and dropzone2
              WebElement football = driver.findElement(By.id("draggable"));
              WebElement dropzone1 = driver.findElement(By.id("droppable"));
              WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

              // Perform drag and drop to dropzone 1
              builder.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();

              // Perform drag and drop to dropzone 2
              builder.dragAndDrop(football, dropzone2).build().perform();

              driver.close();
       }
}
