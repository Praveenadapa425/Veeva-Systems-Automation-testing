package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //UniqueLocators
        //name
        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        //id
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        //links are two types
        //linkText
        //Here we need use complete link text
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        //partialLinkText
        //Actual link text is "Sauce Labs Bike Light" and we can partial link text
        driver.findElement(By.partialLinkText("Bike Light")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
