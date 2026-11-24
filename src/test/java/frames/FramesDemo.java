package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();

        //switching to iframe
        driver.switchTo().frame(0); //using the index
        System.out.println( driver.findElement(By.xpath("//body")).getText());

        //to back main page
        driver.switchTo().defaultContent();

        // Switch to iframe
        driver.switchTo().frame("mce_0_ifr");  //using the name

        // Locate editor
        WebElement editor = driver.findElement(By.id("tinymce"));

        // Click to focus
        editor.click();

        // Clear existing text
        editor.clear();

        // Enter text
        editor.sendKeys("Praveen");

        // Return to main page
        driver.switchTo().defaultContent();
    }
}
