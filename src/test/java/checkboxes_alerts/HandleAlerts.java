package checkboxes_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //normal alert
        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept(); */

        //confirm alert
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        Alert myalert = driver.switchTo().alert();
//        //myalert.accept();  //to click ok button
//        myalert.dismiss();   //to click cancel button
//
//        Thread.sleep(2000);

        //prompt alert


    }
}
