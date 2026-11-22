package methods.waiting_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        Thread.sleep(2000);  //It is provided by the java
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
    }
}
