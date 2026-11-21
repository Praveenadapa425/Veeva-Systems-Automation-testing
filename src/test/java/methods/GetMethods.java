package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //get()
        driver.get("https://maya.adityauniversity.in/");

        //getTitle()
        System.out.println(driver.getTitle());

        //getCurrentUrl()
        System.out.println("Present url: "+driver.getCurrentUrl());

        //getPageSource
        //System.out.println(driver.getPageSource());

        //getWindowHandle
        System.out.println(driver.getWindowHandle());  //return current window handle
        //60DEFE8285E881C6A9C7CD25E24EE4D5


        driver.findElement(By.xpath("//a[normalize-space()='Owl Code']")).click();

        //getWindowHandles
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);








    }
}
