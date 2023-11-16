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

public class Activity17 {

       public static void main(String[] args) {

              WebDriverManager.firefoxdriver().setup();

              WebDriver driver = new FirefoxDriver();
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

              driver.get("https://www.v1.training-support.net/selenium/selects");
              System.out.println("Title of Home page: " + driver.getTitle());

              // Find dropdown and pass it to select object
              WebElement dropdown = driver.findElement(By.id("single-select"));
              Select singleSelect = new Select(dropdown);

              // Select second option using visible text and print it
              singleSelect.selectByVisibleText("Option 2");
              System.out.println("Second option is: " + singleSelect.getFirstSelectedOption().getText());

              // Select the third option using index and print it
              singleSelect.selectByIndex(3);
              System.out.println("Third option is: " + singleSelect.getFirstSelectedOption().getText());

              // Select the fourth option using value attribute and print it
              singleSelect.selectByValue("4");
              System.out.println("Fourth option is: " + singleSelect.getFirstSelectedOption().getText());

              // Print all options in the dropdown
              List<WebElement> allOptions = singleSelect.getOptions();
              System.out.println("Options in the dropdown are: ");
              for(WebElement option : allOptions) {
                     System.out.println(option.getText());
              }

              driver.quit();
       }
}
