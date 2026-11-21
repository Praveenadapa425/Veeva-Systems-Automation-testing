package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        Thread.sleep(3000);

        //close()  close current page
        //driver.close();
        //Thread.sleep(3000);

        //quit() all pages closed
        driver.quit();
    }
}
