package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClosingSpecificWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();

        Set<String> windowId = driver.getWindowHandles();

        for(String winId :windowId){
            String title = driver.switchTo().window(winId).getTitle();
            System.out.println(title);


            if(title.equals("New Window")){
                driver.close();
            }
        }




    }
}
