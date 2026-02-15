package Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/wait.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("primary"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));

        driver.findElement(By.className("secondary")).click();
        //driver.findElement(By.className("primary")).click();
        //driver.findElement(By.className("secondary")).click();
    }
}
