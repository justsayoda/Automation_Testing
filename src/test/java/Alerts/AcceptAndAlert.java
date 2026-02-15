package Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AcceptAndAlert {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/alert.html");

        driver.findElement(By.className("alert")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
        driver.findElement(By.className("prompt")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();

    }
}
