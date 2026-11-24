package checkboxes_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //Specific checkbox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //All checkboxes
       /* List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        for(WebElement checkBox : checkBoxes){
            checkBox.click();
        }*/

        //few checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        for(int i=0;i<3 ; i++){
            checkBoxes.get(i).click();

        }
        Thread.sleep(3000);

        driver.quit();


    }
}
