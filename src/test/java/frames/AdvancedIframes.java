package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class AdvancedIframes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframes_advanced");
        driver.manage().window().maximize();

        //1.Sandboxed iframe (acts like cross-origin)
        WebElement sadbox =driver.findElement(By.xpath("//iframe[@src='/iframes_advanced/frame?name=sandboxed']"));
        driver.switchTo().frame(sadbox);

        //click the button
        driver.findElement(By.xpath("//button[@id='send-message']")).click();
        driver.switchTo().defaultContent();

        //verify the logs
        //System.out.println(driver.findElement(By.xpath("//p[@id='message-log']")).getText());
        System.out.println(driver.findElement(By.id("message-log")).getText());



        //2.srcdoc iframe
        //switching iframe
        WebElement srcdoc  = driver.findElement(By.id("srcdoc-frame"));
        driver.switchTo().frame(srcdoc);

        //Providing input inside iframe
        WebElement input=driver.findElement(By.xpath("//input[@id='srcdoc-input']"));
        input.sendKeys("Selinium");
        System.out.println(input.getAttribute("value"));

        driver.switchTo().defaultContent();

        driver.quit();
    }
}
