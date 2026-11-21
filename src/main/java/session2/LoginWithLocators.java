package session2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Login']")).click();
        Thread.sleep(4000);
        JavascriptExecutor raju=(JavascriptExecutor) driver;  //object
        raju.executeScript("window.scrollBy(0,200)"); //action
        Thread.sleep(3000);
        driver.findElement(By.name("roll_no")).sendKeys("23MH1A4901");
        driver.findElement(By.name("password")).sendKeys("12345y");
        driver.findElement(By.xpath("//*[@id='main-wrapper']/section/div/div/div/div/div/form/div[3]/button")).click();
        Thread.sleep(10000);
        driver.quit();


    }
}
