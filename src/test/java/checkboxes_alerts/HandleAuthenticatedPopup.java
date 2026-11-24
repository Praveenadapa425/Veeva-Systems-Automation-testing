package checkboxes_alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        //for we use direct url appraoch
        //https:username:password@url
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


        driver.quit();
    }
}
