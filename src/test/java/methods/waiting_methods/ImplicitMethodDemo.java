package methods.waiting_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitMethodDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        driver.quit();

    }
}
