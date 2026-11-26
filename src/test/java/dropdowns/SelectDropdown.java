package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //capture dropdown as webelemet
        WebElement dropdownEl = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(dropdownEl);

        //Selecting by visble text
        //dropdown.selectByVisibleText("Option 1");

        //Selecting by index.Index start by 0
        //dropdown.selectByIndex(2);

        //Selcting by value
        dropdown.selectByValue("1");


       Thread.sleep(5000);
       driver.quit();

    }
}
