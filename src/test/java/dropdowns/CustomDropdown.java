package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CustomDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/custom_dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Thread.sleep(3000);
        //Custom Dropdown   it is made of divs
        //clicking dropdown
        driver.findElement(By.xpath("//div[@id='fruit-combo']")).click();


    }
}
