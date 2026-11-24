package checkboxes_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertWithExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        //gernral way using switchTo()
        //Alert myalert = driver.switchTo().alert();

        //using Explict wait
        Alert myalert = wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(2000);

        //to get text in alert
        System.out.println(myalert.getText());

        //to accept the alert
        myalert.accept();
        Thread.sleep(2000);

        driver.quit();

    }
}
