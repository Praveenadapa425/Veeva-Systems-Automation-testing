package Session2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.get("https://maya.adityauniversity.in/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='main-wrapper']/header/div[2]/div/div/div[3]/ul/li[1]/a")).click();

    }
}


//*[@id="main-wrapper"]/header/div[2]/div/div/div[3]/ul/li[1]/a