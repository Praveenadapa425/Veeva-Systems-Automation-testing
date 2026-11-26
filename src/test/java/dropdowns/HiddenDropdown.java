package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HiddenDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //login
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //opening required page
        driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();

        //Clicking dropdown
        driver.findElement(By.xpath("//div[contains(@class,'oxd-select-text-input')]")).click();

        //Here we can't find element
        //we need go to console -> eventListener -> bulr then remove there option
        driver.findElement(By.xpath(
                "//div[@role='option']//span[normalize-space()='Admin']"
        )).click();


        Thread.sleep(5000);
        driver.quit();
    }
}
