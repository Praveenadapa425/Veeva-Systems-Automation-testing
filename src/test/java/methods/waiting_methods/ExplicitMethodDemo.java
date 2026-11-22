package methods.waiting_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitMethodDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10)); //declaration

        WebElement newWindow = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Click Here']")));
       newWindow.click();

       driver.quit();

    }
}
