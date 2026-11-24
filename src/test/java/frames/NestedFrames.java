package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();

        //top frame frame-top
        WebElement top = driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(top);


        //frame inside a frame
        WebElement topLeft = driver.findElement(By.xpath("//frame[@name='frame-left']"));
        driver.switchTo().frame(topLeft);

        //Acessing main_page -> top Frame -> left Frame
        System.out.println(driver.findElement(By.xpath("//body")).getText());

        //switch to manin page  not to top frame
        driver.switchTo().defaultContent();


        //bottom frame
        WebElement bottom = driver.findElement(By.xpath("//frame[@src='/frame_bottom']"));
        driver.switchTo().frame(bottom);

        System.out.println(driver.findElement(By.xpath("//body")).getText());

        //back to main page
        driver.switchTo().defaultContent();

        driver.quit();

    }
}
