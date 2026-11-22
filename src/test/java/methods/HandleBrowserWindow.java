package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();

        Set<String> windowId = driver.getWindowHandles();

        List<String> windowList = new ArrayList(windowId);

        String parentId = windowList.get(0);
        String childId = windowList.get(1);

        System.out.println(driver.getTitle());


        //Switching to child window
        driver.switchTo().window(childId);

        System.out.println(driver.getTitle());
    }
}
