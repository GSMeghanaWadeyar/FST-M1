package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Activity18 {

       public static void main(String[] args) {

              WebDriverManager.firefoxdriver().setup();

              WebDriver driver = new FirefoxDriver();
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

              driver.get("https://www.v1.training-support.net/selenium/selects");
              System.out.println("Title of Home page: " + driver.getTitle());

              // Find the dropdown and pass it select object
              WebElement selectElement = driver.findElement(By.id("multi-select"));
              Select multiSelect = new Select(selectElement);

              // Select "Javascript" using visible text and select 4 to 6 options
              multiSelect.selectByVisibleText("Javascript");
              for(int i = 4; i<=6 ; i++) {
                     multiSelect.selectByIndex(i);
              }

              // Select "NodeJS" using value attribute
              multiSelect.selectByValue("node");

              List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
              System.out.println("Selected options are: ");
              for(WebElement option : selectedOptions) {
                     System.out.println(option.getText());
              }

              // Deselect 5th index option and print selected options
              multiSelect.deselectByIndex(5);
              selectedOptions = multiSelect.getAllSelectedOptions();
              System.out.println("Selected options are: ");
              for(WebElement option : selectedOptions) {
                     System.out.println(option.getText());
              }

              driver.quit();
       }
}
