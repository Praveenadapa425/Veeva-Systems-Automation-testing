package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        //tag id        tag#id
        driver.findElement(By.cssSelector("input#userName")).sendKeys("Praveen");
        //driver.findElement(By.cssSelector("#userName")).sendKeys("Praveen");

        //tag class     tag.className
        //driver.findElement(By.cssSelector("input.mr-sm-2")).sendKeys("demo@gamil.com");
        //driver.findElement(By.cssSelector(".mr-sm-2")).sendKeys("demo@gamil.com");

        //tag attribute     tag[attribute="value"]
        //driver.findElement(By.cssSelector("textarea[placeholder=\"Current Address\"")).sendKeys("veeva");
        driver.findElement(By.cssSelector("[placeholder='Current Address'")).sendKeys("veeva");

        //tag class attribute       tag.class[attribute="value"]
        //driver.findElement(By.cssSelector("textarea.form-control[id=\"permanentAddress\"")).sendKeys("veeva");
        driver.findElement(By.cssSelector(".form-control[id=\"permanentAddress\"")).sendKeys("veeva");

        Thread.sleep(10000);
        driver.quit();


    }
}
