package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassNameAndTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //login
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //className
        //here we need use the "findElements"
        List<WebElement> inventoryItems = driver.findElements(By.className("inventory_item"));
        System.out.println(inventoryItems.size());  //no of items present in it

        //tagName
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total No.of links present: "+links.size());

        driver.quit();
    }
}
