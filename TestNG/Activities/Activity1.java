package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {
         WebDriver driver;

        @BeforeMethod
        public void beforeMethod() {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://v1.training-support.net");
        }

        @Test
        public void exampleTestCase() {

            String title = driver.getTitle();
            System.out.println("Page title is: " + title);

            Assert.assertEquals("Training Support", title);
            driver.findElement(By.id("about-link")).click();

            System.out.println("New page title is: " + driver.getTitle());
            Assert.assertEquals(driver.getTitle(), "About Training Support");
        }

        @AfterMethod
        public void afterMethod() {
            driver.quit();
        }
}
