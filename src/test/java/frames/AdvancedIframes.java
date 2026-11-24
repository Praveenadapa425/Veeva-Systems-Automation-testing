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

        WebElement sadbox =driver.findElement(By.xpath("//iframe[@src='/iframes_advanced/frame?name=sandboxed']"));
        driver.switchTo().frame(sadbox);
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//button[@id='send-message']")).click();
        driver.switchTo().defaultContent();

        //System.out.println(driver.findElement(By.xpath("//p[@id='message-log']")).getText());
        System.out.println(driver.findElement(By.id("message-log")).getText());

//        driver.quit();
    }
}
