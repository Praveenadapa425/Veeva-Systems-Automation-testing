package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigationMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       // driver.get("https://maya.adityauniversity.in/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //navigate().to
        driver.navigate().to("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();
        Thread.sleep(2000);

        //back
        driver.navigate().back();
        Thread.sleep(2000);

        //forward
        driver.navigate().forward();
        Thread.sleep(2000);

        //refresh
        driver.navigate().refresh();

        driver.close();

    }
}
