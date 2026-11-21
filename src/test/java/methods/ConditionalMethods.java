package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/selenium/web/inputs.html");
        Thread.sleep(2000);

        //isDisplayed
        boolean status = driver.findElement(By.xpath("//h1[.='Testing Inputs']")).isDisplayed();
        System.out.println(status);


        //isEnabled
        System.out.println("Email input enabled: "+driver.findElement(By.name("email_input")).isEnabled());

        //isSelected
        System.out.println( driver.findElement(By.name("checkbox_input")).isSelected());
        // initial  it already selected     true

        driver.findElement(By.name("checkbox_input")).click();

        System.out.println(driver.findElement(By.name("checkbox_input")).isSelected());

        driver.quit();
    }
}
