package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //abs xpath
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Praveen");

        //relative xpath
        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Praveen");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ABC123d");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        Thread.sleep(3000);


        driver.quit();


    }
}
